package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01QF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onSlotCreated$2", f = "ECDuringLiveBroadcasterWidget.kt", l = {358, 361}, m = "invokeSuspend")
public final class C01QF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C238400w2 LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QF(C118300cf c118300cf, int i, C238400w2 c238400w2, String str, InterfaceC1364105Vn<? super C01QF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c118300cf;
        this.LLILZ = i;
        this.LLILZIL = c238400w2;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01QF c01qf = new C01QF(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c01qf.LLILLJJLI = obj;
        return c01qf;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:6|(2:46|7)|44|31) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (((java.lang.Boolean) r13).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0036 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:44:0x0080). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "ECDuringLiveBroadcasterWidget@b309.onSlotCreated$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r12.LL
            r9 = 0
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 == r5) goto L25
            if (r0 != r6) goto L1d
            java.lang.Object r4 = r12.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Exception -> L35
            goto L80
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            java.lang.Object r4 = r12.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.C155000ia.LIZIZ(r13)
            goto L71
        L2d:
            X.C155000ia.LIZIZ(r13)
            java.lang.Object r4 = r12.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            goto L4d
        L35:
            r0 = move-exception
        L36:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L39:
            X.00w2 r8 = r12.LLILZIL
            long r2 = r8.element
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L93
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.element = r0
        L45:
            X.00cf r1 = r12.LLILLL
            int r0 = r1.element
            int r0 = r0 + 1
            r1.element = r0
        L4d:
            boolean r0 = X.C2296808zG.LJI(r4)
            if (r0 == 0) goto L8d
            X.00cf r0 = r12.LLILLL
            int r1 = r0.element
            int r0 = r12.LLILZ
            if (r1 >= r0) goto L8d
            X.00w2 r0 = r12.LLILZIL
            long r0 = r0.element
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L71
            r12.LLILLJJLI = r4
            r12.LL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r12)
            if (r0 != r7) goto L71
            X.C1C7U.LIZIZ(r11)
            return r7
        L71:
            X.01QH r1 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.api.BroadcasterBagApi.LIZ     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = r12.LLILZLL     // Catch: java.lang.Exception -> L89
            r12.LLILLJJLI = r4     // Catch: java.lang.Exception -> L89
            r12.LL = r6     // Catch: java.lang.Exception -> L89
            java.lang.Object r13 = r1.LIZ(r0, r12)     // Catch: java.lang.Exception -> L89
            if (r13 != r7) goto L80
            goto L98
        L80:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Exception -> L87
            boolean r0 = r13.booleanValue()     // Catch: java.lang.Exception -> L87
            goto L8b
        L87:
            r0 = move-exception
            goto L36
        L89:
            r0 = move-exception
            goto L36
        L8b:
            if (r0 == 0) goto L39
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L93:
            long r0 = (long) r6
            long r2 = r2 * r0
            r8.element = r2
            goto L45
        L98:
            X.C1C7U.LIZIZ(r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01QF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
