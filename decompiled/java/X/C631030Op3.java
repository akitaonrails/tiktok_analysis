package X;

import com.ss.android.ugc.aweme.music.model.MDPRelatedBanner;
import com.ss.android.ugc.aweme.music.model.MDPRelatedBannerType;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Op3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631030Op3 {
    public static final C631030Op3 LIZ = new C631030Op3();

    public static MDPRelatedBanner LIZ(MusicDetail musicDetail) {
        List<MDPRelatedBanner> list = musicDetail.relatedBanners;
        MDPRelatedBanner mDPRelatedBanner = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator<MDPRelatedBanner> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            MDPRelatedBanner next = it2.next();
            if (next.getBannerType() == MDPRelatedBannerType.TEMPLATE) {
                mDPRelatedBanner = next;
                break;
            }
        }
        return mDPRelatedBanner;
    }
}
