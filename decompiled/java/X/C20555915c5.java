package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.15c5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20555915c5 {
    public static boolean LIZ(Aweme aweme) {
        if (aweme != null && !aweme.getIsTikTokStory() && aweme.getAwemeType() != 11 && aweme.getAwemeType() != 2 && aweme.getAwemeType() != 101 && !aweme.isAd() && !C1017070cZd.LLIZLLLIL(aweme)) {
            return true;
        }
        return false;
    }
}
