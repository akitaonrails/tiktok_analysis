package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.log.IAdChatAgentLogService;

/* JADX INFO: renamed from: X.0dU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052060dU4 {
    public static void LIZ(String str, String str2, String str3, String str4, String str5, long j, long j2, String str6, int i) {
        IAdChatAgentLogService iAdChatAgentLogService = (IAdChatAgentLogService) PluggableExtentionKt.pluggableSpi$default(IAdChatAgentLogService.class, false, false, false, 14, null);
        if (iAdChatAgentLogService != null) {
            iAdChatAgentLogService.LIZIZ(i, str, str2, Long.valueOf(j), Long.valueOf(j2), str3, str4, str5, str6);
        }
    }
}
