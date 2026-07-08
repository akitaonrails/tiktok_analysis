package X;

import Y.ARunnableS116S0100000_16;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0dud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068530dud {
    public static boolean LIZ;
    public static int LIZIZ;
    public static AwemeRawAd LIZJ;
    public static ARunnableS116S0100000_16 LIZLLL;
    public static C1068290duF LJFF;
    public static C1068290duF LJI;
    public static boolean LJ = true;
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(343));

    public static final void LIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return;
        }
        if (!LJ) {
            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = LIZLLL;
            if (aRunnableS116S0100000_16 != null) {
                ((Handler) LJII.getValue()).removeCallbacks(aRunnableS116S0100000_16);
            }
            new C1068510dub(LJFF).logAd(C1068520duc.LIZ, awemeRawAd, AFwS252S0000000_16.get$arr$(401));
            LJFF = null;
        }
        LJ = false;
        ARunnableS116S0100000_16 aRunnableS116S0100000_162 = new ARunnableS116S0100000_16(awemeRawAd, 107);
        LIZLLL = aRunnableS116S0100000_162;
        C786410Ut5.LJLIIL(C0C64.LJIILLIIL().LJIJJLI(31744, 100L, "log_system_autofill_time_delay", true), (Handler) LJII.getValue(), aRunnableS116S0100000_162);
    }
}
