package X;

/* JADX INFO: renamed from: X.09Rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2371809Rc {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:3:0x0001, B:5:0x0005, B:6:0x000b, B:8:0x0010, B:10:0x0014, B:12:0x001d, B:14:0x002a, B:17:0x003f, B:18:0x0044, B:19:0x004b, B:21:0x004f, B:22:0x0054), top: B:26:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer LIZ(java.lang.Throwable r4) {
        /*
            r3 = 0
            boolean r0 = r4 instanceof X.C1494430ozZ     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L10
            X.0ozZ r4 = (X.C1494430ozZ) r4     // Catch: java.lang.Throwable -> L7a
            int r0 = r4.getStatusCode()     // Catch: java.lang.Throwable -> L7a
        Lb:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7a
            return r3
        L10:
            boolean r0 = r4 instanceof X.C1494690ozz     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L4b
            r0 = r4
            X.0ozz r0 = (X.C1494690ozz) r0     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.getRequestLog()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L44
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "base"
            org.json.JSONObject r2 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L3c
            java.lang.String r1 = "net_error"
            r0 = r4
            X.0ozz r0 = (X.C1494690ozz) r0     // Catch: java.lang.Throwable -> L7a
            int r0 = r0.getStatusCode()     // Catch: java.lang.Throwable -> L7a
            int r0 = r2.optInt(r1, r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7a
            goto L3d
        L3c:
            r0 = r3
        L3d:
            if (r0 == 0) goto L44
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L7a
            goto Lb
        L44:
            X.0ozz r4 = (X.C1494690ozz) r4     // Catch: java.lang.Throwable -> L7a
            int r0 = r4.getStatusCode()     // Catch: java.lang.Throwable -> L7a
            goto Lb
        L4b:
            boolean r0 = r4 instanceof X.C1494450ozb     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L54
            int r0 = X.C2177208fy.LIZ(r4)     // Catch: java.lang.Throwable -> L7a
            goto Lb
        L54:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "getTTNetStatusCode Throwable:"
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L7a
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Throwable r0 = r4.getCause()     // Catch: java.lang.Throwable -> L7a
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7a
            X.C1AF0.LIZJ(r0)     // Catch: java.lang.Throwable -> L7a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto Lb
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2371809Rc.LIZ(java.lang.Throwable):java.lang.Integer");
    }
}
