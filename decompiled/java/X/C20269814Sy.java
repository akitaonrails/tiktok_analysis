package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCCustomizedColors;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoBannerCustomizedInfo;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoBannerTraceInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS274S0300000_30;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20269814Sy implements C0SH2 {
    public final InterfaceC665370Q7z LIZ;
    public final C718360SFu LIZIZ;
    public final C1586320rNm LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1520));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1521));

    public final void LJFF() throws JSONException {
        Object obj;
        String eventType;
        AIGCCustomizedColors aIGCCustomizedColors;
        AIGCCustomizedColors aIGCCustomizedColors2;
        String str;
        String str2;
        TakoBannerTraceInfo takoBannerTraceInfo;
        String str3;
        List<TakoAITemplates> list;
        JSONArray jSONArray = new JSONArray();
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ != null && (list = takoBannerCustomizedInfoLIZIZ.aiTemplates) != null) {
            for (TakoAITemplates takoAITemplates : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", takoAITemplates.templateId);
                jSONObject.put("mode", "create_image");
                jSONObject.put("template_type", "image_2_image");
                jSONArray.put(jSONObject);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ2 = C0SH9.LIZIZ(this.LIZIZ);
        List<String> list2 = null;
        String str4 = takoBannerCustomizedInfoLIZIZ2 != null ? takoBannerCustomizedInfoLIZIZ2.query : null;
        if (str4 != null && str4.length() > 0) {
            linkedHashMap.put("words_content", str4);
        }
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ3 = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ3 != null) {
            linkedHashMap.putAll(C20269114Sr.LIZJ(takoBannerCustomizedInfoLIZIZ3));
        }
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ4 = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ4 != null && (takoBannerTraceInfo = takoBannerCustomizedInfoLIZIZ4.traceInfo) != null && (str3 = takoBannerTraceInfo.extraFlag) != null && str3.length() > 0) {
            linkedHashMap.put("extra_flag", str3);
        }
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ5 = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ5 != null && (str2 = takoBannerCustomizedInfoLIZIZ5.qrecJsonInfo) != null) {
            linkedHashMap.put("qrec_json_info", str2);
        }
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("template_info", jSONArray));
        Map<? extends String, ? extends Object> mapLIZ = C0SKJ.LIZ(this.LIZIZ);
        if (mapLIZ != null) {
            mapLJIIJ.putAll(mapLIZ);
        }
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ6 = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ6 != null && (str = takoBannerCustomizedInfoLIZIZ6.qrecJsonInfo) != null) {
            mapLJIIJ.put("qrec_json_info", str);
        }
        LJI(mapLJIIJ);
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ7 = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ7 == null || (obj = takoBannerCustomizedInfoLIZIZ7.aiTemplates) == null) {
            obj = C13BV.INSTANCE;
        }
        String strLJ = C051M.LJ(obj, false);
        Aweme aweme = this.LIZIZ.LIZJ;
        String aid = aweme != null ? aweme.getAid() : null;
        C2189821An6 c2189821An6LIZIZ = C0SZK.LIZIZ(this.LIZIZ);
        if (c2189821An6LIZIZ == null || (eventType = c2189821An6LIZIZ.getEventType()) == null) {
            eventType = "";
        }
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ8 = C0SH9.LIZIZ(this.LIZIZ);
        String str5 = takoBannerCustomizedInfoLIZIZ8 != null ? takoBannerCustomizedInfoLIZIZ8.backgroundLight : null;
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ9 = C0SH9.LIZIZ(this.LIZIZ);
        String str6 = takoBannerCustomizedInfoLIZIZ9 != null ? takoBannerCustomizedInfoLIZIZ9.backgroundDark : null;
        C1227904rF.LIZ.getClass();
        Gson gsonLIZLLL = C1227904rF.LIZLLL();
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ10 = C0SH9.LIZIZ(this.LIZIZ);
        String json = GsonProtectorUtils.toJson(gsonLIZLLL, (takoBannerCustomizedInfoLIZIZ10 == null || (aIGCCustomizedColors2 = takoBannerCustomizedInfoLIZIZ10.customizedColors) == null) ? null : aIGCCustomizedColors2.titleColors);
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ11 = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ11 != null && (aIGCCustomizedColors = takoBannerCustomizedInfoLIZIZ11.customizedColors) != null) {
            list2 = aIGCCustomizedColors.arrowColors;
        }
        String json2 = GsonProtectorUtils.toJson(gsonLIZLLL, list2);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C0SZK.LIZ(this.LIZIZ), "//tako/template");
        smartRouteBuildRoute.withParam("template_list", strLJ);
        smartRouteBuildRoute.withParam("enter_from", C14TF.LIZIZ.LJIJJLI(eventType));
        smartRouteBuildRoute.withParam("enter_method", "click_bottom_bar_generate");
        smartRouteBuildRoute.withParam("aid", aid);
        smartRouteBuildRoute.withParam("mode_source", "after_feed");
        smartRouteBuildRoute.withParam("background_light", str5);
        smartRouteBuildRoute.withParam("background_dark", str6);
        smartRouteBuildRoute.withParam("template_title_colors", json);
        smartRouteBuildRoute.withParam("template_indicator_colors", json2);
        smartRouteBuildRoute.withParam("common_mob_params", C051M.LJ(linkedHashMap, false));
        smartRouteBuildRoute.open();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, "search_result") != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01cf  */
    @Override // X.C0SH2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r11) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20269814Sy.LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }

    public final void LIZLLL(Function1<? super List<String>, Unit> function1) throws JSONException {
        String str;
        LinkedHashMap linkedHashMap;
        String str2;
        List<TakoAITemplates> list;
        TakoAITemplates takoAITemplates;
        Integer num;
        List<TakoAITemplates> list2;
        TakoAITemplates takoAITemplates2;
        Context contextLJIIIIZZ;
        Activity activityLIZ;
        List<TakoAITemplates> list3;
        TakoAITemplates takoAITemplates3;
        Integer num2;
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ != null) {
            str = takoBannerCustomizedInfoLIZIZ.feedbarType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "ai_play") || C07CQ.LIZ()) {
            Map mapLIZ = C0SKJ.LIZ(this.LIZIZ);
            if (mapLIZ != null) {
                linkedHashMap = new LinkedHashMap(mapLIZ);
                TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ2 = C0SH9.LIZIZ(this.LIZIZ);
                if (takoBannerCustomizedInfoLIZIZ2 != null && (str2 = takoBannerCustomizedInfoLIZIZ2.qrecJsonInfo) != null) {
                    linkedHashMap.put("qrec_json_info", str2);
                }
            } else {
                linkedHashMap = null;
            }
            LJI(linkedHashMap);
        }
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ3 = C0SH9.LIZIZ(this.LIZIZ);
        int iIntValue = 1;
        if (takoBannerCustomizedInfoLIZIZ3 != null && (list = takoBannerCustomizedInfoLIZIZ3.aiTemplates) != null && (takoAITemplates = (TakoAITemplates) C13LP.LJJJLL(list)) != null && (num = takoAITemplates.imgCnt) != null && num.intValue() > 0 && (list2 = takoBannerCustomizedInfoLIZIZ3.aiTemplates) != null && (takoAITemplates2 = (TakoAITemplates) C13LP.LJJJLL(list2)) != null && !takoAITemplates2.LIZIZ()) {
            TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ4 = C0SH9.LIZIZ(this.LIZIZ);
            if (takoBannerCustomizedInfoLIZIZ4 != null && (list3 = takoBannerCustomizedInfoLIZIZ4.aiTemplates) != null && (takoAITemplates3 = (TakoAITemplates) C13LP.LJJJLL(list3)) != null && (num2 = takoAITemplates3.imgCnt) != null) {
                iIntValue = num2.intValue();
            }
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null && (activityLIZ = C1388190mED.LIZ(contextLJIIIIZZ)) != null) {
                AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(function1, (Function1<? super C1854150yLl, Unit>) 486);
                C1561230qjJ.LIZ.getClass();
                if (C1561230qjJ.LIZ()) {
                    C14TF.LIZIZ.LJJJLZIJ(iIntValue, activityLIZ, null, null, awS606S0100000_27, false, false);
                    return;
                } else {
                    C14TF.LIZIZ.LJJLI(iIntValue, activityLIZ, awS606S0100000_27);
                    return;
                }
            }
            return;
        }
        LJ(null);
    }

    public final void LJ(List<String> list) {
        AwS274S0300000_30 awS274S0300000_30 = new AwS274S0300000_30(this.LIZIZ, (C718360SFu) this, (C20269814Sy) list, (List<String>) 15);
        if (((Boolean) C0B1B.LIZ.getValue()).booleanValue()) {
            if (C790340UzQ.LIZIZ) {
                C790340UzQ.LIZIZ = false;
                C786410Ut5.LJLIIL(1500L, C790340UzQ.LIZ, new Runnable() { // from class: X.0UzP
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TakoBottomBannerViewDebounce@6c75.enter$1");
                        try {
                            C790340UzQ.LIZIZ = true;
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TakoBottomBannerViewDebounce@6c75.enter$1");
                    }
                });
                awS274S0300000_30.invoke();
                return;
            }
            return;
        }
        awS274S0300000_30.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(java.util.Map<java.lang.String, ? extends java.lang.Object> r41) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20269814Sy.LJI(java.util.Map):void");
    }

    @Override // X.C0SH2
    public final void LIZ(int i, String str) throws JSONException {
        String str2;
        C718360SFu c718360SFu = this.LIZIZ;
        BannerCommonStruct bannerCommonStruct = c718360SFu.LIZLLL;
        C719550SKj.LIZ(bannerCommonStruct).LIZJ(c718360SFu.LIZIZ, C0SH9.LIZ(c718360SFu));
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ != null) {
            str2 = takoBannerCustomizedInfoLIZIZ.feedbarType;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "ai_play_new_ui")) {
            LJFF();
        } else {
            LIZLLL(new AwS609S0100000_30(this, 268));
        }
    }

    @Override // X.C0SH2
    public final void LIZIZ(BannerCommonTailAction.BannerActionType bannerActionType, C0SH1 c0sh1) throws JSONException {
        String str;
        C718360SFu c718360SFu = this.LIZIZ;
        BannerCommonStruct bannerCommonStruct = c718360SFu.LIZLLL;
        C719550SKj.LIZ(bannerCommonStruct).LIZJ(c718360SFu.LIZIZ, C0SH9.LIZ(c718360SFu));
        TakoBannerCustomizedInfo takoBannerCustomizedInfoLIZIZ = C0SH9.LIZIZ(this.LIZIZ);
        if (takoBannerCustomizedInfoLIZIZ != null) {
            str = takoBannerCustomizedInfoLIZIZ.feedbarType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "ai_play_new_ui")) {
            LJFF();
        } else {
            LIZLLL(new AwS609S0100000_30(this, 269));
        }
    }

    public C20269814Sy(InterfaceC665370Q7z interfaceC665370Q7z, C718360SFu c718360SFu, C1586320rNm c1586320rNm) {
        this.LIZ = interfaceC665370Q7z;
        this.LIZIZ = c718360SFu;
        this.LIZJ = c1586320rNm;
    }
}
