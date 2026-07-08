package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536040q4g {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(JSONObject jSONObject, long j) {
        C1520360pfO c1520360pfO = new C1520360pfO("code_cache_clean_status");
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LJ = new JSONObject().put("cost", j);
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
    }

    public static void LIZIZ(int i, int i2, String str, AbstractC1536120q4o abstractC1536120q4o, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("res_url", abstractC1536120q4o.LJ());
        C1529350ptt c1529350pttLIZLLL = abstractC1536120q4o.LIZLLL();
        if (c1529350pttLIZLLL != null) {
            jSONObject2.put("gecko_channel", c1529350pttLIZLLL.LIZIZ);
            jSONObject2.put("gecko_bundle", c1529350pttLIZLLL.LIZJ);
            jSONObject2.put("gecko_access_key", c1529350pttLIZLLL.LIZ);
        }
        jSONObject2.put("js_cache_count", i);
        jSONObject2.put("cache_entry_size", i2);
        if (str != null) {
            jSONObject2.put("error_message", str);
        }
        jSONObject2.put("res_unique_id", abstractC1536120q4o.LIZIZ());
        jSONObject2.put("source", abstractC1536120q4o.LJFF());
        C1520360pfO c1520360pfO = new C1520360pfO("code_cache_generate_status");
        c1520360pfO.LIZLLL = jSONObject2;
        c1520360pfO.LJ = jSONObject;
        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
    }
}
