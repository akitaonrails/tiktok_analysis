package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.ss.android.ugc.aweme.network.model.AuditBatchAckReqBody;
import com.ss.android.ugc.aweme.network.model.AuditBatchAckResponse;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS116S0400000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0hp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel$auditSingleItem$1", f = "AuditRequestListViewModel.kt", l = {301}, m = "invokeSuspend")
public final class C1218870hp7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AuditRequestListViewModel LLILLJJLI;
    public final /* synthetic */ EnumC1217990hnh LLILLL;
    public final /* synthetic */ C1218000hni LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218870hp7(AuditRequestListViewModel auditRequestListViewModel, EnumC1217990hnh enumC1217990hnh, C1218000hni c1218000hni, Context context, InterfaceC1364105Vn<? super C1218870hp7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = auditRequestListViewModel;
        this.LLILLL = enumC1217990hnh;
        this.LLILZ = c1218000hni;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1218870hp7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZLLL = obj;
        C1C7U.LIZ("AuditRequestListViewModel@a39e.auditSingleItem$1");
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
                AuditBatchAckReqBody auditBatchAckReqBody = new AuditBatchAckReqBody(false, this.LLILLJJLI.zQ2(), this.LLILLL.getValue(), Collections.singletonList(C2286608xc.LJFF(this.LLILZ.LL.LIZLLL)), null, 16, null);
                this.LL = 1;
                objLIZLLL = c2258521Dac.LIZLLL(auditBatchAckReqBody, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("AuditRequestListViewModel@a39e.auditSingleItem$1");
                    return objLJFF;
                }
            }
            AuditRequestListViewModel auditRequestListViewModel = this.LLILLJJLI;
            Context context = this.LLILZIL;
            EnumC1217990hnh enumC1217990hnh = this.LLILLL;
            auditRequestListViewModel.getClass();
            auditRequestListViewModel.withState(new AwS116S0400000_19((AuditBatchAckResponse) objLIZLLL, auditRequestListViewModel, context, enumC1217990hnh, 7));
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.setState(new AwS598S0100000_19(e, 135));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LLILLJJLI.setState(new AwS598S0100000_19(this.LLILZIL, 136));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AuditRequestListViewModel@a39e.auditSingleItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
