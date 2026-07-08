package X;

import com.ss.android.ugc.tiktok.pns.FPGsonService;
import com.ss.android.ugc.tiktok.pns.services.FPGsonServiceImpl;

/* JADX INFO: renamed from: X.04TJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TJ {
    public static final /* synthetic */ C04TJ LIZ = new C04TJ();

    public static FPGsonService LIZ() {
        Object objLIZ = C04TD.LIZ(FPGsonService.class, false);
        if (objLIZ != null) {
            return (FPGsonService) objLIZ;
        }
        if (C04TD.Z6 == null) {
            synchronized (FPGsonService.class) {
                if (C04TD.Z6 == null) {
                    C04TD.Z6 = new FPGsonServiceImpl();
                }
            }
        }
        return C04TD.Z6;
    }
}
