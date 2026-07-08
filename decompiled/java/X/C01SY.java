package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01SY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.NodesUnavailableEtReporter$report$1$1", f = "NodesUnavailableEtReporter.kt", l = {}, m = "invokeSuspend")
public final class C01SY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C01SZ LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;
    public final /* synthetic */ Set<String> LLILZ;
    public final /* synthetic */ Set<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01SY(C01SZ c01sz, Set<String> set, Set<String> set2, Set<String> set3, InterfaceC1364105Vn<? super C01SY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c01sz;
        this.LLILLL = set;
        this.LLILZ = set2;
        this.LLILZIL = set3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01SY c01sy = new C01SY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c01sy.LL = obj;
        return c01sy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NodesUnavailableEtReporter@2c0.report$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01SZ c01sz = this.LLILLJJLI;
        Set<String> set = this.LLILLL;
        Set<String> set2 = this.LLILZ;
        Set<String> set3 = this.LLILZIL;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c01sz.getClass();
            c2344009Gk.LJII(C01SZ.LIZ(set, set2, set3));
            C20684815ws.LJIILLIIL("creation_aigc_nodes_unavailable", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NodesUnavailableEtReporter@2c0.report$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
