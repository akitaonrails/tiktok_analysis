package X;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerConversionListener;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.interfaces.IConfigService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.api.IFeedModuleService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10Wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19259210Wg implements AppsFlyerConversionListener {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ InitAppsFlyer LIZJ;

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAppOpenAttribution(Map<String, String> map) {
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (map != null) {
            string = map.toString();
        } else {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("attribution_data", string);
        C20684815ws.LJIILLIIL("app_open_attribution", c2344009Gk.LIZ);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onAttributionFailure(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("attribution_fail_message", str);
        C20684815ws.LJIILLIIL("af_attribution_fail", c2344009Gk.LIZ);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataFail(String str) {
        C10SW.LIZ.getClass();
        C10SW.LIZLLL("request_failed");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("conversion_fail_message", str);
        C20684815ws.LJIILLIIL("af_conversion_fail", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v80, types: [X.10UR] */
    @Override // com.appsflyer.AppsFlyerConversionListener
    public final void onConversionDataSuccess(Map<String, Object> map) {
        final String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        final String strLJFF;
        boolean z;
        boolean z2;
        String string8;
        boolean z3;
        String lastPathSegment;
        try {
            C1092004Ow.LIZ = map;
            if (C19260410Ws.LJFF()) {
                String str = "";
                if (map.get("media_source") == null) {
                    string = "";
                } else {
                    string = map.get("media_source").toString();
                }
                if (map.get("campaign") == null) {
                    string2 = "";
                } else {
                    string2 = map.get("campaign").toString();
                }
                if (map.get("af_dp") == null) {
                    string3 = "";
                } else {
                    string3 = map.get("af_dp").toString();
                }
                try {
                    try {
                        Object obj = map.get("af_status");
                        Objects.requireNonNull(obj);
                        String string9 = obj.toString();
                        C1227904rF.LIZ.getClass();
                        String strLJI = C1227904rF.LJI(map);
                        string4 = "";
                        if (strLJI != null) {
                            str = strLJI;
                        }
                        try {
                            String strLIZ = InitAppsFlyer.LIZ(this.LIZJ.LLILZ);
                            try {
                                try {
                                    if ("Non-organic".equalsIgnoreCase(string9)) {
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        long j = jUptimeMillis - C202094145s.LJII;
                                        try {
                                            long jElapsedRealtime = SystemClock.elapsedRealtime() - C202094145s.LIZIZ;
                                            try {
                                                long j2 = jUptimeMillis - this.LIZJ.LLILZLL;
                                                long j3 = jUptimeMillis - C19260410Ws.LJIIIIZZ;
                                                try {
                                                    HashMap map2 = new HashMap(map);
                                                    map2.remove("idfa");
                                                    map2.remove("idfv");
                                                    map2.remove("advertising_id");
                                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                                    try {
                                                        try {
                                                            c2344009Gk.LJIIIIZZ("conversion_data", map2.toString());
                                                            c2344009Gk.LIZLLL(j, "cost_time_from_boot_v1");
                                                            c2344009Gk.LIZLLL(jElapsedRealtime, "cost_time_from_boot_v2");
                                                            c2344009Gk.LIZLLL(j2, "cost_time_from_init");
                                                            c2344009Gk.LIZLLL(j3, "cost_time_from_start");
                                                            c2344009Gk.LJIIIIZZ("media_source", string);
                                                            c2344009Gk.LJIIIIZZ("campaign", string2);
                                                            try {
                                                                c2344009Gk.LJIIIIZZ("af_dp", string3);
                                                                try {
                                                                    c2344009Gk.LJIIIIZZ("ugdp_id", this.LIZJ.LLIZ);
                                                                    C20684815ws.LJIILLIIL("af_conversion_success", c2344009Gk.LIZ);
                                                                } catch (l e) {
                                                                    e = e;
                                                                    TryCatchGuardChecker.doCheck(e);
                                                                } catch (NullPointerException e2) {
                                                                    e = e2;
                                                                    TryCatchGuardChecker.doCheck(e);
                                                                }
                                                            } catch (l e3) {
                                                                e = e3;
                                                            } catch (NullPointerException e4) {
                                                                e = e4;
                                                            }
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                        }
                                                    } catch (l e6) {
                                                        e = e6;
                                                    } catch (NullPointerException e7) {
                                                        e = e7;
                                                    }
                                                } catch (l e8) {
                                                    e = e8;
                                                } catch (NullPointerException e9) {
                                                    e = e9;
                                                }
                                            } catch (l e10) {
                                                e = e10;
                                            } catch (NullPointerException e11) {
                                                e = e11;
                                            }
                                        } catch (l e12) {
                                            e = e12;
                                        } catch (NullPointerException e13) {
                                            e = e13;
                                        }
                                    } else {
                                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                                        C19260410Ws.LIZ.getClass();
                                        c2344009Gk2.LJIIIIZZ("region", C19260410Ws.LIZLLL());
                                        C20684815ws.LJIILLIIL("af_conversion_organic", c2344009Gk2.LIZ);
                                    }
                                    C1602860roS.LIZ.getClass();
                                    if (C1602860roS.LJ()) {
                                        C10UP.LIZ.LJ(str, strLIZ);
                                    }
                                    C1869890yl9.LIZIZ(string);
                                    IConfigService iConfigService = (IConfigService) PluggableExtentionKt.pluggableSpi(IConfigService.class);
                                    if (iConfigService != null) {
                                        iConfigService.LIZ();
                                    }
                                } catch (l e14) {
                                    e = e14;
                                } catch (NullPointerException e15) {
                                    e = e15;
                                }
                            } catch (l e16) {
                                e = e16;
                            } catch (NullPointerException e17) {
                                e = e17;
                            }
                        } catch (l e18) {
                            e = e18;
                        } catch (NullPointerException e19) {
                            e = e19;
                        }
                    } catch (Exception e20) {
                        e = e20;
                    }
                } catch (l | NullPointerException e21) {
                    e = e21;
                    string4 = "";
                }
                Keva.getRepo("appsflyer_repo").storeBoolean("is_appsflyer_first_launch", false);
                Map<String, String> mapLJJIJLIJ = ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJIJLIJ(this.LIZJ.LLILZ.LIZJ.LIZIZ);
                String strLJJZZIII = ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJZZIII("af_dp", mapLJJIJLIJ);
                String strLJJZZIII2 = ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJZZIII("utm_source", mapLJJIJLIJ);
                try {
                    try {
                        string5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strLJJZZIII), "tt_ug_share_gp_flag");
                    } catch (Exception e22) {
                        e = e22;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Exception e23) {
                    e = e23;
                }
                if (string5 == null) {
                    string5 = string4;
                }
                ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILLIIL();
                C19259610Wk c19259610Wk = C19259610Wk.LIZ;
                C19259610Wk.LJII(this.LIZJ.LLILZ.LIZ.LJIIL, map);
                if (map.get("match_type") != null) {
                    string6 = map.get("match_type").toString();
                } else {
                    string6 = string4;
                }
                if (map.get("tt_target") != null) {
                    string7 = map.get("tt_target").toString();
                } else {
                    string7 = string4;
                }
                if (map.get("tt_ug_share_gp_flag") != null) {
                    string5 = map.get("tt_ug_share_gp_flag").toString();
                }
                if (this.LIZJ.LLILZIL != null) {
                    Context context = this.LIZ;
                    C844470XAv.LIZ.getClass();
                    C19259510Wj.LIZ(context, C844470XAv.LJIILL, this.LIZJ.LLILZ, string, string2, string6);
                }
                if (string5.equals("1") && !((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJIIJ()) {
                    if (TextUtils.isEmpty(string3)) {
                        if (TextUtils.isEmpty(string7)) {
                            if (!TextUtils.isEmpty(strLJJZZIII)) {
                                strLJFF = strLJJZZIII;
                                z2 = false;
                                z = true;
                            } else {
                                if (!TextUtils.isEmpty(this.LIZJ.LLIZLLLIL)) {
                                    strLJFF = this.LIZJ.LLIZLLLIL;
                                    z = false;
                                    z2 = true;
                                }
                                z = false;
                                z2 = false;
                                strLJFF = string3;
                            }
                        } else {
                            z = false;
                            z2 = false;
                            strLJFF = string7;
                        }
                    } else {
                        z = false;
                        z2 = false;
                        strLJFF = string3;
                    }
                } else {
                    if (TextUtils.isEmpty(string3)) {
                        if (TextUtils.isEmpty(string7)) {
                            if (!TextUtils.isEmpty(this.LIZJ.LLIZLLLIL)) {
                                strLJFF = this.LIZJ.LLIZLLLIL;
                                z = false;
                                z2 = true;
                            }
                        }
                        z = false;
                        z2 = false;
                        strLJFF = string7;
                    }
                    z = false;
                    z2 = false;
                    strLJFF = string3;
                }
                ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJZI(strLJJZZIII, string3, string7, string5, this.LIZJ.LLIZ, strLJJZZIII2, z2, z);
                C10SW c10sw = C10SW.LIZ;
                Map<String, String> map3 = this.LIZJ.LLILZ.LIZLLL.LIZ;
                c10sw.getClass();
                C10SW.LIZ(string3, strLJJZZIII, map3, z);
                if (!strLJFF.isEmpty()) {
                    C0XI4 c0xi4 = new C0XI4(strLJFF);
                    c0xi4.LJ("media_source", string);
                    c0xi4.LJ("ugdp_id", this.LIZJ.LLIZ);
                    c0xi4.LIZIZ(1, "ug_af_success");
                    strLJFF = c0xi4.LJFF();
                }
                if (map.get("retargeting_conversion_type") != null) {
                    string8 = map.get("retargeting_conversion_type").toString();
                } else {
                    string8 = string4;
                }
                boolean zEquals = string8.equals("re-attribution");
                C1893790zNh c1893790zNh = C1893790zNh.LIZ;
                boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
                if (!zEquals) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1893790zNh.getClass();
                C1893790zNh.LJIIIIZZ(strLJFF, string, "af", zBooleanValue, z3);
                C1893790zNh.LJIIJ("inc_activity_start", strLJFF, new HashMap());
                C1514430pVp.LIZLLL().booleanValue();
                this.LIZJ.getClass();
                if (!TextUtils.isEmpty(strLJFF)) {
                    try {
                    } catch (Exception e24) {
                        TryCatchGuardChecker.doCheck(e24);
                    }
                    if (!TextUtils.isEmpty(UriProtector.parse(strLJFF).getScheme())) {
                        C10SW c10sw2 = C10SW.LIZ;
                        EnumC993850byB enumC993850byB = EnumC993850byB.RECV_LINK;
                        c10sw2.getClass();
                        C10SW.LJI = enumC993850byB;
                        C10SW.LJIIIZ(UriProtector.parse(strLJFF), C0TCO.AF_LINK);
                    }
                    C10SW c10sw3 = C10SW.LIZ;
                    EnumC993850byB enumC993850byB2 = EnumC993850byB.RECV_EMPTY;
                    c10sw3.getClass();
                    C10SW.LJI = enumC993850byB2;
                } else {
                    C10SW c10sw32 = C10SW.LIZ;
                    EnumC993850byB enumC993850byB22 = EnumC993850byB.RECV_EMPTY;
                    c10sw32.getClass();
                    C10SW.LJI = enumC993850byB22;
                }
                C10SW.LIZ.getClass();
                C10SW.LIZLLL("request_success");
                if (((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJZ(strLJFF) && ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJI()) {
                    IFeedModuleService iFeedModuleService = (IFeedModuleService) ServiceManager.get().getService(IFeedModuleService.class);
                    try {
                        lastPathSegment = UriProtector.parse(strLJFF).getLastPathSegment();
                    } catch (Exception e25) {
                        TryCatchGuardChecker.doCheck(e25);
                        lastPathSegment = string4;
                    }
                    iFeedModuleService.getInsertAwemeInfoAsync(lastPathSegment, this.LIZJ.LLIZ, false);
                }
                if (map.get("af_sub5") != null) {
                    string4 = map.get("af_sub5").toString();
                }
                ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJJJ(string, string2, string4, new Function0<Unit>() { // from class: X.10UR
                    @Override // kotlin.jvm.functions.Function0
                    public final Unit invoke() {
                        C1893790zNh c1893790zNh2 = C1893790zNh.LIZ;
                        HashMap map4 = new HashMap();
                        String str2 = strLJFF;
                        c1893790zNh2.getClass();
                        C1893790zNh.LJIIJ("inc_activity_deep_link_start", str2, map4);
                        String strLJJ = strLJFF;
                        long j4 = this.LLILLL.LIZIZ;
                        String str3 = string;
                        if (TextUtils.isEmpty(strLJJ)) {
                            return null;
                        }
                        String lowerCase = UriProtector.parse(strLJJ).getScheme().toLowerCase();
                        if (TextUtils.isEmpty(lowerCase) || C19308310gL.LJII.LIZ(strLJJ)) {
                            return null;
                        }
                        if ("sslocal".equals(lowerCase) || "localsdk".equals(lowerCase)) {
                            strLJJ = C10ZH.LIZIZ.LJJ(strLJJ);
                        }
                        Uri uri = UriProtector.parse(strLJJ);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("channel", "appsflyer");
                            jSONObject.put("target", strLJJ);
                            jSONObject.put("total_time", SystemClock.uptimeMillis() - C1150504el.LIZ().LJJII);
                            jSONObject.put("fetch_time", SystemClock.uptimeMillis() - j4);
                        } catch (JSONException e26) {
                            TryCatchGuardChecker.doCheck(e26);
                        }
                        C793770VBv.LJ("deep_link", jSONObject);
                        C10UW.LIZ.LIZIZ(uri, lowerCase, "af");
                        C2000607sa.LIZ.getClass();
                        C2000607sa.LIZ(uri, str3);
                        return null;
                    }
                }, zEquals);
                C1577460r9U.LLILLJJLI.LJIIJ(map);
                INUJUnderTakeManager.LIZ.getClass();
                C1589520rSw.LIZ().LJIIIZ();
                return;
            }
            return;
        } catch (Exception e26) {
            e = e26;
        }
        TryCatchGuardChecker.doCheck(e);
    }

    public C19259210Wg(InitAppsFlyer initAppsFlyer, Context context, long j) {
        this.LIZJ = initAppsFlyer;
        this.LIZ = context;
        this.LIZIZ = j;
    }
}
