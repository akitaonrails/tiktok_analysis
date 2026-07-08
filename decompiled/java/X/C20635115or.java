package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20635115or extends AbstractC20634115oh {
    public C21679719sx LIZLLL;
    public C21679619sw LJ;

    private AbstractC21679819sy LJIIJ(RecyclerView.LayoutManager layoutManager) {
        C21679619sw c21679619sw = this.LJ;
        if (c21679619sw == null || c21679619sw.LIZ != layoutManager) {
            this.LJ = new C21679619sw(layoutManager);
        }
        return this.LJ;
    }

    private AbstractC21679819sy LJIIJJI(RecyclerView.LayoutManager layoutManager) {
        C21679719sx c21679719sx = this.LIZLLL;
        if (c21679719sx == null || c21679719sx.LIZ != layoutManager) {
            this.LIZLLL = new C21679719sx(layoutManager);
        }
        return this.LIZLLL;
    }

    @Override // X.AbstractC20634115oh
    public AbstractC21674019s2 LIZLLL(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof InterfaceC20634915op)) {
            return null;
        }
        return new C20748216Gy(this, this.LIZ.getContext(), 0);
    }

    @Override // X.AbstractC20634115oh
    public View LJFF(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return LJIIIZ(layoutManager, LJIIJJI(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return LJIIIZ(layoutManager, LJIIJ(layoutManager));
        }
        return null;
    }

    public static final int LJIIIIZZ(View view, AbstractC21679819sy abstractC21679819sy) {
        return (abstractC21679819sy.LJ(view) + (abstractC21679819sy.LIZJ(view) / 2)) - (abstractC21679819sy.LJIIJ() + (abstractC21679819sy.LJIIJJI() / 2));
    }

    public static final View LJIIIZ(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iLJIIJ = abstractC21679819sy.LJIIJ() + (abstractC21679819sy.LJIIJJI() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((abstractC21679819sy.LJ(childAt) + (abstractC21679819sy.LIZJ(childAt) / 2)) - iLJIIJ);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // X.AbstractC20634115oh
    public int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = LJIIIIZZ(view, LJIIJ(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = LJIIIIZZ(view, LJIIJJI(layoutManager));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035 A[PHI: r2 r3
      0x0035: PHI (r2v4 android.view.View) = (r2v1 android.view.View), (r2v5 android.view.View) binds: [B:14:0x002d, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r3v5 int) = (r3v1 int), (r3v6 int) binds: [B:14:0x002d, B:17:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC20634115oh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int LJI(androidx.recyclerview.widget.RecyclerView.LayoutManager r13, int r14, int r15) {
        /*
            r12 = this;
            int r6 = r13.getItemCount()
            r11 = -1
            if (r6 != 0) goto L8
            return r11
        L8:
            boolean r0 = r13.canScrollVertically()
            r8 = 0
            if (r0 == 0) goto L3c
            X.19sy r10 = r12.LJIIJJI(r13)
        L13:
            if (r10 == 0) goto L94
            int r9 = r13.getChildCount()
            r5 = 0
            r7 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r8
        L21:
            if (r7 >= r9) goto L47
            android.view.View r1 = r13.getChildAt(r7)
            if (r1 == 0) goto L39
            int r0 = LJIIIIZZ(r1, r10)
            if (r0 > 0) goto L35
            if (r0 <= r3) goto L33
            r2 = r1
            r3 = r0
        L33:
            if (r0 < 0) goto L39
        L35:
            if (r0 >= r4) goto L39
            r8 = r1
            r4 = r0
        L39:
            int r7 = r7 + 1
            goto L21
        L3c:
            boolean r0 = r13.canScrollHorizontally()
            if (r0 == 0) goto L94
            X.19sy r10 = r12.LJIIJ(r13)
            goto L13
        L47:
            boolean r0 = r13.canScrollHorizontally()
            r7 = 1
            if (r0 == 0) goto L58
            if (r14 <= 0) goto L5b
        L50:
            r4 = 1
            if (r8 == 0) goto L63
            int r0 = r13.getPosition(r8)
            return r0
        L58:
            if (r15 <= 0) goto L5b
            goto L50
        L5b:
            r4 = 0
            if (r2 == 0) goto L64
            int r0 = r13.getPosition(r2)
            return r0
        L63:
            r8 = r2
        L64:
            if (r8 != 0) goto L67
            return r11
        L67:
            int r3 = r13.getPosition(r8)
            int r1 = r13.getItemCount()
            boolean r0 = r13 instanceof X.InterfaceC20634915op
            if (r0 == 0) goto L8a
            X.15op r13 = (X.InterfaceC20634915op) r13
            int r1 = r1 - r7
            android.graphics.PointF r2 = r13.computeScrollVectorForPosition(r1)
            if (r2 == 0) goto L8a
            float r0 = r2.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L89
            float r0 = r2.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8a
        L89:
            r5 = 1
        L8a:
            if (r5 != r4) goto L8d
            r7 = -1
        L8d:
            int r3 = r3 + r7
            if (r3 < 0) goto L93
            if (r3 >= r6) goto L93
            return r3
        L93:
            return r11
        L94:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20635115or.LJI(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }
}
