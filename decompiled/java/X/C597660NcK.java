package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo.ChangeLiveSettingRequest;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel$sendChangeAutoPostSwitchStatusRequest$1$resp$1", f = "HighlightsListViewModel.kt", l = {141}, m = "invokeSuspend")
public final class C597660NcK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<Object>>>, Object> {
    public int LL;
    public final /* synthetic */ HighlightsListViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597660NcK(HighlightsListViewModel highlightsListViewModel, int i, InterfaceC1364105Vn<? super C597660NcK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = highlightsListViewModel;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597660NcK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsListViewModel@8591.sendChangeAutoPostSwitchStatusRequest$1$resp$1");
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
            HighlightsListViewModel.yQ2(this.LLILLJJLI, "send_req_setting_change", null, null, 14);
            C597650NcJ c597650NcJ = this.LLILLJJLI.LL.LLILLJJLI;
            String strValueOf = String.valueOf(this.LLILLL);
            String str = this.LLILLJJLI.LLILLL;
            this.LL = 1;
            obj = c597650NcJ.LL.LL.changeLiveSetting(new ChangeLiveSettingRequest(C2286608xc.LJ(5), strValueOf, str), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HighlightsListViewModel@8591.sendChangeAutoPostSwitchStatusRequest$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("HighlightsListViewModel@8591.sendChangeAutoPostSwitchStatusRequest$1$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
