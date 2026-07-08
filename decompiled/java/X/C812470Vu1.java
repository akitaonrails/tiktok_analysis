package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812470Vu1 {
    public static Context LIZ;
    public static Boolean LIZIZ;

    public static synchronized boolean LIZ(Context context) {
        Boolean bool;
        Context contextN3 = C786410Ut5.N3(context);
        Context context2 = LIZ;
        if (context2 != null && (bool = LIZIZ) != null && context2 == contextN3) {
            return bool.booleanValue();
        }
        LIZIZ = null;
        if (C811660Vsi.LIZ()) {
            LIZIZ = Boolean.valueOf(contextN3.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                LIZIZ = Boolean.TRUE;
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                LIZIZ = Boolean.FALSE;
            }
        }
        LIZ = contextN3;
        return LIZIZ.booleanValue();
    }
}
