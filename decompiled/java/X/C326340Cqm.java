package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wave.graph.AIGCWorkflowManagementApiImpl$logApiSuspend$4", f = "AIGCWorkflowManagementApiImpl.kt", l = {}, m = "invokeSuspend")
public final class C326340Cqm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Object LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326340Cqm(String str, boolean z, long j, String str2, Object obj, InterfaceC1364105Vn<? super C326340Cqm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = str2;
        this.LLILZIL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326340Cqm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowManagementApiImpl@e5ae.logApiSuspend$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        long j = this.LLILLL;
        String str2 = this.LLILZ;
        Object obj2 = this.LLILZIL;
        c2344009Gk.LJFF("api_name", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        c2344009Gk.LIZLLL(j, "duration");
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJFF("client_task_id", str2);
        if (obj2 instanceof C326350Cqn) {
            C326350Cqn c326350Cqn = (C326350Cqn) obj2;
            c2344009Gk.LIZJ(c326350Cqn.LIZ, "error_code");
            c2344009Gk.LJFF("error_msg", c326350Cqn.LIZIZ);
        }
        C20684815ws.LJIILLIIL("creation_aigc_management_api", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCWorkflowManagementApiImpl@e5ae.logApiSuspend$4");
        return unit;
    }
}
