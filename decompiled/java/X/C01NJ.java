package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01NJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.utils.SearchAutoplayMonitor$Tracker$reportSoundLeak$1", f = "SearchAutoplayMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01NJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C01NJ(InterfaceC1364105Vn<? super C01NJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01NJ c01nj = new C01NJ(interfaceC1364105Vn);
        c01nj.LL = obj;
        return c01nj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAutoplayMonitor$Tracker@ff58.reportSoundLeak$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C20684815ws.onEventV3("search_autoplay_monitor_sound_leak");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAutoplayMonitor$Tracker@ff58.reportSoundLeak$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
