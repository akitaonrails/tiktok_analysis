package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0vY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel$saveAddress$2$1", f = "AddressMapDetailViewModel.kt", l = {382}, m = "invokeSuspend")
public final class C1746510vY9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AddressMapDetailViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ AddressMapDetailViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746510vY9(AddressMapDetailViewModel addressMapDetailViewModel, InterfaceC1364105Vn<? super C1746510vY9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = addressMapDetailViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746510vY9(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AddressMapDetailViewModel addressMapDetailViewModel;
        List<Error> list;
        Error error;
        T t;
        String str;
        C1C7U.LIZ("AddressMapDetailViewModel@adb3.saveAddress$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Unit unit = null;
        String str2 = null;
        str = null;
        str = null;
        String str3 = null;
        if (i != 0) {
            if (i == 1) {
                addressMapDetailViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            addressMapDetailViewModel = this.LLILLL;
            Address address = addressMapDetailViewModel.LLIZ;
            if (address != null) {
                C980703sT c980703sT = AddressApi.LIZ;
                EnumC962003pS enumC962003pS = EnumC962003pS.ADDRESS_MAP;
                this.LL = addressMapDetailViewModel;
                this.LLILLJJLI = 1;
                c980703sT.getClass();
                obj = C980703sT.LJFF(address, 2, true, 0, null, enumC962003pS, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressMapDetailViewModel@adb3.saveAddress$2$1");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("AddressMapDetailViewModel@adb3.saveAddress$2$1");
            return unit;
        }
        Response response = (Response) obj;
        if (response.isCodeOK() && (t = response.data) != 0 && (str = ((SaveData) t).id) != null && !a0.LJJJIL(str)) {
            addressMapDetailViewModel.getClass();
            AddressPageStarter.AddressMapDetailEnterParams addressMapDetailEnterParams = addressMapDetailViewModel.LLILZIL;
            if (addressMapDetailEnterParams != null) {
                str2 = addressMapDetailEnterParams.enterFrom;
            }
            AnonymousClass0378.LIZ().LIZ("ec_update_address_location", C1741890vQh.LJIIIIZZ(new C854203Vk(str2)));
            addressMapDetailViewModel.setState(AFwS268S0000000_26.get$arr$(652));
        } else {
            SaveData saveData = (SaveData) response.data;
            if (saveData != null && (list = saveData.errors) != null && (error = (Error) C13LP.LJJJLL(list)) != null) {
                str3 = error.error;
            }
            addressMapDetailViewModel.LLJJIII = str3;
            addressMapDetailViewModel.setState(AFwS268S0000000_26.get$arr$(653));
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressMapDetailViewModel@adb3.saveAddress$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
