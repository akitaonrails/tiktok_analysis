package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01SS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.metrics.SearchPerfMob$postCostTime$1", f = "SearchPerfMob.kt", l = {}, m = "invokeSuspend")
public final class C01SS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01SS(int i, long j, int i2, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01SS(this.LLILLL, this.LL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchPerfMob@630e.postCostTime$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("cost", String.valueOf(this.LL));
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, this.LLILLJJLI);
        c2344009Gk.LIZJ(this.LLILLL, "is_recom_end");
        c2344009Gk.LIZJ(this.LLILZ, "is_recom_update_end");
        C20684815ws.LJIILLIIL("search_perf_cost", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPerfMob@630e.postCostTime$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
