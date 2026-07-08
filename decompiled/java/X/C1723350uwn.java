package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import com.ss.android.ugc.aweme.pipo.hybrid.llm.LLMNetworkApi;
import com.ss.android.ugc.aweme.pipo.hybrid.llm.LLMWebCollectRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.hybrid.llm.LLMReportSender$sendReport$2", f = "LLMReportSender.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "invokeSuspend")
public final class C1723350uwn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Object>>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LLMWebCollectRequest LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1723350uwn(String str, LLMWebCollectRequest lLMWebCollectRequest, InterfaceC1364105Vn<? super C1723350uwn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = lLMWebCollectRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1723350uwn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LLMReportSender@4349.sendReport$2");
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
                String str = C1723360uwo.LIZ().requestUrl;
                if (str == null) {
                    C1C7U.LIZIZ("LLMReportSender@4349.sendReport$2");
                    return null;
                }
                C1725270uzt.LIZ.LJIIIIZZ(this.LLILLJJLI, "start_request", null);
                LLMNetworkApi.LIZ.getClass();
                InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
                interfaceC1717730unjCreateBuilder.LIZIZ(new PipoNetworkMonitor());
                LLMNetworkApi lLMNetworkApi = (LLMNetworkApi) interfaceC1717730unjCreateBuilder.build().create(LLMNetworkApi.class);
                LLMWebCollectRequest lLMWebCollectRequest = this.LLILLL;
                this.LL = 1;
                obj = lLMNetworkApi.postRequest(str, lLMWebCollectRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LLMReportSender@4349.sendReport$2");
                    return objLJFF;
                }
            }
            C0X52 c0x52 = (C0X52) obj;
            C1725270uzt.LIZ.LJIIIIZZ(this.LLILLJJLI, "request_success", null);
            C1C7U.LIZIZ("LLMReportSender@4349.sendReport$2");
            return c0x52;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1725270uzt.LIZ.LJIIIIZZ(this.LLILLJJLI, "request_error", e.getMessage());
            C1C7U.LIZIZ("LLMReportSender@4349.sendReport$2");
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<Object>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
