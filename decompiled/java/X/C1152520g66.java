package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostAllowQuickCohostPreferenceMatchLayoutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostAllowQuickCohostPreferenceMatchRollbackKeySetting;

/* JADX INFO: renamed from: X.0g66, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152520g66 {
    public static boolean LIZ() {
        return LiveCohostAllowQuickCohostPreferenceMatchRollbackKeySetting.INSTANCE.isRollbackEnabled();
    }

    public static boolean LIZIZ() {
        return LIZ() && LiveCohostAllowQuickCohostPreferenceMatchLayoutSetting.INSTANCE.getValue();
    }
}
