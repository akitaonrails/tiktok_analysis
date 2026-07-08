package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.video.experiment.mediabox.cover.MediaBoxCoverPage;
import java.util.List;

/* JADX INFO: renamed from: X.07RQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07RQ {
    public static final MediaBoxCoverPage LIZ = (MediaBoxCoverPage) C0C64.LJIILLIIL().LJJII(MediaBoxCoverPage.class, new MediaBoxCoverPage(C1697810uHb.LJ("homepage_hot")), "page_enable_mediabox_cover", true);

    public static final boolean LIZ(String str) {
        MediaBoxCoverPage mediaBoxCoverPage;
        List<String> list;
        if (TextUtils.isEmpty(str) || (mediaBoxCoverPage = LIZ) == null || (list = mediaBoxCoverPage.pages) == null) {
            return false;
        }
        return C13LP.LJJJJ(str, list);
    }
}
