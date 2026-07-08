package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21679619sw extends AbstractC21679819sy {
    @Override // X.AbstractC21679819sy
    public final int LJFF() {
        return this.LIZ.getWidth();
    }

    @Override // X.AbstractC21679819sy
    public final int LJI() {
        return this.LIZ.getWidth() - this.LIZ.getPaddingRight();
    }

    @Override // X.AbstractC21679819sy
    public final int LJII() {
        return this.LIZ.getPaddingRight();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIIIZZ() {
        return this.LIZ.getWidthMode();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIIZ() {
        return this.LIZ.getHeightMode();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIJ() {
        return this.LIZ.getPaddingLeft();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIJJI() {
        return (this.LIZ.getWidth() - this.LIZ.getPaddingLeft()) - this.LIZ.getPaddingRight();
    }

    public C21679619sw(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // X.AbstractC21679819sy
    public final int LIZIZ(View view) {
        return this.LIZ.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LIZJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LIZLLL(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LJ(View view) {
        return this.LIZ.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LJIILIIL(View view) {
        this.LIZ.getTransformedBoundingBox(view, true, this.LIZJ);
        return this.LIZJ.right;
    }

    @Override // X.AbstractC21679819sy
    public final int LJIILJJIL(View view) {
        this.LIZ.getTransformedBoundingBox(view, true, this.LIZJ);
        return this.LIZJ.left;
    }

    @Override // X.AbstractC21679819sy
    public final void LJIILL(int i) {
        this.LIZ.offsetChildrenHorizontal(i);
    }
}
