package X;

import com.ss.android.ugc.aweme.BootLogInitializer;
import com.ss.android.ugc.aweme.integrate.bootlog.BootLogInitializerImpl;

/* JADX INFO: renamed from: X.04Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1103004Tc {
    public static final BootLogInitializer LIZ;

    static {
        BootLogInitializer bootLogInitializer;
        Object objLIZ = C04TD.LIZ(BootLogInitializer.class, false);
        if (objLIZ != null) {
            bootLogInitializer = (BootLogInitializer) objLIZ;
        } else {
            if (C04TD.s1 == null) {
                synchronized (BootLogInitializer.class) {
                    if (C04TD.s1 == null) {
                        C04TD.s1 = new BootLogInitializerImpl();
                    }
                }
            }
            bootLogInitializer = C04TD.s1;
        }
        LIZ = bootLogInitializer;
    }
}
