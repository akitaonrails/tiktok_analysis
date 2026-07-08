package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: renamed from: X.0Ont, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630310Ont {
    public static final boolean LIZ(Music music) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        if (!music.isPgc() && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && matchedPGCSoundInfo.getTitle() != null && C297080Bkg.LIZ() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(Music music) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        if (!music.isPgc() && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && matchedPGCSoundInfo.getTitle() != null) {
            if (C297080Bkg.LIZ() == 1 || C297080Bkg.LIZ() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(Music music) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        if (!music.isPgc() && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && matchedPGCSoundInfo.getTitle() != null) {
            if (C297080Bkg.LIZ() == 1 || C297080Bkg.LIZ() == 2 || C297080Bkg.LIZ() == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final UrlModel LIZLLL(Music music) {
        UrlModel coverMedium;
        MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
        if (matchedPGCSoundInfo == null || (coverMedium = matchedPGCSoundInfo.getCoverMedium()) == null) {
            return music.getCoverMedium();
        }
        return coverMedium;
    }

    public static final boolean LJ(Music music) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        if (!music.isPgc() && (matchedPGCSoundInfo = music.getMatchedPGCSoundInfo()) != null && matchedPGCSoundInfo.getTitle() != null && C297080Bkg.LIZ() == 5) {
            return true;
        }
        return false;
    }
}
