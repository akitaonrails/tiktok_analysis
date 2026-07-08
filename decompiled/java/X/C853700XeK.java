package X;

import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0XeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853700XeK {
    public static final C853700XeK LIZ = new C853700XeK();

    public static boolean LIZ() {
        IAccountLoginMethodsService iAccountLoginMethodsService;
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "change_term_for_eu_email", false, false)) {
            return !C294020Bfk.LIZ() || ((iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null)) != null && iAccountLoginMethodsService.LJIILIIL());
        }
        return false;
    }
}
