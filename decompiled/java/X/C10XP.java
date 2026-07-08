package X;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.ReferrerDetails;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10XP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.preinstall.attribution.tasks.GoogleReferrerTask$execute$1$onInstallReferrerSetupFinished$1", f = "GoogleReferrerTask.kt", l = {}, m = "invokeSuspend")
public final class C10XP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C10XQ LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10XP(C10XQ c10xq, int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c10xq;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10XP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoogleReferrerTask@d7b4.execute$1$onInstallReferrerSetupFinished$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C10XQ c10xq = this.LL;
        C10XR c10xr = c10xq.LIZ;
        int i = this.LLILLJJLI;
        InstallReferrerClient installReferrerClient = c10xq.LIZIZ;
        C10XK c10xk = c10xq.LIZJ;
        c10xr.getClass();
        C10XL c10xl = c10xk.LIZJ;
        c10xl.LIZ = i;
        if (i == 0) {
            try {
                ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                if (installReferrer == null) {
                    try {
                        installReferrerClient.endConnection();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else {
                    try {
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 == null) {
                            installReferrer2 = "";
                        }
                        c10xl.LIZIZ = installReferrer2;
                        c10xl.LIZJ = installReferrer.getInstallBeginTimestampSeconds();
                        c10xl.LIZLLL = installReferrer.getInstallBeginTimestampServerSeconds();
                        c10xl.LJ = installReferrer.getReferrerClickTimestampSeconds();
                        c10xl.LJFF = installReferrer.getReferrerClickTimestampServerSeconds();
                        String installVersion = installReferrer.getInstallVersion();
                        if (installVersion == null) {
                            installVersion = "-1";
                        }
                        c10xl.LJI = installVersion;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    try {
                        installReferrerClient.endConnection();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                c10xl.LIZ = -100;
                try {
                    installReferrerClient.endConnection();
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
            }
        }
        C10XQ c10xq2 = this.LL;
        C10XR c10xr2 = c10xq2.LIZ;
        C10XK c10xk2 = c10xq2.LIZJ;
        c10xr2.getClass();
        C10XL c10xl2 = c10xk2.LIZJ;
        Map<String, String> map = c10xk2.LIZLLL.LIZJ;
        map.put("referrer", c10xl2.LIZIZ);
        map.put("install_begin_time", String.valueOf(c10xl2.LIZJ));
        map.put("install_begin_time_server", String.valueOf(c10xl2.LIZLLL));
        map.put("referer_click_time", String.valueOf(c10xl2.LJ));
        map.put("referrer_click_time_server", String.valueOf(c10xl2.LJFF));
        map.put("install_version", String.valueOf(c10xl2.LJI));
        map.put("state_code", String.valueOf(c10xl2.LIZ));
        this.LL.LIZLLL.countDown();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoogleReferrerTask@d7b4.execute$1$onInstallReferrerSetupFinished$1");
        return unit;
    }
}
