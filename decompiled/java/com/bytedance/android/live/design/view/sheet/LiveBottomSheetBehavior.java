package com.bytedance.android.live.design.view.sheet;

import X.AbstractC20485115Dt;
import X.AbstractC21586119dr;
import X.C011Z;
import X.C0KWH;
import X.C1095570ecF;
import X.C1119850fFP;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C1C7U;
import X.C20246014Ju;
import X.C20484515Dn;
import X.C20632315oP;
import X.C20731816Aq;
import X.C21586019dq;
import X.C2188811AlT;
import X.C415680GRq;
import X.C418440Gaw;
import Y.ARunnableS31S0201000_26;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomSheetBehaviorScrollFixSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public class LiveBottomSheetBehavior<V extends View> extends C16BC<V> {
    public static float LJJJJL = 0.16f;
    public static float LJJJJLI = 0.01f;
    public static float LJJJJLL = 0.16f;
    public static float LJJJJZ = 0.01f;
    public boolean LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public float LJ;
    public int LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public LiveBottomSheetBehavior<V>.c LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final float LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public C21586019dq LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public WeakReference<V> LJJIIJZLJL;
    public WeakReference<View> LJJIIZ;
    public int LJJIIZI;
    public final ArrayList<AbstractC20485115Dt> LJJIJ;
    public VelocityTracker LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public boolean LJJIJL;
    public Map<View, Integer> LJJIJLIJ;
    public int LJJIL;
    public float LJJIZ;
    public int LJJJ;
    public float LJJJI;
    public int LJJJIL;
    public View LJJJJ;
    public C415680GRq LJJJJI;
    public int LJJJJIZL;
    public C20484515Dn LJJJJJ;
    public final C20731816Aq LJJJJJL;

    public class c implements Runnable {
        public final View LL;
        public boolean LLILLJJLI;
        public int LLILLL;

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("LiveBottomSheetBehavior$SettleRunnable@b0a6.run");
            try {
                C21586019dq c21586019dq = LiveBottomSheetBehavior.this.LJIJJLI;
                if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
                    LiveBottomSheetBehavior.this.setStateInternal(this.LLILLL);
                } else {
                    this.LL.postOnAnimation(this);
                }
                this.LLILLJJLI = false;
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("LiveBottomSheetBehavior$SettleRunnable@b0a6.run");
        }

        public c(View view, int i) {
            this.LL = view;
            this.LLILLL = i;
        }
    }

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4) {
    }

    public final void LIZJ() {
        WeakReference<V> weakReference = this.LJJIIJZLJL;
        V v = weakReference == null ? null : weakReference.get();
        if (this.LJJJJ == null || v == null) {
            return;
        }
        int height = ((v.getHeight() - this.LJJJJ.getHeight()) - ((Math.min(v.getTop(), this.LJIILJJIL) - getExpandedOffset()) + this.LJII)) + this.LJJJJIZL;
        View view = this.LJJJJ;
        view.offsetTopAndBottom(height - view.getTop());
    }

    public final void LJFF() {
        WeakReference<V> weakReference = this.LJJIIJZLJL;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.LJJIIZ = new WeakReference<>(findScrollingChild(this.LJJIIJZLJL.get()));
    }

    public final void LJI() {
        View view;
        WeakReference<View> weakReference = this.LJJIIZ;
        View view2 = weakReference == null ? null : weakReference.get();
        WeakReference<V> weakReference2 = this.LJJIIJZLJL;
        V v = weakReference2 != null ? weakReference2.get() : null;
        if (this.LJJJJI != null) {
            if (view2 == null || (view = this.LJJJJ) == null || view.getVisibility() != 0 || v == null || ((v.getTop() > this.LJIILJJIL || v.getTop() <= getExpandedOffset()) && !view2.canScrollVertically(1))) {
                this.LJJJJI.setShadowed(false);
                return;
            }
            int height = (((v.getHeight() - this.LJJJJI.getHeight()) - this.LJJJJ.getHeight()) - ((Math.min(v.getTop(), this.LJIILJJIL) - getExpandedOffset()) + this.LJII)) + this.LJJJJIZL;
            C415680GRq c415680GRq = this.LJJJJI;
            c415680GRq.offsetTopAndBottom(height - c415680GRq.getTop());
            this.LJJJJI.setShadowed(true);
        }
    }

    public final int calculatePeekHeight() {
        int i = this.LIZJ;
        if (i != -1) {
            return i;
        }
        int i2 = this.LJFF;
        if (i2 == -1) {
            float f = this.LJI;
            i2 = f > 0.0f ? (int) (this.LJJIII * f) : Integer.MAX_VALUE;
        }
        float f2 = this.LJ;
        if (f2 > 0.0f) {
            i2 = (int) (this.LJJIII * f2);
        }
        return Math.min(i2, this.LJJIFFI);
    }

    public final int getExpandedOffset() {
        if (this.LIZ) {
            return this.LJIIJJI;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.16Aq] */
    public LiveBottomSheetBehavior() {
        this.LIZ = true;
        this.LIZJ = -1;
        this.LJFF = -1;
        this.LJIILIIL = 0.5f;
        this.LJIIZILJ = true;
        this.LJIJJ = 4;
        this.LJJIIZI = -1;
        this.LJJIJ = new ArrayList<>();
        this.LJJIL = -1;
        this.LJJJ = -1;
        this.LJJJIL = 0;
        this.LJJJJJL = new AbstractC21586119dr() { // from class: X.16Aq
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                if (liveBottomSheetBehavior.LJIILL) {
                    return liveBottomSheetBehavior.LJJII;
                }
                return liveBottomSheetBehavior.LJIILJJIL;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                    if (liveBottomSheetBehavior.LJIIZILJ) {
                        liveBottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                int i2 = liveBottomSheetBehavior.LJIJJ;
                if (i2 == 1 || liveBottomSheetBehavior.LJJIJL) {
                    return false;
                }
                if ((i2 == 3 && liveBottomSheetBehavior.LJJIJIIJIL == i && (weakReference = liveBottomSheetBehavior.LJJIIZ) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJJIIJZLJL) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i, int i2) {
                int i3;
                int expandedOffset = this.LIZ.getExpandedOffset();
                LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                if (liveBottomSheetBehavior.LJIILL) {
                    i3 = liveBottomSheetBehavior.LJJII;
                } else {
                    i3 = liveBottomSheetBehavior.LJIILJJIL;
                }
                return C419990GdR.LIZIZ(i, expandedOffset, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i = 0;
                int i2 = 6;
                if (f2 >= 0.0f && !this.LIZ.LJII(view, f2)) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                    if (liveBottomSheetBehavior.LJIILL && liveBottomSheetBehavior.shouldHide(view, f2)) {
                        i = this.LIZ.LJJII;
                        i2 = 5;
                    } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                        LiveBottomSheetBehavior liveBottomSheetBehavior2 = this.LIZ;
                        if (liveBottomSheetBehavior2.LIZ) {
                            i = liveBottomSheetBehavior2.LJIILJJIL;
                        } else {
                            int top = view.getTop();
                            if (Math.abs(top - this.LIZ.LJIIL) < Math.abs(top - this.LIZ.LJIILJJIL)) {
                                i = this.LIZ.LJIIL;
                            } else {
                                i = this.LIZ.LJIILJJIL;
                            }
                        }
                        i2 = 4;
                    } else {
                        int top2 = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior3 = this.LIZ;
                        if (liveBottomSheetBehavior3.LIZ) {
                            if (Math.abs(top2 - liveBottomSheetBehavior3.LJIIJJI) < Math.abs(top2 - this.LIZ.LJIILJJIL)) {
                                i = this.LIZ.LJIIJJI;
                                i2 = 3;
                            } else {
                                i = this.LIZ.LJIILJJIL;
                                i2 = 4;
                            }
                        } else {
                            int i3 = liveBottomSheetBehavior3.LJIIL;
                            if (top2 < i3) {
                                if (top2 < Math.abs(top2 - liveBottomSheetBehavior3.LJIILJJIL)) {
                                    this.LIZ.getClass();
                                    i2 = 3;
                                } else {
                                    i = this.LIZ.LJIIL;
                                }
                            } else if (Math.abs(top2 - i3) < Math.abs(top2 - this.LIZ.LJIILJJIL)) {
                                i = this.LIZ.LJIIL;
                            } else {
                                i = this.LIZ.LJIILJJIL;
                                i2 = 4;
                            }
                        }
                    }
                } else {
                    LiveBottomSheetBehavior liveBottomSheetBehavior4 = this.LIZ;
                    if (liveBottomSheetBehavior4.LIZ) {
                        i = liveBottomSheetBehavior4.LJIIJJI;
                        i2 = 3;
                    } else {
                        int top3 = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior5 = this.LIZ;
                        int i4 = liveBottomSheetBehavior5.LJIIL;
                        if (top3 > i4) {
                            i = i4;
                        } else {
                            liveBottomSheetBehavior5.getClass();
                            i2 = 3;
                        }
                    }
                }
                this.LIZ.startSettlingAnimation(view, i2, i, true);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
            }
        };
    }

    public final void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.LIZ) {
            this.LJIILJJIL = Math.max((this.LJJII - iCalculatePeekHeight) - this.LJIJI, this.LJIIJJI);
        } else {
            this.LJIILJJIL = (this.LJJII - iCalculatePeekHeight) - this.LJIJI;
        }
    }

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJIIJZLJL = null;
        this.LJIJJLI = null;
    }

    public static <V extends View> LiveBottomSheetBehavior<V> LIZLLL(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C16G1) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (c16bc instanceof LiveBottomSheetBehavior) {
                return (LiveBottomSheetBehavior) c16bc;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void LIZ(AbstractC20485115Dt abstractC20485115Dt) {
        if (!this.LJJIJ.contains(abstractC20485115Dt)) {
            this.LJJIJ.add(abstractC20485115Dt);
        }
    }

    public final void LJ(int i) {
        LiveSheetFragment liveSheetFragment;
        C1095570ecF c1095570ecF;
        C20484515Dn c20484515Dn = this.LJJJJJ;
        if (c20484515Dn != null && (c1095570ecF = (liveSheetFragment = c20484515Dn.LIZ).LLJI) != null) {
            c1095570ecF.setTargetOffset(-(c1095570ecF.getMeasuredHeight() - i));
            liveSheetFragment.LLJI.setExtraOffset(liveSheetFragment.LLJIJIL);
        }
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float expandedOffset;
        if (this.LJJIIJZLJL.get() != null && !this.LJJIJ.isEmpty()) {
            int i2 = this.LJIILJJIL;
            if (i <= i2 && i2 != getExpandedOffset()) {
                int i3 = this.LJIILJJIL;
                f = i3 - i;
                expandedOffset = i3 - getExpandedOffset();
            } else {
                int i4 = this.LJIILJJIL;
                f = i4 - i;
                expandedOffset = this.LJJII - i4;
            }
            float f2 = f / expandedOffset;
            for (int i5 = 0; i5 < this.LJJIJ.size(); i5++) {
                ((AbstractC20485115Dt) ListProtector.get(this.LJJIJ, i5)).LIZ(f2);
            }
        }
        LIZJ();
        LJI();
        LJ(i);
    }

    public final View findScrollingChild(View view) {
        View viewFindViewById;
        if (view == null) {
            return null;
        }
        int i = this.LJJIIZI;
        if (i != -1 && (viewFindViewById = view.findViewById(i)) != null) {
            return viewFindViewById;
        }
        if (view instanceof C20632315oP) {
            C20632315oP c20632315oP = (C20632315oP) view;
            int currentItem = c20632315oP.getCurrentItem();
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) c20632315oP.getChildAt(0)).getLayoutManager();
            if (layoutManager == null) {
                return null;
            }
            return findScrollingChild(layoutManager.findViewByPosition(currentItem));
        }
        if (C14K9.LJIILL(view) && view.isShown()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i2));
                if (viewFindScrollingChild != null) {
                    return viewFindScrollingChild;
                }
            }
        }
        return null;
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        super.onAttachedToLayoutParams(c16g1);
        this.LJJIIJZLJL = null;
        this.LJIJJLI = null;
    }

    public final void setHideable(boolean z) {
        if (this.LJIILL != z) {
            this.LJIILL = z;
            if (!z && this.LJIJJ == 5) {
                setState(4);
            }
        }
    }

    public final void setPeekHeight(int i) {
        V v;
        if (i == -1) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
            } else {
                return;
            }
        } else {
            if (!this.LIZLLL && this.LIZJ == i) {
                return;
            }
            this.LIZLLL = false;
            this.LIZJ = Math.max(0, i);
        }
        if (this.LJJIIJZLJL != null) {
            calculateCollapsedOffset();
            if (this.LJIJJ == 4 && (v = this.LJJIIJZLJL.get()) != null) {
                v.requestLayout();
            }
        }
    }

    public final void setState(int i) {
        if (i == this.LJIJJ) {
            return;
        }
        WeakReference<V> weakReference = this.LJJIIJZLJL;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJIILL && i == 5)) {
                this.LJIJJ = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
                HandlerHook.viewPost(v, new ARunnableS31S0201000_26(i, v, this, 8));
            } else {
                settleToState(v, i);
            }
        }
    }

    public final void setStateInternal(int i) {
        if (this.LJIJJ == i) {
            return;
        }
        this.LJIJJ = i;
        WeakReference<V> weakReference = this.LJJIIJZLJL;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        for (int i2 = 0; i2 < this.LJJIJ.size(); i2++) {
            ((AbstractC20485115Dt) ListProtector.get(this.LJJIJ, i2)).LIZIZ(i);
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.LJJIIJZLJL;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof C16G0)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        if (z) {
            if (this.LJJIJLIJ == null) {
                this.LJJIJLIJ = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.LJJIIJZLJL.get() && z) {
                this.LJJIJLIJ.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.LJJIJLIJ = null;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16As
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new LiveBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LiveBottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final LiveBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new LiveBottomSheetBehavior.SavedState(parcel, classLoader);
            }
        };
        public final int LL;
        public final int LLILLJJLI;
        public final boolean LLILLL;
        public final boolean LLILZ;
        public final boolean LLILZIL;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            boolean z2;
            super(parcel, classLoader);
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLL = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLILZ = z2;
            this.LLILZIL = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
            parcel.writeInt(this.LLILLJJLI);
            parcel.writeInt(this.LLILLL ? 1 : 0);
            parcel.writeInt(this.LLILZ ? 1 : 0);
            parcel.writeInt(this.LLILZIL ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, LiveBottomSheetBehavior<?> liveBottomSheetBehavior) {
            super(parcelable);
            this.LL = liveBottomSheetBehavior.LJIJJ;
            this.LLILLJJLI = liveBottomSheetBehavior.LIZJ;
            this.LLILLL = liveBottomSheetBehavior.LIZ;
            this.LLILZ = liveBottomSheetBehavior.LJIILL;
            this.LLILZIL = liveBottomSheetBehavior.LJIILLIIL;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.16Aq] */
    public LiveBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        super(context, attributeSet);
        this.LIZ = true;
        this.LIZJ = -1;
        this.LJFF = -1;
        this.LJIILIIL = 0.5f;
        this.LJIIZILJ = true;
        this.LJIJJ = 4;
        this.LJJIIZI = -1;
        this.LJJIJ = new ArrayList<>();
        this.LJJIL = -1;
        this.LJJJ = -1;
        this.LJJJIL = 0;
        this.LJJJJJL = new AbstractC21586119dr() { // from class: X.16Aq
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                if (liveBottomSheetBehavior.LJIILL) {
                    return liveBottomSheetBehavior.LJJII;
                }
                return liveBottomSheetBehavior.LJIILJJIL;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i3) {
                if (i3 == 1) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                    if (liveBottomSheetBehavior.LJIIZILJ) {
                        liveBottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i3) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                int i22 = liveBottomSheetBehavior.LJIJJ;
                if (i22 == 1 || liveBottomSheetBehavior.LJJIJL) {
                    return false;
                }
                if ((i22 == 3 && liveBottomSheetBehavior.LJJIJIIJIL == i3 && (weakReference = liveBottomSheetBehavior.LJJIIZ) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJJIIJZLJL) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i3, int i22) {
                return view.getLeft();
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i3, int i22) {
                int i32;
                int expandedOffset = this.LIZ.getExpandedOffset();
                LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                if (liveBottomSheetBehavior.LJIILL) {
                    i32 = liveBottomSheetBehavior.LJJII;
                } else {
                    i32 = liveBottomSheetBehavior.LJIILJJIL;
                }
                return C419990GdR.LIZIZ(i3, expandedOffset, i32);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i3 = 0;
                int i22 = 6;
                if (f2 >= 0.0f && !this.LIZ.LJII(view, f2)) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = this.LIZ;
                    if (liveBottomSheetBehavior.LJIILL && liveBottomSheetBehavior.shouldHide(view, f2)) {
                        i3 = this.LIZ.LJJII;
                        i22 = 5;
                    } else if (f2 != 0.0f && Math.abs(f) <= Math.abs(f2)) {
                        LiveBottomSheetBehavior liveBottomSheetBehavior2 = this.LIZ;
                        if (liveBottomSheetBehavior2.LIZ) {
                            i3 = liveBottomSheetBehavior2.LJIILJJIL;
                        } else {
                            int top = view.getTop();
                            if (Math.abs(top - this.LIZ.LJIIL) < Math.abs(top - this.LIZ.LJIILJJIL)) {
                                i3 = this.LIZ.LJIIL;
                            } else {
                                i3 = this.LIZ.LJIILJJIL;
                            }
                        }
                        i22 = 4;
                    } else {
                        int top2 = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior3 = this.LIZ;
                        if (liveBottomSheetBehavior3.LIZ) {
                            if (Math.abs(top2 - liveBottomSheetBehavior3.LJIIJJI) < Math.abs(top2 - this.LIZ.LJIILJJIL)) {
                                i3 = this.LIZ.LJIIJJI;
                                i22 = 3;
                            } else {
                                i3 = this.LIZ.LJIILJJIL;
                                i22 = 4;
                            }
                        } else {
                            int i32 = liveBottomSheetBehavior3.LJIIL;
                            if (top2 < i32) {
                                if (top2 < Math.abs(top2 - liveBottomSheetBehavior3.LJIILJJIL)) {
                                    this.LIZ.getClass();
                                    i22 = 3;
                                } else {
                                    i3 = this.LIZ.LJIIL;
                                }
                            } else if (Math.abs(top2 - i32) < Math.abs(top2 - this.LIZ.LJIILJJIL)) {
                                i3 = this.LIZ.LJIIL;
                            } else {
                                i3 = this.LIZ.LJIILJJIL;
                                i22 = 4;
                            }
                        }
                    }
                } else {
                    LiveBottomSheetBehavior liveBottomSheetBehavior4 = this.LIZ;
                    if (liveBottomSheetBehavior4.LIZ) {
                        i3 = liveBottomSheetBehavior4.LJIIJJI;
                        i22 = 3;
                    } else {
                        int top3 = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior5 = this.LIZ;
                        int i4 = liveBottomSheetBehavior5.LJIIL;
                        if (top3 > i4) {
                            i3 = i4;
                        } else {
                            liveBottomSheetBehavior5.getClass();
                            i22 = 3;
                        }
                    }
                }
                this.LIZ.startSettlingAnimation(view, i22, i3, true);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i3, int i22, int i32, int i4) {
                this.LIZ.dispatchOnSlide(i22);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LiveSheetBehavior_Layout);
        typedArrayObtainStyledAttributes.getDimension(R$styleable.LiveSheetBehavior_Layout_android_elevation, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.LiveSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i2);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetPeekHeightRatio)) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetPeekHeightRatio, typedValue);
            this.LJ = typedValue.getFloat();
        }
        this.LJFF = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetMaxPeekHeight, -1);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetMaxPeekHeightRatio)) {
            TypedValue typedValue2 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetMaxPeekHeightRatio, typedValue2);
            this.LJI = typedValue2.getFloat();
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveSheetBehavior_Layout_behavior_hideable, false));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.LIZ != z) {
            this.LIZ = z;
            if (this.LJJIIJZLJL != null) {
                calculateCollapsedOffset();
            }
            if (this.LIZ && this.LJIJJ == 6) {
                i = 3;
            } else {
                i = this.LJIJJ;
            }
            setStateInternal(i);
        }
        this.LJIILLIIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.LJIIZILJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetDraggable, true);
        this.LJJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetExpandedHeight, -1);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetExpandedHeightRatio)) {
            TypedValue typedValue3 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetExpandedHeightRatio, typedValue3);
            this.LJJIZ = typedValue3.getFloat();
        }
        this.LJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetMaxExpandedHeight, -1);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetMaxExpandedHeightRatio)) {
            TypedValue typedValue4 = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(R$styleable.LiveSheetBehavior_Layout_liveBottomSheetMaxExpandedHeightRatio, typedValue4);
            this.LJJJI = typedValue4.getFloat();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        if (C011Z.LIZ.LJIL()) {
            LJJJJL = 0.5f;
            LJJJJLI = 0.1f;
            LJJJJLL = 0.5f;
            LJJJJZ = 0.1f;
        }
    }

    public final boolean LJII(View view, float f) {
        int expandedOffset;
        int expandedOffset2 = this.LJJII - getExpandedOffset();
        float fAbs = Math.abs((view.getTop() + (f * LJJJJZ)) - getExpandedOffset());
        int i = expandedOffset2 >> 2;
        int i2 = this.LJJIIJ;
        if (this.LJIILLIIL) {
            expandedOffset = i2;
        } else {
            expandedOffset = (this.LJIILJJIL - getExpandedOffset()) >> 1;
        }
        if (fAbs < Math.min(i, Math.min(i2, expandedOffset)) && fAbs / this.LJJII < LJJJJLL) {
            return true;
        }
        return false;
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), (LiveBottomSheetBehavior<?>) this);
    }

    public final void settleToState(View view, int i) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.LJIILJJIL;
        } else if (i == 6) {
            expandedOffset = this.LJIIL;
            if (this.LIZ && expandedOffset <= (i2 = this.LJIIJJI)) {
                i = 3;
                expandedOffset = i2;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else if (this.LJIILL && i == 5) {
            expandedOffset = this.LJJII;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        startSettlingAnimation(view, i, expandedOffset, false);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJIILLIIL) {
            return true;
        }
        if (view.getTop() < this.LJIILJJIL) {
            return false;
        }
        int iCalculatePeekHeight = calculatePeekHeight();
        float fAbs = Math.abs((view.getTop() + (f * LJJJJLI)) - this.LJIILJJIL);
        if (fAbs > Math.min(this.LJJIIJ, iCalculatePeekHeight >> 1) || fAbs / this.LJJII > LJJJJL) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(SheetOptions sheetOptions, boolean z, boolean z2) {
        this.LJJIL = -1;
        this.LJJIZ = 0.0f;
        this.LJJJ = -1;
        this.LJJJI = 0.0f;
        this.LIZJ = -1;
        this.LJ = 0.0f;
        this.LJFF = -1;
        this.LJI = 0.0f;
        if (sheetOptions.fullscreenEnabled) {
            this.LJJIZ = 1.0f;
            this.LIZJ = sheetOptions.height;
            this.LJ = sheetOptions.heightRatio;
            this.LJFF = sheetOptions.maxHeight;
            this.LJI = sheetOptions.maxHeightRatio;
            this.LJIILLIIL = false;
        } else if (sheetOptions.expandable) {
            this.LJJIZ = sheetOptions.LLILLJJLI;
            this.LIZJ = sheetOptions.height;
            this.LJ = sheetOptions.heightRatio;
            this.LJFF = sheetOptions.maxHeight;
            this.LJI = sheetOptions.maxHeightRatio;
            this.LJIILLIIL = false;
        } else {
            this.LJJIL = sheetOptions.height;
            this.LJJIZ = sheetOptions.heightRatio;
            this.LJJJ = sheetOptions.maxHeight;
            this.LJJJI = sheetOptions.maxHeightRatio;
            this.LJIILLIIL = true;
        }
        this.LJJJIL = sheetOptions.extraHeight;
        this.LJIIZILJ = sheetOptions.draggable;
        this.LJIJ = z2;
        this.LJIJI = C418440Gaw.LIZ(Float.valueOf(sheetOptions.marginBottom));
        WeakReference<V> weakReference = this.LJJIIJZLJL;
        if (weakReference != null && weakReference.get() != null) {
            this.LJJIIJZLJL.get().requestLayout();
        }
        if (z) {
            if (this.LJIILLIIL) {
                setState(3);
            } else {
                setState(4);
            }
        }
        if (sheetOptions.startExpanded) {
            setState(3);
        }
    }

    @Override // X.C16BC
    public final C20246014Ju onApplyWindowInsets(C16G0 c16g0, V v, C20246014Ju c20246014Ju) {
        this.LJIIIIZZ = c20246014Ju.LJFF();
        this.LJIIIZ = c20246014Ju.LIZ(2).LIZLLL;
        return c20246014Ju;
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        C21586019dq c21586019dq;
        if (v.isShown() && this.LJIIZILJ) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.LJJIJIIJIL = -1;
                VelocityTracker velocityTracker = this.LJJIJIIJI;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.LJJIJIIJI = null;
                }
            }
            if (this.LJJIJIIJI == null) {
                this.LJJIJIIJI = VelocityTracker.obtain();
            }
            this.LJJIJIIJI.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.LJJIJL = false;
                    this.LJJIJIIJIL = -1;
                    if (this.LJIL) {
                        this.LJIL = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.LJJIJIL = (int) motionEvent.getY();
                if (this.LJIJJ != 2 && (weakReference = this.LJJIIZ) != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.LJJIJIL, view)) {
                    this.LJJIJIIJIL = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.LJJIJL = true;
                }
                if (this.LJJIJIIJIL == -1 && !c16g0.LJIIJ(x, this.LJJIJIL, v)) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJIL = z;
            }
            if (!this.LJIL && (c21586019dq = this.LJIJJLI) != null && c21586019dq.LJIJJ(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.LJJIIZ;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.LJIL || this.LJIJJ == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.LJIJJLI == null || Math.abs(this.LJJIJIL - motionEvent.getY()) <= this.LJIJJLI.LIZIZ) {
                return false;
            }
            return true;
        }
        this.LJIL = true;
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        View childAt;
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = new WeakReference<>(v);
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.LJIJJLI == null) {
            this.LJIJJLI = C21586019dq.LJIIIZ(c16g0, this.LJJJJJL);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        c16g0.getWidth();
        this.LJJII = c16g0.getHeight();
        int height = v.getHeight();
        this.LJJIFFI = height;
        int i2 = this.LJJII;
        this.LJJIIJ = (int) (i2 * 0.25f);
        int i3 = (i2 - height) - this.LJIJI;
        int i4 = 0;
        this.LJIIJJI = Math.max(0, i3);
        this.LJIIL = (int) (this.LJJII * (1.0f - this.LJIILIIL));
        calculateCollapsedOffset();
        int i5 = this.LJIJJ;
        if (i5 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i5 == 6) {
            v.offsetTopAndBottom(this.LJIIL);
        } else if (this.LJIILL && i5 == 5) {
            v.offsetTopAndBottom(this.LJJII);
        } else if (i5 == 4) {
            v.offsetTopAndBottom(this.LJIILJJIL);
        } else if (i5 == 1 || i5 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.LJJIIZ = new WeakReference<>(findScrollingChild(v));
        C415680GRq c415680GRq = null;
        if (this.LJJJJ == null) {
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    if (viewGroup.getChildAt(i6) instanceof C0KWH) {
                        childAt = viewGroup.getChildAt(i6);
                        break;
                    }
                }
                childAt = null;
                this.LJJJJ = childAt;
            } else {
                childAt = null;
                this.LJJJJ = childAt;
            }
        }
        LIZJ();
        if (this.LJJJJI == null) {
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) v;
                while (true) {
                    if (i4 >= viewGroup2.getChildCount()) {
                        break;
                    }
                    if (viewGroup2.getChildAt(i4) instanceof C415680GRq) {
                        c415680GRq = (C415680GRq) viewGroup2.getChildAt(i4);
                        break;
                    }
                    i4++;
                }
            }
            this.LJJJJI = c415680GRq;
        }
        LJI();
        LJ(v.getTop());
        return true;
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIJJ == 1 && actionMasked == 0) {
            return true;
        }
        C21586019dq c21586019dq = this.LJIJJLI;
        if (c21586019dq != null) {
            c21586019dq.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            this.LJJIJIIJIL = -1;
            VelocityTracker velocityTracker = this.LJJIJIIJI;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJJIJIIJI = null;
            }
        }
        if (this.LJJIJIIJI == null) {
            this.LJJIJIIJI = VelocityTracker.obtain();
        }
        this.LJJIJIIJI.addMovement(motionEvent);
        if (this.LJIJJLI != null && actionMasked == 2 && !this.LJIL) {
            float fAbs = Math.abs(this.LJJIJIL - motionEvent.getY());
            C21586019dq c21586019dq2 = this.LJIJJLI;
            if (fAbs > c21586019dq2.LIZIZ) {
                c21586019dq2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.LJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r7, V r8, android.view.View r9, int r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View, int):void");
    }

    public final void startSettlingAnimation(View view, int i, int i2, boolean z) {
        C21586019dq c21586019dq = this.LJIJJLI;
        if (c21586019dq != null && (!z ? c21586019dq.LJIJJLI(view.getLeft(), i2, view) : c21586019dq.LJIJI(view.getLeft(), i2))) {
            setStateInternal(2);
            if (this.LJIIJ == null) {
                this.LJIIJ = new c(view, i);
            }
            LiveBottomSheetBehavior<V>.c cVar = this.LJIIJ;
            if (!cVar.LLILLJJLI) {
                cVar.LLILLL = i;
                view.postOnAnimation(cVar);
                this.LJIIJ.LLILLJJLI = true;
                return;
            }
            cVar.LLILLL = i;
            return;
        }
        setStateInternal(i);
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIIZ;
        if (weakReference == null || !this.LJIIZILJ || view != weakReference.get()) {
            return false;
        }
        if (this.LJIJJ == 3 && !super.onNestedPreFling(c16g0, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final boolean onMeasureChild(C16G0 c16g0, V v, int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6 = v.getContext().getResources().getConfiguration().orientation;
        int size = View.MeasureSpec.getSize(i3);
        if (i6 == 1) {
            this.LJJIII = this.LJIIIZ + size;
        } else {
            this.LJJIII = size;
        }
        int i7 = this.LJJIL;
        if (i7 == -1) {
            float f = this.LJJIZ;
            if (f > 0.0f) {
                i7 = (int) (f * this.LJJIII);
            } else {
                i7 = this.LJJJ;
                i5 = Integer.MIN_VALUE;
                if (i7 == -1) {
                    float f2 = this.LJJJI;
                    if (f2 > 0.0f) {
                        i7 = (int) (this.LJJIII * f2);
                    } else {
                        i7 = -1;
                    }
                }
            }
            i5 = 1073741824;
        } else {
            i5 = 1073741824;
        }
        int iMin = Math.min(i7 + this.LJJJIL, size);
        if (iMin >= size) {
            z = true;
        } else {
            z = false;
        }
        if (iMin == -1) {
            return super.onMeasureChild(c16g0, v, i, i2, i3, i4);
        }
        if (i6 != 1 && !this.LJIJ) {
            v.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, i5));
            return true;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, c16g0.getPaddingLeft() + c16g0.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        float f3 = iMin;
        int i8 = this.LJJIII;
        if (f3 < i8 * 0.9f) {
            iMin = Math.min(iMin + this.LJII, (int) (i8 * 0.9f));
        }
        if (!z) {
            iMin = Math.min(iMin, (size - this.LJIIIIZZ) - this.LJIJI);
        }
        if (this.LJIJ) {
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(C418440Gaw.LIZ(Float.valueOf(375.0f)), 1073741824);
        }
        v.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMin, i5));
        return true;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        this.LJJ = 0;
        this.LJJI = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.LJJIIZ;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2 || !this.LJIIZILJ) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                v.offsetTopAndBottom(-expandedOffset);
                setStateInternal(3);
            } else {
                if (!this.LJIIZILJ) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.LJIILJJIL;
            if (i4 > i5 && !this.LJIILL) {
                int i6 = top - i5;
                iArr[1] = i6;
                v.offsetTopAndBottom(-i6);
                setStateInternal(4);
            } else {
                if (!this.LJIIZILJ) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJJ = i2;
        this.LJJI = true;
    }

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5) {
        LJI();
    }

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI != null) {
            c1119850fFP.LJJI.getClass();
            if (LiveBottomSheetBehaviorScrollFixSetting.INSTANCE.getValue()) {
                return;
            }
        }
        super.onNestedScroll(c16g0, v, view, i, i2, i3, i4, i5, iArr);
    }
}
