package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Xjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857150Xjt {
    public static final C857150Xjt LIZ = new C857150Xjt();
    public static C1440930nbH LIZIZ;

    public static void LIZ(C0LAB c0lab) {
        Integer num;
        C1440930nbH c1440930nbH = LIZIZ;
        if (c1440930nbH != null && (num = c1440930nbH.LIZLLL) != null) {
            c0lab.LIZ(num.intValue(), "aweme_type");
        }
    }

    public static void LIZIZ(C0LAB c0lab) {
        String str;
        c0lab.LJ("user_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
        C1440930nbH c1440930nbH = LIZIZ;
        if (c1440930nbH == null || (str = c1440930nbH.LIZ) == null) {
            str = "";
        }
        c0lab.LJ("group_id", str);
        LIZ(c0lab);
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        int i;
        C0LAB c0lab = new C0LAB();
        if (LIZIZ != null) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "after_post");
        c0lab.LJ("to_user_id", str);
        C580270MpN.LIZJ(videoPublishEditModel, c0lab, str2);
        LIZ(c0lab);
        C20684815ws.LJIILLIIL("add_at_friends", c0lab.LIZ);
    }
}
