package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0oOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471640oOo {
    public static final WeakHashMap<Surface, SurfaceHolder> LIZ = new WeakHashMap<>();
    public static final Map<Surface, SurfaceView> LIZIZ = Collections.synchronizedMap(new WeakHashMap());
    public static final Map<Surface, TextureView> LIZJ = Collections.synchronizedMap(new WeakHashMap());
    public static final WeakHashMap<Surface, Boolean> LIZLLL = new WeakHashMap<>();
    public static final WeakHashMap<Surface, InterfaceC1471580oOi> LJ = new WeakHashMap<>();

    public static final SurfaceHolder LIZ(Surface surface) {
        return LIZ.get(surface);
    }

    public static final SurfaceView LIZIZ(Surface surface) {
        if (surface != null) {
            return LIZIZ.get(surface);
        }
        return null;
    }

    public static final TextureView LIZJ(Surface surface) {
        if (surface != null) {
            return LIZJ.get(surface);
        }
        return null;
    }

    public static final void LIZLLL(Surface surface) {
        LIZLLL.remove(surface);
    }
}
