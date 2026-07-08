package X;

import com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$initTakoAgent$1", f = "TakoServiceImpl.kt", l = {1705, 1706}, m = "invokeSuspend")
public final class C596550NaX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public TakoClientAgentService LL;
    public TakoClientAgentService LLILLJJLI;
    public int LLILLL;

    public C596550NaX(InterfaceC1364105Vn<? super C596550NaX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596550NaX(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "TakoServiceImpl@d56d.initTakoAgent$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r13.LLILLL
            r4 = 2
            r0 = 1
            if (r1 == 0) goto L1c
            if (r1 == r0) goto L41
            if (r1 != r4) goto L5e
            X.C155000ia.LIZIZ(r14)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r14)
            java.lang.Class<com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService> r7 = com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)
            com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService r2 = (com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService) r2
            if (r2 == 0) goto L16
            r13.LL = r2
            r13.LLILLJJLI = r2
            r13.LLILLL = r0
            kotlin.Unit r0 = r2.init()
            if (r0 != r5) goto L3f
            X.C1C7U.LIZIZ(r6)
            return r5
        L3f:
            r3 = r2
            goto L48
        L41:
            com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService r2 = r13.LLILLJJLI
            com.ss.android.ugc.aweme.tako.ccl.api.TakoClientAgentService r3 = r13.LL
            X.C155000ia.LIZIZ(r14)
        L48:
            X.0NnR r1 = new X.0NnR
            r0 = 0
            r1.<init>(r0)
            r13.LL = r3
            r13.LLILLJJLI = r0
            r13.LLILLL = r4
            java.lang.Object r0 = r2.LIZJ(r1, r13)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C596550NaX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C596550NaX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
