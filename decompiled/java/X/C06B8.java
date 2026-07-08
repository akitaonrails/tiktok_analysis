package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06B8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06B8 {
    public static final C06B8 LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C1DEV LIZLLL;
    public static final C054G LJ;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06B8.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06B8 c06b8 = new C06B8();
        LIZIZ = c06b8;
        LIZLLL = C2191201ApK.LIZ();
        C1598406Nq c1598406Nq = c06b8.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06b8) {
                c1598406Nq = c06b8.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06b8.LIZ = c1598406Nq;
                }
            }
        }
        LJ = C2296808zG.LIZ(c1598406Nq.LIZ);
    }

    public static void LIZ(C06BK c06bk, Function1 function1) {
        C23250099c.LIZLLL(LJ, null, null, new C06BI(c06bk, function1, null), 3);
    }
}
