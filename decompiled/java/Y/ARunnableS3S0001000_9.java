package Y;

import X.C0N3Y;
import X.C0N3Z;
import X.C0X35;
import X.C1C7U;
import X.C20684815ws;
import X.C2097608Jq;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS3S0001000_9 implements Runnable {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f283i0;

    public final void LIZ$0() {
        Pair[] pairArr = new Pair[2];
        C0N3Y c0n3y = C0N3Z.LJFF;
        pairArr[0] = new Pair("cache_report_from", String.valueOf(c0n3y != null ? Integer.valueOf(c0n3y.getValue()) : null));
        pairArr[1] = new Pair("image_source", String.valueOf(this.f283i0));
        C20684815ws.LJIILLIIL("cold_boot_photo_report", C2097608Jq.LJIIIIZZ(pairArr));
    }

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

    public static final void run$0(ARunnableS3S0001000_9 aRunnableS3S0001000_9) {
        boolean zLIZ;
        C1C7U.LIZ("JatoInitTask@a25e.bindMainThreadBigCore$1$1");
        try {
            int i = aRunnableS3S0001000_9.f283i0;
            if (JatoXL.isInited()) {
                AtomicBoolean atomicBoolean = C0X35.LIZLLL;
                if (atomicBoolean.get()) {
                    CpusetManager.resetCoreBind(i);
                    atomicBoolean.set(false);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoInitTask@a25e.bindMainThreadBigCore$1$1");
    }

    public static final void run$1(ARunnableS3S0001000_9 aRunnableS3S0001000_9) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeFeedImageCacheHelper@9f61.reportCacheHit$1");
        try {
            aRunnableS3S0001000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeFeedImageCacheHelper@9f61.reportCacheHit$1");
    }

    public ARunnableS3S0001000_9(int i, int i2) {
        this.$t = i2;
        this.f283i0 = i;
    }
}
