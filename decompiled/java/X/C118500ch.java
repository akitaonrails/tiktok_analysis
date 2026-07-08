package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* JADX INFO: renamed from: X.00ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C118500ch {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(DataChannel dataChannel, MinuteGameUpdateMessage minuteGameUpdateMessage) {
        GiftMessage giftMessage;
        if (dataChannel == null || minuteGameUpdateMessage.updateType != 5) {
            return false;
        }
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        MinuteGameUpdateMessage.TimedPropData timedPropData = minuteGameUpdateMessage.timedPropData;
        if (timedPropData != null && (giftMessage = timedPropData.giftMessage) != null) {
            if (giftMessage.fromUser.getId() == UserService.getInstance().user().getCurrentUserId()) {
                giftMessage.LLILLL = true;
            }
            giftMessage.repeatEnd = 0;
            giftMessage.LLILZ = true;
            if (iMessageManager != null) {
                iMessageManager.insertMessage(giftMessage);
            }
            GiftMessage giftMessageLIZ = C1135260feG.LIZ(giftMessage);
            giftMessageLIZ.repeatEnd = 1;
            if (iMessageManager != null) {
                iMessageManager.insertMessage(giftMessageLIZ);
            }
        }
        return true;
    }
}
