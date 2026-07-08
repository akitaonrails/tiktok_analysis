package X;

/* JADX INFO: renamed from: X.0WMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821900WMa implements C0WMD {
    public final C0WMZ LIZ;
    public C821940WMe LIZIZ;

    @Override // X.C0WMD
    public final C0WO4 LIZIZ(String str) {
        return null;
    }

    @Override // X.C0WMD
    public final /* bridge */ /* synthetic */ Object LIZ() {
        return this.LIZIZ;
    }

    public C821900WMa(C0WMZ c0wmz) {
        this.LIZ = c0wmz;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C828420Wee r13) {
        /*
            r12 = this;
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.LJFF
            java.lang.String r0 = "URL"
            java.lang.Object r5 = r4.get(r0)
            boolean r0 = r5 instanceof java.lang.String
            r9 = 0
            if (r0 == 0) goto L7e
            java.lang.String r5 = (java.lang.String) r5
        Lf:
            java.lang.String r0 = "is_iframe_scene"
            java.lang.Object r1 = r4.get(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L7c
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L7c
            boolean r10 = r1.booleanValue()
        L21:
            if (r10 == 0) goto L31
            java.lang.String r0 = "main_frame_url"
            java.lang.Object r11 = r4.get(r0)
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L31
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L32
        L31:
            r11 = r5
        L32:
            X.0WMe r2 = new X.0WMe
            X.0WMZ r3 = r12.LIZ
            java.lang.String r0 = "engine_view"
            java.lang.Object r6 = r4.get(r0)
            boolean r0 = r6 instanceof android.webkit.WebView
            if (r0 == 0) goto L7a
            android.webkit.WebView r6 = (android.webkit.WebView) r6
        L42:
            java.lang.String r0 = "inject_script"
            java.lang.Object r7 = r4.get(r0)
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L78
            java.lang.String r7 = (java.lang.String) r7
        L4e:
            java.lang.String r0 = "inject_config"
            java.lang.Object r8 = r4.get(r0)
            boolean r0 = r8 instanceof com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig
            if (r0 == 0) goto L76
            com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig r8 = (com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig) r8
        L5a:
            java.lang.String r0 = "dataflowId"
            java.lang.Object r1 = r4.get(r0)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L70
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L70
            int r0 = r1.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L70:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.LIZIZ = r2
            return
        L76:
            r8 = r9
            goto L5a
        L78:
            r7 = r9
            goto L4e
        L7a:
            r6 = r9
            goto L42
        L7c:
            r10 = 0
            goto L21
        L7e:
            r5 = r9
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C821900WMa.LIZJ(X.0Wee):void");
    }
}
