package X;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

/* JADX INFO: renamed from: X.1AiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186941AiS {
    public final SurfaceHolder LIZ;
    public final SurfaceTexture LIZIZ;

    public C2186941AiS(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.LIZIZ = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public C2186941AiS(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.LIZ = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }
}
