package X;

/* JADX INFO: renamed from: X.0Z8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894930Z8x extends AbstractC894950Z8z {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[Catch: Exception -> 0x009e, PHI: r16
      0x0076: PHI (r16v3 java.lang.String) = (r16v0 java.lang.String), (r16v4 java.lang.String) binds: [B:33:0x0074, B:31:0x0070] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x009e, blocks: (B:18:0x003a, B:20:0x0047, B:22:0x004b, B:23:0x004f, B:28:0x005f, B:30:0x0064, B:34:0x0076, B:36:0x007c, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:45:0x0094), top: B:53:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[PHI: r16
      0x0082: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v3 java.lang.String), (r16v3 java.lang.String) binds: [B:33:0x0074, B:35:0x007a, B:37:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r19, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r20, X.EnumC1063300dmC r21) {
        /*
            r18 = this;
            r5 = r19
            X.0Z8y r5 = (X.InterfaceC894940Z8y) r5
            r6 = r18
            X.0OvC r0 = r6.IBridgeSdkContext
            if (r0 == 0) goto Lad
            android.content.Context r10 = r0.getContext()
            if (r10 == 0) goto Lad
            java.lang.Class<com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService> r0 = com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService r1 = (com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService) r1
            java.lang.String r3 = ""
            r2 = 0
            if (r1 == 0) goto L38
            X.0YM2 r0 = X.C0YM2.TIKTOK_SOCIAL_IM
            X.0YHX r0 = r1.LIZ(r0)
            if (r0 == 0) goto L38
            X.0YE6 r1 = r0.LJIILIIL()
            if (r1 == 0) goto L38
            java.lang.String r0 = r5.getMessageId()
            if (r0 != 0) goto L32
            r0 = r3
        L32:
            X.0Y9l r14 = r1.LJJIIZI(r0)
        L36:
            r1 = 0
            goto L3a
        L38:
            r14 = r2
            goto L36
        L3a:
            r4 = r20
            X.06oX r0 = com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper.LIZ     // Catch: java.lang.Exception -> L9e
            r0.getClass()     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper r9 = X.C1720706oX.LIZ()     // Catch: java.lang.Exception -> L9e
            if (r9 == 0) goto L87
            X.0Z92 r11 = X.C0Z92.NORMAL     // Catch: java.lang.Exception -> L9e
            if (r14 == 0) goto L5c
            int r12 = r14.getMsgType()     // Catch: java.lang.Exception -> L9e
        L4f:
            java.lang.String r13 = r5.getAwemeId()     // Catch: java.lang.Exception -> L9e
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r15 = new com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo     // Catch: java.lang.Exception -> L9e
            java.lang.String r0 = r5.getMessageId()     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L5f
            goto L5e
        L5c:
            r12 = 0
            goto L4f
        L5e:
            r0 = r3
        L5f:
            r15.<init>(r0)     // Catch: java.lang.Exception -> L9e
            if (r14 == 0) goto L72
            long r7 = r14.getSender()     // Catch: java.lang.Exception -> L9e
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L9e
            java.lang.String r16 = r0.toString()     // Catch: java.lang.Exception -> L9e
            if (r16 != 0) goto L76
        L72:
            r16 = r3
            if (r14 == 0) goto L82
        L76:
            X.0Y8a r0 = r14.getSenderInfo()     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L82
            java.lang.String r17 = r0.getSenderNickName()     // Catch: java.lang.Exception -> L9e
            if (r17 != 0) goto L84
        L82:
            r17 = r3
        L84:
            r9.LJI(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L9e
        L87:
            java.lang.Class<X.0Z90> r5 = X.C0Z90.class
            X.0OvC r0 = r6.IBridgeSdkContext     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.getContainerID()     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L94
        L93:
            r0 = r3
        L94:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.C1909107dp.LIZJ(r5, r0)     // Catch: java.lang.Exception -> L9e
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0     // Catch: java.lang.Exception -> L9e
            r4.onSuccess(r0, r3)     // Catch: java.lang.Exception -> L9e
            return
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto La9
            r3 = r0
        La9:
            r0 = 4
            X.C2382909Vj.LIZ(r4, r1, r3, r2, r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C894930Z8x.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
