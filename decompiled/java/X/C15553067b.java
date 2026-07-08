package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.067b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15553067b {
    public static final C15553067b LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final C01GW LIZLLL;
    public static final AtomicBoolean LJ;
    public static final C1DEV LJFF;
    public volatile C09U0 LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C15553067b.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        C15553067b c15553067b = new C15553067b();
        LIZIZ = c15553067b;
        C09U0 c09u0 = c15553067b.LIZ;
        if (c09u0 == null) {
            synchronized (c15553067b) {
                c09u0 = c15553067b.LIZ;
                if (c09u0 == null) {
                    c09u0 = (C09U0) C1807670x8n.p();
                    c15553067b.LIZ = c09u0;
                }
            }
        }
        C2296808zG.LIZ(c09u0.LIZ);
        LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1214));
        LJ = new AtomicBoolean(true);
        LJFF = C2191201ApK.LIZ();
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.067d
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                C15553067b.LIZIZ.getClass();
                                ((Keva) C15553067b.LIZLLL.getValue()).clear();
                                return;
                            }
                            return;
                        }
                        C15553067b c15553067b2 = C15553067b.LIZIZ;
                        int status = EnumC15554067c.APP_STATUS_NEW_LOGIN.getStatus();
                        c15553067b2.getClass();
                        ((Keva) C15553067b.LIZLLL.getValue()).storeInt("app_status", status);
                        return;
                    }
                    C15553067b c15553067b3 = C15553067b.LIZIZ;
                    int status2 = EnumC15554067c.APP_STATUS_NEW_LOGIN.getStatus();
                    c15553067b3.getClass();
                    ((Keva) C15553067b.LIZLLL.getValue()).storeInt("app_status", status2);
                }
            }
        });
    }

    public static int LIZ() {
        return LJ.compareAndSet(true, false) ? EnumC15554067c.APP_STATUS_COLD_START.getStatus() : ((Keva) LIZLLL.getValue()).getInt("app_status", EnumC15554067c.APP_STATUS_UNKNOWN.getStatus());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C15552067a
            if (r0 == 0) goto L84
            r5 = r7
            X.067a r5 = (X.C15552067a) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L76
            if (r0 != r1) goto L8a
            X.C155000ia.LIZIZ(r4)
        L23:
            int r1 = LIZ()
            X.067c r0 = X.EnumC15554067c.APP_STATUS_NEW_LOGIN
            int r0 = r0.getStatus()
            java.lang.String r3 = "app_status"
            if (r1 != r0) goto L4a
            X.067c r0 = X.EnumC15554067c.APP_STATUS_NORMAL
            int r1 = r0.getStatus()
            X.01GW r0 = X.C15553067b.LIZLLL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r0.storeInt(r3, r1)
        L42:
            X.1DEV r0 = X.C15553067b.LJFF
            r0.LIZIZ(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4a:
            X.067c r0 = X.EnumC15554067c.APP_STATUS_COLD_START
            int r0 = r0.getStatus()
            if (r1 != r0) goto L64
            X.067c r0 = X.EnumC15554067c.APP_STATUS_NORMAL
            int r1 = r0.getStatus()
            X.01GW r0 = X.C15553067b.LIZLLL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r0.storeInt(r3, r1)
            goto L42
        L64:
            X.067c r0 = X.EnumC15554067c.APP_STATUS_NORMAL
            int r1 = r0.getStatus()
            X.01GW r0 = X.C15553067b.LIZLLL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.keva.Keva r0 = (com.bytedance.keva.Keva) r0
            r0.storeInt(r3, r1)
            goto L42
        L76:
            X.C155000ia.LIZIZ(r4)
            X.1DEV r0 = X.C15553067b.LJFF
            r5.LLILLL = r1
            java.lang.Object r0 = r0.LIZLLL(r2, r5)
            if (r0 != r3) goto L23
            return r3
        L84:
            X.067a r5 = new X.067a
            r5.<init>(r6, r7)
            goto L12
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15553067b.LIZIZ(X.05Vn):java.lang.Object");
    }
}
