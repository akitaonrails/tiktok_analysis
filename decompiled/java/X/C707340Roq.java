package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeAdapterInfoAbility;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Roq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger$NewPaywallCellOverlayComponent$seekToStartOfPreviewV2$1$1", f = "PaywallComponentTrigger.kt", l = {206}, m = "invokeSuspend")
public final class C707340Roq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PaywallComponentTrigger.NewPaywallCellOverlayComponent LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C707340Roq(PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent, float f, InterfaceC1364105Vn<? super C707340Roq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = newPaywallCellOverlayComponent;
        this.LLILZ = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C707340Roq c707340Roq = new C707340Roq(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c707340Roq.LLILLJJLI = obj;
        return c707340Roq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C1C7U.LIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.seekToStartOfPreviewV2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityEp = this.LLILLL.Ep();
            if (iFeedPanelPlatformAbilityEp != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbilityEp.x32()) != null) {
                iPlayerComponentAbilityX32.dO0(this.LLILZ);
                iPlayerComponentAbilityX32.tryResumePlay();
            } else {
                PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent = this.LLILLL;
                float f = this.LLILZ;
                LandscapeAdapterInfoAbility landscapeAdapterInfoAbility = (LandscapeAdapterInfoAbility) newPaywallCellOverlayComponent.LLJLLIL.getValue();
                if (landscapeAdapterInfoAbility != null) {
                    landscapeAdapterInfoAbility.LJIILL(f);
                }
                LandscapeAdapterInfoAbility landscapeAdapterInfoAbility2 = (LandscapeAdapterInfoAbility) newPaywallCellOverlayComponent.LLJLLIL.getValue();
                if (landscapeAdapterInfoAbility2 != null) {
                    landscapeAdapterInfoAbility2.tryResumePlay();
                }
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.seekToStartOfPreviewV2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.seekToStartOfPreviewV2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
