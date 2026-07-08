package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0otX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490690otX {
    public static C1490700otY LIZIZ(String str) {
        Object c098200Yq;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("version", "");
            int i = 0;
            if (strOptString.length() == 0) {
                return null;
            }
            long jOptLong = jSONObject.optLong("l0_id", 0L);
            long jOptLong2 = jSONObject.optLong("l1_id", 0L);
            long jOptLong3 = jSONObject.optLong("l2_id", 0L);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("conf_list");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                int i2 = 0;
                while (i2 < length) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("keywords", "");
                        if (strOptString2.length() != 0) {
                            String strOptString3 = jSONObjectOptJSONObject.optString("name", "");
                            if (strOptString3.length() != 0) {
                                arrayList.add(new C1499050p71(strOptString2, strOptString3, jSONObjectOptJSONObject.optInt("priority", i), jSONObjectOptJSONObject.optInt("rule", 1)));
                            }
                        }
                    }
                    i2++;
                    i = 0;
                }
            }
            c098200Yq = new C1490700otY(jOptLong, jOptLong2, jOptLong3, arrayList, strOptString);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (C1490700otY) c098200Yq;
    }

    public static boolean LIZ(C1490700otY c1490700otY, C1490700otY c1490700otY2) {
        if (c1490700otY == null && c1490700otY2 == null) {
            return true;
        }
        if (c1490700otY != null && c1490700otY2 != null && c1490700otY.LIZ == c1490700otY2.LIZ && c1490700otY.LIZIZ == c1490700otY2.LIZIZ && c1490700otY.LIZJ == c1490700otY2.LIZJ && Intrinsics.LJFF(c1490700otY.LJ, c1490700otY2.LJ)) {
            return true;
        }
        return false;
    }
}
