package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0674, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0674 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public String LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1086));
    public final C054G LIZLLL;
    public volatile C1598406Nq LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass0674.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AnonymousClass0674(String str) {
        this.LIZ = str;
        C1598406Nq c1598406Nq = this.LJ;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LJ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LJ = c1598406Nq;
                }
            }
        }
        this.LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }
}
