package X;

import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.experiment.performance.ExploreBackToFrontPreloadConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CWM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.assem.ExploreAssem$StartupStateListener$onStateChange$4", f = "ExploreAssem.kt", l = {}, m = "invokeSuspend")
public final class C0CWM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0CWM(InterfaceC1364105Vn<? super C0CWM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWM(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreAssem$StartupStateListener@9286.onStateChange$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((ExploreBackToFrontPreloadConfig) C0CWO.LIZIZ.getValue()).enable && !C296240BjK.LIZ() && C15T0.LIZJ.compareAndSet(false, true)) {
            try {
                C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0CWN
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("ExplorePerfPreloadInit@1ace.installBackToFrontPreloadListener$1");
                        if (!((Boolean) obj2).booleanValue() && !C15T0.LIZLLL.get() && !C296240BjK.LIZ()) {
                            C01GW c01gw = C15T0.LJ;
                            Handler handler = (Handler) c01gw.getValue();
                            RunnableC1313405Ca runnableC1313405Ca = C15T0.LJIIIIZZ;
                            handler.removeCallbacks(runnableC1313405Ca);
                            C786410Ut5.LJLIIL(800L, (Handler) c01gw.getValue(), runnableC1313405Ca);
                        }
                        C1C7U.LIZIZ("ExplorePerfPreloadInit@1ace.installBackToFrontPreloadListener$1");
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C15T0.LIZJ.set(false);
                C1AF0.LJFF(th, "ExploreBackToFrontPreload_install_fail");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreAssem$StartupStateListener@9286.onStateChange$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0CWM(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
