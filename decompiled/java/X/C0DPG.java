package X;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: renamed from: X.0DPG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DPG extends C0DPE {
    public final WebView LIZJ() {
        String containerID;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
            return null;
        }
        C1529870puj.LIZ.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(containerID);
        if (interfaceC1541990qEHLJFF == null) {
            return null;
        }
        View viewE1 = interfaceC1541990qEHLJFF.e1();
        if (viewE1 instanceof WebView) {
            return (WebView) viewE1;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r20, final com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r21, X.EnumC1063300dmC r22) {
        /*
            r19 = this;
            r1 = r20
            X.0DPH r1 = (X.C0DPH) r1
            java.lang.String r8 = r1.getJsonrpc()
            java.lang.String r10 = ""
            if (r8 != 0) goto Ld
            r8 = r10
        Ld:
            java.lang.String r9 = r1.getMethod()
            if (r9 != 0) goto L14
            r9 = r10
        L14:
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L1b
            r10 = r0
        L1b:
            java.util.Map r11 = r1.getParams()
            if (r11 != 0) goto L25
            java.util.Map r11 = X.C2097608Jq.LJ()
        L25:
            r2 = r19
            android.webkit.WebView r0 = r2.LIZJ()
            r3 = 0
            if (r0 == 0) goto L50
            android.content.Context r6 = r0.getContext()
            if (r6 == 0) goto L50
            X.0OvC r0 = r2.IBridgeSdkContext
            if (r0 == 0) goto L53
            java.lang.String r7 = r0.getContainerID()
        L3c:
            r14 = 0
            if (r7 == 0) goto L51
            int r0 = r7.length()
            if (r0 == 0) goto L51
            r4 = 0
        L46:
            r0 = 4
            r1 = r21
            if (r4 == 0) goto L55
            java.lang.String r2 = "containerId is null or empty"
            X.C2382909Vj.LIZ(r1, r14, r2, r3, r0)
        L50:
            return
        L51:
            r4 = 1
            goto L46
        L53:
            r7 = r3
            goto L3c
        L55:
            X.0OvC r5 = r2.IBridgeSdkContext
            if (r5 == 0) goto La1
            java.lang.Class<X.0q70> r4 = X.C1537480q70.class
            java.lang.Object r5 = r5.LIZIZ(r4)
            X.0q70 r5 = (X.C1537480q70) r5
            if (r5 == 0) goto La1
            java.lang.Class<X.0d1h> r4 = X.InterfaceC1034470d1h.class
            java.lang.Object r12 = r5.LJFF(r4)
            X.0d1h r12 = (X.InterfaceC1034470d1h) r12
            if (r12 == 0) goto La2
            java.lang.Class<X.0d3y> r4 = X.C1035880d3y.class
            java.lang.Object r13 = r12.Sj(r4)
            X.0d3y r13 = (X.C1035880d3y) r13
        L75:
            X.0DF7 r4 = new X.0DF7
            r4.<init>(r6)
            if (r7 == 0) goto Lb9
            X.0DF6 r5 = new X.0DF6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Class<com.ss.android.ugc.aweme.ad.ecp.IEcpRuntimeService> r13 = com.ss.android.ugc.aweme.ad.ecp.IEcpRuntimeService.class
            r17 = 14
            r15 = r14
            r16 = r14
            r18 = r3
            java.lang.Object r4 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.ad.ecp.IEcpRuntimeService r4 = (com.ss.android.ugc.aweme.ad.ecp.IEcpRuntimeService) r4
            if (r4 == 0) goto La4
            X.11Kz r4 = r4.LIZ(r5)
            if (r4 == 0) goto La4
            X.0DOv r0 = new X.0DOv
            r0.<init>()
            r4.LIZ(r0)
            return
        La1:
            r12 = r3
        La2:
            r13 = r3
            goto L75
        La4:
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()
            java.lang.String r2 = "unknown method: "
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r4)
            X.C2382909Vj.LIZ(r1, r14, r2, r3, r0)
            return
        Lb9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "containerId is required"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DPG.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
