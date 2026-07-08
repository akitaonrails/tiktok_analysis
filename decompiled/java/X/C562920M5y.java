package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixDraftBoxConversationManagerAsync$enableShowAIRemixEntranceAsync$1", f = "IAIRemixDraftBoxConversationManager.kt", l = {130, 131}, m = "invokeSuspend")
public final class C562920M5y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC562800M5m LLILLJJLI;
    public final /* synthetic */ C0M60 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562920M5y(InterfaceC562800M5m interfaceC562800M5m, C0M60 c0m60, InterfaceC1364105Vn<? super C562920M5y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC562800M5m;
        this.LLILLL = c0m60;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C562920M5y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AIRemixDraftBoxConversationManagerAsync@fde2.enableShowAIRemixEntranceAsync$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 0
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L1d
            if (r0 == r1) goto L30
            if (r0 != r4) goto L54
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r9)
            X.0M5m r0 = r8.LLILLJJLI
            if (r0 == 0) goto L3c
            r8.LL = r1
            java.lang.Object r9 = r0.LIZJ(r8)
            if (r9 != r6) goto L33
            X.C1C7U.LIZIZ(r7)
            return r6
        L30:
            X.C155000ia.LIZIZ(r9)
        L33:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 != r1) goto L3c
            r5 = 1
        L3c:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0M5z r2 = new X.0M5z
            X.0M60 r1 = r8.LLILLL
            r0 = 0
            r2.<init>(r1, r5, r0)
            r8.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r2)
            if (r0 != r6) goto L17
            X.C1C7U.LIZIZ(r7)
            return r6
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C562920M5y.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
