package X;

import Y.AObserverS236S0100000_34;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.ab.MinisThirdPartyIdentifierBannerConfig;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.viewmodel.MinisViewModel;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Ayd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196971Ayd implements InterfaceC1802030wzh {
    public static final Set<String> LJIIL = new LinkedHashSet();
    public String LIZ;
    public Context LIZIZ;
    public MinisMetaResp LIZJ;
    public String LIZLLL;
    public String LJ;
    public Function0<? extends Activity> LJFF;
    public Function0<MinisMetaResp> LJI;
    public C1802190wzx LJII;
    public MinisViewModel LJIIIIZZ;
    public AObserverS236S0100000_34 LJIIIZ;
    public boolean LJIIJ;
    public C1802010wzf LJIIJJI;

    @Override // X.InterfaceC1802030wzh
    public final void onDismiss() {
    }

    @Override // X.InterfaceC1802030wzh
    public final void LIZ() {
        Activity activityInvoke;
        C2196701AyC.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C2196701AyC.LIZ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_3p_provide_service_banner_click", map);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onThirdPartyProvideServiceBannerClick, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
        Function0<? extends Activity> function0 = this.LJFF;
        if (function0 == null || (activityInvoke = function0.invoke()) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityInvoke, "//minis_internal/about_page");
        Function0<MinisMetaResp> function02 = this.LJI;
        smartRouteBuildRoute.withParam("MinisData", function02 != null ? function02.invoke() : null);
        smartRouteBuildRoute.open();
    }

    @Override // X.InterfaceC1802030wzh
    public final void LIZJ() {
        C2196701AyC.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C2196701AyC.LIZ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_3p_provide_service_banner_show", map);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onThirdPartyProvideServiceBannerShow, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
        String str = this.LIZ;
        if (str == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C637690Ozn(System.currentTimeMillis(), str, null), 3);
    }

    public final void LJ() {
        String string;
        String string2;
        String str;
        String str2;
        String str3;
        String str4 = this.LIZ;
        if (str4 == null) {
            this.LJIIJJI = null;
            return;
        }
        if (!LJI(str4)) {
            this.LJIIJJI = null;
            return;
        }
        Context context = this.LIZIZ;
        if (context == null) {
            this.LJIIJJI = null;
            return;
        }
        MinisMetaResp minisMetaResp = this.LIZJ;
        String str5 = this.LIZLLL;
        String str6 = this.LJ;
        String string3 = (minisMetaResp == null || (str3 = minisMetaResp.name) == null) ? null : a0.LJLIIIL(str3).toString();
        String str7 = "";
        if (string3 == null) {
            string3 = "";
        }
        if (string3.length() == 0 && (str5 == null || (string3 = a0.LJLIIIL(str5).toString()) == null)) {
            string3 = "";
        }
        if (string3.length() > 40) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LN.LJZL(37, string3));
            sbLIZ.append("...");
            string3 = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (string3.length() == 0) {
            this.LJIIJJI = null;
            return;
        }
        String string4 = context.getString(2131822206, string3);
        if (minisMetaResp == null || (str2 = minisMetaResp.iconUrl) == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            string = "";
        }
        if (string.length() == 0 && (minisMetaResp == null || (str = minisMetaResp.iconBigUrl) == null || (string = a0.LJLIIIL(str).toString()) == null)) {
            string = "";
        }
        if (string.length() == 0) {
            if (str6 != null && (string2 = a0.LJLIIIL(str6).toString()) != null) {
                str7 = string2;
            }
            string = str7;
        }
        this.LJIIJJI = new C1802010wzf(string.length() != 0 ? string : null, string4, 3000L, false, EnumC992990bwn.DEFAULT);
    }

    public final void LJFF() {
        MinisViewModel minisViewModel;
        AObserverS236S0100000_34 aObserverS236S0100000_34 = this.LJIIIZ;
        if (aObserverS236S0100000_34 != null && (minisViewModel = this.LJIIIIZZ) != null) {
            minisViewModel.LLILLJJLI.removeObserver(aObserverS236S0100000_34);
            this.LJIIIZ = null;
            this.LJIIIIZZ = null;
            this.LJIIJ = false;
        }
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        LJ();
    }

    @Override // X.InterfaceC1802030wzh
    public final C1802010wzf LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1802030wzh
    public final void LIZLLL() {
        LJFF();
    }

    public static boolean LJI(String str) {
        int i;
        long jOptLong;
        if (str == null || a0.LJJJIL(str) || LJIIL.contains(str) || (i = ((MinisThirdPartyIdentifierBannerConfig) C2197111Ayr.LIZIZ.getValue()).coolDownTime) <= 0) {
            return false;
        }
        C2197011Ayh c2197011Ayh = C2197011Ayh.LIZ;
        c2197011Ayh.getClass();
        if (!a0.LJJJIL(str)) {
            synchronized (c2197011Ayh) {
                try {
                    jOptLong = C2197011Ayh.LJIIJ().optLong(str, 0L);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (jOptLong == 0 || System.currentTimeMillis() - jOptLong >= ((long) i) * 1000) {
                return true;
            }
            return false;
        }
        return true;
    }
}
