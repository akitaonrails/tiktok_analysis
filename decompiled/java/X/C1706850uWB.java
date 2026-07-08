package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.pipo.postpayment.impl.PostPaymentReportUserActionApi;
import com.ss.android.ugc.aweme.pipo.postpayment.impl.ReportUserActionRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.postpayment.impl.PostPaymentGuideActionHandlersKt$reportUserAction$2", f = "PostPaymentGuideActionHandlers.kt", l = {253}, m = "invokeSuspend")
public final class C1706850uWB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1707390uX3 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1706850uWB(String str, C1707390uX3 c1707390uX3, String str2, String str3, InterfaceC1364105Vn<? super C1706850uWB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1707390uX3;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706850uWB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1499850p8J c1499850p8JCreateBuilder;
        PostPaymentReportUserActionApi postPaymentReportUserActionApi;
        Object objReportUserAction = obj;
        C1C7U.LIZ("PostPaymentGuideActionHandlersKt@fed6.reportUserAction$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objReportUserAction);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objReportUserAction);
            C1706860uWC c1706860uWC = PostPaymentReportUserActionApi.LIZ;
            String str = this.LLILLJJLI;
            c1706860uWC.getClass();
            IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
            objReportUserAction = null;
            if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(str)) != null && (postPaymentReportUserActionApi = (PostPaymentReportUserActionApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(PostPaymentReportUserActionApi.class)) != null) {
                C1707390uX3 c1707390uX3 = this.LLILLL;
                String str2 = c1707390uX3.LJIIIZ;
                if (str2 == null) {
                    str2 = "";
                }
                ReportUserActionRequest reportUserActionRequest = new ReportUserActionRequest(c1707390uX3.LJIIJ, c1707390uX3.LJIIJJI, this.LLILZ, this.LLILZIL);
                this.LL = 1;
                objReportUserAction = postPaymentReportUserActionApi.reportUserAction(str2, reportUserActionRequest, this);
                if (objReportUserAction == objLJFF) {
                    C1C7U.LIZIZ("PostPaymentGuideActionHandlersKt@fed6.reportUserAction$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("PostPaymentGuideActionHandlersKt@fed6.reportUserAction$2");
        return objReportUserAction;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
