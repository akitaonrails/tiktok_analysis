package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0oTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474460oTM {
    public static Activity LIZ(Context context) {
        if (context == null) {
            return null;
        }
        if (Activity.class.isInstance(context)) {
            return (Activity) context;
        }
        if (!ContextWrapper.class.isInstance(context)) {
            return null;
        }
        return LIZ(((ContextWrapper) context).getBaseContext());
    }

    public static void LIZIZ(C1474420oTI c1474420oTI, Object obj) {
        if (c1474420oTI != null) {
            try {
                Object objCast = null;
                if (Map.class.isInstance(null)) {
                    objCast = Map.class.cast(null);
                }
                Map map = (Map) objCast;
                if (map != null) {
                    map.put("release_reason", obj);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
