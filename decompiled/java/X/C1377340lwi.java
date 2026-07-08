package X;

/* JADX INFO: renamed from: X.0lwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377340lwi {
    public static final C1377340lwi LIZ = new C1377340lwi();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r0 = 2000;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(java.lang.String r16, java.lang.String r17, org.json.JSONObject r18) {
        /*
            r6 = 0
            r3 = r18
            if (r3 == 0) goto L88
            java.lang.String r0 = "dynamic_biz_scene"
            java.lang.String r4 = r3.optString(r0)
            java.lang.String r0 = "share_type"
            int r0 = r3.optInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L88
            int r1 = r0.intValue()
            r0 = 103(0x67, float:1.44E-43)
            if (r1 != r0) goto L88
            r0 = 2000(0x7d0, float:2.803E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L88
            int r2 = r0.intValue()
            r10 = r17
            r5 = r16
            if (r4 == 0) goto L4d
            int r0 = r4.length()
            if (r0 == 0) goto L4d
            java.lang.Class<com.ss.android.ugc.aweme.internalshare.api.service.IShareDynamicTemplateService> r0 = com.ss.android.ugc.aweme.internalshare.api.service.IShareDynamicTemplateService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.internalshare.api.service.IShareDynamicTemplateService r0 = (com.ss.android.ugc.aweme.internalshare.api.service.IShareDynamicTemplateService) r0
            if (r0 == 0) goto L4b
            com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask r0 = r0.LIZ(r5, r4, r10, r3)
        L45:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r6, r0)
            return r1
        L4b:
            r0 = r6
            goto L45
        L4d:
            if (r3 == 0) goto L86
            java.lang.String r0 = "share_data"
            org.json.JSONObject r1 = r3.optJSONObject(r0)
            if (r1 == 0) goto L86
            java.lang.String r0 = "scene"
            java.lang.String r13 = r1.optString(r0)
            java.lang.String r0 = "content_pb"
            java.lang.String r0 = r1.optString(r0)
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r14 = X.C2241931Cox.LIZIZ(r2, r0)
            if (r14 == 0) goto L86
            com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask r12 = new com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask
            com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel r4 = new com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel
            java.lang.String r7 = "share_panel"
            r11 = 26
            r8 = r6
            r9 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r17 = 0
            r18 = 24
            r15 = r4
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L80:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r12, r6)
            return r1
        L86:
            r12 = r6
            goto L80
        L88:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r6, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1377340lwi.LIZ(java.lang.String, java.lang.String, org.json.JSONObject):kotlin.Pair");
    }
}
