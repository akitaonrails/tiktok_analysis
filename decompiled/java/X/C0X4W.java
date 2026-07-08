package X;

/* JADX INFO: renamed from: X.0X4W, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X4W implements InterfaceC792740V7w {
    public static final C0X4W LIZ = new C0X4W();

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:9:0x0013, B:11:0x001e, B:13:0x0024, B:15:0x0042, B:17:0x0048, B:19:0x0052, B:20:0x0057, B:22:0x005f, B:23:0x006c), top: B:29:0x0013 }] */
    @Override // X.InterfaceC792740V7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r10, org.json.JSONObject r11) {
        /*
            r9 = this;
            java.lang.String r8 = "request_log"
            r5 = 0
            if (r10 == 0) goto L78
            int r0 = r10.length()
            if (r0 == 0) goto L78
            if (r11 == 0) goto L78
            int r0 = r11.length()
            if (r0 == 0) goto L78
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L74
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L78
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L78
            java.lang.String r1 = "net_consume_type"
            java.lang.String r0 = "ttnet"
            java.lang.String r4 = r11.optString(r1, r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "timing_totalSendBytes"
            long r2 = r11.optLong(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "timing_totalReceivedBytes"
            long r0 = r11.optLong(r0)     // Catch: java.lang.Throwable -> L74
            long r2 = r2 + r0
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L6c
            org.json.JSONObject r2 = r11.optJSONObject(r8)     // Catch: java.lang.Throwable -> L74
            if (r2 != 0) goto L57
            java.lang.String r1 = r11.optString(r8)     // Catch: java.lang.Throwable -> L74
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L70
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L74
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L74
        L57:
            java.lang.String r0 = "response"
            org.json.JSONObject r1 = r2.optJSONObject(r0)     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L70
            java.lang.String r0 = "received_bytes"
            long r2 = r1.optLong(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "sent_bytes"
            long r0 = r1.optLong(r0)     // Catch: java.lang.Throwable -> L74
            long r2 = r2 + r0
        L6c:
            X.C0X4T.LIZLLL(r2, r4, r10, r5)     // Catch: java.lang.Throwable -> L74
            goto L73
        L70:
            r2 = 0
            goto L6c
        L73:
            return
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X4W.LIZ(java.lang.String, org.json.JSONObject):void");
    }
}
