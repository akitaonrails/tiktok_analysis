package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05nR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1459105nR {
    public static final C1459105nR LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public static final ConcurrentHashMap<String, C066H> LJ;
    public static final C1231704rr LJFF;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1459105nR.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1459105nR c1459105nR = new C1459105nR();
        LIZIZ = c1459105nR;
        C1598406Nq c1598406Nq = c1459105nR.LIZ;
        if (c1598406Nq == null) {
            synchronized (c1459105nR) {
                c1598406Nq = c1459105nR.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1459105nR.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJ = new ConcurrentHashMap<>();
        LJFF = new C1231704rr("LynxPanelDelayMonitor", null, 6);
    }
}
