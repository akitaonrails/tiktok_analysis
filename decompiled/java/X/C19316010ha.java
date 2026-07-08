package X;

import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Set;

/* JADX INFO: renamed from: X.10ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19316010ha {
    public static final C19316010ha LIZ = new C19316010ha();
    public static final Set<String> LIZIZ;

    static {
        C19315910hZ.LIZ.getClass();
        LIZIZ = C15442062u.LJIIIZ(C15442062u.LJIIIIZZ("US", C19315910hZ.LJIIIIZZ), C13LQ.LJLIIL(new String[]{"CA", "GF", "GP", "MF", "MQ", "RE", "YT", "BR"}));
    }

    public static boolean LIZ() {
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ()) {
            return true;
        }
        return iAccountLoginMethodsService.LJI();
    }
}
