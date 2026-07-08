package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mLQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392660mLQ {
    public static final C1392660mLQ LIZ = new C1392660mLQ();

    /* JADX WARN: Removed duplicated region for block: B:5:0x0004  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct LIZIZ(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L4
            goto L6
        L4:
            r1 = r3
            goto L10
        L6:
            java.util.Map<java.lang.String, ? extends java.lang.Object> r1 = r4.data     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L4
            java.lang.String r0 = "information_cta"
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L39
        L10:
            boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L38
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L38
            java.lang.String r0 = "packed_anchor"
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L39
            boolean r0 = r1 instanceof java.util.Map     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L37
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L37
            com.google.gson.Gson r2 = X.C09C2.LIZ()     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = r2.LJIILL(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct> r0 = com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct.class
            java.lang.Object r0 = r2.LJII(r1, r0)     // Catch: java.lang.Throwable -> L39
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r0     // Catch: java.lang.Throwable -> L39
            return r0
        L37:
            return r3
        L38:
            return r3
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1392660mLQ.LIZIZ(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel):com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct");
    }

    public static JSONObject LIZJ(Map map) {
        Object obj;
        Integer numValueOf;
        Integer numValueOf2;
        Object obj2 = null;
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(map);
            HashMap map2 = (HashMap) map;
            String str = (String) map2.get("multi_anchor");
            if (str != null) {
                numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            } else {
                numValueOf = null;
            }
            jSONObject.put("multi_anchor", numValueOf);
            String str2 = (String) map2.get("anchor_number");
            if (str2 != null) {
                numValueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
            } else {
                numValueOf2 = null;
            }
            jSONObject.put("anchor_number", numValueOf2);
            C189200o6.m2constructorimpl(jSONObject);
            obj = jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (JSONObject) obj2;
    }

    public static String LIZLLL(List list, boolean z) {
        Long l;
        AnchorProductInfo anchorProductInfo;
        if (z) {
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list);
            if (anchorProductInfoModel != null && (anchorProductInfo = anchorProductInfoModel.extraData) != null) {
                l = anchorProductInfo.productId;
            } else {
                l = null;
            }
            return String.valueOf(l);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AnchorProductInfoModel) it2.next()).extraData.productId);
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public static String LJ(List list, boolean z) {
        AnchorProductInfo anchorProductInfo;
        String str;
        AnchorProductInfo anchorProductInfo2;
        String str2;
        if (z) {
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list);
            if (anchorProductInfoModel == null || (anchorProductInfo2 = anchorProductInfoModel.extraData) == null || (str2 = anchorProductInfo2.elasticTitle) == null) {
                AnchorProductInfoModel anchorProductInfoModel2 = (AnchorProductInfoModel) C13LP.LJJJLL(list);
                if (anchorProductInfoModel2 == null || (anchorProductInfo = anchorProductInfoModel2.extraData) == null || (str = anchorProductInfo.title) == null) {
                    return "";
                }
                return str;
            }
            return str2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnchorProductInfo anchorProductInfo3 = ((AnchorProductInfoModel) it2.next()).extraData;
            String str3 = anchorProductInfo3.elasticTitle;
            if (str3 != null || (str3 = anchorProductInfo3.title) != null) {
                arrayList.add(str3);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public static String LJFF(List list, boolean z) {
        if (z) {
            return "product";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList.add("product");
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public static C2344009Gk LIZ(String str, Aweme aweme, List list) {
        Integer numValueOf;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "video_anchor");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("music_id", C586930N0h.LIZ(aweme));
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("main_anchor_id", LIZLLL(list, true));
        c2344009Gk.LJIIIIZZ("main_anchor_name", LJ(list, true));
        c2344009Gk.LJIIIIZZ("main_anchor_type", LJFF(list, true));
        c2344009Gk.LIZJ(0, "multi_anchor");
        c2344009Gk.LIZJ(1, "anchor_number");
        c2344009Gk.LIZJ(-1, "multi_anchor_display");
        c2344009Gk.LJIIIIZZ("request_id", aweme.getRequestId());
        c2344009Gk.LJIIIIZZ("component_key", "anchor_complex_shop");
        c2344009Gk.LJIIIIZZ("main_component_key", "anchor_complex_shop");
        AIGCInfo aIGCInfo = aweme.aigcInfo;
        if (aIGCInfo != null) {
            numValueOf = Integer.valueOf(aIGCInfo.getAIGCLabelType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aigc_theme_status");
        if (TextUtils.isEmpty(c2344009Gk.LJIIIZ("anchor_type"))) {
            c2344009Gk.LJFF("anchor_type", "product");
        }
        if (TextUtils.isEmpty(c2344009Gk.LJIIIZ("main_anchor_type"))) {
            c2344009Gk.LJFF("main_anchor_type", "product");
        }
        c2344009Gk.LJIIIIZZ("anchor_id", LIZLLL(list, false));
        c2344009Gk.LJIIIIZZ("anchor_name", LJ(list, false));
        c2344009Gk.LJIIIIZZ("anchor_type", LJFF(list, false));
        return c2344009Gk;
    }
}
