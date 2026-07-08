package X;

import com.bytedance.android.livesdk.model.message.PinMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004F {
    public static AbstractC1136060ffY LIZ(PinMessage pinMessage) {
        if (pinMessage != null) {
            String str = pinMessage.method;
            if (Intrinsics.LJFF(str, C001A.CHAT.wsMethod)) {
                return pinMessage.chatMessage;
            }
            if (Intrinsics.LJFF(str, C001A.SOCIAL.wsMethod)) {
                return pinMessage.socialMessage;
            }
            if (Intrinsics.LJFF(str, C001A.GIFT.wsMethod)) {
                return pinMessage.giftMessage;
            }
            if (Intrinsics.LJFF(str, C001A.ROOM.wsMethod)) {
                return pinMessage.LL;
            }
            return null;
        }
        return null;
    }
}
