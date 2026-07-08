package X;

/* JADX INFO: renamed from: X.0uxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723940uxk extends AbstractC1724310uyL {
    public final int LIZIZ = 10001;

    @Override // X.AbstractC1724310uyL
    public final String LJI() {
        return "pipo.getInfoByOcr";
    }

    @Override // X.AbstractC1064500do8, X.InterfaceC1063690dmp
    public final EnumC1063570dmd getAccess() {
        return EnumC1063570dmd.PUBLIC;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // X.AbstractC1724310uyL, X.InterfaceC1063690dmp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC1107590evd r13, final X.InterfaceC1063920dnC r14, X.EnumC1059790dgX r15) {
        /*
            r12 = this;
            super.LIZIZ(r13, r14, r15)
            java.lang.String r0 = "merchant_user_id"
            java.lang.String r6 = X.C1723950uxl.LJ(r13, r0)
            java.lang.String r0 = "nonce"
            java.lang.String r7 = X.C1723950uxl.LJ(r13, r0)
            java.lang.String r0 = "session_id"
            java.lang.String r10 = X.C1723950uxl.LJ(r13, r0)
            java.lang.String r0 = "merchant_id"
            java.lang.String r5 = X.C1723950uxl.LJ(r13, r0)
            java.lang.String r0 = "biz_merchant_id"
            java.lang.String r11 = X.C1723950uxl.LJ(r13, r0)
            r2 = 0
            if (r13 == 0) goto L41
            java.lang.String r1 = "ocr_mode"
            boolean r0 = r13.hasKey(r1)
            if (r0 == 0) goto L41
            X.0yoG r3 = r13.get(r1)
            X.0kXq r1 = r3.getType()
            X.0kXq r0 = X.EnumC1323480kXq.Int
            if (r1 != r0) goto L41
            int r4 = r3.asInt()     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L41:
            r4 = 0
        L42:
            java.lang.String r0 = "show_security_tips"
            java.lang.String r8 = X.C1723950uxl.LJ(r13, r0)
            java.lang.String r0 = "ui_type"
            java.lang.String r9 = X.C1723950uxl.LJ(r13, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r3 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "pipo.getInfoByOcr"
            if (r0 == 0) goto L5e
            java.lang.String r0 = "merchantId is empty!"
            X.C1723950uxl.LIZIZ(r1, r2, r3, r0, r14)
            return
        L5e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L6a
            java.lang.String r0 = "merchantUserId is empty!"
            X.C1723950uxl.LIZIZ(r1, r2, r3, r0, r14)
            return
        L6a:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7c
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L7c
            java.lang.String r0 = "nonce & session_id is empty!"
            X.C1723950uxl.LIZIZ(r1, r2, r3, r0, r14)
            return
        L7c:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L88
            X.0uy5 r0 = X.C1724150uy5.LJIIL
            X.0uy7 r0 = r0.LIZ
            r0.LJIIZILJ = r7
        L88:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            android.os.Looper r2 = android.os.Looper.myLooper()
            X.0uwV r0 = new X.0uwV
            r0.<init>()
            r1.<init>(r2, r0)
            X.0uxc r3 = new X.0uxc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService> r0 = com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService.class
            java.lang.Object r2 = r2.getService(r0)
            com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService r2 = (com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService) r2
            X.0uxe r4 = X.C1723880uxe.LIZIZ
            X.0uuy r5 = new X.0uuy
            r5.<init>()
            r6 = 0
            r7 = r6
            r8 = r6
            r2.LIZ(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1723940uxk.LIZIZ(X.0evd, X.0dnC, X.0dgX):void");
    }
}
