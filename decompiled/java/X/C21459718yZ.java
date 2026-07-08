package X;

import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21459718yZ {
    public static boolean LIZ = true;

    public static void LIZ(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
            return;
        }
        if (!LIZ) {
            return;
        }
        try {
            viewGroup.suppressLayout(z);
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ = false;
        }
    }
}
