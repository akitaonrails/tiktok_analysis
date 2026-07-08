package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.LastReadMessageReactionTimestamp;
import com.ss.android.ugc.aweme.vibefeed.experiment.SocialVibeFeedConfigSetting;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876630YaD {
    public static boolean LIZ(C0Y8T c0y8t) {
        String conversationId;
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        if (c0y8t != null) {
            conversationId = c0y8t.getConversationId();
        } else {
            conversationId = null;
        }
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(conversationId);
        if (c0y8tLIZ == null || c0y8tLIZ.getUnreadCount() <= 0) {
            return false;
        }
        C869590Y9l lastShowMessage = c0y8tLIZ.getLastShowMessage();
        if ((lastShowMessage != null && C0ZDX.LJJJJIZL(lastShowMessage)) || !C878690YdX.LIZLLL(c0y8tLIZ) || !c0y8tLIZ.isMember() || c0y8tLIZ.isDissolved() || C878690YdX.LIZIZ(c0y8tLIZ)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        if (!C13LP.LJJJJ(c869590Y9l.getScene(), SocialVibeFeedConfigSetting.LIZ().enableList) && !LJ(c869590Y9l, false)) {
            return false;
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
        if (c0y8tLIZ != null) {
            if (!C878690YdX.LIZJ(c869590Y9l) || !c0y8tLIZ.isMember() || c0y8tLIZ.isDissolved() || C878690YdX.LIZIZ(c0y8tLIZ)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean LIZJ(C876550Ya5 c876550Ya5) {
        C0Y8T c0y8t;
        Object c098200Yq;
        long jLongValue;
        long j;
        C0YA1 c0ya1;
        Long l;
        C0YA1 c0ya12;
        if (c876550Ya5.LIZ != EnumC876650YaF.PROPERTY || (c0y8t = c876550Ya5.LIZLLL) == null) {
            return false;
        }
        C0YT8 c0yt8 = c876550Ya5.LJFF;
        if (c0yt8 != null && (c0ya12 = c0yt8.LIZ) != null && C879250YeR.LIZLLL(c0ya12)) {
            return false;
        }
        try {
            c098200Yq = (LastReadMessageReactionTimestamp) C051M.LIZIZ(LastReadMessageReactionTimestamp.class, c0y8t.getLocalExt().get("a:s_last_read_message_reaction_timestamp"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        LastReadMessageReactionTimestamp lastReadMessageReactionTimestamp = (LastReadMessageReactionTimestamp) c098200Yq;
        if (lastReadMessageReactionTimestamp != null && (l = lastReadMessageReactionTimestamp.lastReadTime) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        C0YT8 c0yt82 = c876550Ya5.LJFF;
        if (c0yt82 != null && (c0ya1 = c0yt82.LIZ) != null) {
            j = c0ya1.createTimeMicros;
        } else {
            j = 0;
        }
        if (!C878690YdX.LIZLLL(c0y8t) || j <= jLongValue) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(C876550Ya5 c876550Ya5) {
        int i = C876640YaE.LIZ[c876550Ya5.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return true;
            }
            return LIZ(c876550Ya5.LIZLLL);
        }
        return LIZIZ(c876550Ya5.LIZJ);
    }

    public static boolean LJ(C869590Y9l c869590Y9l, boolean z) {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC876790YaT interfaceC876790YaTLJII;
        if (c869590Y9l != null && C876780YaS.LIZ(c869590Y9l) && (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) != null && (interfaceC876790YaTLJII = iAiChatFeatureService.LJII()) != null && interfaceC876790YaTLJII.LIZJ(c869590Y9l)) {
            return true;
        }
        if (Intrinsics.LJFF(c869590Y9l.getScene(), "streak_interaction_unlock") && C06BY.LIZ()) {
            return true;
        }
        if (c869590Y9l.getReadStatus() == 1) {
            return false;
        }
        if (!z && !C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIILLIIL(c869590Y9l, true)) {
            return false;
        }
        return true;
    }

    public static C876550Ya5 LJFF(C869590Y9l c869590Y9l, EnumC876540Ya4 enumC876540Ya4) {
        return new C876550Ya5(EnumC876650YaF.MESSAGE, enumC876540Ya4, c869590Y9l, null, c869590Y9l.getConversationId(), null, 104);
    }
}
