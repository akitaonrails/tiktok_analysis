package X;

import com.ss.android.ugc.aweme.social.creation.api.mediapicker.exp.StoryAlbumFirstFrameOptConfig;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJ5 {
    public static final StoryAlbumFirstFrameOptConfig LIZ = new StoryAlbumFirstFrameOptConfig(false, false, false, false, false, false, false, false, 12, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(633));

    public static StoryAlbumFirstFrameOptConfig LIZ() {
        return (StoryAlbumFirstFrameOptConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().enabled;
    }

    public static boolean LIZJ() {
        return LIZIZ() && LIZ().enableWarmupFirstScreen;
    }

    public static int LIZLLL() {
        Integer numValueOf = Integer.valueOf(LIZ().warmupFirstScreenPageSize);
        if (numValueOf.intValue() > 0) {
            return numValueOf.intValue();
        }
        return 12;
    }
}
