package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: renamed from: X.00ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C236000ve {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C198300pZ.LIZ[liveMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "voice_live";
                        }
                        return null;
                    }
                    return "third_party";
                }
                return "share_screen";
            }
            return "video_live";
        }
        return null;
    }
}
