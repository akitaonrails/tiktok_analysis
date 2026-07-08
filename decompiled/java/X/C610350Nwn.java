package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0Nwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C610350Nwn {
    public static boolean LIZ(Aweme aweme, String str) {
        if (aweme != null && TextUtils.equals(str, "collection_video") && !AwemeExtKt.isCollected(aweme)) {
            if (!aweme.isCanPlay() || C0OAD.LIZIZ(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
