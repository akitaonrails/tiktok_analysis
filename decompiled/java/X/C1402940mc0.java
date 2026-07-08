package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402940mc0 {
    public static final C0LAB LIZ(ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("content_source", "shoot");
        c0lab.LJ("content_type", "video");
        return c0lab;
    }

    public static final String LIZIZ(ShortVideoContext shortVideoContext) {
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "duet")) {
            return "duet";
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "stitch")) {
            return "stitch";
        }
        if (shortVideoContext.shootMode == 15) {
            return "quick";
        }
        return "camera";
    }

    public static final void LJ(ShortVideoContext shortVideoContext) {
        C0LAB c0labLIZ = LIZ(shortVideoContext);
        c0labLIZ.LJ("enter_method_popup", LIZIZ(shortVideoContext));
        c0labLIZ.LIZ(shortVideoContext.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(0, "is_from_external");
        C20684815ws.LJIILLIIL("show_exit_shoot_popup", c0labLIZ.LIZ);
    }

    public static final void LIZJ(ShortVideoContext shortVideoContext, String str) {
        C0LAB c0labLIZ = LIZ(shortVideoContext);
        c0labLIZ.LJ("enter_method_popup", LIZIZ(shortVideoContext));
        c0labLIZ.LJ("to_status", str);
        c0labLIZ.LIZ(shortVideoContext.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(0, "is_from_external");
        C20684815ws.LJIILLIIL("exit_shoot_popup_result", c0labLIZ.LIZ);
    }

    public static final void LIZLLL(String str, ShortVideoContext shortVideoContext, boolean z) {
        String str2;
        C1444920nhi c1444920nhi = C1444920nhi.LIZ;
        C0LAB c0labLIZ = LIZ(shortVideoContext);
        c0labLIZ.LJ("enter_method_popup", LIZIZ(shortVideoContext));
        c0labLIZ.LJ("to_status", str);
        c0labLIZ.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        c0labLIZ.LIZ(shortVideoContext.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(0, "is_from_external");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZ.LJ("is_land_to_creation_flow", str2);
        c1444920nhi.getClass();
        C1444920nhi.LIZ(shortVideoContext, c0labLIZ, "exit_shoot_popup_result");
        C20684815ws.LJIILLIIL("exit_shoot_popup_result", c0labLIZ.LIZ);
    }
}
