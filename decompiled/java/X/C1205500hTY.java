package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0hTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205500hTY {
    public static String LIZ(LSError lSError) {
        try {
            String strReplace = new Regex("[^a-zA-Z]").replace(lSError.message(), "");
            if (strReplace.length() > 100) {
                return strReplace.substring(0, 100);
            }
            return strReplace;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
