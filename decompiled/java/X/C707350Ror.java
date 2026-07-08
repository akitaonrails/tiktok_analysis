package X;

import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ror, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger$NewPaywallCellOverlayComponent$onViewCreated$stateFlowCollector$1", f = "PaywallComponentTrigger.kt", l = {}, m = "invokeSuspend")
public final class C707350Ror extends C09AX implements Function2<Set<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaywallComponentTrigger.NewPaywallCellOverlayComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C707350Ror(PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent, InterfaceC1364105Vn<? super C707350Ror> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = newPaywallCellOverlayComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C707350Ror(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.onViewCreated$stateFlowCollector$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Ip(false);
        this.LL.Gp();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.onViewCreated$stateFlowCollector$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Set<? extends String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(set, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
