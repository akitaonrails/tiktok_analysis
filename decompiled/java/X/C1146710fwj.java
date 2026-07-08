package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1146710fwj extends C2217421BqW implements Function0<Unit> {
    public C1146710fwj(Object obj) {
        super(0, obj, GiftAnchorPanelGiftPageCenterAssemCompose.class, "unregisterJsEventSubscriber", "unregisterJsEventSubscriber()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftAnchorPanelGiftPageCenterAssemCompose giftAnchorPanelGiftPageCenterAssemCompose = (GiftAnchorPanelGiftPageCenterAssemCompose) this.receiver;
        giftAnchorPanelGiftPageCenterAssemCompose.getClass();
        C1548820qPI.LJIIIIZZ("gift_clicked_by_creator", giftAnchorPanelGiftPageCenterAssemCompose);
        C1548820qPI.LJIIIIZZ("creator_banner_loaded", giftAnchorPanelGiftPageCenterAssemCompose);
        C1548820qPI.LJIIIIZZ("live_update_creator_gift_panel_item", giftAnchorPanelGiftPageCenterAssemCompose);
        return Unit.LIZ;
    }
}
