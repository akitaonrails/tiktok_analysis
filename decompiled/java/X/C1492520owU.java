package X;

import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0owU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492520owU {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1492510owT());

    public static void LIZ() {
        if (C1492500owS.LIZ()) {
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(), new Runnable() { // from class: X.0owV
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AwemeNetDetector@6480.tryToCheckFetchFeedNoNet$1");
                    try {
                        ((C1492460owO) C1492520owU.LIZ.getValue()).LIZLLL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AwemeNetDetector@6480.tryToCheckFetchFeedNoNet$1");
                }
            });
        }
    }
}
