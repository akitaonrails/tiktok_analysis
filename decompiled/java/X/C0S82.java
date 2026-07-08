package X;

import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S82, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent$onBind$stateFlowCollector$1", f = "StoryPaywallComponentTrigger.kt", l = {}, m = "invokeSuspend")
public final class C0S82 extends C09AX implements Function2<Set<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S82(StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent, InterfaceC1364105Vn<? super C0S82> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyPaywallCellOverlayComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S82(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.onBind$stateFlowCollector$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent = this.LL;
        storyPaywallCellOverlayComponent.LLLI = true;
        storyPaywallCellOverlayComponent.Fp();
        this.LL.Gp(false);
        this.LL.Ep("subsSuccessStateFlow");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.onBind$stateFlowCollector$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Set<? extends String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(set, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
