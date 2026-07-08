package X;

import Y.ACallableS431S0100000_28;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10X0, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.preinstall.attribution.manager.PreInstallTrackingManager$executeAllTrackingTasks$1", f = "PreInstallTrackingManager.kt", l = {49}, m = "invokeSuspend")
public final class C10X0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C19259510Wj LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C10X2 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10X0(C19259510Wj c19259510Wj, Context context, String str, C10X2 c10x2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c19259510Wj;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = c10x2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10X0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C259800zU c259800zU;
        boolean z;
        boolean z2;
        String str;
        C1C7U.LIZ("PreInstallTrackingManager@d78e.executeAllTrackingTasks$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        boolean z3 = true;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            c259800zU.element = null;
            C1DFB c1dfb = C0PEM.LIZJ;
            C10X7 c10x7 = new C10X7(this, c259800zU, null);
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            if (C23250099c.LJI(this, c1dfb, c10x7) == objLJFF) {
                C1C7U.LIZIZ("PreInstallTrackingManager@d78e.executeAllTrackingTasks$1");
                return objLJFF;
            }
        }
        C10X6 c10x6 = this.LLILZLL.LIZJ;
        if (c10x6 != null) {
            C10XK c10xk = (C10XK) c259800zU.element;
            if (c10xk == null) {
                c10xk = new C10XK();
            }
            C10X5 c10x5 = (C10X5) c10x6;
            InitAppsFlyer initAppsFlyer = c10x5.LIZ;
            long j = c10x5.LIZIZ;
            Context context = c10x5.LIZJ;
            AppsFlyerConversionListener appsFlyerConversionListener = c10x5.LIZLLL;
            initAppsFlyer.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "time");
            c2344009Gk.LIZLLL(SystemClock.uptimeMillis() - C202094145s.LJII, "cost_time_from_boot_v1");
            c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - C202094145s.LIZIZ, "cost_time_from_boot_v2");
            C20684815ws.LJIILLIIL("preinstall_lib_finish", c2344009Gk.LIZ);
            initAppsFlyer.LLILZ = c10xk;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("af-thread*****");
            if (C786410Ut5.u3().getId() == Looper.getMainLooper().getThread().getId()) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            C10XH c10xh = c10xk.LIZ;
            C19260410Ws c19260410Ws = C19260410Ws.LIZ;
            String str2 = c10xh.LIZ;
            c19260410Ws.getClass();
            Keva keva = C19260410Ws.LIZIZ;
            keva.storeString("preinstall_channel", str2);
            keva.storeString("preinstall_campaign", c10xh.LIZIZ);
            C19260410Ws.LJIIJ = true;
            if (c10xh.LJ && !c10xh.LJIIIIZZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!TextUtils.isEmpty(c10xh.LIZ) && !z2) {
                String str3 = c10xh.LIZ;
                String str4 = c10xh.LIZIZ;
                String str5 = c10xh.LIZJ;
                C20144713rx c20144713rx = new C20144713rx(939524111);
                C837720Wte.LIZ("AppsFlyer", "setPreinstallAttribution", c20144713rx, new C0WGZ(str3, str4, str5, c20144713rx));
            }
            initAppsFlyer.LJFF(context, appsFlyerConversionListener);
            C15O7.LIZJ(new ACallableS431S0100000_28(Boolean.valueOf(c10xh.LJIIJ), 8));
            Keva.getRepo("appsflyer_repo").storeBoolean("is_preinstall_app", c10xh.LJIIJ);
            String str6 = c10xk.LIZJ.LIZIZ;
            if (str6 != null && str6.contains("utm_source=tt_wallpaper")) {
                C20684815ws.onEventV3("app_install_from_wallpaper");
            }
            InitAppsFlyer.LJIIIIZZ("tiktok_preinstall", c10xk.LIZLLL.LIZ);
            InitAppsFlyer.LJIIIIZZ("google_install_referrer", c10xk.LIZLLL.LIZJ);
            InitAppsFlyer.LJIIIIZZ("tiktok_preinstall_channel_list", c10xk.LIZLLL.LIZIZ);
            InitAppsFlyer.LJIIIIZZ("samsung_preload", c10xk.LIZLLL.LIZLLL);
            InitAppsFlyer.LJIIIIZZ("manifest_preinstall", c10xk.LIZLLL.LJ);
            InitAppsFlyer.LJIIIIZZ("hw_install_referrer", c10xk.LIZLLL.LJFF);
            InitAppsFlyer.LJIIIIZZ("df_preload", c10xk.LIZLLL.LJI);
            C10SW c10sw = C10SW.LIZ;
            Map<String, String> map = c10xk.LIZLLL.LIZJ;
            c10sw.getClass();
            if (C1514430pVp.LIZLLL().booleanValue()) {
                String str7 = map.get("referrer");
                if (C123100dR.LIZ(str7)) {
                    Uri uri = UriProtector.parse(str7);
                    C10SW.LJIILLIIL = str7;
                    C10SW.LJIILL = C10SW.LIZIZ(uri);
                }
            }
            HashMap map2 = new HashMap();
            C10XH c10xh2 = c10xk.LIZ;
            int i2 = c10xh2.LJIIL;
            int i3 = c10xh2.LJIILIIL;
            if (i2 > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_preload", str);
            map2.put("df_code", String.valueOf(i2));
            map2.put("df_only", String.valueOf(i3));
            InitAppsFlyer.LJIIIIZZ("preload_df_result", map2);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    C844470XAv.LIZ.getClass();
                    PackageManager packageManager = C844470XAv.LIZ().getPackageManager();
                    String packageName = C844470XAv.LIZ().getPackageName();
                    String installingPackageName = packageManager.getInstallSourceInfo(packageName).getInstallingPackageName();
                    String initiatingPackageName = packageManager.getInstallSourceInfo(packageName).getInitiatingPackageName();
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("installing_package_name", installingPackageName);
                    c2344009Gk2.LJIIIIZZ("initiating_package_name", initiatingPackageName);
                    c2344009Gk2.LIZLLL(C19260410Ws.LIZIZ(), "apk_first_install_time");
                    c2344009Gk2.LIZLLL(C19260410Ws.LIZJ(), "apk_last_update_time");
                    if (C19260410Ws.LIZIZ() == 0 || C19260410Ws.LIZJ() == 0 || C19260410Ws.LIZJ() <= C19260410Ws.LIZIZ()) {
                        z3 = false;
                    }
                    c2344009Gk2.LJ(Boolean.valueOf(z3), "is_updated_version");
                    C20684815ws.LJIILLIIL("apk_install_source", c2344009Gk2.LIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreInstallTrackingManager@d78e.executeAllTrackingTasks$1");
        return unit;
    }
}
