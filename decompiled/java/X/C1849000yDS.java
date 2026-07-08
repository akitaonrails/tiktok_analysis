package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849000yDS {
    public static final C1849000yDS LIZ = new C1849000yDS();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[PHI: r3
      0x003a: PHI (r3v10 java.lang.Object) = (r3v11 java.lang.Object), (r3v12 java.lang.Object), (r3v13 java.lang.Object), (r3v14 java.lang.Object) binds: [B:10:0x0037, B:22:0x0066, B:28:0x0082, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(org.json.JSONObject r4) {
        /*
            java.lang.String r2 = "dataType"
            boolean r0 = r4.has(r2)
            if (r0 == 0) goto Lae
            java.lang.String r3 = "value"
            boolean r0 = r4.has(r3)
            if (r0 == 0) goto Lae
            X.0yDV r1 = X.EnumC1849020yDU.Companion
            int r0 = r4.optInt(r2)
            r1.getClass()
            java.util.Map<java.lang.Integer, X.0yDU> r1 = X.EnumC1849020yDU.idx
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r1.get(r0)
            X.0yDU r2 = (X.EnumC1849020yDU) r2
            if (r2 != 0) goto L29
            X.0yDU r2 = X.EnumC1849020yDU.OTHER
        L29:
            java.lang.String r0 = ""
            java.lang.String r3 = r4.optString(r3, r0)
            int[] r1 = X.C1849010yDT.LIZ
            int r0 = r2.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto Lae;
                case 2: goto L3a;
                case 3: goto L3b;
                case 4: goto L85;
                case 5: goto L4d;
                case 6: goto L69;
                case 7: goto L8e;
                case 8: goto L9e;
                default: goto L3a;
            }
        L3a:
            return r3
        L3b:
            java.lang.Long r1 = X.C2095008Iq.LJIILIIL(r3)
            if (r1 != 0) goto L68
            java.lang.Double r3 = X.C2327809Ae.LJII(r3)
            if (r3 != 0) goto L3a
            r0 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L4d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L56
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L56
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L56
            goto L62
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L62:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 != 0) goto L3a
        L68:
            return r1
        L69:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L72
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L72
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L72
            goto L7e
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L7e:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 != 0) goto L3a
            return r1
        L85:
            boolean r0 = java.lang.Boolean.parseBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L8e:
            com.google.gson.Gson r1 = X.C1848990yDR.LIZ
            X.0yDO r0 = new X.0yDO
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r3, r0)
            return r3
        L9e:
            com.google.gson.Gson r1 = X.C1848990yDR.LIZ
            X.0yDP r0 = new X.0yDP
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Object r3 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r3, r0)
            return r3
        Lae:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1849000yDS.LIZ(org.json.JSONObject):java.lang.Object");
    }

    public static Pair LIZIZ(Object obj) {
        Pair pair;
        if (obj == null) {
            pair = new Pair(EnumC1849020yDU.NULL, "");
        } else if (obj instanceof String) {
            pair = new Pair(EnumC1849020yDU.STRING, obj);
        } else if (obj instanceof Number) {
            pair = new Pair(EnumC1849020yDU.NUMBER, obj.toString());
        } else if (obj instanceof Boolean) {
            pair = new Pair(EnumC1849020yDU.BOOLEAN, String.valueOf(((Boolean) obj).booleanValue()));
        } else if (obj instanceof JSONObject) {
            pair = new Pair(EnumC1849020yDU.OBJECT, C786410Ut5.J3((JSONObject) obj));
        } else if (obj instanceof JSONArray) {
            pair = new Pair(EnumC1849020yDU.ARRAY, ((JSONArray) obj).toString());
        } else if (obj instanceof Map) {
            pair = new Pair(EnumC1849020yDU.OBJECT, C786410Ut5.J3(new JSONObject((Map) obj)));
        } else if (obj instanceof List) {
            pair = new Pair(EnumC1849020yDU.ARRAY, new JSONArray((Collection) obj).toString());
        } else {
            pair = new Pair(EnumC1849020yDU.OTHER, obj.toString());
        }
        EnumC1849020yDU enumC1849020yDU = (EnumC1849020yDU) pair.getFirst();
        return new Pair(C786410Ut5.J3(new JSONObject().put("dataType", enumC1849020yDU.getCode()).put("value", pair.getSecond())), enumC1849020yDU.name());
    }
}
