package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521040pgU {
    public final JSONObject LIZ;
    public final Map<String, Object> LIZIZ = new HashMap();

    public C1521040pgU(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    public final Object LIZ(String str) {
        boolean z;
        Object objLIZ;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (((HashMap) this.LIZIZ).containsKey(str)) {
            return ((HashMap) this.LIZIZ).get(str);
        }
        if (this.LIZ.has(str)) {
            Object objOpt = this.LIZ.opt(str);
            if (!((HashMap) this.LIZIZ).containsKey(str)) {
                ((HashMap) this.LIZIZ).put(str, objOpt);
            }
            return objOpt;
        }
        int iLJJJJI = a0.LJJJJI(str, e3.d, 0, 6);
        if (iLJJJJI < 0 || (objLIZ = LIZ(str.substring(0, iLJJJJI))) == null || !(objLIZ instanceof JSONObject)) {
            return null;
        }
        Object objOpt2 = ((JSONObject) objLIZ).opt(str.substring(iLJJJJI + 1));
        if (objOpt2 != null && !((HashMap) this.LIZIZ).containsKey(str)) {
            ((HashMap) this.LIZIZ).put(str, objOpt2);
        }
        return objOpt2;
    }

    public final Long LIZIZ(Long l, String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null && (objLIZ instanceof Number)) {
            return Long.valueOf(((Number) objLIZ).longValue());
        }
        return l;
    }

    public final String LIZJ(String str, String str2) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null && (objLIZ instanceof String)) {
            return (String) objLIZ;
        }
        return str2;
    }
}
