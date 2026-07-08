package X;

import android.app.Activity;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0MFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565530MFz {
    public static final Scene LIZ(Scene scene) {
        while (scene != null) {
            if (scene instanceof C0MGE) {
                return scene;
            }
            scene = scene.mParentScene;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC569700MWa LIZIZ(Activity activity, Scene scene) {
        if (activity instanceof InterfaceC569700MWa) {
            return (InterfaceC569700MWa) activity;
        }
        if (!C294080Bfq.LIZ() || scene == 0) {
            return null;
        }
        while (!(scene instanceof InterfaceC569700MWa)) {
            scene = scene.mParentScene;
            if (scene == 0) {
                return null;
            }
        }
        return (InterfaceC569700MWa) scene;
    }
}
