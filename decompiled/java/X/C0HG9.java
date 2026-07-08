package X;

import Y.AgS197S0200000_6;
import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HG9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.fragment.StellarFragment$subscribeRedirectAction$1", f = "StellarFragment.kt", l = {761}, m = "invokeSuspend")
public final class C0HG9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StellarFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HG9(StellarFragment stellarFragment, InterfaceC1364105Vn<? super C0HG9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stellarFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HG9 c0hg9 = new C0HG9(this.LLILLL, interfaceC1364105Vn);
        c0hg9.LLILLJJLI = obj;
        return c0hg9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StellarFragment@cf07.subscribeRedirectAction$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C2252331DDr c2252331DDr = this.LLILLL.SR().LLJILJIL;
            AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(this.LLILLL, interfaceC497601wk, 18);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS197S0200000_6, this) == objLJFF) {
                C1C7U.LIZIZ("StellarFragment@cf07.subscribeRedirectAction$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StellarFragment@cf07.subscribeRedirectAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
