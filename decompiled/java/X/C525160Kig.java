package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0Kig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525160Kig {
    public static final C525160Kig LIZ = new C525160Kig();

    public static void LIZ(ShortVideoContext shortVideoContext, EnumC538180L8u enumC538180L8u) {
        if (shortVideoContext == null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("action", enumC538180L8u.getValue());
        C20684815ws.LJIILLIIL("ttcrt_ai_pick_preview_page", c0lab.LIZ);
    }
}
