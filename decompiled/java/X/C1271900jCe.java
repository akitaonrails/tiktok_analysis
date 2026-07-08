package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271900jCe extends VideoFrame.a implements VideoFrame.I420Buffer {
    public int LIZ;
    public int LIZIZ;
    public ByteBuffer LIZJ;
    public ByteBuffer LIZLLL;
    public ByteBuffer LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Runnable LJIIIIZZ;
    public final Object LJIIIZ = new Object();
    public RoiInfo LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer, com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final /* synthetic */ int getBufferType() {
        return C1271910jCf.LIZ(this);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final VideoFrame.IExtraData getExtData() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final boolean isTexture() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final ByteBuffer getDataU() {
        return this.LIZLLL.slice();
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final ByteBuffer getDataV() {
        return this.LJ.slice();
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final ByteBuffer getDataY() {
        return this.LIZJ.slice();
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void release() {
        synchronized (this.LJIIIZ) {
            try {
                int i = this.LJIIJJI - 1;
                this.LJIIJJI = i;
                if (i == 0) {
                    Runnable runnable = this.LJIIIIZZ;
                    if (runnable != null) {
                        runnable.run();
                    }
                    onBufferReleased();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
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

    public C1271900jCe() {
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final long getCaptureMs() {
        return this.LJIIL;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final long getCaptureServerNtpMs() {
        return this.LJIILIIL;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final long getEffectServerNtpMs() {
        return this.LJIILJJIL;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final int getHeight() {
        return this.LIZIZ;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final RoiInfo getROIInfo() {
        return this.LJIIJ;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final int getStrideU() {
        return this.LJI;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final int getStrideV() {
        return this.LJII;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final int getStrideY() {
        return this.LJFF;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final int getWidth() {
        return this.LIZ;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.LJIIJ;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.LJIIJ = roiInfo;
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void updateCaptureMs(long j) {
        this.LJIIL = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void updateCaptureServerNtpMs(long j) {
        this.LJIILIIL = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void updateEffectServerNtpMs(long j) {
        this.LJIILJJIL = j;
    }

    public static C1271900jCe LIZ(int i, int i2, ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
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
        return new C1271900jCe(i, i2, byteBufferSlice, i, byteBufferSlice2, i4, byteBufferNativeAllocateByteBuffer.slice(), i4, new ARunnableS89S0200000_20(aRunnableS120S0100000_20, byteBufferNativeAllocateByteBuffer, 64), 0);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return VideoFrame.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    public C1271900jCe(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable, int i6) {
        LIZIZ(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, runnable, i6);
    }

    public static C1271900jCe LIZLLL(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable, int i6) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
                int i7 = (i2 + 1) / 2;
                int i8 = i3 * i2;
                int i9 = i4 * i7;
                int i10 = i7 * i5;
                if (byteBufferSlice.capacity() >= i8) {
                    if (byteBufferSlice2.capacity() >= i9) {
                        if (byteBufferSlice3.capacity() >= i10) {
                            return new C1271900jCe(i, i2, byteBufferSlice, i3, byteBufferSlice2, i4, byteBufferSlice3, i5, runnable, i6);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("V-buffer must be at least ");
                        sbLIZ.append(i10);
                        sbLIZ.append(" bytes.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("U-buffer must be at least ");
                    sbLIZ2.append(i9);
                    sbLIZ2.append(" bytes.");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Y-buffer must be at least ");
                sbLIZ3.append(i8);
                sbLIZ3.append(" bytes.");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        throw new IllegalArgumentException("Data buffers cannot be null.");
    }

    public static C1271900jCe LJ(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, Runnable runnable) {
        C1271900jCe c1271900jCeLIZLLL = LIZLLL(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, runnable, i6);
        c1271900jCeLIZLLL.LJIIL = 0L;
        return c1271900jCeLIZLLL;
    }

    public final void LIZIZ(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable, int i6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = byteBuffer;
        this.LIZLLL = byteBuffer2;
        this.LJ = byteBuffer3;
        this.LJFF = i3;
        this.LJI = i4;
        this.LJII = i5;
        this.LJIIIIZZ = runnable;
        this.LJIIJJI = 1;
        this.LJIILL = i6;
    }

    public static C1271900jCe LIZJ(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, long j, Runnable runnable, long j2, long j3) {
        C1271900jCe c1271900jCeLIZLLL = LIZLLL(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, runnable, 0);
        c1271900jCeLIZLLL.LJIIL = j;
        c1271900jCeLIZLLL.LJIILIIL = j2;
        c1271900jCeLIZLLL.LJIILJJIL = j3;
        return c1271900jCeLIZLLL;
    }
}
