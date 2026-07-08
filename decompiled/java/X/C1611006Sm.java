package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.ScrollIdleListener$onScrollStateChanged$1", f = "ScrollIdleListener.kt", l = {32}, m = "invokeSuspend")
public final class C1611006Sm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1611106Sn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611006Sm(C1611106Sn c1611106Sn, InterfaceC1364105Vn<? super C1611006Sm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1611106Sn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1611006Sm c1611006Sm = new C1611006Sm(this.LLILLL, interfaceC1364105Vn);
        c1611006Sm.LLILLJJLI = obj;
        return c1611006Sm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("ScrollIdleListener@4528.onScrollStateChanged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            long j = this.LLILLL.LL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ScrollIdleListener@4528.onScrollStateChanged$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - C1611306Sp.LIZ >= 10000) {
                Runtime runtime = Runtime.getRuntime();
                if ((runtime.totalMemory() - runtime.freeMemory()) / runtime.maxMemory() >= 0.5f) {
                    C1611306Sp.LIZ = jUptimeMillis;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1610906Sl(null), 3);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScrollIdleListener@4528.onScrollStateChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
