package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;

/* JADX INFO: renamed from: X.0j7L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268610j7L extends AbstractC1268600j7K {
    public C1269130j8B LLILZLL = new VideoSink() { // from class: X.0j8B
        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public final void OnDiscardedFrame() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public final void onFrame(VideoFrame videoFrame) {
            this.LL.LLJ(videoFrame.getBuffer(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs() / 1000);
        }
    };
    public int LLIZ = 0;

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        this.LLIZ = 2;
        super.release();
        C1269130j8B c1269130j8B = this.LLILZLL;
        if (c1269130j8B != null) {
            c1269130j8B.release();
            this.LLILZLL = null;
        }
    }

    @Override // X.AbstractC1268600j7K
    public final void stop() {
        this.LLIZ = 2;
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public final int status() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1268600j7K
    public final void LLJI(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
        this.LLIZ = 1;
    }

    @Override // X.AbstractC1268600j7K
    public final int LLJ(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        if (this.LLIZ == 1) {
            return super.LLJ(buffer, i, i2, i3, j);
        }
        return -1;
    }
}
