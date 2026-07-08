package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03sS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel$checkZipcodeAndApply$1", f = "AddressSelectViewModel.kt", l = {331}, m = "invokeSuspend")
public final class C980603sS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AddressSelectViewModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C980603sS(Address address, String str, AddressSelectViewModel addressSelectViewModel, boolean z, InterfaceC1364105Vn<? super C980603sS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
        this.LLILLL = str;
        this.LLILZ = addressSelectViewModel;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C980603sS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Address address;
        List<AddressItem> list;
        AddressItem next;
        Error next2;
        String str;
        Object objLIZIZ = obj;
        C1C7U.LIZ("AddressSelectViewModel@235c.checkZipcodeAndApply$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        String str2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                C980703sT c980703sT = AddressApi.LIZ;
                Address address2 = this.LLILLJJLI;
                Integer numLJ = C2286608xc.LJ(5);
                this.LL = 1;
                c980703sT.getClass();
                objLIZIZ = C980703sT.LIZIZ(address2, numLJ, 0, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("AddressSelectViewModel@235c.checkZipcodeAndApply$1");
                    return objLJFF;
                }
            }
            Response response = (Response) objLIZIZ;
            CheckShippingAddressData checkShippingAddressData = (CheckShippingAddressData) response.data;
            if (checkShippingAddressData != null) {
                String str3 = this.LLILLL;
                AddressSelectViewModel addressSelectViewModel = this.LLILZ;
                boolean z2 = this.LLILZIL;
                List<Error> list2 = checkShippingAddressData.errors;
                if (list2 != null) {
                    Iterator<Error> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (Intrinsics.LJFF(next2.key, "zipcode")) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    Error error = next2;
                    if (error != null && (str = error.error) != null) {
                        addressSelectViewModel.getClass();
                        AddressSelectViewModel.nR2(str, true);
                        z = true;
                    }
                }
                if (!z && response.isCodeOK()) {
                    AddressVerifyData addressVerifyData = checkShippingAddressData.verifyData;
                    if (addressVerifyData != null && (address = addressVerifyData.shippingAddress) != null && (list = address.items) != null) {
                        Iterator<AddressItem> it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (Intrinsics.LJFF(next.key, "zipcode")) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        AddressItem addressItem = next;
                        if (addressItem != null) {
                            str2 = addressItem.value;
                        }
                    }
                    if (C123100dR.LIZ(str2)) {
                        str3 = str2;
                    }
                    addressSelectViewModel.getClass();
                    ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_zipcode_locate_address", C1741890vQh.LJIIIIZZ(new ZipcodeLocateAddress(-1, null, null, null, str3, Boolean.TRUE)));
                }
                if (!z && response.isCodeOK() && !z2) {
                    addressSelectViewModel.pR2(str3);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR68, e, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressSelectViewModel@235c.checkZipcodeAndApply$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
