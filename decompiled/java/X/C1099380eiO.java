package X;

import com.bytedance.android.livesdk.livesetting.LiveUserInfoMuteUIAudienceOpt;
import com.bytedance.android.livesdk.livesetting.LiveUserInfoMuteUIHostOpt;

/* JADX INFO: renamed from: X.0eiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099380eiO {
    public static final boolean LIZ(boolean z) {
        if (z) {
            if (!LiveUserInfoMuteUIHostOpt.enable()) {
                return false;
            }
            return true;
        }
        if (!LiveUserInfoMuteUIAudienceOpt.enable()) {
            return false;
        }
        return true;
    }
}
