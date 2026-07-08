package X;

/* JADX INFO: renamed from: X.0Vl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806910Vl3 {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r1 == (-1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ() throws java.lang.Throwable {
        /*
            java.lang.String r8 = "unknown"
            X.18aN r0 = X.C21309718aN.LJIIZILJ     // Catch: java.lang.Exception -> L91
            android.content.Context r7 = r0.LIZ     // Catch: java.lang.Exception -> L91
            if (r7 == 0) goto L83
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C786410Ut5.H2(r7, r0)     // Catch: java.lang.Exception -> L91
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L14
            return r8
        L14:
            android.net.NetworkInfo r1 = X.C786410Ut5.LJIJ(r0)     // Catch: java.lang.Exception -> L91
            r6 = 0
            java.lang.String r5 = "dzBzEgA/UcnUWFYzTlymXsLWlTw3JYq5Jg4LJIA="
            r4 = 1
            if (r1 == 0) goto L2d
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Exception -> L91
            r0.<init>(r5, r6)     // Catch: java.lang.Exception -> L91
            int r0 = X.C2204961BRm.LJLLILLLL(r1, r0)     // Catch: java.lang.Exception -> L91
            if (r0 != r4) goto L2d
            java.lang.String r0 = "wifi"
            return r0
        L2d:
            java.lang.String r0 = "phone"
            java.lang.Object r3 = X.C786410Ut5.H2(r7, r0)     // Catch: java.lang.Exception -> L91
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch: java.lang.Exception -> L91
            if (r3 != 0) goto L38
            return r8
        L38:
            java.lang.String r2 = "YW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="
            r0 = 0
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L7b
            byte[] r0 = android.util.Base64.decode(r2, r0)     // Catch: java.lang.Exception -> L7b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L7b
            java.lang.String r0 = "hasBase64Permission"
            X.C806930Vl5.LIZ(r0)     // Catch: java.lang.Exception -> L7b
            int r0 = X.C838410Wul.LIZ(r7, r1)     // Catch: java.lang.Exception -> L7b
            if (r0 != 0) goto L7f
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L91
            r0 = 29
            if (r1 < r0) goto L71
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C804370Vgx.LIZ     // Catch: java.lang.Exception -> L91
            boolean r0 = r0.getAndSet(r4)     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L64
            X.0Vgz r0 = X.C804370Vgx.LIZ()     // Catch: java.lang.Exception -> L91
            r0.LIZIZ()     // Catch: java.lang.Exception -> L91
        L64:
            X.0Vgz r0 = X.C804370Vgx.LIZ()     // Catch: java.lang.Exception -> L91
            int r1 = r0.LIZ()     // Catch: java.lang.Exception -> L91
            boolean r0 = X.C804370Vgx.LIZJ     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L84
            goto L80
        L71:
            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Exception -> L91
            r0.<init>(r5, r6)     // Catch: java.lang.Exception -> L91
            int r1 = X.C2204961BRm.LLIILII(r3, r0)     // Catch: java.lang.Exception -> L91
            goto L84
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L91
        L7f:
            return r8
        L80:
            r0 = -1
            if (r1 != r0) goto L84
        L83:
            return r8
        L84:
            switch(r1) {
                case 1: goto L88;
                case 2: goto L88;
                case 3: goto L8b;
                case 4: goto L88;
                case 5: goto L8b;
                case 6: goto L8b;
                case 7: goto L88;
                case 8: goto L8b;
                case 9: goto L8b;
                case 10: goto L8b;
                case 11: goto L88;
                case 12: goto L8b;
                case 13: goto L8e;
                case 14: goto L8b;
                case 15: goto L8b;
                default: goto L87;
            }     // Catch: java.lang.Exception -> L91
        L87:
            return r8
        L88:
            java.lang.String r8 = "2G"
            return r8
        L8b:
            java.lang.String r0 = "3G"
            return r0
        L8e:
            java.lang.String r0 = "4G"
            return r0
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C806910Vl3.LIZ():java.lang.String");
    }
}
