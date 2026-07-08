package X;

import com.ss.android.experiment.ImageHeaderConfigImpl;
import com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig;
import java.util.Set;

/* JADX INFO: renamed from: X.0W1S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1S implements IImageHeaderConfig {
    public static final C0W1S LIZIZ = new C0W1S();
    public final /* synthetic */ IImageHeaderConfig LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final Set<String> LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final String LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final long LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.experiment.IImageHeaderConfig
    public final boolean isEnable() {
        return this.LIZ.isEnable();
    }

    public C0W1S() {
        IImageHeaderConfig iImageHeaderConfig;
        Object objLIZ = C04TD.LIZ(IImageHeaderConfig.class, false);
        if (objLIZ != null) {
            iImageHeaderConfig = (IImageHeaderConfig) objLIZ;
        } else {
            if (C04TD.LJJL == null) {
                synchronized (IImageHeaderConfig.class) {
                    if (C04TD.LJJL == null) {
                        C04TD.LJJL = new ImageHeaderConfigImpl();
                    }
                }
            }
            iImageHeaderConfig = C04TD.LJJL;
        }
        this.LIZ = iImageHeaderConfig;
    }
}
