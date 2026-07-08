package X;

/* JADX INFO: renamed from: X.0NhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600780NhM extends AbstractC600790NhN {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[PHI: r0 r1
      0x0062: PHI (r0v13 X.0OvC) = (r0v8 X.0OvC), (r0v11 X.0OvC), (r0v15 X.0OvC) binds: [B:28:0x00b1, B:24:0x0091, B:18:0x0060] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r1v10 java.lang.Class<X.0NhP>) = (r1v4 java.lang.Class<X.0NhP>), (r1v6 java.lang.Class<X.0NhP>), (r1v11 java.lang.Class<X.0NhP>) binds: [B:28:0x00b1, B:24:0x0091, B:18:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r8, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r9, X.EnumC1063300dmC r10) {
        /*
            r7 = this;
            X.0NhO r8 = (X.InterfaceC600800NhO) r8
            X.0OvC r5 = r7.IBridgeSdkContext
            r6 = 4
            r4 = 0
            r3 = 0
            if (r5 != 0) goto Lf
            java.lang.String r0 = "bridge context is empty"
            X.C2382909Vj.LIZ(r9, r3, r0, r4, r6)
            return
        Lf:
            java.lang.String r0 = r8.getCallbackId()
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            java.lang.String r0 = "empty callback id when trigger responsive event"
            X.C2382909Vj.LIZ(r9, r3, r0, r4, r6)
            return
        L1f:
            java.lang.Class<X.0vpa> r0 = X.C1757320vpa.class
            java.lang.Object r2 = r5.LIZIZ(r0)
            X.0vpa r2 = (X.C1757320vpa) r2
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel.class
            java.lang.Object r1 = r5.LIZIZ(r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel) r1
            java.lang.Class<X.0NfG> r0 = X.InterfaceC599480NfG.class
            java.lang.Object r5 = r5.LIZIZ(r0)
            X.0NfG r5 = (X.InterfaceC599480NfG) r5
            if (r2 == 0) goto L72
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService> r0 = r2.LIZLLL
            if (r0 == 0) goto L5c
            java.lang.Object r5 = r0.get()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService r5 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService) r5
            if (r5 == 0) goto L5c
            java.lang.String r3 = r8.getCallbackId()
            java.util.Map r2 = r8.getData()
            java.lang.String r1 = r8.getMsg()
            java.lang.Number r0 = r8.getCode()
            int r0 = r0.intValue()
            r5.q2(r0, r3, r1, r2)
        L5c:
            java.lang.Class<X.0NhP> r1 = X.InterfaceC600810NhP.class
            X.0OvC r0 = r7.IBridgeSdkContext
            if (r0 == 0) goto L66
        L62:
            java.lang.String r4 = r0.getContainerID()
        L66:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r1, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = ""
            r9.onSuccess(r1, r0)
            return
        L72:
            if (r1 == 0) goto L94
            X.0NfG r5 = r1.LLIZLLLIL
            java.lang.String r3 = r8.getCallbackId()
            java.util.Map r2 = r8.getData()
            java.lang.String r1 = r8.getMsg()
            java.lang.Number r0 = r8.getCode()
            int r0 = r0.intValue()
            r5.q2(r0, r3, r1, r2)
            java.lang.Class<X.0NhP> r1 = X.InterfaceC600810NhP.class
            X.0OvC r0 = r7.IBridgeSdkContext
            if (r0 == 0) goto L66
            goto L62
        L94:
            if (r5 == 0) goto Lb4
            java.lang.String r3 = r8.getCallbackId()
            java.util.Map r2 = r8.getData()
            java.lang.String r1 = r8.getMsg()
            java.lang.Number r0 = r8.getCode()
            int r0 = r0.intValue()
            r5.q2(r0, r3, r1, r2)
            java.lang.Class<X.0NhP> r1 = X.InterfaceC600810NhP.class
            X.0OvC r0 = r7.IBridgeSdkContext
            if (r0 == 0) goto L66
            goto L62
        Lb4:
            X.03xw r2 = X.EnumC1014603xw.ERR_PDP_CROSS_MODULE_COMMUNICATION_ERROR
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "lack region context"
            r1.<init>(r0)
            X.C1019103yf.LIZ(r2, r1, r4)
            X.C2382909Vj.LIZ(r9, r3, r0, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C600780NhM.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
