package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.cache.data.AddressCacheModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$loadAddressListFromCache$1$1$1", f = "IAddressListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C975403rc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AddressCacheModel LL;
    public final /* synthetic */ InterfaceC975703rf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C975403rc(AddressCacheModel addressCacheModel, InterfaceC975703rf interfaceC975703rf, InterfaceC1364105Vn<? super C975403rc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = addressCacheModel;
        this.LLILLJJLI = interfaceC975703rf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C975403rc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Type type;
        AddressListData addressListData;
        C1C7U.LIZ("IAddressListViewModel@9425.loadAddressListFromCache$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String str = this.LL.addressListData;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(AddressListData.class));
                } else {
                    type = new TypeToken<AddressListData>() { // from class: X.03rd
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type);
                if (!(objLJIIIIZZ instanceof AddressListData)) {
                    objLJIIIIZZ = null;
                }
                addressListData = (AddressListData) objLJIIIIZZ;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (addressListData != null && C756302xN.LIZ(addressListData.addressList)) {
                this.LLILLJJLI.UC2(true);
                C975803rg.LJFF(this.LLILLJJLI, addressListData);
                AddressCacheModel addressCacheModel = this.LL;
                addressCacheModel.getClass();
                C977303rv.LIZ(C977303rv.LIZ, 1, null, null, addressCacheModel, 4);
            } else {
                AddressCacheModel addressCacheModel2 = this.LL;
                addressCacheModel2.getClass();
                C977303rv.LIZ(C977303rv.LIZ, 0, "list_empty", null, addressCacheModel2, 4);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1019103yf.LIZ(EnumC1014603xw.ERR79, e2, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAddressListViewModel@9425.loadAddressListFromCache$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
