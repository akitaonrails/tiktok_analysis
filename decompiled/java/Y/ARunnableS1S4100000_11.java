package Y;

import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS1S4100000_11 implements Runnable {
    public final int $t;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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
        c2344009Gk.LJIIIIZZ("action_type", this.s0);
        c2344009Gk.LJIIIIZZ("enter_from", this.s1);
        c2344009Gk.LJ((Long) this.l4, "explore_topic_id");
        c2344009Gk.LJIIIIZZ("explore_topic", this.s2);
        c2344009Gk.LJIIIIZZ("post_num", this.s3);
        C20684815ws.LJIILLIIL("ttexp_topic_pin_notice_close", c2344009Gk.LIZ);
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.s0);
        c2344009Gk.LJ((Long) this.l4, "explore_topic_id");
        c2344009Gk.LJIIIIZZ("explore_topic", this.s1);
        c2344009Gk.LJIIIIZZ("from_explore_page", this.s2);
        String str = this.s3;
        if (str != null) {
            c2344009Gk.LJFF("post_num", str);
        }
        C20684815ws.LJIILLIIL("ttexp_topic_scroll_end_show", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS1S4100000_11 aRunnableS1S4100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logTopicPinNoticeClose$1");
        try {
            aRunnableS1S4100000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicPinNoticeClose$1");
    }

    public static final void run$1(ARunnableS1S4100000_11 aRunnableS1S4100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logTopicScrollEndShow$1");
        try {
            aRunnableS1S4100000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicScrollEndShow$1");
    }

    public ARunnableS1S4100000_11(Long l, String str, String str2, int i) {
        this.$t = i;
        this.s0 = "click_x";
        this.s1 = "homepage_explore";
        this.l4 = l;
        this.s2 = str;
        this.s3 = str2;
    }

    public ARunnableS1S4100000_11(Long l, String str, String str2, String str3, int i) {
        this.$t = i;
        this.s0 = "homepage_explore";
        this.l4 = l;
        this.s1 = str;
        this.s2 = str2;
        this.s3 = str3;
    }
}
