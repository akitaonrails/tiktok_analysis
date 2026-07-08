package X;

import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTriggerEnum;

/* JADX INFO: renamed from: X.056j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12987056j {
    public static ImFrequencyTriggerEnum LIZ(Integer num) {
        for (ImFrequencyTriggerEnum imFrequencyTriggerEnum : ImFrequencyTriggerEnum.values()) {
            int value = imFrequencyTriggerEnum.getValue();
            if (num != null && value == num.intValue()) {
                return imFrequencyTriggerEnum;
            }
        }
        return ImFrequencyTriggerEnum.UNKNOWN;
    }
}
