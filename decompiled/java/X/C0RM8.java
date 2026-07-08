package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RM8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RM8 {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        if (!C1017070cZd.LLJZ(videoItemParams.getAweme())) {
            if ((videoItemParams.getAweme().getAddedSoundMusicInfo() != null || videoItemParams.getAweme().getMusic() != null) && !C287120BNe.LIZJ) {
                return true;
            }
            return false;
        }
        return false;
    }
}
