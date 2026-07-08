package X;

/* JADX INFO: renamed from: X.0vQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741810vQZ extends AbstractC1741820vQa {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r6, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r7, X.EnumC1063300dmC r8) throws org.json.JSONException {
        /*
            r5 = this;
            org.json.JSONObject r1 = r6.toJSON()
            java.lang.String r0 = "key"
            java.lang.String r3 = r1.optString(r0)
            java.lang.String r0 = "scene"
            java.lang.String r2 = r1.optString(r0)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService r0 = com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheServiceImpl.LIZLLL()
            boolean r0 = r0.LIZJ(r2)
            java.lang.String r1 = "result"
            if (r0 == 0) goto L6f
            com.ss.android.ugc.aweme.ecommerce.service.ICartCacheService r0 = com.ss.android.ugc.aweme.ecommerce.base.cart.cache.CartCacheServiceImpl.LIZLLL()
            java.lang.String r0 = r0.LIZIZ()
            if (r0 == 0) goto L2e
            r4.put(r1, r0)
        L2e:
            X.0OvC r1 = r5.IBridgeSdkContext
            if (r1 == 0) goto L6d
            java.lang.Class<X.0pxQ> r0 = X.C1531540pxQ.class
            java.lang.Object r1 = r1.LIZIZ(r0)
            X.0pxQ r1 = (X.C1531540pxQ) r1
            if (r1 == 0) goto L6d
            java.lang.String r0 = r5.getName()
            boolean r0 = r1.LIZ(r0)
            r3 = 1
            if (r0 != r3) goto L6d
        L47:
            java.lang.Class<X.0vQb> r1 = X.InterfaceC1741830vQb.class
            X.0OvC r0 = r5.IBridgeSdkContext
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.getContainerID()
        L51:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r2 = X.C1909107dp.LIZJ(r1, r0)
            r1 = r2
            X.0vQb r1 = (X.InterfaceC1741830vQb) r1
            if (r3 == 0) goto L60
            com.lynx.react.bridge.PiperData r0 = new com.lynx.react.bridge.PiperData
            r0.<init>(r4)
            r4 = r0
        L60:
            r1.setData(r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r2 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r2
            java.lang.String r0 = ""
            r7.onSuccess(r2, r0)
            return
        L6b:
            r0 = 0
            goto L51
        L6d:
            r3 = 0
            goto L47
        L6f:
            X.189t r0 = X.C212391189t.LIZ
            r0.getClass()
            java.lang.String r0 = X.C212391189t.LIZ(r2, r3)
            if (r0 == 0) goto L2e
            r4.put(r1, r0)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1741810vQZ.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
