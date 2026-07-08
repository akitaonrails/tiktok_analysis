package X;

import com.ss.android.ugc.aweme.IAccountLoginExperimentDefaultsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0XGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845820XGa {
    public static final C845820XGa LIZ = new C845820XGa();

    public static boolean LIZ() {
        Boolean boolDefaultAccountLoginComposeEnabled;
        IAccountLoginExperimentDefaultsService iAccountLoginExperimentDefaultsService = (IAccountLoginExperimentDefaultsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginExperimentDefaultsService.class, false, false, false, 14, null);
        return ((iAccountLoginExperimentDefaultsService == null || (boolDefaultAccountLoginComposeEnabled = iAccountLoginExperimentDefaultsService.defaultAccountLoginComposeEnabled()) == null) ? C0C64.LJIILLIIL().LJIIIIZZ(31744, 1, "login_panel_compose_android", true, false) : boolDefaultAccountLoginComposeEnabled.booleanValue()) && C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 0;
    }
}
