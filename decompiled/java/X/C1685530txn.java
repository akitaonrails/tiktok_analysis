package X;

/* JADX INFO: renamed from: X.0txn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685530txn {
    public static final C1685530txn LIZ = new C1685530txn();

    public static void LIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("connect_now_block_popup", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("action_type", str);
        C20684815ws.LJIILLIIL("connect_now_exit_page", c2344009Gk.LIZ);
    }

    public static void LIZLLL(Long l, Long l2, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", "connect_now_wait_page");
        c2344009Gk.LJ(l, "connect_now_wait_time");
        c2344009Gk.LJ(l2, "connect_now_time_spent");
        C20684815ws.LJIILLIIL("connect_now_friends_page", c2344009Gk.LIZ);
    }

    public static void LJ(Long l, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJ(l, "connect_now_wait_time");
        C20684815ws.LJIILLIIL("connect_now_wait_page", c2344009Gk.LIZ);
    }

    public static void LIZJ(Long l, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("from_user_id", str);
        c2344009Gk.LJIIIIZZ("to_user_id", str2);
        c2344009Gk.LJIIIIZZ("action_type", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJ(l, "connect_now_show_friend_latency");
        C20684815ws.LJIILLIIL("connect_now_friend_banner", c2344009Gk.LIZ);
    }
}
