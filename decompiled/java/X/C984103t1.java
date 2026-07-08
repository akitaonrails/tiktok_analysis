package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressPromotionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressPromotionResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03t1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$getShippingAddressPromotion$1", f = "AddressEditViewModel.kt", l = {699}, m = "invokeSuspend")
public final class C984103t1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AddressEditViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ AddressEditViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C984103t1(AddressEditViewModel addressEditViewModel, InterfaceC1364105Vn<? super C984103t1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = addressEditViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C984103t1(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AddressEditViewModel addressEditViewModel;
        Integer num;
        C1C7U.LIZ("AddressEditViewModel@7f24.getShippingAddressPromotion$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    addressEditViewModel = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                addressEditViewModel = this.LLILLL;
                C980703sT c980703sT = AddressApi.LIZ;
                AddressPageStarter.AddressEditEnterParams addressEditEnterParams = addressEditViewModel.LLJJJIL;
                String str = null;
                if (addressEditEnterParams != null) {
                    num = addressEditEnterParams.addressSource;
                } else {
                    num = null;
                }
                if (addressEditEnterParams != null) {
                    str = addressEditEnterParams.serverParams;
                }
                ShippingAddressPromotionRequest shippingAddressPromotionRequest = new ShippingAddressPromotionRequest(num, str);
                this.LL = addressEditViewModel;
                this.LLILLJJLI = 1;
                c980703sT.getClass();
                obj = ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).qt(shippingAddressPromotionRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressEditViewModel@7f24.getShippingAddressPromotion$1");
                    return objLJFF;
                }
            }
            addressEditViewModel.FR2((ShippingAddressPromotionResponse) ((Response) obj).data);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditViewModel@7f24.getShippingAddressPromotion$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
