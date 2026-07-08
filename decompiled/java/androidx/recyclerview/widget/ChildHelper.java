package androidx.recyclerview.widget;

import X.C21674819sA;
import X.C2188811AlT;
import X.InterfaceC21677119sX;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class ChildHelper {
    public final InterfaceC21677119sX mCallback;
    public int mRemoveStatus;
    public View mViewInRemoveView;
    public final Bucket mBucket = new Bucket();
    public final List<View> mHiddenViews = new ArrayList();

    public static class Bucket {
        public long mData;
        public Bucket mNext;

        private void ensureNext() {
            if (this.mNext == null) {
                this.mNext = new Bucket();
            }
        }

        public void reset() {
            this.mData = 0L;
            Bucket bucket = this.mNext;
            if (bucket != null) {
                bucket.reset();
            }
        }

        public String toString() {
            if (this.mNext == null) {
                return Long.toBinaryString(this.mData);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mNext.toString());
            sbLIZ.append("xx");
            sbLIZ.append(Long.toBinaryString(this.mData));
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public void clear(int i) {
            if (i >= 64) {
                Bucket bucket = this.mNext;
                if (bucket != null) {
                    bucket.clear(i - 64);
                    return;
                }
                return;
            }
            this.mData &= ~(1 << i);
        }

        public int countOnesBefore(int i) {
            Bucket bucket = this.mNext;
            if (bucket == null) {
                if (i >= 64) {
                    return Long.bitCount(this.mData);
                }
                return Long.bitCount(this.mData & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.mData & ((1 << i) - 1));
            }
            return bucket.countOnesBefore(i - 64) + Long.bitCount(this.mData);
        }

        public boolean get(int i) {
            if (i >= 64) {
                ensureNext();
                return this.mNext.get(i - 64);
            }
            if ((this.mData & (1 << i)) != 0) {
                return true;
            }
            return false;
        }

        public boolean remove(int i) {
            boolean z;
            if (i >= 64) {
                ensureNext();
                return this.mNext.remove(i - 64);
            }
            long j = 1 << i;
            long j2 = this.mData;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.mData = j3;
            long j4 = j - 1;
            this.mData = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            Bucket bucket = this.mNext;
            if (bucket != null) {
                if (bucket.get(0)) {
                    set(63);
                }
                this.mNext.remove(0);
            }
            return z;
        }

        public void set(int i) {
            if (i >= 64) {
                ensureNext();
                this.mNext.set(i - 64);
            } else {
                this.mData |= 1 << i;
            }
        }

        public void insert(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                ensureNext();
                this.mNext.insert(i - 64, z);
                return;
            }
            long j = this.mData;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.mData = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                set(i);
            } else {
                clear(i);
            }
            if (!z2 && this.mNext == null) {
                return;
            }
            ensureNext();
            this.mNext.insert(0, z2);
        }
    }

    public int getChildCount() {
        return ((C21674819sA) this.mCallback).LIZ() - this.mHiddenViews.size();
    }

    public int getUnfilteredChildCount() {
        return ((C21674819sA) this.mCallback).LIZ();
    }

    public void removeAllViewsUnfiltered() {
        this.mBucket.reset();
        int size = this.mHiddenViews.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            InterfaceC21677119sX interfaceC21677119sX = this.mCallback;
            View view = (View) ListProtector.get(this.mHiddenViews, size);
            C21674819sA c21674819sA = (C21674819sA) interfaceC21677119sX;
            c21674819sA.getClass();
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(c21674819sA.LIZ);
            }
            ListProtector.remove(this.mHiddenViews, size);
        }
        C21674819sA c21674819sA2 = (C21674819sA) this.mCallback;
        int iLIZ = c21674819sA2.LIZ();
        for (int i = 0; i < iLIZ; i++) {
            View childAt = c21674819sA2.LIZ.getChildAt(i);
            c21674819sA2.LIZ.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        RecyclerView recyclerView = c21674819sA2.LIZ;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(recyclerView, null);
        recyclerView.removeAllViews();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mBucket.toString());
        sbLIZ.append(", hidden list:");
        sbLIZ.append(this.mHiddenViews.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChildHelper(InterfaceC21677119sX interfaceC21677119sX) {
        this.mCallback = interfaceC21677119sX;
    }

    private int getOffset(int i) {
        if (i < 0) {
            return -1;
        }
        int iLIZ = ((C21674819sA) this.mCallback).LIZ();
        int i2 = i;
        while (i2 < iLIZ) {
            int iCountOnesBefore = i - (i2 - this.mBucket.countOnesBefore(i2));
            if (iCountOnesBefore != 0) {
                i2 += iCountOnesBefore;
            } else {
                while (this.mBucket.get(i2)) {
                    i2++;
                }
                return i2;
            }
        }
        return -1;
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        C21674819sA c21674819sA = (C21674819sA) this.mCallback;
        c21674819sA.getClass();
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(c21674819sA.LIZ);
        }
    }

    private boolean unhideViewInternal(View view) {
        if (this.mHiddenViews.remove(view)) {
            C21674819sA c21674819sA = (C21674819sA) this.mCallback;
            c21674819sA.getClass();
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(c21674819sA.LIZ);
                return true;
            }
            return true;
        }
        return false;
    }

    public void detachViewFromParent(int i) {
        int offset = getOffset(i);
        this.mBucket.remove(offset);
        C21674819sA c21674819sA = (C21674819sA) this.mCallback;
        View childAt = c21674819sA.LIZ.getChildAt(offset);
        if (childAt != null) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("called detach on an already detached child ");
                    sbLIZ.append(childViewHolderInt);
                    sbLIZ.append(c21674819sA.LIZ.exceptionLabel());
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                childViewHolderInt.addFlags(256);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No view at offset ");
            sbLIZ2.append(offset);
            sbLIZ2.append(c21674819sA.LIZ.exceptionLabel());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        c21674819sA.LIZ.detachViewFromParent(offset);
    }

    public View findHiddenNonRemovedView(int i) {
        int size = this.mHiddenViews.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) ListProtector.get(this.mHiddenViews, i2);
            this.mCallback.getClass();
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    public View getChildAt(int i) {
        return ((C21674819sA) this.mCallback).LIZ.getChildAt(getOffset(i));
    }

    public View getUnfilteredChildAt(int i) {
        return ((C21674819sA) this.mCallback).LIZ.getChildAt(i);
    }

    public void hide(View view) {
        int iIndexOfChild = ((C21674819sA) this.mCallback).LIZ.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.mBucket.set(iIndexOfChild);
            hideViewInternal(view);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("view is not a child, cannot hide ");
            sbLIZ.append(view);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public int indexOfChild(View view) {
        int iIndexOfChild = ((C21674819sA) this.mCallback).LIZ.indexOfChild(view);
        if (iIndexOfChild == -1 || this.mBucket.get(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.mBucket.countOnesBefore(iIndexOfChild);
    }

    public boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    public void removeView(View view) {
        int i = this.mRemoveStatus;
        if (i != 1) {
            if (i != 2) {
                try {
                    this.mRemoveStatus = 1;
                    this.mViewInRemoveView = view;
                    int iIndexOfChild = ((C21674819sA) this.mCallback).LIZ.indexOfChild(view);
                    if (iIndexOfChild >= 0) {
                        if (this.mBucket.remove(iIndexOfChild)) {
                            unhideViewInternal(view);
                        }
                        ((C21674819sA) this.mCallback).LIZIZ(iIndexOfChild);
                    }
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public void removeViewAt(int i) {
        int i2 = this.mRemoveStatus;
        if (i2 != 1) {
            if (i2 != 2) {
                try {
                    int offset = getOffset(i);
                    View childAt = ((C21674819sA) this.mCallback).LIZ.getChildAt(offset);
                    if (childAt != null) {
                        this.mRemoveStatus = 1;
                        this.mViewInRemoveView = childAt;
                        if (this.mBucket.remove(offset)) {
                            unhideViewInternal(childAt);
                        }
                        ((C21674819sA) this.mCallback).LIZIZ(offset);
                    }
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.mRemoveStatus = 0;
                    this.mViewInRemoveView = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public boolean removeViewIfHidden(View view) {
        int i = this.mRemoveStatus;
        if (i == 1) {
            if (this.mViewInRemoveView == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i != 2) {
            try {
                this.mRemoveStatus = 2;
                int iIndexOfChild = ((C21674819sA) this.mCallback).LIZ.indexOfChild(view);
                if (iIndexOfChild == -1) {
                    unhideViewInternal(view);
                    this.mRemoveStatus = 0;
                    return true;
                }
                if (this.mBucket.get(iIndexOfChild)) {
                    this.mBucket.remove(iIndexOfChild);
                    unhideViewInternal(view);
                    ((C21674819sA) this.mCallback).LIZIZ(iIndexOfChild);
                    this.mRemoveStatus = 0;
                    return true;
                }
                this.mRemoveStatus = 0;
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.mRemoveStatus = 0;
                throw th;
            }
        }
        throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
    }

    public void unhide(View view) {
        int iIndexOfChild = ((C21674819sA) this.mCallback).LIZ.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (this.mBucket.get(iIndexOfChild)) {
                this.mBucket.clear(iIndexOfChild);
                unhideViewInternal(view);
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trying to unhide a view that was not hidden");
                sbLIZ.append(view);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("view is not a child, cannot hide ");
        sbLIZ2.append(view);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public void addView(View view, boolean z) {
        addView(view, -1, z);
    }

    public void addView(View view, int i, boolean z) {
        int offset;
        if (i < 0) {
            offset = ((C21674819sA) this.mCallback).LIZ();
        } else {
            offset = getOffset(i);
        }
        this.mBucket.insert(offset, z);
        if (z) {
            hideViewInternal(view);
        }
        C21674819sA c21674819sA = (C21674819sA) this.mCallback;
        c21674819sA.LIZ.addView(view, offset);
        c21674819sA.LIZ.dispatchChildAttached(view);
    }

    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int offset;
        if (i < 0) {
            offset = ((C21674819sA) this.mCallback).LIZ();
        } else {
            offset = getOffset(i);
        }
        this.mBucket.insert(offset, z);
        if (z) {
            hideViewInternal(view);
        }
        C21674819sA c21674819sA = (C21674819sA) this.mCallback;
        c21674819sA.getClass();
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Called attach on a child which is not detached: ");
                sbLIZ.append(childViewHolderInt);
                sbLIZ.append(c21674819sA.LIZ.exceptionLabel());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No ViewHolder found for child: ");
            sbLIZ2.append(view);
            sbLIZ2.append(", index: ");
            sbLIZ2.append(offset);
            sbLIZ2.append(c21674819sA.LIZ.exceptionLabel());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        c21674819sA.LIZ.attachViewToParent(view, offset, layoutParams);
    }
}
