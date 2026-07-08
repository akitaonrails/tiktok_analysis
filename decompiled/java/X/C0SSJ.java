package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSJ {
    public static boolean LIZ(Aweme aweme) {
        boolean z;
        C735280Sso.LIZ.getClass();
        boolean zLJFF = C735280Sso.LJFF(aweme);
        if (aweme.getAuthor() != null && C2093608Ic.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), aweme.getAuthor().getUid())) {
            z = true;
        } else {
            z = false;
        }
        if (zLJFF && z) {
            return true;
        }
        return false;
    }
}
