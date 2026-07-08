package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.purchasepanel.PurchasePanelKt$PurchasePanel$1$1", f = "PurchasePanel.kt", l = {}, m = "invokeSuspend")
public final class C344101Vf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PurchasePanelViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C344101Vf(PurchasePanelViewModel purchasePanelViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = purchasePanelViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C344101Vf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PurchasePanelKt@6fd6.PurchasePanel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PurchasePanelViewModel purchasePanelViewModel = this.LL;
        String str = this.LLILLJJLI;
        purchasePanelViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(purchasePanelViewModel), null, null, new C1326105Gx(purchasePanelViewModel, str, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurchasePanelKt@6fd6.PurchasePanel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
