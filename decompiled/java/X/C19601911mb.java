package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.11mb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19601911mb {
    public static final boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (!aweme.getIsTikTokStory() && aweme.getAwemeType() != 40) {
            return false;
        }
        return true;
    }
}
