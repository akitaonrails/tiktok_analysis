package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Yf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.editcomponent.streak.util.StoryStreaksCreationPerf$finished$1", f = "StoryStreaksCreationPerf.kt", l = {}, m = "invokeSuspend")
public final class C351901Yf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C351901Yf(int i, long j, boolean z, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C351901Yf c351901Yf = new C351901Yf(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c351901Yf.LL = obj;
        return c351901Yf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int i;
        C1C7U.LIZ("StoryStreaksCreationPerf@3892.finished$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LLILLJJLI;
        boolean z = this.LLILLL;
        int i2 = this.LLILZ;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(j, "params_duration_all");
            c2344009Gk.LIZLLL(C352001Yg.LIZIZ, "params_duration_top_text");
            c2344009Gk.LIZLLL(C352001Yg.LIZJ, "params_duration_middle_fire");
            c2344009Gk.LIZLLL(C352001Yg.LIZLLL, "params_duration_bottom_info");
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "params_is_multi_poster");
            c2344009Gk.LIZJ(i2, "params_multi_poster_downgrade");
            C20684815ws.LJIILLIIL("story_streaks_perf_in_edit", c2344009Gk.LIZ);
            C352001Yg.LIZ = 0L;
            C352001Yg.LIZIZ = 0L;
            C352001Yg.LIZJ = 0L;
            C352001Yg.LIZLLL = 0L;
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJFF(thM5exceptionOrNullimpl, "story x streaks edit metrics report error");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryStreaksCreationPerf@3892.finished$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
