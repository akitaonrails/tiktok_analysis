package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.preload.ExplorePerfPreloadInit$backToFrontPreloadRunnable$1$1", f = "ExplorePerfPreloadInit.kt", l = {}, m = "invokeSuspend")
public final class C05CZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05CZ(InterfaceC1364105Vn<? super C05CZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExplorePerfPreloadInit@1ace.backToFrontPreloadRunnable$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C15T0.LJFF();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "ExploreBackToFrontPreload_media_fail");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExplorePerfPreloadInit@1ace.backToFrontPreloadRunnable$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05CZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
