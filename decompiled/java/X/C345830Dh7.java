package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345830Dh7 {
    public static final void LIZ(List<? extends Aweme> list) {
        UrlModel cover;
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            Video video = it2.next().getVideo();
            if (video != null) {
                cover = video.getCover();
            } else {
                cover = null;
            }
            C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover)).LJJIFFI();
        }
    }
}
