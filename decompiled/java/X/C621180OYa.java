package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ShareService;

/* JADX INFO: renamed from: X.0OYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621180OYa {
    public static ShareService LIZ;
    public static ShareExtService LIZIZ;

    static {
        if (LIZ == null) {
            LIZ = (ShareService) ServiceManager.get().getService(ShareService.class);
        }
        if (LIZIZ == null) {
            LIZIZ = (ShareExtService) ServiceManager.get().getService(ShareExtService.class);
        }
    }

    public static ShareService LIZ() {
        return LIZ;
    }
}
