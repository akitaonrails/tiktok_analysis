package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0mcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403450mcp {
    public static final C1403450mcp LIZ = new C1403450mcp();

    public static void LIZ(ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LIZ(shortVideoContext.draftId, "draft_id");
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        C20684815ws.LJIILLIIL("count_down", c0lab.LIZ);
    }
}
