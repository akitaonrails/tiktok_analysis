package X;

import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoAnswerCarryCardProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;

/* JADX INFO: renamed from: X.0yRa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857760yRa {
    public static boolean LIZ(ITakoAnswerCarryCardProtocol iTakoAnswerCarryCardProtocol, C326880Cre c326880Cre) {
        if ((!C1858670yT3.LJIIIZ(c326880Cre.LLILLL)) && iTakoAnswerCarryCardProtocol.Hq(c326880Cre)) {
            Message message = c326880Cre.LLILLL;
            if (message.msgType == 3 && !message.sender.isSelf) {
                return true;
            }
            return false;
        }
        return false;
    }
}
