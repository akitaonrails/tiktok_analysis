package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03u9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel$getCandInputOptionsReal$1", f = "AddressEditDetailViewModel.kt", l = {189}, m = "invokeSuspend")
public final class C991103u9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Address LLILLL;
    public final /* synthetic */ AddressEditDetailViewModel LLILZ;
    public final /* synthetic */ Function1<CandInputDataOptions, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C991103u9(String str, Address address, AddressEditDetailViewModel addressEditDetailViewModel, Function1<? super CandInputDataOptions, Unit> function1, InterfaceC1364105Vn<? super C991103u9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = address;
        this.LLILZ = addressEditDetailViewModel;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C991103u9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CandInputDataOptions candInputDataOptions;
        Object objPt = obj;
        C1C7U.LIZ("AddressEditDetailViewModel@1e80.getCandInputOptionsReal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objPt);
            } else {
                C155000ia.LIZIZ(objPt);
                C980703sT c980703sT = AddressApi.LIZ;
                String str = this.LLILLJJLI;
                Address address = this.LLILLL;
                AddressEditDetailViewModel addressEditDetailViewModel = this.LLILZ;
                CandInputRequest candInputRequest = new CandInputRequest(str, address, addressEditDetailViewModel.LLJJ, addressEditDetailViewModel.LLJJI, str, C1747870vaL.LIZ, null, null, null, null, null, null);
                this.LL = 1;
                c980703sT.getClass();
                objPt = ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).pt(candInputRequest, this);
                if (objPt == objLJFF) {
                    C1C7U.LIZIZ("AddressEditDetailViewModel@1e80.getCandInputOptionsReal$1");
                    return objLJFF;
                }
            }
            Response response = (Response) objPt;
            if (response.isCodeOK() && (candInputDataOptions = (CandInputDataOptions) response.data) != null) {
                this.LLILZIL.invoke(candInputDataOptions);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditDetailViewModel@1e80.getCandInputOptionsReal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
