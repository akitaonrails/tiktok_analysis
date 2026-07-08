package X;

import com.bytedance.pitaya.modules.DirectBufferJNI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: X.0pUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513860pUu {
    public static final /* synthetic */ int LJ = 0;
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    static {
        try {
            Buffer.class.getDeclaredField("address").setAccessible(true);
            Buffer.class.getDeclaredField("limit").setAccessible(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final float[] LIZ() {
        float fIntBitsToFloat;
        ByteBuffer byteBufferOrder;
        ShortBuffer shortBufferAsShortBuffer = null;
        if (this.LIZ == 20) {
            long j = this.LIZJ;
            if (j != 0) {
                float[] fArr = new float[this.LIZIZ];
                ByteBuffer byteBufferNativeGetDirectBuffer = DirectBufferJNI.INSTANCE.nativeGetDirectBuffer(j, (int) this.LIZLLL);
                if (byteBufferNativeGetDirectBuffer != null && (byteBufferOrder = byteBufferNativeGetDirectBuffer.order(ByteOrder.LITTLE_ENDIAN)) != null) {
                    shortBufferAsShortBuffer = byteBufferOrder.asShortBuffer();
                }
                int i = this.LIZIZ;
                for (int i2 = 0; i2 < i; i2++) {
                    if (shortBufferAsShortBuffer != null) {
                        short s = shortBufferAsShortBuffer.get(i2);
                        int i3 = (Short.MIN_VALUE & s) >> 15;
                        int i4 = (s & 31744) >> 10;
                        int i5 = s & 1023;
                        if (i4 != 0) {
                            fIntBitsToFloat = i4 == 31 ? i5 == 0 ? Float.POSITIVE_INFINITY : Float.NaN : Float.intBitsToFloat((i5 << 13) | (i3 << 31) | ((i4 + 112) << 23));
                            fArr[i2] = fIntBitsToFloat;
                        } else if (i5 == 0) {
                            fIntBitsToFloat = 0.0f;
                            fArr[i2] = fIntBitsToFloat;
                        } else {
                            while ((i5 & 1024) == 0) {
                                i5 <<= 1;
                                i4--;
                            }
                            i4++;
                            i5 &= 1023;
                            fArr[i2] = fIntBitsToFloat;
                        }
                    }
                }
                return fArr;
            }
        }
        return null;
    }

    public C1513860pUu(int i, int i2, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
