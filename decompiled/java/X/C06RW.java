package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.06RW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06RW {
    public static final C06RW LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C054G LIZLLL;
    public static final AtomicBoolean LJ;
    public volatile C1598406Nq LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06RW.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C06RW c06rw = new C06RW();
        LIZIZ = c06rw;
        C1598406Nq c1598406Nq = c06rw.LIZ;
        if (c1598406Nq == null) {
            synchronized (c06rw) {
                c1598406Nq = c06rw.LIZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c06rw.LIZ = c1598406Nq;
                }
            }
        }
        LIZLLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LJ = new AtomicBoolean(true);
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.06RX
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        C06RW.LJ.set(true);
                    }
                }
            }
        });
    }

    public static void LIZ(C06RW c06rw, C06RR c06rr) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c06rw.getClass();
        C23250099c.LIZLLL(LIZLLL, null, null, new C06RV(interfaceC1493505szLIZIZ, c06rr, null), 3);
    }
}
