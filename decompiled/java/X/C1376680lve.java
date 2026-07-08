package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0lve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376680lve {
    public static InterfaceC1370310llN LIZ(Activity activity, String str, Aweme aweme, String str2) {
        if (!C1373290lqB.LIZ("captions", str2, aweme.awemeACLShareInfo)) {
            return null;
        }
        if ((C300940Bqu.LIZ() && !C10EU.LJIILLIIL(aweme.getAuthor())) || !C293260BeW.LIZ() || aweme.getAwemeType() == 150 || C1383320m6M.LIZ(aweme)) {
            return null;
        }
        return C1373290lqB.LIZJ(new C1381070m2j(activity, aweme, str), str2, aweme.awemeACLShareInfo);
    }
}
