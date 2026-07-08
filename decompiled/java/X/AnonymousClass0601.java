package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ai.impl.bot.api.BotFeedbackRoleType;

/* JADX INFO: renamed from: X.0601, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class AnonymousClass0601 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[BotFeedbackRoleType.values().length];
        try {
            iArr[BotFeedbackRoleType.BOT_FEEDBACK_ROLE_TYPE_CREATOR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[BotFeedbackRoleType.BOT_FEEDBACK_ROLE_TYPE_USER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
