package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;

/* JADX INFO: renamed from: X.0MRM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRM {
    public static boolean LIZ(MusicBuzModel musicBuzModel) {
        String str;
        UrlModel urlModel;
        String uri = null;
        if (musicBuzModel != null) {
            str = musicBuzModel.musicPath;
            MusicObject musicObject = musicBuzModel.music;
            if (musicObject != null && (urlModel = musicObject.playUrl) != null) {
                uri = urlModel.getUri();
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            if (uri == null || uri.length() == 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
