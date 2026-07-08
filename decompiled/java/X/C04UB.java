package X;

import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl;

/* JADX INFO: renamed from: X.04UB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04UB {
    public static final /* synthetic */ C04UB LIZ = new C04UB();

    public static ShareFlavorService LIZ() {
        Object objLIZ = C04TD.LIZ(ShareFlavorService.class, false);
        if (objLIZ != null) {
            return (ShareFlavorService) objLIZ;
        }
        if (C04TD.a5 == null) {
            synchronized (ShareFlavorService.class) {
                if (C04TD.a5 == null) {
                    C04TD.a5 = new ShareFlavorServiceImpl();
                }
            }
        }
        return C04TD.a5;
    }
}
