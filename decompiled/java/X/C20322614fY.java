package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.14fY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20322614fY {
    public static final C20322614fY LIZ = new C20322614fY();
    public static final Keva LIZIZ = Keva.getRepo("ecommerce_live_dismiss_pin_preference");
    public static String LIZJ;

    public static String LIZ() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss_count_");
        sbLIZ.append(currentUserID);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
