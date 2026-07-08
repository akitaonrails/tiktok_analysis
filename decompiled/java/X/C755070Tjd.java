package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateModelAnchorSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateModelAudienceSetting;

/* JADX INFO: renamed from: X.0Tjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755070Tjd {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(boolean z) {
        int value;
        if (z) {
            value = LiveAutoTranslateModelAnchorSetting.INSTANCE.getValue();
        } else {
            value = LiveAutoTranslateModelAudienceSetting.INSTANCE.getValue();
        }
        if (value != 0) {
            return true;
        }
        return false;
    }
}
