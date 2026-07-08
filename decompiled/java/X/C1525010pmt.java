package X;

import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525010pmt {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(JSONObject jSONObject) {
        Object objOpt = jSONObject.opt("address");
        if (objOpt == null || objOpt == JSONObject.NULL) {
            return null;
        }
        String string = objOpt.toString();
        if (!(!a0.LJJJIL(string))) {
            return null;
        }
        return string;
    }

    public static AbstractC1525130pn5 LIZIZ(JSONObject jSONObject) {
        if (!jSONObject.has("port")) {
            return C1525200pnC.LIZ;
        }
        Object objOpt = jSONObject.opt("port");
        if (objOpt != null && objOpt != JSONObject.NULL) {
            if (objOpt instanceof Number) {
                return new C1525080pn0(((Number) objOpt).intValue());
            }
            if (objOpt instanceof String) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) objOpt).toString());
                if (numLJIIJJI != null) {
                    return new C1525080pn0(numLJIIJJI.intValue());
                }
                return C1525210pnD.LIZ;
            }
            return C1525210pnD.LIZ;
        }
        return C1525200pnC.LIZ;
    }

    public static Integer LIZJ(JSONObject jSONObject) {
        C1525080pn0 c1525080pn0;
        Integer numValueOf;
        int iIntValue;
        AbstractC1525130pn5 abstractC1525130pn5LIZIZ = LIZIZ(jSONObject);
        if (!(abstractC1525130pn5LIZIZ instanceof C1525080pn0) || (c1525080pn0 = (C1525080pn0) abstractC1525130pn5LIZIZ) == null || 1 > (iIntValue = (numValueOf = Integer.valueOf(c1525080pn0.LIZ)).intValue()) || iIntValue >= 65536) {
            return null;
        }
        return numValueOf;
    }
}
