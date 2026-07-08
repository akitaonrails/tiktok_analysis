package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;

/* JADX INFO: renamed from: X.0LBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538880LBm {
    public static final AIGCPushMessage LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return (AIGCPushMessage) C2292508yZ.LIZ(str, AIGCPushMessage.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C538950LBt c538950LBt = C538950LBt.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to parse bizExtra: ");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c538950LBt, "EditorProAIGCServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
