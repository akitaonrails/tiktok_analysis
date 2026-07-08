package X;

import android.os.Handler;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ad.recording.engageinfo.IAdLandPageEngageInfoProvider;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.appmeasurement.IAppMeasurementProvider;
import com.ss.android.ugc.aweme.commercialize.engagement.trace.EngagementTrace;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS101S1000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS59S0010000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022660cie extends C09AY implements Function0<InterfaceC1022870ciz<C1074600e4Q<CommonAdData, JSONObject, String, String>>> {
    public C1022660cie() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1022870ciz<C1074600e4Q<CommonAdData, JSONObject, String, String>> invoke() {
        C1022840ciw c1022840ciw = new C1022840ciw(C1022860ciy.LIZ);
        C1022670cif.LIZ.getClass();
        final IMainService iMainService = (IMainService) C1022670cif.LJII.getValue();
        final IComplianceService iComplianceService = (IComplianceService) C1022670cif.LJI.getValue();
        C1022840ciw c1022840ciwLIZIZ = c1022840ciw.LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>(iMainService, iComplianceService) { // from class: X.0cj3
            public final IMainService LIZ;
            public final IComplianceService LIZIZ;

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                boolean z;
                JSONObject jSONObject = (JSONObject) c1074600e4Q.LIZIZ;
                C c = c1074600e4Q.LIZJ;
                D d = c1074600e4Q.LIZLLL;
                if (Intrinsics.LJFF(c, "show")) {
                    boolean zAdd = C1019270cdB.LJI.add((String) d);
                    boolean z2 = true;
                    boolean z3 = !this.LIZ.isLimitAdTrackingEnabled();
                    if (this.LIZIZ.LJIILL() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z3 || !z) {
                        z2 = false;
                    }
                    JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("isFirst", new AwS59S0010000_16(zAdd, 0));
                    linkedHashMap.put("optOutStatus", new AwS59S0010000_16(z2, 1));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object objInvoke = ((Function0) entry.getValue()).invoke();
                        if (objInvoke != null) {
                            C12865051r.LIZIZ(jSONObjectLIZ, str, objInvoke);
                        }
                    }
                    C12865051r.LIZIZ(jSONObject, "ad_extra_data", jSONObjectLIZ);
                }
            }

            {
                this.LIZ = iMainService;
                this.LIZIZ = iComplianceService;
            }
        });
        final InterfaceC1023010cjD interfaceC1023010cjDLIZ = C1022670cif.LIZ();
        final Gson gson = (Gson) C1022670cif.LIZJ.getValue();
        C1022840ciw c1022840ciwLIZIZ2 = c1022840ciwLIZIZ.LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>(interfaceC1023010cjDLIZ, gson) { // from class: X.0cir
            public final InterfaceC1023010cjD LIZ;
            public final Gson LIZIZ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                B b = c1074600e4Q.LIZIZ;
                C c = c1074600e4Q.LIZJ;
                String str = (String) c1074600e4Q.LIZLLL;
                String str2 = (String) c;
                JSONObject jSONObject = (JSONObject) b;
                JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                if (!jSONObjectLIZ.has("session_info")) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    this.LIZ.LJ(new C1024210cl9(str2, str, jSONObjectLIZ, jSONObject), new C1024690clv(linkedHashMap, this.LIZIZ));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        Object objInvoke = ((Function0) entry.getValue()).invoke();
                        if (objInvoke != null) {
                            C12865051r.LIZIZ(jSONObjectLIZ, str3, objInvoke);
                        }
                    }
                    C12865051r.LIZIZ(jSONObject, "ad_extra_data", jSONObjectLIZ);
                }
            }

            {
                this.LIZ = interfaceC1023010cjDLIZ;
                this.LIZIZ = gson;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ads_");
                sbLIZ.append(C1022790cir.class.getSimpleName());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        final Handler handler = (Handler) C1022670cif.LJ.getValue();
        final IAppMeasurementProvider iAppMeasurementProvider = (IAppMeasurementProvider) C1022670cif.LJFF.getValue();
        C1022840ciw c1022840ciwLIZIZ3 = c1022840ciwLIZIZ2.LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>(handler, iAppMeasurementProvider) { // from class: X.0cin
            public final Handler LIZ;
            public final IAppMeasurementProvider LIZIZ;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                final int i;
                B b = c1074600e4Q.LIZIZ;
                C c = c1074600e4Q.LIZJ;
                final String str = (String) c1074600e4Q.LIZLLL;
                JSONObject jSONObject = (JSONObject) b;
                boolean zLIZIZ = this.LIZIZ.LIZIZ(jSONObject);
                final String strOptString = jSONObject.optString("tag");
                if (Intrinsics.LJFF(strOptString, "draw_ad")) {
                    if ((Intrinsics.LJFF(c, "break") || Intrinsics.LJFF(c, "over")) && !zLIZIZ) {
                        final long jOptLong = jSONObject.optLong("duration");
                        final long jOptLong2 = jSONObject.optLong("video_length");
                        final String strOptString2 = jSONObject.optString("ad_extra_data");
                        final String strOptString3 = jSONObject.optString("log_extra");
                        final String strOptString4 = jSONObject.optString("group_id");
                        final long jOptLong3 = jSONObject.optLong("percent");
                        if (Intrinsics.LJFF(c, "break")) {
                            i = 1;
                        } else if (Intrinsics.LJFF(c, "over")) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        for (final InterfaceC1022770cip interfaceC1022770cip : C1045510dJV.LIZ) {
                            C786410Ut5.LJJZZIII(this.LIZ, new Runnable() { // from class: X.0cio
                                public final void LIZ() {
                                    if (interfaceC1022770cip.valid(jOptLong, jOptLong2)) {
                                        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(strOptString, interfaceC1022770cip.label(true), str, strOptString3, strOptString4);
                                        c1022820ciuLJ.LIZJ(strOptString2, "ad_extra_data");
                                        c1022820ciuLJ.LIZIZ(Integer.valueOf(i), "trigger_from");
                                        c1022820ciuLJ.LIZIZ(Long.valueOf(jOptLong3), "percent");
                                        c1022820ciuLJ.LIZIZ(Long.valueOf(jOptLong), "duration");
                                        c1022820ciuLJ.LIZIZ(Long.valueOf(jOptLong2), "video_length");
                                        c1022820ciuLJ.LJII();
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("VideoViewEventAdapter@e57f.invoke$1$1$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("VideoViewEventAdapter@e57f.invoke$1$1$1");
                                }
                            });
                        }
                    }
                }
            }

            {
                this.LIZ = handler;
                this.LIZIZ = iAppMeasurementProvider;
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0ciN
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                B b = c1074600e4Q.LIZIZ;
                C c = c1074600e4Q.LIZJ;
                JSONObject jSONObject = (JSONObject) b;
                String strOptString = jSONObject.optString("tag");
                if (Intrinsics.LJFF(strOptString, "draw_ad") && (Intrinsics.LJFF(c, "break") || Intrinsics.LJFF(c, "over"))) {
                    JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                    if (jSONObjectLIZ.has("duration")) {
                        C12865051r.LIZIZ(jSONObject, "duration", Long.valueOf(jSONObjectLIZ.optLong("duration")));
                    }
                    if (jSONObjectLIZ.has("video_length")) {
                        C12865051r.LIZIZ(jSONObject, "video_length", Long.valueOf(jSONObjectLIZ.optLong("video_length")));
                    }
                }
                if (Intrinsics.LJFF(strOptString, "draw_ad") && Intrinsics.LJFF(c, "show")) {
                    JSONObject jSONObjectLIZ2 = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                    if (jSONObjectLIZ2.has("study_id")) {
                        C12865051r.LIZIZ(jSONObject, "study_id", Long.valueOf(jSONObjectLIZ2.optLong("study_id")));
                    }
                }
            }
        });
        final EngagementTrace engagementTrace = (EngagementTrace) C1022670cif.LIZLLL.getValue();
        C1022840ciw c1022840ciwLIZIZ4 = c1022840ciwLIZIZ3.LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>(engagementTrace) { // from class: X.0ciY
            public final EngagementTrace LIZ;

            {
                this.LIZ = engagementTrace;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ads_");
                sbLIZ.append(C1022600ciY.class.getSimpleName());
                C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                B b = c1074600e4Q.LIZIZ;
                C c = c1074600e4Q.LIZJ;
                JSONObject jSONObject = (JSONObject) b;
                if (C1022540ciS.LIZ.contains(c) || Intrinsics.LJFF(c, "otherclick") || Intrinsics.LJFF(c, "music_click") || Intrinsics.LJFF(c, "challenge_click")) {
                    JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : this.LIZ.LIZ().entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!jSONObjectLIZ.has(key)) {
                            linkedHashMap.put(key, new AwS560S0100000_16(value, 760));
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        String str = (String) entry2.getKey();
                        Object objInvoke = ((Function0) entry2.getValue()).invoke();
                        if (objInvoke != null) {
                            C12865051r.LIZIZ(jSONObjectLIZ, str, objInvoke);
                        }
                    }
                    C12865051r.LIZIZ(jSONObject, "ad_extra_data", jSONObjectLIZ);
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0ciZ
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                InterfaceC1030370cv5 interfaceC1030370cv5;
                if (C1022540ciS.LIZ.contains(c1074600e4Q.LIZJ) && (interfaceC1030370cv5 = (InterfaceC1030370cv5) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1030370cv5.class)) != null) {
                    interfaceC1030370cv5.P90();
                }
            }
        });
        final IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider = (IAdLandPageEngageInfoProvider) C1022670cif.LJIIIIZZ.getValue();
        C1022840ciw c1022840ciwLIZIZ5 = c1022840ciwLIZIZ4.LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>(iAdLandPageEngageInfoProvider) { // from class: X.0cig
            public final IAdLandPageEngageInfoProvider LIZ;

            {
                this.LIZ = iAdLandPageEngageInfoProvider;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                D d = c1074600e4Q.LIZLLL;
                C c = c1074600e4Q.LIZJ;
                String strOptString = ((JSONObject) c1074600e4Q.LIZIZ).optString("tag");
                if (d != 0 && c != 0 && strOptString != null) {
                    String strOptString2 = ((JSONObject) c1074600e4Q.LIZIZ).optString("refer");
                    IAdLandPageEngageInfoProvider iAdLandPageEngageInfoProvider2 = this.LIZ;
                    iAdLandPageEngageInfoProvider2.LIZ((String) d, (String) c, strOptString, strOptString2);
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0cj4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                if (((Boolean) C0A9X.LIZ.getValue()).booleanValue()) {
                    JSONObject jSONObject = (JSONObject) c1074600e4Q.LIZIZ;
                    JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C844470XAv.LIZ.getClass();
                    linkedHashMap.put("google_aid", new C1022930cj5(C844470XAv.LIZ()));
                    linkedHashMap.put("open_udid", new C1022940cj6());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        Object objInvoke = ((Function0) entry.getValue()).invoke();
                        if (objInvoke != null) {
                            C12865051r.LIZIZ(jSONObjectLIZ, str, objInvoke);
                        }
                    }
                    C12865051r.LIZIZ(jSONObject, "ad_extra_data", jSONObjectLIZ);
                }
            }
        });
        final IAwemeService iAwemeService = (IAwemeService) C1022670cif.LJIIIZ.getValue();
        return c1022840ciwLIZIZ5.LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>(iAwemeService) { // from class: X.0cib
            public final IAwemeService LIZ;

            {
                this.LIZ = iAwemeService;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                IAwemeService iAwemeService2;
                Aweme awemeZr;
                String aid;
                C c = c1074600e4Q.LIZJ;
                String str = (String) c1074600e4Q.LIZLLL;
                if ((Intrinsics.LJFF(c, "realtime_click") || Intrinsics.LJFF(c, "click")) && (iAwemeService2 = this.LIZ) != null && (awemeZr = iAwemeService2.zr(str)) != null && (aid = awemeZr.getAid()) != null) {
                    C1440005kM.LIZ(new C1022640cic(aid));
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0ciK
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.LinkedHashMap] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                ?? linkedHashMap;
                JSONObject jSONObject = (JSONObject) c1074600e4Q.LIZIZ;
                String str = (String) c1074600e4Q.LIZJ;
                String str2 = (String) c1074600e4Q.LIZLLL;
                if (C293340Bee.LIZIZ) {
                    C1022420ciG c1022420ciG = new C1022420ciG(false, jSONObject.optString("tag"), C1022550ciT.LIZ(str), jSONObject.optString("refer"), str2, jSONObject, null, 64);
                    if (C293340Bee.LIZJ) {
                        C1023060cjI.LIZIZ(c1022420ciG);
                        Map mapLIZ = C1023060cjI.LIZ(c1022420ciG);
                        C1008210cLL c1008210cLL = C1023060cjI.LIZJ;
                        c1008210cLL.getClass();
                        Map<String, C1023230cjZ> map = c1008210cLL.LIZ.get(str2);
                        if (map == null) {
                            linkedHashMap = C2097608Jq.LJ();
                        } else {
                            linkedHashMap = new LinkedHashMap();
                            synchronized (map) {
                                try {
                                    for (C1023230cjZ c1023230cjZ : map.values()) {
                                        if (C1022400ciE.LIZ(c1023230cjZ.LIZ, c1022420ciG)) {
                                            linkedHashMap.putAll(c1023230cjZ.LIZIZ(c1022420ciG));
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                        if (mapLIZ.isEmpty() || linkedHashMap.isEmpty()) {
                            JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                            for (Map.Entry entry : ((LinkedHashMap) mapLIZ).entrySet()) {
                                C12865051r.LIZIZ(jSONObjectLIZ, (String) entry.getKey(), entry.getValue());
                            }
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                C12865051r.LIZIZ(jSONObjectLIZ, (String) entry2.getKey(), entry2.getValue());
                            }
                            C12865051r.LIZIZ(jSONObject, "ad_extra_data", C786410Ut5.J3(jSONObjectLIZ));
                        }
                    }
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0cj2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                AwemeRawAd awemeRawAd;
                String str;
                String str2;
                A a = c1074600e4Q.LIZ;
                B b = c1074600e4Q.LIZIZ;
                C c = c1074600e4Q.LIZJ;
                JSONObject jSONObject = (JSONObject) b;
                CommonAdData commonAdData = (CommonAdData) a;
                String str3 = null;
                if ((commonAdData instanceof AwemeRawAd) && (awemeRawAd = (AwemeRawAd) commonAdData) != null && Intrinsics.LJFF(c, "receive")) {
                    OmVast omVast = awemeRawAd.getOmVast();
                    if (omVast != null && (str2 = omVast.vastContent) != null && !a0.LJJJIL(str2)) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    if (omVast != null) {
                        str3 = omVast.vastUrl;
                    }
                    JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("has_vast_content", new AwS101S1000000_16(str, 4));
                    linkedHashMap.put("vast_url", new AwS101S1000000_16(str3, 5));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str4 = (String) entry.getKey();
                        Object objInvoke = ((Function0) entry.getValue()).invoke();
                        if (objInvoke != null) {
                            C12865051r.LIZIZ(jSONObjectLIZ, str4, objInvoke);
                        }
                    }
                    C12865051r.LIZIZ(jSONObject, "ad_extra_data", jSONObjectLIZ);
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0ciM
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                JSONObject jSONObject = (JSONObject) c1074600e4Q.LIZIZ;
                C c = c1074600e4Q.LIZJ;
                JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                if ((Intrinsics.LJFF(c, "realtime_click") || Intrinsics.LJFF(c, "click")) && !jSONObjectLIZ.has("if_text_more_panel")) {
                    C12865051r.LIZIZ(jSONObjectLIZ, "if_text_more_panel", String.valueOf(C0SWD.LIZ));
                    C0SWD.LIZ = 0;
                }
                C12865051r.LIZIZ(jSONObject, "ad_extra_data", C786410Ut5.J3(jSONObjectLIZ));
                if (((Boolean) C07AM.LIZ.getValue()).booleanValue()) {
                    JSONObject jSONObject2 = (JSONObject) c1074600e4Q.LIZIZ;
                    JSONObject jSONObjectLIZ2 = C12865051r.LIZ(jSONObject2.optString("ad_extra_data"));
                    C12865051r.LIZIZ(jSONObjectLIZ2, "device_type", Integer.valueOf(C1016790cZB.LIZ()));
                    C12865051r.LIZIZ(jSONObject2, "ad_extra_data", C786410Ut5.J3(jSONObjectLIZ2));
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0ciU
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) throws JSONException {
                if (C1152810g6Z.LIZ()) {
                    JSONObject jSONObject = (JSONObject) c1074600e4Q.LIZIZ;
                    C1022570ciV.LIZ(jSONObject.optString("tag"), (String) c1074600e4Q.LIZJ, jSONObject.optString("refer"), jSONObject);
                }
            }
        }).LIZIZ(new InterfaceC1022890cj1<C1074600e4Q<CommonAdData, JSONObject, String, String>>() { // from class: X.0ciq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1022890cj1
            public final void LIZ(C1074600e4Q c1074600e4Q) {
                JSONObject jSONObject = (JSONObject) c1074600e4Q.LIZIZ;
                JSONObject jSONObjectLIZ = C12865051r.LIZ(jSONObject.optString("ad_extra_data"));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("ams_unique_id", new C1022800cis(C2095008Iq.LJIILIIL(jSONObjectLIZ.optString("track_now_time"))));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    Object objInvoke = ((Function0) entry.getValue()).invoke();
                    if (objInvoke != null) {
                        C12865051r.LIZIZ(jSONObjectLIZ, str, objInvoke);
                    }
                }
                C12865051r.LIZIZ(jSONObject, "ad_extra_data", jSONObjectLIZ);
            }
        });
    }
}
