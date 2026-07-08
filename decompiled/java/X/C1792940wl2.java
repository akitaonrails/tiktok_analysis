package X;

import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792940wl2 {
    public static String LIZIZ = "";
    public final C01GW LIZ = C292401Bi.LIZ(AFwS206S0000000_18.get$arr$(767));

    public static void LIZ(String str) {
        if (C1533950q1J.LJ(str) && !Intrinsics.LJFF(LIZIZ, str)) {
            LIZIZ = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currency_code", LIZIZ);
            C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_iap_currency_code_update", jSONObject, null, null, null, "wallet");
        }
    }
}
