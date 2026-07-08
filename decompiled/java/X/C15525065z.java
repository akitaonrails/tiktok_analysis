package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.065z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15525065z {
    public static final AtomicBoolean LIZ = new AtomicBoolean(true);
    public static final C15524065y LIZIZ = new InterfaceC1890940zJ6() { // from class: X.065y
        @Override // X.InterfaceC1890940zJ6
        public final void LIZ(C062Z c062z) {
            C1590906Kt.LIZ("StreakBannerManager onBannerClose");
        }

        @Override // X.InterfaceC1890940zJ6
        public final void LIZJ(C062Z c062z) {
            C1590906Kt.LIZ("StreakBannerManager onBannerShow");
            C15520065u c15520065u = C15520065u.LIZIZ;
            long j = C06FV.LIZ().shareInfoRequestTimeOut;
            int i = C06FV.LIZ().shareInfoRequestRetryCount;
            synchronized (c15520065u) {
                try {
                    C099G c099g = C15520065u.LJFF;
                    if (c099g == null || c099g.isCompleted()) {
                        C15520065u.LJFF = C23250099c.LIZIZ(C15520065u.LIZLLL, null, null, new C1401905eD(i, j, null), 3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1583706Hz c1583706Hz = C1583706Hz.LIZIZ;
            c1583706Hz.getClass();
            C1590906Kt.LIZ("StreakSharePanelResProvider, onStreakBannerShow");
            c1583706Hz.LJIIL();
        }

        @Override // X.InterfaceC1890940zJ6
        public final void LIZIZ(Context context, C062Z c062z, String str) {
            C1590906Kt.LIZ("StreakBannerManager onBannerClick");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("&click_time=");
            sbLIZ.append(System.currentTimeMillis());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (context != null && C1388190mED.LIZ(context) != null) {
                SmartRouter.buildRoute(context, strLIZIZ).open();
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v2, types: [X.065y] */
    static {
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.0660
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        C15525065z.LIZ.set(true);
                    }
                }
            }
        });
    }
}
