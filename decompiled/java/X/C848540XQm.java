package X;

/* JADX INFO: renamed from: X.0XQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848540XQm extends AbstractC848550XQn {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        if (r5 != false) goto L17;
     */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r9, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r10, X.EnumC1063300dmC r11) {
        /*
            r8 = this;
            X.0XQo r9 = (X.InterfaceC848560XQo) r9
            com.ss.android.ugc.aweme.ecommerce.ectracker.EcTrackerConfigModel r0 = X.C848520XQk.LIZ()
            boolean r0 = r0.sdkSwitch
            r4 = 0
            java.lang.String r6 = ""
            if (r0 == 0) goto L66
            java.util.Map r1 = r9.getBcmParams()     // Catch: java.lang.Throwable -> L7a
            X.0OvC r0 = r8.IBridgeSdkContext     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L47
            android.view.View r3 = r0.getView()     // Catch: java.lang.Throwable -> L7a
        L19:
            r8.getHybridUrl(r11)     // Catch: java.lang.Throwable -> L7a
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L7a
            r7.<init>()     // Catch: java.lang.Throwable -> L7a
            java.util.Set r0 = r1.entrySet()     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L7a
        L29:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L49
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L7a
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            r7.put(r1, r0)     // Catch: java.lang.Throwable -> L7a
            goto L29
        L47:
            r3 = r4
            goto L19
        L49:
            if (r3 == 0) goto L66
            boolean r5 = X.C2211631BhB.LIZ(r3, r7)     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L66
            java.lang.String r3 = "btm node not found"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "pageParams: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            r1.append(r7)     // Catch: java.lang.Throwable -> L7a
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7a
            r2 = 10001(0x2711, float:1.4014E-41)
            if (r5 == 0) goto L96
        L66:
            java.lang.Class<X.0XQp> r1 = X.InterfaceC848570XQp.class
            X.0OvC r0 = r8.IBridgeSdkContext
            if (r0 == 0) goto L70
            java.lang.String r4 = r0.getContainerID()
        L70:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.C1909107dp.LIZJ(r1, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0
            r10.onSuccess(r0, r6)
            return
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            java.lang.String r3 = android.util.Log.getStackTraceString(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "EcSetBcmParamsMethod: "
            r1.append(r0)
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            r2 = 10002(0x2712, float:1.4016E-41)
        L96:
            java.lang.Class<X.0XQp> r1 = X.InterfaceC848570XQp.class
            X.0OvC r0 = r8.IBridgeSdkContext
            if (r0 == 0) goto La0
            java.lang.String r4 = r0.getContainerID()
        La0:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.C1909107dp.LIZJ(r1, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0
            r10.onFailure(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C848540XQm.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
