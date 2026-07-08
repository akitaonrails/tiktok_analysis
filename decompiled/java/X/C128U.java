package X;

import com.bytedance.bddatefmt.BDDateFormat;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.128U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C128U {
    public static final C128U LIZ = new C128U();

    public static final String LIZ(long j) {
        Locale countryLocale = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getCountryLocale();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        if (Math.abs(System.currentTimeMillis() - j) / ((long) 86400000) < 2) {
            if (calendar.get(6) == calendar2.get(6)) {
                return new BDDateFormat("tdy").LIZIZ(j, countryLocale);
            }
            return new BDDateFormat("ytd").LIZIZ(j, countryLocale);
        }
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(8) == calendar2.get(8)) {
            return new BDDateFormat("dddd").LIZIZ(j, countryLocale);
        }
        if (calendar.get(1) == calendar2.get(1)) {
            return new BDDateFormat("LL-Y").LIZIZ(j, countryLocale);
        }
        return new BDDateFormat("ll").LIZIZ(j, countryLocale);
    }
}
