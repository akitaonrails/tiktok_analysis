package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0m7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.DanUIPerfCollector$onDrawCostCallback$1$1", f = "DanUIPerfCollector.kt", l = {}, m = "invokeSuspend")
public final class C1383890m7H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1383900m7I LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383890m7H(C1383900m7I c1383900m7I, InterfaceC1364105Vn<? super C1383890m7H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1383900m7I;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1383890m7H(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("DanUIPerfCollector@1f73.onDrawCostCallback$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("enter_from", this.LL.LIZ);
        Aweme aweme = this.LL.LJIIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2241008qG.LIZ.put("group_id", aid);
        c2241008qG.LIZ.put("draw_count", C2286608xc.LJ(this.LL.LIZIZ));
        c2241008qG.LIZ.put("draw_cost", C2286608xc.LIZLLL(this.LL.LJFF));
        c2241008qG.LIZ.put("compute_count", C2286608xc.LJ(this.LL.LIZLLL));
        c2241008qG.LIZ.put("compute_cost", C2286608xc.LIZLLL(this.LL.LIZJ));
        c2241008qG.LIZ.put("frame_time", this.LL.LJIILJJIL);
        c2241008qG.LIZ.put("dps", C2286608xc.LIZLLL(this.LL.LJ));
        c2241008qG.LIZ.put("random", this.LL.LJIIZILJ);
        C20684815ws.LJIJ("danmaku_ui_performance_random", c2241008qG.LJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DanUIPerfCollector@1f73.onDrawCostCallback$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
