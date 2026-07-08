package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import pyl.s;

/* JADX INFO: renamed from: X.0no3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448850no3 {
    public static final void LIZIZ(ShortVideoContext shortVideoContext) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        if (C0CHQ.LIZ().LJJIIZI().LJJLI(false)) {
            str = "show";
        } else {
            str = "hide";
        }
        c0lab.LJ("to_status", str);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            c0lab.LIZ(i, "draft_id");
        }
        if (shortVideoContext.newDraftId.length() > 0) {
            c0lab.LJ("new_draft_id", shortVideoContext.newDraftId);
        }
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        C20684815ws.LJIILLIIL("edit_speed", c0lab.LIZ);
    }

    public static final void LIZ(ShortVideoContext shortVideoContext, s sVar) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LIZ(shortVideoContext.draftId, "draft_id");
        c0lab.LJ("speed_mode", sVar.description());
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        C20684815ws.LJIILLIIL("choose_speed_mode", c0lab.LIZ);
    }
}
