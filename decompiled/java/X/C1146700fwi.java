package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1146700fwi extends C2217421BqW implements Function0<Unit> {
    public C1146700fwi(Object obj) {
        super(0, obj, GiftAnchorPanelGiftPageCenterAssemCompose.class, "registerJsEventSubscriber", "registerJsEventSubscriber()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GiftAnchorPanelGiftPageCenterAssemCompose giftAnchorPanelGiftPageCenterAssemCompose = (GiftAnchorPanelGiftPageCenterAssemCompose) this.receiver;
        giftAnchorPanelGiftPageCenterAssemCompose.getClass();
        C1548820qPI.LIZLLL("gift_clicked_by_creator", giftAnchorPanelGiftPageCenterAssemCompose);
        C1548820qPI.LIZLLL("creator_banner_loaded", giftAnchorPanelGiftPageCenterAssemCompose);
        C1548820qPI.LIZLLL("live_update_creator_gift_panel_item", giftAnchorPanelGiftPageCenterAssemCompose);
        return Unit.LIZ;
    }
}
