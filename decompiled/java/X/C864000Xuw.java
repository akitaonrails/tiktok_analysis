package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler$cleanUp$2", f = "NetworkRequestRetryScheduler.kt", l = {613}, m = "invokeSuspend")
public final class C864000Xuw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C863980Xuu LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C863980Xuu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864000Xuw(C863980Xuu c863980Xuu, InterfaceC1364105Vn<? super C864000Xuw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c863980Xuu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864000Xuw(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C863980Xuu c863980Xuu;
        C1DEV c1dev;
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.cleanUp$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c863980Xuu = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C863980Xuu c863980Xuu2 = this.LLILZ;
            if (!c863980Xuu2.LJ.LIZ) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.cleanUp$2");
                return unit;
            }
            c863980Xuu2.LJIIIZ("Starting scheduler cleanup");
            this.LLILZ.LJIIIZ.clear();
            AnonymousClass0956 anonymousClass0956 = this.LLILZ.LJIIJ;
            if (anonymousClass0956 != null) {
                C23118094a.LIZIZ("Scheduler cleanup requested", null, anonymousClass0956);
            }
            C863980Xuu c863980Xuu3 = this.LLILZ;
            c863980Xuu3.LJIIJ = null;
            c863980Xuu3.LJFF.LIZJ.clear();
            ((LinkedHashMap) this.LLILZ.LIZJ.LIZIZ).clear();
            c863980Xuu = this.LLILZ;
            c1dev = c863980Xuu.LJII;
            this.LL = c1dev;
            this.LLILLJJLI = c863980Xuu;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.cleanUp$2");
                return objLJFF;
            }
        }
        try {
            c863980Xuu.LJIIIIZZ = EnumC864060Xv2.STOPPED;
            c1dev.LIZIZ(null);
            this.LLILZ.LJIIIZ("Scheduler cleanup completed");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.cleanUp$2");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
