package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.edit.speed.StoryEditSpeedTestComponent$reportSpeedTestResultOnBackground$1", f = "StoryEditSpeedTestComponent.kt", l = {}, m = "invokeSuspend")
public final class C2164208ds extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ C2164308dt LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2164208ds(long j, String str, boolean z, boolean z2, boolean z3, C2164308dt c2164308dt, InterfaceC1364105Vn<? super C2164208ds> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = c2164308dt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2164208ds c2164208ds = new C2164208ds(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2164208ds.LL = obj;
        return c2164208ds;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C1C7U.LIZ("StoryEditSpeedTestComponent@4e64.reportSpeedTestResultOnBackground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LLILLJJLI;
        String str = this.LLILLL;
        boolean z = this.LLILZ;
        boolean z2 = this.LLILZIL;
        boolean z3 = this.LLILZLL;
        C2164308dt c2164308dt = this.LLIZ;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(j, "upload_probe_speed");
            c2344009Gk.LJIIIIZZ("speed_assign_timing", str);
            int i6 = 1;
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "speed_test_started");
            if (z2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_video_publish");
            if (z3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c2344009Gk.LIZJ(i3, "is_weak_network_exp_enable");
            if (c2164308dt.LIZ) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c2344009Gk.LIZJ(i4, "is_weak_network");
            if (c2164308dt.LIZIZ) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            c2344009Gk.LIZJ(i5, "is_speed_test_timeout");
            if (!c2164308dt.LIZJ) {
                i6 = 0;
            }
            c2344009Gk.LIZJ(i6, "is_ttnet_slow");
            c2344009Gk.LIZJ(c2164308dt.LIZLLL, "ttnet_nqe_level");
            c2344009Gk.LIZLLL(c2164308dt.LJI, "speed_test_elapsed_ms");
            C20684815ws.LJIILLIIL("story_edit_speed_test_result", c2344009Gk.LIZ);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryEditSpeedTestComponent@4e64.reportSpeedTestResultOnBackground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
