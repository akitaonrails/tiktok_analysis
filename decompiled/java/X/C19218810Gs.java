package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10Gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19218810Gs {
    public static void LIZ(int i, User user, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "impr_order");
        c2344009Gk.LJIIIIZZ("rec_reason", "ai_recommend");
        c2344009Gk.LJIIIIZZ("rec_uid", user.getUid());
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("follow_card_ai_info_feedback", c2344009Gk.LIZ);
    }

    public static void LIZIZ(int i, User user, String str) {
        boolean z;
        String str2;
        boolean z2 = false;
        if (C296570Bjr.LIZ() != 2 && C296570Bjr.LIZ() != 3) {
            z = false;
        } else {
            z = true;
        }
        if (Boolean.valueOf(z).booleanValue() && !C2105908Mv.LIZ(user.getRecommendReason())) {
            z2 = true;
        }
        if (Boolean.valueOf(z2).booleanValue()) {
            str2 = "ai_recommend";
        } else {
            str2 = "super_account";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_follow");
        c2344009Gk.LJIIIIZZ("event_type", str);
        c2344009Gk.LIZJ(i, "impr_order");
        c2344009Gk.LJIIIIZZ("rec_reason", str2);
        c2344009Gk.LJIIIIZZ("rec_uid", user.getUid());
        c2344009Gk.LJIIIIZZ("rec_user_type", C735370Ssx.LJJIFFI(user));
        c2344009Gk.LJIIIIZZ("trigger_reason", "cold_launch");
        C20684815ws.LJIILLIIL("follow_card", c2344009Gk.LIZ);
    }
}
