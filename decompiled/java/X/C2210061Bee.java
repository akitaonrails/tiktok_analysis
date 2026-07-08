package X;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210061Bee {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final boolean LJ = C2210531BfP.LIZ;
    public boolean LJFF;

    public static int LIZJ(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                i2++;
            } else if (cCharAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(cCharAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    public static int LIZLLL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        Iterator<String> itKeys = jSONObject.keys();
        boolean z = true;
        int iLIZJ = 2;
        while (itKeys.hasNext()) {
            if (!z) {
                iLIZJ++;
            }
            String next = itKeys.next();
            iLIZJ = iLIZJ + LIZJ(next) + 3 + LJ(jSONObject.opt(next));
            z = false;
        }
        return iLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJ(java.lang.Object r5) {
        /*
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto Lb
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            int r0 = LIZLLL(r5)
            return r0
        Lb:
            boolean r0 = r5 instanceof org.json.JSONArray
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L30
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            if (r5 == 0) goto L2f
            r1 = 0
        L17:
            int r0 = r5.length()
            if (r1 >= r0) goto L2e
            if (r2 != 0) goto L21
            int r3 = r3 + 1
        L21:
            java.lang.Object r0 = r5.opt(r1)
            int r0 = LJ(r0)
            int r3 = r3 + r0
            int r1 = r1 + 1
            r2 = 0
            goto L17
        L2e:
            return r3
        L2f:
            return r4
        L30:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L7c
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L79
            r2 = 0
        L39:
            int r0 = r5.length()
            if (r4 >= r0) goto L78
            char r1 = r5.charAt(r4)
            r0 = 12
            if (r1 == r0) goto L75
            r0 = 13
            if (r1 == r0) goto L75
            r0 = 34
            if (r1 == r0) goto L75
            r0 = 47
            if (r1 == r0) goto L75
            r0 = 92
            if (r1 == r0) goto L75
            switch(r1) {
                case 8: goto L75;
                case 9: goto L75;
                case 10: goto L75;
                default: goto L5a;
            }
        L5a:
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 > r0) goto L63
            int r2 = r2 + 1
        L60:
            int r4 = r4 + 1
            goto L39
        L63:
            r0 = 2047(0x7ff, float:2.868E-42)
            if (r1 <= r0) goto L75
            boolean r0 = java.lang.Character.isHighSurrogate(r1)
            if (r0 == 0) goto L72
            int r2 = r2 + 4
            int r4 = r4 + 1
            goto L60
        L72:
            int r2 = r2 + 3
            goto L60
        L75:
            int r2 = r2 + 2
            goto L60
        L78:
            r4 = r2
        L79:
            int r0 = r4 + 2
            return r0
        L7c:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2210061Bee.LJ(java.lang.Object):int");
    }

    public final void LIZ(JSONObject jSONObject) {
        if (!this.LJ) {
            return;
        }
        this.LIZIZ = 0;
        this.LIZJ = 0;
        this.LIZ = LIZLLL(jSONObject) + 5120;
        this.LJFF = false;
    }

    public static String LIZIZ(String str, EnumC2176421AFs enumC2176421AFs, String str2, String str3) {
        if (str3 != null && ((long) str3.length()) * 4 > C2210531BfP.LIZJ) {
            int iLIZJ = LIZJ(str3);
            if (iLIZJ > C2210531BfP.LIZJ && iLIZJ > 0) {
                C2210331Bf5 c2210331Bf5 = C2210331Bf5.LJ;
                long j = C2210531BfP.LIZJ;
                if (c2210331Bf5.LIZ) {
                    HashMap map = new HashMap();
                    map.put("tag", str2);
                    map.put("params", str3);
                    EnumC2210541BfQ enumC2210541BfQ = EnumC2210541BfQ.DataCollection;
                    EnumC2210371Bf9 enumC2210371Bf9 = EnumC2210371Bf9.OutOfDataBoundary;
                    EnumC2210591BfV enumC2210591BfV = EnumC2210591BfV.Fatal;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC2176421AFs);
                    sbLIZ.append(" out of data boundary, event limit length: ");
                    sbLIZ.append(j);
                    c2210331Bf5.LIZJ(enumC2210541BfQ, enumC2210371Bf9, enumC2210591BfV, C2188811AlT.LIZIZ(sbLIZ), map);
                }
                C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(str);
                if (c2209901BeOLIZ != null) {
                    c2209901BeOLIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.PARAMS_CLEARED_BY_EVENT_SIZE_LIMIT, 1);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("{\"params_cleared_by_event_size_limit\":\"");
                sbLIZ2.append(iLIZJ);
                sbLIZ2.append("\",\"max_event_size\":\"");
                sbLIZ2.append(C2210531BfP.LIZJ);
                sbLIZ2.append("\"}");
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return str3;
    }
}
