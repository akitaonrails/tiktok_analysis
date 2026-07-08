package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.StarCommentMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C109000bA {
    public static final C1116210f9X LIZ(StarCommentMessage starCommentMessage, long j, String str) {
        String str2 = starCommentMessage.starCommentId;
        User user = starCommentMessage.user;
        if (user == null) {
            user = new User();
        }
        C1116210f9X c1116210f9X = new C1116210f9X(str2, user, starCommentMessage.content, starCommentMessage.startTimeMs, starCommentMessage.duration, starCommentMessage.commentOption, starCommentMessage.contentLanguage, EnumC1116160f9S.DISPLAYING, C1116380f9o.LIZJ, str, starCommentMessage.f315emotes);
        CommonMessageData commonMessageData = new CommonMessageData();
        commonMessageData.roomId = j;
        try {
            commonMessageData.messageId = CastLongProtector.parseLong(c1116210f9X.LL);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        commonMessageData.showMsg = true;
        c1116210f9X.baseMessage = commonMessageData;
        return c1116210f9X;
    }
}
