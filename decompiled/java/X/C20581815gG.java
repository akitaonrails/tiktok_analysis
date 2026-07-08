package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.15gG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20581815gG {
    public static final C20581815gG LIZ = new C20581815gG();

    public static C0LAB LIZ(C20583215gU c20583215gU) {
        int i;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(c20583215gU.LIZ ? 1 : 0, "has_avatar_prompt");
        c0lab.LJ("default_landing_status", c20583215gU.LIZIZ);
        C1609930rzr.LJIJJ(c0lab, c20583215gU.LIZJ, c20583215gU.LIZLLL);
        c0lab.LJ("shoot_enter_from", c20583215gU.LJ);
        c0lab.LJ("shoot_enter_method", c20583215gU.LJFF);
        c0lab.LJ("creation_id", c20583215gU.LJII);
        c0lab.LIZ(c20583215gU.LJI ? 1 : 0, "is_avatar_thought_asynchronous_generated");
        if (c20583215gU.LJIIIIZZ != null) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_avatar_thought_try_it_out");
        String str = c20583215gU.LJIIIIZZ;
        if (str != null) {
            c0lab.LJ("try_it_out_position", str);
        }
        return c0lab;
    }

    public static void LIZIZ(EnumC1783060wV6 enumC1783060wV6, EnumC20582715gP enumC20582715gP) {
        String value;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", enumC1783060wV6.getValue());
        if (enumC20582715gP != null) {
            value = enumC20582715gP.getValue();
        } else {
            value = null;
        }
        c0lab.LJ("fail_reason", value);
        C20684815ws.LJIILLIIL("avatar_thoughts_upload_request", c0lab.LIZ);
    }

    public static void LIZJ(Aweme aweme, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("entrance_type", "thought");
        c0lab.LJ("group_id", C735370Ssx.LIZJ(aweme));
        c0lab.LJ("position", str);
        C20684815ws.LJIILLIIL("story_try_out_click", c0lab.LIZ);
    }

    public static void LIZLLL(Aweme aweme, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("entrance_type", "thought");
        c0lab.LJ("group_id", C735370Ssx.LIZJ(aweme));
        c0lab.LJ("position", str);
        C20684815ws.LJIILLIIL("story_try_out_show", c0lab.LIZ);
    }
}
