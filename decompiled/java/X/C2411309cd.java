package X;

import com.ss.android.ugc.aweme.app.launch.SystemServiceApiImpl;
import com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi;

/* JADX INFO: renamed from: X.09cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2411309cd implements ISystemServiceApi {
    public static final C2411309cd LIZIZ = new C2411309cd();
    public final /* synthetic */ ISystemServiceApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.system.ISystemServiceApi
    public final InterfaceC817550W5h LIZ() {
        return this.LIZ.LIZ();
    }

    public C2411309cd() {
        ISystemServiceApi iSystemServiceApi;
        Object objLIZ = C04TD.LIZ(ISystemServiceApi.class, false);
        if (objLIZ != null) {
            iSystemServiceApi = (ISystemServiceApi) objLIZ;
        } else {
            if (C04TD.LLIFFJFJJ == null) {
                synchronized (ISystemServiceApi.class) {
                    if (C04TD.LLIFFJFJJ == null) {
                        C04TD.LLIFFJFJJ = new SystemServiceApiImpl();
                    }
                }
            }
            iSystemServiceApi = C04TD.LLIFFJFJJ;
        }
        this.LIZ = iSystemServiceApi;
    }
}
