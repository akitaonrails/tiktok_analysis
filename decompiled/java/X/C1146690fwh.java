package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.IGiftAnchorPanelGiftPageBottomAbility;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemCompose;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1146690fwh extends C2217421BqW implements Function1<C1146350fw9, Unit> {
    public C1146690fwh(GiftAnchorPanelGiftPageCenterAssemCompose giftAnchorPanelGiftPageCenterAssemCompose) {
        super(1, giftAnchorPanelGiftPageCenterAssemCompose, GiftAnchorPanelGiftPageCenterAssemCompose.class, "showSmallCard", "showSmallCard(Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/gift/center/list/AnchorGiftUiItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1146350fw9 c1146350fw9) {
        C1146350fw9 c1146350fw92 = c1146350fw9;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) this.receiver;
        abstractC738140SxQ.getClass();
        IGiftAnchorPanelGiftPageBottomAbility iGiftAnchorPanelGiftPageBottomAbility = (IGiftAnchorPanelGiftPageBottomAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IGiftAnchorPanelGiftPageBottomAbility.class, null);
        if (iGiftAnchorPanelGiftPageBottomAbility != null) {
            iGiftAnchorPanelGiftPageBottomAbility.qC(c1146350fw92);
        }
        return Unit.LIZ;
    }
}
