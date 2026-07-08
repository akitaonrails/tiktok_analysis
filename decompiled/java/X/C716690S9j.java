package X;

import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: renamed from: X.0S9j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716690S9j {
    public static boolean LIZ(Music music) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        String title;
        if (music.isPgc() || (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) == null || (title = matchedPGCSoundInfo.getTitle()) == null || title.length() <= 0) {
            return false;
        }
        return true;
    }
}
