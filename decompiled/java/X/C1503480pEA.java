package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pEA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.jsb.PipoProbeCollectAppListMethodIDL$handle$2", f = "PipoProbeCollectAppListMethodIDL.kt", l = {41, 51}, m = "invokeSuspend")
public final class C1503480pEA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1503510pED LLILLJJLI;
    public final /* synthetic */ InterfaceC1503520pEE LLILLL;
    public final /* synthetic */ CompletionBlock<InterfaceC1503470pE9> LLILZ;
    public final /* synthetic */ C1503490pEB LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503480pEA(InterfaceC1503510pED interfaceC1503510pED, InterfaceC1503520pEE interfaceC1503520pEE, CompletionBlock<InterfaceC1503470pE9> completionBlock, C1503490pEB c1503490pEB, InterfaceC1364105Vn<? super C1503480pEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1503510pED;
        this.LLILLL = interfaceC1503520pEE;
        this.LLILZ = completionBlock;
        this.LLILZIL = c1503490pEB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1503480pEA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r8 = r19
            java.lang.String r11 = "PipoProbeCollectAppListMethodIDL@3f51.handle$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r6 = X.C099R.LJFF()
            r7 = r18
            int r0 = r7.LL
            r5 = 0
            r4 = 2
            r10 = 1
            if (r0 == 0) goto L21
            if (r0 == r10) goto L5b
            if (r0 != r4) goto L79
            X.C155000ia.LIZIZ(r8)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L21:
            X.C155000ia.LIZIZ(r8)
            java.lang.Class<com.ss.android.ugc.aweme.pipo.probe.IProbeService> r12 = com.ss.android.ugc.aweme.pipo.probe.IProbeService.class
            r13 = 0
            r16 = 14
            r14 = r13
            r15 = r13
            r17 = r5
            java.lang.Object r9 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.pipo.probe.IProbeService r9 = (com.ss.android.ugc.aweme.pipo.probe.IProbeService) r9
            if (r9 == 0) goto L59
            X.00EM r8 = new X.00EM
            X.0pED r0 = r7.LLILLJJLI
            java.lang.String r3 = r0.getEntrance()
            X.00EL r2 = new X.00EL
            X.0pEE r0 = r7.LLILLL
            boolean r1 = r0.getUserAgree()
            X.13BV r0 = X.C13BV.INSTANCE
            r2.<init>(r1, r0)
            r8.<init>(r2, r3)
            r7.LL = r10
            java.lang.Object r8 = r9.LJIIIZ(r8, r7)
            if (r8 != r6) goto L5e
            X.C1C7U.LIZIZ(r11)
            return r6
        L59:
            r8 = r5
            goto L60
        L5b:
            X.C155000ia.LIZIZ(r8)
        L5e:
            java.util.Map r8 = (java.util.Map) r8
        L60:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0pE8 r2 = new X.0pE8
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0pE9> r1 = r7.LLILZ
            X.0pEB r0 = r7.LLILZIL
            r2.<init>(r1, r0, r8, r5)
            r7.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r7, r3, r2)
            if (r0 != r6) goto L1b
            X.C1C7U.LIZIZ(r11)
            return r6
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503480pEA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
