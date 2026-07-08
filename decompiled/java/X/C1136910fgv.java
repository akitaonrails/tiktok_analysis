package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* JADX INFO: renamed from: X.0fgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136910fgv {
    public static final long LIZ(GiftMessage giftMessage) {
        long j = -1;
        if (giftMessage.LLILZLL > 0) {
            CommonMessageData commonMessageData = giftMessage.baseMessage;
            if (commonMessageData != null) {
                j = commonMessageData.messageId;
            }
            return j - ((long) giftMessage.LLIZ);
        }
        CommonMessageData commonMessageData2 = giftMessage.baseMessage;
        if (commonMessageData2 == null) {
            return -1L;
        }
        return commonMessageData2.messageId;
    }
}
