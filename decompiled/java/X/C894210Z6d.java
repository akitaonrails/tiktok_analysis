package X;

import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.network.model.GetAuditListResponseBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS28S0001000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Z6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel$refreshAuditSize$1", f = "ManageGroupViewModel.kt", l = {234}, m = "invokeSuspend")
public final class C894210Z6d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ ManageGroupViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C894210Z6d(long j, ManageGroupViewModel manageGroupViewModel, InterfaceC1364105Vn<? super C894210Z6d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = manageGroupViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C894210Z6d(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("ManageGroupViewModel@c59c.refreshAuditSize$1");
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
            C0Z5O c0z5o = C0Z5O.LIZ;
            long j = this.LLILLJJLI;
            this.LL = 1;
            obj = c0z5o.LJ(1, j, 0L, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ManageGroupViewModel@c59c.refreshAuditSize$1");
                return objLJFF;
            }
        }
        GetAuditListResponseBody getAuditListResponseBody = (GetAuditListResponseBody) obj;
        if (getAuditListResponseBody != null) {
            numLJ = C2286608xc.LJ(getAuditListResponseBody.totalCount);
        } else {
            numLJ = null;
        }
        this.LLILLL.setState(new AwS28S0001000_14(C1527905yX.LIZ(numLJ), 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageGroupViewModel@c59c.refreshAuditSize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
