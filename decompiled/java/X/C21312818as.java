package X;

import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18as, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21312818as {
    public static final C01GW<C21312818as> LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(21));
    public final C2092908Hv<String, C21313218aw> LIZ = new C2092908Hv<>(((Number) C261300ALw.LIZ.getValue()).intValue());

    public final C21313018au LIZ(C18JN c18jn) {
        JSONObject jSONObject = c18jn.LIZIZ;
        if (Intrinsics.LJFF(jSONObject.optString("initial_poi_enter_from"), "homepage_hot")) {
            String strOptString = jSONObject.optString("initial_poi_id");
            if (C123100dR.LIZ(strOptString) && Intrinsics.LJFF(strOptString, jSONObject.optString("poi_id")) && C1202320hOQ.LIZ(jSONObject).length() > 0) {
                String strLIZ = C1202320hOQ.LIZ(c18jn.LIZIZ);
                C21313218aw c21313218aw = this.LIZ.LIZ.get(strLIZ);
                if (c21313218aw == null) {
                    c21313218aw = new C21313218aw(0);
                    this.LIZ.LIZ.put(strLIZ, c21313218aw);
                }
                C21313018au c21313018au = c21313218aw.LIZJ;
                if (c21313018au == null) {
                    c21313018au = new C21313018au();
                }
                c21313218aw.LIZJ = c21313018au;
                String strOptString2 = c21313218aw.LIZ;
                if (strOptString2 == null) {
                    strOptString2 = c18jn.LIZIZ.optString("poi_id");
                }
                c21313218aw.LIZ = strOptString2;
                String strOptString3 = c21313218aw.LIZIZ;
                if (strOptString3 == null) {
                    strOptString3 = c18jn.LIZIZ.optString("distance");
                }
                c21313218aw.LIZIZ = strOptString3;
                return c21313218aw.LIZJ;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C18JN r9) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21312818as.LIZIZ(X.18JN):void");
    }
}
