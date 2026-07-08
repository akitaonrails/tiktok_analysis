package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JYW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM$fetchVipChoice$2$3$1", f = "SubOnlyLiveVipListVM.kt", l = {}, m = "invokeSuspend")
public final class C0JYW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SubOnlyLiveVipListVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYW(SubOnlyLiveVipListVM subOnlyLiveVipListVM, InterfaceC1364105Vn<? super C0JYW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = subOnlyLiveVipListVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JYW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyLiveVipListVM@4bea.fetchVipChoice$2$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(new C0JYY());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveVipListVM@4bea.fetchVipChoice$2$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
