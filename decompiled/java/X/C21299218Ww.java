package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21299218Ww extends ConstraintLayout implements C18X3<ConstraintLayout> {
    public boolean LL;
    public int LLILLJJLI;
    public Function1<? super Integer, Unit> LLILLL;
    public WindowInsets LLILZ;
    public AbstractC1776820wL2 LLILZIL;
    public C18X6 LLILZLL;

    @Override // X.C18X3
    public ConstraintLayout getContentContainer() {
        return this;
    }

    @Override // X.C18X3
    public /* bridge */ /* synthetic */ ViewGroup getContentContainer() {
        getContentContainer();
        return this;
    }

    public C18X6 getInsetsHandler() {
        return this.LLILZLL;
    }

    public AbstractC1776820wL2 getSizeMode() {
        return this.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsLIZIZ;
        int iLIZ;
        this.LLILZ = windowInsets;
        C18X6 insetsHandler = getInsetsHandler();
        if (insetsHandler == null || (windowInsetsLIZIZ = insetsHandler.LIZIZ(windowInsets)) == null) {
            windowInsetsLIZIZ = windowInsets;
        }
        C18X6 insetsHandler2 = getInsetsHandler();
        if (insetsHandler2 != null) {
            iLIZ = insetsHandler2.LIZ(windowInsets);
        } else {
            iLIZ = 0;
        }
        getContentContainer();
        int paddingLeft = getPaddingLeft();
        getContentContainer();
        int paddingRight = getPaddingRight();
        getContentContainer();
        setPadding(paddingLeft, iLIZ, paddingRight, getPaddingBottom());
        return super.dispatchApplyWindowInsets(windowInsetsLIZIZ);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        if (z) {
            return;
        }
        super.setFitsSystemWindows(z);
    }

    @Override // X.C18X3
    public void setInsetsHandler(C18X6 c18x6) {
        this.LLILZLL = c18x6;
        requestApplyInsets();
    }

    @Override // X.C18X3
    public void setOnContentHeightChangedListener(Function1<? super Integer, Unit> function1) {
        this.LLILLL = function1;
    }

    @Override // X.C18X3
    public void setSizeMode(AbstractC1776820wL2 abstractC1776820wL2) {
        this.LLILZIL = abstractC1776820wL2;
        requestLayout();
        this.LL = true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZ;
        int height;
        if (getHeight() == 0) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(ViewGroup.getDefaultSize(getSuggestedMinimumWidth(), i), ViewGroup.getDefaultSize(getSuggestedMinimumHeight(), i2));
        }
        if (this.LL && getHeight() != 0) {
            AbstractC1776820wL2 sizeMode = getSizeMode();
            if (sizeMode != null) {
                if (Intrinsics.LJFF(sizeMode, C1776830wL3.LIZ)) {
                    height = getHeight();
                } else {
                    int height2 = (int) (getHeight() * ((C1776810wL1) sizeMode).LIZ);
                    C18X6 insetsHandler = getInsetsHandler();
                    if (insetsHandler != null) {
                        iLIZ = insetsHandler.LIZ(this.LLILZ);
                    } else {
                        iLIZ = 0;
                    }
                    height = height2 + iLIZ;
                }
                this.LLILLJJLI = height;
                Function1<? super Integer, Unit> function1 = this.LLILLL;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(height));
                }
            }
            this.LL = false;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int height3 = getHeight() - getTop();
                int i4 = this.LLILLJJLI;
                if (height3 <= i4) {
                    height3 = i4;
                }
                measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(height3, 1073741824));
            }
        }
    }

    public C21299218Ww(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = true;
        this.LLILLJJLI = getHeight();
    }
}
