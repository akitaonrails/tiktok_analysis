package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.ad.feed.IClickBackTimeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.boc.IBOCFrequencyControlUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ciO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022500ciO {
    public static void LIZJ(String str, String str2, JSONObject jSONObject, long j) {
        int boc3pCookieAction;
        Aweme awemeZr;
        Aweme awemeFr;
        IClickBackTimeService iClickBackTimeService;
        Map<String, Object> mapLIZ = new C1022590ciX().LIZ();
        if (((Boolean) C07AM.LIZ.getValue()).booleanValue()) {
            mapLIZ.put("device_type", Integer.valueOf(C1016790cZB.LIZ()));
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
        if (linkedHashMap.get("if_text_more_panel") == null) {
            mapLIZ.put("if_text_more_panel", String.valueOf(C0SWD.LIZ));
            C0SWD.LIZ = 0;
        }
        linkedHashMap.keySet();
        JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (jSONObjectLIZ.opt(str3) != null) {
                    break;
                } else {
                    C12865051r.LIZIZ(jSONObjectLIZ, str3, value);
                }
            } else {
                C12865051r.LIZIZ(jSONObject, "ad_extra_data", C786410Ut5.J3(jSONObjectLIZ));
                break;
            }
        }
        if (((Boolean) C276430AsT.LIZ.getValue()).booleanValue()) {
            try {
                JSONObject jSONObjectLIZ2 = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                Long lValueOf = null;
                IBOCFrequencyControlUtils iBOCFrequencyControlUtils = (IBOCFrequencyControlUtils) PluggableExtentionKt.pluggableSpi$default(IBOCFrequencyControlUtils.class, false, false, false, 14, null);
                AwemeRawAd awemeRawAd = null;
                if (iBOCFrequencyControlUtils != null) {
                    lValueOf = Long.valueOf(iBOCFrequencyControlUtils.LJ());
                }
                C12865051r.LIZIZ(jSONObjectLIZ2, "last_open_boc_ts", lValueOf);
                IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
                if (iAwemeService != null && (awemeZr = iAwemeService.zr(str2)) != null) {
                    awemeRawAd = awemeZr.getAwemeRawAd();
                }
                if (awemeRawAd != null) {
                    boc3pCookieAction = awemeRawAd.getBoc3pCookieAction();
                } else {
                    boc3pCookieAction = -1;
                }
                C12865051r.LIZIZ(jSONObjectLIZ2, "boc_3p_cookie_action", Integer.valueOf(boc3pCookieAction));
                C12865051r.LIZIZ(jSONObject, "ad_extra_data", C786410Ut5.J3(jSONObjectLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (str != null && str2 != null) {
            String strOptString = jSONObject.optString("refer");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[appendDynamicParams] creativeId=");
            sbLIZ.append(str2);
            sbLIZ.append(", refer=");
            sbLIZ.append(strOptString);
            sbLIZ.append(", tag=");
            sbLIZ.append(str);
            C1022620cia.LIZ("ClickBackTime", C2188811AlT.LIZIZ(sbLIZ));
            IAwemeService iAwemeService2 = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
            if (iAwemeService2 != null && (awemeFr = iAwemeService2.Fr(str2)) != null && (iClickBackTimeService = (IClickBackTimeService) PluggableExtentionKt.pluggableSpi$default(IClickBackTimeService.class, false, false, false, 14, null)) != null) {
                iClickBackTimeService.LIZIZ(awemeFr, strOptString, str);
            }
            if (C293340Bee.LIZIZ) {
                C1022420ciG c1022420ciG = new C1022420ciG(true, str, C1022550ciT.LIZ("click"), strOptString, str2, jSONObject, null, 64);
                if (C293340Bee.LIZJ) {
                    C1023060cjI.LIZIZ(c1022420ciG);
                    Map mapLIZ2 = C1023060cjI.LIZ(c1022420ciG);
                    if (!mapLIZ2.isEmpty()) {
                        JSONObject jSONObjectLIZ3 = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                        Iterator it3 = ((LinkedHashMap) mapLIZ2).entrySet().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it3.next();
                                String str4 = (String) entry2.getKey();
                                Object value2 = entry2.getValue();
                                if (jSONObjectLIZ3.opt(str4) != null) {
                                    break;
                                } else {
                                    C12865051r.LIZIZ(jSONObjectLIZ3, str4, value2);
                                }
                            } else {
                                C12865051r.LIZIZ(jSONObject, "ad_extra_data", C786410Ut5.J3(jSONObjectLIZ3));
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (C1152810g6Z.LIZ() && str != null) {
            C1022570ciV.LIZ(str, "realtime_click", jSONObject.optString("refer"), jSONObject);
        }
        LIZIZ(j, str, str2, jSONObject, false);
    }

    public static void LIZ(String str, String str2, String str3, JSONObject jSONObject, long j) {
        C1019240cd8.LIZ.LIZ(str, str2, str3, jSONObject);
        if (TextUtils.equals("click", str2)) {
            LIZJ(str, str3, jSONObject, j);
            try {
                jSONObject.put("has_v3", 1);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        } else {
            String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "enable_send_staging_adlog", "v3", true);
            if (TextUtils.equals(strLJJ, "v3")) {
                return;
            }
            if (TextUtils.equals(strLJJ, "all")) {
                try {
                    jSONObject.put("_ad_staging_flag", "1");
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(e2);
                }
            }
        }
        if (C2214471Bll.LIZ() != null) {
            IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
            C844470XAv.LIZ.getClass();
            iAppLogDependLIZ.onEventV1(C844470XAv.LIZ(), str, null, str2, str3, j, jSONObject);
        }
    }

    public static void LIZIZ(final long j, final String str, final String str2, JSONObject jSONObject, final boolean z) {
        final JSONObject jSONObjectLIZ = C475630Ikz.LIZ(jSONObject);
        Runnable runnable = new Runnable() { // from class: X.0cj9
            @Override // java.lang.Runnable
            public final void run() {
                long j2;
                boolean z2;
                String str3 = str2;
                JSONObject jSONObject2 = jSONObjectLIZ;
                String str4 = str;
                boolean z3 = z;
                long j3 = j;
                C1C7U.LIZ("CommonLogUtils@def0.onRealTimeClickAdEvent$1L");
                try {
                    j2 = CastLongProtector.parseLong(str3);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    j2 = 0;
                }
                JSONObject jSONObject3 = new JSONObject();
                String strOptString = jSONObject2.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString)) {
                    z2 = true;
                } else {
                    try {
                        JSONObject jSONObject4 = new JSONObject(strOptString);
                        C01GW c01gw = C1024180cl6.LIZ;
                        jSONObject4.put("system_start_timestamp", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                        jSONObject2.put("ad_extra_data", C786410Ut5.J3(jSONObject4));
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C1AF0.LJ(e2);
                    }
                    z2 = false;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals("has_v3", next) && !TextUtils.equals("category", next)) {
                        try {
                            jSONObject3.put(next, jSONObject2.opt(next));
                        } catch (JSONException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            C1AF0.LJ(e3);
                        }
                    }
                }
                if (z2) {
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        C01GW c01gw2 = C1024180cl6.LIZ;
                        jSONObject5.put("system_start_timestamp", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                        jSONObject3.put("ad_extra_data", C786410Ut5.J3(jSONObject5));
                    } catch (JSONException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        C1AF0.LJ(e4);
                    }
                }
                try {
                    jSONObject3.put("tag", str4);
                } catch (JSONException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                }
                JSONObject jSONObject6 = null;
                if (!z3) {
                    C1022670cif.LIZ.getClass();
                    ((InterfaceC1022890cj1) C1022670cif.LJIIJ.getValue()).LIZ(new C1074600e4Q(null, jSONObject3, "click", str3));
                }
                C1022990cjB c1022990cjB = new C1022990cjB();
                c1022990cjB.LIZJ = str4;
                c1022990cjB.LIZIZ = "realtime_click";
                c1022990cjB.LIZLLL = j2;
                c1022990cjB.LJ = j3;
                c1022990cjB.LIZ = "event_v3";
                c1022990cjB.LJFF = jSONObject3;
                if (TextUtils.isEmpty("event_v3")) {
                    c1022990cjB.LIZ = "event_v1";
                }
                C1022980cjA c1022980cjA = new C1022980cjA(c1022990cjB);
                if (C2214471Bll.LIZ() != null) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("category", c1022980cjA.LIZ, bundle);
                    C844470XAv.LIZ.getClass();
                    bundle.putLong("nt", C804420Vh2.LJ(C844470XAv.LIZ()).getValue());
                    C786410Ut5.LJJJI("tag", c1022980cjA.LIZJ, bundle);
                    C786410Ut5.LJJJI("label", null, bundle);
                    C786410Ut5.LJJJI("value", String.valueOf(c1022980cjA.LIZLLL), bundle);
                    C786410Ut5.LJJJI("log_extra", null, bundle);
                    C786410Ut5.LJJJI("ext_value", String.valueOf(c1022980cjA.LJ), bundle);
                    C786410Ut5.LJJJI("is_ad_event", "1", bundle);
                    JSONObject jSONObject7 = c1022980cjA.LJFF;
                    if (jSONObject7 != null) {
                        try {
                            Object objOpt = jSONObject7.opt("ad_extra_data");
                            if (objOpt != null) {
                                C786410Ut5.LJJJI("ad_extra_data", objOpt.toString(), bundle);
                            }
                            Iterator<String> itKeys2 = c1022980cjA.LJFF.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                C786410Ut5.LJJJI(next2, JSONObjectProtectorUtils.getString(c1022980cjA.LJFF, next2), bundle);
                            }
                        } catch (JSONException e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            C1AF0.LJ(e6);
                        }
                    }
                    C2214471Bll.LIZ().onEventV3Bundle(c1022980cjA.LIZIZ, bundle);
                }
                try {
                    n nVarLJIILIIL = GsonProtectorUtils.parse(new p(), JSONObjectProtectorUtils.getString(jSONObject2, "log_extra")).LJIILIIL();
                    JSONObject jSONObject8 = new JSONObject();
                    if (nVarLJIILIIL.LJJIIZ("rit") != null) {
                        jSONObject8.put("ctr_rit", nVarLJIILIIL.LJJIIZ("rit").LJIL());
                    }
                    jSONObject6 = jSONObject8;
                } catch (JSONException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    C1AF0.LJ(e7);
                }
                C0XJ6.LIZ("ctr_monitor", "ctr_click", jSONObject6);
                C1C7U.LIZIZ("CommonLogUtils@def0.onRealTimeClickAdEvent$1L");
            }
        };
        IAppLogDepend iAppLogDependLIZ = C2214471Bll.LIZ();
        if (!z && C257760A8g.LIZIZ && iAppLogDependLIZ != null && iAppLogDependLIZ.getLogThreadPool() != null && !iAppLogDependLIZ.getLogThreadPool().isShutdown()) {
            iAppLogDependLIZ.getLogThreadPool().execute(runnable);
        } else {
            runnable.run();
        }
    }
}
