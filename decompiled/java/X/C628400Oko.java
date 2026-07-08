package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.List;

/* JADX INFO: renamed from: X.0Oko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628400Oko {
    public static boolean LIZ(MusicDetail musicDetail) {
        Music music;
        UrlModel playUrl;
        List<String> urlList;
        Music music2 = musicDetail.music;
        if ((music2 != null && music2.getMusicStatus() == 0) || (music = musicDetail.music) == null || (playUrl = music.getPlayUrl()) == null || (urlList = playUrl.getUrlList()) == null || urlList.isEmpty()) {
            C629940OnI c629940OnI = C629940OnI.LIZ;
            Music music3 = musicDetail.music;
            c629940OnI.getClass();
            if (!C629940OnI.LIZ(music3)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
