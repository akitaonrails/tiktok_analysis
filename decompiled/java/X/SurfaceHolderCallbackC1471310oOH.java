package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oOH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class SurfaceHolderCallbackC1471310oOH implements SurfaceHolder.Callback {
    public final WeakReference<VideoLiveManager> LL;

    public SurfaceHolderCallbackC1471310oOH(VideoLiveManager videoLiveManager) {
        InterfaceC1698710uJ3 interfaceC1698710uJ3;
        this.LL = new WeakReference<>(videoLiveManager);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new surface callback:");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (videoLiveManager != null && (interfaceC1698710uJ3 = videoLiveManager.LJIJJ) != null) {
            interfaceC1698710uJ3.LJJJJJ(strLIZIZ);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        VideoLiveManager videoLiveManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceCreated, ");
        sbLIZ.append(surfaceHolder);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        WeakReference<VideoLiveManager> weakReference = this.LL;
        if (weakReference != null && (videoLiveManager = weakReference.get()) != null && surfaceHolder != null) {
            videoLiveManager.setSurface(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        VideoLiveManager videoLiveManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceDestroyed, ");
        sbLIZ.append(surfaceHolder);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        WeakReference<VideoLiveManager> weakReference = this.LL;
        if (weakReference != null && (videoLiveManager = weakReference.get()) != null && surfaceHolder != null) {
            InterfaceC1698710uJ3 interfaceC1698710uJ3 = videoLiveManager.LJIJJ;
            if (interfaceC1698710uJ3 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("surfaceDestroyed, ");
                sbLIZ2.append(surfaceHolder);
                interfaceC1698710uJ3.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            Surface surface = surfaceHolder.getSurface();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("destroy surface: ");
            sbLIZ3.append(surface);
            sbLIZ3.append(", mSurface: ");
            sbLIZ3.append(videoLiveManager.LJJIJ);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1698940uJQ.LIZJ();
            InterfaceC1698710uJ3 interfaceC1698710uJ32 = videoLiveManager.LJIJJ;
            if (interfaceC1698710uJ32 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("destroy surface: ");
                sbLIZ4.append(surface);
                sbLIZ4.append(", mSurface: ");
                sbLIZ4.append(videoLiveManager.LJJIJ);
                interfaceC1698710uJ32.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ4));
            }
            videoLiveManager.LLLLLLLLL(-1L, null, false);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        VideoLiveManager videoLiveManager;
        InterfaceC1698710uJ3 interfaceC1698710uJ3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceChanged, ");
        sbLIZ.append(surfaceHolder);
        sbLIZ.append(", pixel format: ");
        sbLIZ.append(i);
        sbLIZ.append(", width: ");
        sbLIZ.append(i2);
        sbLIZ.append(", height: ");
        sbLIZ.append(i3);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        WeakReference<VideoLiveManager> weakReference = this.LL;
        if (weakReference != null && (videoLiveManager = weakReference.get()) != null && (interfaceC1698710uJ3 = videoLiveManager.LJIJJ) != null) {
            interfaceC1698710uJ3.LJJJJJ(strLIZIZ);
        }
    }
}
