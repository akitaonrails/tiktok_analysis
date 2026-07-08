package X;

import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import webcast.data.multi_guest_play.CountdownForAllConfig;

/* JADX INFO: renamed from: X.01JD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JD {
    public static CountdownForAllConfigWrapper LIZ(CountdownForAllConfig countdownForAllConfig) {
        CountdownForAllConfigWrapper countdownForAllConfigWrapper = new CountdownForAllConfigWrapper();
        countdownForAllConfigWrapper.duration = countdownForAllConfig.duration;
        countdownForAllConfigWrapper.targetScore = countdownForAllConfig.targetScore;
        countdownForAllConfigWrapper.resourceId = countdownForAllConfig.resourceId;
        return countdownForAllConfigWrapper;
    }
}
