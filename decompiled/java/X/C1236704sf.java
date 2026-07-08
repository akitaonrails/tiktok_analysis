package X;

/* JADX INFO: renamed from: X.04sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1236704sf {
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.String> LIZ(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            return r5
        L7:
            int r0 = r4.length()
            r2 = 1
            if (r0 != 0) goto L14
            r0 = 1
        Lf:
            java.lang.String r3 = "StudioTrackPrivacyFilter"
            if (r0 != 0) goto L3b
            goto L16
        L14:
            r0 = 0
            goto Lf
        L16:
            X.04se r0 = X.C1236604se.LIZ     // Catch: java.lang.Throwable -> L24
            r0.getClass()     // Catch: java.lang.Throwable -> L24
            X.01GW r0 = X.C1236604se.LIZJ     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L24
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L24
            goto L3d
        L24:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "read top-level config failed. event="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.android.agilelogger.ALog.e(r3, r0, r2)
        L3b:
            r1 = 0
            goto L4c
        L3d:
            java.lang.Object r1 = r0.get(r4)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L3b
            boolean r0 = r1.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L3b
        L4c:
            if (r1 != 0) goto L4f
            return r5
        L4f:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L69
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
        L58:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L68
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L69
            r2.remove(r0)     // Catch: java.lang.Throwable -> L69
            goto L58
        L68:
            return r2
        L69:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "filter(Map) failed, fallback to origin. event="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.android.agilelogger.ALog.e(r3, r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1236704sf.LIZ(java.lang.String, java.util.Map):java.util.Map");
    }
}
