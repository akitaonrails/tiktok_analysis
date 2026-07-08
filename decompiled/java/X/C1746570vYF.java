package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel$getDeliveryItems$1", f = "DeliveryInstructionViewModel.kt", l = {100}, m = "invokeSuspend")
public final class C1746570vYF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DeliveryInstructionViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746570vYF(DeliveryInstructionViewModel deliveryInstructionViewModel, long j, InterfaceC1364105Vn<? super C1746570vYF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = deliveryInstructionViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746570vYF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Region region;
        boolean z;
        Response response;
        InputItemData inputItemData;
        Object objLIZLLL = obj;
        C1C7U.LIZ("DeliveryInstructionViewModel@d852.getDeliveryItems$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    C155000ia.LIZIZ(objLIZLLL);
                    z = true;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                C980703sT c980703sT = AddressApi.LIZ;
                Address address = this.LLILLJJLI.LLILZLL;
                if (address != null) {
                    region = address.region;
                } else {
                    region = null;
                }
                Integer numLJ = C2286608xc.LJ(3);
                this.LL = 1;
                z = true;
                try {
                    objLIZLLL = c980703sT.LIZLLL(region, null, null, numLJ, "delivery_instructions", null, null, null, this);
                    if (objLIZLLL == objLJFF) {
                        C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.getDeliveryItems$1");
                        return objLJFF;
                    }
                } catch (Exception e) {
                    e = e;
                    i = 3;
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILLJJLI.iR2(this.LLILLL, e.getMessage(), false);
                    DeliveryInstructionViewModel deliveryInstructionViewModel = this.LLILLJJLI;
                    deliveryInstructionViewModel.getClass();
                    deliveryInstructionViewModel.setState(new AwS38S0001000_26(i, 20));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.getDeliveryItems$1");
                    return unit;
                }
            }
            response = (Response) objLIZLLL;
            inputItemData = (InputItemData) response.data;
        } catch (Exception e2) {
            e = e2;
            i = 3;
        }
        if (response.isCodeOK() && inputItemData != null) {
            this.LLILLJJLI.iR2(this.LLILLL, null, z);
            DeliveryInstructionViewModel deliveryInstructionViewModel2 = this.LLILLJJLI;
            deliveryInstructionViewModel2.setState(new AwS392S0200000_26(deliveryInstructionViewModel2, inputItemData, 262));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.getDeliveryItems$1");
            return unit2;
        }
        this.LLILLJJLI.iR2(this.LLILLL, response.message, false);
        DeliveryInstructionViewModel deliveryInstructionViewModel3 = this.LLILLJJLI;
        deliveryInstructionViewModel3.getClass();
        i = 3;
        try {
            deliveryInstructionViewModel3.setState(new AwS38S0001000_26(3, 20));
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.getDeliveryItems$1");
            return unit3;
        } catch (Exception e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.iR2(this.LLILLL, e.getMessage(), false);
            DeliveryInstructionViewModel deliveryInstructionViewModel4 = this.LLILLJJLI;
            deliveryInstructionViewModel4.getClass();
            deliveryInstructionViewModel4.setState(new AwS38S0001000_26(i, 20));
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.getDeliveryItems$1");
            return unit22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
