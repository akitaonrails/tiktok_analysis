package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel$queryCandDetailPlace$1", f = "AddressEditDetailViewModel.kt", l = {221}, m = "invokeSuspend")
public final class C991003u8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ AddressEditDetailViewModel LLILZLL;
    public final /* synthetic */ Function1<CandDetailPlaceResponse, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C991003u8(Address address, String str, String str2, Integer num, AddressEditDetailViewModel addressEditDetailViewModel, Function1<? super CandDetailPlaceResponse, Unit> function1, InterfaceC1364105Vn<? super C991003u8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = num;
        this.LLILZLL = addressEditDetailViewModel;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C991003u8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CandDetailPlaceResponse candDetailPlaceResponse;
        C1C7U.LIZ("AddressEditDetailViewModel@1e80.queryCandDetailPlace$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C980703sT c980703sT = AddressApi.LIZ;
                CandDetailPlaceRequest candDetailPlaceRequest = new CandDetailPlaceRequest(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL.LLJJ, C1747870vaL.LIZ, null, null);
                this.LL = 1;
                c980703sT.getClass();
                obj = ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).gt(candDetailPlaceRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressEditDetailViewModel@1e80.queryCandDetailPlace$1");
                    return objLJFF;
                }
            }
            Response response = (Response) obj;
            if (response.isCodeOK() && (candDetailPlaceResponse = (CandDetailPlaceResponse) response.data) != null) {
                this.LLIZ.invoke(candDetailPlaceResponse);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("queryCandDetailPlace fail");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditDetailViewModel@1e80.queryCandDetailPlace$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
