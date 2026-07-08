package X;

import X.C0VRQ;
import X.C0VZ0;
import X.C2211981Bhk;
import X.C2212231Bi9;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.tools.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.openauthorize.AuthorizeCommonService;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030980cw4 implements InterfaceC1028550cs9 {
    @Override // X.InterfaceC1028550cs9
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIIJ() {
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIJI() {
        MainLooperOptService.LLJJJJLIIL = false;
    }

    @Override // X.InterfaceC1028550cs9
    public final String getDeviceId() {
        return AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
    }

    @Override // X.InterfaceC1028550cs9
    public final String getInstallId() {
        return AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId();
    }

    @Override // X.InterfaceC1028550cs9
    public final HashMap<String, String> LJIJJ() {
        String strLIZIZ;
        HashMap<String, String> map = new HashMap<>();
        User curUser = C0XQ7.LJFF().getCurUser();
        String accountRegion = curUser.getAccountRegion();
        int iLJIILL = ComplianceServiceProvider.LJIILIIL().LJIILL();
        int userMode = curUser.getUserMode() != -1 ? curUser.getUserMode() : 0;
        map.put("user_mode", (iLJIILL == 0 || iLJIILL == 2) ? String.valueOf(userMode | 4) : String.valueOf(userMode));
        map.put("user_period", String.valueOf(curUser.getUserPeriod()));
        if (accountRegion != null && accountRegion.length() > 0) {
            map.put("account_region", accountRegion);
        }
        map.put("user_region", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase());
        int[] iArrLIZ = C422830Gi1.LIZ(100);
        if (iArrLIZ == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iArrLIZ[0]);
            sbLIZ.append('_');
            sbLIZ.append(iArrLIZ[1]);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        map.put("user_avatar_shrink", String.valueOf(strLIZIZ));
        map.put("tz_name", TimeZone.getDefault().getID());
        return map;
    }

    @Override // X.InterfaceC1028550cs9
    public final long LJIL() {
        C588810N7n.LIZ.getClass();
        return ((Number) C588810N7n.LIZIZ.getValue()).longValue();
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJJ() {
        return C2200121B8w.LIZ.get();
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJJIIJZLJL() {
        return u.LJIJI("startupTest", C2405409bg.LIZ, true) || u.LJIJI("MTraceStartupDiff", C2405409bg.LIZ, true) || u.LJIJI("manuallyMTrace", C2405409bg.LIZ, true) || u.LJIJI("MTraceStartup", C2405409bg.LIZ, true) || u.LJIJI("systrace", C2405409bg.LIZ, true) || u.LJIJI("manuallyATrace", C2405409bg.LIZ, true) || u.LJIJI("dominoMode", C2405409bg.LIZ, true);
    }

    @Override // X.InterfaceC1028550cs9
    public final int LJJIIZ() {
        C844470XAv.LIZ.getClass();
        return C14LC.LIZLLL(C844470XAv.LIZ());
    }

    @Override // X.InterfaceC1028550cs9
    public final String getOpenUdid() {
        HashMap map = new HashMap();
        AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_legoImp_task_InitModules_getSSIDs(map);
        String str = (String) map.get("openudid");
        return str == null ? "" : str;
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LIZ() {
        return C10EU.LJIIIIZZ();
    }

    @Override // X.InterfaceC1028550cs9
    public final int LIZIZ() {
        return ComplianceServiceProvider.LJIILIIL().LIZIZ();
    }

    @Override // X.InterfaceC1028550cs9
    public final IDownloadService LIZLLL() {
        return (IDownloadService) ServiceManager.get().getService(IDownloadService.class);
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJ() {
        return ComplianceServiceProvider.LJIILIIL().LJ();
    }

    @Override // X.InterfaceC1028550cs9
    public final long LJFF() {
        return C1BN8.LIZ().LIZ.LIZJ;
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJI() {
        return AbstractC827890Wdn.LIZIZ().LIZJ;
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJIIJJI() {
        return AbstractC827890Wdn.LIZIZ().LIZLLL;
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIILJJIL() {
        ((IInitAllService) ServiceManager.get().getService(IInitAllService.class)).LIZJ(C1BWL.LIZ());
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJJI() {
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.NORMAL_SPLASH);
    }

    @Override // X.InterfaceC1028550cs9
    public final String LJJIFFI() {
        return ComplianceServiceProvider.LJJI().LJII();
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJJIII() {
        return ComplianceServiceProvider.LJIILIIL().LJJIIJ() || ComplianceServiceProvider.LJIILIIL().LJIJJLI();
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJJIJ() {
        return AbstractC827890Wdn.LIZIZ().LJ;
    }

    @Override // X.InterfaceC1028550cs9
    public final String LJJIJIIJI() {
        String strLIZJ = AnonymousClass1440.LIZJ();
        return strLIZJ == null ? "" : strLIZJ;
    }

    @Override // X.InterfaceC1028550cs9
    public final String getCurUserId() {
        return C0XQ7.LJFF().getCurUserId();
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean isAppBackground() {
        return C1BN8.LIZ().LIZ.LIZIZ;
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIIL() {
    }

    @Override // X.InterfaceC1028550cs9
    public final C1045350dJF LJII(Context context) {
        return new C1045350dJF(context);
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIILIIL(Aweme aweme) {
        C1045220dJ2.LJIIJ(aweme, null, null, false);
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIJ(final C2211981Bhk c2211981Bhk) {
        C799900VZk.LIZ.getClass();
        new C799890VZj().LIZ(new C0CCZ() { // from class: com.ss.android.ugc.aweme.commercialize.splash.SplashAdDependImpl$setPreloadDelay$1
            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ List finalizedBy() {
                return null;
            }

            @Override // X.InterfaceC800080Va2
            public final String key() {
                return "SplashAdDependImpl$setPreloadDelay$1";
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ boolean meetTrigger() {
                return true;
            }

            @Override // X.C0CCZ
            public final /* synthetic */ boolean serialExecute() {
                return false;
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ int targetProcess() {
                return C0VZ0.LIZ();
            }

            @Override // X.InterfaceC800080Va2
            public final /* synthetic */ EnumC799980VZs triggerType() {
                return C0VZ0.LIZIZ(this);
            }

            @Override // X.C0CCZ
            public final EnumC799870VZh type() {
                return EnumC799870VZh.BOOT_FINISH;
            }

            @Override // X.InterfaceC308150C6b
            public final void run(Context context) {
                C0VRQ c0vrq = ((C2211981Bhk) c2211981Bhk).LIZ;
                SettingsManager.LIZLLL().getClass();
                long jLJFF = SettingsManager.LJFF("splash_preload_delay", 0L);
                c0vrq.getClass();
                C2212231Bi9.LJJIJIL = jLJFF;
            }
        });
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean LJIJJLI(InterfaceC1018210cbT interfaceC1018210cbT) {
        TopViewAwemeRawAd topViewAwemeRawAdLIZIZ;
        OmVast omVast;
        TopViewAwemeRawAd topViewAwemeRawAdLIZIZ2;
        OmVast omVast2;
        if (interfaceC1018210cbT == null || (interfaceC1018210cbT.LLZZZIL() && (topViewAwemeRawAdLIZIZ = interfaceC1018210cbT.LIZIZ()) != null && (omVast = topViewAwemeRawAdLIZIZ.getOmVast()) != null && !omVast.loaded && (topViewAwemeRawAdLIZIZ2 = interfaceC1018210cbT.LIZIZ()) != null && (omVast2 = topViewAwemeRawAdLIZIZ2.getOmVast()) != null && omVast2.providerType == 3)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1028550cs9
    public final Intent LJJIIJ(NormalSplashAdActivity normalSplashAdActivity) {
        return new Intent(normalSplashAdActivity, (Class<?>) CrossPlatformActivity.class);
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJJIJIIJIL(String str) {
        TroubleshootingLogDelegate.INSTANCE.ordinarySplashLog(str, null);
    }

    @Override // X.InterfaceC1028550cs9
    public final boolean isActivityAwemeAuthorize(Activity activity) {
        IAuthorizeCommonService iAuthorizeCommonService;
        Object objLIZ = C04TD.LIZ(IAuthorizeCommonService.class, false);
        if (objLIZ != null) {
            iAuthorizeCommonService = (IAuthorizeCommonService) objLIZ;
        } else {
            if (C04TD.e7 == null) {
                synchronized (IAuthorizeCommonService.class) {
                    if (C04TD.e7 == null) {
                        C04TD.e7 = new AuthorizeCommonService();
                    }
                }
            }
            iAuthorizeCommonService = C04TD.e7;
        }
        return iAuthorizeCommonService.isActivityAwemeAuthorize(activity);
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIIZILJ(Context context, Aweme aweme) {
        int i;
        List<String> list = C1019030ccn.LIZ;
        if (C1017070cZd.LLIZLLLIL(aweme)) {
            C588810N7n.LIZ.getClass();
            if (C588810N7n.LIZJ != 0) {
                if (!C588810N7n.LJFF) {
                    i = 2;
                } else {
                    i = 1;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - C588810N7n.LIZJ;
                C588810N7n.LIZJ = 0L;
                HashMap map = new HashMap();
                map.put("feedduration", String.valueOf(jCurrentTimeMillis));
                map.put("awemelaunch", String.valueOf(i));
                HashMap map2 = new HashMap();
                map2.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), map));
                C1019030ccn.LJJJJ(context, "feed_show", aweme, C1019030ccn.LJIIJJI(context, aweme, false, map2));
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "feed_show", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(jCurrentTimeMillis), "feedduration");
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "awemelaunch");
                c1022820ciuLIZLLL.LJIIIIZZ();
                C583480MuY.LIZIZ(System.currentTimeMillis(), "finish");
            }
        }
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJJII(NormalSplashAdActivity normalSplashAdActivity, String str) {
        C730040SkM.LIZJ(str);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        String str2 = "?";
        if (str.contains("?")) {
            str2 = "&";
        }
        objArr[1] = str2;
        objArr[2] = URLEncoder.encode("trigger_by");
        objArr[3] = URLEncoder.encode("splash");
        C1041940dDk.LIZJ(normalSplashAdActivity, C786410Ut5.j4("%s%s%s=%s", objArr), null, true);
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJIILL(String str, boolean z, boolean z2) {
        if (z) {
            C1150504el.LIZ().LIZLLL(str, z2);
        } else {
            C1150504el.LIZ().LJI(str, z2);
        }
    }

    @Override // X.InterfaceC1028550cs9
    public final void LJJIIZI(final Context context, final Aweme aweme, Map<String, String> map) {
        String string;
        final String str;
        JSONObject jSONObject;
        if (context != null && aweme != null && C1017070cZd.LLIZLLLIL(aweme)) {
            if (!C1017070cZd.LLJI(aweme) && TextUtils.isEmpty(C1017070cZd.LJIIZILJ(aweme))) {
                return;
            }
            C1019030ccn.LJJJJ(context, "splash_click", aweme, C1019030ccn.LJIIJJI(context, aweme, false, map));
            HashMap map2 = (HashMap) map;
            String str2 = (String) map2.get("ad_extra_data");
            final String string2 = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject = new JSONObject(str2);
                    string = JSONObjectProtectorUtils.getString(jSONObject, "click_x");
                } catch (Exception e) {
                    e = e;
                    string = null;
                }
                try {
                    string2 = JSONObjectProtectorUtils.getString(jSONObject, "click_y");
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                str = string2;
                string2 = string;
            } else {
                str = null;
            }
            TopViewAdEventLogger.LJJIIZ().logAd(C1018060cbE.LJIIZILJ, aweme.getAwemeRawAd(), new Function1() { // from class: X.0cbH
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str3 = string2;
                    String str4 = str;
                    C1023640ckE c1023640ckE = (C1023640ckE) obj;
                    c1023640ckE.withParam(C1018070cbF.LJIILLIIL, str3);
                    c1023640ckE.withParam(C1018070cbF.LJIIZILJ, str4);
                    return null;
                }
            });
            JSONObject jSONObjectLJIIJJI = C1019030ccn.LJIIJJI(context, aweme, true, map2);
            try {
                jSONObjectLJIIJJI.put("refer", "takeover");
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1AF0.LJ(e3);
            }
            C1019030ccn.LJJJJ(context, "click", aweme, jSONObjectLJIIJJI);
            if (C1017070cZd.LJJLIIJ(aweme)) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                Long creativeId = awemeRawAd.getCreativeId();
                String logExtra = awemeRawAd.getLogExtra();
                c2201701BEy.getClass();
                C2201701BEy.LIZ("click", clickTrackUrlList, creativeId, logExtra);
            }
            if (C1021930chT.LIZ(context, aweme, 42, new InterfaceC1022210chv() { // from class: X.0cuj
                @Override // X.InterfaceC1022210chv
                public final void LIZ() {
                    AbstractC1025070cmX.LIZLLL(context, aweme);
                }
            })) {
                return;
            }
            AbstractC1025070cmX.LIZLLL(context, aweme);
        }
    }
}
