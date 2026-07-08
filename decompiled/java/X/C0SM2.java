package X;

import Y.ARunnableS110S0100000_10;
import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0SM2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SM2 {
    public static final C0SM2 LIZ = new C0SM2();
    public static boolean LIZIZ = true;
    public static int LIZJ;
    public static SoftReference<C0R1J> LIZLLL;

    public static void LIZ(final long j, final Activity activity) {
        C0R1J c0r1j;
        SoftReference<C0R1J> softReference = LIZLLL;
        if (softReference != null && (c0r1j = softReference.get()) != null && c0r1j.LIZ(R.layout.e_h)) {
            return;
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0SM3
            public final void LIZ() {
                SoftReference<C0R1J> softReference2 = new SoftReference<>(new C686870Qwv(activity) { // from class: X.0R1J
                    @Override // X.C686870Qwv, X.AbstractC686880Qww
                    public final void LIZJ(C686940Qx2 c686940Qx2, long j2) {
                        if (!C800870VbJ.LIZ()) {
                            return;
                        }
                        AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(this, c686940Qx2, 96);
                        if (j2 > 0) {
                            C786410Ut5.LJLIIL(j2, C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 163));
                        } else {
                            C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS411S0200000_10, 163));
                        }
                    }
                });
                C0SM2.LIZLLL = softReference2;
                C0R1J c0r1j2 = softReference2.get();
                if (c0r1j2 != null) {
                    long j2 = j;
                    C686940Qx2 c686940Qx2 = new C686940Qx2(c0r1j2);
                    C0SM2.LIZ.getClass();
                    c686940Qx2.LIZ(R.layout.eai, 3);
                    c0r1j2.LIZJ(c686940Qx2, j2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PhotoModePreloadManager@836c.preloadIfNeeded$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PhotoModePreloadManager@836c.preloadIfNeeded$1");
            }
        });
    }
}
