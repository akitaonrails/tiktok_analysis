package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0iXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246180iXA {
    public static final C1246180iXA LIZ = new C1246180iXA();
    public static final String LIZIZ = UUID.randomUUID().toString();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(14));
    public static Function0<Unit> LIZLLL;

    public static String LIZ() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            return iUserService.getCurrentUserID();
        }
        return null;
    }

    public static void LIZIZ(EnumC1246200iXC enumC1246200iXC) {
        String strLIZ = LIZ();
        if (strLIZ != null && strLIZ.length() > 0) {
            LIZJ(enumC1246200iXC.getValue());
            if (enumC1246200iXC == EnumC1246200iXC.CLOSE_X) {
                C1246190iXB c1246190iXB = (C1246190iXB) LIZJ.getValue();
                int i = c1246190iXB.LIZ().getInt(C1246190iXB.LIZIZ("close_tap_count", strLIZ), 0) + 1;
                c1246190iXB.LIZ().storeInt(C1246190iXB.LIZIZ("close_tap_count", strLIZ), i);
                c1246190iXB.LIZJ(strLIZ);
                if (i >= 2) {
                    c1246190iXB.LIZ().storeBoolean(C1246190iXB.LIZIZ("permanent_exit", strLIZ), true);
                    return;
                }
                return;
            }
            ((C1246190iXB) LIZJ.getValue()).LIZJ(strLIZ);
        }
    }

    public static void LIZJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("banner_id", "campus_verified_profile_banner");
        c2344009Gk.LJIIIIZZ("business_type", "social");
        c2344009Gk.LJIIIIZZ("click_method", str);
        C20684815ws.LJIILLIIL("ttsocial_profile_banner_click", c2344009Gk.LIZ);
    }
}
