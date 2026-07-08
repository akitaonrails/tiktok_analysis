package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1608106Rj {
    public static final C1608106Rj LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final ConcurrentHashMap<C1608206Rk, String> LIZLLL;
    public static final ConcurrentHashMap<C1608206Rk, AnonymousClass0957<Unit>> LJ;
    public static final C01GW LJFF;
    public static final C054G LJI;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1608106Rj.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1608106Rj c1608106Rj = new C1608106Rj();
        LIZIZ = c1608106Rj;
        LIZLLL = new ConcurrentHashMap<>();
        LJ = new ConcurrentHashMap<>();
        LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1286));
        C1598406Nq c1598406Nq = c1608106Rj.LIZ;
        if (c1598406Nq == null) {
            synchronized (c1608106Rj) {
                c1598406Nq = c1608106Rj.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1608106Rj.LIZ = c1598406Nq;
                }
            }
        }
        LJI = C2296808zG.LIZ(c1598406Nq.LIZ);
    }
}
