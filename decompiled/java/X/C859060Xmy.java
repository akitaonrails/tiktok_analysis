package X;

import com.ss.android.ugc.aweme.fangroup.assem.FanGroupListAssem;
import com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fangroup.assem.FanGroupListAssem$onViewCreated$2", f = "FanGroupListAssem.kt", l = {73}, m = "invokeSuspend")
public final class C859060Xmy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FanGroupListAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859060Xmy(FanGroupListAssem fanGroupListAssem, InterfaceC1364105Vn<? super C859060Xmy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fanGroupListAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859060Xmy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanGroupListAssem@324d.onViewCreated$2");
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
            FanGroupListViewModel fanGroupListViewModelIp = this.LLILLJJLI.ip();
            this.LL = 1;
            if (fanGroupListViewModelIp.vQ2(true, this) == objLJFF) {
                C1C7U.LIZIZ("FanGroupListAssem@324d.onViewCreated$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FanGroupListAssem@324d.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
