package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelParams;
import com.ss.android.ugc.aweme.purchasepanel.service.PurchasePanelResponse;
import com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel;
import com.ss.android.ugc.aweme.service.IPurchasePanelService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel$getPurchasePanel$1", f = "PurchasePanelViewModel.kt", l = {56}, m = "invokeSuspend")
public final class C1326105Gx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PurchasePanelViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1326105Gx(PurchasePanelViewModel purchasePanelViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = purchasePanelViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1326105Gx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("PurchasePanelViewModel@2fd7.getPurchasePanel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                C2252321DDq c2252321DDq = this.LLILLJJLI.LL;
                c2252321DDq.setValue(C1615430s8j.LIZ((C1615430s8j) c2252321DDq.getValue(), null, null, EnumC1410805fe.LOADING, null, null, null, null, null, null, 1019));
                IPurchasePanelService iPurchasePanelService = (IPurchasePanelService) this.LLILLJJLI.LLILLL.getValue();
                String str = this.LLILLL;
                this.LL = 1;
                objLIZ = iPurchasePanelService.LIZ(str, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("PurchasePanelViewModel@2fd7.getPurchasePanel$1");
                    return objLJFF;
                }
            }
            PurchasePanelResponse purchasePanelResponse = (PurchasePanelResponse) objLIZ;
            if (purchasePanelResponse != null && (!purchasePanelResponse.purchasePanel.components.isEmpty())) {
                C2252321DDq c2252321DDq2 = this.LLILLJJLI.LL;
                C1615430s8j c1615430s8j = (C1615430s8j) c2252321DDq2.getValue();
                PurchasePanelParams purchasePanelParams = purchasePanelResponse.purchasePanel;
                c2252321DDq2.setValue(C1615430s8j.LIZ(c1615430s8j, purchasePanelParams.title, purchasePanelParams.components, EnumC1410805fe.SUCCESS, null, null, null, null, this.LLILLL, null, 624));
            } else {
                C2252321DDq c2252321DDq3 = this.LLILLJJLI.LL;
                c2252321DDq3.setValue(C1615430s8j.LIZ((C1615430s8j) c2252321DDq3.getValue(), null, null, EnumC1410805fe.FAIL, null, null, null, null, null, null, 1019));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2252321DDq c2252321DDq4 = this.LLILLJJLI.LL;
            c2252321DDq4.setValue(C1615430s8j.LIZ((C1615430s8j) c2252321DDq4.getValue(), null, null, EnumC1410805fe.FAIL, null, null, null, null, null, null, 1019));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurchasePanelViewModel@2fd7.getPurchasePanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
