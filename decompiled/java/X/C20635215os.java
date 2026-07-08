package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20635215os extends AbstractC20634815oo {
    public int LIZJ = 1;
    public int LIZLLL = 1;
    public C21679719sx LJ;
    public C21679619sw LJFF;

    @Override // X.AbstractC20634815oo
    public View LIZJ(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return LJFF(layoutManager, LJIIIIZZ(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return LJFF(layoutManager, LJII(layoutManager));
        }
        return null;
    }

    public final AbstractC21679819sy LJII(RecyclerView.LayoutManager layoutManager) {
        C21679619sw c21679619sw = this.LJFF;
        if (c21679619sw == null || c21679619sw.LIZ != layoutManager) {
            this.LJFF = new C21679619sw(layoutManager);
        }
        return this.LJFF;
    }

    public final AbstractC21679819sy LJIIIIZZ(RecyclerView.LayoutManager layoutManager) {
        C21679719sx c21679719sx = this.LJ;
        if (c21679719sx == null || c21679719sx.LIZ != layoutManager) {
            this.LJ = new C21679719sx(layoutManager);
        }
        return this.LJ;
    }

    public static final View LJFF(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        int iLJFF;
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager.getClipToPadding()) {
            iLJFF = abstractC21679819sy.LJIIJ() + (abstractC21679819sy.LJIIJJI() / 2);
        } else {
            iLJFF = abstractC21679819sy.LJFF() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((abstractC21679819sy.LJ(childAt) + (abstractC21679819sy.LIZJ(childAt) / 2)) - iLJFF);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    public static final View LJI(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iLJ = abstractC21679819sy.LJ(childAt);
            if (iLJ < i) {
                view = childAt;
                i = iLJ;
            }
        }
        return view;
    }

    @Override // X.AbstractC20634815oo
    public final int[] LIZIZ(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = LJ(layoutManager, view, LJII(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = LJ(layoutManager, view, LJIIIIZZ(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final int LJ(RecyclerView.LayoutManager layoutManager, View view, AbstractC21679819sy abstractC21679819sy) {
        int i;
        int iLJ;
        int i2;
        int iLJ2;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null) {
            return 0;
        }
        boolean zLIZJ = C444960Hcc.LIZJ(recyclerView.getContext());
        if (layoutManager.canScrollHorizontally()) {
            int width = this.LIZ.getWidth() / this.LIZLLL;
            int position = layoutManager.getPosition(view);
            int i3 = this.LIZJ;
            int i4 = this.LIZLLL;
            int i5 = position / (i3 * i4);
            int i6 = i4 * i3;
            int i7 = i5 * i6;
            if (zLIZJ) {
                i2 = ((i6 - (position - i7)) / i3) * width;
                iLJ2 = abstractC21679819sy.LIZIZ(view);
            } else {
                i2 = ((position - i7) / i3) * width;
                iLJ2 = abstractC21679819sy.LJ(view);
            }
            int i8 = iLJ2 - i2;
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
        if (zLIZJ) {
            i = ((i12 - (position2 - i13)) / i10) * height;
            iLJ = abstractC21679819sy.LIZIZ(view);
        } else {
            i = ((position2 - i13) / i10) * height;
            iLJ = abstractC21679819sy.LJ(view);
        }
        int i14 = iLJ - i;
        if (i14 <= 5 && i14 >= -5) {
            return 0;
        }
        return i14;
    }
}
