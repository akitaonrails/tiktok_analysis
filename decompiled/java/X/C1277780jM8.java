package X;

import Y.ARunnableS89S0200000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.base.JniCommon;
import com.ss.pusher.core.buffer.RoiInfo;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.utils.TimeUtils;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jM8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277780jM8 implements VideoFrame.I420Buffer {
    public final int LIZ;
    public final int LIZIZ;
    public final ByteBuffer LIZJ;
    public final ByteBuffer LIZLLL;
    public final ByteBuffer LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final Runnable LJIIIIZZ;
    public RoiInfo LJIIJ;
    public long LJIILIIL;
    public long LJIILJJIL;
    public final Object LJIIIZ = new Object();
    public long LJIIL = TimeUtils.LIZ();
    public int LJIIJJI = 1;

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final InterfaceC1279250jOV getExtData() {
        return null;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final boolean isTexture() {
        return false;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.I420Buffer
    public final ByteBuffer getDataU() {
        return this.LIZLLL.slice();
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.I420Buffer
    public final ByteBuffer getDataV() {
        return this.LJ.slice();
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.I420Buffer
    public final ByteBuffer getDataY() {
        return this.LIZJ.slice();
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void release() {
        Runnable runnable;
        synchronized (this.LJIIIZ) {
            try {
                int i = this.LJIIJJI - 1;
                this.LJIIJJI = i;
                if (i == 0 && (runnable = this.LJIIIIZZ) != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void retain() {
        synchronized (this.LJIIIZ) {
            try {
                this.LJIIJJI++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getCaptureMs() {
        return this.LJIIL;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getCaptureTimeStampMs() {
        return this.LJIILIIL;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final long getEffectTimeStampMs() {
        return this.LJIILJJIL;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final int getHeight() {
        return this.LIZIZ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final RoiInfo getROIInfo() {
        return this.LJIIJ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.I420Buffer
    public final int getStrideU() {
        return this.LJI;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.I420Buffer
    public final int getStrideV() {
        return this.LJII;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.I420Buffer
    public final int getStrideY() {
        return this.LJFF;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final int getWidth() {
        return this.LIZ;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setCaptureTimeStampMs(long j) {
        this.LJIILIIL = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setEffecTimeStampMs(long j) {
        this.LJIILJJIL = j;
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.LJIIJ;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.LJIIJ = roiInfo;
        }
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final void updateCaptureMs(long j) {
        this.LJIIL = j;
    }

    public static C1277780jM8 LIZIZ(int i, int i2, Runnable runnable) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i4 * i3;
        int i7 = i5 + i6;
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i4 * 2 * i3) + i5);
        byteBufferNativeAllocateByteBuffer.position(0);
        byteBufferNativeAllocateByteBuffer.limit(i5);
        ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i5);
        byteBufferNativeAllocateByteBuffer.limit(i7);
        ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
        byteBufferNativeAllocateByteBuffer.position(i7);
        byteBufferNativeAllocateByteBuffer.limit(i7 + i6);
        return new C1277780jM8(i, i2, byteBufferSlice, i, byteBufferSlice2, i4, byteBufferNativeAllocateByteBuffer.slice(), i4, new ARunnableS89S0200000_20(runnable, byteBufferNativeAllocateByteBuffer, 61));
    }

    @Override // com.ss.pusher.core.buffer.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return VideoFrame.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    public C1277780jM8(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = byteBuffer;
        this.LIZLLL = byteBuffer2;
        this.LJ = byteBuffer3;
        this.LJFF = i3;
        this.LJI = i4;
        this.LJII = i5;
        this.LJIIIIZZ = runnable;
    }

    public static C1277780jM8 LIZJ(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, long j, int i5, Runnable runnable) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
                int i6 = (i2 + 1) / 2;
                int i7 = i3 * i2;
                int i8 = i4 * i6;
                int i9 = i6 * i5;
                if (byteBufferSlice.capacity() >= i7) {
                    if (byteBufferSlice2.capacity() >= i8) {
                        if (byteBufferSlice3.capacity() >= i9) {
                            C1277780jM8 c1277780jM8 = new C1277780jM8(i, i2, byteBufferSlice, i3, byteBufferSlice2, i4, byteBufferSlice3, i5, runnable);
                            c1277780jM8.LJIIL = j;
                            return c1277780jM8;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("V-buffer must be at least ");
                        sbLIZ.append(i9);
                        sbLIZ.append(" bytes.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("U-buffer must be at least ");
                    sbLIZ2.append(i8);
                    sbLIZ2.append(" bytes.");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Y-buffer must be at least ");
                sbLIZ3.append(i7);
                sbLIZ3.append(" bytes.");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        throw new IllegalArgumentException("Data buffers cannot be null.");
    }
}
