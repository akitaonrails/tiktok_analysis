package X;

import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.creation.AIGCTaskHandleComponent$submitWorkflow$1", f = "AIGCTaskHandleComponent.kt", l = {}, m = "invokeSuspend")
public final class C546950Lcj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C546940Lci LL;
    public final /* synthetic */ C546750LcP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546950Lcj(C546940Lci c546940Lci, C546750LcP c546750LcP, InterfaceC1364105Vn<? super C546950Lcj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c546940Lci;
        this.LLILLJJLI = c546750LcP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C546950Lcj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strIw;
        C1C7U.LIZ("AIGCTaskHandleComponent@9d9c.submitWorkflow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AICreateService aICreateServiceX1 = this.LL.X1();
        if (aICreateServiceX1 == null || (strIw = aICreateServiceX1.iw(this.LLILLJJLI)) == null) {
            strIw = "";
        }
        InterfaceC546960Lck interfaceC546960Lck = this.LL.LLILLL;
        if (interfaceC546960Lck != null) {
            interfaceC546960Lck.LJIIJ(strIw);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCTaskHandleComponent@9d9c.submitWorkflow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
