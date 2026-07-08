package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05FM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.ui.helper.StoryDetailFragmentExtKt$enableStoryDetailFlattenFragmentHierarchy$1$1$1", f = "StoryDetailFragmentExt.kt", l = {}, m = "invokeSuspend")
public final class C05FM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05FM(C19EG c19eg, InterfaceC1364105Vn<? super C05FM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05FM c05fm = new C05FM(this.LLILLJJLI, interfaceC1364105Vn);
        c05fm.LL = obj;
        return c05fm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryDetailFragmentExtKt@9b0f.enableStoryDetailFlattenFragmentHierarchy$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19EG c19eg = this.LLILLJJLI;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("uri", String.valueOf(c19eg.getIntent().getData()));
            C20684815ws.LJIILLIIL("story_special_route_monitor", c2344009Gk.LIZ);
            C1AF0.LIZJ("story_special_route_monitor");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryDetailFragmentExtKt@9b0f.enableStoryDetailFlattenFragmentHierarchy$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
