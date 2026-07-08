package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0IfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472120IfK extends AbstractC1338480kw2 {
    public final RecyclerView LIZ;
    public final InterfaceC472130IfL LIZIZ;
    public final boolean LIZJ = true;
    public int LIZLLL = -1;
    public int LJ;

    public C472120IfK(RecyclerView recyclerView, InterfaceC472130IfL interfaceC472130IfL) {
        this.LIZ = recyclerView;
        this.LIZIZ = interfaceC472130IfL;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    @Override // X.AbstractC1338480kw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.LIZJ
            r2 = 0
            if (r0 == 0) goto L5a
            androidx.recyclerview.widget.RecyclerView r0 = r7.LIZ
            androidx.recyclerview.widget.RecyclerView$LayoutManager r6 = r0.getLayoutManager()
            boolean r0 = r6 instanceof androidx.recyclerview.widget.GridLayoutManager
            r5 = -1
            if (r0 == 0) goto L64
            r3 = r6
            androidx.recyclerview.widget.GridLayoutManager r3 = (androidx.recyclerview.widget.GridLayoutManager) r3
            int r1 = r3.findFirstVisibleItemPosition()
            int r4 = r3.findLastVisibleItemPosition()
            int r0 = r7.LIZLLL
            if (r0 != r5) goto L23
            int r0 = r3.LLILLJJLI
            r7.LIZLLL = r0
        L23:
            int r0 = r6.getChildCount()
            int r3 = r6.getItemCount()
            if (r0 <= 0) goto L5a
            android.view.View r0 = r6.findViewByPosition(r1)
            if (r0 == 0) goto L5a
            int r1 = r0.getHeight()
            if (r1 == 0) goto L5a
            int r0 = r7.LIZLLL
            if (r0 != r5) goto L5b
            int r0 = r7.LJ
            if (r0 <= 0) goto L43
            if (r0 <= r3) goto L46
        L43:
            r0 = 2
            r7.LJ = r0
        L46:
            int r9 = r9 / r1
            int r9 = r9 + r4
            int r0 = r7.LJ
            int r3 = r3 - r0
            if (r9 < r3) goto L5a
        L4d:
            X.0IfL r0 = r7.LIZIZ
            boolean r0 = r0.LJIIJJI()
            if (r0 == 0) goto L74
            X.0IfL r0 = r7.LIZIZ
            r0.preload()
        L5a:
            return r2
        L5b:
            int r3 = r3 / r0
            int r4 = r4 / r0
            int r9 = r9 / r1
            int r9 = r9 + r4
            int r0 = r9 + 3
            if (r0 < r3) goto L5a
            goto L4d
        L64:
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L7a
            r0 = r6
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.findFirstVisibleItemPosition()
            int r4 = r0.findLastVisibleItemPosition()
            goto L23
        L74:
            X.0IfL r0 = r7.LIZIZ
            r0.n2(r2)
            return r2
        L7a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Unsupported LayoutManager used"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C472120IfK.LIZ(int, int):boolean");
    }
}
