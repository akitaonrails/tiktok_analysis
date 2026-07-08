package X;

/* JADX INFO: renamed from: X.1BRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BRZ implements InterfaceC2204861BRc {
    public C1550010qRD LIZ;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    @Override // X.InterfaceC2204861BRc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C2204851BRb r6, X.C2204841BRa r7) {
        /*
            r5 = this;
            X.0WKS r4 = new X.0WKS
            java.lang.String r3 = r6.LIZIZ
            java.lang.String r2 = ""
            if (r3 != 0) goto L9
            r3 = r2
        L9:
            java.lang.String r1 = r6.LIZ
            if (r1 != 0) goto Le
            r1 = r2
        Le:
            org.json.JSONObject r0 = r6.LIZJ
            if (r0 == 0) goto L16
            java.lang.String r2 = X.C786410Ut5.J3(r0)
        L16:
            r4.<init>(r3, r1, r2)
            java.lang.Exception r0 = r7.LIZIZ
            if (r0 == 0) goto L2d
            X.0OAI r2 = new X.0OAI
            java.lang.String r1 = "network_error"
            java.lang.Exception r0 = r7.LIZIZ
            r2.<init>(r1, r0)
        L26:
            X.0qRD r0 = r5.LIZ
            if (r0 == 0) goto L2c
            boolean r0 = r0.LIZIZ
        L2c:
            return
        L2d:
            org.json.JSONObject r0 = r7.LIZ
            if (r0 == 0) goto L26
            java.lang.String r1 = "message"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L5a
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = r0.optString(r1)
            java.lang.String r0 = "success"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
        L47:
            X.0OAI r2 = new X.0OAI
            java.lang.Exception r1 = new java.lang.Exception
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r0 = X.C786410Ut5.J3(r0)
            r1.<init>(r0)
            java.lang.String r0 = "api_error"
            r2.<init>(r0, r1)
            goto L26
        L5a:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "code"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L6d
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
        L6a:
            if (r0 == 0) goto L26
            goto L47
        L6d:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "status_code"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L7e
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
            goto L6a
        L7e:
            org.json.JSONObject r0 = r7.LIZ
            java.lang.String r1 = "statusCode"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L26
            org.json.JSONObject r0 = r7.LIZ
            int r0 = r0.optInt(r1)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BRZ.LIZ(X.1BRb, X.1BRa):void");
    }
}
