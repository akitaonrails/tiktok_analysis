package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: renamed from: X.0Tiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754670Tiz {
    public static EnumC754690Tj1 LIZ(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C199700pn.LIZ[liveMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return EnumC754690Tj1.LIVE_VOICE;
                        }
                        return null;
                    }
                    return EnumC754690Tj1.THIRD_PARTY;
                }
                return EnumC754690Tj1.SCREEN_RECORD;
            }
            return EnumC754690Tj1.VIDEO;
        }
        return null;
    }
}
