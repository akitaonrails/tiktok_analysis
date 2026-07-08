package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLiveLogOpt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IUQ {
    public static void LIZ(Function0 function0) {
        if (LiveBroadcastLiveLogOpt.INSTANCE.canReport(0.01d)) {
            function0.invoke();
        }
    }
}
