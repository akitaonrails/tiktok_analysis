package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03u7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel$queryCandDetailPlace$1", f = "AddressEditViewModel.kt", l = {1293}, m = "invokeSuspend")
public final class C990903u7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ AddressEditViewModel LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function1<CandDetailPlaceResponse, Unit> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C990903u7(Address address, String str, String str2, Integer num, AddressEditViewModel addressEditViewModel, String str3, String str4, Function1<? super CandDetailPlaceResponse, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C990903u7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = num;
        this.LLILZLL = addressEditViewModel;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = function1;
        this.LLJI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C990903u7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddressEditViewModel@7f24.queryCandDetailPlace$1");
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
                CandDetailPlaceRequest candDetailPlaceRequest = new CandDetailPlaceRequest(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL.LLLIIL, C1747870vaL.LIZ, this.LLIZ, this.LLIZLLLIL);
                this.LL = 1;
                c980703sT.getClass();
                obj = ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).gt(candDetailPlaceRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddressEditViewModel@7f24.queryCandDetailPlace$1");
                    return objLJFF;
                }
            }
            Response response = (Response) obj;
            if (response.isCodeOK()) {
                CandDetailPlaceResponse candDetailPlaceResponse = (CandDetailPlaceResponse) response.data;
                if (candDetailPlaceResponse != null) {
                    this.LLJ.invoke(candDetailPlaceResponse);
                } else {
                    Function0<Unit> function0 = this.LLJI;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            } else {
                Function0<Unit> function02 = this.LLJI;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.ERR56, th, null);
            Function0<Unit> function03 = this.LLJI;
            if (function03 != null) {
                function03.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddressEditViewModel@7f24.queryCandDetailPlace$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
