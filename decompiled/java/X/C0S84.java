package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S84, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent$onViewCreated$9", f = "StoryPaywallComponentTrigger.kt", l = {}, m = "invokeSuspend")
public final class C0S84 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S84(StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent, InterfaceC1364105Vn<? super C0S84> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyPaywallCellOverlayComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S84(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.onViewCreated$9");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.getContext();
        if (context != null) {
            final StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent = this.LL;
            C0SHX.LIZ(context, null).LJIIIZ("comment_panel", new C0T3B() { // from class: X.0S83
                @Override // X.C0T3B
                public final void LIZ() {
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBp;
                    IPlayerComponentAbility iPlayerComponentAbilityX32;
                    StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent2 = storyPaywallCellOverlayComponent;
                    storyPaywallCellOverlayComponent2.LLLFZ = false;
                    storyPaywallCellOverlayComponent2.Gp(false);
                    View contentView = storyPaywallCellOverlayComponent.getContentView();
                    if (contentView != null) {
                        C786410Ut5.LJLLLLLL(0, contentView);
                    }
                    StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent3 = storyPaywallCellOverlayComponent;
                    if (storyPaywallCellOverlayComponent3.LLLI || (iFeedPanelPlatformAbilityBp = storyPaywallCellOverlayComponent3.Bp()) == null || (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityBp.x32()) == null) {
                        return;
                    }
                    iPlayerComponentAbilityX32.tryResumePlay();
                }

                @Override // X.C0T3B
                public final void LIZIZ() {
                    StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent2 = storyPaywallCellOverlayComponent;
                    storyPaywallCellOverlayComponent2.LLLFZ = true;
                    storyPaywallCellOverlayComponent2.Fp();
                    storyPaywallCellOverlayComponent.Gp(true);
                    View contentView = storyPaywallCellOverlayComponent.getContentView();
                    if (contentView != null) {
                        C786410Ut5.LJLLLLLL(8, contentView);
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.onViewCreated$9");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
