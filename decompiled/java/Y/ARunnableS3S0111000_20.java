package Y;

import X.C1271540jC4;
import X.C1271550jC5;
import X.C1272090jCx;
import X.C1C7U;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilterImpl;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoStreamHDFilterImpl;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS3S0111000_20 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS3S0111000_20 aRunnableS3S0111000_20) {
        C1271550jC5 c1271550jC5 = (C1271550jC5) aRunnableS3S0111000_20.l0;
        boolean z = aRunnableS3S0111000_20.z1;
        int i = aRunnableS3S0111000_20.i2;
        C1C7U.LIZ("BmfDenoiseNode@fe75.enableVideoDenoise$1L");
        BmfVideoDenoiseFilterImpl bmfVideoDenoiseFilterImpl = c1271550jC5.LLILZLL;
        if (bmfVideoDenoiseFilterImpl != null) {
            bmfVideoDenoiseFilterImpl.setEnable(z, i);
        }
        C1C7U.LIZIZ("BmfDenoiseNode@fe75.enableVideoDenoise$1L");
    }

    public static final void run$1(ARunnableS3S0111000_20 aRunnableS3S0111000_20) {
        C1271540jC4 c1271540jC4 = (C1271540jC4) aRunnableS3S0111000_20.l0;
        boolean z = aRunnableS3S0111000_20.z1;
        int i = aRunnableS3S0111000_20.i2;
        C1C7U.LIZ("BmfStreamHDNode@28e0.forceEnable$1L");
        c1271540jC4.LLJILLL = z;
        BmfVideoStreamHDFilterImpl bmfVideoStreamHDFilterImpl = c1271540jC4.LLIZ;
        if (bmfVideoStreamHDFilterImpl != null) {
            bmfVideoStreamHDFilterImpl.forceEnable(z, i);
        }
        C1C7U.LIZIZ("BmfStreamHDNode@28e0.forceEnable$1L");
    }

    public static final void run$2(ARunnableS3S0111000_20 aRunnableS3S0111000_20) {
        C1271540jC4 c1271540jC4 = (C1271540jC4) aRunnableS3S0111000_20.l0;
        boolean z = aRunnableS3S0111000_20.z1;
        int i = aRunnableS3S0111000_20.i2;
        C1C7U.LIZ("BmfStreamHDNode@28e0.enableVideoStreamHD$1L");
        BmfVideoStreamHDFilterImpl bmfVideoStreamHDFilterImpl = c1271540jC4.LLIZ;
        if (bmfVideoStreamHDFilterImpl != null) {
            bmfVideoStreamHDFilterImpl.setEnable(z, i);
        }
        C1C7U.LIZIZ("BmfStreamHDNode@28e0.enableVideoStreamHD$1L");
    }

    public static final void run$3(ARunnableS3S0111000_20 aRunnableS3S0111000_20) {
        C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS3S0111000_20.l0;
        boolean z = aRunnableS3S0111000_20.z1;
        int i = aRunnableS3S0111000_20.i2;
        c1272090jCx.getClass();
        C1C7U.LIZ("FilterManager@d45d.enableVideoStreamHD$1L");
        c1272090jCx.LJJZZI(i, z);
        C1C7U.LIZIZ("FilterManager@d45d.enableVideoStreamHD$1L");
    }

    public static final void run$4(ARunnableS3S0111000_20 aRunnableS3S0111000_20) {
        C1272090jCx c1272090jCx = (C1272090jCx) aRunnableS3S0111000_20.l0;
        boolean z = aRunnableS3S0111000_20.z1;
        int i = aRunnableS3S0111000_20.i2;
        c1272090jCx.getClass();
        C1C7U.LIZ("FilterManager@d45d.enableVideoDenoise$1L");
        c1272090jCx.LLILIL(i, z);
        C1C7U.LIZIZ("FilterManager@d45d.enableVideoDenoise$1L");
    }

    public ARunnableS3S0111000_20(C1271540jC4 c1271540jC4, boolean z, int i) {
        this.$t = i;
        this.l0 = c1271540jC4;
        this.z1 = z;
        this.i2 = 1;
    }

    public ARunnableS3S0111000_20(Object obj, boolean z, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.z1 = z;
        this.i2 = i;
    }
}
