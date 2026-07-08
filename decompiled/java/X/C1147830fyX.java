package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.AudioProcessor;
import com.tts.oecverify.BdTuring;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0fyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147830fyX extends AudioProcessor {
    public static final float[] LJIILJJIL;
    public volatile InterfaceC1142250fpX LJ;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public final float[] LIZIZ = new float[1024];
    public final float[] LIZJ = new float[1024];
    public final float[] LIZLLL = new float[1024];
    public int LJFF = 44100;
    public int LJI = 2;
    public int LJII = 1;

    public final void LIZLLL() {
        for (int i = 0; i < 1024; i++) {
            this.LIZJ[i] = this.LIZIZ[i] * LJIILJJIL[i];
            this.LIZLLL[i] = 0.0f;
        }
        float[] fArr = this.LIZJ;
        float[] fArr2 = this.LIZLLL;
        int i2 = 1;
        int i3 = 0;
        do {
            int i4 = 512;
            while (true) {
                int i5 = i3 & i4;
                i3 ^= i4;
                if (i5 == 0) {
                    break;
                } else {
                    i4 >>= 1;
                }
            }
            if (i2 < i3) {
                float f = fArr[i2];
                fArr[i2] = fArr[i3];
                fArr[i3] = f;
                float f2 = fArr2[i2];
                fArr2[i2] = fArr2[i3];
                fArr2[i3] = f2;
            }
            i2++;
        } while (i2 < 1024);
        int i6 = 2;
        do {
            double d = (-6.283185307179586d) / ((double) i6);
            float fCos = (float) Math.cos(d);
            float fSin = (float) Math.sin(d);
            int i7 = 0;
            do {
                int i8 = i6 / 2;
                float f3 = 1.0f;
                int i9 = 0;
                float f4 = 0.0f;
                while (i9 < i8) {
                    int i10 = i7 + i9;
                    int i11 = i10 + i8;
                    float f5 = fArr[i11];
                    float f6 = fArr2[i11];
                    float f7 = (f5 * f3) - (f6 * f4);
                    float f8 = (f5 * f4) + (f6 * f3);
                    fArr[i11] = fArr[i10] - f7;
                    fArr2[i11] = fArr2[i10] - f8;
                    fArr[i10] = fArr[i10] + f7;
                    fArr2[i10] = fArr2[i10] + f8;
                    float f9 = (f3 * fCos) - (f4 * fSin);
                    f4 = (f4 * fCos) + (f3 * fSin);
                    i9++;
                    f3 = f9;
                }
                i7 += i6;
            } while (i7 < 1024);
            i6 <<= 1;
        } while (i6 <= 1024);
        float fLIZIZ = LIZIZ(18.0f, 20, 250);
        float fLIZIZ2 = LIZIZ(24.0f, 250, 2000);
        float fLIZIZ3 = LIZIZ(32.0f, 2000, 8000);
        this.LJIIJJI = LJFF(this.LJIIJJI, fLIZIZ);
        this.LJIIL = LJFF(this.LJIIL, fLIZIZ2);
        this.LJIILIIL = LJFF(this.LJIILIIL, fLIZIZ3);
        InterfaceC1142250fpX interfaceC1142250fpX = this.LJ;
        if (interfaceC1142250fpX != null) {
            interfaceC1142250fpX.LIZ(new C1143590frh(this.LJIIJJI, this.LJIIL, this.LJIILIIL));
        }
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioClose() {
        LIZJ(false);
        C20441214yg.LIZIZ("MusicGiftPreviewSpectrumProcessor", "audioClose");
    }

    static {
        float[] fArr = new float[1024];
        int i = 0;
        do {
            fArr[i] = (1.0f - ((float) Math.cos((((double) i) * 6.283185307179586d) / ((double) 1023)))) * 0.5f;
            i++;
        } while (i < 1024);
        LJIILJJIL = fArr;
    }

    public final void LIZJ(boolean z) {
        InterfaceC1142250fpX interfaceC1142250fpX;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0L;
        this.LJIIJJI = 0.0f;
        this.LJIIL = 0.0f;
        this.LJIILIIL = 0.0f;
        if (z && (interfaceC1142250fpX = this.LJ) != null) {
            interfaceC1142250fpX.LIZ(new C1143590frh(0.0f, 0.0f, 0.0f));
        }
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioRelease(int i) {
        LIZJ(false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audioRelease reason=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("MusicGiftPreviewSpectrumProcessor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static float LJFF(float f, float f2) {
        return C13LZ.LIZLLL((f * 0.72f) + (f2 * 0.28f), 0.0f, 1.0f);
    }

    public final void LIZ(int i, ByteBuffer[] byteBufferArr) {
        ByteBuffer byteBufferDuplicate;
        ByteBuffer byteBufferOrder;
        ArrayList arrayList = new ArrayList();
        for (ByteBuffer byteBuffer : byteBufferArr) {
            if (byteBuffer != null && (byteBufferDuplicate = byteBuffer.duplicate()) != null && (byteBufferOrder = byteBufferDuplicate.order(ByteOrder.nativeOrder())) != null) {
                arrayList.add(byteBufferOrder);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int iMin = Math.min(i, 1024 - this.LJIIIIZZ);
        for (int i2 = 0; i2 < iMin; i2++) {
            float[] fArr = this.LIZIZ;
            int i3 = this.LJIIIIZZ + i2;
            int iMin2 = this.LJI;
            boolean z = true;
            if (iMin2 < 1) {
                iMin2 = 1;
            }
            int i4 = this.LJII;
            switch (i4) {
                case 5:
                    i4 = 0;
                    break;
                case 6:
                    i4 = 1;
                    break;
                case 7:
                    i4 = 2;
                    break;
                case 8:
                    i4 = 3;
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    i4 = 4;
                    break;
                default:
                    if (i4 != 5 && i4 != 6 && i4 != 7 && i4 != 8 && i4 != 9) {
                        z = false;
                    }
                    break;
            }
            float fLJ = 0.0f;
            if (z) {
                iMin2 = Math.min(iMin2, arrayList.size());
                if (iMin2 > 0) {
                    int i5 = 0;
                    do {
                        fLJ += LJ((ByteBuffer) ListProtector.get(arrayList, i5), i2, i4);
                        i5++;
                    } while (i5 < iMin2);
                    fLJ /= iMin2;
                }
            } else {
                ByteBuffer byteBuffer2 = (ByteBuffer) C13LP.LJJJLL(arrayList);
                if (byteBuffer2 != null) {
                    int i6 = 0;
                    do {
                        fLJ += LJ(byteBuffer2, (i2 * iMin2) + i6, i4);
                        i6++;
                    } while (i6 < iMin2);
                    fLJ /= iMin2;
                }
            }
            fArr[i3] = fLJ;
        }
        this.LJIIIIZZ += iMin;
    }

    public static float LJ(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int iPosition;
        float f;
        float f2;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    if (i2 != 4) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
        } else {
            i3 = 1;
        }
        if (i3 <= 0 || (iPosition = byteBuffer.position() + (i * i3)) < 0 || i3 + iPosition > byteBuffer.limit()) {
            return 0.0f;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return 0.0f;
                        }
                        return C13LZ.LIZLLL((float) byteBuffer.getDouble(iPosition), -1.0f, 1.0f);
                    }
                    return C13LZ.LIZLLL(byteBuffer.getFloat(iPosition), -1.0f, 1.0f);
                }
                f = byteBuffer.getInt(iPosition);
                f2 = 2.1474836E9f;
            } else {
                f = byteBuffer.getShort(iPosition);
                f2 = 32768.0f;
            }
        } else {
            f = (byteBuffer.get(iPosition) & 255) - 128;
            f2 = 128.0f;
        }
        return f / f2;
    }

    public final float LIZIZ(float f, int i, int i2) {
        int iMax = Math.max(1, (i * 1024) / this.LJFF);
        int iMin = Math.min(511, (i2 * 1024) / this.LJFF);
        if (iMin < iMax) {
            return 0.0f;
        }
        int i3 = 0;
        float fSqrt = 0.0f;
        if (iMax <= iMin) {
            while (true) {
                float f2 = this.LIZJ[iMax];
                float f3 = this.LIZLLL[iMax];
                fSqrt += ((float) Math.sqrt((f2 * f2) + (f3 * f3))) / 1024;
                i3++;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
            if (i3 != 0) {
                return C13LZ.LIZLLL((float) (Math.log(((fSqrt / i3) * f) + 1.0f) / Math.log(f + 1.0f)), 0.0f, 1.0f);
            }
        }
        return 0.0f;
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioProcess(ByteBuffer[] byteBufferArr, int i, long j) {
        Object c098200Yq;
        if (i > 0 && byteBufferArr.length != 0) {
            try {
                LIZ(i, byteBufferArr);
                if (this.LJIIIIZZ >= 1024) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    if (jUptimeMillis - this.LJIIIZ >= 33) {
                        this.LJIIIZ = jUptimeMillis;
                        LIZLLL();
                    }
                    this.LJIIIIZZ = 0;
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                if (jUptimeMillis2 - this.LJIIJ >= 1000) {
                    this.LJIIJ = jUptimeMillis2;
                    C20441214yg.LJFF("MusicGiftPreviewSpectrumProcessor", "audio spectrum process failed", thM5exceptionOrNullimpl);
                }
                this.LJIIIIZZ = 0;
            }
        }
    }

    @Override // com.ss.ttm.player.AudioProcessor
    public final void audioOpen(int i, int i2, int i3, int i4) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 44100;
        }
        this.LJFF = iIntValue;
        Integer numValueOf2 = Integer.valueOf(i2);
        if (numValueOf2.intValue() > 0) {
            iIntValue2 = numValueOf2.intValue();
        } else {
            iIntValue2 = 2;
        }
        this.LJI = iIntValue2;
        this.LJII = i4;
        this.LJIIIIZZ = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("audioOpen sampleRate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" channels=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" format=");
        sbLIZ.append(this.LJII);
        C20441214yg.LIZIZ("MusicGiftPreviewSpectrumProcessor", C2188811AlT.LIZIZ(sbLIZ));
    }
}
