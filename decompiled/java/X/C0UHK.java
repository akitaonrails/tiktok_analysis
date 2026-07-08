package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorSmoothRoomCreateOptABSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastHostUseTTLH;
import com.bytedance.bpea.basics.Cert;

/* JADX INFO: renamed from: X.0UHK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UHK {
    public static boolean LIZ;
    public static boolean LIZIZ = true;
    public static final C557050Lt1 LIZJ = new C557050Lt1(false);
    public static C0UHA LIZLLL;

    public static boolean LIZ() {
        return LIZIZ && LiveBroadcastHostUseTTLH.getEnable();
    }

    public static void LIZIZ(Cert cert) {
        View view;
        if (cert != null) {
            C0UHA c0uha = LIZLLL;
            if (c0uha != null) {
                c0uha.LJIIZILJ(cert);
            }
            if (AnchorSmoothRoomCreateOptABSetting.INSTANCE.enable()) {
                C473410IhP.LIZIZ(new Runnable() { // from class: X.0UHJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        View view2;
                        C1C7U.LIZ("CameraCaptureManager@d881.release$1");
                        try {
                            C0UHA c0uha2 = C0UHK.LIZLLL;
                            if (c0uha2 != null && (view2 = c0uha2.LLIZLLLIL) != null) {
                                C500260Jjc.LJIILIIL(view2);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CameraCaptureManager@d881.release$1");
                    }
                });
            } else {
                C0UHA c0uha2 = LIZLLL;
                if (c0uha2 != null && (view = c0uha2.LLIZLLLIL) != null) {
                    C500260Jjc.LJIILIIL(view);
                }
            }
        }
        LIZLLL = null;
    }
}
