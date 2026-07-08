package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.network.LeadAdReporter;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.network.LeadAdReporter$report$1", f = "LeadAdReporter.kt", l = {52}, m = "invokeSuspend")
public final class C2381009Uq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LeadAdReporter.FormPageLeaveSignalReportRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2381009Uq(LeadAdReporter.FormPageLeaveSignalReportRequest formPageLeaveSignalReportRequest, InterfaceC1364105Vn<? super C2381009Uq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = formPageLeaveSignalReportRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2381009Uq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1494690ozz c1494690ozz;
        C1494430ozZ c1494430ozZ;
        Integer numLJ;
        String errorResponse;
        Integer numLJ2;
        Integer numLJ3;
        C1C7U.LIZ("LeadAdReporter@d230.report$1");
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
                InterfaceC2381109Ur.LIZ.getClass();
                C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://ad-instantpage-sg.tiktokv.com");
                c1499850p8JCreateBuilder.LIZJ(C2336109Dj.LJI());
                InterfaceC2381109Ur interfaceC2381109Ur = (InterfaceC2381109Ur) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC2381109Ur.class);
                LeadAdReporter.FormPageLeaveSignalReportRequest formPageLeaveSignalReportRequest = this.LLILLJJLI;
                this.LL = 1;
                obj = interfaceC2381109Ur.LIZ(formPageLeaveSignalReportRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LeadAdReporter@d230.report$1");
                    return objLJFF;
                }
            }
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse.status_code != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("leaveSignalReport failed: statusCode=");
                sbLIZ.append(baseResponse.status_code);
                sbLIZ.append(", statusMsg=");
                sbLIZ.append(baseResponse.status_msg);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str = null;
            if (e instanceof C1494690ozz) {
                c1494690ozz = (C1494690ozz) e;
            } else {
                c1494690ozz = null;
            }
            if (c1494690ozz == null) {
                Throwable cause = e.getCause();
                if (cause instanceof C1494690ozz) {
                    c1494690ozz = (C1494690ozz) cause;
                } else {
                    c1494690ozz = null;
                }
            }
            if (e instanceof C1494430ozZ) {
                c1494430ozZ = (C1494430ozZ) e;
            } else {
                c1494430ozZ = null;
            }
            if (c1494430ozZ == null) {
                Throwable cause2 = e.getCause();
                if (cause2 instanceof C1494430ozZ) {
                    c1494430ozZ = (C1494430ozZ) cause2;
                } else {
                    c1494430ozZ = null;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("leaveSignalReport exception: httpStatus=");
            if (c1494430ozZ != null) {
                numLJ = C2286608xc.LJ(c1494430ozZ.getStatusCode());
            } else {
                numLJ = null;
            }
            sbLIZ2.append(numLJ);
            sbLIZ2.append(", errorResponse=");
            if (c1494430ozZ != null) {
                errorResponse = c1494430ozZ.getErrorResponse();
            } else {
                errorResponse = null;
            }
            sbLIZ2.append(errorResponse);
            sbLIZ2.append(", cronetStatus=");
            if (c1494690ozz != null) {
                numLJ2 = C2286608xc.LJ(c1494690ozz.getStatusCode());
            } else {
                numLJ2 = null;
            }
            sbLIZ2.append(numLJ2);
            sbLIZ2.append(", cronetCode=");
            if (c1494690ozz != null) {
                numLJ3 = C2286608xc.LJ(c1494690ozz.getCronetInternalErrorCode());
            } else {
                numLJ3 = null;
            }
            sbLIZ2.append(numLJ3);
            sbLIZ2.append(", traceCode=");
            if (c1494690ozz != null) {
                str = c1494690ozz.traceCode;
            }
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LeadAdReporter@d230.report$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
