package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03KP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.core.vm.OspShopViewModel$openShippingPanel$1", f = "OspShopViewModel.kt", l = {105}, m = "invokeSuspend")
public final class C03KP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ List<LogisticDTO> LLILLL;
    public final /* synthetic */ C723002s0 LLILZ;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILZIL;
    public final /* synthetic */ EnumC804103Cd LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C817803Hk LLJ;
    public final /* synthetic */ OspShopViewModel LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03KP(Context context, List<LogisticDTO> list, C723002s0 c723002s0, OrderSubmitAssemViewModel orderSubmitAssemViewModel, EnumC804103Cd enumC804103Cd, String str, String str2, C817803Hk c817803Hk, OspShopViewModel ospShopViewModel, InterfaceC1364105Vn<? super C03KP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = list;
        this.LLILZ = c723002s0;
        this.LLILZIL = orderSubmitAssemViewModel;
        this.LLILZLL = enumC804103Cd;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = c817803Hk;
        this.LLJI = ospShopViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03KP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String strLJIIIIZZ;
        String str3;
        Integer num;
        String strLIZLLL;
        ShippingAddress shippingAddress;
        Address address;
        ShippingAddress shippingAddress2;
        Address address2;
        boolean z;
        Object objLIZIZ = obj;
        C1C7U.LIZ("OspShopViewModel@4956.openShippingPanel$1");
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
            C723002s0 c723002s0 = this.LLILZ;
            LogisticDTO logisticDTO = c723002s0.LLILZIL;
            if (logisticDTO != null) {
                str = logisticDTO.logisticsServiceId;
            } else {
                str = null;
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILZIL;
            String strKR2 = orderSubmitAssemViewModel.kR2(orderSubmitAssemViewModel.MR2(c723002s0));
            C723002s0 c723002s02 = this.LLILZ;
            String str4 = c723002s02.LLJILLL;
            MultiLogisticsPanelInfo multiLogisticsPanelInfo = c723002s02.LLILZLL;
            LogisticPanelModule logisticPanelModule = c723002s02.LLJJIJIL;
            BillInfoData billInfoData = this.LLILZIL.LLJJI;
            if (billInfoData != null && (shippingAddress2 = billInfoData.shippingAddress) != null && (address2 = shippingAddress2.shippingAddress) != null) {
                str2 = address2.addressId;
            } else {
                str2 = null;
            }
            EnumC804103Cd enumC804103Cd = this.LLILZLL;
            if (billInfoData != null && (shippingAddress = billInfoData.shippingAddress) != null && (address = shippingAddress.shippingAddress) != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(address);
            } else {
                strLJIIIIZZ = null;
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILZIL;
            BillInfoData billInfoData2 = orderSubmitAssemViewModel2.LLJJI;
            if (billInfoData2 != null) {
                str3 = billInfoData2.createOrderInfoFromBill;
            } else {
                str3 = null;
            }
            String str5 = this.LLIZ;
            MainOrderSetting mainOrderSetting = this.LLILZ.LLJJJIL;
            if (mainOrderSetting != null) {
                num = mainOrderSetting.selfCollectionOpt;
            } else {
                num = null;
            }
            DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage = new DeliveryPanelStarter.EnterParamForOrderSubmitPage(list, str, strKR2, str4, multiLogisticsPanelInfo, logisticPanelModule, str2, enumC804103Cd, strLJIIIIZZ, str3, str5, num);
            String str6 = this.LLIZLLLIL;
            C817803Hk c817803Hk = this.LLJ;
            if (c817803Hk != null) {
                strLIZLLL = C817603Hi.LIZLLL(orderSubmitAssemViewModel2.LLLZLZ, c817803Hk);
            } else {
                strLIZLLL = null;
            }
            this.LL = 1;
            objLIZIZ = deliveryPanelStarter.LIZIZ(context, enterParamForOrderSubmitPage, str6, strLIZLLL, "normal_checkout", null, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("OspShopViewModel@4956.openShippingPanel$1");
                return objLJFF;
            }
        }
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = (DeliveryPanelStarter.PackedDeliverySelectResult) objLIZIZ;
        C03O0.LIZ.getClass();
        C03O0.LJZ();
        C013C c013c = new C013C();
        C013C c013c2 = new C013C();
        this.LLILZIL.FT2(this.LLILZ.LLJJ, packedDeliverySelectResult);
        LogisticDTO logisticDTO2 = packedDeliverySelectResult.selectedLogistic;
        if (logisticDTO2 != null) {
            OspShopViewModel ospShopViewModel = this.LLJI;
            C723002s0 c723002s03 = this.LLILZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LLILZIL;
            ospShopViewModel.getClass();
            if (OspShopViewModel.yQ2(c723002s03, logisticDTO2, orderSubmitAssemViewModel3)) {
                orderSubmitAssemViewModel3.LLLIIIL = true;
                List<String> list2 = orderSubmitAssemViewModel3.LLLIIL;
                if (list2 != null) {
                    Boolean.valueOf(((ArrayList) list2).add("change_logistic"));
                }
                OrderSubmitAssemViewModel.OS2(orderSubmitAssemViewModel3, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.LOGISTICS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380413);
                z = true;
                c013c2.element = true;
            } else {
                z = true;
            }
            c013c.element = z;
        }
        if (!c013c2.element && Intrinsics.LJFF(packedDeliverySelectResult.isChangePudo, true)) {
            OrderSubmitAssemViewModel.OS2(this.LLILZIL, false, false, null, false, false, false, null, null, false, null, null, new ChangeInfo(C03DI.LOGISTICS.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380413);
        }
        if (!c013c.element && Intrinsics.LJFF(packedDeliverySelectResult.hasUpdateMapLocation, true)) {
            OrderSubmitAssemViewModel.OS2(this.LLILZIL, false, false, null, false, true, false, null, null, false, null, null, new ChangeInfo(C03DI.UPDATE_MAP_LOCATION.getValue(), null, null, null), null, null, null, null, null, null, null, null, null, 8380381);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OspShopViewModel@4956.openShippingPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
