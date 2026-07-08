package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.01Si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C336601Si {
    public static final C054G LIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static void LIZ(String str, long j, Aweme aweme, String str2, Boolean bool, Boolean bool2, int i) {
        String aid;
        String uid;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        String str3 = str2;
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            bool4 = null;
        }
        if ((i & 32) != 0) {
            bool3 = null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (aweme != null) {
            aid = aweme.getAid();
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            }
            C23250099c.LIZLLL(LIZ, null, null, new C336501Sh(str, aid, uid, jElapsedRealtime, str3, bool4, bool3, null), 3);
        }
        aid = null;
        uid = null;
        C23250099c.LIZLLL(LIZ, null, null, new C336501Sh(str, aid, uid, jElapsedRealtime, str3, bool4, bool3, null), 3);
    }
}
