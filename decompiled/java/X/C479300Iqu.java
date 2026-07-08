package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0Iqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479300Iqu {
    public static final C479300Iqu LIZ = new C479300Iqu();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(297));

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZIZ() {
        String appLanguage;
        ILanguageService iLanguageService = (ILanguageService) PluggableExtentionKt.pluggableSpi$default(ILanguageService.class, false, false, false, 14, null);
        return (iLanguageService == null || (appLanguage = iLanguageService.getAppLanguage()) == null) ? "" : new SimpleDateFormat("yyyy-MM-dd", new Locale(appLanguage)).format(new Date());
    }
}
