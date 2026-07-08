package X;

/* JADX INFO: renamed from: X.0hBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194580hBw extends AbstractC1194590hBx {
    /* JADX WARN: Can't wrap try/catch for region: R(14:30|3|(12:5|(1:7)|(2:11|13)(1:12)|14|(1:16)(1:18)|17|32|19|(1:21)|22|25|26)(1:8)|9|(0)(0)|14|(0)(0)|17|32|19|(0)|22|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:3:0x0003, B:5:0x0007, B:7:0x000d, B:13:0x001e, B:14:0x0026, B:16:0x002c, B:17:0x0034, B:19:0x003b, B:22:0x0052, B:25:0x005a, B:24:0x0056), top: B:30:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r8, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r9, X.EnumC1063300dmC r10) {
        /*
            r7 = this;
            X.0hBy r8 = (X.InterfaceC1194600hBy) r8
            r3 = 0
            X.0OvC r0 = r7.IBridgeSdkContext     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L17
            java.lang.String r5 = r0.getContainerID()     // Catch: java.lang.Exception -> L6f
            if (r5 == 0) goto L18
            X.0puk r0 = com.bytedance.hybrid.spark.SparkContext.Companion     // Catch: java.lang.Exception -> L6f
            r0.getClass()     // Catch: java.lang.Exception -> L6f
            X.0q70 r1 = X.C1529880puk.LIZIZ(r5)     // Catch: java.lang.Exception -> L6f
            goto L19
        L17:
            r5 = r3
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L1c
            goto L1e
        L1c:
            r6 = r3
            goto L26
        L1e:
            java.lang.Class<androidx.fragment.app.Fragment> r0 = androidx.fragment.app.Fragment.class
            java.lang.Object r6 = r1.LJFF(r0)     // Catch: java.lang.Exception -> L6f
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6     // Catch: java.lang.Exception -> L6f
        L26:
            java.lang.Number r0 = r8.getComplianceTheme()     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L39
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L6f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L6f
        L34:
            java.lang.String r2 = r8.getPrivacyPopup()     // Catch: java.lang.Exception -> L6f
            goto L3b
        L39:
            r4 = r3
            goto L34
        L3b:
            com.google.gson.Gson r1 = X.C2365509Or.LIZ()     // Catch: com.google.gson.s -> L55 java.lang.Exception -> L6f
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PrivacyPopupModel> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PrivacyPopupModel.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L55 java.lang.Exception -> L6f
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L55 java.lang.Exception -> L6f
            java.lang.Object r1 = r1.LJIIIIZZ(r2, r0)     // Catch: com.google.gson.s -> L55 java.lang.Exception -> L6f
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PrivacyPopupModel     // Catch: com.google.gson.s -> L55 java.lang.Exception -> L6f
            if (r0 != 0) goto L52
            r1 = r3
        L52:
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PrivacyPopupModel r1 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PrivacyPopupModel) r1     // Catch: com.google.gson.s -> L55 java.lang.Exception -> L6f
            goto L5a
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L6f
            r1 = r3
        L5a:
            java.util.Map r0 = r8.getMobParams()     // Catch: java.lang.Exception -> L6f
            X.C1192420h8S.LIZ(r6, r4, r1, r0)     // Catch: java.lang.Exception -> L6f
            java.lang.Class<X.0hBz> r0 = X.InterfaceC1194610hBz.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r0, r5)     // Catch: java.lang.Exception -> L6f
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r1 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r1     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = ""
            r9.onSuccess(r1, r0)     // Catch: java.lang.Exception -> L6f
            return
        L6f:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "exception: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            r1 = 4
            r0 = 0
            X.C2382909Vj.LIZ(r9, r0, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1194580hBw.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
