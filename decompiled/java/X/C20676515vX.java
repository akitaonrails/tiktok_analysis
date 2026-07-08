package X;

import com.ss.android.ugc.aweme.report.OutreachFlowInfo;
import com.ss.android.ugc.aweme.report.ReportResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15vX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.outreach.dispersion.report.OutreachReportRequestManager$reportOutreach$3$response$1", f = "IOutreachReportAPI.kt", l = {85}, m = "invokeSuspend")
public final class C20676515vX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ReportResponse>, Object> {
    public int LL;
    public final /* synthetic */ OutreachFlowInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20676515vX(OutreachFlowInfo outreachFlowInfo, InterfaceC1364105Vn<? super C20676515vX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = outreachFlowInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20676515vX(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OutreachReportRequestManager@86e3.reportOutreach$3$response$1");
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
            InterfaceC20676615vY interfaceC20676615vY = C20676315vV.LIZ;
            InterfaceC20676615vY interfaceC20676615vY2 = C20676315vV.LIZ;
            OutreachFlowInfo outreachFlowInfo = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC20676615vY2.LIZ(outreachFlowInfo, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OutreachReportRequestManager@86e3.reportOutreach$3$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OutreachReportRequestManager@86e3.reportOutreach$3$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ReportResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
