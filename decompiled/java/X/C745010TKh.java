package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.ab.LivePreviewCommentBoxConfig;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745010TKh {
    public static final LivePreviewCommentBoxConfig LIZ = new LivePreviewCommentBoxConfig(false, 0, 3000, 10000, 1000, 5, 3, 7, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(256));

    public static final LivePreviewCommentBoxConfig LIZIZ() {
        return (LivePreviewCommentBoxConfig) LIZIZ.getValue();
    }

    public static final boolean LIZ() {
        return LIZIZ().style == 1;
    }

    public static final boolean LIZJ() {
        return LIZIZ().enable && LIZIZ().style != 0;
    }

    public static final boolean LIZLLL(C1ACA c1aca) {
        if (!LIZJ() || c1aca == null) {
            return false;
        }
        if (!TextUtils.equals(c1aca.LIZLLL, "homepage_follow") && !TextUtils.equals(c1aca.LIZLLL, "homepage_hot")) {
            return false;
        }
        return true;
    }
}
