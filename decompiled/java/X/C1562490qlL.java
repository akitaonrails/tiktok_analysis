package X;

/* JADX INFO: renamed from: X.0qlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562490qlL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public volatile C1562460qlI LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1562490qlL.class, "initializer", "getInitializer()Ltiktok/arsenal/assem/wrapper/AssemInitializer;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final AbstractC1562510qlN LIZ() {
        C1562460qlI c1562460qlI = this.LIZ;
        if (c1562460qlI == null) {
            synchronized (this) {
                c1562460qlI = this.LIZ;
                if (c1562460qlI == null) {
                    C1562460qlI c1562460qlI2 = new C1562460qlI();
                    this.LIZ = c1562460qlI2;
                    return c1562460qlI2;
                }
            }
        }
        return c1562460qlI;
    }
}
