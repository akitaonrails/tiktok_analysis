package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.bean.TtsDecisionGetReqParamsMixMall;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.bean.TtsDecisionGetResponseMixMall;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NcB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.assem.vm.EcMixMallDiversionViewModel$handleRealTimeVoucher$1$1$ssResponse$1", f = "EcMixMallDiversionViewModel.kt", l = {237}, m = "invokeSuspend")
public final class C597570NcB extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<TtsDecisionGetResponseMixMall>>>, Object> {
    public int LL;
    public final /* synthetic */ EcMixMallDiversionViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597570NcB(int i, EcMixMallDiversionViewModel ecMixMallDiversionViewModel, String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = ecMixMallDiversionViewModel;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597570NcB(this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<TtsDecisionGetResponseMixMall>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcMixMallDiversionViewModel@a14a.handleRealTimeVoucher$1$1$ssResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC597580NcC interfaceC597580NcC = (InterfaceC597580NcC) this.LLILLJJLI.LLILZLL.getValue().getOperator();
            TtsDecisionGetReqParamsMixMall ttsDecisionGetReqParamsMixMall = new TtsDecisionGetReqParamsMixMall(C2286608xc.LJ(this.LLILLL), this.LLILZ, C786410Ut5.J3(this.LLILZIL));
            this.LL = 1;
            obj = interfaceC597580NcC.LJI(ttsDecisionGetReqParamsMixMall, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcMixMallDiversionViewModel@a14a.handleRealTimeVoucher$1$1$ssResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcMixMallDiversionViewModel@a14a.handleRealTimeVoucher$1$1$ssResponse$1");
        return obj;
    }
}
