package X;

import com.ss.android.ugc.aweme.IRecoveryStatusPollingService;
import com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.SwitchAccountVM$onCellClicked$1", f = "SwitchAccountSettingsCell.kt", l = {158}, m = "invokeSuspend")
public final class C19316910hj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19316910hj(DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C19316910hj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19316910hj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SwitchAccountVM@cd11.onCellClicked$1");
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
            IRecoveryStatusPollingService iRecoveryStatusPollingServiceLIZLLL = RecoveryStatusPollingService.LIZLLL();
            this.LL = 1;
            if (iRecoveryStatusPollingServiceLIZLLL.LIZJ("switch_account", this) == objLJFF) {
                C1C7U.LIZIZ("SwitchAccountVM@cd11.onCellClicked$1");
                return objLJFF;
            }
        }
        C786410Ut5.LJIIJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SwitchAccountVM@cd11.onCellClicked$1");
        return unit;
    }
}
