package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Nh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600570Nh1 extends AbstractC600560Nh0 {
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C594610NTv
            if (r0 == 0) goto L8f
            r3 = r14
            X.0NTv r3 = (X.C594610NTv) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r5 = 1
            r7 = 0
            if (r0 == 0) goto L30
            if (r0 != r5) goto L96
            X.C155000ia.LIZIZ(r1)
        L23:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L2b
            boolean r7 = r1.booleanValue()
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L30:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.pipo.ccdc.libra.PipoAndroidCcdcOcrImplementControlModel r0 = X.C600670NhB.LIZ(r13)
            boolean r0 = r0.useClientAIOcr
            if (r0 != 0) goto L40
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L40:
            X.0uxS r1 = X.C1717770unn.LJFF()
            java.lang.String r0 = "com.ss.android.ugc.aweme.df_pipo_bnpl"
            boolean r0 = r1.checkPluginInstalled(r0)
            if (r0 != 0) goto L51
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L51:
            X.0uus r0 = X.C1717770unn.LIZJ()
            android.content.Context r0 = r0.getApplicationContext()
            jv6.a.install(r0)
            java.lang.Class<com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService> r6 = com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService.class
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService r1 = (com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService) r1
            if (r1 != 0) goto L70
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L70:
            boolean r0 = r1.LJ()
            if (r0 == 0) goto L7b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L7b:
            r1.LIZLLL()
            X.0NTu r2 = new X.0NTu
            r2.<init>(r1, r11)
            r3.LLILLL = r5
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r1 = X.C099A.LIZJ(r0, r2, r3)
            if (r1 != r4) goto L23
            return r4
        L8f:
            X.0NTv r3 = new X.0NTv
            r3.<init>(r12, r14)
            goto L12
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C600570Nh1.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C600320Ngc(completionBlock, this, (InterfaceC600460Ngq) xBaseParamModel, null), 2);
    }
}
