package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0j0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264420j0a {
    public static final C1264420j0a LIZ = new C1264420j0a();

    public static Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("following_and_follower_visibility_guide_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ() {
        LIZ().storeBoolean("inline_notice_has_seen", true);
    }

    public static void LIZJ() {
        LIZ().storeInt("weak_guide_show_count", 4);
    }

    public static boolean LIZLLL() {
        return LIZ().getInt("weak_guide_show_count", 0) <= 3;
    }
}
