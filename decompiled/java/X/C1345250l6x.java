package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentDoubleTapToLikeGuideFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0l6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345250l6x {
    public static final C1345250l6x LIZ = new C1345250l6x();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(682));
    public static boolean LIZJ;

    public static void LIZ(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) ? 1 : 0, "is_video_author");
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LJ(Integer.valueOf(C735840Sti.LJIIIIZZ(author)), "follow_status");
        C20684815ws.LJIILLIIL("double_tap_like_comment_guide_show", c2344009Gk.LIZ);
    }

    public static void LIZIZ(C19EG c19eg, String str, Aweme aweme) {
        if (c19eg == null) {
            return;
        }
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("comment_double_tap_to_like_guide_fragment");
        if ((fragmentLJJJJZI instanceof CommentDoubleTapToLikeGuideFragment) && fragmentLJJJJZI != null) {
            if (aweme != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                c2344009Gk.LIZJ(C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) ? 1 : 0, "is_video_author");
                C735840Sti c735840Sti = C735840Sti.LIZ;
                User author = aweme.getAuthor();
                c735840Sti.getClass();
                c2344009Gk.LJ(Integer.valueOf(C735840Sti.LJIIIIZZ(author)), "follow_status");
                c2344009Gk.LJIIIIZZ("action_type", str);
                C20684815ws.LJIILLIIL("double_tap_like_comment_guide_action", c2344009Gk.LIZ);
            }
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
            c19ehLJIIJ.LJIIJ();
        }
    }
}
