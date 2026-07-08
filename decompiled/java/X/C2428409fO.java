package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.09fO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2428409fO {
    public static final String LIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().musicDir());
        sbLIZ.append("rhythm/");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
