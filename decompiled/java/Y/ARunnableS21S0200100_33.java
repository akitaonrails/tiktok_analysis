package Y;

import X.C1C7U;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import com.ss.android.vesdk.VERecorder;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS21S0200100_33 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

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

    public static final void run$0(ARunnableS21S0200100_33 aRunnableS21S0200100_33) {
        boolean zLIZ;
        C1C7U.LIZ("EcTakePhotoActivity@354a.shotScreen$shotScreenSettings$1$1");
        try {
            VERecorder vERecorder = ((EcTakePhotoActivity) aRunnableS21S0200100_33.l0).LLJJJJJIL;
            if (vERecorder != null) {
                vERecorder.LJJJJ();
            }
            ((EcTakePhotoActivity) aRunnableS21S0200100_33.l0).p(null, PageType.TAKE_PHOTO, null, null, (Bitmap) aRunnableS21S0200100_33.l1, Long.valueOf(aRunnableS21S0200100_33.j2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcTakePhotoActivity@354a.shotScreen$shotScreenSettings$1$1");
    }

    public static final void run$1(ARunnableS21S0200100_33 aRunnableS21S0200100_33) {
        boolean zLIZ;
        C1C7U.LIZ("EcTakePhotoActivity@354a.shotScreen$shotScreenSettings$1$2");
        try {
            VERecorder vERecorder = ((EcTakePhotoActivity) aRunnableS21S0200100_33.l0).LLJJJJJIL;
            if (vERecorder != null) {
                vERecorder.LJJJJ();
            }
            ((EcTakePhotoActivity) aRunnableS21S0200100_33.l0).p(null, PageType.TAKE_PHOTO, null, null, (Bitmap) aRunnableS21S0200100_33.l1, Long.valueOf(aRunnableS21S0200100_33.j2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcTakePhotoActivity@354a.shotScreen$shotScreenSettings$1$2");
    }

    public ARunnableS21S0200100_33(EcTakePhotoActivity ecTakePhotoActivity, Bitmap bitmap, long j, int i) {
        this.$t = i;
        this.l0 = ecTakePhotoActivity;
        this.l1 = bitmap;
        this.j2 = j;
    }
}
