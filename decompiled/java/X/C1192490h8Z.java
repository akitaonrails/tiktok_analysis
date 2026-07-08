package X;

/* JADX INFO: renamed from: X.0h8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192490h8Z extends AbstractC1192500h8a {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r9, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r10, X.EnumC1063300dmC r11) {
        /*
            r8 = this;
            X.0h8b r9 = (X.InterfaceC1192510h8b) r9
            r4 = 0
            r3 = 0
            X.0OvC r0 = r8.IBridgeSdkContext     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L21
            java.lang.String r6 = r0.getContainerID()     // Catch: java.lang.Exception -> L90
        Lc:
            X.0OvC r0 = r8.IBridgeSdkContext     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L1f
            android.view.View r0 = r0.getView()     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L1f
            androidx.fragment.app.Fragment r7 = androidx.fragment.app.FragmentManager.LJJJJLL(r0)     // Catch: java.lang.Exception -> L90
        L1a:
            java.lang.String r2 = r9.getPrivacyPopup()     // Catch: java.lang.Exception -> L90
            goto L23
        L1f:
            r7 = r3
            goto L1a
        L21:
            r6 = r3
            goto Lc
        L23:
            com.google.gson.Gson r1 = X.C2365509Or.LIZ()     // Catch: com.google.gson.s -> L3d java.lang.Exception -> L90
            java.lang.Class<com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PrivacyPopupModel> r0 = com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PrivacyPopupModel.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L3d java.lang.Exception -> L90
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L3d java.lang.Exception -> L90
            java.lang.Object r5 = r1.LJIIIIZZ(r2, r0)     // Catch: com.google.gson.s -> L3d java.lang.Exception -> L90
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PrivacyPopupModel     // Catch: com.google.gson.s -> L3d java.lang.Exception -> L90
            if (r0 != 0) goto L3a
            r5 = r3
        L3a:
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PrivacyPopupModel r5 = (com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi.PrivacyPopupModel) r5     // Catch: com.google.gson.s -> L3d java.lang.Exception -> L90
            goto L42
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L90
            r5 = r3
        L42:
            X.0h8U r1 = X.C1192440h8U.LIZ     // Catch: java.lang.Exception -> L90
            if (r5 == 0) goto L51
            java.lang.Integer r0 = r5.getAuthStatus()     // Catch: java.lang.Exception -> L90
        L4a:
            r1.getClass()     // Catch: java.lang.Exception -> L90
            X.C1192440h8U.LIZLLL(r0)     // Catch: java.lang.Exception -> L90
            goto L53
        L51:
            r0 = r3
            goto L4a
        L53:
            if (r5 == 0) goto L69
            java.lang.Integer r2 = r5.getAuthStatus()     // Catch: java.lang.Exception -> L90
            X.0bxB r0 = X.EnumC993230bxB.AUTHORIZED     // Catch: java.lang.Exception -> L90
            int r1 = r0.getValue()     // Catch: java.lang.Exception -> L90
            if (r2 == 0) goto L69
            int r0 = r2.intValue()     // Catch: java.lang.Exception -> L90
            if (r0 != r1) goto L69
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            java.lang.String r2 = ""
            if (r0 != 0) goto L84
            if (r5 == 0) goto L84
            com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi$PrivacyPopupData r0 = r5.getPopup()     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L84
            java.lang.String r1 = r9.getScene()     // Catch: java.lang.Exception -> L90
            if (r1 != 0) goto L7d
            r1 = r2
        L7d:
            java.util.Map r0 = r9.getTrackParams()     // Catch: java.lang.Exception -> L90
            X.C1192440h8U.LIZJ(r1, r7, r5, r0)     // Catch: java.lang.Exception -> L90
        L84:
            java.lang.Class<X.0h8c> r0 = X.InterfaceC1192520h8c.class
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r0 = X.C1909107dp.LIZJ(r0, r6)     // Catch: java.lang.Exception -> L90
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r0 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r0     // Catch: java.lang.Exception -> L90
            r10.onSuccess(r0, r2)     // Catch: java.lang.Exception -> L90
            return
        L90:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "exception: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 4
            X.C2382909Vj.LIZ(r10, r4, r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1192490h8Z.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
