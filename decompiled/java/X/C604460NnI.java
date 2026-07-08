package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.jsb.PipoProbeCollectLocationMethodIDL$handle$1", f = "PipoProbeCollectLocationMethodIDL.kt", l = {46, 48}, m = "invokeSuspend")
public final class C604460NnI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C604530NnP LLILLJJLI;
    public final /* synthetic */ CompletionBlock<InterfaceC604470NnJ> LLILLL;
    public final /* synthetic */ C604500NnM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C604460NnI(C604530NnP c604530NnP, CompletionBlock<InterfaceC604470NnJ> completionBlock, C604500NnM c604500NnM, InterfaceC1364105Vn<? super C604460NnI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c604530NnP;
        this.LLILLL = completionBlock;
        this.LLILZ = c604500NnM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C604460NnI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "PipoProbeCollectLocationMethodIDL@3d40.handle$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LL
            r12 = 0
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L1d
            if (r0 == r2) goto L3f
            if (r0 != r5) goto L5d
            X.C155000ia.LIZIZ(r14)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r14)
            java.lang.Class<com.ss.android.ugc.aweme.pipo.probe.IProbeService> r7 = com.ss.android.ugc.aweme.pipo.probe.IProbeService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.pipo.probe.IProbeService r1 = (com.ss.android.ugc.aweme.pipo.probe.IProbeService) r1
            if (r1 == 0) goto L3d
            X.0NnP r0 = r13.LLILLJJLI
            r13.LL = r2
            java.lang.Object r14 = r1.LIZLLL(r0, r13)
            if (r14 != r4) goto L42
            X.C1C7U.LIZIZ(r6)
            return r4
        L3d:
            r14 = r12
            goto L44
        L3f:
            X.C155000ia.LIZIZ(r14)
        L42:
            java.util.Map r14 = (java.util.Map) r14
        L44:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0NnH r2 = new X.0NnH
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0NnJ> r1 = r13.LLILLL
            X.0NnM r0 = r13.LLILZ
            r2.<init>(r14, r1, r0, r12)
            r13.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r13, r3, r2)
            if (r0 != r4) goto L17
            X.C1C7U.LIZIZ(r6)
            return r4
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C604460NnI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
