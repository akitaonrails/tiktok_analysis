package X;

import android.opengl.Matrix;
import android.view.Surface;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;

/* JADX INFO: renamed from: X.0jFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273830jFl extends C1273820jFk {
    public GlRenderDrawer LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public C1272870jED LLJJIII;
    public final float[] LLJJIJI;

    public C1273830jFl(Surface surface) {
        super(surface);
        float[] fArr = new float[16];
        this.LLJJIJI = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    @Override // X.C1273820jFk, com.ss.ttlivestreamer.core.engine.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        Surface surface = this.LLILZ;
        if (surface != null && surface.isValid() && this.LLJILJILJ) {
            super.onFrame(videoFrame);
        }
    }
}
