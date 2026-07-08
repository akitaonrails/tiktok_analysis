package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0kzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340510kzJ {
    public static final C1340510kzJ LIZ = new C1340510kzJ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(471));
    public static volatile boolean LIZJ;

    public static boolean LIZIZ(CommentContextSource commentContextSource) {
        CommentCommonModel commonModel;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null && commonModel.offlineCommentMode) {
            return true;
        }
        return false;
    }

    public static void LIZJ(View view) {
        if (LIZJ) {
            return;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("offline_toast_cnt_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = LIZIZ;
        int i = ((Keva) c01gw.getValue()).getInt(strLIZIZ, 0);
        if (i >= 5) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(view);
        c1389880mGw.LJIIIIZZ(2131838509);
        c1389880mGw.LJIIJ();
        LIZJ = true;
        ((Keva) c01gw.getValue()).storeInt(strLIZIZ, i + 1);
    }

    public static boolean LIZ(CommentContextSource commentContextSource, View view) {
        if (!LIZIZ(commentContextSource)) {
            return false;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(view);
        c1389880mGw.LJIIIIZZ(2131838507);
        c1389880mGw.LJIIJ();
        return true;
    }
}
