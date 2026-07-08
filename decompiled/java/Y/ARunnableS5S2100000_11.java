package Y;

import X.C15TA;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS5S2100000_11 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LJ((Long) this.l2, "explore_topic_id");
        C15TA c15ta = C15TA.LIZ;
        String strValueOf = String.valueOf((Long) this.l2);
        String str = this.s0;
        c15ta.getClass();
        c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(strValueOf, str));
        c2344009Gk.LJIIIIZZ("action_type", this.s1);
        C20684815ws.LJIILLIIL("ttexp_topic_unpin_confirm_dialog_click", c2344009Gk.LIZ);
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LJ((Long) this.l2, "explore_topic_id");
        C15TA c15ta = C15TA.LIZ;
        String strValueOf = String.valueOf((Long) this.l2);
        String str = this.s0;
        c15ta.getClass();
        c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(strValueOf, str));
        c2344009Gk.LJIIIIZZ("post_num", this.s1);
        C20684815ws.LJIILLIIL("ttexp_topic_pin_notice_show", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS5S2100000_11 aRunnableS5S2100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logUnpinDialogButton$1");
        try {
            aRunnableS5S2100000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logUnpinDialogButton$1");
    }

    public static final void run$1(ARunnableS5S2100000_11 aRunnableS5S2100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logNoticeShow$1");
        try {
            aRunnableS5S2100000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logNoticeShow$1");
    }

    public ARunnableS5S2100000_11(Long l, String str, String str2, int i) {
        this.$t = i;
        this.l2 = l;
        this.s0 = str;
        this.s1 = str2;
    }
}
