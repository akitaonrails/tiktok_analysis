package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentExtKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347720lAw {
    public static C1347440lAU LIZ;

    public static final C1347730lAx LJIIIZ() {
        return new C1347730lAx(true, EnumC1347390lAP.PHOTO_COMMENT_EDIT_PAGE.getDescription(), EnumC1344000l4w.VISUAL_POET.getDescription(), null, 0, null, null, null, null, null, null, null, null, null, 65528);
    }

    public static final C1347730lAx LIZ(Aweme aweme) {
        String description;
        String description2;
        if (aweme == null) {
            return null;
        }
        boolean z = true;
        if (!C1354660lM8.LIZIZ(aweme)) {
            z = false;
        }
        if (C1354660lM8.LIZIZ(aweme)) {
            description = EnumC1347390lAP.COMMENT_PANEL_OUTER.getDescription();
        } else {
            description = EnumC1347390lAP.COMMENT_PANEL_UPLOAD.getDescription();
        }
        if (C1354660lM8.LIZIZ(aweme)) {
            description2 = EnumC1344000l4w.MIX.getDescription();
        } else {
            description2 = EnumC1344000l4w.UPLOAD.getDescription();
        }
        return new C1347730lAx(z, description, description2, null, 0, null, null, null, null, null, null, null, null, null, 65528);
    }

    public static final void LJ(C2344009Gk c2344009Gk) {
        Integer numValueOf;
        C18T4 c18t4LJI;
        C311030CHd.LIZ.getClass();
        if (C311030CHd.LIZ() && ((Boolean) C0BA1.LIZ.getValue()).booleanValue()) {
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (c18t4LJI = iAiChatFeatureService.LJI()) != null) {
                numValueOf = Integer.valueOf(c18t4LJI.LIZ());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "vp_process_cnt");
        }
    }

    public static final C1347730lAx LJII(Comment comment) {
        return new C1347730lAx(true, EnumC1347390lAP.COMMENT_FOLLOW_ANCHOR.getDescription(), EnumC1344000l4w.VISUAL_POET.getDescription(), null, 0, null, null, null, comment, null, null, null, null, null, 65016);
    }

    public static final C1347730lAx LJIIIIZZ(Comment comment) {
        return new C1347730lAx(true, EnumC1347390lAP.COMMENT_PANEL_CREATE.getDescription(), EnumC1344000l4w.VISUAL_POET.getDescription(), null, 0, null, null, null, comment, null, null, null, null, null, 65016);
    }

    public static final C1347730lAx LJIIJ(Comment comment) {
        boolean zLJFF;
        String description;
        if (comment != null) {
            zLJFF = Intrinsics.LJFF(CommentExtKt.isAIImageComment(comment), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String description2 = EnumC1347390lAP.PHOTO_COMMENT_INNER_FEED_FOLLOW_ANCHOR.getDescription();
        if (comment != null && Intrinsics.LJFF(CommentExtKt.isAIImageComment(comment), Boolean.TRUE)) {
            description = EnumC1344000l4w.VISUAL_POET.getDescription();
        } else {
            description = EnumC1344000l4w.UPLOAD.getDescription();
        }
        return new C1347730lAx(zLJFF, description2, description, null, 0, null, null, null, comment, null, null, null, null, null, 65016);
    }

    public static final C1347730lAx LJIIJJI(Comment comment) {
        return new C1347730lAx(true, EnumC1347390lAP.COMMENT_PANEL_OUTER.getDescription(), EnumC1344000l4w.MIX.getDescription(), null, 0, null, null, null, comment, null, null, null, null, null, 65016);
    }

    public static final void LJIIL(C1347440lAU c1347440lAU) {
        String groupId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", c1347440lAU.LIZIZ);
        Aweme aweme = c1347440lAU.LIZ;
        if (aweme != null) {
            groupId = aweme.getGroupId();
        } else {
            groupId = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        Aweme aweme2 = c1347440lAU.LIZ;
        int i = 0;
        if (aweme2 != null && AwemeExtKt.isPhotoMode(aweme2)) {
            i = 150;
        }
        c2344009Gk.LIZJ(i, "aweme_type");
        c2344009Gk.LJIIIIZZ("step", c1347440lAU.LIZJ);
        c2344009Gk.LIZJ(c1347440lAU.LIZLLL ? 1 : 0, "select_photo");
        c2344009Gk.LJIIIIZZ("enter_from", c1347440lAU.LJ);
        C20684815ws.LJIILLIIL("create_photo_comment_performance_monitor", c2344009Gk.LIZ);
        if (!Intrinsics.LJFF(c1347440lAU.LIZJ, "enter_ai_chat_page")) {
            c1347440lAU = null;
        }
        LIZ = c1347440lAU;
    }

    public static final C1347730lAx LJIILL(Comment comment) {
        return new C1347730lAx(false, EnumC1347390lAP.COMMENT_PANEL_UPLOAD.getDescription(), EnumC1344000l4w.UPLOAD.getDescription(), null, 0, null, null, null, comment, null, null, null, null, null, 65016);
    }

    public static final C2344009Gk LIZIZ(C2344009Gk c2344009Gk, Comment comment) {
        if (comment == null || comment.getIsPhotoContained() == 0) {
            return c2344009Gk;
        }
        c2344009Gk.LJFF("photo_type", CommentExtKt.getPhotoType(comment));
        c2344009Gk.LIZJ(Intrinsics.LJFF(CommentExtKt.isAIImageComment(comment), Boolean.TRUE) ? 1 : 0, "is_visual_poet");
        return c2344009Gk;
    }

    public static final C2344009Gk LIZJ(C2344009Gk c2344009Gk, C1347730lAx c1347730lAx) {
        String str;
        int iIntValue;
        if (c1347730lAx != null) {
            str = c1347730lAx.LIZJ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, EnumC1344000l4w.VISUAL_POET.getDescription())) {
            return c2344009Gk;
        }
        Integer num = c1347730lAx.LJIILL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "is_gray");
        return c2344009Gk;
    }

    public static final C2344009Gk LIZLLL(C2344009Gk c2344009Gk, C1347730lAx c1347730lAx) {
        C18T4 c18t4LJI;
        Boolean boolLIZLLL;
        if (c1347730lAx == null) {
            return c2344009Gk;
        }
        c2344009Gk.LIZJ(c1347730lAx.LIZ ? 1 : 0, "is_visual_poet");
        c2344009Gk.LJFF("sub_position", c1347730lAx.LIZIZ);
        c2344009Gk.LJFF("photo_type", c1347730lAx.LIZJ);
        LJ(c2344009Gk);
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (c18t4LJI = iAiChatFeatureService.LJI()) != null && (boolLIZLLL = c18t4LJI.LIZLLL()) != null) {
            c2344009Gk.LIZJ(boolLIZLLL.booleanValue() ? 1 : 0, "is_vp_new_user");
            return c2344009Gk;
        }
        c2344009Gk.LJFF("is_vp_new_user", "");
        return c2344009Gk;
    }

    public static final C2344009Gk LJFF(C2344009Gk c2344009Gk, Aweme aweme) {
        int i;
        C18T4 c18t4LJI;
        Boolean boolLIZLLL;
        if (aweme == null) {
            return c2344009Gk;
        }
        c2344009Gk.LJFF("shoot_enter_method", EnumC1347390lAP.COMMENT_PANEL_UPLOAD.getDescription());
        if (AwemeExtKt.isPhotoMode(aweme)) {
            i = 150;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "aweme_type");
        LJ(c2344009Gk);
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (c18t4LJI = iAiChatFeatureService.LJI()) != null && (boolLIZLLL = c18t4LJI.LIZLLL()) != null) {
            c2344009Gk.LIZJ(boolLIZLLL.booleanValue() ? 1 : 0, "is_vp_new_user");
            return c2344009Gk;
        }
        c2344009Gk.LJFF("is_vp_new_user", "");
        return c2344009Gk;
    }

    public static final C2344009Gk LJI(C2344009Gk c2344009Gk, C1347730lAx c1347730lAx) {
        if (c1347730lAx == null) {
            return c2344009Gk;
        }
        c2344009Gk.LIZJ(c1347730lAx.LIZ ? 1 : 0, "is_visual_poet");
        c2344009Gk.LJFF("photo_type", c1347730lAx.LIZJ);
        if (c1347730lAx.LIZ) {
            c2344009Gk.LJFF("preload_image_status", c1347730lAx.LIZLLL);
            c2344009Gk.LIZJ(c1347730lAx.LJ, "upload_image_status");
            c2344009Gk.LJFF("vp_task_id", c1347730lAx.LJFF);
            Integer num = c1347730lAx.LJIIJJI;
            if (num != null) {
                c2344009Gk.LIZJ(num.intValue(), "is_history_photo");
            }
            Integer num2 = c1347730lAx.LJIIL;
            if (num2 != null) {
                c2344009Gk.LIZJ(num2.intValue(), "is_vp_generate_result_show");
            }
        }
        return c2344009Gk;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1347730lAx LJIILJJIL(java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1347720lAw.LJIILJJIL(java.lang.String, java.util.List):X.0lAx");
    }

    public static final void LJIILIIL(Aweme aweme, long j, C07YI c07yi) {
        String groupId;
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(c07yi.LIZIZ, "cover_origin_status");
        Integer numValueOf = null;
        if (aweme != null) {
            groupId = aweme.getGroupId();
        } else {
            groupId = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        c2344009Gk.LIZLLL(c07yi.LIZJ, "download_cover_duration");
        if (c07yi.LIZ.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i ^ 1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LIZJ(((Number) C0BJU.LIZ.getValue()).intValue(), "download_cover_type");
        c2344009Gk.LJIIIIZZ("error_message", c07yi.LIZLLL);
        C20684815ws.LJIILLIIL("ai_comment_download_cover", c2344009Gk.LIZ);
    }
}
