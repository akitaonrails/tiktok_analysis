package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1146600fwY extends C2217421BqW implements Function1<AbstractC1146640fwc, Unit> {
    public C1146600fwY(Object obj) {
        super(1, obj, GiftAnchorPanelGiftPageCenterViewModel.class, "processEvent", "processEvent(Lcom/bytedance/android/livesdk/gift/base/platform/business/panel/anchor/center/gift/center/GiftPageEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1146640fwc abstractC1146640fwc) {
        AbstractC1146640fwc abstractC1146640fwc2 = abstractC1146640fwc;
        GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel = (GiftAnchorPanelGiftPageCenterViewModel) this.receiver;
        giftAnchorPanelGiftPageCenterViewModel.getClass();
        if (abstractC1146640fwc2 instanceof C1146630fwb) {
            boolean z = ((C1146630fwb) abstractC1146640fwc2).LIZ;
            if (Intrinsics.LJFF(giftAnchorPanelGiftPageCenterViewModel.getState().LL, C491101vh.LIZ)) {
                giftAnchorPanelGiftPageCenterViewModel.LLILZLL = z;
                giftAnchorPanelGiftPageCenterViewModel.wQ2();
            }
        } else if (abstractC1146640fwc2 instanceof C1146650fwd) {
            giftAnchorPanelGiftPageCenterViewModel.wQ2();
        } else if (abstractC1146640fwc2 instanceof C1146660fwe) {
            giftAnchorPanelGiftPageCenterViewModel.FQ2();
        } else if (abstractC1146640fwc2 instanceof C1146610fwZ) {
            giftAnchorPanelGiftPageCenterViewModel.AQ2(((C1146610fwZ) abstractC1146640fwc2).LIZ);
        } else if (abstractC1146640fwc2 instanceof C1146620fwa) {
            giftAnchorPanelGiftPageCenterViewModel.GQ2(((C1146620fwa) abstractC1146640fwc2).LIZ.LL, null);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }
}
