package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputRequest;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressEditSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.associate.AddressAssociateViewModel$getCandInputOptionsReal$3", f = "AddressAssociateViewModel.kt", l = {214}, m = "invokeSuspend")
public final class C1746480vY6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddressAssociateViewModel LLILLJJLI;
    public final /* synthetic */ C259800zU<Address> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746480vY6(AddressAssociateViewModel addressAssociateViewModel, C259800zU<Address> c259800zU, InterfaceC1364105Vn<? super C1746480vY6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addressAssociateViewModel;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746480vY6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLIZ;
        boolean z;
        boolean z2;
        int i;
        Integer num;
        Integer num2;
        String str;
        int size;
        List<CandInputData> list;
        ArrayList arrayList;
        List<CandInputData> list2;
        Object objPt = obj;
        C1C7U.LIZ("AddressAssociateViewModel@9920.getCandInputOptionsReal$3");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objPt);
            } else {
                C155000ia.LIZIZ(objPt);
                if (Intrinsics.LJFF(AddressEditSetting.LIZ().requestAddLocation, true)) {
                    numLIZ = C1747070vZ3.LIZ();
                } else {
                    numLIZ = null;
                }
                AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams = this.LLILLJJLI.LLILZLL;
                if (addressAssociateEnterParams != null && (num2 = addressAssociateEnterParams.sourcePage) != null && num2.intValue() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = 15;
                } else {
                    AddressPageStarter.AddressAssociateEnterParams addressAssociateEnterParams2 = this.LLILLJJLI.LLILZLL;
                    if (addressAssociateEnterParams2 != null && (num = addressAssociateEnterParams2.sourcePage) != null && num.intValue() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = 16;
                    } else {
                        i = 0;
                    }
                }
                C980703sT c980703sT = AddressApi.LIZ;
                CandInputRequest candInputRequest = new CandInputRequest("address", this.LLILLL.element, C2286608xc.LJ(i), this.LLILLJJLI.LLIZLLLIL, "address", C1747870vaL.LIZ, null, null, null, null, null, numLIZ);
                this.LL = 1;
                c980703sT.getClass();
                objPt = ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).pt(candInputRequest, this);
                if (objPt == objLJFF) {
                    C1C7U.LIZIZ("AddressAssociateViewModel@9920.getCandInputOptionsReal$3");
                    return objLJFF;
                }
            }
            Response response = (Response) objPt;
            if (response.isCodeOK()) {
                AddressAssociateViewModel addressAssociateViewModel = this.LLILLJJLI;
                T t = response.data;
                CandInputDataOptions candInputDataOptions = (CandInputDataOptions) t;
                if (candInputDataOptions != null) {
                    str = candInputDataOptions.sessionKey;
                } else {
                    str = null;
                }
                addressAssociateViewModel.LLIZLLLIL = str;
                CandInputDataOptions candInputDataOptions2 = (CandInputDataOptions) t;
                if (candInputDataOptions2 != null && (list2 = candInputDataOptions2.candInputOptions) != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                if (size > 0) {
                    CandInputDataOptions candInputDataOptions3 = (CandInputDataOptions) response.data;
                    if (candInputDataOptions3 != null) {
                        list = candInputDataOptions3.candInputOptions;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<CandInputData> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(CandInputData.LIZ(it2.next(), response.logId));
                        }
                    } else {
                        arrayList = null;
                    }
                    this.LLILLJJLI.setState(new AwS392S0200000_26(candInputDataOptions3, (CandInputDataOptions) arrayList, (List<CandInputData>) 24));
                } else {
                    this.LLILLJJLI.setState(new AwS605S0100000_26(response, (Response<CandInputDataOptions>) 143));
                }
            } else {
                this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(142));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(143));
            C1019103yf.LIZ(EnumC1014603xw.ERR20003, th, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressAssociateViewModel@9920.getCandInputOptionsReal$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
