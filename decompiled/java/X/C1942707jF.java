package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.07jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942707jF {
    public final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        r1 = 0L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r8) {
        /*
            r7 = this;
            long r5 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r7.LIZ
            java.lang.Object r1 = r2.get(r8)
            if (r1 != 0) goto L19
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.putIfAbsent(r8, r1)
            if (r0 == 0) goto L19
            r1 = r0
        L19:
            java.lang.Long r1 = (java.lang.Long) r1
            long r0 = r1.longValue()
            long r3 = r5 - r0
            r1 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L36
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r0 = "interval less than 5 minutes"
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "ThrottleModel"
            X.C1553130qWF.LIZ(r0, r1)
            return r2
        L36:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r7.LIZ
            r0.put(r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1942707jF.LIZ(java.lang.String):boolean");
    }
}
