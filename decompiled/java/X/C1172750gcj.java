package X;

import com.ss.android.ugc.aweme.poi.compliance.repo.model.PoiPassportLoginData;
import com.ss.android.ugc.aweme.poi.compliance.repo.model.PoiPassportLoginResponse;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel$requestPassportLogin$1", f = "PoiOrderSubmitViewModel.kt", l = {87}, m = "invokeSuspend")
public final class C1172750gcj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PoiOrderSubmitViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ PoiOrderSubmitViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172750gcj(PoiOrderSubmitViewModel poiOrderSubmitViewModel, InterfaceC1364105Vn<? super C1172750gcj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = poiOrderSubmitViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1172750gcj(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PoiOrderSubmitViewModel poiOrderSubmitViewModel;
        PoiPassportLoginData poiPassportLoginData;
        C1C7U.LIZ("PoiOrderSubmitViewModel@6475.requestPassportLogin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                poiOrderSubmitViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            poiOrderSubmitViewModel = this.LLILLL;
            InterfaceC1172730gch interfaceC1172730gch = (InterfaceC1172730gch) poiOrderSubmitViewModel.LLILLJJLI.getValue().getOperator();
            this.LL = poiOrderSubmitViewModel;
            this.LLILLJJLI = 1;
            obj = interfaceC1172730gch.LLLLLLZZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.requestPassportLogin$1");
                return objLJFF;
            }
        }
        PoiPassportLoginResponse poiPassportLoginResponse = (PoiPassportLoginResponse) obj;
        if (poiPassportLoginResponse != null) {
            poiPassportLoginData = poiPassportLoginResponse.data;
        } else {
            poiPassportLoginData = null;
        }
        poiOrderSubmitViewModel.LLILLL = poiPassportLoginData;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.requestPassportLogin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
