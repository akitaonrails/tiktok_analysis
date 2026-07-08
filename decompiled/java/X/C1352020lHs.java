package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.model.SurpriseResource;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0lHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352020lHs {
    public static final C1352020lHs LIZ = new C1352020lHs();

    public static final C2344009Gk LIZ(C1352030lHt c1352030lHt) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("comment_id", c1352030lHt.LIZ);
        c2344009Gk.LJIIIIZZ("enter_from", c1352030lHt.LIZLLL);
        c2344009Gk.LJIIIIZZ("group_id", c1352030lHt.LIZIZ);
        c2344009Gk.LJ(c1352030lHt.LIZJ, "is_video_author");
        c2344009Gk.LJIIIIZZ("enter_from", c1352030lHt.LIZLLL);
        c2344009Gk.LJIIIIZZ("follow_status", c1352030lHt.LJ);
        c2344009Gk.LJ(c1352030lHt.LJI, "easter_egg_type");
        c2344009Gk.LJ(c1352030lHt.LJFF, "easter_egg_id");
        c2344009Gk.LJIIIIZZ("keyword", c1352030lHt.LJII);
        c2344009Gk.LJ(c1352030lHt.LJIIIIZZ, "has_sound");
        c2344009Gk.LJ(c1352030lHt.LJIIIZ, "activity_id");
        return c2344009Gk;
    }

    public static final void LIZJ(CommentSurprise commentSurprise) {
        Integer num;
        SurpriseResource surpriseResource;
        SurpriseResource surpriseResource2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Long l = null;
        if (commentSurprise != null && (surpriseResource2 = commentSurprise.surpriseResource) != null) {
            num = surpriseResource2.effectId;
        } else {
            num = null;
        }
        c2344009Gk.LJ(num, "easter_egg_id");
        if (commentSurprise != null && (surpriseResource = commentSurprise.surpriseResource) != null) {
            l = surpriseResource.activityId;
        }
        c2344009Gk.LJ(l, "activity_id");
        C20684815ws.LJIILLIIL("comment_easter_egg_trigger", c2344009Gk.LIZ);
    }

    public static final void LIZLLL(boolean z, boolean z2) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str = "client";
        } else {
            str = "server";
        }
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        if (z) {
            c2344009Gk.LIZJ(z2 ? 1 : 0, "has_cache");
        }
        C20684815ws.LJIILLIIL("first_comment_surprise_trigger", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(CommentSurpriseStruct commentSurpriseStruct, Boolean bool, String str) {
        String str2;
        Integer num;
        CommentSurprise commentSurprise;
        SurpriseResource surpriseResource;
        CommentSurprise commentSurprise2;
        SurpriseResource surpriseResource2;
        if (bool == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (bool.booleanValue()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("show", str2);
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("reason", str);
        Long l = null;
        if (commentSurpriseStruct != null && (commentSurprise2 = commentSurpriseStruct.commentSurprise) != null && (surpriseResource2 = commentSurprise2.surpriseResource) != null) {
            num = surpriseResource2.effectId;
        } else {
            num = null;
        }
        c2344009Gk.LJ(num, "easter_egg_id");
        if (commentSurpriseStruct != null && (commentSurprise = commentSurpriseStruct.commentSurprise) != null && (surpriseResource = commentSurprise.surpriseResource) != null) {
            l = surpriseResource.activityId;
        }
        c2344009Gk.LJ(l, "activity_id");
        C20684815ws.LJIILLIIL("comment_egg_show_status", c2344009Gk.LIZ);
    }
}
