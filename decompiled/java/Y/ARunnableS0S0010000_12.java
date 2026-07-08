package Y;

import X.C0TU5;
import X.C10SW;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS0S0010000_12 implements Runnable {
    public final int $t;
    public boolean z0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S0010000_12 aRunnableS0S0010000_12) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserLinkTracker@4abb.onShortToLongSuccess$runnable$1");
        try {
            C10SW c10sw = C10SW.LIZ;
            Boolean boolValueOf = Boolean.valueOf(aRunnableS0S0010000_12.z0);
            c10sw.getClass();
            C10SW.LJIIL(boolValueOf, "short_to_long_success", null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserLinkTracker@4abb.onShortToLongSuccess$runnable$1");
    }

    public static final void run$1(ARunnableS0S0010000_12 aRunnableS0S0010000_12) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserLinkTracker@4abb.onShortToLongFailed$runnable$1");
        try {
            C10SW c10sw = C10SW.LIZ;
            Boolean boolValueOf = Boolean.valueOf(aRunnableS0S0010000_12.z0);
            c10sw.getClass();
            C10SW.LJIIL(boolValueOf, "short_to_long_failed", null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserLinkTracker@4abb.onShortToLongFailed$runnable$1");
    }

    public static final void run$2(ARunnableS0S0010000_12 aRunnableS0S0010000_12) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserLinkTracker@4abb.onShortToLongStart$runnable$1");
        try {
            C10SW c10sw = C10SW.LIZ;
            Boolean boolValueOf = Boolean.valueOf(aRunnableS0S0010000_12.z0);
            c10sw.getClass();
            C10SW.LJIIL(boolValueOf, "short_to_long_start", null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserLinkTracker@4abb.onShortToLongStart$runnable$1");
    }

    public static final void run$3(ARunnableS0S0010000_12 aRunnableS0S0010000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackEnterPage$1");
        try {
            C0TU5 c0tu5 = C0TU5.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c0tu5.getClass();
            C0TU5.LIZ(c2344009Gk);
            c2344009Gk.LJIIIIZZ("if_new_reply", String.valueOf(aRunnableS0S0010000_12.z0 ? 1 : 0));
            C20684815ws.LJIILLIIL("enter_feedback_and_help_na", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackEnterPage$1");
    }

    public ARunnableS0S0010000_12(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
