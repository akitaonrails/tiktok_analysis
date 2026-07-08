package Y;

import X.C09JN;
import X.C1C7U;
import X.C518180KTw;
import X.C520080KaU;

/* JADX INFO: loaded from: classes8.dex */
public class AfS6S0010000_7 implements C09JN {
    public final int $t;
    public boolean z0;

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

    public AfS6S0010000_7(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }

    public static final void accept$0(AfS6S0010000_7 afS6S0010000_7, Object obj) {
        C1C7U.LIZ("FansClubViewModel@394b.requestFansConfigNew$dispose$2");
        C518180KTw.LJIILJJIL((Throwable) obj, afS6S0010000_7.z0);
        C1C7U.LIZIZ("FansClubViewModel@394b.requestFansConfigNew$dispose$2");
    }

    public static final void accept$1(AfS6S0010000_7 afS6S0010000_7, Object obj) {
        C1C7U.LIZ("LiveC2PAManager@fc89.reportUseC2PAPicture$3$1");
        C520080KaU.LIZLLL = afS6S0010000_7.z0;
        C1C7U.LIZIZ("LiveC2PAManager@fc89.reportUseC2PAPicture$3$1");
    }
}
