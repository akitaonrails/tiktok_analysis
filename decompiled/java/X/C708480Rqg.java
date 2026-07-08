package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Rqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708480Rqg {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context, Aweme aweme) {
        Activity activityLIZ;
        boolean z = false;
        if (aweme == null) {
            return false;
        }
        boolean zLL = C1017070cZd.LL(aweme);
        if (!aweme.isAd() && zLL) {
            z = true;
            if (context != null && (activityLIZ = C085T.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131824738);
                c1389890mGx.LJIIJJI();
            }
        }
        return z;
    }
}
