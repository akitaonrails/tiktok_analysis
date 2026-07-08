package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20635415ou extends C20635115or {
    public C1313030kGz LJFF;
    public RecyclerView LJI;
    public double LJII = 0.5d;
    public int LJIIIIZZ;
    public C21679719sx LJIIIZ;
    public C21679619sw LJIIJ;

    @Override // X.AbstractC20634115oh
    public final void LIZIZ(RecyclerView recyclerView) {
        super.LIZIZ(recyclerView);
        this.LJI = recyclerView;
    }

    @Override // X.C20635115or, X.AbstractC20634115oh
    public final View LJFF(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return LJIILIIL(layoutManager, LJIIJJI(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return LJIILIIL(layoutManager, LJIIJ(layoutManager));
        }
        return null;
    }

    public final AbstractC21679819sy LJIIJ(RecyclerView.LayoutManager layoutManager) {
        C21679619sw c21679619sw = this.LJIIJ;
        if (c21679619sw == null || c21679619sw.LIZ != layoutManager) {
            this.LJIIJ = new C21679619sw(layoutManager);
        }
        return this.LJIIJ;
    }

    public final AbstractC21679819sy LJIIJJI(RecyclerView.LayoutManager layoutManager) {
        C21679719sx c21679719sx = this.LJIIIZ;
        if (c21679719sx == null || c21679719sx.LIZ != layoutManager) {
            this.LJIIIZ = new C21679719sx(layoutManager);
        }
        return this.LJIIIZ;
    }

    @Override // X.C20635115or, X.AbstractC20634115oh
    public final int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = LJIIL(layoutManager, view, LJIIJ(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = LJIIL(layoutManager, view, LJIIJJI(layoutManager));
        } else {
            iArr[1] = 0;
        }
        if (this.LJI != null) {
            this.LJFF.LIZ(layoutManager.getPosition(view), this.LJI.getScrollX(), this.LJI.getScrollY(), iArr[0], iArr[1]);
        }
        return iArr;
    }

    public final View LJIILIIL(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        double dLJFF;
        int i;
        View view = null;
        if (this.LJI == null) {
            return null;
        }
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            this.LJFF.LIZ(-1, this.LJI.getScrollX(), this.LJI.getScrollY(), this.LJI.getScrollX(), this.LJI.getScrollY());
            return null;
        }
        if (layoutManager.getClipToPadding()) {
            dLJFF = ((double) abstractC21679819sy.LJIIJ()) + (((double) abstractC21679819sy.LJIIJJI()) * this.LJII);
            i = this.LJIIIIZZ;
        } else {
            dLJFF = ((double) abstractC21679819sy.LJFF()) * this.LJII;
            i = this.LJIIIIZZ;
        }
        int i2 = (int) (dLJFF + ((double) i));
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = layoutManager.getChildAt(i4);
            int iAbs = Math.abs(((int) ((((double) abstractC21679819sy.LJ(childAt)) + (((double) abstractC21679819sy.LIZJ(childAt)) * this.LJII)) + ((double) this.LJIIIIZZ))) - i2);
            if (iAbs < i3) {
                view = childAt;
                i3 = iAbs;
            }
        }
        if (view == null) {
            this.LJFF.LIZ(-1, this.LJI.getScrollX(), this.LJI.getScrollY(), this.LJI.getScrollX(), this.LJI.getScrollY());
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[PHI: r2 r3
      0x0059: PHI (r2v6 int) = (r2v1 int), (r2v7 int) binds: [B:17:0x0051, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r3v3 android.view.View) = (r3v1 android.view.View), (r3v4 android.view.View) binds: [B:17:0x0051, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C20635115or, X.AbstractC20634115oh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(androidx.recyclerview.widget.RecyclerView.LayoutManager r19, int r20, int r21) {
        /*
            r18 = this;
            r8 = r18
            androidx.recyclerview.widget.RecyclerView r0 = r8.LJI
            r13 = -1
            if (r0 != 0) goto L8
            return r13
        L8:
            r9 = r19
            int r7 = r9.getItemCount()
            if (r7 != 0) goto L2e
            X.0kGz r12 = r8.LJFF
            androidx.recyclerview.widget.RecyclerView r0 = r8.LJI
            int r14 = r0.getScrollX()
            androidx.recyclerview.widget.RecyclerView r0 = r8.LJI
            int r15 = r0.getScrollY()
            androidx.recyclerview.widget.RecyclerView r0 = r8.LJI
            int r16 = r0.getScrollX()
            androidx.recyclerview.widget.RecyclerView r0 = r8.LJI
            int r17 = r0.getScrollY()
            r12.LIZ(r13, r14, r15, r16, r17)
            return r13
        L2e:
            boolean r0 = r9.canScrollVertically()
            if (r0 == 0) goto L60
            X.19sy r12 = r8.LJIIJJI(r9)
        L38:
            int r11 = r9.getChildCount()
            r6 = 0
            r5 = 0
            r10 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r6
        L45:
            if (r10 >= r11) goto L65
            android.view.View r1 = r9.getChildAt(r10)
            if (r1 == 0) goto L5d
            int r0 = r8.LJIIL(r9, r1, r12)
            if (r0 > 0) goto L59
            if (r0 <= r2) goto L57
            r3 = r1
            r2 = r0
        L57:
            if (r0 < 0) goto L5d
        L59:
            if (r0 >= r4) goto L5d
            r6 = r1
            r4 = r0
        L5d:
            int r10 = r10 + 1
            goto L45
        L60:
            X.19sy r12 = r8.LJIIJ(r9)
            goto L38
        L65:
            boolean r0 = r9.canScrollHorizontally()
            r2 = 1
            if (r0 == 0) goto L76
            if (r20 < 0) goto L79
        L6e:
            r1 = 1
            if (r6 == 0) goto L81
            int r0 = r9.getPosition(r6)
            return r0
        L76:
            if (r21 < 0) goto L79
            goto L6e
        L79:
            r1 = 0
            if (r3 == 0) goto L82
            int r0 = r9.getPosition(r3)
            return r0
        L81:
            r6 = r3
        L82:
            if (r6 != 0) goto L85
            return r13
        L85:
            int r0 = r9.getPosition(r6)
            if (r1 != 0) goto L8c
            r2 = -1
        L8c:
            int r0 = r0 + r2
            if (r0 < 0) goto L90
            r5 = r0
        L90:
            if (r5 < r7) goto L93
            return r13
        L93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20635415ou.LJI(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }

    public final int LJIIL(RecyclerView.LayoutManager layoutManager, View view, AbstractC21679819sy abstractC21679819sy) {
        double dLJFF;
        int i;
        int iLJ = (int) (((double) abstractC21679819sy.LJ(view)) + (((double) abstractC21679819sy.LIZJ(view)) * this.LJII) + ((double) this.LJIIIIZZ));
        if (layoutManager.getClipToPadding()) {
            dLJFF = ((double) abstractC21679819sy.LJIIJ()) + (((double) abstractC21679819sy.LJIIJJI()) * this.LJII);
            i = this.LJIIIIZZ;
        } else {
            dLJFF = ((double) abstractC21679819sy.LJFF()) * this.LJII;
            i = this.LJIIIIZZ;
        }
        return iLJ - ((int) (dLJFF + ((double) i)));
    }
}
