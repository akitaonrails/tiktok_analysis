package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.ss.android.ugc.trill.feedback.api.CSPPageApi;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0u3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689110u3Z<DATA> {
    public final C199596137q LIZ;
    public final DiskLruCache LIZIZ;
    public final String LIZJ;
    public final ExecutorService LIZLLL;

    public C1689110u3Z() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        CSPPageApi.LIZ.getClass();
        sbLIZ.append(C610330Nwl.LJFF);
        sbLIZ.append('_');
        sbLIZ.append("csp_items");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ2.append(C786410Ut5.w2(C844470XAv.LIZ()).getAbsolutePath());
        String str = File.separator;
        sbLIZ2.append(str);
        sbLIZ2.append("CSP");
        sbLIZ2.append(str);
        sbLIZ2.append(C844470XAv.LJIIJ);
        sbLIZ2.append("_cache");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "CSPNativeDataCache";
        this.LIZLLL = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        this.LIZ = new C199593137n().LIZ();
        try {
            this.LIZIZ = DiskLruCache.open(new C0VSJ(strLIZIZ), ((IMainService) ServiceManager.get().getService(IMainService.class)).getAppVersionCode(), 1, 2147483647L);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final String LIZ() {
        ISettingService iSettingService = (ISettingService) ServiceManager.get().getService(ISettingService.class);
        String appLanguage = iSettingService.getAppLanguage();
        Locale countryLocale = iSettingService.getCountryLocale();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('_');
        LruCache<Integer, String> lruCache = C0SRQ.LIZ;
        String strLIZIZ = C837920Wty.LIZIZ(Locale.getDefault());
        Locale locale = Locale.ROOT;
        sbLIZ.append(strLIZIZ.toLowerCase(locale));
        sbLIZ.append('_');
        sbLIZ.append(appLanguage.toLowerCase(locale));
        sbLIZ.append('_');
        sbLIZ.append(C786410Ut5.t2(countryLocale).toLowerCase(locale));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
