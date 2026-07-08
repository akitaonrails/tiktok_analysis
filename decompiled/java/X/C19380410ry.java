package X;

import com.ss.android.ugc.aweme.tako.experiment.TakoUserActivityThresholdConfig;

/* JADX INFO: renamed from: X.10ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19380410ry {
    public static EnumC19380310rx LIZ(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        C19380510rz.LIZ.getClass();
        TakoUserActivityThresholdConfig takoUserActivityThresholdConfig = (TakoUserActivityThresholdConfig) C19380510rz.LIZJ.getValue();
        int i3 = takoUserActivityThresholdConfig.highActiveDaysMin;
        if (i3 < 1) {
            i3 = 1;
        }
        int i4 = takoUserActivityThresholdConfig.highSendMsgCntMin;
        if (i4 < 1) {
            i4 = 1;
        }
        if (i < i3 && i2 < i4) {
            if (i < 1 && i2 < 1) {
                return EnumC19380310rx.UNUSED;
            }
            return EnumC19380310rx.MEDIUM_LOW;
        }
        return EnumC19380310rx.HIGH;
    }
}
