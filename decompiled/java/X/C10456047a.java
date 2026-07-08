package X;

import Y.AgS282S0100000_1;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.047a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment$onResume$1", f = "SeaSkuPanelFragment.kt", l = {561}, m = "invokeSuspend")
public final class C10456047a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaSkuPanelFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10456047a(SeaSkuPanelFragment seaSkuPanelFragment, InterfaceC1364105Vn<? super C10456047a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaSkuPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10456047a(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaSkuPanelFragment@a15.onResume$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252331DDr c2252331DDr = this.LLILLJJLI.dS().LLJJIJIL;
            AgS282S0100000_1 agS282S0100000_1 = new AgS282S0100000_1(this.LLILLJJLI, 2);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS282S0100000_1, this) == objLJFF) {
                C1C7U.LIZIZ("SeaSkuPanelFragment@a15.onResume$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
