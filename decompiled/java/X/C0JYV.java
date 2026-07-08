package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JYV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM$fetchVipChoice$2$2$2", f = "SubOnlyLiveVipListVM.kt", l = {}, m = "invokeSuspend")
public final class C0JYV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SubOnlyLiveVipListVM LL;
    public final /* synthetic */ AbstractC1623806Xk<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYV(SubOnlyLiveVipListVM subOnlyLiveVipListVM, AbstractC1623806Xk<Boolean> abstractC1623806Xk, InterfaceC1364105Vn<? super C0JYV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = subOnlyLiveVipListVM;
        this.LLILLJJLI = abstractC1623806Xk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JYV(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyLiveVipListVM@4bea.fetchVipChoice$2$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SubOnlyLiveVipListVM subOnlyLiveVipListVM = this.LL;
        subOnlyLiveVipListVM.setState(new C0JYX(subOnlyLiveVipListVM, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveVipListVM@4bea.fetchVipChoice$2$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
