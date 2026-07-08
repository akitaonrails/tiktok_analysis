package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: renamed from: X.01Zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C354201Zc {
    public static final String LIZ(LiveMode liveMode) {
        switch (C011A.LIZ[liveMode.ordinal()]) {
            case 1:
                return "video_live";
            case 2:
                return "third_party";
            case 3:
                return "screen_share";
            case 4:
                return "live_studio";
            case 5:
                return "live_voice";
            case 6:
                return "live_manager";
            default:
                return "";
        }
    }

    public static final boolean LIZIZ(LiveMode liveMode) {
        if (liveMode != LiveMode.VIDEO) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(LiveMode liveMode) {
        if (liveMode == LiveMode.LIVE_VOICE) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(LiveMode liveMode) {
        if (liveMode == LiveMode.SCREEN_RECORD) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(LiveMode liveMode) {
        if (liveMode == LiveMode.THIRD_PARTY) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(LiveMode liveMode) {
        if (liveMode == LiveMode.VIDEO) {
            return true;
        }
        return false;
    }
}
