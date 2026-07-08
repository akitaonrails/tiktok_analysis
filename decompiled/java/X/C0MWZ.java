package X;

import android.app.Activity;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0MWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MWZ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC524950KiL LIZ(Scene scene) {
        Activity activity;
        C128Y c128yLIZ;
        if (scene == null || (activity = scene.mActivity) == 0) {
            return null;
        }
        InterfaceC569700MWa interfaceC569700MWaLIZIZ = C565530MFz.LIZIZ(activity, scene);
        if (((interfaceC569700MWaLIZIZ != null && !interfaceC569700MWaLIZIZ.LLLLIIL()) || (activity instanceof C08B7)) && (c128yLIZ = C565530MFz.LIZ(scene)) != null) {
            if (!(c128yLIZ instanceof InterfaceC524950KiL)) {
                return null;
            }
            return (InterfaceC524950KiL) c128yLIZ;
        }
        if (!(activity instanceof InterfaceC524950KiL)) {
            return null;
        }
        return (InterfaceC524950KiL) activity;
    }
}
