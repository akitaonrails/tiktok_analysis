package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.preload.prewarm.IABPreWarmClassTask$doPreWarm$1", f = "IABPreWarmClassTask.kt", l = {}, m = "invokeSuspend")
public final class C05QL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1002240cBi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05QL(C1002240cBi c1002240cBi, InterfaceC1364105Vn<? super C05QL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1002240cBi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QL(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IABPreWarmClassTask@7155.doPreWarm$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Application applicationLIZ = C1BWL.LIZ();
            if (!C202079145d.LIZIZ()) {
                C202079145d.LIZJ(applicationLIZ);
            }
            C202079145d.LIZ("snapboost_list_m10n.txt").LIZIZ();
            getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IABPreWarmClassTask@7155.doPreWarm$1");
        return unit;
    }
}
