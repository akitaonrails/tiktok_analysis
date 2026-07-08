package X;

import com.ss.android.ugc.aweme.music.model.MDPRelatedBanner;
import com.ss.android.ugc.aweme.music.model.MDPRelatedBannerType;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Op4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631040Op4 {
    public static MDPRelatedBanner LIZ(MusicDetail musicDetail) {
        boolean z;
        List<MDPRelatedBanner> list = musicDetail.relatedBanners;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        MDPRelatedBanner mDPRelatedBanner = null;
        if (z) {
            return null;
        }
        Iterator<MDPRelatedBanner> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            MDPRelatedBanner next = it2.next();
            if (next.getBannerType() == MDPRelatedBannerType.MUSIC_TRENDING_HASHTAG) {
                mDPRelatedBanner = next;
                break;
            }
        }
        return mDPRelatedBanner;
    }
}
