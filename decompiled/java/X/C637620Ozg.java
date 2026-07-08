package X;

import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: renamed from: X.0Ozg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637620Ozg {
    public static final boolean LIZ(Music music, boolean z) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        if (music.isPgc()) {
            if (C123100dR.LIZ(music.getMusicName())) {
                return false;
            }
            return true;
        }
        if (!music.isPgc() && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && matchedPGCSoundInfo.getTitle() != null) {
            return false;
        }
        if (!z) {
            return music.isOriginalSound();
        }
        return true;
    }
}
