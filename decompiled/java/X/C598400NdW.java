package X;

import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;

/* JADX INFO: renamed from: X.0NdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598400NdW {
    public static final boolean LIZ(DispersionInfo dispersionInfo) {
        DelayParam delayParam;
        if (dispersionInfo == null || (delayParam = dispersionInfo.delayParam) == null || delayParam.maxDelayMs <= delayParam.minDelayMs) {
            return false;
        }
        return true;
    }

    public static final long LIZIZ(DelayParam delayParam) {
        long j = delayParam.minDelayMs;
        long j2 = delayParam.maxDelayMs;
        if (j >= j2) {
            return 0L;
        }
        return AbstractC19994813Le.Default.nextLong(j, j2);
    }
}
