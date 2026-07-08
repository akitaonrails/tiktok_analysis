package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.util.RunCatchEtReporter$reportException$2$1", f = "RunCatchEtReporter.kt", l = {}, m = "invokeSuspend")
public final class C337001Sm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337001Sm(Throwable th, String str, InterfaceC1364105Vn<? super C337001Sm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = th;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C337001Sm c337001Sm = new C337001Sm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c337001Sm.LL = obj;
        return c337001Sm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RunCatchEtReporter@7cb7.reportException$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Throwable th = this.LLILLJJLI;
        String str = this.LLILLL;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("error_type", th.getClass().getName());
            String message = th.getMessage();
            String name = "";
            if (message == null) {
                message = "";
            }
            c2344009Gk.LJFF("error_msg", message);
            c2344009Gk.LJFF("stack_top", str);
            Throwable cause = th.getCause();
            if (cause != null) {
                name = cause.getClass().getName();
            }
            c2344009Gk.LJFF("cause_type", name);
            C20684815ws.LJIILLIIL("creation_aigc_workflow_run_catch_exception", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RunCatchEtReporter@7cb7.reportException$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
