package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import android.view.Surface;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GLThread;

/* JADX INFO: renamed from: X.0jFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1273820jFk extends VideoSink {
    public boolean LL;
    public final Surface LLILZ;
    public GLThread LLILZLL;
    public GLSurface LLIZ;
    public C1273830jFl LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJILJILJ;
    public Handler LLJIJIL = null;
    public final boolean LLILZIL = false;
    public int LLILLJJLI = 0;
    public int LLILLL = 0;
    public boolean LLJILJIL = true;

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public final void OnDiscardedFrame() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        super.release();
        Handler handler = this.LLJIJIL;
        this.LLJ = false;
        this.LLJI = false;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 112));
        }
    }

    public C1273820jFk(Surface surface) {
        this.LLILZ = surface;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        Handler handler;
        if (videoFrame != null && (handler = this.LLJIJIL) != null) {
            videoFrame.retain();
            if (!C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(this, videoFrame, 70))) {
                videoFrame.release();
            }
        }
    }
}
