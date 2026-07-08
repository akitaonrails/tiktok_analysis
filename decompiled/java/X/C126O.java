package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.story.model.streaks.StoryStreakEnterEditParam;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.126O, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.streaks.util.StoryStreaksPerfMonitor$enterEdit$1", f = "StoryStreaksPerfMonitor.kt", l = {}, m = "invokeSuspend")
public final class C126O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ StoryStreakEnterEditParam LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126O(String str, StoryStreakEnterEditParam storyStreakEnterEditParam, InterfaceC1364105Vn<? super C126O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = storyStreakEnterEditParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C126O(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("StoryStreaksPerfMonitor@f1b8.enterEdit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryStreakEnterEditParam storyStreakEnterEditParam = this.LLILLJJLI;
        String str = this.LL;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(1, "success");
            c2344009Gk.LIZJ(C126M.LJIIL, "hit_preload");
            C126M.LIZ(c2344009Gk, storyStreakEnterEditParam, str);
            C20684815ws.LJIILLIIL("story_streaks_perf_before_enter_edit", c2344009Gk.LIZ);
            C126M.LJIILIIL = 0L;
            C126M.LIZ = 0L;
            C126M.LIZIZ = 0L;
            C126M.LIZLLL = 0L;
            C126M.LIZJ = 0L;
            C126M.LJ = 0L;
            C126M.LJII = 0L;
            C126M.LJIIIZ = 0L;
            C126M.LJIIIIZZ = 0L;
            C126M.LJI = 0L;
            C126M.LJIIJ = 0L;
            C126M.LJIIL = 0;
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            HashMap map = new HashMap();
            map.put("success", "1");
            Npth.reportBizException("story_x_streaks", thM5exceptionOrNullimpl, "before edit metrics report error", (Map<String, String>) map, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryStreaksPerfMonitor@f1b8.enterEdit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
