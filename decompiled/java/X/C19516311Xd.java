package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.11Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19516311Xd {
    public static final C19516311Xd LIZ = new C19516311Xd();
    public static final Keva LIZIZ = Keva.getRepo("ecommerce_live_shop_bag_guide_bubble_preference");
    public static String LIZJ;
    public static long LIZLLL;

    public static String LIZ(String str) {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shown_count_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(currentUserID);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
