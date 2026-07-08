package X;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267520j5a {
    public static boolean LIZ;

    public static final boolean LIZ() {
        return LIZ && C1274040jG6.LIZ;
    }

    public static final void LIZIZ(String str) {
        AVLog.ioe("DebugLogUtils", str);
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(str);
        C1274070jG9 c1274070jG9 = C1274080jGA.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DebugLogUtils");
        sbLIZ.append(str);
        c1274070jG9.LIZ(C2188811AlT.LIZIZ(sbLIZ), androidRuntimeException);
        if (!C1274040jG6.LIZ()) {
        } else {
            throw androidRuntimeException;
        }
    }
}
