package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.api.DeliveryApi;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryRequest;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel$getLogisticAddressList$1", f = "AddressSelectViewModel.kt", l = {137}, m = "invokeSuspend")
public final class C968603qW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AddressSelectViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ AddressSelectViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968603qW(AddressSelectViewModel addressSelectViewModel, InterfaceC1364105Vn<? super C968603qW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = addressSelectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C968603qW(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AddressSelectViewModel addressSelectViewModel;
        String string;
        C1C7U.LIZ("AddressSelectViewModel@235c.getLogisticAddressList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    addressSelectViewModel = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                addressSelectViewModel = this.LLILLL;
                C966503qB c966503qB = DeliveryApi.LIZ;
                DeliveryRequest deliveryRequest = addressSelectViewModel.LLJILJIL;
                Integer num = addressSelectViewModel.LLJILJILJ;
                if (num == null || (string = num.toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                this.LL = addressSelectViewModel;
                this.LLILLJJLI = 1;
                c966503qB.getClass();
                HashMap<String, String> map = new HashMap<>();
                map.put("biz_type", string);
                obj = ((DeliveryApi) C966503qB.LIZIZ.create(DeliveryApi.class)).fetchLogistics(deliveryRequest, map, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressSelectViewModel@235c.getLogisticAddressList$1");
                    return objLJFF;
                }
            }
            Response response = (Response) obj;
            DeliveryData deliveryData = (DeliveryData) response.data;
            if (response.isCodeOK() && deliveryData != null) {
                addressSelectViewModel.setState(new AwS580S0100000_1(deliveryData, 968));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLILLL.SB1(-1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressSelectViewModel@235c.getLogisticAddressList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
