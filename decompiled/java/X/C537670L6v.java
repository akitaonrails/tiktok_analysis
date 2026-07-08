package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0L6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537670L6v {
    public static final Bundle LIZ(C1DRG c1drg, Activity activity) {
        Bundle bundle;
        Bundle extras = null;
        Scene scene = (Scene) c1drg.LJIIL(null, AbstractC214814194y.class);
        if (scene == null || (bundle = scene.mArguments) == null) {
            try {
                extras = activity.getIntent().getExtras();
                return extras;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return extras;
            }
        }
        return bundle;
    }
}
