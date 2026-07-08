package X;

import com.ss.android.experiment.LauncherExperimentsImpl;
import com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.04vF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1252704vF implements ILauncherExperimentsApi {
    public static final C1252704vF LIZIZ = new C1252704vF();
    public final /* synthetic */ ILauncherExperimentsApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.ILauncherExperimentsApi
    public final AtomicBoolean isInitialized() {
        return this.LIZ.isInitialized();
    }

    public C1252704vF() {
        ILauncherExperimentsApi iLauncherExperimentsApi;
        Object objLIZ = C04TD.LIZ(ILauncherExperimentsApi.class, false);
        if (objLIZ != null) {
            iLauncherExperimentsApi = (ILauncherExperimentsApi) objLIZ;
        } else {
            if (C04TD.LJJLI == null) {
                synchronized (ILauncherExperimentsApi.class) {
                    if (C04TD.LJJLI == null) {
                        C04TD.LJJLI = new LauncherExperimentsImpl();
                    }
                }
            }
            iLauncherExperimentsApi = C04TD.LJJLI;
        }
        this.LIZ = iLauncherExperimentsApi;
    }
}
