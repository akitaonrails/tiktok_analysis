package X;

import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06KQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel$manualRefresh$1", f = "WorkBenchSettingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C06KQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WorkBenchSettingViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KQ(WorkBenchSettingViewModel workBenchSettingViewModel, InterfaceC1364105Vn<? super C06KQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = workBenchSettingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkBenchSettingViewModel@a95c.manualRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkBenchSettingViewModel@a95c.manualRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
