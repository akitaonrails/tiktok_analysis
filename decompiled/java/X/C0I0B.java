package X;

/* JADX INFO: renamed from: X.0I0B, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I0B {
    public static final C0I0B LJFF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJI;
    public volatile C1400340mXo LIZ;
    public volatile C1566106Bf LIZIZ;
    public volatile C0I0C LIZJ;
    public volatile C0I0A LIZLLL;
    public volatile C894660Z7w LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I0B.class, "accountService", "getAccountService()Lcom/ss/android/ugc/aweme/im/saas/host/api/baseruntime/IAccountService;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0I0B.class, "networkService", "getNetworkService()Lcom/ss/android/ugc/aweme/im/saas/host/api/baseruntime/INetworkService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0I0B.class, "eventTrackingService", "getEventTrackingService()Lcom/ss/android/ugc/aweme/im/saas/host/api/baseruntime/analytics/IEventTrackingService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0I0B.class, "routerService", "getRouterService()Lcom/ss/android/ugc/aweme/im/saas/host/api/baseruntime/IRouterService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0I0B.class, "settingService", "getSettingService()Lcom/ss/android/ugc/aweme/im/saas/host/api/baseruntime/ISettingService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0I0B.class, "hostService", "getHostService()Lcom/ss/android/ugc/aweme/im/saas/host/api/baseruntime/IHostService;", 0);
        c09r3.getClass();
        LJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LJFF = new C0I0B();
    }

    public final InterfaceC461710I8r LIZ() {
        C1400340mXo c1400340mXo = this.LIZ;
        if (c1400340mXo == null) {
            synchronized (this) {
                c1400340mXo = this.LIZ;
                if (c1400340mXo == null) {
                    C1400340mXo c1400340mXo2 = new C1400340mXo();
                    this.LIZ = c1400340mXo2;
                    return c1400340mXo2;
                }
            }
        }
        return c1400340mXo;
    }

    public final InterfaceC1493505sz LIZIZ() {
        C0I0C c0i0c = this.LIZJ;
        if (c0i0c == null) {
            synchronized (this) {
                c0i0c = this.LIZJ;
                if (c0i0c == null) {
                    C0I0C c0i0c2 = new C0I0C();
                    this.LIZJ = c0i0c2;
                    return c0i0c2;
                }
            }
        }
        return c0i0c;
    }

    public final InterfaceC1507105vB LIZJ() {
        C894660Z7w c894660Z7w = this.LJ;
        if (c894660Z7w == null) {
            synchronized (this) {
                c894660Z7w = this.LJ;
                if (c894660Z7w == null) {
                    C894660Z7w c894660Z7w2 = new C894660Z7w();
                    this.LJ = c894660Z7w2;
                    return c894660Z7w2;
                }
            }
        }
        return c894660Z7w;
    }

    public final C057E LIZLLL() {
        C1566106Bf c1566106Bf = this.LIZIZ;
        if (c1566106Bf == null) {
            synchronized (this) {
                c1566106Bf = this.LIZIZ;
                if (c1566106Bf == null) {
                    C1566106Bf c1566106Bf2 = new C1566106Bf();
                    this.LIZIZ = c1566106Bf2;
                    return c1566106Bf2;
                }
            }
        }
        return c1566106Bf;
    }
}
