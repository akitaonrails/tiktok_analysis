package X;

import android.app.Activity;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0MWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569780MWi {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1648600t0E LIZ(Scene scene) {
        Activity activity;
        C128Y c128yLIZ;
        if (scene == null || (activity = scene.mActivity) == 0) {
            return null;
        }
        InterfaceC569700MWa interfaceC569700MWaLIZIZ = C565530MFz.LIZIZ(activity, scene);
        if (interfaceC569700MWaLIZIZ != null && !interfaceC569700MWaLIZIZ.LLLLIIL() && (c128yLIZ = C565530MFz.LIZ(scene)) != null) {
            if (!(c128yLIZ instanceof InterfaceC1648600t0E)) {
                return null;
            }
            return (InterfaceC1648600t0E) c128yLIZ;
        }
        if (!(activity instanceof InterfaceC1648600t0E)) {
            return null;
        }
        return (InterfaceC1648600t0E) activity;
    }
}
