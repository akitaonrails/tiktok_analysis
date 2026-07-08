package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner.TaskProgressViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel$tryStartTaskCountdown$1$1", f = "RechargeTaskPanel.kt", l = {}, m = "invokeSuspend")
public final class C1143020fqm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RechargeTaskPanel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143020fqm(RechargeTaskPanel rechargeTaskPanel, InterfaceC1364105Vn<? super C1143020fqm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = rechargeTaskPanel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1143020fqm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeTaskPanel@913a.tryStartTaskCountdown$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AssemVMLazy assemVMLazy = this.LL.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RechargeTaskPanel.LLLIIL;
        ((TaskProgressViewModel) assemVMLazy.getValue()).wQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeTaskPanel@913a.tryStartTaskCountdown$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
