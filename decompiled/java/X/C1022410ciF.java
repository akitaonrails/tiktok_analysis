package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.sequences.Sequence;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ciF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022410ciF extends AbstractC1023090cjL {
    public static final C1022410ciF LIZIZ;
    public static final Sequence<C1022410ciF> LIZJ;

    static {
        C1022410ciF c1022410ciF = new C1022410ciF();
        LIZIZ = c1022410ciF;
        LIZJ = C13LQ.LJIIJJI(new C1022410ciF[]{c1022410ciF});
    }

    public C1022410ciF() {
        super("anole");
    }

    @Override // X.AbstractC1023090cjL
    public final Sequence<C1022410ciF> LIZJ() {
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    @Override // X.AbstractC1023090cjL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(X.C1022420ciG r6) {
        /*
            r5 = this;
            boolean r0 = r6.LIZ
            java.lang.String r3 = "undefined"
            r4 = 0
            if (r0 == 0) goto L66
            X.0ciu r2 = r6.LJI
            if (r2 == 0) goto L2c
            X.0ciH r0 = X.C1022430ciH.LIZ
            r0.getClass()
            X.0cBd r0 = X.C1022430ciH.LIZJ
            java.lang.String r1 = r0.LIZ
            if (r1 == 0) goto L2c
            int r0 = r1.length()
            if (r0 == 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.LJII
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L2c
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L54
        L2c:
            X.0ciu r1 = r6.LJI
            if (r1 == 0) goto L43
            X.0ciH r0 = X.C1022430ciH.LIZ
            r0.getClass()
            X.0cBd r0 = X.C1022430ciH.LIZIZ
            java.lang.String r0 = r0.LIZ
            java.lang.Object r0 = r1.LJFF(r0)
            if (r0 == 0) goto L43
            java.lang.String r4 = r0.toString()
        L43:
            org.json.JSONObject r1 = X.C12865051r.LIZ(r4)
            X.0ciH r0 = X.C1022430ciH.LIZ
            r0.getClass()
            X.0cBd r0 = X.C1022430ciH.LIZJ
            java.lang.String r0 = r0.LIZ
            java.lang.String r2 = r1.optString(r0, r3)
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.LJ
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L66:
            org.json.JSONObject r1 = r6.LJFF
            if (r1 == 0) goto L70
            java.lang.String r0 = "ad_extra_data"
            java.lang.String r4 = r1.optString(r0)
        L70:
            org.json.JSONObject r1 = X.C12865051r.LIZ(r4)
            X.0ciH r0 = X.C1022430ciH.LIZ
            r0.getClass()
            X.0cBd r0 = X.C1022430ciH.LIZJ
            java.lang.String r0 = r0.LIZ
            java.lang.String r2 = r1.optString(r0, r3)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r6.LJ
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1022410ciF.LIZ(X.0ciG):java.lang.String");
    }

    @Override // X.AbstractC1023090cjL
    public final String LIZIZ(Map<String, Object> map) {
        String string;
        JSONObject jSONObject;
        Object objOpt;
        String string2;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object obj = linkedHashMap.get("value");
        if (obj != null && (string = obj.toString()) != null) {
            Object obj2 = linkedHashMap.get("ad_extra_data");
            if ((obj2 instanceof JSONObject) && (jSONObject = (JSONObject) obj2) != null && (objOpt = jSONObject.opt("component_type")) != null && (string2 = objOpt.toString()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string);
                sbLIZ.append(string2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return null;
    }
}
