package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.component.guide.FrequencyReportApi;
import com.ss.android.ugc.aweme.component.guide.FrequencyReportRequest;
import com.ss.android.ugc.aweme.pipo.common.network.partener.PipoNetworkMonitor;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Wr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.guide.GuideInfoCollectUtils$reportFrequency$1", f = "GuideInfoCollectUtils.kt", l = {84}, m = "invokeSuspend")
public final class C836130Wr5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836130Wr5(String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn<? super C836130Wr5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C836130Wr5 c836130Wr5 = new C836130Wr5(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c836130Wr5.LLILLJJLI = obj;
        return c836130Wr5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("GuideInfoCollectUtils@7fa2.reportFrequency$1");
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
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                String str3 = this.LLILZIL;
                String str4 = this.LLILZLL;
                String str5 = this.LLIZ;
                FrequencyReportApi.LIZ.getClass();
                InterfaceC1717730unj interfaceC1717730unjCreateBuilder = C1717770unn.LJIIJ().createBuilder(str);
                interfaceC1717730unjCreateBuilder.LIZIZ(new PipoNetworkMonitor());
                FrequencyReportApi frequencyReportApi = (FrequencyReportApi) interfaceC1717730unjCreateBuilder.build().create(FrequencyReportApi.class);
                if (str3 == null) {
                    str3 = "";
                }
                FrequencyReportRequest frequencyReportRequest = new FrequencyReportRequest(UUID.randomUUID().toString(), String.valueOf(System.currentTimeMillis()), str3, str4, null, str5);
                this.LL = 1;
                obj = frequencyReportApi.report(str2, frequencyReportRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GuideInfoCollectUtils@7fa2.reportFrequency$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GuideInfoCollectUtils@7fa2.reportFrequency$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
