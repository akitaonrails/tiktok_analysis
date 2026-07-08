package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.08PY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PY {
    public static WeakReference<Bundle> LIZ;

    public static Object LIZ(Context context, String str) {
        Bundle bundle;
        Object obj = null;
        if (context != null) {
            try {
                WeakReference<Bundle> weakReference = LIZ;
                if (weakReference != null) {
                    bundle = weakReference.get();
                } else {
                    bundle = null;
                }
                if (bundle == null) {
                    bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    LIZ = new WeakReference<>(bundle);
                }
                try {
                    obj = bundle.get(str);
                    return obj;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return obj;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return obj;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        return obj;
    }
}
