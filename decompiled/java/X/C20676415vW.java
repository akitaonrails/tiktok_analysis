package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.report.OutreachFlowInfo;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.ReportResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.outreach.dispersion.report.OutreachReportRequestManager$reportOutreach$3", f = "IOutreachReportAPI.kt", l = {85}, m = "invokeSuspend")
public final class C20676415vW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<OutreachFlowReportItem> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20676415vW(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = function0;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20676415vW(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachReportRequestManager@86e3.reportOutreach$3");
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
                InterfaceC20676615vY interfaceC20676615vY = C20676315vV.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Starting outreach report with ");
                sbLIZ.append(this.LLILLJJLI.size());
                sbLIZ.append(" items");
                C2188811AlT.LIZIZ(sbLIZ);
                OutreachFlowInfo outreachFlowInfo = new OutreachFlowInfo(this.LLILLJJLI);
                InterfaceC20676615vY.LIZ.getClass();
                long j = C20677015vc.LIZIZ;
                C20676515vX c20676515vX = new C20676515vX(outreachFlowInfo, null);
                this.LL = 1;
                obj = C099A.LIZIZ(j, c20676515vX, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OutreachReportRequestManager@86e3.reportOutreach$3");
                    return objLJFF;
                }
            }
            ReportResponse reportResponse = (ReportResponse) obj;
            Integer num = reportResponse.statusCode;
            if (num != null && num.intValue() == 0) {
                this.LLILLL.invoke();
                InterfaceC20676615vY interfaceC20676615vY2 = C20676315vV.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Outreach report successful with ");
                sbLIZ2.append(this.LLILLJJLI.size());
                sbLIZ2.append(" items");
                C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("statusCode is not 200: ");
                sbLIZ3.append(reportResponse.statusCode);
                Throwable th = new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                this.LLILZ.invoke(th);
                InterfaceC20676615vY interfaceC20676615vY3 = C20676315vV.LIZ;
                th.getMessage();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC20676615vY interfaceC20676615vY4 = C20676315vV.LIZ;
            Function1<Throwable, Unit> function1 = this.LLILZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("General error: ");
            sbLIZ4.append(e.getMessage());
            Throwable th2 = new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
            function1.invoke(th2);
            th2.getMessage();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OutreachReportRequestManager@86e3.reportOutreach$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
