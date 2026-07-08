package X;

import com.ss.android.ugc.aweme.report.OutreachReportRequest;
import com.ss.android.ugc.aweme.report.OutreachReportResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.operation.tracking.OutreachReportManager$reportInternal$1$response$1", f = "OutreachReportAPI.kt", l = {133}, m = "invokeSuspend")
public final class C315030CWn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super OutreachReportResponse>, Object> {
    public int LL;
    public final /* synthetic */ OutreachReportRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315030CWn(OutreachReportRequest outreachReportRequest, InterfaceC1364105Vn<? super C315030CWn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = outreachReportRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315030CWn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachReportManager@dee1.reportInternal$1$response$1");
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
            C337050DJf.LIZ.getClass();
            InterfaceC315020CWm interfaceC315020CWm = C337050DJf.LIZIZ;
            OutreachReportRequest outreachReportRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC315020CWm.LIZ(outreachReportRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OutreachReportManager@dee1.reportInternal$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OutreachReportManager@dee1.reportInternal$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super OutreachReportResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
