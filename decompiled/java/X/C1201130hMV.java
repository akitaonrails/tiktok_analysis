package X;

import android.util.Log;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastSingleActivityIllegalMethodCallWhiteList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hMV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201130hMV implements C198M {
    public static final C1201130hMV LIZ = new C1201130hMV();

    @Override // X.C198M
    public final boolean LIZ(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (!a0.LJJIIZI(stackTraceString, "ActivityThread", false) && !a0.LJJIIZI(stackTraceString, "handleRequestAssistContextExtras", false)) {
            for (String str : LiveBroadcastSingleActivityIllegalMethodCallWhiteList.getWhiteList()) {
                if (a0.LJJIIZI(stackTraceString, str, false)) {
                    if (str == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
