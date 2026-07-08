package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.report.OutreachReportRequest;
import com.ss.android.ugc.aweme.report.OutreachReportResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.operation.tracking.OutreachReportManager$reportInternal$1", f = "OutreachReportAPI.kt", l = {132}, m = "invokeSuspend")
public final class C315040CWo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OutreachReportRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315040CWo(OutreachReportRequest outreachReportRequest, InterfaceC1364105Vn<? super C315040CWo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = outreachReportRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315040CWo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachReportManager@dee1.reportInternal$1");
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
                InterfaceC315020CWm.LIZ.getClass();
                long j = C313160CPi.LIZIZ;
                C315030CWn c315030CWn = new C315030CWn(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C099A.LIZIZ(j, c315030CWn, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OutreachReportManager@dee1.reportInternal$1");
                    return objLJFF;
                }
            }
            OutreachReportResponse outreachReportResponse = (OutreachReportResponse) obj;
            Integer num = outreachReportResponse.statusCode;
            if (num != null && num.intValue() == 0) {
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("report success: ");
                sbLIZ.append(outreachReportResponse.statusMsg);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZ(strLIZIZ);
            } else {
                C20571615ec c20571615ec2 = C20571615ec.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("report fail: ");
                sbLIZ2.append(outreachReportResponse.statusMsg);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c20571615ec2.getClass();
                C20571615ec.LIZ(strLIZIZ2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZIZ("report exception: e");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OutreachReportManager@dee1.reportInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
