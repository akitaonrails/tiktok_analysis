package X;

import Y.AgS297S0100000_16;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.SearchAdAnoleModule$initObservers$1$1$1", f = "SearchAdAnoleModule.kt", l = {157}, m = "invokeSuspend")
public final class C860270Xov extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1010390cOr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860270Xov(C1010390cOr c1010390cOr, InterfaceC1364105Vn<? super C860270Xov> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1010390cOr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860270Xov(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa interfaceC346201WaLJIILL;
        C1C7U.LIZ("SearchAdAnoleModule@4d89.initObservers$1$1$1");
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
            InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) this.LLILLJJLI.LLJILJIL.getValue();
            if (interfaceC346201Wa != null && (interfaceC346201WaLJIILL = C09IC.LJIILL(interfaceC346201Wa)) != null) {
                AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILLJJLI, 19);
                this.LL = 1;
                if (interfaceC346201WaLJIILL.collect(agS297S0100000_16, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchAdAnoleModule@4d89.initObservers$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdAnoleModule@4d89.initObservers$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
