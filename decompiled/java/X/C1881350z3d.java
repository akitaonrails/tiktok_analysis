package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLiveESportsXTabHighlightsDSLSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.esports.ESportsMixPageHost$onRequestDSL$2", f = "ESportsMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C1881350z3d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1881360z3e LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881350z3d(C1881360z3e c1881360z3e, InterfaceC1364105Vn<? super C1881350z3d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1881360z3e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1881350z3d(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ESportsMixPageHost@5a43.onRequestDSL$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIJ(C1881030z37.LIZIZ(new C1881820z4O(GameLiveESportsXTabHighlightsDSLSetting.INSTANCE.getDSL(), null)), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ESportsMixPageHost@5a43.onRequestDSL$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
