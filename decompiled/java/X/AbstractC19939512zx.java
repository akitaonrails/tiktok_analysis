package X;

/* JADX INFO: renamed from: X.12zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19939512zx {
    public volatile C199437131n LL;

    public abstract AnonymousClass1302 LJI();

    public abstract String LJII();

    public abstract String LJIIIZ();

    public abstract AbstractC19939512zx LJIIJ();

    public abstract InterfaceC19930912yZ LJIILJJIL();

    public void LJIILL() {
    }

    public final C199437131n LJFF() {
        if (this.LL == null && (LJI().LJIIZILJ() == C130B.EDITION_PROTO2 || LJI().LJIIZILJ() == C130B.EDITION_PROTO3)) {
            LJI().LJIJI();
        }
        if (this.LL != null) {
            return this.LL;
        }
        throw new NullPointerException(C786410Ut5.j4("Features not yet loaded for %s.", new Object[]{LJII()}));
    }

    public C199437131n LJIIJJI() {
        return C199437131n.getDefaultInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C199437131n r10) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19939512zx.LJIIL(X.131n):void");
    }
}
