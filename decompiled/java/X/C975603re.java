package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$dealWhenChangeOnOrderScene$1$1$1$1", f = "IAddressListViewModel.kt", l = {790}, m = "invokeSuspend")
public final class C975603re extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C259800zU<Integer> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ C259800zU<Boolean> LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC975703rf LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C975603re(C259800zU<Integer> c259800zU, C259800zU<String> c259800zU2, C259800zU<Boolean> c259800zU3, C259800zU<String> c259800zU4, String str, InterfaceC975703rf interfaceC975703rf, Function0<Unit> function0, InterfaceC1364105Vn<? super C975603re> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
        this.LLILZ = c259800zU3;
        this.LLILZIL = c259800zU4;
        this.LLILZLL = str;
        this.LLIZ = interfaceC975703rf;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C975603re(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List<Error> list;
        Integer num;
        Function0<Unit> function0;
        Object objLIZ = obj;
        C1C7U.LIZ("IAddressListViewModel@9425.dealWhenChangeOnOrderScene$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                C980703sT c980703sT = AddressApi.LIZ;
                Integer num2 = this.LLILLJJLI.element;
                String str = this.LLILLL.element;
                Boolean bool = this.LLILZ.element;
                String str2 = this.LLILZIL.element;
                String str3 = this.LLILZLL;
                if (str3 == null) {
                    str3 = "";
                }
                this.LL = 1;
                objLIZ = C980703sT.LIZ(c980703sT, num2, str, str3, bool, str2, null, null, null, null, this, 448);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("IAddressListViewModel@9425.dealWhenChangeOnOrderScene$1$1$1$1");
                    return objLJFF;
                }
            }
            Response response = (Response) objLIZ;
            if (C975803rg.LIZIZ(this.LLIZ, response) && (function0 = this.LLIZLLLIL) != null) {
                function0.invoke();
            }
            Integer numJt1 = this.LLIZ.jt1();
            if (numJt1 != null) {
                String str4 = this.LLILZLL;
                int iIntValue = numJt1.intValue();
                if (iIntValue > 0) {
                    ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = (ChangeOrderShippingAddressResponseData) response.data;
                    boolean z2 = false;
                    if (changeOrderShippingAddressResponseData != null && (num = changeOrderShippingAddressResponseData.resultCode) != null && num.intValue() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData2 = (ChangeOrderShippingAddressResponseData) response.data;
                        if (changeOrderShippingAddressResponseData2 != null) {
                            list = changeOrderShippingAddressResponseData2.errors;
                        } else {
                            list = null;
                        }
                        if (list == null || list.isEmpty()) {
                            z2 = true;
                        }
                        if (z2) {
                            C973303rH c973303rH = C973303rH.LL;
                            Integer numLJ = C2286608xc.LJ(iIntValue);
                            c973303rH.getClass();
                            C973303rH.LJIIIIZZ(numLJ, str4);
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR62, e, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAddressListViewModel@9425.dealWhenChangeOnOrderScene$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
