package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734080Sqs {
    public static final C734080Sqs LIZ = new C734080Sqs();

    public static void LIZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", str);
        c2344009Gk.LJIIIIZZ("view_type", str2);
        c2344009Gk.LJIIIIZZ("action_type", str3);
        if (Intrinsics.LJFF(str2, "visitor") && str4 != null) {
            c2344009Gk.LJFF("to_user_id", str4);
        }
        C20684815ws.LJIILLIIL("click_long_press_panel", c2344009Gk.LIZ);
    }
}
