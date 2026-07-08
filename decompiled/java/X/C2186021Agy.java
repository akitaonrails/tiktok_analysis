package X;

import android.graphics.SurfaceTexture;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;

/* JADX INFO: renamed from: X.1Agy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186021Agy extends C2185991Agv {
    public final SurfaceTexture LJIIJ;
    public final int LJIIJJI;

    @Override // X.C2185991Agv
    public final boolean LIZJ() {
        return super.LIZJ();
    }

    @Override // X.C2185991Agv
    public final SurfaceTexture LIZIZ() {
        return this.LJIIJ;
    }

    public C2186021Agy(int i, SurfaceTexture surfaceTexture, TEFrameSizei tEFrameSizei, C1DJ7 c1dj7) {
        super(TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_BUFFER, tEFrameSizei, c1dj7, true, surfaceTexture);
        this.LJIIJ = surfaceTexture;
        this.LJIIJJI = i;
    }
}
