package X;

import Y.ARunnableS20S1200000_16;
import Y.ARunnableS21S1100000_16;
import Y.ARunnableS8S2100000_16;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.realtime.ICommerceLandPageRealtimeResourceModule;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0dEs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042640dEs implements InterfaceC1002280cBm {
    public static String LL;
    public static final Map<String, Pair<Set<String>, Set<String>>> LLILLJJLI = new LinkedHashMap();

    @Override // X.InterfaceC1037760d70
    public final void Fd1(SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Ou(SparkContext sparkContext, Context context) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void TQ1(Aweme aweme) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Yi0(int i, List<? extends Aweme> list) {
    }

    @Override // X.InterfaceC1037760d70
    public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void gz1(C0SCL c0scl, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void hv(SparkContext sparkContext, int i, String str) {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1037760d70
    public final void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void r3(Aweme aweme) {
    }

    @Override // X.InterfaceC1037760d70
    public final void wK1(SparkContext sparkContext, String str) {
    }

    public static boolean LIZ() {
        InterfaceC1541390qDJ ttWebViewRuntimeService;
        return C2206681BYc.LIZJ() && ((Boolean) C2206681BYc.LJ.getValue()).booleanValue() && (ttWebViewRuntimeService = TTWebViewHelper.INSTANCE.getTtWebViewRuntimeService()) != null && ttWebViewRuntimeService.isPredictorEnable();
    }

    public static void LIZIZ(InterfaceC1041500dD2 interfaceC1041500dD2) {
        Object c098200Yq;
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        Boolean boolValueOf;
        String strLJII;
        int iLJJJ;
        JSONObject jSONObjectE0 = AdLandPagePreloadServiceImpl.LJI.E0(LL);
        if (jSONObjectE0 == null) {
            C1490740otc.LIZ.LIZ("md5Json null, return", EnumC1490770otf.W, "CommerceLandPageTTWebModule_");
            return;
        }
        JSONObject jSONObjectLIZ = C1040660dBg.LIZ(LL);
        if (jSONObjectLIZ == null) {
            C1490740otc.LIZ.LIZ("manifestJson null, return", EnumC1490770otf.W, "CommerceLandPageTTWebModule_");
            return;
        }
        String realCreativeIdStr = interfaceC1041500dD2.getRealCreativeIdStr();
        Map<String, Pair<Set<String>, Set<String>>> map = LLILLJJLI;
        if (((LinkedHashMap) map).get(realCreativeIdStr) != null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(realCreativeIdStr);
            sbLIZ.append(", ");
            sbLIZ.append(interfaceC1041500dD2.getLoadUrl());
            sbLIZ.append(", duplicated preload, return");
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.W, "CommerceLandPageTTWebModule_");
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        map.put(realCreativeIdStr, new Pair<>(linkedHashSet, new LinkedHashSet()));
        Iterator<String> itKeys = jSONObjectE0.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            C1043460dGC c1043460dGC = C1043460dGC.LIZ;
            String str = LL;
            c1043460dGC.getClass();
            Pair pairLJFF = C1043460dGC.LJFF(next, str);
            if (pairLJFF != null && ((Number) pairLJFF.getSecond()).intValue() == 1) {
                String str2 = (String) pairLJFF.getFirst();
                try {
                    c098200Yq = new C0VSJ(LL, str2).getAbsolutePath();
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("get gecko file path failed, url:");
                    sbLIZ2.append(next);
                    sbLIZ2.append(", channelPath:");
                    sbLIZ2.append(LL);
                    sbLIZ2.append(", md5:");
                    sbLIZ2.append(str2);
                    c1490740otc2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), EnumC1490770otf.E, "CommerceLandPageTTWebModule_");
                }
                if (C189200o6.m8isSuccessimpl(c098200Yq) && (jSONObjectOptJSONObject = jSONObjectLIZ.optJSONObject(str2)) != null && (!((Boolean) C2206681BYc.LJII.getValue()).booleanValue() || !Intrinsics.LJFF(jSONObjectOptJSONObject.optString("resourceType"), "document"))) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cacheStrategy");
                    if (jSONObjectOptJSONObject2 != null) {
                        strOptString = jSONObjectOptJSONObject2.optString("hitStrategy");
                    } else {
                        strOptString = null;
                    }
                    if (!Intrinsics.LJFF(strOptString, "once")) {
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("respHeader");
                        InterfaceC1541390qDJ ttWebViewRuntimeService = TTWebViewHelper.INSTANCE.getTtWebViewRuntimeService();
                        if (ttWebViewRuntimeService != null) {
                            Map<String, String> mapLIZJ = C2097908Jt.LIZJ(new Pair(next, c098200Yq));
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("isMainResource", false);
                            jSONObject.put("stayTimeMs", ((Number) C2206681BYc.LJFF.getValue()).longValue());
                            if (jSONObjectOptJSONObject3 != null) {
                                if (!jSONObjectOptJSONObject3.has("Content-Type") && !jSONObjectOptJSONObject3.has("content-type")) {
                                    String strLIZJ = C1043460dGC.LIZJ(next);
                                    if (!u.LJIIZILJ(strLIZJ, ".shtml", false) && !u.LJIIZILJ(strLIZJ, ".do", false)) {
                                        if (a0.LJJIIZI(strLIZJ, e3.d, false) && (iLJJJ = a0.LJJJ(strLIZJ.substring(a0.LJJJJI(strLIZJ, e3.d, 0, 6)), "/", 0, false, 6)) > -1) {
                                            C1043460dGC c1043460dGC2 = C1043460dGC.LIZ;
                                            String strSubstring = strLIZJ.substring(0, iLJJJ + a0.LJJJJI(strLIZJ, e3.d, 0, 6));
                                            c1043460dGC2.getClass();
                                            strLJII = C1043460dGC.LJII(strSubstring);
                                        } else {
                                            C1043460dGC.LIZ.getClass();
                                            strLJII = C1043460dGC.LJII(strLIZJ);
                                        }
                                    } else {
                                        strLJII = "text/html";
                                    }
                                    if (strLJII.length() > 0) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(strLJII);
                                        sbLIZ3.append("; charset=UTF-8");
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                        jSONObjectOptJSONObject3.put("Content-Type", strLIZIZ);
                                        C1490740otc c1490740otc3 = C1490740otc.LIZ;
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("add content-type : ");
                                        sbLIZ4.append(strLIZIZ);
                                        sbLIZ4.append(", ");
                                        sbLIZ4.append(next);
                                        C1490740otc.LIZIZ(c1490740otc3, C2188811AlT.LIZIZ(sbLIZ4), null, "CommerceLandPageTTWebModule_", 2);
                                    }
                                }
                                jSONObject.put("responseHeaders", C786410Ut5.J3(jSONObjectOptJSONObject3));
                            }
                            C786410Ut5.J3(jSONObject.put("bizInfo", new JSONObject().put(FollowStatusChangeMethod.PARAM_UID, realCreativeIdStr)));
                            boolValueOf = Boolean.valueOf(ttWebViewRuntimeService.preloadFile(realCreativeIdStr, mapLIZJ, jSONObject, null));
                        } else {
                            boolValueOf = null;
                        }
                        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                            linkedHashSet.add(next);
                            C1490740otc c1490740otc4 = C1490740otc.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("success gecko preload url with ttweb: ");
                            sbLIZ5.append(next);
                            C1490740otc.LIZIZ(c1490740otc4, C2188811AlT.LIZIZ(sbLIZ5), null, "CommerceLandPageTTWebModule_", 2);
                        } else {
                            C1490740otc c1490740otc5 = C1490740otc.LIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("failed gecko preload url with ttweb: ");
                            sbLIZ6.append(next);
                            c1490740otc5.LIZ(C2188811AlT.LIZIZ(sbLIZ6), EnumC1490770otf.E, "CommerceLandPageTTWebModule_");
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1002280cBm
    public final void E61(InterfaceC1041500dD2 interfaceC1041500dD2, String str) {
        C1043040dFW.LIZ(new ARunnableS21S1100000_16(interfaceC1041500dD2, str, 4));
    }

    @Override // X.InterfaceC1037760d70
    public final void V62(WebKitView webKitView, C1035880d3y c1035880d3y) {
        if (C2206681BYc.LIZ() && c1035880d3y != null && LIZ()) {
            LIZIZ(c1035880d3y);
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("try trigger preload gecko bindWithView, ");
            sbLIZ.append(LL);
            sbLIZ.append(", ");
            sbLIZ.append(c1035880d3y.getLoadUrl());
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.I, "CommerceLandPageTTWebModule_");
        }
    }

    @Override // X.InterfaceC1002280cBm
    public final JSONObject jQ1(JSONObject jSONObject, InterfaceC1041500dD2 interfaceC1041500dD2) throws JSONException {
        WebView webView;
        C1529880puk c1529880puk = SparkContext.Companion;
        String adContainerId = interfaceC1041500dD2.getAdContainerId();
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(adContainerId);
        if (c1537480q70LIZIZ != null) {
            Object objLJIJJ = c1537480q70LIZIZ.LJIJJ();
            if ((objLJIJJ instanceof WebKitView) && (webView = (WebView) objLJIJJ) != null) {
                jSONObject.put("is_ttweb", TTWebViewHelper.INSTANCE.isTTWebView(webView));
            }
        }
        TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
        jSONObject.put("ttweb_preinit_status", tTWebViewHelper.getPreInitStatus());
        jSONObject.put("ttweb_preinit_dur", tTWebViewHelper.getPreInitDuration());
        return jSONObject;
    }

    @Override // X.InterfaceC1037760d70
    public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
        String realCreativeIdStr;
        String realCreativeIdStr2;
        if (C2206681BYc.LIZ() && LIZ()) {
            InterfaceC1541390qDJ ttWebViewRuntimeService = TTWebViewHelper.INSTANCE.getTtWebViewRuntimeService();
            if (ttWebViewRuntimeService != null) {
                if (c1035880d3y == null || (realCreativeIdStr2 = c1035880d3y.getRealCreativeIdStr()) == null) {
                    realCreativeIdStr2 = "";
                }
                ttWebViewRuntimeService.release(realCreativeIdStr2);
            }
            C1490740otc c1490740otc = C1490740otc.LIZ;
            EnumC1490770otf enumC1490770otf = EnumC1490770otf.I;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("release identifier ");
            if (c1035880d3y != null) {
                realCreativeIdStr = c1035880d3y.getRealCreativeIdStr();
            } else {
                realCreativeIdStr = null;
            }
            sbLIZ.append(realCreativeIdStr);
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), enumC1490770otf, "CommerceLandPageTTWebModule_");
        }
    }

    @Override // X.InterfaceC1037760d70
    public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
        if (!C2206681BYc.LIZ()) {
            return;
        }
        C1043040dFW.LIZ(new ARunnableS8S2100000_16(str, interfaceC1041500dD2, str2, 0));
    }

    @Override // X.InterfaceC1037760d70
    public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
        C1035880d3y c1035880d3y;
        String strP0;
        if (!C2206681BYc.LIZ() || awemeRawAd == null || interfaceC1041500dD2 == null) {
            return;
        }
        if (!LIZ()) {
            C1490740otc.LIZ.LIZ("useTTWebGeckoPreload = false, return", EnumC1490770otf.W, "CommerceLandPageTTWebModule_");
            return;
        }
        IAdWebUtils iAdWebUtils = (IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class);
        if (interfaceC1041500dD2 instanceof C1035880d3y) {
            c1035880d3y = (C1035880d3y) interfaceC1041500dD2;
        } else {
            c1035880d3y = null;
        }
        if (!iAdWebUtils.nr(c1035880d3y)) {
            C1490740otc.LIZ.LIZ("user enter web page again on reuse mode, return", EnumC1490770otf.W, "CommerceLandPageTTWebModule_");
            return;
        }
        String channelName = awemeRawAd.getChannelName();
        ICommerceLandPageRealtimeResourceModule value = C1042580dEm.LJIIIZ.getValue();
        if (value != null) {
            strP0 = value.p0(str2, channelName);
        } else {
            strP0 = null;
        }
        LL = strP0;
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateChannelPath, channelName:");
        sbLIZ.append(channelName);
        sbLIZ.append(", scene:");
        sbLIZ.append(str2);
        sbLIZ.append(", path:");
        sbLIZ.append(LL);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SSPModule", 2);
        if (LL == null) {
            try {
                c1490740otc.LIZ("updateChannelPath null, currentChannelPath", EnumC1490770otf.W, "CommerceLandPageTTWebModule_");
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m1boximpl(c098200Yq);
            }
        }
        C1043040dFW.LIZ(new ARunnableS20S1200000_16(this, interfaceC1041500dD2, str, 2));
    }
}
