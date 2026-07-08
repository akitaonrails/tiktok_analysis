package X;

import com.ss.android.ugc.aweme.InflaterInitializer;
import com.ss.android.ugc.aweme.integrate.layoutinflater.InflaterInitializerImpl;

/* JADX INFO: renamed from: X.08Zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2139508Zt {
    public static final InflaterInitializer LIZ;

    static {
        InflaterInitializer inflaterInitializer;
        new Object() { // from class: X.08Zu
        };
        Object objLIZ = C04TD.LIZ(InflaterInitializer.class, false);
        if (objLIZ != null) {
            inflaterInitializer = (InflaterInitializer) objLIZ;
        } else {
            if (C04TD.t1 == null) {
                synchronized (InflaterInitializer.class) {
                    if (C04TD.t1 == null) {
                        C04TD.t1 = new InflaterInitializerImpl();
                    }
                }
            }
            inflaterInitializer = C04TD.t1;
        }
        LIZ = inflaterInitializer;
    }
}
