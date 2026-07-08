package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0728, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0728 {
    public static final int LIZ() {
        int i = 5000;
        if (C070Q.LIZ()) {
            C0CBW c0cbw = C0CBW.LIZ;
            if ((!C0CBW.LIZIZ() || !C1785006yu.LIZIZ()) && !C1785006yu.LIZ()) {
                return LSPassThroughRecordSizeConfig.DEFAULT;
            }
        } else {
            int i2 = AnonymousClass0729.LIZ;
            if (i2 <= 5000) {
                i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
                if (i2 >= 300) {
                    return i2;
                }
            }
        }
        return i;
    }
}
