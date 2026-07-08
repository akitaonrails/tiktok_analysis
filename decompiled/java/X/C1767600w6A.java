package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767600w6A {
    public static final String LIZ(JSONObject jSONObject) throws JSONException {
        if (C7879035x.LIZLLL()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("diversion_params_for_rec", C786410Ut5.J3(jSONObject));
            return C786410Ut5.J3(jSONObject2);
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("diversion_params_for_rec", C786410Ut5.J3(jSONObject));
            return C786410Ut5.J3(jSONObject3);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0242 A[Catch: all -> 0x024c, CancellationException -> 0x027c, TryCatch #4 {CancellationException -> 0x027c, all -> 0x024c, blocks: (B:137:0x0232, B:139:0x0236, B:141:0x023c, B:143:0x0247, B:142:0x0242), top: B:167:0x0232 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1767730w6N LJ(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ShopTabModuleData r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767600w6A.LJ(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ShopTabModuleData):X.0w6N");
    }

    public static final C1767730w6N LJFF(Map<String, String> map) {
        String str;
        Uri uri;
        String strLIZLLL;
        if (map == null || (str = map.get("video_shop_guide_schema")) == null || (uri = UriProtector.parse(str)) == null || (strLIZLLL = C1976807ok.LIZLLL(uri, "diversion_params")) == null) {
            return null;
        }
        String strLIZLLL2 = C1976807ok.LIZLLL(uri, "diversion_params_extra_info");
        System.currentTimeMillis();
        return new C1767730w6N(strLIZLLL, strLIZLLL2);
    }

    public static final JSONObject LIZIZ(Aweme aweme, String str) throws JSONException {
        Collection collectionSingletonList;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("list_entrance", "user_intention_ecom_live");
        jSONObject.put("context_page_name", str);
        String strLJ = C663760Q1u.LJ(aweme);
        if (strLJ == null || (collectionSingletonList = Collections.singletonList(strLJ)) == null) {
            collectionSingletonList = C13BV.INSTANCE;
        }
        jSONObject.put("context_room_ids", new JSONArray(collectionSingletonList));
        return jSONObject;
    }

    public static final JSONObject LIZJ(Aweme aweme, String str) throws JSONException {
        Collection collectionSingletonList;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("list_entrance", "user_intention_ecom_video");
        jSONObject.put("context_page_name", str);
        String aid = aweme.getAid();
        if (aid == null || (collectionSingletonList = Collections.singletonList(aid)) == null) {
            collectionSingletonList = C13BV.INSTANCE;
        }
        jSONObject.put("context_video_ids", new JSONArray(collectionSingletonList));
        Collection collectionLIZIZ = C663760Q1u.LIZIZ(aweme);
        if (collectionLIZIZ == null) {
            collectionLIZIZ = C13BV.INSTANCE;
        }
        jSONObject.put("context_video_product_ids", new JSONArray(collectionLIZIZ));
        return jSONObject;
    }

    public static final String LJI(String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = null;
        if (C7879035x.LIZLLL()) {
            JSONObject jSONObject4 = new JSONObject(str);
            String strOptString = jSONObject4.optString("diversion_params_for_rec");
            if (C123100dR.LIZ(strOptString)) {
                jSONObject3 = new JSONObject(strOptString);
            }
            if (jSONObject3 != null) {
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject3.opt(next));
                }
            }
            jSONObject4.put("diversion_params_for_rec", C786410Ut5.J3(jSONObject));
            return C786410Ut5.J3(jSONObject4);
        }
        try {
            JSONObject jSONObject5 = new JSONObject(str);
            String strOptString2 = jSONObject5.optString("diversion_params_for_rec");
            if (C123100dR.LIZ(strOptString2)) {
                jSONObject2 = new JSONObject(strOptString2);
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    jSONObject.put(next2, jSONObject2.opt(next2));
                }
            }
            jSONObject5.put("diversion_params_for_rec", C786410Ut5.J3(jSONObject));
            return C786410Ut5.J3(jSONObject5);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1767730w6N LIZLLL(X.C19EG r8, java.lang.String r9, com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ShopTabModuleData r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767600w6A.LIZLLL(X.19EG, java.lang.String, com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ShopTabModuleData, java.util.Map):X.0w6N");
    }
}
