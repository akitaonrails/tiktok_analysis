package Y;

import X.C15TA;
import X.C15UA;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS0S4102000_11 implements Runnable {
    public final int $t;
    public int i5;
    public int i6;
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
        C15TA c15ta = C15TA.LIZ;
        String str = this.s0;
        String str2 = this.s1;
        c15ta.getClass();
        c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(str, str2));
        c2344009Gk.LJIIIIZZ("explore_topic_id", this.s0);
        c2344009Gk.LIZJ(this.i5 + 1, "topic_position");
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LJIIIIZZ("card_position", this.s2);
        c2344009Gk.LIZJ(this.i6, "card_index");
        c2344009Gk.LIZJ(Intrinsics.LJFF((Boolean) this.l4, Boolean.TRUE) ? 1 : 0, "is_first_screen");
        c2344009Gk.LJIIIIZZ("request_id", this.s3);
        c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(this.s3));
        C20684815ws.LJIILLIIL("ttexp_topic_click", c2344009Gk.LIZ);
    }

    public final void LIZ$1() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C15TA c15ta = C15TA.LIZ;
        String str = this.s0;
        String str2 = this.s1;
        c15ta.getClass();
        c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(str, str2));
        c2344009Gk.LJIIIIZZ("explore_topic_id", this.s0);
        c2344009Gk.LIZJ(this.i5 + 1, "topic_position");
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LJIIIIZZ("card_position", this.s2);
        c2344009Gk.LIZJ(this.i6, "card_index");
        c2344009Gk.LIZJ(Intrinsics.LJFF((Boolean) this.l4, Boolean.TRUE) ? 1 : 0, "is_first_screen");
        c2344009Gk.LJIIIIZZ("request_id", this.s3);
        c2344009Gk.LJIIIIZZ("is_first_refresh", C15UA.LIZIZ(this.s3));
        C20684815ws.LJIILLIIL("ttexp_topic_show", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS0S4102000_11 aRunnableS0S4102000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logTopicClick$1");
        try {
            aRunnableS0S4102000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicClick$1");
    }

    public static final void run$1(ARunnableS0S4102000_11 aRunnableS0S4102000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logTopicShow$1");
        try {
            aRunnableS0S4102000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicShow$1");
    }

    public ARunnableS0S4102000_11(String str, String str2, int i, String str3, int i2, Boolean bool, String str4, int i3) {
        this.$t = i3;
        this.s0 = str;
        this.s1 = str2;
        this.i5 = i;
        this.s2 = str3;
        this.i6 = i2;
        this.l4 = bool;
        this.s3 = str4;
    }
}
