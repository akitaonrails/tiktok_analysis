package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0MWG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MWG {
    public static final C0MWG LIZ = new C0MWG();

    public static void LIZIZ(boolean z, ShortVideoContext shortVideoContext) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "shoot_page_edit_tab");
        c0lab.LJ("is_from_edit_tab", "1");
        C0MJO.LIZIZ(shortVideoContext.creativeModel, c0lab);
        if (z) {
            str = "top";
        } else {
            str = "middle";
        }
        c0lab.LJ("position", str);
        C20684815ws.LJIILLIIL("new_edit_button_click", c0lab.LIZ);
    }

    public static void LIZJ(boolean z, ShortVideoContext shortVideoContext) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "shoot_page_edit_tab");
        c0lab.LIZ(C286480BKs.LIZ() ? 1 : 0, "ai_create_tag_status");
        c0lab.LJ("is_from_edit_tab", "1");
        C0MJO.LIZIZ(shortVideoContext.creativeModel, c0lab);
        if (z) {
            str = "top";
        } else {
            str = "middle";
        }
        c0lab.LJ("position", str);
        C20684815ws.LJIILLIIL("new_edit_button_show", c0lab.LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r28, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MWG.LIZ(java.lang.String, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, boolean):void");
    }
}
