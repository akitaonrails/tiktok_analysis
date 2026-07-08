package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01SP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.streaks.util.StoryStreaksEffectPerfMonitor$logFetchEffectPanelResult$1", f = "StoryStreaksEffectPerfMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01SP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01SP(int i, long j, int i2, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        int i = this.LL;
        String str = this.LLILLJJLI;
        return new C01SP(i, this.LLILZ, this.LLILLL, str, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryStreaksEffectPerfMonitor@4457.logFetchEffectPanelResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        String str = this.LLILLJJLI;
        int i2 = this.LLILLL;
        long j = this.LLILZ;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "success");
            c2344009Gk.LJIIIIZZ("log_id", str);
            c2344009Gk.LJIIIIZZ("error_code", String.valueOf(i2));
            c2344009Gk.LJIIIIZZ("duration", String.valueOf(j));
            C20684815ws.LJIILLIIL("story_streaks_perf_fetch_effect_panel", c2344009Gk.LIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryStreaksEffectPerfMonitor@4457.logFetchEffectPanelResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
