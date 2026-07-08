package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class SurfaceHolderCallbackC1467210oHf implements SurfaceHolder.Callback {
    public final WeakReference<TTVideoEngine> LL;

    public SurfaceHolderCallbackC1467210oHf(TTVideoEngine tTVideoEngine) {
        this.LL = new WeakReference<>(tTVideoEngine);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new surface callback:");
        sbLIZ.append(this);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceCreated, ");
        sbLIZ.append(surfaceHolder);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LL.get();
        if (tTVideoEngine != null) {
            Surface surface = surfaceHolder.getSurface();
            long jLJJJJZI = C1467750oIX.LIZ;
            if (jLJJJJZI == Long.MIN_VALUE) {
                jLJJJJZI = tTVideoEngine.LJJJJZI(950);
            }
            tTVideoEngine.LLIZLLLIL(jLJJJJZI, surface);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceDestroyed, ");
        sbLIZ.append(surfaceHolder);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", C2188811AlT.LIZIZ(sbLIZ));
        TTVideoEngine tTVideoEngine = this.LL.get();
        if (tTVideoEngine != null) {
            long jLJJJJZI = C1467750oIX.LIZIZ;
            if (jLJJJJZI == Long.MIN_VALUE) {
                jLJJJJZI = tTVideoEngine.LJJJJZI(950);
            }
            tTVideoEngine.LLIZLLLIL(jLJJJJZI, null);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surfaceChanged, ");
        sbLIZ.append(surfaceHolder);
        sbLIZ.append(", i:");
        sbLIZ.append(i);
        sbLIZ.append(",i1:");
        sbLIZ.append(i2);
        sbLIZ.append(", i2:");
        sbLIZ.append(i3);
        TTVideoEngineLog.d("TTVideoEngineSurfaceCallback", C2188811AlT.LIZIZ(sbLIZ));
    }
}
