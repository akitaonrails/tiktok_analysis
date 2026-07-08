package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C289401Ae {
    public static void LIZ(View view, C1324720kZq c1324720kZq, C16F5 c16f5, C16F5 c16f52, final GiftPickWithScore giftPickWithScore, final DataChannel dataChannel, final boolean z, boolean z2, final Function0 function0) {
        String str;
        final User owner;
        String strLJIJJ;
        GiftPick giftPick = giftPickWithScore.giftPick;
        ImageModel imageModel = null;
        if (giftPick != null) {
            str = giftPick.customizedDesc;
        } else {
            str = null;
        }
        c16f5.setText(str);
        if (z2) {
            C500260Jjc.LLFFF(c16f52);
            long j = giftPickWithScore.score;
            if (j < 1000000) {
                strLJIJJ = String.valueOf(j);
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131853303, C0KX5.LIZ(j));
            }
            c16f52.setText(strLJIJJ);
        } else {
            C500260Jjc.LJIILIIL(c16f52);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (owner = room.getOwner()) != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0fSe
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    Long lValueOf;
                    if (view2 != null) {
                        if (z) {
                            String str2 = ViewerWishesQueuePage._pnsPageId;
                            C2176841AHi.LIZ(dataChannel);
                            function0.invoke();
                            return;
                        }
                        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                        GiftPick giftPick2 = giftPickWithScore.giftPick;
                        if (giftPick2 != null) {
                            lValueOf = Long.valueOf(giftPick2.giftId);
                        } else {
                            lValueOf = null;
                        }
                        Boolean bool = Boolean.FALSE;
                        iGiftService.openGiftDialog("gift", new C1129740fVM("viewer_wishes", lValueOf, bool, bool, owner, null, false, 192));
                        function0.invoke();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, view);
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        GiftPick giftPick2 = giftPickWithScore.giftPick;
        if (giftPick2 != null) {
            imageModel = giftPick2.giftIcon;
        }
        C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.em2;
        int iLIZIZ = (int) C497740JfY.LIZIZ(28.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(28.0f);
        c1324610kZfLJIIIZ.LJ = iLIZIZ;
        c1324610kZfLJIIIZ.LJFF = iLIZIZ2;
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
    }
}
