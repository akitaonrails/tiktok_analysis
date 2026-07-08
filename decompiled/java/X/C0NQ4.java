package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem$onPageRelaunch$1", f = "MinisFpsMonitorAssem.kt", l = {221}, m = "invokeSuspend")
public final class C0NQ4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public MinisFpsMonitorAssem LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ MinisFpsMonitorAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQ4(MinisFpsMonitorAssem minisFpsMonitorAssem, InterfaceC1364105Vn<? super C0NQ4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = minisFpsMonitorAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQ4(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MinisFpsMonitorAssem minisFpsMonitorAssem;
        C1DEV c1dev;
        C1C7U.LIZ("MinisFpsMonitorAssem@393b.onPageRelaunch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                minisFpsMonitorAssem = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            minisFpsMonitorAssem = this.LLILZ;
            c1dev = minisFpsMonitorAssem.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = minisFpsMonitorAssem;
            this.LLILLL = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.onPageRelaunch$1");
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
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MinisFpsMonitorAssem@393b.onPageRelaunch$1");
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
