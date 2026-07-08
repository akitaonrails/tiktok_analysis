package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel$setLastTabIndex$1", f = "BillboardGlobalViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1728960v5q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BillboardGlobalViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728960v5q(BillboardGlobalViewModel billboardGlobalViewModel, int i, InterfaceC1364105Vn<? super C1728960v5q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = billboardGlobalViewModel;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728960v5q(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardGlobalViewModel@db34.setLastTabIndex$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728940v5o c1728940v5o = this.LL.LL.LL;
        int i = this.LLILLJJLI;
        c1728940v5o.getClass();
        C1729070v61.LIZ().storeInt("key_last_tab_index", i);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardGlobalViewModel@db34.setLastTabIndex$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
