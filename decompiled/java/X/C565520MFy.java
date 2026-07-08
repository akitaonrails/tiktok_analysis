package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565520MFy {
    public static final Bundle LIZ(View view) {
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (sceneLIZ != null) {
            return LIZIZ(sceneLIZ);
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public static final Bundle LIZIZ(Scene scene) {
        Activity activity;
        if (scene != null && (activity = scene.mActivity) != null) {
            InterfaceC569700MWa interfaceC569700MWaLIZIZ = C565530MFz.LIZIZ(activity, scene);
            if (interfaceC569700MWaLIZIZ != null) {
                interfaceC569700MWaLIZIZ.LLIL();
                Scene sceneLIZ = C565530MFz.LIZ(scene);
                if (sceneLIZ != null) {
                    return sceneLIZ.mArguments;
                }
            }
            try {
                return activity.getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
