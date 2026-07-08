package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem$startAvgReporter$1$3$2", f = "MinisFpsMonitorAssem.kt", l = {221}, m = "invokeSuspend")
public final class C0NQ3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public MinisFpsMonitorAssem LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public final /* synthetic */ MinisFpsMonitorAssem LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQ3(MinisFpsMonitorAssem minisFpsMonitorAssem, boolean z, InterfaceC1364105Vn<? super C0NQ3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = minisFpsMonitorAssem;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQ3(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MinisFpsMonitorAssem minisFpsMonitorAssem;
        C1DEV c1dev;
        boolean z;
        C1C7U.LIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$3$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                z = this.LLILLL;
                minisFpsMonitorAssem = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            minisFpsMonitorAssem = this.LLILZIL;
            c1dev = minisFpsMonitorAssem.LLILZLL;
            z = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = minisFpsMonitorAssem;
            this.LLILLL = z;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$3$2");
                return objLJFF;
            }
        }
        try {
            minisFpsMonitorAssem.ho(z);
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAvgReporter$1$3$2");
            return unit;
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
