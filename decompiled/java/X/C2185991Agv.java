package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;
import java.util.UUID;

/* JADX INFO: renamed from: X.1Agv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2185991Agv {
    public final TECameraFrame.ETEPixelFormat LIZ;
    public TEFrameSizei LIZIZ;
    public InterfaceC1283630jVZ LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public SurfaceTexture LJFF;
    public boolean LJI = true;
    public final UUID LJII = UUID.randomUUID();
    public boolean LJIIIIZZ = true;
    public C1284180jWS LJIIIZ;

    public Surface LIZ() {
        if (this.LJFF != null) {
            return new Surface(this.LJFF);
        }
        return null;
    }

    public boolean LIZJ() {
        TEFrameSizei tEFrameSizei = this.LIZIZ;
        return tEFrameSizei != null && tEFrameSizei.width > 0 && tEFrameSizei.height > 0 && this.LIZJ != null;
    }

    public SurfaceTexture LIZIZ() {
        return this.LJFF;
    }

    public void LIZLLL(SurfaceTexture surfaceTexture) {
        this.LJFF = surfaceTexture;
    }

    public C2185991Agv(TECameraFrame.ETEPixelFormat eTEPixelFormat, TEFrameSizei tEFrameSizei, C1DJ7 c1dj7, boolean z, SurfaceTexture surfaceTexture) {
        this.LIZ = eTEPixelFormat;
        this.LIZIZ = tEFrameSizei;
        this.LIZJ = c1dj7;
        this.LIZLLL = z;
        this.LJFF = surfaceTexture;
    }
}
