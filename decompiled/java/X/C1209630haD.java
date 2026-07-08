package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;

/* JADX INFO: renamed from: X.0haD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209630haD {
    public static boolean LIZ(Activity activity) {
        if ((activity instanceof C19EG) && FeedSharePlayerViewModel.getPlayerManager((C19EG) activity) != null) {
            return true;
        }
        return false;
    }
}
