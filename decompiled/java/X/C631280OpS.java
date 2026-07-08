package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.ReuseMusicStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631280OpS {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        return ((com.ss.android.ugc.aweme.music.model.FusedMusic) X.C13LP.LJJJJZI(r4.fusedMusicInfos)).music;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.music.model.Music LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C631280OpS.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.music.model.Music");
    }

    public static ReuseMusicStruct LIZIZ(Aweme aweme) {
        String originVolume;
        String originVolume2;
        String musicVolume;
        String musicVolume2;
        String mid;
        String mid2;
        Music addedSoundMusicInfo;
        if (!C630340Onw.LIZ() || (originVolume = aweme.getOriginVolume()) == null || originVolume.length() == 0 || (originVolume2 = aweme.getOriginVolume()) == null || CastFloatProtector.parseFloat(originVolume2) <= 0.0f || (musicVolume = aweme.getMusicVolume()) == null || musicVolume.length() == 0 || (musicVolume2 = aweme.getMusicVolume()) == null || CastFloatProtector.parseFloat(musicVolume2) <= 0.0f || !LJ(aweme.getMusic()) || !LJ(aweme.getAddedSoundMusicInfo())) {
            return null;
        }
        Music music = aweme.getMusic();
        if (music != null) {
            mid = music.getMid();
        } else {
            mid = null;
        }
        Music addedSoundMusicInfo2 = aweme.getAddedSoundMusicInfo();
        if (addedSoundMusicInfo2 != null) {
            mid2 = addedSoundMusicInfo2.getMid();
        } else {
            mid2 = null;
        }
        if (Intrinsics.LJFF(mid, mid2)) {
            return null;
        }
        boolean zLIZLLL = LIZLLL(aweme.getMusic());
        boolean zLIZLLL2 = LIZLLL(aweme.getAddedSoundMusicInfo());
        if (C630340Onw.LIZIZ() && zLIZLLL2 && zLIZLLL) {
            addedSoundMusicInfo = aweme.getMusic();
        } else {
            if (!C630340Onw.LIZJ() || !zLIZLLL2) {
                return null;
            }
            addedSoundMusicInfo = aweme.getAddedSoundMusicInfo();
        }
        if (addedSoundMusicInfo == null) {
            return null;
        }
        return new ReuseMusicStruct(addedSoundMusicInfo.getMid(), addedSoundMusicInfo.getMusicName(), addedSoundMusicInfo.getAuthorName(), Boolean.valueOf(addedSoundMusicInfo.isPgc()));
    }

    public static boolean LIZJ(Music music) {
        if (music == null) {
            return true;
        }
        if (music.getMusicStatus() != 0 && music.getMusicRecommendStatus() != 255 && music.getMusicRecommendStatus() != 258 && music.getMusicRecommendStatus() != 256) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Music music) {
        if (music == null) {
            return true;
        }
        if (music.getMusicRecommendStatus() != 200 && music.getMusicRecommendStatus() != 170 && music.getMusicRecommendStatus() != 150) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Music music) {
        List<String> urlList;
        String uri;
        if (music != null && music.getId() != 0 && LIZJ(music)) {
            UrlModel playUrl = music.getPlayUrl();
            if (playUrl == null || (uri = playUrl.getUri()) == null || uri.length() == 0) {
                UrlModel playUrl2 = music.getPlayUrl();
                if (playUrl2 != null && (urlList = playUrl2.getUrlList()) != null && !urlList.isEmpty()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
