package X;

import com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi;
import com.ss.android.ugc.aweme.legoImpl.task.ExitBackgroundImpl;

/* JADX INFO: renamed from: X.04TW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TW implements ExitBackgroundSpi {
    public static final C04TW LIZIZ = new C04TW();
    public final /* synthetic */ ExitBackgroundSpi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.launcher.ExitBackgroundSpi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public C04TW() {
        ExitBackgroundSpi exitBackgroundSpi;
        Object objLIZ = C04TD.LIZ(ExitBackgroundSpi.class, false);
        if (objLIZ != null) {
            exitBackgroundSpi = (ExitBackgroundSpi) objLIZ;
        } else {
            if (C04TD.X1 == null) {
                synchronized (ExitBackgroundSpi.class) {
                    if (C04TD.X1 == null) {
                        C04TD.X1 = new ExitBackgroundImpl();
                    }
                }
            }
            exitBackgroundSpi = C04TD.X1;
        }
        this.LIZ = exitBackgroundSpi;
    }
}
