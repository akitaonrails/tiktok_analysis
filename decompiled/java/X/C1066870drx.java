package X;

import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0drx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066870drx {
    public static final C1066870drx LIZ = new C1066870drx();
    public static volatile String LIZIZ = "";
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(331));

    public static String LIZ() {
        String str;
        C1030980cw4 c1030980cw4LIZ;
        if (!ComplianceServiceProvider.LJIILJJIL().LJII(null) || !C1066880dry.LIZJ.getEnableGaid()) {
            return "";
        }
        String str2 = LIZIZ;
        if (!(str2.length() == 0)) {
            return str2;
        }
        synchronized (C13LE.LIZ(C1066870drx.class)) {
            try {
                if (LIZIZ.length() == 0) {
                    ISplashAdOutService iSplashAdOutService = (ISplashAdOutService) PluggableExtentionKt.pluggableSpi$default(ISplashAdOutService.class, false, false, false, 14, null);
                    LIZIZ = (iSplashAdOutService == null || (c1030980cw4LIZ = iSplashAdOutService.LIZ()) == null) ? "" : c1030980cw4LIZ.LJJIJIIJI();
                }
                str = LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }
}
