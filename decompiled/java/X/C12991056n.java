package X;

import com.ss.android.ugc.aweme.im.frequencycontrol.impl.sync.config.model.ImFrequencyTypeEnum;

/* JADX INFO: renamed from: X.056n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12991056n {
    public static ImFrequencyTypeEnum LIZ(Integer num) {
        for (ImFrequencyTypeEnum imFrequencyTypeEnum : ImFrequencyTypeEnum.values()) {
            int value = imFrequencyTypeEnum.getValue();
            if (num != null && value == num.intValue()) {
                return imFrequencyTypeEnum;
            }
        }
        return ImFrequencyTypeEnum.UNKNOWN;
    }
}
