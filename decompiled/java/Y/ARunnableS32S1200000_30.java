package Y;

import X.C1540210qBP;
import X.C19858812mw;
import X.C19858912mx;
import X.C19859212n0;
import X.C1C7U;
import X.C20107413lw;
import X.C2097608Jq;
import X.EnumC310540CFg;
import X.InterfaceC2373909Rx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS32S1200000_30 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
        if (((C1540210qBP) this.l1).LIZ.LJ == EnumC310540CFg.POST) {
            ((InterfaceC2373909Rx) this.l2).LIZ(this.s0, C2097608Jq.LJ(), "application/x-www-form-urlencoded", new JSONObject(), ((C1540210qBP) this.l1).LIZ.LIZJ, null, C20107413lw.LJII);
        } else {
            ((InterfaceC2373909Rx) this.l2).LIZIZ(this.s0, C2097608Jq.LJ(), ((C1540210qBP) this.l1).LIZ.LIZJ, null, C20107413lw.LJII);
        }
    }

    public static final void run$0(ARunnableS32S1200000_30 aRunnableS32S1200000_30) {
        boolean zLIZ;
        C1C7U.LIZ("PrefetchService@4d64.tryPrefetchByCache$2");
        try {
            aRunnableS32S1200000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrefetchService@4d64.tryPrefetchByCache$2");
    }

    public static final void run$1(ARunnableS32S1200000_30 aRunnableS32S1200000_30) {
        C19858812mw c19858812mw = (C19858812mw) aRunnableS32S1200000_30.l1;
        String str = aRunnableS32S1200000_30.s0;
        C19858912mx c19858912mx = (C19858912mx) aRunnableS32S1200000_30.l2;
        C1C7U.LIZ("Downloader@afad.download$1L");
        String str2 = c19858812mw.LIZ;
        if (str2 != null) {
            C19859212n0 c19859212n0 = c19858912mx.LJI;
            if (c19859212n0 != null) {
                c19859212n0.LJJI(str, str2);
            }
        } else {
            C19859212n0 c19859212n02 = c19858912mx.LJI;
            if (c19859212n02 != null) {
                c19859212n02.LJJJJI(str, c19858812mw.LIZIZ);
            }
        }
        C1C7U.LIZIZ("Downloader@afad.download$1L");
    }

    public ARunnableS32S1200000_30(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
