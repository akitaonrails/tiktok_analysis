package Y;

import X.C1C7U;
import X.EnumC1277800jMA;
import com.ss.pusher.core.buffer.SurfaceTextureHelper;
import com.ss.pusher.core.opengl.YuvConverter;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S0304000_20 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;

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
        SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) this.l2;
        if (surfaceTextureHelper.yuvConverter == null) {
            surfaceTextureHelper.yuvConverter = new YuvConverter();
        }
        YuvConverter yuvConverter = ((SurfaceTextureHelper) this.l2).yuvConverter;
        ByteBuffer byteBuffer = (ByteBuffer) this.l0;
        int i = this.i3;
        int i2 = this.i4;
        int i3 = this.i5;
        int i4 = this.i6;
        float[] fArr = (float[]) this.l1;
        yuvConverter.getClass();
        yuvConverter.LIZIZ(byteBuffer, i, i2, i3, i4, fArr, EnumC1277800jMA.OES);
    }

    public static final void run$0(ARunnableS0S0304000_20 aRunnableS0S0304000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SurfaceTextureHelper@9678.textureToYUV$1");
        try {
            aRunnableS0S0304000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@9678.textureToYUV$1");
    }

    public static final void run$1(ARunnableS0S0304000_20 aRunnableS0S0304000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SurfaceTextureHelper@14cc.textureToYUV$1");
        try {
            com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper surfaceTextureHelper = (com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper) aRunnableS0S0304000_20.l2;
            if (surfaceTextureHelper.yuvConverter == null) {
                surfaceTextureHelper.yuvConverter = new com.ss.ttlivestreamer.core.opengl.YuvConverter();
            }
            ((com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper) aRunnableS0S0304000_20.l2).yuvConverter.convert((ByteBuffer) aRunnableS0S0304000_20.l0, aRunnableS0S0304000_20.i3, aRunnableS0S0304000_20.i4, aRunnableS0S0304000_20.i5, aRunnableS0S0304000_20.i6, (float[]) aRunnableS0S0304000_20.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SurfaceTextureHelper@14cc.textureToYUV$1");
    }

    public ARunnableS0S0304000_20(Object obj, Object obj2, int i, int i2, int i3, int i4, Object obj3, int i5) {
        this.$t = i5;
        this.l2 = obj;
        this.l0 = obj2;
        this.i3 = i;
        this.i4 = i2;
        this.i5 = i3;
        this.i6 = i4;
        this.l1 = obj3;
    }
}
