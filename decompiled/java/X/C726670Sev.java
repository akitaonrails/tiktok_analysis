package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: X.0Sev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726670Sev implements InterfaceC2273731Dz9 {
    public static final C726670Sev LIZ = new C726670Sev();

    @Override // X.InterfaceC2273731Dz9
    public final void LIZ(int i) {
        String aid;
        String uid;
        String str;
        String str2;
        Video video;
        User author;
        if (C726680Sew.LIZIZ != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", C726680Sew.LIZJ);
            Aweme aweme = C726680Sew.LIZIZ;
            Integer numValueOf = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            Aweme aweme2 = C726680Sew.LIZIZ;
            if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            Aweme aweme3 = C726680Sew.LIZIZ;
            if (aweme3 != null && (video = aweme3.getVideo()) != null) {
                numValueOf = Integer.valueOf(video.getDuration());
            }
            c2344009Gk.LJ(numValueOf, "item_duration");
            c2344009Gk.LIZJ(C726680Sew.LIZLLL, "is_landscape_screen");
            Aweme aweme4 = C726680Sew.LIZIZ;
            if (aweme4 != null && aweme4.isPaidContent) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_collection_item", str);
            if (i != 0 && i != 180) {
                str2 = "landscape";
            } else {
                str2 = "portrait";
            }
            c2344009Gk.LJIIIIZZ("to_status", str2);
            C0SXF.LJFF(c2344009Gk, C726680Sew.LJ, C726680Sew.LIZIZ, ActivityStack.getTopActivity(), false);
            C20684815ws.LJIILLIIL("turn_screen", c2344009Gk.LIZ);
        }
    }
}
