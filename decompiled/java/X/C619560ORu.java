package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* JADX INFO: renamed from: X.0ORu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619560ORu {
    public static final boolean LIZ(Music music) {
        UrlModel playUrl;
        List<String> urlList;
        if (music == null || music.getMusicStatus() == 0 || (playUrl = music.getPlayUrl()) == null || (urlList = playUrl.getUrlList()) == null || urlList.isEmpty()) {
            return true;
        }
        return false;
    }
}
