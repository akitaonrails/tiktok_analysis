package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceEtReporter$reportEt$1$1", f = "PersistenceEtReporter.kt", l = {}, m = "invokeSuspend")
public final class C336001Sc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Throwable LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C336001Sc(String str, long j, boolean z, Throwable th, InterfaceC1364105Vn<? super C336001Sc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = th;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C336001Sc c336001Sc = new C336001Sc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c336001Sc.LL = obj;
        return c336001Sc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("PersistenceEtReporter@be4a.reportEt$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        long j = this.LLILLL;
        boolean z = this.LLILZ;
        Throwable th = this.LLILZIL;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("api_name", str);
            c2344009Gk.LIZLLL(j, "duration");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_success");
            if (th != null) {
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                c2344009Gk.LJFF("error_msg", message);
            }
            C20684815ws.LJIILLIIL("creation_aigc_workflow_persistence_api", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PersistenceEtReporter@be4a.reportEt$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
