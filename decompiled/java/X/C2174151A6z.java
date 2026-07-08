package X;

/* JADX INFO: renamed from: X.1A6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174151A6z {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public volatile C1571910r0X LIZ;
    public volatile C19370710qP LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2174151A6z.class, "panelManager", "getPanelManager()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/panel/IMEditFeaturePanelManager;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C2174151A6z.class, "visibilityPartyManager", "getVisibilityPartyManager()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/visibility/IMEditVisibilityPartyManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C2174151A6z.class, "product", "getProduct()Lcom/ss/android/ugc/aweme/im/creative/edit/impl/panel/IMEditVisibilityCommKnitComponent;", 0);
        c09r3.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final C19370710qP LIZ() {
        C19370710qP c19370710qP = this.LIZIZ;
        if (c19370710qP == null) {
            synchronized (this) {
                c19370710qP = this.LIZIZ;
                if (c19370710qP == null) {
                    C19370710qP c19370710qP2 = new C19370710qP();
                    this.LIZIZ = c19370710qP2;
                    return c19370710qP2;
                }
            }
        }
        return c19370710qP;
    }
}
