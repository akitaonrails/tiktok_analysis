package X;

import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05A1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.config.AIPortraitConfigKt$AI_PORTRAIT_CONFIG$11$1$1", f = "AIPortraitConfig.kt", l = {173, 175}, m = "invokeSuspend")
public final class C05A1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CameoDraft LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05A1(CameoDraft cameoDraft, Function0<Unit> function0, InterfaceC1364105Vn<? super C05A1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cameoDraft;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05A1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AIPortraitConfigKt@d663.AI_PORTRAIT_CONFIG$11$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L3e
            if (r0 != r4) goto L61
            X.C155000ia.LIZIZ(r8)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r8)
            X.0Le5 r0 = com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService r0 = X.C547790Le5.LIZ()
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.portrait.service.IAIPortraitDraftService r1 = r0.LJI()
            if (r1 == 0) goto L16
            com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft r0 = r7.LLILLJJLI
            r7.LL = r2
            java.lang.Object r8 = r1.LIZ(r0, r7)
            if (r8 != r5) goto L41
            X.C1C7U.LIZIZ(r6)
            return r5
        L3e:
            X.C155000ia.LIZIZ(r8)
        L41:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 != r2) goto L16
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.05A0 r2 = new X.05A0
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r7.LLILLL
            r0 = 0
            r2.<init>(r1, r0)
            r7.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r7, r3, r2)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r6)
            return r5
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05A1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
