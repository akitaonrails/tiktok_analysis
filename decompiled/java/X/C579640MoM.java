package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0MoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579640MoM {
    public static final C579640MoM LIZ = new C579640MoM();
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;

    public static C0LAB LIZ() {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", LIZJ);
        c0lab.LJ("creation_id", LIZIZ);
        c0lab.LJ("enter_from", LIZLLL);
        c0lab.LJ("content_type", LJ);
        c0lab.LJ("content_source", LJFF);
        c0lab.LJ("enter_from", "video_edit_page");
        return c0lab;
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return;
        }
        LIZIZ = shortVideoContext.getCreationId();
        LIZJ = shortVideoContext.shootWay;
        LIZLLL = shortVideoContext.enterFrom;
        LJ = "video";
        LJFF = "shoot";
    }
}
