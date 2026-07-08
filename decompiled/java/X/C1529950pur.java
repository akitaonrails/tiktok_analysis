package X;

/* JADX INFO: renamed from: X.0pur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529950pur extends AbstractC1506460pIy {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r1 != null) goto L29;
     */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r8, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r9, X.EnumC1063300dmC r10) {
        /*
            r7 = this;
            X.0OvC r1 = r7.IBridgeSdkContext
            r4 = 0
            if (r1 == 0) goto L29
            java.lang.Class<X.0qEH> r0 = X.InterfaceC1541990qEH.class
            java.lang.Object r0 = r1.LIZIZ(r0)
            X.0qEH r0 = (X.InterfaceC1541990qEH) r0
            if (r0 == 0) goto L29
            X.0q70 r6 = r0.getHybridContext()
        L13:
            boolean r0 = r6 instanceof com.bytedance.hybrid.spark.SparkContext
            if (r0 != 0) goto L18
            r6 = r4
        L18:
            r5 = 0
            if (r6 != 0) goto L2b
            java.lang.Class<X.0pJ0> r0 = X.InterfaceC1506480pJ0.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r0, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = "spark context is null or not Spark Context."
            r9.onFailure(r5, r0, r1)
            return
        L29:
            r6 = r4
            goto L13
        L2b:
            X.0OvC r0 = r7.IBridgeSdkContext
            if (r0 == 0) goto L4a
            android.app.Activity r2 = r0.LIZLLL()
            if (r2 == 0) goto L4a
            boolean r0 = r2 instanceof X.C19EG
            if (r0 == 0) goto L3e
            r1 = r2
            X.19EG r1 = (X.C19EG) r1
            if (r1 != 0) goto L58
        L3e:
            android.app.Activity r1 = X.C715020S2y.LIZ(r2)
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L4a
            X.19EG r1 = (X.C19EG) r1
            if (r1 != 0) goto L58
        L4a:
            java.lang.Class<X.0pJ0> r0 = X.InterfaceC1506480pJ0.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r0, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = "context is null or not a FragmentActivity."
            r9.onFailure(r5, r0, r1)
            return
        L58:
            java.lang.Class<com.bytedance.hybrid.spark.page.SparkPopup> r0 = com.bytedance.hybrid.spark.page.SparkPopup.class
            java.lang.Object r3 = r6.LJFF(r0)
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            if (r3 == 0) goto L9e
            boolean r0 = r3.isAdded()
            if (r0 != 0) goto L85
            androidx.fragment.app.FragmentManager r2 = r1.getSupportFragmentManager()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "SparkPopup#"
            r1.append(r0)
            java.lang.String r0 = r6.containerId
            int r0 = r0.hashCode()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.show(r2, r0)
        L85:
            java.lang.Class<X.0pJ0> r0 = X.InterfaceC1506480pJ0.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.C1909107dp.LIZJ(r0, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0
            java.lang.String r1 = ""
            r9.onSuccess(r0, r1)
            java.lang.Class<X.0pJ0> r0 = X.InterfaceC1506480pJ0.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.C1909107dp.LIZJ(r0, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0
            r9.onSuccess(r0, r1)
            return
        L9e:
            java.lang.Class<X.0pJ0> r0 = X.InterfaceC1506480pJ0.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r0, r4)
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1
            java.lang.String r0 = "spark popup is null"
            r9.onFailure(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1529950pur.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
