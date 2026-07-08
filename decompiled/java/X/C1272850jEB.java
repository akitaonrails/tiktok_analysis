package X;

import Y.ARunnableS120S0100000_20;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272850jEB extends VideoFrame.a {
    public final int LIZ;
    public final int LIZIZ;
    public final ByteBuffer LIZJ;
    public final Runnable LIZLLL;
    public final AtomicInteger LJ = new AtomicInteger(1);
    public long LJFF;
    public long LJI;
    public long LJII;

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer, com.ss.ttlivestreamer.core.buffer.VideoFrame.I420Buffer
    public final int getBufferType() {
        return 8;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final VideoFrame.IExtraData getExtData() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final RoiInfo getROIInfo() {
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final boolean isTexture() {
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void setROIInfo(RoiInfo roiInfo) {
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void release() {
        if (this.LJ.decrementAndGet() == 0) {
            Runnable runnable = this.LIZLLL;
            if (runnable != null) {
                runnable.run();
            }
            onBufferReleased();
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void retain() {
        this.LJ.incrementAndGet();
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final VideoFrame.I420Buffer toI420() {
        if (C1274040jG6.LIZ()) {
            throw new AndroidRuntimeException("not supported covert from rgba buffer to i420 buffer");
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final long getCaptureMs() {
        return this.LJFF;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final long getCaptureServerNtpMs() {
        return this.LJI;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final long getEffectServerNtpMs() {
        return this.LJII;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final int getHeight() {
        return this.LIZIZ;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final int getWidth() {
        return this.LIZ;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void updateCaptureMs(long j) {
        this.LJFF = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void updateCaptureServerNtpMs(long j) {
        this.LJI = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final void updateEffectServerNtpMs(long j) {
        this.LJII = j;
    }

    public C1272850jEB(ByteBuffer byteBuffer, int i, int i2, ARunnableS120S0100000_20 aRunnableS120S0100000_20, long j) {
        this.LIZJ = byteBuffer;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = aRunnableS120S0100000_20;
        this.LJFF = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public final VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        if (!C1274040jG6.LIZ()) {
            return null;
        }
        throw new AndroidRuntimeException("not supported cropAndScale");
    }
}
