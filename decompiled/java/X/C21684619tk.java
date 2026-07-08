package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx;

/* JADX INFO: renamed from: X.19tk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21684619tk extends AbstractC21684819tm {
    @Override // X.AbstractC21684819tm
    public final int LJ() {
        return this.LIZ.getHeight();
    }

    @Override // X.AbstractC21684819tm
    public final int LJFF() {
        return this.LIZ.getHeight() - this.LIZ.getPaddingBottom();
    }

    @Override // X.AbstractC21684819tm
    public final int LJI() {
        return this.LIZ.getPaddingBottom();
    }

    @Override // X.AbstractC21684819tm
    public final int LJII() {
        return this.LIZ.getPaddingTop();
    }

    @Override // X.AbstractC21684819tm
    public final int LJIIIIZZ() {
        return (this.LIZ.getHeight() - this.LIZ.getPaddingTop()) - this.LIZ.getPaddingBottom();
    }

    public C21684619tk(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        super(exposeLinearLayoutManagerEx);
    }

    @Override // X.AbstractC21684819tm
    public final int LIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!this.LIZ.isEnableMarginOverLap()) {
            return this.LIZ.getDecoratedBottom(view) + marginLayoutParams.bottomMargin;
        }
        return this.LIZ.getDecoratedBottom(view);
    }

    @Override // X.AbstractC21684819tm
    public final int LIZIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!this.LIZ.isEnableMarginOverLap()) {
            return this.LIZ.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return this.LIZ.getDecoratedMeasuredHeight(view);
    }

    @Override // X.AbstractC21684819tm
    public final int LIZJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC21684819tm
    public final int LIZLLL(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!this.LIZ.isEnableMarginOverLap()) {
            return this.LIZ.getDecoratedTop(view) - marginLayoutParams.topMargin;
        }
        return this.LIZ.getDecoratedTop(view);
    }

    @Override // X.AbstractC21684819tm
    public final void LJIIIZ(int i) {
        this.LIZ.offsetChildrenVertical(i);
    }
}
