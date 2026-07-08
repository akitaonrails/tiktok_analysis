package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.preload.IPreloadService;
import com.ss.android.ugc.aweme.preload.services.PreloadServiceImpl;

/* JADX INFO: renamed from: X.0hlN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216550hlN implements IPreloadService {
    public static final C1216550hlN LIZIZ = new C1216550hlN();
    public final /* synthetic */ IPreloadService LIZ;

    @Override // com.ss.android.ugc.aweme.preload.IPreloadService
    public final void LIZ(Fragment fragment, String str, boolean z) {
        this.LIZ.LIZ(fragment, str, z);
    }

    public C1216550hlN() {
        IPreloadService iPreloadService;
        Object objLIZ = C04TD.LIZ(IPreloadService.class, false);
        if (objLIZ != null) {
            iPreloadService = (IPreloadService) objLIZ;
        } else {
            if (C04TD.j3 == null) {
                synchronized (IPreloadService.class) {
                    if (C04TD.j3 == null) {
                        C04TD.j3 = new PreloadServiceImpl();
                    }
                }
            }
            iPreloadService = C04TD.j3;
        }
        this.LIZ = iPreloadService;
    }
}
