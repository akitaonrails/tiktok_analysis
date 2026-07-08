package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ciE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1022400ciE {
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:0: B:7:0x002b->B:48:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(X.C1008520cLq r11, X.C1022420ciG r12) {
        /*
            java.lang.String r1 = r12.LIZJ
            java.lang.String r0 = r11.LIZ
            boolean r10 = LIZIZ(r1, r0)
            java.lang.String r1 = r12.LIZIZ
            java.lang.String r0 = r11.LIZIZ
            boolean r9 = LIZIZ(r1, r0)
            java.lang.String r1 = r12.LIZLLL
            java.lang.String r0 = r11.LIZJ
            boolean r8 = LIZIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.LIZLLL
            r7 = 1
            if (r1 == 0) goto La7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La7
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L2b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.getValue()
            boolean r0 = r12.LIZ
            r3 = 0
            java.lang.String r2 = "ad_extra_data"
            if (r0 == 0) goto L92
            X.0ciu r1 = r12.LJI
            if (r1 == 0) goto L5e
            if (r4 == 0) goto L5e
            int r0 = r4.length()
            if (r0 == 0) goto L5e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.LJII
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r4)
            if (r0 != 0) goto L78
        L5e:
            X.0ciu r0 = r12.LJI
            if (r0 == 0) goto La5
            java.lang.Object r0 = r0.LJFF(r2)
            if (r0 == 0) goto La5
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto La5
            org.json.JSONObject r0 = X.C12865051r.LIZ(r0)
            java.lang.Object r0 = r0.opt(r4)
        L76:
            if (r0 == 0) goto La5
        L78:
            java.lang.String r0 = r0.toString()
        L7c:
            if (r5 == 0) goto L82
            java.lang.String r3 = r5.toString()
        L82:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 != 0) goto L2b
            r0 = 0
        L89:
            if (r10 == 0) goto La9
            if (r9 == 0) goto La9
            if (r8 == 0) goto La9
            if (r0 == 0) goto La9
            return r7
        L92:
            org.json.JSONObject r0 = r12.LJFF
            if (r0 == 0) goto La5
            java.lang.String r0 = r0.optString(r2)
            if (r0 == 0) goto La5
            org.json.JSONObject r0 = X.C12865051r.LIZ(r0)
            java.lang.Object r0 = r0.opt(r4)
            goto L76
        La5:
            r0 = r3
            goto L7c
        La7:
            r0 = 1
            goto L89
        La9:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1022400ciE.LIZ(X.0cLq, X.0ciG):boolean");
    }

    public static final boolean LIZIZ(String str, String str2) {
        if (!Intrinsics.LJFF(str, str2) && !Intrinsics.LJFF(str2, "all")) {
            if (a0.LJJJIL(str) && Intrinsics.LJFF(str2, "null")) {
                return true;
            }
            return false;
        }
        return true;
    }
}
