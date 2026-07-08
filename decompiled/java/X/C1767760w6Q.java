package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.manager.StickyDiversionConfigData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w6Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767760w6Q {
    public static final C1767760w6Q LIZ = new C1767760w6Q();
    public static StickyDiversionConfigData LIZIZ;

    static {
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(new InterfaceC586170Myt() { // from class: X.0w6R
                @Override // X.InterfaceC586170Myt
                public final void onAccountResult(int i, boolean z, int i2, User user) {
                    C1767760w6Q.LIZIZ = null;
                }
            });
        }
    }

    public static String LIZ(boolean z) {
        Map<String, Object> map;
        Map<String, Object> map2;
        StickyDiversionConfigData stickyDiversionConfigData = LIZIZ;
        if (stickyDiversionConfigData == null) {
            return null;
        }
        if (z) {
            Boolean bool = stickyDiversionConfigData.LIZ;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                Integer num = stickyDiversionConfigData.isSticky;
                if (num == null || num.intValue() != 1 || (map2 = stickyDiversionConfigData.config) == null) {
                    return null;
                }
                return C1741890vQh.LJIIIIZZ(map2);
            }
            stickyDiversionConfigData.LIZ = bool2;
            Map<String, Object> map3 = stickyDiversionConfigData.config;
            if (map3 == null) {
                return null;
            }
            return C1741890vQh.LJIIIIZZ(map3);
        }
        Integer num2 = stickyDiversionConfigData.isSticky;
        if (num2 == null || num2.intValue() != 1 || (map = stickyDiversionConfigData.config) == null) {
            return null;
        }
        return C1741890vQh.LJIIIIZZ(map);
    }
}
