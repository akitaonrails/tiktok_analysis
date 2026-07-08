package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLiveESportsXTabDSLSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0z3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.esports.ESportsMixPageHost$onRequestDSL$3", f = "ESportsMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C1881390z3h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1881360z3e LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1881390z3h(C1881360z3e c1881360z3e, InterfaceC1364105Vn<? super C1881390z3h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1881360z3e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1881390z3h(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ESportsMixPageHost@5a43.onRequestDSL$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIJ(C1881030z37.LIZIZ(new C1881820z4O(u.LJJIFFI(u.LJJIFFI(GameLiveESportsXTabDSLSetting.INSTANCE.getDSL(), "__MIX_CARD_SCHEME_PLACEHOLDER__", this.LL.LLJILJILJ, false), "__MIX_CARD_SECONDARY_BACKGROUND_IMAGES_PLACEHOLDER__", C13LP.LJJLIIIJ(this.LL.LLJILLL, "\",\"", null, null, 0, null, null, 62), false), null)), false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ESportsMixPageHost@5a43.onRequestDSL$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
