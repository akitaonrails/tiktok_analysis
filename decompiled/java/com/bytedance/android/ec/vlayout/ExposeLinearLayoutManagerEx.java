package com.bytedance.android.ec.vlayout;

import X.AbstractC21684819tm;
import X.C0WZX;
import X.C1777790wMb;
import X.C20104213lQ;
import X.C21673319rv;
import X.C21673919s1;
import X.C21684219tg;
import X.C21684319th;
import X.C21684419ti;
import X.C21684519tj;
import X.C21684619tk;
import X.C21685019to;
import X.C2188811AlT;
import X.C2204961BRm;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class ExposeLinearLayoutManagerEx extends LinearLayoutManager {
    public static boolean isLocalTest;
    public static boolean setFix2;
    public static Field vhField;
    public static Method vhSetFlags;
    public Object[] emptyArgs;
    public boolean interceptLayoutChildrenOnce;
    public C1777790wMb layoutChunkResultCache;
    public SparseArray<C21685019to> layoutInfoList;
    public final C21684419ti mAnchorInfo;
    public final C21684319th mChildHelperWrapper;
    public Bundle mCurrentPendingSavedState;
    public int mCurrentPendingScrollPosition;
    public final Method mEnsureLayoutStateMethod;
    public boolean mLastStackFromEnd;
    public C21684219tg mLayoutState;
    public AbstractC21684819tm mOrientationHelper;
    public int mPendingScrollPositionOffset;
    public RecyclerView mRecyclerView;
    public boolean mShouldReverseLayoutExpose;
    public int recycleOffset;

    public int computeAlignOffset(int i, boolean z, boolean z2) {
        return 0;
    }

    public int computeAlignOffset(View view, boolean z, boolean z2) {
        return 0;
    }

    public boolean isEnableMarginOverLap() {
        return false;
    }

    public void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i);
        }
    }

    public void onAnchorReady(C21673919s1 c21673919s1, C21684419ti c21684419ti) {
    }

    public void resetLayoutInfo() {
        for (int i = 0; i < this.layoutInfoList.size(); i++) {
            C21685019to c21685019to = this.layoutInfoList.get(i);
            c21685019to.LIZ = 0;
            c21685019to.LIZIZ = 0;
            c21685019to.LIZJ = 0;
            c21685019to.LIZLLL = false;
        }
    }

    private View getChildClosestToEndExpose() {
        return getChildAt(this.mShouldReverseLayoutExpose ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStartExpose() {
        return getChildAt(this.mShouldReverseLayoutExpose ? getChildCount() - 1 : 0);
    }

    public void ensureLayoutStateExpose() throws Throwable {
        AbstractC21684819tm c21684519tj;
        if (this.mLayoutState == null) {
            this.mLayoutState = new C21684219tg();
        }
        if (this.mOrientationHelper == null) {
            int orientation = getOrientation();
            if (orientation == 0) {
                c21684519tj = new C21684519tj(this);
            } else {
                if (orientation != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c21684519tj = new C21684619tk(this);
            }
            this.mOrientationHelper = c21684519tj;
        }
        try {
            C2204961BRm.a0(this.mEnsureLayoutStateMethod, this, this.emptyArgs, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mCurrentPendingSavedState != null) {
            return new Bundle(this.mCurrentPendingSavedState);
        }
        Bundle bundle = new Bundle();
        if (getChildCount() <= 0) {
            bundle.putInt("AnchorPosition", -1);
            return bundle;
        }
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayoutExpose;
        bundle.putBoolean("AnchorLayoutFromEnd", z);
        if (z) {
            View childClosestToEndExpose = getChildClosestToEndExpose();
            bundle.putInt("AnchorOffset", this.mOrientationHelper.LJFF() - this.mOrientationHelper.LIZ(childClosestToEndExpose));
            bundle.putInt("AnchorPosition", getPosition(childClosestToEndExpose));
            return bundle;
        }
        View childClosestToStartExpose = getChildClosestToStartExpose();
        bundle.putInt("AnchorPosition", getPosition(childClosestToStartExpose));
        bundle.putInt("AnchorOffset", this.mOrientationHelper.LIZLLL(childClosestToStartExpose) - this.mOrientationHelper.LJII());
        return bundle;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mCurrentPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    private void myResolveShouldLayoutReverse() {
        if (getOrientation() == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayoutExpose = getReverseLayout();
        } else {
            this.mShouldReverseLayoutExpose = !getReverseLayout();
        }
    }

    private void updateCardLayoutInfo() {
        if (getItemCount() == 0 || getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int position = getPosition(childAt);
        int decoratedTop = getDecoratedTop(getChildAt(0));
        if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            decoratedTop -= ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i = position - 1;
        C21685019to c21685019to = this.layoutInfoList.get(i);
        if (position != 0 && (c21685019to == null || !c21685019to.LIZLLL)) {
            for (int i2 = 0; i2 < position; i2++) {
                C21685019to c21685019to2 = this.layoutInfoList.get(i2);
                if (c21685019to2 == null || !c21685019to2.LIZLLL) {
                    c21685019to2 = new C21685019to();
                    c21685019to2.LIZLLL = true;
                    this.layoutInfoList.put(i2, c21685019to2);
                }
                int i3 = sparseIntArray.get(c21685019to2.LIZIZ);
                int i4 = c21685019to2.LIZJ - c21685019to2.LIZ;
                c21685019to2.LIZ = i3;
                int i5 = i4 + i3;
                c21685019to2.LIZJ = i5;
                if (i5 > i3) {
                    sparseIntArray.put(c21685019to2.LIZIZ, i5);
                }
            }
        }
        C21685019to c21685019to3 = this.layoutInfoList.get(i);
        int i6 = c21685019to3 != null ? c21685019to3.LIZJ : 0;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int position2 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt2 = getChildAt(i7);
            position2 = getPosition(childAt2);
            int decoratedTop2 = getDecoratedTop(childAt2);
            int decoratedLeft = getDecoratedLeft(childAt2);
            getDecoratedRight(childAt2);
            int decoratedBottom = getDecoratedBottom(childAt2);
            if (childAt2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                decoratedTop2 -= ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).topMargin;
                decoratedBottom += ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).bottomMargin;
            }
            C21685019to c21685019to4 = this.layoutInfoList.get(position2);
            if (c21685019to4 == null) {
                c21685019to4 = new C21685019to();
                c21685019to4.LIZLLL = true;
                this.layoutInfoList.put(position2, c21685019to4);
            }
            int i8 = decoratedBottom - decoratedTop2;
            int i9 = (decoratedTop2 - decoratedTop) + i6;
            int i10 = i9 + i8;
            if (c21685019to4.LIZJ != i10 && sparseIntArray.get(decoratedLeft) < decoratedBottom) {
                sparseIntArray2.put(decoratedLeft, i10 - c21685019to4.LIZJ);
            }
            if (sparseIntArray.get(decoratedLeft) < decoratedBottom) {
                sparseIntArray.put(decoratedLeft, decoratedBottom);
            }
            c21685019to4.LIZ = i9;
            c21685019to4.LIZJ = i9 + i8;
            c21685019to4.LIZIZ = decoratedLeft;
            c21685019to4.LIZLLL = true;
        }
        if (sparseIntArray2.size() == 0) {
            return;
        }
        int i11 = position2 + 1;
        C21685019to c21685019to5 = this.layoutInfoList.get(i11);
        while (c21685019to5 != null) {
            int i12 = sparseIntArray2.get(c21685019to5.LIZIZ, -1);
            if (i12 != -1) {
                c21685019to5.LIZ += i12;
                c21685019to5.LIZJ += i12;
            }
            i11++;
            c21685019to5 = this.layoutInfoList.get(i11);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findFirstVisibleItemPosition() throws Throwable {
        ensureLayoutStateExpose();
        return super.findFirstVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int findLastVisibleItemPosition() throws Exception {
        ensureLayoutStateExpose();
        try {
            return super.findLastVisibleItemPosition();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public int getScrollDy() {
        if (getItemCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        C21685019to c21685019to = this.layoutInfoList.get(getPosition(childAt));
        if (c21685019to == null) {
            return 0;
        }
        int decoratedTop = getDecoratedTop(childAt);
        if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            decoratedTop -= ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
        }
        return decoratedTop - c21685019to.LIZ;
    }

    public void validateChildOrderExpose() {
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iLIZLLL = this.mOrientationHelper.LIZLLL(getChildAt(0));
        if (this.mShouldReverseLayoutExpose) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iLIZLLL2 = this.mOrientationHelper.LIZLLL(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("detected invalid position. loc invalid? ");
                    sbLIZ.append(iLIZLLL2 < iLIZLLL);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (iLIZLLL2 > iLIZLLL) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iLIZLLL3 = this.mOrientationHelper.LIZLLL(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("detected invalid position. loc invalid? ");
                sbLIZ2.append(iLIZLLL3 < iLIZLLL);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (iLIZLLL3 < iLIZLLL) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public ExposeLinearLayoutManagerEx(Context context) {
        this(context, 1, false);
    }

    private int convertFocusDirectionToLayoutDirectionExpose(int i) {
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && orientation == 1) {
                        return 1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (orientation == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            }
            if (orientation == 1) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (orientation == 0) {
            return -1;
        }
        return Integer.MIN_VALUE;
    }

    public static boolean isViewHolderUpdated(RecyclerView.ViewHolder viewHolder) {
        Method method;
        Method method2;
        C20104213lQ c20104213lQ = new C20104213lQ(viewHolder);
        Method method3 = C20104213lQ.LIZIZ;
        if (method3 != null) {
            try {
                if (!((Boolean) C2204961BRm.a0(method3, viewHolder, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null))).booleanValue() && (method = C20104213lQ.LIZJ) != null) {
                    try {
                        if (!((Boolean) C2204961BRm.a0(method, c20104213lQ.LIZ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null))).booleanValue() && (method2 = C20104213lQ.LIZLLL) != null) {
                            try {
                                if (!((Boolean) C2204961BRm.a0(method2, c20104213lQ.LIZ, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null))).booleanValue()) {
                                    return false;
                                }
                            } catch (IllegalAccessException e) {
                                TryCatchGuardChecker.doCheck(e);
                            } catch (InvocationTargetException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    } catch (IllegalAccessException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    } catch (InvocationTargetException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
            } catch (IllegalAccessException e5) {
                TryCatchGuardChecker.doCheck(e5);
            } catch (InvocationTargetException e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
        }
        return true;
    }

    private View myFindFirstReferenceChild(int i) {
        return findReferenceChildInternal(0, getChildCount(), i);
    }

    private View myFindLastReferenceChild(int i) {
        return findReferenceChildInternal(getChildCount() - 1, -1, i);
    }

    private View myFindReferenceChildClosestToEnd(C21673919s1 c21673919s1) {
        boolean z = this.mShouldReverseLayoutExpose;
        int iLIZIZ = c21673919s1.LIZIZ();
        if (z) {
            return myFindFirstReferenceChild(iLIZIZ);
        }
        return myFindLastReferenceChild(iLIZIZ);
    }

    private View myFindReferenceChildClosestToStart(C21673919s1 c21673919s1) {
        boolean z = this.mShouldReverseLayoutExpose;
        int iLIZIZ = c21673919s1.LIZIZ();
        if (z) {
            return myFindLastReferenceChild(iLIZIZ);
        }
        return myFindFirstReferenceChild(iLIZIZ);
    }

    private void updateLayoutStateToFillEndExpose(C21684419ti c21684419ti) {
        updateLayoutStateToFillEndExpose(c21684419ti.LIZ, c21684419ti.LIZIZ);
    }

    private void updateLayoutStateToFillStartExpose(C21684419ti c21684419ti) {
        updateLayoutStateToFillStartExpose(c21684419ti.LIZ, c21684419ti.LIZIZ);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mCurrentPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.InterfaceC20634915op
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayoutExpose) {
            i2 = -1;
        }
        if (getOrientation() == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    public View findHiddenView(int i) {
        Method method;
        C21684319th c21684319th = this.mChildHelperWrapper;
        c21684319th.getClass();
        try {
            c21684319th.LIZ();
            method = c21684319th.LIZJ;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (method != null) {
            return (View) C2204961BRm.a0(method, c21684319th.LIZ, new Object[]{Integer.valueOf(i), -1}, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null));
        }
        Method method2 = c21684319th.LIZLLL;
        if (method2 != null) {
            return (View) C2204961BRm.a0(method2, c21684319th.LIZ, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null));
        }
        return null;
    }

    public void hideView(View view) throws Throwable {
        this.mChildHelperWrapper.LIZIZ(view);
    }

    public boolean isHidden(View view) {
        C21684319th c21684319th = this.mChildHelperWrapper;
        c21684319th.getClass();
        boolean zBooleanValue = false;
        try {
            c21684319th.LIZ();
            Object[] objArr = c21684319th.LJIIJJI;
            objArr[0] = view;
            zBooleanValue = ((Boolean) C2204961BRm.a0(c21684319th.LJ, c21684319th.LIZ, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null))).booleanValue();
            return zBooleanValue;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return zBooleanValue;
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return zBooleanValue;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            return zBooleanValue;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        updateCardLayoutInfo();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            this.mCurrentPendingSavedState = (Bundle) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void removeViewAt(int i) {
        super.removeViewAt(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mCurrentPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setOrientation(int i) {
        super.setOrientation(i);
        this.mOrientationHelper = null;
    }

    public void setRecycleOffset(int i) {
        this.recycleOffset = i;
    }

    public void showView(View view) throws Throwable {
        C21684319th c21684319th = this.mChildHelperWrapper;
        c21684319th.getClass();
        try {
            c21684319th.LIZ();
            c21684319th.LJIIJJI[0] = Integer.valueOf(c21684319th.LJIIL.mRecyclerView.indexOfChild(view));
            C2204961BRm.a0(c21684319th.LJII, c21684319th.LJI, c21684319th.LJIIJJI, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null));
            List list = c21684319th.LJIIIZ;
            if (list != null) {
                list.remove(view);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void attachViewHolder(RecyclerView.LayoutParams layoutParams, RecyclerView.ViewHolder viewHolder) {
        try {
            if (vhField == null) {
                vhField = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
            }
            vhField.setAccessible(true);
            vhField.set(layoutParams, viewHolder);
            if (vhSetFlags == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", cls, cls);
                vhSetFlags = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            vhSetFlags.invoke(viewHolder, 4, 4);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }

    private void recycleByLayoutStateExpose(C21673319rv c21673319rv, C21684219tg c21684219tg) {
        if (!c21684219tg.LIZJ) {
            return;
        }
        if (c21684219tg.LJII == -1) {
            recycleViewsFromEndExpose(c21673319rv, c21684219tg.LJIIIIZZ);
        } else {
            recycleViewsFromStartExpose(c21673319rv, c21684219tg.LJIIIIZZ);
        }
    }

    private void recycleViewsFromEndExpose(C21673319rv c21673319rv, int i) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iLJ = this.mOrientationHelper.LJ() - i;
        if (this.mShouldReverseLayoutExpose) {
            for (int i2 = 0; i2 < childCount; i2++) {
                if (this.mOrientationHelper.LIZLLL(getChildAt(i2)) - this.recycleOffset < iLJ) {
                    recycleChildren(c21673319rv, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = childCount - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            if (this.mOrientationHelper.LIZLLL(getChildAt(i4)) - this.recycleOffset < iLJ) {
                recycleChildren(c21673319rv, i3, i4);
                return;
            }
        }
    }

    private void recycleViewsFromStartExpose(C21673319rv c21673319rv, int i) {
        if (i < 0) {
            return;
        }
        int childCount = getChildCount();
        if (this.mShouldReverseLayoutExpose) {
            int i2 = childCount - 1;
            for (int i3 = i2; i3 >= 0; i3--) {
                if (this.mOrientationHelper.LIZ(getChildAt(i3)) + this.recycleOffset > i) {
                    recycleChildren(c21673319rv, i2, i3);
                    return;
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            if (this.mOrientationHelper.LIZ(getChildAt(i4)) + this.recycleOffset > i) {
                recycleChildren(c21673319rv, 0, i4);
                return;
            }
        }
    }

    private boolean updateAnchorFromChildrenExpose(C21673919s1 c21673919s1, C21684419ti c21684419ti) {
        View viewMyFindReferenceChildClosestToStart;
        int iLJII;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            c21684419ti.getClass();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewPosition() >= 0 && layoutParams.getViewPosition() < c21673919s1.LIZIZ()) {
                c21684419ti.LIZIZ(focusedChild);
                return true;
            }
        }
        if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        }
        myFindReferenceChildClosestToEnd(c21673919s1);
        myFindReferenceChildClosestToStart(c21673919s1);
        if (c21684419ti.LIZJ) {
            viewMyFindReferenceChildClosestToStart = myFindReferenceChildClosestToEnd(c21673919s1);
        } else {
            viewMyFindReferenceChildClosestToStart = myFindReferenceChildClosestToStart(c21673919s1);
        }
        if (viewMyFindReferenceChildClosestToStart == null) {
            return false;
        }
        c21684419ti.LIZIZ(viewMyFindReferenceChildClosestToStart);
        if (!c21673919s1.LJI && supportsPredictiveItemAnimations() && (this.mOrientationHelper.LIZLLL(viewMyFindReferenceChildClosestToStart) >= this.mOrientationHelper.LJFF() || this.mOrientationHelper.LIZ(viewMyFindReferenceChildClosestToStart) < this.mOrientationHelper.LJII())) {
            if (c21684419ti.LIZJ) {
                iLJII = this.mOrientationHelper.LJFF();
            } else {
                iLJII = this.mOrientationHelper.LJII();
            }
            c21684419ti.LIZIZ = iLJII;
        }
        return true;
    }

    private boolean updateAnchorFromPendingDataExpose(C21673919s1 c21673919s1, C21684419ti c21684419ti) {
        int i;
        boolean z;
        int iLIZLLL;
        boolean z2 = false;
        int iLJIIIIZZ = 0;
        if (!c21673919s1.LJI && (i = this.mCurrentPendingScrollPosition) != -1) {
            if (i >= 0 && i < c21673919s1.LIZIZ()) {
                c21684419ti.LIZ = this.mCurrentPendingScrollPosition;
                Bundle bundle = this.mCurrentPendingSavedState;
                if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
                    boolean z3 = this.mCurrentPendingSavedState.getBoolean("AnchorLayoutFromEnd");
                    c21684419ti.LIZJ = z3;
                    if (z3) {
                        c21684419ti.LIZIZ = this.mOrientationHelper.LJFF() - this.mCurrentPendingSavedState.getInt("AnchorOffset");
                        return true;
                    }
                    c21684419ti.LIZIZ = this.mOrientationHelper.LJII() + this.mCurrentPendingSavedState.getInt("AnchorOffset");
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition = findViewByPosition(this.mCurrentPendingScrollPosition);
                    if (viewFindViewByPosition != null) {
                        if (this.mOrientationHelper.LIZIZ(viewFindViewByPosition) > this.mOrientationHelper.LJIIIIZZ()) {
                            c21684419ti.LIZ();
                            return true;
                        }
                        if (this.mOrientationHelper.LIZLLL(viewFindViewByPosition) - this.mOrientationHelper.LJII() < 0) {
                            c21684419ti.LIZIZ = this.mOrientationHelper.LJII();
                            c21684419ti.LIZJ = false;
                            return true;
                        }
                        if (this.mOrientationHelper.LJFF() - this.mOrientationHelper.LIZ(viewFindViewByPosition) < 0) {
                            c21684419ti.LIZIZ = this.mOrientationHelper.LJFF();
                            c21684419ti.LIZJ = true;
                            return true;
                        }
                        if (c21684419ti.LIZJ) {
                            int iLIZ = this.mOrientationHelper.LIZ(viewFindViewByPosition);
                            AbstractC21684819tm abstractC21684819tm = this.mOrientationHelper;
                            if (Integer.MIN_VALUE != abstractC21684819tm.LIZIZ) {
                                iLJIIIIZZ = abstractC21684819tm.LJIIIIZZ() - abstractC21684819tm.LIZIZ;
                            }
                            iLIZLLL = iLIZ + iLJIIIIZZ;
                        } else {
                            iLIZLLL = this.mOrientationHelper.LIZLLL(viewFindViewByPosition);
                        }
                        c21684419ti.LIZIZ = iLIZLLL;
                        return true;
                    }
                    if (getChildCount() > 0) {
                        if (this.mCurrentPendingScrollPosition < getPosition(getChildAt(0))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z == this.mShouldReverseLayoutExpose) {
                            z2 = true;
                        }
                        c21684419ti.LIZJ = z2;
                    }
                    c21684419ti.LIZ();
                    return true;
                }
                boolean z4 = this.mShouldReverseLayoutExpose;
                c21684419ti.LIZJ = z4;
                if (z4) {
                    c21684419ti.LIZIZ = this.mOrientationHelper.LJFF() - this.mPendingScrollPositionOffset;
                    return true;
                }
                c21684419ti.LIZIZ = this.mOrientationHelper.LJII() + this.mPendingScrollPositionOffset;
                return true;
            }
            this.mCurrentPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayoutExpose(C21673919s1 c21673919s1, C21684419ti c21684419ti) {
        int iLIZIZ;
        if (updateAnchorFromPendingDataExpose(c21673919s1, c21684419ti) || updateAnchorFromChildrenExpose(c21673919s1, c21684419ti)) {
            return;
        }
        c21684419ti.LIZ();
        if (this.mStackFromEnd) {
            iLIZIZ = c21673919s1.LIZIZ() - 1;
        } else {
            iLIZIZ = 0;
        }
        c21684419ti.LIZ = iLIZIZ;
    }

    private void updateLayoutStateToFillEndExpose(int i, int i2) {
        int i3;
        this.mLayoutState.LJ = this.mOrientationHelper.LJFF() - i2;
        C21684219tg c21684219tg = this.mLayoutState;
        if (this.mShouldReverseLayoutExpose) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c21684219tg.LJI = i3;
        c21684219tg.LJFF = i;
        c21684219tg.LJII = 1;
        c21684219tg.LIZLLL = i2;
        c21684219tg.LJIIIIZZ = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStartExpose(int i, int i2) {
        int i3;
        this.mLayoutState.LJ = i2 - this.mOrientationHelper.LJII();
        C21684219tg c21684219tg = this.mLayoutState;
        c21684219tg.LJFF = i;
        if (this.mShouldReverseLayoutExpose) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c21684219tg.LJI = i3;
        c21684219tg.LJII = -1;
        c21684219tg.LIZLLL = i2;
        c21684219tg.LJIIIIZZ = Integer.MIN_VALUE;
    }

    public void addHiddenView(View view, boolean z) throws Throwable {
        int i;
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        addView(view, i);
        this.mChildHelperWrapper.LIZIZ(view);
    }

    public int getCardDistance(int i, int i2) {
        if (getItemCount() == 0 || i == i2 || this.layoutInfoList.get(i) == null || this.layoutInfoList.get(i2) == null) {
            return 0;
        }
        return this.layoutInfoList.get(i2).LIZJ - this.layoutInfoList.get(i).LIZ;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
        this.mRecyclerView = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) throws Throwable {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iFixLayoutEndGapExpose;
        int i6;
        View viewFindViewByPosition;
        int iLIZLLL;
        int iLJFF;
        if (this.interceptLayoutChildrenOnce && c21673919s1.LJI) {
            this.interceptLayoutChildrenOnce = false;
            return;
        }
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null && bundle.getInt("AnchorPosition") >= 0) {
            this.mCurrentPendingScrollPosition = this.mCurrentPendingSavedState.getInt("AnchorPosition");
        }
        ensureLayoutStateExpose();
        this.mLayoutState.LIZJ = false;
        myResolveShouldLayoutReverse();
        C21684419ti c21684419ti = this.mAnchorInfo;
        c21684419ti.LIZ = -1;
        c21684419ti.LIZIZ = Integer.MIN_VALUE;
        c21684419ti.LIZJ = false;
        c21684419ti.LIZJ = this.mShouldReverseLayoutExpose ^ this.mStackFromEnd;
        updateAnchorInfoForLayoutExpose(c21673919s1, c21684419ti);
        int extraLayoutSpace = getExtraLayoutSpace(c21673919s1);
        if (c21673919s1.LIZ < this.mAnchorInfo.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.mShouldReverseLayoutExpose) {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        } else {
            i = 0;
        }
        int iLJII = extraLayoutSpace + this.mOrientationHelper.LJII();
        int iLJI = i + this.mOrientationHelper.LJI();
        if (c21673919s1.LJI && (i6 = this.mCurrentPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayoutExpose) {
                iLJFF = this.mOrientationHelper.LJFF() - this.mOrientationHelper.LIZ(viewFindViewByPosition);
                iLIZLLL = this.mPendingScrollPositionOffset;
            } else {
                iLIZLLL = this.mOrientationHelper.LIZLLL(viewFindViewByPosition) - this.mOrientationHelper.LJII();
                iLJFF = this.mPendingScrollPositionOffset;
            }
            int i7 = iLJFF - iLIZLLL;
            if (i7 > 0) {
                iLJII += i7;
            } else {
                iLJI -= i7;
            }
        }
        onAnchorReady(c21673919s1, this.mAnchorInfo);
        detachAndScrapAttachedViews(c21673319rv);
        C21684219tg c21684219tg = this.mLayoutState;
        c21684219tg.LJIIJ = c21673919s1.LJI;
        c21684219tg.LIZIZ = true;
        C21684419ti c21684419ti2 = this.mAnchorInfo;
        if (c21684419ti2.LIZJ) {
            updateLayoutStateToFillStartExpose(c21684419ti2);
            C21684219tg c21684219tg2 = this.mLayoutState;
            c21684219tg2.LJIIIZ = iLJII;
            fill(c21673319rv, c21684219tg2, c21673919s1, false);
            C21684219tg c21684219tg3 = this.mLayoutState;
            i3 = c21684219tg3.LIZLLL;
            int i8 = c21684219tg3.LJ;
            if (i8 > 0) {
                iLJI += i8;
            }
            updateLayoutStateToFillEndExpose(this.mAnchorInfo);
            C21684219tg c21684219tg4 = this.mLayoutState;
            c21684219tg4.LJIIIZ = iLJI;
            c21684219tg4.LJFF += c21684219tg4.LJI;
            fill(c21673319rv, c21684219tg4, c21673919s1, false);
            i2 = this.mLayoutState.LIZLLL;
        } else {
            updateLayoutStateToFillEndExpose(c21684419ti2);
            C21684219tg c21684219tg5 = this.mLayoutState;
            c21684219tg5.LJIIIZ = iLJI;
            fill(c21673319rv, c21684219tg5, c21673919s1, false);
            C21684219tg c21684219tg6 = this.mLayoutState;
            i2 = c21684219tg6.LIZLLL;
            int i9 = c21684219tg6.LJ;
            if (i9 > 0) {
                iLJII += i9;
            }
            updateLayoutStateToFillStartExpose(this.mAnchorInfo);
            C21684219tg c21684219tg7 = this.mLayoutState;
            c21684219tg7.LJIIIZ = iLJII;
            c21684219tg7.LJFF += c21684219tg7.LJI;
            fill(c21673319rv, c21684219tg7, c21673919s1, false);
            i3 = this.mLayoutState.LIZLLL;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayoutExpose ^ this.mStackFromEnd) {
                int iFixLayoutEndGapExpose2 = fixLayoutEndGapExpose(i2, c21673319rv, c21673919s1, true);
                i4 = i3 + iFixLayoutEndGapExpose2;
                i5 = i2 + iFixLayoutEndGapExpose2;
                iFixLayoutEndGapExpose = fixLayoutStartGapExpose(i4, c21673319rv, c21673919s1, false);
            } else {
                int iFixLayoutStartGapExpose = fixLayoutStartGapExpose(i3, c21673319rv, c21673919s1, true);
                i4 = i3 + iFixLayoutStartGapExpose;
                i5 = i2 + iFixLayoutStartGapExpose;
                iFixLayoutEndGapExpose = fixLayoutEndGapExpose(i5, c21673319rv, c21673919s1, false);
            }
            i3 = i4 + iFixLayoutEndGapExpose;
            i2 = i5 + iFixLayoutEndGapExpose;
        }
        layoutForPredictiveAnimationsExpose(c21673319rv, c21673919s1, i3, i2);
        if (!c21673919s1.LJI) {
            this.mCurrentPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            AbstractC21684819tm abstractC21684819tm = this.mOrientationHelper;
            abstractC21684819tm.LIZIZ = abstractC21684819tm.LJIIIIZZ();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
        this.mCurrentPendingSavedState = null;
        validateChildOrderExpose();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void scrollToPositionWithOffset(int i, int i2) {
        this.mCurrentPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        Bundle bundle = this.mCurrentPendingSavedState;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    public ExposeLinearLayoutManagerEx(Context context, int i, boolean z) {
        super(context, i, z);
        this.mCurrentPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.layoutInfoList = new SparseArray<>(20);
        this.emptyArgs = new Object[0];
        this.layoutChunkResultCache = new C1777790wMb();
        this.mAnchorInfo = new C21684419ti(this);
        setOrientation(i);
        setReverseLayout(z);
        this.mChildHelperWrapper = new C21684319th(this, this);
        try {
            Method declaredMethod = LinearLayoutManager.class.getDeclaredMethod("ensureLayoutState", new Class[0]);
            this.mEnsureLayoutStateMethod = declaredMethod;
            declaredMethod.setAccessible(true);
            try {
                Method declaredMethod2 = RecyclerView.LayoutManager.class.getDeclaredMethod("setItemPrefetchEnabled", Boolean.TYPE);
                if (declaredMethod2 != null) {
                    declaredMethod2.invoke(this, Boolean.FALSE);
                }
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        } catch (NoSuchMethodException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new RuntimeException(e4);
        }
    }

    private View findReferenceChildInternal(int i, int i2, int i3) throws Throwable {
        int i4;
        ensureLayoutStateExpose();
        int iLJII = this.mOrientationHelper.LJII();
        int iLJFF = this.mOrientationHelper.LJFF();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.LIZLLL(childAt) < iLJFF && this.mOrientationHelper.LIZ(childAt) >= iLJII) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public void recycleChildren(C21673319rv c21673319rv, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, c21673319rv);
            }
            return;
        }
        while (i > i2) {
            removeAndRecycleViewAt(i, c21673319rv);
            i--;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (getOrientation() == 1) {
            return 0;
        }
        return scrollInternalBy(i, c21673319rv, c21673919s1);
    }

    public int scrollInternalBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) throws Throwable {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.mLayoutState.LIZJ = true;
        ensureLayoutStateExpose();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        updateLayoutStateExpose(i2, iAbs, true, c21673919s1);
        C21684219tg c21684219tg = this.mLayoutState;
        int i3 = c21684219tg.LJIIIIZZ;
        c21684219tg.LIZIZ = false;
        int iFill = i3 + fill(c21673319rv, c21684219tg, c21673919s1, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.LJIIIZ(-i);
        return i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (getOrientation() == 0) {
            return 0;
        }
        return scrollInternalBy(i, c21673319rv, c21673919s1);
    }

    private int fixLayoutEndGapExpose(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJFF;
        int iLJFF2 = this.mOrientationHelper.LJFF() - i;
        if (iLJFF2 > 0) {
            int i2 = -scrollInternalBy(-iLJFF2, c21673319rv, c21673919s1);
            int i3 = i + i2;
            if (z && (iLJFF = this.mOrientationHelper.LJFF() - i3) > 0) {
                this.mOrientationHelper.LJIIIZ(iLJFF);
                return iLJFF + i2;
            }
            return i2;
        }
        return 0;
    }

    private int fixLayoutStartGapExpose(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJII;
        int iLJII2 = i - this.mOrientationHelper.LJII();
        if (iLJII2 > 0) {
            int i2 = -scrollInternalBy(iLJII2, c21673319rv, c21673919s1);
            int i3 = i + i2;
            if (z && (iLJII = i3 - this.mOrientationHelper.LJII()) > 0) {
                this.mOrientationHelper.LJIIIZ(-iLJII);
                return i2 - iLJII;
            }
            return i2;
        }
        return 0;
    }

    private void layoutForPredictiveAnimationsExpose(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        if (c21673919s1.LJIIJ && getChildCount() != 0 && !c21673919s1.LJI && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> list = c21673319rv.LIZLLL;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i5 = 0;
            int iLIZIZ = 0;
            int iLIZIZ2 = 0;
            while (true) {
                i3 = -1;
                if (i5 >= size) {
                    break;
                }
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(list, i5);
                if (viewHolder.getPosition() < position) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.mShouldReverseLayoutExpose) {
                    iLIZIZ += this.mOrientationHelper.LIZIZ(viewHolder.itemView);
                } else {
                    iLIZIZ2 += this.mOrientationHelper.LIZIZ(viewHolder.itemView);
                }
                i5++;
            }
            this.mLayoutState.LJIIJJI = list;
            if (iLIZIZ > 0) {
                updateLayoutStateToFillStartExpose(getPosition(getChildClosestToStartExpose()), i);
                C21684219tg c21684219tg = this.mLayoutState;
                c21684219tg.LJIIIZ = iLIZIZ;
                c21684219tg.LJ = 0;
                int i6 = c21684219tg.LJFF;
                if (this.mShouldReverseLayoutExpose) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                c21684219tg.LJFF = i6 + i4;
                c21684219tg.LIZIZ = true;
                fill(c21673319rv, c21684219tg, c21673919s1, false);
            }
            if (iLIZIZ2 > 0) {
                updateLayoutStateToFillEndExpose(getPosition(getChildClosestToEndExpose()), i2);
                C21684219tg c21684219tg2 = this.mLayoutState;
                c21684219tg2.LJIIIZ = iLIZIZ2;
                c21684219tg2.LJ = 0;
                int i7 = c21684219tg2.LJFF;
                if (!this.mShouldReverseLayoutExpose) {
                    i3 = 1;
                }
                c21684219tg2.LJFF = i7 + i3;
                c21684219tg2.LIZIZ = true;
                fill(c21673319rv, c21684219tg2, c21673919s1, false);
            }
            this.mLayoutState.LJIIJJI = null;
        }
    }

    public int fill(C21673319rv c21673319rv, C21684219tg c21684219tg, C21673919s1 c21673919s1, boolean z) {
        int i = c21684219tg.LJ;
        int i2 = c21684219tg.LJIIIIZZ;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c21684219tg.LJIIIIZZ = i2 + i;
            }
            recycleByLayoutStateExpose(c21673319rv, c21684219tg);
        }
        int i3 = c21684219tg.LJ + c21684219tg.LJIIIZ + this.recycleOffset;
        boolean z2 = false;
        while (i3 > 0) {
            int i4 = c21684219tg.LJFF;
            if (i4 >= 0 && i4 < c21673919s1.LIZIZ()) {
                C1777790wMb c1777790wMb = this.layoutChunkResultCache;
                c1777790wMb.LIZ = 0;
                c1777790wMb.LIZIZ = false;
                c1777790wMb.LIZJ = false;
                c1777790wMb.LIZLLL = false;
                layoutChunk(c21673319rv, c21673919s1, c21684219tg, c1777790wMb);
                C1777790wMb c1777790wMb2 = this.layoutChunkResultCache;
                if (!c1777790wMb2.LIZIZ) {
                    int i5 = c21684219tg.LIZLLL;
                    int i6 = c1777790wMb2.LIZ;
                    c21684219tg.LIZLLL = i5 + (c21684219tg.LJII * i6);
                    if (!c1777790wMb2.LIZJ || this.mLayoutState.LJIIJJI != null || !c21673919s1.LJI) {
                        c21684219tg.LJ -= i6;
                        i3 -= i6;
                    }
                    int i7 = c21684219tg.LJIIIIZZ;
                    if (i7 != Integer.MIN_VALUE) {
                        int i8 = i7 + i6;
                        c21684219tg.LJIIIIZZ = i8;
                        int i9 = c21684219tg.LJ;
                        if (i9 < 0) {
                            c21684219tg.LJIIIIZZ = i8 + i9;
                        }
                        recycleByLayoutStateExpose(c21673319rv, c21684219tg);
                    }
                    if (z && this.layoutChunkResultCache.LIZLLL) {
                        break;
                    }
                    z2 = true;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        validateChildOrderExpose();
        if (z2) {
            updateCardLayoutInfo();
        }
        return i - c21684219tg.LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void layoutChunk(X.C21673319rv r17, X.C21673919s1 r18, X.C21684219tg r19, X.C1777790wMb r20) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx.layoutChunk(X.19rv, X.19s1, X.19tg, X.0wMb):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) throws Throwable {
        int iConvertFocusDirectionToLayoutDirectionExpose;
        View viewMyFindReferenceChildClosestToEnd;
        View childClosestToEndExpose;
        myResolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirectionExpose = convertFocusDirectionToLayoutDirectionExpose(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirectionExpose == -1) {
            viewMyFindReferenceChildClosestToEnd = myFindReferenceChildClosestToStart(c21673919s1);
        } else {
            viewMyFindReferenceChildClosestToEnd = myFindReferenceChildClosestToEnd(c21673919s1);
        }
        if (viewMyFindReferenceChildClosestToEnd == null) {
            return null;
        }
        ensureLayoutStateExpose();
        updateLayoutStateExpose(iConvertFocusDirectionToLayoutDirectionExpose, (int) (this.mOrientationHelper.LJIIIIZZ() * 0.33f), false, c21673919s1);
        C21684219tg c21684219tg = this.mLayoutState;
        c21684219tg.LJIIIIZZ = Integer.MIN_VALUE;
        c21684219tg.LIZJ = false;
        c21684219tg.LIZIZ = false;
        fill(c21673319rv, c21684219tg, c21673919s1, true);
        if (iConvertFocusDirectionToLayoutDirectionExpose == -1) {
            childClosestToEndExpose = getChildClosestToStartExpose();
        } else {
            childClosestToEndExpose = getChildClosestToEndExpose();
        }
        if (childClosestToEndExpose == viewMyFindReferenceChildClosestToEnd || !childClosestToEndExpose.isFocusable()) {
            return null;
        }
        return childClosestToEndExpose;
    }

    public void updateLayoutStateExpose(int i, int i2, boolean z, C21673919s1 c21673919s1) {
        int iLJII;
        this.mLayoutState.LJIIIZ = getExtraLayoutSpace(c21673919s1);
        C21684219tg c21684219tg = this.mLayoutState;
        c21684219tg.LJII = i;
        int i3 = -1;
        if (i == 1) {
            c21684219tg.LJIIIZ += this.mOrientationHelper.LJI();
            View childClosestToEndExpose = getChildClosestToEndExpose();
            C21684219tg c21684219tg2 = this.mLayoutState;
            if (!this.mShouldReverseLayoutExpose) {
                i3 = 1;
            }
            c21684219tg2.LJI = i3;
            int position = getPosition(childClosestToEndExpose);
            C21684219tg c21684219tg3 = this.mLayoutState;
            c21684219tg2.LJFF = position + c21684219tg3.LJI;
            c21684219tg3.LIZLLL = this.mOrientationHelper.LIZ(childClosestToEndExpose) + computeAlignOffset(childClosestToEndExpose, true, false);
            iLJII = this.mLayoutState.LIZLLL - this.mOrientationHelper.LJFF();
        } else {
            View childClosestToStartExpose = getChildClosestToStartExpose();
            this.mLayoutState.LJIIIZ += this.mOrientationHelper.LJII();
            C21684219tg c21684219tg4 = this.mLayoutState;
            if (this.mShouldReverseLayoutExpose) {
                i3 = 1;
            }
            c21684219tg4.LJI = i3;
            int position2 = getPosition(childClosestToStartExpose);
            C21684219tg c21684219tg5 = this.mLayoutState;
            c21684219tg4.LJFF = position2 + c21684219tg5.LJI;
            c21684219tg5.LIZLLL = this.mOrientationHelper.LIZLLL(childClosestToStartExpose) + computeAlignOffset(childClosestToStartExpose, false, false);
            iLJII = (-this.mLayoutState.LIZLLL) + this.mOrientationHelper.LJII();
        }
        C21684219tg c21684219tg6 = this.mLayoutState;
        c21684219tg6.LJ = i2;
        if (z) {
            c21684219tg6.LJ = i2 - iLJII;
        }
        c21684219tg6.LJIIIIZZ = iLJII;
    }
}
