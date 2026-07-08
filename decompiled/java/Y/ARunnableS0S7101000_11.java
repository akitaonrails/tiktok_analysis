package Y;

import X.C15UA;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS0S7101000_11 implements Runnable {
    public final int $t;
    public int i8;
    public Object l7;
    public String s0 = "homepage_explore";
    public String s1;
    public String s2;
    public String s3;
    public String s4;
    public String s5;
    public String s6;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.s0);
        c2344009Gk.LJIIIIZZ("card_position", this.s1);
        c2344009Gk.LJ((Integer) this.l7, "card_index");
        c2344009Gk.LIZJ(this.i8, "is_first_screen");
        c2344009Gk.LJIIIIZZ("request_id", this.s2);
        c2344009Gk.LJIIIIZZ("discussion_id", this.s3);
        c2344009Gk.LJIIIIZZ("discussion_name", this.s4);
        c2344009Gk.LJIIIIZZ("discussion_owner_id", this.s5);
        c2344009Gk.LJIIIIZZ("discussion_user_cnt", this.s6);
        c2344009Gk.LJIIIIZZ("explore_session_id", C15UA.LIZJ());
        String str = this.s2;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str));
        C20684815ws.LJIILLIIL("ttexp_discussion_card_show", c2344009Gk.LIZ);
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.s0);
        c2344009Gk.LJIIIIZZ("card_position", this.s1);
        c2344009Gk.LJ((Integer) this.l7, "card_index");
        c2344009Gk.LIZJ(this.i8, "is_first_screen");
        c2344009Gk.LJIIIIZZ("request_id", this.s2);
        c2344009Gk.LJIIIIZZ("discussion_id", this.s3);
        c2344009Gk.LJIIIIZZ("discussion_name", this.s4);
        c2344009Gk.LJIIIIZZ("discussion_owner_id", this.s5);
        c2344009Gk.LJIIIIZZ("discussion_user_cnt", this.s6);
        String str = this.s2;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(str));
        C20684815ws.LJIILLIIL("ttexp_discussion_card_show_accurate", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS0S7101000_11 aRunnableS0S7101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logDiscussionCardShow$1");
        try {
            aRunnableS0S7101000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logDiscussionCardShow$1");
    }

    public static final void run$1(ARunnableS0S7101000_11 aRunnableS0S7101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logDiscussionCardShowAccurate$1");
        try {
            aRunnableS0S7101000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logDiscussionCardShowAccurate$1");
    }

    public ARunnableS0S7101000_11(String str, int i, String str2, String str3, String str4, String str5, Integer num, String str6, int i2) {
        this.$t = i2;
        this.s1 = str;
        this.l7 = num;
        this.i8 = i;
        this.s2 = str2;
        this.s3 = str3;
        this.s4 = str4;
        this.s5 = str5;
        this.s6 = str6;
    }
}
