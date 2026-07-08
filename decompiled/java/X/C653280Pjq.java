package X;

import Y.AsS37S0100000_10;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Pjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653280Pjq extends C653200Pji {
    public boolean LIZLLL;
    public int LJ;
    public final C01GW LJFF;

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.C653200Pji, X.InterfaceC653170Pjf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ() {
        /*
            r6 = this;
            X.01GW r0 = r6.LJFF
            java.lang.Object r0 = r0.getValue()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L3e
            int r3 = r0.findFirstCompletelyVisibleItemPosition()
            int r2 = r0.findLastCompletelyVisibleItemPosition()
            androidx.recyclerview.widget.RecyclerView r0 = r6.LIZ
            X.19ry r0 = r0.getAdapter()
            if (r0 == 0) goto L3c
            int r1 = r0.getItemCount()
        L20:
            int r1 = r1 - r5
            r0 = -1
            if (r2 == r0) goto L3e
            if (r2 != r1) goto L3e
            if (r2 != r3) goto L3e
            r2 = 1
        L29:
            boolean r0 = super.LIZIZ()
            if (r0 == 0) goto L43
            boolean r1 = r6.LIZLLL
            int r0 = r6.LJ
            r6.LIZLLL = r4
            r6.LJ = r4
            if (r1 == 0) goto L40
            if (r0 != 0) goto L40
            return r5
        L3c:
            r1 = 0
            goto L20
        L3e:
            r2 = 0
            goto L29
        L40:
            if (r2 == 0) goto L43
            return r5
        L43:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C653280Pjq.LIZIZ():boolean");
    }

    public C653280Pjq(RecyclerView recyclerView) {
        super(recyclerView);
        this.LJFF = C452501pT.LIZIZ(new AwS554S0100000_10(recyclerView, 972));
        recyclerView.addOnScrollListener(new AsS37S0100000_10(this, 11));
    }
}
