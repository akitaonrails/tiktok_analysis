package X;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21683819tc extends AbstractC1144210fsh {
    public int LIZJ = 1;
    public int LIZLLL = 1;
    public C21684019te LJ;
    public C21683919td LJFF;

    @Override // X.AbstractC1144210fsh
    public View LIZLLL(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return LJII(layoutManager, LJIIJ(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return LJII(layoutManager, LJIIIZ(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19td] */
    public final AbstractC21684119tf LJIIIZ(final RecyclerView.LayoutManager layoutManager) {
        C21683919td c21683919td = this.LJFF;
        if (c21683919td == null || c21683919td.LIZ != layoutManager) {
            this.LJFF = new AbstractC21684119tf(layoutManager) { // from class: X.19td
                @Override // X.AbstractC21684119tf
                public final int LIZLLL() {
                    return this.LIZ.getWidth();
                }

                @Override // X.AbstractC21684119tf
                public final int LJ() {
                    return this.LIZ.getPaddingLeft();
                }

                @Override // X.AbstractC21684119tf
                public final int LJFF() {
                    return (this.LIZ.getWidth() - this.LIZ.getPaddingLeft()) - this.LIZ.getPaddingRight();
                }

                @Override // X.AbstractC21684119tf
                public final int LIZ(View view) {
                    return this.LIZ.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
                }

                @Override // X.AbstractC21684119tf
                public final int LIZIZ(View view) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    return this.LIZ.getDecoratedMeasuredWidth(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }

                @Override // X.AbstractC21684119tf
                public final int LIZJ(View view) {
                    return this.LIZ.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
                }
            };
        }
        return this.LJFF;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19te] */
    public final AbstractC21684119tf LJIIJ(final RecyclerView.LayoutManager layoutManager) {
        C21684019te c21684019te = this.LJ;
        if (c21684019te == null || c21684019te.LIZ != layoutManager) {
            this.LJ = new AbstractC21684119tf(layoutManager) { // from class: X.19te
                @Override // X.AbstractC21684119tf
                public final int LIZLLL() {
                    return this.LIZ.getHeight();
                }

                @Override // X.AbstractC21684119tf
                public final int LJ() {
                    return this.LIZ.getPaddingTop();
                }

                @Override // X.AbstractC21684119tf
                public final int LJFF() {
                    return (this.LIZ.getHeight() - this.LIZ.getPaddingTop()) - this.LIZ.getPaddingBottom();
                }

                @Override // X.AbstractC21684119tf
                public final int LIZ(View view) {
                    return this.LIZ.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
                }

                @Override // X.AbstractC21684119tf
                public final int LIZIZ(View view) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    return this.LIZ.getDecoratedMeasuredHeight(view) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }

                @Override // X.AbstractC21684119tf
                public final int LIZJ(View view) {
                    return this.LIZ.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
                }
            };
        }
        return this.LJ;
    }

    public static View LJII(RecyclerView.LayoutManager layoutManager, AbstractC21684119tf abstractC21684119tf) {
        int iLIZLLL;
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager.getClipToPadding()) {
            iLIZLLL = abstractC21684119tf.LJ() + (abstractC21684119tf.LJFF() / 2);
        } else {
            iLIZLLL = abstractC21684119tf.LIZLLL() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((abstractC21684119tf.LIZJ(childAt) + (abstractC21684119tf.LIZIZ(childAt) / 2)) - iLIZLLL);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public static View LJIIIIZZ(RecyclerView.LayoutManager layoutManager, AbstractC21684119tf abstractC21684119tf) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iLIZJ = abstractC21684119tf.LIZJ(childAt);
            if (iLIZJ < i) {
                view = childAt;
                i = iLIZJ;
            }
        }
        return view;
    }

    @Override // X.AbstractC1144210fsh
    public final int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = LJI(layoutManager, view, LJIIIZ(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = LJI(layoutManager, view, LJIIJ(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1144210fsh
    public int LJ(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View viewLJIIIIZZ;
        int position;
        boolean z;
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        if (layoutManager.canScrollVertically()) {
            viewLJIIIIZZ = LJIIIIZZ(layoutManager, LJIIJ(layoutManager));
        } else {
            if (layoutManager.canScrollHorizontally()) {
                viewLJIIIIZZ = LJIIIIZZ(layoutManager, LJIIIZ(layoutManager));
            }
            return -1;
        }
        if (viewLJIIIIZZ == null || (position = layoutManager.getPosition(viewLJIIIIZZ)) == -1) {
            return -1;
        }
        boolean z2 = false;
        if (!layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((layoutManager instanceof InterfaceC20634915op) && (pointFComputeScrollVectorForPosition = ((InterfaceC20634915op) layoutManager).computeScrollVectorForPosition(itemCount - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
            z2 = true;
        }
        int i3 = this.LIZJ;
        int i4 = this.LIZLLL;
        int i5 = position / (i3 * i4);
        int i6 = i3 * i4;
        int i7 = i5 * i6;
        if (z2) {
            if (z) {
                return i7 - 2;
            }
            return i7;
        }
        int i8 = i7 + i6;
        if (z) {
            return i8;
        }
        return i8 - 1;
    }

    public final int LJI(RecyclerView.LayoutManager layoutManager, View view, AbstractC21684119tf abstractC21684119tf) {
        int i;
        int iLIZJ;
        int i2;
        int iLIZJ2;
        if (this.LIZ == null) {
            return 0;
        }
        boolean zLJJ = C497740JfY.LJJ();
        if (layoutManager.canScrollHorizontally()) {
            int width = this.LIZ.getWidth() / this.LIZLLL;
            int position = layoutManager.getPosition(view);
            int i3 = this.LIZJ;
            int i4 = this.LIZLLL;
            int i5 = position / (i3 * i4);
            int i6 = i4 * i3;
            int i7 = i5 * i6;
            if (zLJJ) {
                i2 = ((i6 - (position - i7)) / i3) * width;
                iLIZJ2 = abstractC21684119tf.LIZ(view);
            } else {
                i2 = ((position - i7) / i3) * width;
                iLIZJ2 = abstractC21684119tf.LIZJ(view);
            }
            int i8 = iLIZJ2 - i2;
            if (i8 <= 5 && i8 >= -5) {
                return 0;
            }
            return i8;
        }
        int height = this.LIZ.getHeight() / this.LIZJ;
        int position2 = layoutManager.getPosition(view);
        int i9 = this.LIZJ;
        int i10 = this.LIZLLL;
        int i11 = position2 / (i9 * i10);
        int i12 = i9 * i10;
        int i13 = i11 * i12;
        if (zLJJ) {
            i = ((i12 - (position2 - i13)) / i10) * height;
            iLIZJ = abstractC21684119tf.LIZ(view);
        } else {
            i = ((position2 - i13) / i10) * height;
            iLIZJ = abstractC21684119tf.LIZJ(view);
        }
        int i14 = iLIZJ - i;
        if (i14 <= 5 && i14 >= -5) {
            return 0;
        }
        return i14;
    }
}
