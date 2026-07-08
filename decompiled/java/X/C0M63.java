package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M63, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.airemix.api.service.AIRemixDraftBoxConversationManagerAsync$getProfileAIRemixDataAsync$1", f = "IAIRemixDraftBoxConversationManager.kt", l = {147, 148}, m = "invokeSuspend")
public final class C0M63 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC562800M5m LLILLJJLI;
    public final /* synthetic */ C0M68 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M63(InterfaceC562800M5m interfaceC562800M5m, C0M68 c0m68, InterfaceC1364105Vn<? super C0M63> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC562800M5m;
        this.LLILLL = c0m68;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M63(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AIRemixDraftBoxConversationManagerAsync@fde2.getProfileAIRemixDataAsync$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 0
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L1d
            if (r0 == r1) goto L32
            if (r0 != r3) goto L4e
            X.C155000ia.LIZIZ(r8)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r8)
            X.0M5m r0 = r7.LLILLJJLI
            if (r0 == 0) goto L30
            r7.LL = r1
            java.lang.Object r8 = r0.LJI(r7)
            if (r8 != r5) goto L35
            X.C1C7U.LIZIZ(r6)
            return r5
        L30:
            r8 = r4
            goto L37
        L32:
            X.C155000ia.LIZIZ(r8)
        L35:
            X.00IR r8 = (X.C00IR) r8
        L37:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0M64 r1 = new X.0M64
            X.0M68 r0 = r7.LLILLL
            r1.<init>(r0, r8, r4)
            r7.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r6)
            return r5
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M63.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
