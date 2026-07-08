package X;

import android.app.Activity;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12LG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12LG {
    public static C1887107aH LIZJ() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            return C1886707aD.LIZ(apiVersion);
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (UnsupportedOperationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static IBinder LIZ(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            return attributes.token;
        }
        return null;
    }

    public static SidecarInterface LIZIZ(C19EG c19eg) {
        return SidecarProvider.getSidecarImpl(C786410Ut5.N3(c19eg));
    }
}
