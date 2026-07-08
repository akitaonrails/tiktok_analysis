package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736360SuY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getVideo() == null && !C729510SjV.LJIJ(aweme) && !C1375880luM.LIZ(aweme)) {
            return false;
        }
        if (aweme.getAuthor() == null && !C1019620cdk.LIZIZ(3, aweme)) {
            return false;
        }
        return true;
    }
}
