package X;

import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.06Jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchViewModel$initFilterList$1", f = "WorkBenchViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1586506Jb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WorkBenchViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586506Jb(WorkBenchViewModel workBenchViewModel, InterfaceC1364105Vn<? super C1586506Jb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = workBenchViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1586506Jb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WorkBenchViewModel@f1c.initFilterList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        WorkBenchViewModel workBenchViewModel = this.LL;
        workBenchViewModel.withState(new AwS588S0100000_9(workBenchViewModel, 453));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WorkBenchViewModel@f1c.initFilterList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
