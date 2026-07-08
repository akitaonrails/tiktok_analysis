package Y;

import X.C09JN;
import X.C1523590pkb;
import X.C1C7U;
import android.net.Uri;

/* JADX INFO: loaded from: classes24.dex */
public class AfS52S1100000_23 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS52S1100000_23 afS52S1100000_23, Object obj) {
        C1C7U.LIZ("EcLynxPerfTracker@d044.trackPrePage$2");
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        Uri uri = (Uri) afS52S1100000_23.l1;
        String str = afS52S1100000_23.s0;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "pre_activity_pause_start", true, null, false);
        C1C7U.LIZIZ("EcLynxPerfTracker@d044.trackPrePage$2");
    }

    public static final void accept$1(AfS52S1100000_23 afS52S1100000_23, Object obj) {
        C1C7U.LIZ("EcLynxPerfTracker@d044.trackPrePage$3");
        C1523590pkb c1523590pkb = C1523590pkb.LIZ;
        Uri uri = (Uri) afS52S1100000_23.l1;
        String str = afS52S1100000_23.s0;
        c1523590pkb.getClass();
        C1523590pkb.LIZLLL(uri, str, "pre_activity_pause_end", true, null, false);
        C1C7U.LIZIZ("EcLynxPerfTracker@d044.trackPrePage$3");
    }

    public AfS52S1100000_23(Uri uri, String str, int i) {
        this.$t = i;
        this.l1 = uri;
        this.s0 = str;
    }
}
