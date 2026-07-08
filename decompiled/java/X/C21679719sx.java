package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21679719sx extends AbstractC21679819sy {
    @Override // X.AbstractC21679819sy
    public final int LJFF() {
        return this.LIZ.getHeight();
    }

    @Override // X.AbstractC21679819sy
    public final int LJI() {
        return this.LIZ.getHeight() - this.LIZ.getPaddingBottom();
    }

    @Override // X.AbstractC21679819sy
    public final int LJII() {
        return this.LIZ.getPaddingBottom();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIIIZZ() {
        return this.LIZ.getHeightMode();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIIZ() {
        return this.LIZ.getWidthMode();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIJ() {
        return this.LIZ.getPaddingTop();
    }

    @Override // X.AbstractC21679819sy
    public final int LJIIJJI() {
        return (this.LIZ.getHeight() - this.LIZ.getPaddingTop()) - this.LIZ.getPaddingBottom();
    }

    public C21679719sx(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // X.AbstractC21679819sy
    public final int LIZIZ(View view) {
        return this.LIZ.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LIZJ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LIZLLL(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return this.LIZ.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LJ(View view) {
        return this.LIZ.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // X.AbstractC21679819sy
    public final int LJIILIIL(View view) {
        this.LIZ.getTransformedBoundingBox(view, true, this.LIZJ);
        return this.LIZJ.bottom;
    }

    @Override // X.AbstractC21679819sy
    public final int LJIILJJIL(View view) {
        this.LIZ.getTransformedBoundingBox(view, true, this.LIZJ);
        return this.LIZJ.top;
    }

    @Override // X.AbstractC21679819sy
    public final void LJIILL(int i) {
        this.LIZ.offsetChildrenVertical(i);
    }
}
