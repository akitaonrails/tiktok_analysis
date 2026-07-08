package X;

/* JADX INFO: renamed from: X.0w7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768500w7c extends AbstractC1768510w7d {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r8, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r9, X.EnumC1063300dmC r10) {
        /*
            r7 = this;
            X.0w7e r8 = (X.InterfaceC1768520w7e) r8
            X.04zf r0 = X.C1280104zf.LIZ
            r0.getClass()
            java.lang.String r2 = r8.getPrefetchScene()
            java.lang.String r4 = ""
            r3 = 0
            if (r2 == 0) goto L1b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r1 = X.C1280104zf.LIZIZ
            java.util.List r0 = r8.getCacheParamsKey()
            if (r0 == 0) goto L9a
            r1.put(r2, r0)
        L1b:
            java.util.Map r1 = r8.getCommonParams()
            if (r1 == 0) goto L9a
            java.util.List r0 = r8.getCacheParamsKey()
            java.lang.String r6 = X.C1280104zf.LIZ(r0, r1)
            if (r6 == 0) goto L9a
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.Map r0 = r8.getCommonParams()
            if (r0 == 0) goto L5c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L3e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            X.C786410Ut5.LJJJI(r1, r0, r2)
            goto L3e
        L5c:
            java.lang.String r0 = "preload_key"
            X.C786410Ut5.LJJJI(r0, r6, r2)
            java.lang.String r1 = "preload_channel"
            java.lang.String r0 = "ec_mix_mall_prefetch"
            X.C786410Ut5.LJJJI(r1, r0, r2)
            java.lang.Number r0 = r8.getExpireTime()
            if (r0 == 0) goto L79
            int r0 = r0.intValue()
            int r1 = r0 * 1000
            java.lang.String r0 = "preload_expire_time"
            r2.putInt(r0, r1)
        L79:
            X.0wC1 r1 = com.ss.android.ugc.aweme.ecommerce.mall.preload.ShopMixMallDataPreload.Companion
            X.0wC7 r0 = X.EnumC1771290wC7.ROUTER
            r1.getClass()
            X.C1771230wC1.LIZIZ(r2, r3, r0)
            java.lang.String r2 = r8.getPrefetchScene()
            if (r2 != 0) goto L8a
            r2 = r4
        L8a:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "scene"
            r1.<init>(r0, r2)
            java.util.Map r1 = X.C2097908Jt.LIZJ(r1)
            java.lang.String r0 = "rd_tiktokec_mix_mall_prefetch"
            X.C1018703yb.LJ(r0, r1)
        L9a:
            java.lang.Class<X.0w7f> r1 = X.InterfaceC1768530w7f.class
            X.0OvC r0 = r7.IBridgeSdkContext
            if (r0 == 0) goto La4
            java.lang.String r3 = r0.getContainerID()
        La4:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.C1909107dp.LIZJ(r1, r3)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0
            r9.onSuccess(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768500w7c.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
