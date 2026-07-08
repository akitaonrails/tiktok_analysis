package X;

import android.content.Context;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService;
import com.ss.android.ugc.aweme.service.Social2TabRouteService;

/* JADX INFO: renamed from: X.04TR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TR implements ISocial2TabRouteService {
    public static final C04TR LIZIZ = new C04TR();
    public final /* synthetic */ ISocial2TabRouteService LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabRouteService
    public final void LIZ(Context context, String str, String str2) {
        this.LIZ.LIZ(context, str, str2);
    }

    public C04TR() {
        ISocial2TabRouteService iSocial2TabRouteService;
        Object objLIZ = C04TD.LIZ(ISocial2TabRouteService.class, false);
        if (objLIZ != null) {
            iSocial2TabRouteService = (ISocial2TabRouteService) objLIZ;
        } else {
            if (C04TD.m4 == null) {
                synchronized (ISocial2TabRouteService.class) {
                    if (C04TD.m4 == null) {
                        C04TD.m4 = new Social2TabRouteService();
                    }
                }
            }
            iSocial2TabRouteService = C04TD.m4;
        }
        this.LIZ = iSocial2TabRouteService;
    }
}
