package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XF0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XF0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, int i) {
        Object obj;
        Object obj2;
        String str4 = "";
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            obj = "";
        } else {
            obj = null;
        }
        if ((i & 16) != 0) {
            obj2 = "";
        } else {
            obj2 = null;
        }
        if ((i & 32) == 0) {
            str4 = null;
        }
        C1520360pfO c1520360pfO = new C1520360pfO("raven_capability");
        c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
        c1520360pfO.LIZIZ = "hybridkit_default_bid";
        c1520360pfO.LIZIZ(0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("stage", str2);
        jSONObject.put("state", str3);
        jSONObject.put("errorCode", obj);
        jSONObject.put("errorMsg", obj2);
        jSONObject.put("extra", str4);
        c1520360pfO.LIZLLL = jSONObject;
        C1520080pew.LIZ(null, c1520360pfO.LIZ());
    }
}
