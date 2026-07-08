package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.05nK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1458405nK implements InterfaceC497601wk {
    public static final C1458405nK LLILLJJLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final AbstractC2252651DEx LLILZ;
    public volatile C1598406Nq LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1458405nK.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1458405nK c1458405nK = new C1458405nK();
        LLILLJJLI = c1458405nK;
        C1598406Nq c1598406Nq = c1458405nK.LL;
        if (c1598406Nq == null) {
            synchronized (c1458405nK) {
                c1598406Nq = c1458405nK.LL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1458405nK.LL = c1598406Nq;
                }
            }
        }
        LLILZ = c1598406Nq.LIZ;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return LLILZ;
    }
}
