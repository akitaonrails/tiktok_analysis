package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0chN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021870chN {
    public static boolean LIZ(Context context, Aweme aweme) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (!C1030670cvZ.LIZ(microAppUrl)) {
            return false;
        }
        C988700bps.LIZ.LIZIZ().openMiniApp(context, microAppUrl, new C1611490s2N());
        return true;
    }
}
