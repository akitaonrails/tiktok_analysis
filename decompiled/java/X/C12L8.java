package X;

import androidx.window.extensions.WindowExtensionsProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12L8, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12L8 {
    public static final C12L8 LIZ = new C12L8();

    static {
        C13LE.LIZ(C12L8.class).LJI();
    }

    public static int LIZ() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (UnsupportedOperationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return 0;
        }
    }
}
