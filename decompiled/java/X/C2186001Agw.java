package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;

/* JADX INFO: renamed from: X.1Agw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186001Agw extends C2185991Agv {
    public int LJIIJ;
    public SurfaceTexture LJIIJJI;

    @Override // X.C2185991Agv
    public final Surface LIZ() {
        return null;
    }

    @Override // X.C2185991Agv
    public final boolean LIZJ() {
        return super.LIZJ();
    }

    @Override // X.C2185991Agv
    public final SurfaceTexture LIZIZ() {
        return this.LJIIJJI;
    }

    @Override // X.C2185991Agv
    public final void LIZLLL(SurfaceTexture surfaceTexture) {
        this.LJIIJJI = surfaceTexture;
    }

    public C2186001Agw(int i, SurfaceTexture surfaceTexture, TEFrameSizei tEFrameSizei, C1DJ7 c1dj7) {
        super(TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_OpenGL_OES, tEFrameSizei, c1dj7, true, surfaceTexture);
        this.LJIIJ = i;
        this.LJIIJJI = surfaceTexture;
    }
}
