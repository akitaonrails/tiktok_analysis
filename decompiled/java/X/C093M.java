package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.093M, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.EffectPrefetcherComponentImpl$pause$1", f = "EffectPrefetcherComponent.kt", l = {298}, m = "invokeSuspend")
public final class C093M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public C093Q LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C093Q LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C093M(C093Q c093q, InterfaceC1364105Vn<? super C093M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c093q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C093M(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C093Q c093q;
        InterfaceC383701eN interfaceC383701eN;
        C1C7U.LIZ("EffectPrefetcherComponentImpl@551d.pause$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c093q = this.LLILLJJLI;
                interfaceC383701eN = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c093q = this.LLILZ;
            interfaceC383701eN = c093q.LLILZIL;
            this.LL = interfaceC383701eN;
            this.LLILLJJLI = c093q;
            this.LLILLL = 1;
            if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("EffectPrefetcherComponentImpl@551d.pause$1");
                return objLJFF;
            }
        }
        try {
            C201955140j.LJIILL(C1632470saD.LIZIZ, "EffectPrefetcherComponent", "pausing the queue cancelling drainer");
            C09AE c09ae = c093q.LLILZLL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            c093q.LLILZLL = null;
            interfaceC383701eN.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EffectPrefetcherComponentImpl@551d.pause$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC383701eN.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
