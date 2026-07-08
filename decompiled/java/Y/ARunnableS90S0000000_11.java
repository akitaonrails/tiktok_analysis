package Y;

import X.C1602160rnK;
import X.C1AF0;
import X.C1C7U;
import X.C20684815ws;
import X.C20741516Ej;
import X.C20742916Ex;
import X.C2184641Aek;
import X.C704270Rjt;
import X.C707370Rot;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.common.jato.threads.ThreadNative;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS90S0000000_11 implements Runnable {
    public final int $t;

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
            case 4:
                C704270Rjt.LIZIZ();
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS90S0000000_11(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS90S0000000_11 aRunnableS90S0000000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncInflater@9fa2.preloadBoot$1");
        try {
            if (C20742916Ex.LIZIZ) {
                try {
                    C20741516Ej.LIZJ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    C20741516Ej.LIZLLL();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncInflater@9fa2.preloadBoot$1");
    }

    public static final void run$1(ARunnableS90S0000000_11 aRunnableS90S0000000_11) {
        boolean zLIZ;
        C1C7U.LIZ("LivePlayRootManagerV2@6c53.<field>$1");
        try {
            C707370Rot.LIZ.LIZIZ("LivePageEnter").postValue(null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePlayRootManagerV2@6c53.<field>$1");
    }

    public static final void run$2(ARunnableS90S0000000_11 aRunnableS90S0000000_11) {
        C1C7U.LIZ("OptimizerHelper@3f44.blockProfileSaver$1L");
        ThreadNative.nativeSuspendThreadByName("Profile Saver");
        C1C7U.LIZIZ("OptimizerHelper@3f44.blockProfileSaver$1L");
    }

    public static final void run$3(ARunnableS90S0000000_11 aRunnableS90S0000000_11) {
        C1C7U.LIZ("OptimizerHelper@3f44.blockProfileSaver$2L");
        ThreadNative.nativeResumeThreadByName("Profile Saver");
        C1C7U.LIZIZ("OptimizerHelper@3f44.blockProfileSaver$2L");
    }

    public static final void run$5(ARunnableS90S0000000_11 aRunnableS90S0000000_11) {
        boolean zLIZ;
        C1C7U.LIZ("CollectViewAttributeOptManager@e23e.enableOptByScene$1");
        try {
            C1602160rnK.LIZ = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CollectViewAttributeOptManager@e23e.enableOptByScene$1");
    }

    public static final void run$6(ARunnableS90S0000000_11 aRunnableS90S0000000_11) {
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        C1C7U.LIZ("VideoViewCell@c979.reportDigitSDKInitInfo$1L");
        try {
            C20684815ws.LJIJ("bd_digit_sdk_init_perf_info", new JSONObject().put("duration", C2184641Aek.LIZ).put("init_before_use", C2184641Aek.LIZIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        C1C7U.LIZIZ("VideoViewCell@c979.reportDigitSDKInitInfo$1L");
    }
}
