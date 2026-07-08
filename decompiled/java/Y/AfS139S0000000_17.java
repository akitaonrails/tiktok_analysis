package Y;

import X.C09JN;
import X.C1614260s6q;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.i18n.I18nDbManager;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;

/* JADX INFO: loaded from: classes18.dex */
public class AfS139S0000000_17 implements C09JN {
    public final int $t;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                I18nDbManager.lambda$clearTranslationDB$6(obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
        }
    }

    public AfS139S0000000_17(int i) {
        this.$t = i;
    }

    public AfS139S0000000_17(long j, int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        C1C7U.LIZ("LandscapeAudienceInteractionFragment@c63d.startHideViewTask$2L");
        C1C7U.LIZIZ("LandscapeAudienceInteractionFragment@c63d.startHideViewTask$2L");
    }

    public static final void accept$1(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        I18nDbManager.lambda$clearTranslationDB$7((Throwable) obj);
    }

    public static final void accept$3(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        C1C7U.LIZ("GiftEffectAckHelper@c5b6.reportStickerFirstFrame$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportStickerFirstFrame");
        sbLIZ.append(", fail, error = ");
        sbLIZ.append(obj);
        C20441214yg.LJ("GiftEffectAckHelper", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("GiftEffectAckHelper@c5b6.reportStickerFirstFrame$3");
    }

    public static final void accept$4(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        C1C7U.LIZ("GiftEffectAckHelper@c5b6.reportStickerInteractResult$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportStickerInteractResult");
        sbLIZ.append(", fail, error = ");
        sbLIZ.append(obj);
        C20441214yg.LJ("GiftEffectAckHelper", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("GiftEffectAckHelper@c5b6.reportStickerInteractResult$2");
    }

    public static final void accept$5(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        String str = LiveRoomUserInfoWidget.Q;
        C1C7U.LIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$2L");
        C1C7U.LIZIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$2L");
    }

    public static final void accept$6(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        String str = LiveRoomUserInfoWidget.Q;
        C1C7U.LIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$4L");
        C1C7U.LIZIZ("LiveRoomUserInfoWidget@476a.prepareGiftGalleryAnimation$4L");
    }

    public static final void accept$7(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        String str = LiveRoomUserInfoWidget.Q;
        C1C7U.LIZ("LiveRoomUserInfoWidget@476a.onLoad$6L");
        C1C7U.LIZIZ("LiveRoomUserInfoWidget@476a.onLoad$6L");
    }

    public static final void accept$8(AfS139S0000000_17 afS139S0000000_17, Object obj) {
        C1C7U.LIZ("MarketplacePaymentService@820f.pollPurchaseConfirmation$4");
        C1614260s6q.LJ.onNext(Boolean.FALSE);
        C1C7U.LIZIZ("MarketplacePaymentService@820f.pollPurchaseConfirmation$4");
    }
}
