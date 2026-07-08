package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.util.List;
import kotlin.jvm.functions.Function2;
import u4.q0;

/* JADX INFO: renamed from: X.0txV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685350txV extends AbstractC20085213iM implements InterfaceC1670680tZq, C0TVI {
    public final Window LLJ;
    public final C05P0 LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.AbstractC20085213iM
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1670680tZq
    public final Window getWindow() {
        return this.LLJ;
    }

    public C1685350txV(Context context, Window window) {
        super(context, null, 6, 0);
        this.LLJ = window;
        this.LLJI = C20028913Yh.LJI(C1685370txX.LIZ);
        C14K9.LJIJJ(this, this);
        q0.LJJII(this, new C14JJ() { // from class: X.0txW
            {
                super(1);
            }

            @Override // X.C14JJ
            public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
                C1685350txV c1685350txV = this.LLILLL;
                if (!c1685350txV.LLJILJIL) {
                    View childAt = c1685350txV.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, c1685350txV.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, c1685350txV.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return c20246014Ju.LIZ.LJIILIIL(iMax, iMax2, iMax3, iMax4);
                    }
                }
                return c20246014Ju;
            }

            @Override // X.C14JJ
            public final C14JL LIZLLL(C14JM c14jm, C14JL c14jl) {
                C1685350txV c1685350txV = this.LLILLL;
                if (!c1685350txV.LLJILJIL) {
                    View childAt = c1685350txV.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, c1685350txV.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, c1685350txV.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        C20244914Jj c20244914JjLIZIZ = C20244914Jj.LIZIZ(iMax, iMax2, iMax3, iMax4);
                        c14jl.getClass();
                        return new C14JL(C20246014Ju.LJI(c14jl.LIZ, c20244914JjLIZIZ.LIZ, c20244914JjLIZIZ.LIZIZ, c20244914JjLIZIZ.LIZJ, c20244914JjLIZIZ.LIZLLL), C20246014Ju.LJI(c14jl.LIZIZ, c20244914JjLIZIZ.LIZ, c20244914JjLIZIZ.LIZIZ, c20244914JjLIZIZ.LIZJ, c20244914JjLIZIZ.LIZLLL));
                    }
                }
                return c14jl;
            }
        });
    }

    @Override // X.AbstractC20085213iM
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        interfaceC1680500tpg.LJJIIJZLJL(1735448596);
        ((Function2) ((C13FE) this.LLJI).getValue()).invoke(interfaceC1680500tpg, 0);
        interfaceC1680500tpg.LJ();
    }

    @Override // X.AbstractC20085213iM
    public final void LJI(int i, int i2) {
        int i3;
        int iMin;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.LJI(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE && !this.LLJIJIL && !this.LLJILJIL && this.LLJ.getAttributes().height == -2) {
            i3 = size2 + 1;
        } else {
            i3 = size2;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = size - paddingLeft;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = i3 - paddingTop;
        if (i6 >= 0) {
            i4 = i6;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingLeft;
            }
        } else {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                iMin = childAt.getMeasuredHeight() + paddingTop;
            } else {
                iMin = size2;
            }
        } else {
            iMin = Math.min(size2, childAt.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, iMin);
        if (!this.LLJIJIL && !this.LLJILJIL && childAt.getMeasuredHeight() + paddingTop > size2 && this.LLJ.getAttributes().height == -2) {
            this.LLJ.setLayout(-1, -1);
        }
    }

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        if (!this.LLJILJIL) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return c20246014Ju.LIZ.LJIILIIL(iMax, iMax2, iMax3, iMax4);
            }
        }
        return c20246014Ju;
    }

    @Override // X.AbstractC20085213iM
    public final void LJFF(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + ((((i3 - i) - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + ((((i4 - i2) - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }
}
