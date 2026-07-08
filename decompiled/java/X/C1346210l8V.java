package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0l8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346210l8V {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Comment comment, Aweme aweme) {
        if (aweme == null || comment == null) {
            return false;
        }
        if ((C1336205Ku.LIZJ().LIZJ() && !C1350950lG9.LIZIZ.enableShare()) || C729510SjV.LJJ(aweme)) {
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "long_press_to_share_comment", true) == 2) {
            return true;
        }
        int status = comment.getStatus();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "long_press_to_share_comment", true) != 1 || status == 2 || status == 4 || status == 7 || status == 11 || comment.getDisableShareToDmReason() != 0) {
            return false;
        }
        return true;
    }
}
