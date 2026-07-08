package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.network.model.AuditBatchAckReqBody;
import com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS116S0400000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel$auditBatchItems$1$1", f = "AuditRequestListViewModel.kt", l = {361}, m = "invokeSuspend")
public final class C1218860hp6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1218060hno LLILLJJLI;
    public final /* synthetic */ AuditRequestListViewModel LLILLL;
    public final /* synthetic */ EnumC1217990hnh LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218860hp6(C1218060hno c1218060hno, AuditRequestListViewModel auditRequestListViewModel, EnumC1217990hnh enumC1217990hnh, Context context, InterfaceC1364105Vn<? super C1218860hp6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1218060hno;
        this.LLILLL = auditRequestListViewModel;
        this.LLILZ = enumC1217990hnh;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1218860hp6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZLLL = obj;
        C1C7U.LIZ("AuditRequestListViewModel@a39e.auditBatchItems$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                C2258521Dac c2258521Dac = C2258521Dac.LIZ;
                AuditBatchAckReqBody auditBatchAckReqBody = new AuditBatchAckReqBody(this.LLILLJJLI.LLILZ, this.LLILLL.zQ2(), this.LLILZ.getValue(), this.LLILLJJLI.LLILZIL, null, 16, null);
                this.LL = 1;
                objLIZLLL = c2258521Dac.LIZLLL(auditBatchAckReqBody, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("AuditRequestListViewModel@a39e.auditBatchItems$1$1");
                    return objLJFF;
                }
            }
            AuditRequestListViewModel auditRequestListViewModel = this.LLILLL;
            Context context = this.LLILZIL;
            EnumC1217990hnh enumC1217990hnh = this.LLILZ;
            auditRequestListViewModel.getClass();
            auditRequestListViewModel.withState(new AwS116S0400000_19((AuditBatchAckResponse) objLIZLLL, auditRequestListViewModel, context, enumC1217990hnh, 7));
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("batch audit failed ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLL.setState(new AwS598S0100000_19(e, 138));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILLL.setState(new AwS598S0100000_19(this.LLILZIL, 139));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("batch audit failed ");
            sbLIZ2.append(e2);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuditRequestListViewModel@a39e.auditBatchItems$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
