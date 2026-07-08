package X;

import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Ooy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630980Ooy {
    public static final List<Integer> LIZ(Music music) {
        List<MusicOwnerInfo> musicOwnerInfos;
        ArrayList arrayList;
        int iIntValue;
        int iIntValue2;
        if (music == null) {
            return C13BV.INSTANCE;
        }
        if (music.isPgc()) {
            List<MusicOwnerInfo> listLIZIZ = LIZIZ(music.getMusicOwnerInfos());
            arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator<MusicOwnerInfo> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                Integer followStatus = it2.next().getFollowStatus();
                if (followStatus != null) {
                    iIntValue2 = followStatus.intValue();
                } else {
                    iIntValue2 = -1;
                }
                arrayList.add(Integer.valueOf(iIntValue2));
            }
        } else {
            MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo != null) {
                musicOwnerInfos = matchedPGCSoundInfo.getMusicOwnerInfos();
            } else {
                musicOwnerInfos = null;
            }
            List<MusicOwnerInfo> listLIZIZ2 = LIZIZ(musicOwnerInfos);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ2, 10));
            Iterator<MusicOwnerInfo> it3 = listLIZIZ2.iterator();
            while (it3.hasNext()) {
                Integer followStatus2 = it3.next().getFollowStatus();
                if (followStatus2 != null) {
                    iIntValue = followStatus2.intValue();
                } else {
                    iIntValue = -1;
                }
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        return arrayList;
    }

    public static final List<MusicOwnerInfo> LIZIZ(List<? extends MusicOwnerInfo> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (MusicOwnerInfo musicOwnerInfo : list) {
                String uid = musicOwnerInfo.getUid();
                if (uid != null && uid.length() != 0) {
                    arrayList.add(musicOwnerInfo);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final List<String> LIZJ(Music music) {
        List<MusicOwnerInfo> musicOwnerInfos;
        ArrayList arrayList;
        if (music == null) {
            return C13BV.INSTANCE;
        }
        if (music.isPgc()) {
            List<MusicOwnerInfo> listLIZIZ = LIZIZ(music.getMusicOwnerInfos());
            arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
            Iterator<MusicOwnerInfo> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                String uid = it2.next().getUid();
                if (uid == null) {
                    uid = "";
                }
                arrayList.add(uid);
            }
        } else {
            MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo != null) {
                musicOwnerInfos = matchedPGCSoundInfo.getMusicOwnerInfos();
            } else {
                musicOwnerInfos = null;
            }
            List<MusicOwnerInfo> listLIZIZ2 = LIZIZ(musicOwnerInfos);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ2, 10));
            Iterator<MusicOwnerInfo> it3 = listLIZIZ2.iterator();
            while (it3.hasNext()) {
                String uid2 = it3.next().getUid();
                if (uid2 == null) {
                    uid2 = "";
                }
                arrayList.add(uid2);
            }
        }
        return arrayList;
    }

    public static final String LIZLLL(Music music) {
        String idStr;
        String mixedAuthor;
        if (music != null && (idStr = music.getIdStr()) != null && idStr.length() != 0 && music.getId() != 0) {
            if (music.isPgc()) {
                return "pgc";
            }
            MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo != null && (mixedAuthor = matchedPGCSoundInfo.getMixedAuthor()) != null && mixedAuthor.length() != 0) {
                return "fold_ugc";
            }
            return "ugc";
        }
        return "";
    }
}
