package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.jsb.PipoStartBackgroundCcdcOcrMethodIDL$handle$1", f = "PipoStartBackgroundCcdcOcrMethodIDL.kt", l = {39}, m = "invokeSuspend")
public final class C600960Nhe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1716190ulF LL;
    public int LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC1716210ulH> LLILLL;
    public final /* synthetic */ C1716190ulF LLILZ;
    public final /* synthetic */ InterfaceC1716220ulI LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C600960Nhe(CompletionBlock<InterfaceC1716210ulH> completionBlock, C1716190ulF c1716190ulF, InterfaceC1716220ulI interfaceC1716220ulI, InterfaceC1364105Vn<? super C600960Nhe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = completionBlock;
        this.LLILZ = c1716190ulF;
        this.LLILZIL = interfaceC1716220ulI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C600960Nhe(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r16
            java.lang.String r8 = "PipoStartBackgroundCcdcOcrMethodIDL@c18c.handle$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r15.LLILLJJLI
            java.lang.String r7 = "Timeout"
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 != r5) goto L17
            X.0ulF r3 = r15.LL
            goto L83
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r0)
            X.0ulF r3 = r15.LLILZ
            X.0ulI r6 = r15.LLILZIL
            X.0uxS r1 = X.C1717770unn.LJFF()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r0 = "com.ss.android.ugc.aweme.df_pipo_bnpl"
            boolean r0 = r1.checkPluginInstalled(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "NotSupported"
            if (r0 != 0) goto L3c
            r3.getClass()     // Catch: java.lang.Throwable -> L9e
            X.0ulH r2 = X.C1716190ulF.LIZJ(r2)     // Catch: java.lang.Throwable -> L9e
            goto L5e
        L3c:
            X.0uus r0 = X.C1717770unn.LIZJ()     // Catch: java.lang.Throwable -> L9e
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L9e
            jv6.a.install(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.Class<com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService> r9 = com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService.class
            r10 = 0
            r13 = 14
            r14 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L9e
            com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService r1 = (com.ss.android.ugc.aweme.pipo.ccdc.internal.IPIPOClientAIOcrService) r1     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L62
            r3.getClass()     // Catch: java.lang.Throwable -> L9e
            X.0ulH r2 = X.C1716190ulF.LIZJ(r2)     // Catch: java.lang.Throwable -> L9e
        L5e:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L9e
            goto Laa
        L62:
            boolean r0 = r1.LJ()     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L70
            r3.getClass()     // Catch: java.lang.Throwable -> L9e
            X.0ulH r2 = X.C1716190ulF.LIZJ(r2)     // Catch: java.lang.Throwable -> L9e
            goto L5e
        L70:
            X.0Nhf r2 = new X.0Nhf     // Catch: java.lang.Throwable -> L9e
            r2.<init>(r1, r6, r14)     // Catch: java.lang.Throwable -> L9e
            r15.LL = r3     // Catch: java.lang.Throwable -> L9e
            r15.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L9e
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = X.C099A.LIZJ(r0, r2, r15)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r4) goto L86
            goto L9a
        L83:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L9e
        L86:
            X.0ulK r0 = (X.C1716240ulK) r0     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L92
            r3.getClass()     // Catch: java.lang.Throwable -> L9e
            X.0ulH r2 = X.C1716190ulF.LIZJ(r7)     // Catch: java.lang.Throwable -> L9e
            goto L5e
        L92:
            r3.getClass()     // Catch: java.lang.Throwable -> L9e
            X.0ulH r2 = X.C1716190ulF.LIZLLL(r0)     // Catch: java.lang.Throwable -> L9e
            goto L5e
        L9a:
            X.C1C7U.LIZIZ(r8)
            return r4
        L9e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        Laa:
            X.0ulF r1 = r15.LLILZ
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r0 == 0) goto Lb9
            r1.getClass()
            X.0ulH r2 = X.C1716190ulF.LIZJ(r7)
        Lb9:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r2 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r2
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0ulH> r0 = r15.LLILLL
            X.C2382909Vj.LIZIZ(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C600960Nhe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
