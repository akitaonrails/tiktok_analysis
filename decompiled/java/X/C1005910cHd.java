package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS236S0300000_27;
import njp.a;

/* JADX INFO: renamed from: X.0cHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel$observeWalletServices$4$1", f = "RechargePanelBodyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1005910cHd extends C09AX implements Function2<C788570UwZ, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RechargePanelBodyViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005910cHd(RechargePanelBodyViewModel rechargePanelBodyViewModel, InterfaceC1364105Vn<? super C1005910cHd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelBodyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1005910cHd c1005910cHd = new C1005910cHd(this.LLILLJJLI, interfaceC1364105Vn);
        c1005910cHd.LL = obj;
        return c1005910cHd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1803830x2b c1803830x2b;
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.observeWalletServices$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C788570UwZ c788570UwZ = (C788570UwZ) this.LL;
        C1805530x5L c1805530x5LWQ2 = this.LLILLJJLI.wQ2();
        if (c1805530x5LWQ2 != null && (c1803830x2b = c1805530x5LWQ2.LLILLL) != null) {
            RechargePanelBodyViewModel rechargePanelBodyViewModel = this.LLILLJJLI;
            rechargePanelBodyViewModel.setState(new AwS236S0300000_27(c1803830x2b, c788570UwZ, rechargePanelBodyViewModel, 38));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.observeWalletServices$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C788570UwZ c788570UwZ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c788570UwZ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
