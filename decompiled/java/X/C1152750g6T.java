package X;

import com.bytedance.android.livesdk.livesetting.broadcast.BgGovernorConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.BgGovernorStageOption;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBgGovernorSetting;

/* JADX INFO: renamed from: X.0g6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152750g6T {
    public static BgGovernorConfig LIZ() {
        return LiveBroadcastBgGovernorSetting.INSTANCE.getConfig();
    }

    public static BgGovernorStageOption LIZIZ(EnumC780370UjL enumC780370UjL) {
        int i = C780380UjM.LIZ[enumC780370UjL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LIZ().getStages().getCritical();
                        }
                        throw new C1954807lC();
                    }
                    return LIZ().getStages().getLong();
                }
                return LIZ().getStages().getMedium();
            }
            return LIZ().getStages().getShort();
        }
        return LIZ().getStages().getImmediate();
    }
}
