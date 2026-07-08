package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;

/* JADX INFO: renamed from: X.0Yc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877750Yc1 extends AbstractC880120Yfq {
    public final boolean LLJ;
    public final int LLJI;
    public final int LLJIJIL;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C877740Yc0(this, null), 3);
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        C878950Ydx c878950Ydx;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        FilterTabType filterTabType = null;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
            filterTabType = c878950Ydx.LLILLL;
        }
        return filterTabType == FilterTabType.SPAM || AbstractC880120Yfq.LJII(this.LLILZ);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C877750Yc1(android.app.Activity r3, X.C879540Yeu r4, X.C878950Ydx r5) {
        /*
            r2 = this;
            r2.<init>(r3, r4, r5)
            X.0Y8T r0 = r2.LLILZ
            if (r0 == 0) goto L27
            boolean r0 = r0.isStickTop()
            r1 = 1
            if (r0 != r1) goto L27
        Le:
            r2.LLJ = r1
            if (r1 == 0) goto L23
            r0 = 2131836100(0x7f113cc4, float:1.9305357E38)
        L15:
            r2.LLJI = r0
            if (r1 == 0) goto L1f
            r0 = 2130774476(0x7f0109cc, float:1.7152128E38)
        L1c:
            r2.LLJIJIL = r0
            return
        L1f:
            r0 = 2130774473(0x7f0109c9, float:1.7152122E38)
            goto L1c
        L23:
            r0 = 2131836094(0x7f113cbe, float:1.9305345E38)
            goto L15
        L27:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C877750Yc1.<init>(android.app.Activity, X.0Yeu, X.0Ydx):void");
    }
}
