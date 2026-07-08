package X;

/* JADX INFO: renamed from: X.06Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569406Cm {
    public static final C1569406Cm LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C1569606Co LIZLLL;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1569406Cm.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1569406Cm c1569406Cm = new C1569406Cm();
        LIZIZ = c1569406Cm;
        C1598406Nq c1598406Nq = c1569406Cm.LIZ;
        if (c1598406Nq == null) {
            synchronized (c1569406Cm) {
                c1598406Nq = c1569406Cm.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1569406Cm.LIZ = c1598406Nq;
                }
            }
        }
        C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LIZLLL = new C1569606Co(0);
    }

    public final void LIZ(C19EG c19eg, AbstractC1569806Cq abstractC1569806Cq) {
        C1598406Nq c1598406Nq = this.LIZ;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LIZ = c1598406Nq;
                }
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(c1598406Nq.LIZIZ), null, null, new C06I9(c19eg, abstractC1569806Cq, null), 3);
    }
}
