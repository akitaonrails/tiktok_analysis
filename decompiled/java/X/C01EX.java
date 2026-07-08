package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01EX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(final Throwable th, final String str, final String str2, final long j) {
        C917520Zz4.LIZIZ(new Runnable() { // from class: X.01EV
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiLiveLinkMicPerfLogger@b694.logLinkMicPerfApiFinishError$1");
                try {
                    Throwable th2 = th;
                    int errorCode = th2 instanceof C501470JlZ ? ((C501470JlZ) th2).getErrorCode() : 1;
                    Throwable th3 = th;
                    C01EX.LIZ(errorCode, str, th3 instanceof C477520Io2 ? ((C477520Io2) th3).getxTtLogId() : "", j, str2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiLiveLinkMicPerfLogger@b694.logLinkMicPerfApiFinishError$1");
            }
        });
    }

    public static void LIZLLL(final long j, final String str, final String str2, final String str3) {
        C917520Zz4.LIZIZ(new Runnable() { // from class: X.01EW
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MultiLiveLinkMicPerfLogger@b694.logLinkMicPerfApiFinishSuccess$1");
                try {
                    C01EX.LIZ(0, str, str2, j, str3);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MultiLiveLinkMicPerfLogger@b694.logLinkMicPerfApiFinishSuccess$1");
            }
        });
    }

    public static void LIZ(int i, String str, String str2, long j, String str3) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("source", str);
        map.put("duration", String.valueOf(j));
        map.put("logId", str2);
        map.put("is_anchor", String.valueOf(Intrinsics.LJFF(map.get("anchor_id"), map.get("user_id")) ? 1 : 0));
        map.put("error_code", String.valueOf(i));
        if (str3 != null) {
            map.put("type", str3);
        }
        C0KX4.LIZ("livesdk_linkmic_perf_api_finish", map, Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_1000()), true);
    }
}
