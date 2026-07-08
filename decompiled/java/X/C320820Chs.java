package X;

import Y.AgS285S0100000_4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Chs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.handlers.MessageOperatorHandler$commerceAgentConfig$2$3", f = "MessageOperatorHandler.kt", l = {102}, m = "invokeSuspend")
public final class C320820Chs extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C320830Cht LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<C320810Chr> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C320820Chs(C320830Cht c320830Cht, InterfaceC20236714Gf<? super C320810Chr> interfaceC20236714Gf, InterfaceC1364105Vn<? super C320820Chs> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c320830Cht;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320820Chs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@3dad.commerceAgentConfig$2$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = this.LLILLJJLI.LJ;
            AgS285S0100000_4 agS285S0100000_4 = new AgS285S0100000_4(this.LLILLL, 0);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS285S0100000_4, this) == objLJFF) {
                C1C7U.LIZIZ("MessageOperatorHandler@3dad.commerceAgentConfig$2$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }
}
