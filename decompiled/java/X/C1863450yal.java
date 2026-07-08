package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.UpdateUserSettings;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationOtherInfo;

/* JADX INFO: renamed from: X.0yal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863450yal {
    public static SubConversationConfig LIZIZ(C801390Vc9 c801390Vc9) {
        BaseVideo baseVideoLIZIZ;
        String str = c801390Vc9.LIZ;
        String str2 = c801390Vc9.LIZIZ;
        long j = c801390Vc9.LJ;
        long j2 = c801390Vc9.LIZLLL;
        int i = c801390Vc9.LIZJ;
        String str3 = c801390Vc9.LJFF;
        long j3 = c801390Vc9.LJI;
        long j4 = c801390Vc9.LJII;
        String str4 = c801390Vc9.LJIIIIZZ;
        if (str4 != null) {
            baseVideoLIZIZ = C1860390yVp.LIZIZ(str4);
        } else {
            baseVideoLIZIZ = null;
        }
        return new SubConversationConfig(true, str, str2, str3, 0, 0L, j, j2, j3, j4, baseVideoLIZIZ, i);
    }

    public static ConversationInfo LIZJ(C801390Vc9 c801390Vc9) {
        BaseVideo baseVideoLIZIZ;
        String str = c801390Vc9.LIZ;
        String str2 = c801390Vc9.LIZIZ;
        String str3 = c801390Vc9.LJFF;
        long j = c801390Vc9.LJI;
        long j2 = c801390Vc9.LJII;
        String str4 = c801390Vc9.LJIIIIZZ;
        if (str4 != null) {
            baseVideoLIZIZ = C1860390yVp.LIZIZ(str4);
        } else {
            baseVideoLIZIZ = null;
        }
        return new ConversationInfo(str, 0L, null, 0L, new ConversationOtherInfo(0, 0L, false), new UpdateUserSettings(false, false, 0, false, false, false, "", Boolean.FALSE), 0, 0L, str2, str3, j, j2, baseVideoLIZIZ);
    }

    public static C801390Vc9 LIZ(SubConversationConfig subConversationConfig, long j, int i) {
        long j2;
        String strLJIILL;
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = -1;
        } else {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = -1;
        }
        String str = subConversationConfig.conversationId;
        String str2 = subConversationConfig.subConversationId;
        String str3 = subConversationConfig.conversationTitle;
        long j4 = subConversationConfig.unreadCount;
        long j5 = subConversationConfig.latestMessageTime;
        BaseVideo baseVideo = subConversationConfig.relatedVideo;
        if (baseVideo != null) {
            try {
                strLJIILL = C597040NbK.LIZ().LJIILL(baseVideo);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                strLJIILL = "";
            }
        } else {
            strLJIILL = null;
        }
        return new C801390Vc9(subConversationConfig.status, j2, j3, j4, j5, str, str2, str3, strLJIILL);
    }
}
