package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.LoopingNetworkRequestRetryScheduler$pause$2", f = "NetworkRequestRetryScheduler.kt", l = {613}, m = "invokeSuspend")
public final class C864010Xux extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C863980Xuu LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C863980Xuu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864010Xux(C863980Xuu c863980Xuu, InterfaceC1364105Vn<? super C864010Xux> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c863980Xuu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864010Xux(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C863980Xuu c863980Xuu;
        C1DEV c1dev;
        C1C7U.LIZ("LoopingNetworkRequestRetryScheduler@4605.pause$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
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
                    c863980Xuu2.LJIIIIZZ("pause() called but retry is disabled");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.pause$2");
                    return unit;
                }
                int i2 = C864050Xv1.LIZ[c863980Xuu2.LJIIIIZZ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.LLILZ.LJIIIIZZ("pause() called but scheduler is already stopped");
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.pause$2");
                        return unit2;
                    }
                    throw new C1954807lC();
                }
                this.LLILZ.LJIIIZ("Pausing request processing");
                c863980Xuu = this.LLILZ;
                c1dev = c863980Xuu.LJII;
                this.LL = c1dev;
                this.LLILLJJLI = c863980Xuu;
                this.LLILLL = 1;
                if (c1dev.LIZLLL(null, this) == objLJFF) {
                    C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.pause$2");
                    return objLJFF;
                }
            }
            c863980Xuu.LJIIIIZZ = EnumC864060Xv2.STOPPED;
            c1dev.LIZIZ(null);
            AnonymousClass0956 anonymousClass0956 = this.LLILZ.LJIIJ;
            if (anonymousClass0956 != null) {
                C23118094a.LIZIZ("Pause requested", null, anonymousClass0956);
            }
            this.LLILZ.LJIIJ = null;
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("LoopingNetworkRequestRetryScheduler@4605.pause$2");
            return unit22;
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
