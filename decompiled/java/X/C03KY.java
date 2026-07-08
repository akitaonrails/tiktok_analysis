package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03KY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel$openShippingPanelForHalfPage$1", f = "OspShopViewModel.kt", l = {198}, m = "invokeSuspend")
public final class C03KY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ List<LogisticDTO> LLILLL;
    public final /* synthetic */ C722902rz LLILZ;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C817803Hk LLIZ;
    public final /* synthetic */ OspShopViewModel LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03KY(Context context, List<LogisticDTO> list, C722902rz c722902rz, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str, C817803Hk c817803Hk, OspShopViewModel ospShopViewModel, InterfaceC1364105Vn<? super C03KY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = list;
        this.LLILZ = c722902rz;
        this.LLILZIL = orderSubmitAssemViewModel;
        this.LLILZLL = str;
        this.LLIZ = c817803Hk;
        this.LLIZLLLIL = ospShopViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03KY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLIZIZ = obj;
        C1C7U.LIZ("OspShopViewModel@4956.openShippingPanelForHalfPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.LIZ;
            Context context = this.LLILLJJLI;
            List<LogisticDTO> list = this.LLILLL;
            LogisticDTO logisticDTO = this.LLILZ.LLIZLLLIL;
            String strLIZLLL = null;
            if (logisticDTO != null) {
                str = logisticDTO.logisticsServiceId;
            } else {
                str = null;
            }
            String strKR2 = this.LLILZIL.kR2(C2097608Jq.LJ());
            C722902rz c722902rz = this.LLILZ;
            DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage = new DeliveryPanelStarter.EnterParamForOrderSubmitPage(list, str, strKR2, c722902rz.LLJILLL, c722902rz.LLJ, c722902rz.LLJIJIL, null, null, 4032);
            String str2 = this.LLILZLL;
            C817803Hk c817803Hk = this.LLIZ;
            if (c817803Hk != null) {
                strLIZLLL = C817603Hi.LIZLLL(this.LLILZIL.LLLZLZ, c817803Hk);
            }
            String str3 = this.LLILZIL.n;
            this.LL = 1;
            objLIZIZ = deliveryPanelStarter.LIZIZ(context, enterParamForOrderSubmitPage, str2, strLIZLLL, str3, null, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("OspShopViewModel@4956.openShippingPanelForHalfPage$1");
                return objLJFF;
            }
        }
        C03O0.LIZ.getClass();
        C03O0.LJZ();
        LogisticDTO logisticDTO2 = ((DeliveryPanelStarter.PackedDeliverySelectResult) objLIZIZ).selectedLogistic;
        if (logisticDTO2 != null) {
            OspShopViewModel ospShopViewModel = this.LLIZLLLIL;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILZIL;
            ospShopViewModel.getClass();
            List<OrderShopDigest> list2 = orderSubmitAssemViewModel.LLILZIL;
            boolean z = false;
            if (list2 != null) {
                Iterator<OrderShopDigest> it2 = list2.iterator();
                while (it2.hasNext()) {
                    List<OrderSKUDTO> list3 = it2.next().orderSKUs;
                    if (list3 != null) {
                        for (OrderSKUDTO orderSKUDTO : list3) {
                            if (!Intrinsics.LJFF(orderSKUDTO.logisticsServiceId, logisticDTO2.logisticsServiceId)) {
                                orderSKUDTO.logisticsServiceId = logisticDTO2.logisticsServiceId;
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    orderSubmitAssemViewModel.LLLIIIL = true;
                    OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModel, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.LOGISTICS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380413);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspShopViewModel@4956.openShippingPanelForHalfPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
