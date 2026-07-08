package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20107213lu {
    public static void LIZ(Uri uri) {
        JSONObject jSONObject;
        String strOptString;
        EnumC310540CFg enumC310540CFg;
        boolean z;
        boolean z2;
        Iterator<String> itKeys;
        Iterator<String> itKeys2;
        String strLIZLLL = AnonymousClass0185.LIZLLL(uri);
        if (a0.LJJJIL(strLIZLLL)) {
            return;
        }
        String strLJ = AnonymousClass0185.LJ(uri, "prefetch_config");
        if (a0.LJJJIL(strLJ)) {
            return;
        }
        try {
            String path = UriProtector.parse(strLIZLLL).getPath();
            if (path != null && !a0.LJJJIL(path) && (strOptString = (jSONObject = new JSONObject(strLJ)).optString("url", "https://oec-api.tiktokv.com/api/v1/mall/new_user_exclusive_deal/get")) != null && !a0.LJJJIL(strOptString)) {
                C20107113lt c20107113lt = new C20107113lt(path, strOptString);
                if (jSONObject.optInt("method", 1) == 1) {
                    enumC310540CFg = EnumC310540CFg.POST;
                } else {
                    enumC310540CFg = EnumC310540CFg.GET;
                }
                c20107113lt.LJ = enumC310540CFg;
                if (jSONObject.optInt("need_common_params", 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                c20107113lt.LIZJ = z;
                long jOptLong = jSONObject.optLong("expire", 30L);
                if (jOptLong < 3) {
                    jOptLong = 3;
                }
                c20107113lt.LIZLLL = jOptLong;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("query_params");
                if (jSONObjectOptJSONObject != null && (itKeys2 = jSONObjectOptJSONObject.keys()) != null) {
                    while (itKeys2.hasNext()) {
                        String next = itKeys2.next();
                        String strOptString2 = jSONObjectOptJSONObject.optString(next);
                        if (strOptString2 == null || a0.LJJJIL(strOptString2)) {
                            strOptString2 = null;
                        }
                        c20107113lt.LJFF.add(new Pair<>(next, strOptString2));
                    }
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("static_params");
                if (jSONObjectOptJSONObject2 != null && (itKeys = jSONObjectOptJSONObject2.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next2 = itKeys.next();
                        c20107113lt.LIZ(next2, jSONObjectOptJSONObject2.optString(next2));
                    }
                }
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has("cursor")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    c20107113lt.LIZ("cursor", CardStruct.IStatusCode.DEFAULT);
                }
                if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.has("mode")) {
                    c20107113lt.LIZ("mode", "1");
                }
                if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.has("size")) {
                    c20107113lt.LIZ("size", "10");
                }
                if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.has("request_type")) {
                    c20107113lt.LIZ("request_type", CardStruct.IStatusCode.DEFAULT);
                }
                C20107413lw.LJFF = new C1540210qBP(c20107113lt);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
