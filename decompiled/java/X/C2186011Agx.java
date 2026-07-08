package X;

import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameSizei;

/* JADX INFO: renamed from: X.1Agx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186011Agx extends C2185991Agv {
    public final Surface LJIIJ;

    @Override // X.C2185991Agv
    public final boolean LIZJ() {
        return super.LIZJ() && this.LJIIJ != null;
    }

    @Override // X.C2185991Agv
    public final Surface LIZ() {
        return this.LJIIJ;
    }

    public C2186011Agx(TEFrameSizei tEFrameSizei, C1DJ7 c1dj7) {
        super(TECameraFrame.ETEPixelFormat.PIXEL_FORMAT_Recorder, tEFrameSizei, c1dj7, false, null);
        this.LJIIJ = null;
    }
}
