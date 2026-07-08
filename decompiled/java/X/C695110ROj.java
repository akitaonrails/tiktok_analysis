package X;

import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* JADX INFO: renamed from: X.0ROj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695110ROj {
    public static final String LIZ(C690870R8b c690870R8b) {
        String str;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String storyShootEnterFrom;
        C0RF0 c0rf0 = c690870R8b.LIZLLL;
        if (c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null || (storyShootEnterFrom = c2189821An6.getStoryShootEnterFrom()) == null) {
            C0RF0 c0rf02 = c690870R8b.LIZLLL;
            if (c0rf02 == null || (str = c0rf02.LJIIIZ) == null) {
                return "";
            }
            return str;
        }
        return storyShootEnterFrom;
    }
}
