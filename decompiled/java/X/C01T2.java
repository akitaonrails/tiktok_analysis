package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01T2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.v2.StoryViewerListPerf$report$1", f = "StoryViewerListPerf.kt", l = {}, m = "invokeSuspend")
public final class C01T2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01T2(long j, InterfaceC1364105Vn<? super C01T2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01T2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryViewerListPerf@e540.report$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LL;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", C01T3.LIZIZ);
            c2344009Gk.LJIIIIZZ("enter_method", C01T3.LIZJ);
            c2344009Gk.LIZLLL(j, "duration_all");
            c2344009Gk.LJIIIIZZ("version", "1");
            C20684815ws.LJIILLIIL("story_viewer_list_monitor", c2344009Gk.LIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        C01T3.LIZ = 0L;
        C01T3.LIZIZ = "";
        C01T3.LIZJ = "";
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryViewerListPerf@e540.report$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
