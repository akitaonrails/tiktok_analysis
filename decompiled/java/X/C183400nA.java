package X;

import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.00nA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C183400nA {
    public static final void LIZ(int i, String str, Long l, Map map) throws JSONException {
        String strLJJLIIIJ;
        Set setEntrySet;
        C185100nR c185100nR = C185100nR.LIZ;
        JSONObject jSONObject = new JSONObject();
        if (map == null || (setEntrySet = map.entrySet()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(setEntrySet, ", ", e3.e, e3.f, 0, null, AnonymousClass0207.get$arr$(6), 24)) == null) {
            strLJJLIIIJ = "[]";
        }
        jSONObject.put("err_code", i);
        jSONObject.put("err_msg", str);
        jSONObject.put("cell_types", strLJJLIIIJ);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cost", l);
        C185100nR.LIZIZ(c185100nR, "cell_status", jSONObject, jSONObject2, 8);
    }
}
