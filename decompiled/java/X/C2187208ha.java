package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.network.model.GetUnreadAuditCountResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupAuditListUtil$getUnreadAudit$1", f = "GroupAuditListUtil.kt", l = {125}, m = "invokeSuspend")
public final class C2187208ha extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Long> LLILLJJLI;
    public final /* synthetic */ Function1<GetUnreadAuditCountResponse, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187208ha(List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2187208ha(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupAuditListUtil@4954.getUnreadAudit$1");
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
                C2258521Dac c2258521Dac = C2258521Dac.LIZ;
                String strLJ = C051M.LJ(this.LLILLJJLI, false);
                this.LL = 1;
                obj = c2258521Dac.getUnreadAuditCount(strLJ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GroupAuditListUtil@4954.getUnreadAudit$1");
                    return objLJFF;
                }
            }
            GetUnreadAuditCountResponse getUnreadAuditCountResponse = (GetUnreadAuditCountResponse) obj;
            if (getUnreadAuditCountResponse.status_code != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request get audit list fail: ");
                sbLIZ.append(getUnreadAuditCountResponse.status_code);
                sbLIZ.append(", ");
                sbLIZ.append(getUnreadAuditCountResponse.status_msg);
                C2188811AlT.LIZIZ(sbLIZ);
            } else {
                this.LLILLL.invoke(getUnreadAuditCountResponse);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("request get audit list fail:");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupAuditListUtil@4954.getUnreadAudit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
