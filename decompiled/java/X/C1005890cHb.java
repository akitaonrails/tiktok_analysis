package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0cHb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel$observeWalletServices$5$1", f = "RechargePanelBodyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1005890cHb extends C09AX implements Function2<C00F7, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RechargePanelBodyViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005890cHb(RechargePanelBodyViewModel rechargePanelBodyViewModel, InterfaceC1364105Vn<? super C1005890cHb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelBodyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1005890cHb c1005890cHb = new C1005890cHb(this.LLILLJJLI, interfaceC1364105Vn);
        c1005890cHb.LL = obj;
        return c1005890cHb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.observeWalletServices$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setState(new AwS606S0100000_27((C00F7) this.LL, 570));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.observeWalletServices$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C00F7 c00f7, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c00f7, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
