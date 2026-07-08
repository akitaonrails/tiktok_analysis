package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00Rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C079600Rm {
    public static AbstractC057100Iv LIZ(final String str, JSONObject jSONObject) {
        final int iOptInt = jSONObject.optInt("t");
        final int iOptInt2 = jSONObject.optInt("i");
        final boolean zOptBoolean = jSONObject.optBoolean("r");
        if (iOptInt != 20) {
            if (iOptInt != 21) {
                return new AbstractC057100Iv(str, iOptInt2, iOptInt, zOptBoolean) { // from class: X.00It
                    @Override // X.AbstractC057100Iv
                    public final Object LIZIZ() {
                        switch (this.LIZJ) {
                            case 0:
                                return Boolean.FALSE;
                            case 1:
                            case 6:
                                return "";
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                            case 8:
                                return 0;
                            default:
                                return -1;
                        }
                    }

                    @Override // X.AbstractC057100Iv
                    public final Object LIZ(C1516680pZS c1516680pZS, Map map) {
                        switch (this.LIZJ) {
                            case 0:
                                return Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                            case 1:
                                return c1516680pZS.LJII();
                            case 2:
                                return Double.valueOf(Double.longBitsToDouble(c1516680pZS.LJIIIZ()));
                            case 3:
                                return Float.valueOf(Float.intBitsToFloat(c1516680pZS.LJIIIIZZ()));
                            case 4:
                            case 7:
                                return Integer.valueOf(c1516680pZS.LJIIJ());
                            case 5:
                            case 8:
                                return Long.valueOf(c1516680pZS.LJIIJJI());
                            case 6:
                                return C1516700pZU.LIZLLL(c1516680pZS);
                            default:
                                "".toString();
                                throw new IllegalStateException("");
                        }
                    }
                };
            }
            return new C057000Iu(str, iOptInt2, zOptBoolean, LIZ("", jSONObject.optJSONObject("k")), LIZ("", jSONObject.optJSONObject("v")));
        }
        final String strOptString = jSONObject.optString("fq");
        return new AbstractC057100Iv(iOptInt2, str, strOptString, zOptBoolean) { // from class: X.00Iw
            public final String LJFF;

            @Override // X.AbstractC057100Iv
            public final Object LIZIZ() {
                return -1;
            }

            @Override // X.AbstractC057100Iv
            public final Object LIZ(C1516680pZS c1516680pZS, Map map) {
                HashMap map2 = (HashMap) map;
                C00KU c00ku = (C00KU) map2.get(this.LJFF);
                if (c00ku != null) {
                    return c00ku.LIZ(c1516680pZS, map2);
                }
                "".toString();
                throw new IllegalStateException("");
            }

            {
                this.LJFF = strOptString;
            }
        };
    }
}
