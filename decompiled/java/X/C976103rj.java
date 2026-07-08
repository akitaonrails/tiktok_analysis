package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressSku;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$saveAddress$1", f = "IAddressListViewModel.kt", l = {988, 1004, 1022}, m = "invokeSuspend")
public final class C976103rj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Address LLILLL;
    public final /* synthetic */ InterfaceC975703rf LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C976103rj(Address address, InterfaceC975703rf interfaceC975703rf, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C976103rj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = address;
        this.LLILZ = interfaceC975703rf;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C976103rj(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AddressSku addressSku;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        Object obj4;
        String str3;
        Object objLJFF = obj;
        C1C7U.LIZ("IAddressListViewModel@9425.saveAddress$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
        } catch (Exception e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C976503rn c976503rn = new C976503rn(this.LLILZIL, null);
            this.LL = e;
            this.LLILLJJLI = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c976503rn) == objLJFF2) {
                C1C7U.LIZIZ("IAddressListViewModel@9425.saveAddress$1");
                return objLJFF2;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        e = (Throwable) this.LL;
                        C155000ia.LIZIZ(objLJFF);
                        C1019103yf.LIZ(EnumC1014603xw.ERR20010, e, null);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("IAddressListViewModel@9425.saveAddress$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJFF);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("IAddressListViewModel@9425.saveAddress$1");
                return unit2;
            }
            C155000ia.LIZIZ(objLJFF);
        } else {
            C155000ia.LIZIZ(objLJFF);
            C980703sT c980703sT = AddressApi.LIZ;
            Address address = this.LLILLL;
            Integer numIK = this.LLILZ.IK();
            Integer numIK2 = this.LLILZ.IK();
            if (numIK2 != null && numIK2.intValue() == 8) {
                HashMap<String, Object> map = C850103Tv.LJIIIIZZ;
                if (map != null) {
                    obj2 = map.get("product_id");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                HashMap<String, Object> map2 = C850103Tv.LJIIIIZZ;
                if (map2 != null) {
                    obj3 = map2.get("sku_id");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                } else {
                    str2 = null;
                }
                HashMap<String, Object> map3 = C850103Tv.LJIIIIZZ;
                if (map3 != null) {
                    obj4 = map3.get("room_id");
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof String) {
                    str3 = (String) obj4;
                } else {
                    str3 = null;
                }
                addressSku = new AddressSku(str, str2, str3);
            } else {
                addressSku = null;
            }
            EnumC962003pS enumC962003pS = EnumC962003pS.DEFAULT;
            this.LLILLJJLI = 1;
            c980703sT.getClass();
            objLJFF = C980703sT.LJFF(address, 2, true, numIK, addressSku, enumC962003pS, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("IAddressListViewModel@9425.saveAddress$1");
                return objLJFF2;
            }
        }
        Response response = (Response) objLJFF;
        SaveData saveData = (SaveData) response.data;
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C976303rl c976303rl = new C976303rl(response, saveData, this.LLILZIL, null);
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c976303rl) == objLJFF2) {
            C1C7U.LIZIZ("IAddressListViewModel@9425.saveAddress$1");
            return objLJFF2;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("IAddressListViewModel@9425.saveAddress$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
