package Y;

import X.C1325700kbQ;
import X.C1325710kbR;
import X.C1328130kfL;
import X.C1329360khK;
import X.C1C7U;
import X.C446250Heh;
import X.EnumC1331380kka;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS3S1000000_6 implements Runnable {
    public final int $t;
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
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(C446250Heh.LIZ(this.s0)));
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.getClass();
        c1325700kbQLIZLLL.LJFF = new C1329360khK(imageDecodeOptionsBuilder);
        c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
        C1328130kfL.LJIILIIL().LJIIL().LJIIZILJ(c1325700kbQLIZLLL.LIZ(), null);
    }

    public static final void run$0(ARunnableS3S1000000_6 aRunnableS3S1000000_6) {
        boolean zLIZ;
        C1C7U.LIZ("ImagePrefetchHelper@8054.doPrefetchLocalImageFileToBitmapCache$1");
        try {
            aRunnableS3S1000000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImagePrefetchHelper@8054.doPrefetchLocalImageFileToBitmapCache$1");
    }

    public static final void run$1(ARunnableS3S1000000_6 aRunnableS3S1000000_6) {
        String str = aRunnableS3S1000000_6.s0;
        C1C7U.LIZ("FrescoHelper@9f36.tryDownloadImage$1L");
        C1328130kfL.LJIILIIL().LJIIL().LJIJ(C1325710kbR.LIZIZ(str), null);
        C1C7U.LIZIZ("FrescoHelper@9f36.tryDownloadImage$1L");
    }

    public ARunnableS3S1000000_6(String str, int i) {
        this.$t = i;
        if (i != 0) {
            this.s0 = str;
        } else {
            this.s0 = str;
        }
    }
}
