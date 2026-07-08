package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx;

/* JADX INFO: renamed from: X.19tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21684519tj extends AbstractC21684819tm {
    @Override // X.AbstractC21684819tm
    public final int LJ() {
        return this.LIZ.getWidth();
    }

    @Override // X.AbstractC21684819tm
    public final int LJFF() {
        return this.LIZ.getWidth() - this.LIZ.getPaddingRight();
    }

    @Override // X.AbstractC21684819tm
    public final int LJI() {
        return this.LIZ.getPaddingRight();
    }

    @Override // X.AbstractC21684819tm
    public final int LJII() {
        return this.LIZ.getPaddingLeft();
    }

    @Override // X.AbstractC21684819tm
    public final int LJIIIIZZ() {
        return (this.LIZ.getWidth() - this.LIZ.getPaddingLeft()) - this.LIZ.getPaddingRight();
    }

    public C21684519tj(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        super(exposeLinearLayoutManagerEx);
    }

    @Override // X.AbstractC21684819tm
    public final int LIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!this.LIZ.isEnableMarginOverLap()) {
            return this.LIZ.getDecoratedRight(view) + marginLayoutParams.rightMargin;
        }
        return this.LIZ.getDecoratedRight(view);
    }

    @Override // X.AbstractC21684819tm
    public final int LIZIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!this.LIZ.isEnableMarginOverLap()) {
            return this.LIZ.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return this.LIZ.getDecoratedMeasuredWidth(view);
    }

    @Override // X.AbstractC21684819tm
    public final int LIZJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.AbstractC21684819tm
    public final int LIZLLL(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!this.LIZ.isEnableMarginOverLap()) {
            return this.LIZ.getDecoratedLeft(view) - marginLayoutParams.leftMargin;
        }
        return this.LIZ.getDecoratedLeft(view);
    }

    @Override // X.AbstractC21684819tm
    public final void LJIIIZ(int i) {
        this.LIZ.offsetChildrenHorizontal(i);
    }
}
