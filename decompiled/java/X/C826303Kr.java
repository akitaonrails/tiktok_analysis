package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PrivacyPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$checkAndUpdateBillInfoData$1$5", f = "OrderSubmitAssemViewModel.kt", l = {2630}, m = "invokeSuspend")
public final class C826303Kr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BillInfoData LLILLJJLI;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826303Kr(BillInfoData billInfoData, OrderSubmitAssemViewModel orderSubmitAssemViewModel, boolean z, InterfaceC1364105Vn<? super C826303Kr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = billInfoData;
        this.LLILLL = orderSubmitAssemViewModel;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826303Kr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PrivacyPopup privacyPopup;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            BillInfoData billInfoData = this.LLILLJJLI;
            if (billInfoData == null || C7806033c.LJJ(billInfoData)) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLL;
                this.LL = 1;
                if (orderSubmitAssemViewModel.QQ2(this) == objLJFF) {
                    C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1$5");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1$5");
            return unit;
        }
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILLL;
        BillInfoData billInfoData2 = this.LLILLJJLI;
        boolean z2 = this.LLILZ;
        orderSubmitAssemViewModel2.getClass();
        if (billInfoData2 != null && (privacyPopup = billInfoData2.privacyPopup) != null && z2) {
            if (billInfoData2.exceptionUX == null) {
                z = false;
            }
            orderSubmitAssemViewModel2.setState(new AwS89S0110000_1(privacyPopup, z, 16));
        }
        this.LLILLL.PQ2(this.LLILLJJLI);
        if (this.LLILLJJLI == null) {
            this.LLILLL.setState(AFwS228S0000000_1.get$arr$(473));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.checkAndUpdateBillInfoData$1$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
