package X;

import android.util.LruCache;

/* JADX INFO: renamed from: X.0Wb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826210Wb5 {
    public static volatile C826220Wb6 LIZ;
    public static LruCache<String, EnumC826230Wb7> LIZIZ;
    public static volatile boolean LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC826230Wb7 LIZ(java.lang.String r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L84
            int r0 = r6.length()
            if (r0 == 0) goto L84
            boolean r0 = X.C826210Wb5.LIZJ
            if (r0 != 0) goto L10
            X.0Wb7 r0 = X.EnumC826230Wb7.UNKNOWN
            return r0
        L10:
            r5 = 0
            android.util.LruCache<java.lang.String, X.0Wb7> r0 = X.C826210Wb5.LIZIZ     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L1e
            X.0Wb7 r0 = (X.EnumC826230Wb7) r0     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            return r0
        L1e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C826210Wb5.LIZIZ = r5
        L24:
            X.0Wb6 r3 = X.C826210Wb5.LIZ
            if (r3 == 0) goto L70
            if (r6 == 0) goto L70
            int r0 = r6.length()
            if (r0 == 0) goto L70
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r6.toLowerCase(r0)
            java.lang.String r0 = "."
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r4, r0)
            java.util.List r0 = X.C13LP.LJLJJLL(r0)
            X.0Wb9 r1 = r3.LIZ
            java.util.Iterator r3 = r0.iterator()
            r4 = r5
        L4c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.length()
            if (r0 == 0) goto L4c
            java.util.HashMap<java.lang.String, X.0Wb9> r0 = r1.LIZ
            java.lang.Object r1 = r0.get(r2)
            X.0Wb9 r1 = (X.C826250Wb9) r1
            if (r1 == 0) goto L6e
            X.0Wb7 r0 = r1.LIZIZ
            if (r0 == 0) goto L4c
            r4 = r0
            goto L4c
        L6e:
            if (r4 != 0) goto L72
        L70:
            X.0Wb7 r4 = X.EnumC826230Wb7.EXTERNAL_THIRD_PARTY
        L72:
            android.util.LruCache<java.lang.String, X.0Wb7> r0 = X.C826210Wb5.LIZIZ     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L83
            java.lang.Object r0 = r0.put(r6, r4)     // Catch: java.lang.Throwable -> L7d
            X.0Wb7 r0 = (X.EnumC826230Wb7) r0     // Catch: java.lang.Throwable -> L7d
            return r4
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C826210Wb5.LIZIZ = r5
        L83:
            return r4
        L84:
            X.0Wb7 r0 = X.EnumC826230Wb7.UNKNOWN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C826210Wb5.LIZ(java.lang.String):X.0Wb7");
    }
}
