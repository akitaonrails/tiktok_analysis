package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520630pfp {
    public static boolean LIZ;
    public static int LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;

    static {
        new JSONObject();
        LIZIZ = Integer.MAX_VALUE;
    }

    public static void LIZ(JSONObject jSONObject) {
        LIZ = jSONObject.optBoolean("ignore_empty_url", LIZ);
        LIZIZ = jSONObject.optInt("max_length_of_schema", LIZIZ);
        LIZJ = jSONObject.optBoolean("ignore_empty_bid_cache", LIZJ);
        LIZLLL = jSONObject.optBoolean("use_simplified_schema", LIZLLL);
        LJ = jSONObject.optBoolean("always_parse_bid_when_get_unified_bid", LJ);
    }
}
