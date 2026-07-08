package X;

import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.UncertMusicOwnerInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Oox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630970Oox {
    public static final Pair<Boolean, List<MusicOwnerInfo>> LIZ(Music music) {
        List<UncertMusicOwnerInfo> uncertMusicOwnerInfos;
        List<MusicOwnerInfo> musicOwnerInfos;
        String secUid;
        String nickName;
        String handle;
        ArrayList arrayList = new ArrayList();
        MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
        boolean z = true;
        boolean z2 = false;
        if (matchedPGCSoundInfo != null && (musicOwnerInfos = matchedPGCSoundInfo.getMusicOwnerInfos()) != null) {
            z2 = false;
            for (MusicOwnerInfo musicOwnerInfo : musicOwnerInfos) {
                String uid = musicOwnerInfo.getUid();
                if (uid != null && uid.length() != 0 && (secUid = musicOwnerInfo.getSecUid()) != null && secUid.length() != 0 && (nickName = musicOwnerInfo.getNickName()) != null && nickName.length() != 0 && (handle = musicOwnerInfo.getHandle()) != null && handle.length() != 0) {
                    arrayList.add(musicOwnerInfo);
                    z2 = true;
                }
            }
        }
        MatchedPGCSoundInfo matchedPGCSoundInfo2 = music.getMatchedPGCSoundInfo();
        if (matchedPGCSoundInfo2 != null && (uncertMusicOwnerInfos = matchedPGCSoundInfo2.getUncertMusicOwnerInfos()) != null) {
            if (uncertMusicOwnerInfos.size() <= 1) {
                z = z2;
            }
            arrayList.addAll(uncertMusicOwnerInfos);
            z2 = z;
        }
        return new Pair<>(Boolean.valueOf(z2), arrayList);
    }

    public static final Pair<Boolean, List<MusicOwnerInfo>> LIZIZ(Music music) {
        String secUid;
        String nickName;
        String handle;
        ArrayList arrayList = new ArrayList();
        List<MusicOwnerInfo> musicOwnerInfos = music.getMusicOwnerInfos();
        boolean z = true;
        boolean z2 = false;
        if (musicOwnerInfos != null) {
            z2 = false;
            for (MusicOwnerInfo musicOwnerInfo : musicOwnerInfos) {
                String uid = musicOwnerInfo.getUid();
                if (uid != null && uid.length() != 0 && (secUid = musicOwnerInfo.getSecUid()) != null && secUid.length() != 0 && (nickName = musicOwnerInfo.getNickName()) != null && nickName.length() != 0 && (handle = musicOwnerInfo.getHandle()) != null && handle.length() != 0) {
                    arrayList.add(musicOwnerInfo);
                    z2 = true;
                }
            }
        }
        List<UncertMusicOwnerInfo> uncertMusicOwnerInfos = music.getUncertMusicOwnerInfos();
        if (uncertMusicOwnerInfos != null) {
            if (uncertMusicOwnerInfos.size() <= 1) {
                z = z2;
            }
            arrayList.addAll(uncertMusicOwnerInfos);
            z2 = z;
        }
        return new Pair<>(Boolean.valueOf(z2), arrayList);
    }

    public static final boolean LIZJ(MusicOwnerInfo musicOwnerInfo) {
        Integer status;
        if (!C10EU.LJIIZILJ(musicOwnerInfo.getUid()) && !musicOwnerInfo.isBlock() && !musicOwnerInfo.isBlocked() && (status = musicOwnerInfo.getStatus()) != null && status.intValue() == 1 && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return true;
        }
        return false;
    }
}
