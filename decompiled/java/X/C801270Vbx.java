package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Vbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801270Vbx {
    public static final SimpleDateFormat LIZ;
    public static final SimpleDateFormat LIZIZ;

    static {
        IECommerceHostService iECommerceHostService;
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IAppSettingDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAppSettingDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            c1120604Zw.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
        }
        Locale countryLocale = ((IAppSettingDependencyService) iECommerceHostService).getCountryLocale();
        new SimpleDateFormat("yyyy-MM-dd", countryLocale);
        new SimpleDateFormat("MM-dd", countryLocale);
        new SimpleDateFormat("M/d/yyyy", countryLocale);
        new SimpleDateFormat("M/d", countryLocale);
        new SimpleDateFormat("dd/MM", countryLocale);
        new SimpleDateFormat("dd/MM/yyyy", countryLocale);
        LIZ = new SimpleDateFormat("MMM dd, yyyy", countryLocale);
        LIZIZ = new SimpleDateFormat("MMM dd", countryLocale);
        new SimpleDateFormat("MM-dd", Locale.getDefault());
        new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    }
}
