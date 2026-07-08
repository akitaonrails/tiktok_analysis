package X;

/* JADX INFO: renamed from: X.1DDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252381DDw extends AbstractC2252411DDz<C2252331DDr<?>> {
    public long LIZ = -1;
    public C2252611DEt LIZIZ;

    @Override // X.AbstractC2252411DDz
    public final boolean LIZ(AbstractC2252361DDu abstractC2252361DDu) {
        C2252331DDr c2252331DDr = (C2252331DDr) abstractC2252361DDu;
        if (this.LIZ >= 0) {
            return false;
        }
        long j = c2252331DDr.LLJ;
        if (j < c2252331DDr.LLJI) {
            c2252331DDr.LLJI = j;
        }
        this.LIZ = j;
        return true;
    }

    @Override // X.AbstractC2252411DDz
    public final InterfaceC1364105Vn[] LIZIZ(AbstractC2252361DDu abstractC2252361DDu) {
        long j = this.LIZ;
        this.LIZ = -1L;
        this.LIZIZ = null;
        return ((C2252331DDr) abstractC2252361DDu).LJIJJ(j);
    }
}
