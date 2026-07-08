package X;

import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LiveExitInnerFeedCardMockWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LiveExitInnerFeedCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LiveFYPExitInnerFeedCardMockWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromote3PhotoWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteLynxWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteNewSinglePhotoWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteSinglePhotoWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteTextWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteVideoWidget;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0IMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465200IMc {
    public static ILiveNewStyleCardWidget LIZ(EncourageGoLiveCard encourageGoLiveCard) {
        if (!encourageGoLiveCard.isLynxCard) {
            int i = encourageGoLiveCard.style;
            if (i >= 101) {
                if (i > 199) {
                    return null;
                }
            } else {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    switch (i) {
                                        case 104:
                                        case 107:
                                            return new LiveExitInnerFeedCardWidget(encourageGoLiveCard);
                                        case 105:
                                            return new LiveExitInnerFeedCardMockWidget(encourageGoLiveCard);
                                        case 106:
                                            return new LiveFYPExitInnerFeedCardMockWidget(encourageGoLiveCard);
                                        default:
                                            return null;
                                    }
                                }
                                return new LivePromoteNewSinglePhotoWidget(encourageGoLiveCard);
                            }
                            return new LivePromoteVideoWidget(encourageGoLiveCard);
                        }
                        return new LivePromoteSinglePhotoWidget(encourageGoLiveCard);
                    }
                    return new LivePromoteTextWidget(encourageGoLiveCard);
                }
                return new LivePromote3PhotoWidget(encourageGoLiveCard);
            }
        }
        return new LivePromoteLynxWidget(encourageGoLiveCard);
    }
}
