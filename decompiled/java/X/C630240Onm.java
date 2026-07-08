package X;

import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.ReuseMusicStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Onm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630240Onm {
    public static boolean LIZ(MusicDetail musicDetail, ReuseMusicStruct reuseMusicStruct) {
        MatchedPGCSoundInfo matchedPGCSoundInfo;
        String id;
        String id2;
        Music music;
        MatchedPGCSoundInfo matchedPGCSoundInfo2;
        Music music2 = musicDetail.music;
        String id3 = null;
        if (music2 != null && (matchedPGCSoundInfo = music2.getMatchedPGCSoundInfo()) != null && (id = matchedPGCSoundInfo.getId()) != null && id.length() != 0) {
            if (reuseMusicStruct != null) {
                id2 = reuseMusicStruct.getId();
            } else {
                id2 = null;
            }
            Music music3 = musicDetail.music;
            if (music3 != null && (matchedPGCSoundInfo2 = music3.getMatchedPGCSoundInfo()) != null) {
                id3 = matchedPGCSoundInfo2.getId();
            }
            if (!Intrinsics.LJFF(id2, id3)) {
                Music music4 = musicDetail.music;
                if ((music4 == null || !C630310Ont.LIZJ(music4)) && (music = musicDetail.music) != null && !C630310Ont.LJ(music)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
