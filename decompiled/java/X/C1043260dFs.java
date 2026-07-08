package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.settings.UploadAdWebPreloadInfoConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043260dFs {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJ;
    public final CopyOnWriteArrayList<C1043320dFy> LJFF = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C1043320dFy> LJI = new CopyOnWriteArrayList<>();
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public JSONObject LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;

    public static boolean LIZJ(String str) {
        ArrayList arrayListLJ;
        List<String> resourceExcludeUrl;
        String strLIZJ = C1043460dGC.LIZJ(str);
        try {
            resourceExcludeUrl = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getResourceExcludeUrl();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (resourceExcludeUrl == null) {
            arrayListLJ = C1697810uHb.LJ("jsonp", "callback", "analytics.tiktok.com/i18n/pixel", "google-analytics.com/analytics", "connect.facebook.net", "www.googletagmanager.com");
        } else {
            arrayListLJ = (ArrayList) resourceExcludeUrl;
        }
        Iterator it2 = arrayListLJ.iterator();
        while (it2.hasNext()) {
            if (a0.LJJIIZI(strLIZJ, (String) it2.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(String str) {
        ArrayList arrayListLJ;
        List<String> parsePathRegex;
        String strLIZJ = C1043460dGC.LIZJ(str);
        try {
            parsePathRegex = C0CLW.LIZIZ.LIZ.getAdLandingPageConfig().getParsePathRegex();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (parsePathRegex == null) {
            arrayListLJ = C1697810uHb.LJ("^https?:\\/\\/www\\.google-analytics\\.com/(?:ga|urchin|analytics)\\.js", "^https?:\\/\\/www\\.googletagmanager\\.com\\/(gtag\\/js|gtm\\.js)", "^https?:\\/\\/analytics\\.tiktok\\.com\\/i18n\\/pixel", "https?:\\/\\/connect\\.facebook\\.net\\/(.*)\\/fbevents\\.js", "https?:\\/\\/mc\\.yandex\\.ru\\/");
        } else {
            arrayListLJ = (ArrayList) parsePathRegex;
        }
        Iterator it2 = arrayListLJ.iterator();
        while (it2.hasNext()) {
            if (new Regex((String) it2.next()).containsMatchIn(strLIZJ)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(String str, String str2, EnumC1043330dFz enumC1043330dFz) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1043270dFt.LJIILIIL) {
            boolean z = false;
            if (!u.LJJIIJZLJL(a0.LJLIIIL(str).toString(), "http://", false) && !u.LJJIIJZLJL(a0.LJLIIIL(str).toString(), "https://", false)) {
                return;
            }
            if (this.LJI.size() > 10000) {
                this.LJI.clear();
                this.LJIIIIZZ = 0;
            }
            if (LIZJ(str) || LIZLLL(str) || a0.LJJJIL(str2)) {
                z = true;
            }
            if (this.LJIIIIZZ <= ((UploadAdWebPreloadInfoConfig.UAWPIConfig) UploadAdWebPreloadInfoConfig.LIZIZ.getValue()).maxUploadFailUrl) {
                int i = C1043340dG0.LIZ[enumC1043330dFz.ordinal()];
                int i2 = 2;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            i2 = -1;
                        } else {
                            this.LJIIIZ++;
                        }
                    } else {
                        i2 = 3;
                    }
                }
                this.LJI.add(new C1043320dFy(C1043460dGC.LIZJ(str), z, i2));
                this.LJIIIIZZ++;
            }
            this.LJIILJJIL += System.currentTimeMillis() - jCurrentTimeMillis;
        }
    }

    public final Pair<String, Integer> LIZIZ(String str, String str2, String str3) {
        if (this.LJIILIIL == null) {
            this.LJIILIIL = ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).E0(str3);
        }
        C1043460dGC c1043460dGC = C1043460dGC.LIZ;
        JSONObject jSONObject = this.LJIILIIL;
        c1043460dGC.getClass();
        if (jSONObject != null) {
            c1043460dGC.getClass();
            Pair<String, Integer> pairLIZLLL = C1043460dGC.LIZLLL(str, jSONObject);
            if (pairLIZLLL == null) {
                return C1043460dGC.LIZLLL(str2, jSONObject);
            }
            return pairLIZLLL;
        }
        return null;
    }
}
