package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel$observeWalletServices$2", f = "RechargePanelBodyViewModel.kt", l = {784}, m = "invokeSuspend")
public final class C1005850cHX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RechargePanelBodyViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005850cHX(RechargePanelBodyViewModel rechargePanelBodyViewModel, InterfaceC1364105Vn<? super C1005850cHX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelBodyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005850cHX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.observeWalletServices$2");
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
            InterfaceC1005900cHc interfaceC1005900cHc = this.LLILLJJLI.LLILLJJLI;
            this.LL = 1;
            if (interfaceC1005900cHc.LIZLLL(this) == objLJFF) {
                C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.observeWalletServices$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.observeWalletServices$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
