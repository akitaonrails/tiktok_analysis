package X;

import com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi;
import com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla.GodzillaImpl;

/* JADX INFO: renamed from: X.04TV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TV implements IGodzillaApi {
    public static final C04TV LIZIZ = new C04TV();
    public final /* synthetic */ IGodzillaApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    public C04TV() {
        IGodzillaApi iGodzillaApi;
        Object objLIZ = C04TD.LIZ(IGodzillaApi.class, false);
        if (objLIZ != null) {
            iGodzillaApi = (IGodzillaApi) objLIZ;
        } else {
            if (C04TD.E1 == null) {
                synchronized (IGodzillaApi.class) {
                    if (C04TD.E1 == null) {
                        C04TD.E1 = new GodzillaImpl();
                    }
                }
            }
            iGodzillaApi = C04TD.E1;
        }
        this.LIZ = iGodzillaApi;
    }
}
