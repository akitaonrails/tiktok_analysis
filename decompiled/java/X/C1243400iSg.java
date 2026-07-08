package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iSg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243400iSg {
    public static final C1243400iSg LIZ = new C1243400iSg();

    public static void LIZIZ(C1243410iSh c1243410iSh) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c1243410iSh.LIZ);
        c2344009Gk.LJIIIIZZ("enter_alias_method", c1243410iSh.LIZIZ);
        c2344009Gk.LJIIIIZZ("action_type", c1243410iSh.LIZJ);
        int i = c1243410iSh.LIZLLL;
        if (i == C0SY7.FOLLOWED.getValue()) {
            str = "single";
        } else if (i == C0SY7.FOLLOW_MUTUAL.getValue()) {
            str = "mutual";
        } else {
            str = "null";
        }
        c2344009Gk.LJIIIIZZ("follow_type", str);
        c2344009Gk.LIZJ(c1243410iSh.LJ ? 1 : 0, "has_alias");
        c2344009Gk.LIZJ(c1243410iSh.LJFF, "others_alias_permission_type");
        c2344009Gk.LIZJ(c1243410iSh.LJI, "can_add_alias");
        String str2 = c1243410iSh.LJII;
        if (str2 != null) {
            c2344009Gk.LJFF("to_acc_type", str2);
        }
        C20684815ws.LJIILLIIL("settings_action_sheet", c2344009Gk.LIZ);
    }

    public static void LIZ(C1243410iSh c1243410iSh, String str, Boolean bool) {
        Integer num;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            num = 1;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            num = 0;
        } else {
            num = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", c1243410iSh.LIZ);
        c2344009Gk.LJIIIIZZ("enter_alias_method", c1243410iSh.LIZIZ);
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJ(num, "is_success");
        c2344009Gk.LIZJ(c1243410iSh.LJ ? 1 : 0, "has_alias");
        C20684815ws.LJIILLIIL("alias_pop_up_dialogue", c2344009Gk.LIZ);
    }
}
