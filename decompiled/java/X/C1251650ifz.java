package X;

/* JADX INFO: renamed from: X.0ifz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251650ifz {
    public static final C1251650ifz LIZ = new C1251650ifz();

    public static void LIZ(EnumC1251640ify enumC1251640ify, int i, int i2, String str) {
        String str2;
        int i3 = C1251660ig0.LIZ[enumC1251640ify.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                str2 = "profile_viewers_fix_entrance";
            } else {
                str2 = "profile_viewers_avatar_carousel";
            }
        } else {
            str2 = "profile_viewers_capsule";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LIZJ(i, "profile_visitor_status");
        c2344009Gk.LIZJ(i2, "viewers_cnt");
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
    }
}
