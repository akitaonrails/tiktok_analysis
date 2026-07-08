package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem$startAndResetReporter$1", f = "MinisFpsMonitorAssem.kt", l = {221}, m = "invokeSuspend")
public final class C0NQ5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public MinisFpsMonitorAssem LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ MinisFpsMonitorAssem LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQ5(MinisFpsMonitorAssem minisFpsMonitorAssem, int i, boolean z, InterfaceC1364105Vn<? super C0NQ5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = minisFpsMonitorAssem;
        this.LLIZLLLIL = i;
        this.LLJ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NQ5 c0nq5 = new C0NQ5(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0nq5.LLILZLL = obj;
        return c0nq5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        MinisFpsMonitorAssem minisFpsMonitorAssem;
        C1DEV c1dev;
        int i;
        boolean z;
        C1C7U.LIZ("MinisFpsMonitorAssem@393b.startAndResetReporter$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if (i2 == 1) {
                z = this.LLILZ;
                i = this.LLILLL;
                minisFpsMonitorAssem = this.LLILLJJLI;
                c1dev = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
            minisFpsMonitorAssem = this.LLIZ;
            c1dev = minisFpsMonitorAssem.LLILZLL;
            i = this.LLIZLLLIL;
            z = this.LLJ;
            this.LLILZLL = interfaceC497601wk;
            this.LL = c1dev;
            this.LLILLJJLI = minisFpsMonitorAssem;
            this.LLILLL = i;
            this.LLILZ = z;
            this.LLILZIL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAndResetReporter$1");
                return objLJFF;
            }
        }
        try {
            AnonymousClass0956 anonymousClass0956 = minisFpsMonitorAssem.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            minisFpsMonitorAssem.LLILZIL = null;
            minisFpsMonitorAssem.fo().clear();
            if (minisFpsMonitorAssem.LL && minisFpsMonitorAssem.LLIZ) {
                minisFpsMonitorAssem.LLILZIL = MinisFpsMonitorAssem.lo(minisFpsMonitorAssem, interfaceC497601wk, i, z);
            }
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.startAndResetReporter$1");
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
