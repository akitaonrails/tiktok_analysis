package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nimpl.service.I18nManagerServiceImpl;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: X.1DyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273301DyS {
    public static final String LJFF;
    public static String LJI;
    public I18nManagerServiceApi LIZIZ;
    public CommonApi LIZLLL;
    public final I18nServiceApi LIZ = (I18nServiceApi) PluggableExtentionKt.pluggableSpi(I18nServiceApi.class);
    public final ILiveOuterService LIZJ = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
    public final C20251614Ly LJ = new InterfaceC20251214Lu() { // from class: X.14Ly
    };

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Api.LIZ);
        sbLIZ.append("/aweme/v1/device/update/");
        LJFF = C2188811AlT.LIZIZ(sbLIZ);
        LJI = null;
    }

    public static boolean LIZLLL() {
        if (C08Q0.LIZIZ(C1BWL.LIZ(), 0, "optimize_i18n") == 0) {
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService == null) {
                return false;
            }
            iPluginService.LJ();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.HashSet, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v3 */
    private void LIZ(Context context) {
        ?? linkedHashSet;
        Set<String> setKeySet = this.LIZIZ.LJIILIIL().keySet();
        Locale locale = Locale.getDefault();
        String strLJIJI = this.LIZIZ.LJIJI(context, locale);
        Keva keva = C2273351DyX.LJ;
        C2273351DyX.LIZJ = keva.getString("perference_system_locale", null);
        keva.storeString("perference_system_locale", locale.toString());
        String str = C2273351DyX.LIZJ;
        boolean zLJIJ = this.LIZIZ.LJIJ(context);
        String strLJIILJJIL = this.LIZIZ.LJIILJJIL(context);
        LJI = strLJIILJJIL;
        if (zLJIJ) {
            keva.storeStringSet("support_local_list", setKeySet);
            return;
        }
        Set<String> stringSet = keva.getStringSet("support_local_list", null);
        C2273351DyX.LIZLLL = stringSet;
        if (stringSet == null) {
            linkedHashSet = setKeySet;
        } else {
            linkedHashSet = new LinkedHashSet();
            for (String str2 : setKeySet) {
                if (!stringSet.contains(str2)) {
                    linkedHashSet.add(str2);
                }
            }
        }
        this.LIZIZ.LJIJJLI(context);
        String strLJIJJ = this.LIZIZ.LJIJJ(context);
        Keva keva2 = C2273351DyX.LJ;
        keva2.storeStringSet("support_local_list", setKeySet);
        if (!linkedHashSet.isEmpty()) {
            String strLJIL = this.LIZIZ.LJIL(context, locale);
            if (strLJIL == null) {
                return;
            }
            for (String str3 : linkedHashSet) {
                if (str3.equals(strLJIL)) {
                    if (this.LIZIZ.LIZLLL(str3) == null || str3 == null) {
                        return;
                    }
                    if (str == null && !"fa".equals(C786410Ut5.t2(locale).toLowerCase())) {
                        if (strLJIJJ.equals(strLJIJI)) {
                            if (strLJIL.equals(strLJIILJJIL)) {
                                return;
                            }
                            this.LIZIZ.LJJ(context);
                            C2273351DyX.LIZ = 1;
                            C2273351DyX.LJ.storeInt("language_is_auto_change", 1);
                            return;
                        }
                        int i = C2273351DyX.LIZ;
                        return;
                    }
                    LIZIZ(context, locale, null, setKeySet);
                    return;
                }
            }
            return;
        }
        if (keva2.getBoolean("user_change_locale", false)) {
            return;
        }
        LIZIZ(context, locale, str, setKeySet);
    }

    public static void LJ(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(268468224);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOP5O5GA0DOa6Sqag76wnKu4+iDdNg8RTSSwObGdE5Sr", null));
    }

    public final void LIZJ(Context context) {
        I18nServiceApi i18nServiceApi = this.LIZ;
        if (i18nServiceApi != null && i18nServiceApi.LIZ() != null) {
            I18nManagerServiceApi i18nManagerServiceApiLIZ = this.LIZ.LIZ();
            this.LIZIZ = i18nManagerServiceApiLIZ;
            i18nManagerServiceApiLIZ.LJIIJ(context, Locale.getDefault(), this.LJ, LIZLLL());
            C844470XAv.LIZ.getClass();
            if ("local_test".equals(C844470XAv.LJIILL) || "lark_inhouse".equals(C844470XAv.LJIILL)) {
                this.LIZIZ.LJIIIZ("dd", "dd", "", "Translate To Key").LJIIIZ("st-JO", "st", "", "h5/lynx test language");
            }
            I18nManagerServiceImpl i18nManagerServiceImplLJIIIZ = this.LIZIZ.LJIIIZ("az", "az", "", "Azərbaycan");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("id-ID", FollowStatusChangeMethod.PARAM_UID, "ID", "Bahasa Indonesia");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ms-MY", "ms", "MY", "Bahasa Melayu");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("jv-ID", "jv", "ID", "Basa Jawa");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ca", "ca", "", "Català");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ceb-PH", "ceb", "PH", "Cebuano");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("cs-CZ", "cs", "CZ", "Čeština");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("da", "da", "", "Dansk");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("de-DE", "de", "DE", "Deutsch");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("et", "et", "", "Eesti");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("en-GB", "en", "GB", "English (UK)");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("en", "en", "", "English (US)");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("es", "es", "", "Español");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("es-419", "es", "419", "Español (Latinoamérica)");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("fil-PH", "fil", "PH", "Filipino");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("fr", "fr", "", "Français");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("fr-CA", "fr", "CA", "Français (Canada)");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ga", "ga", "", "Gaeilge");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("hr", "hr", "", "Hrvatski");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("is", "is", "", "Íslenska");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("it-IT", "it", "IT", "Italiano");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("sw", "sw", "", "Kiswahili");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("lv", "lv", "", "Latviešu");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("lt", "lt", "", "Lietuvių");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("hu-HU", "hu", "HU", "Magyar");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("nl-NL", "nl", "NL", "Nederlands");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("nb", "nb", "", "norsk (bokmål)");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("uz", "uz", "", "Oʻzbek");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("pl-PL", "pl", "PL", "Polski");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("pt", "pt", "", "Português");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("pt-BR", "pt", "BR", "Português (Brasil)");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ro-RO", "ro", "RO", "Română");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("sq", "sq", "", "Shqip");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("sk", "sk", "", "Slovenčina");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("sl", "sl", "", "Slovenščina");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("fi-FI", "fi", "FI", "Suomi");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("sv-SE", "sv", "SE", "Svenska");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("vi-VN", "vi", "VN", "Tiếng Việt");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("tr-TR", "tr", "TR", "Türkçe");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("el-GR", "el", "GR", "Ελληνικά");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("bg", "bg", "", "Български");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("kk", "kk", "", "Қазақша");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ru-RU", "ru", "RU", "Русский");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("uk-UA", "uk", "UA", "Українська");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("he-IL", "he", "IL", "עברית");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ur", "ur", "", "اردو");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ar", "ar", "", "العربية");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("fa-IR", "fa", "IR", "فارسی");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("hi-IN", "hi", "IN", "हिंदी");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("bn-IN", "bn", "IN", "বাংলা");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("th-TH", "th", "TH", "ภาษาไทย");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("my-MM", "my", "MM", "မြန်မာ");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("km-KH", "km", "KH", "ខ្មែរ");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ja-JP", "ja", "JP", "日本語");
            i18nManagerServiceImplLJIIIZ.LJJIFFI("zh-Hant-TW", "TW", "中文（繁體）", "zh-Hant");
            i18nManagerServiceImplLJIIIZ.LJJIFFI("zh-Hans", "", "中文（简体）", "zh-Hans");
            i18nManagerServiceImplLJIIIZ.LJIIIZ("ko-KR", "ko", "KR", "한국어");
            HashMap map = new HashMap();
            InterfaceC1910030znt interfaceC1910030znt = this.LIZIZ.LJIILIIL().get("en-GB");
            map.put("af", interfaceC1910030znt);
            map.put("en-AU", interfaceC1910030znt);
            map.put("en-NZ", interfaceC1910030znt);
            map.put("en-SG", interfaceC1910030znt);
            map.put("en-AG", interfaceC1910030znt);
            map.put("en-AI", interfaceC1910030znt);
            map.put("en-BB", interfaceC1910030znt);
            map.put("en-BM", interfaceC1910030znt);
            map.put("en-BS", interfaceC1910030znt);
            map.put("en-BW", interfaceC1910030znt);
            map.put("en-BZ", interfaceC1910030znt);
            map.put("en-DM", interfaceC1910030znt);
            map.put("en-FJ", interfaceC1910030znt);
            map.put("en-GD", interfaceC1910030znt);
            map.put("en-GH", interfaceC1910030znt);
            map.put("en-GM", interfaceC1910030znt);
            map.put("en-GY", interfaceC1910030znt);
            map.put("en-IN", interfaceC1910030znt);
            map.put("en-IE", interfaceC1910030znt);
            map.put("en-JM", interfaceC1910030znt);
            map.put("en-RW", interfaceC1910030znt);
            map.put("en-KN", interfaceC1910030znt);
            map.put("en-KY", interfaceC1910030znt);
            map.put("en-LC", interfaceC1910030znt);
            map.put("si-LK", interfaceC1910030znt);
            map.put("en-MS", interfaceC1910030znt);
            map.put("en-MY", interfaceC1910030znt);
            map.put("en-MT", interfaceC1910030znt);
            map.put("en-MU", interfaceC1910030znt);
            map.put("en-MW", interfaceC1910030znt);
            map.put("en-NA", interfaceC1910030znt);
            map.put("en-NG", interfaceC1910030znt);
            map.put("ne-NP", interfaceC1910030znt);
            map.put("en-NR", interfaceC1910030znt);
            map.put("en-PG", interfaceC1910030znt);
            map.put("en-SB", interfaceC1910030znt);
            map.put("en-ZA", interfaceC1910030znt);
            map.put("en-SC", interfaceC1910030znt);
            map.put("en-SL", interfaceC1910030znt);
            map.put("en-TC", interfaceC1910030znt);
            map.put("en-TO", interfaceC1910030znt);
            map.put("en-TT", interfaceC1910030znt);
            map.put("en-VC", interfaceC1910030znt);
            map.put("en-VG", interfaceC1910030znt);
            map.put("en-VU", interfaceC1910030znt);
            map.put("en-ZM", interfaceC1910030znt);
            map.put("en-ZW", interfaceC1910030znt);
            map.put("en-SZ", interfaceC1910030znt);
            map.put("en-HK", interfaceC1910030znt);
            map.put("en-MO", interfaceC1910030znt);
            map.put("en-BD", interfaceC1910030znt);
            map.put("en-BT", interfaceC1910030znt);
            map.put("en-BN", interfaceC1910030znt);
            map.put("en-KH", interfaceC1910030znt);
            map.put("en-LA", interfaceC1910030znt);
            map.put("en-MM", interfaceC1910030znt);
            map.put("en-NP", interfaceC1910030znt);
            map.put("en-PK", interfaceC1910030znt);
            map.put("en-LK", interfaceC1910030znt);
            InterfaceC1910030znt interfaceC1910030znt2 = this.LIZIZ.LJIILIIL().get("es");
            map.put("es-ES", interfaceC1910030znt2);
            map.put("es-GQ", interfaceC1910030znt2);
            map.put("es-AD", interfaceC1910030znt2);
            map.put("es", this.LIZIZ.LJIILIIL().get("es-419"));
            this.LIZIZ.LJIIIIZZ(map);
            try {
                if (C2104408Mg.LIZJ(context)) {
                    LIZ(context);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i = C2273351DyX.LIZ;
            }
        }
    }

    private void LIZIZ(Context context, Locale locale, String str, Set<String> set) {
        String strLJIL;
        IPluginService iPluginService;
        if (locale.toString().equals(str) || (strLJIL = this.LIZIZ.LJIL(context, locale)) == null) {
            return;
        }
        Iterator<String> it2 = set.iterator();
        while (it2.hasNext()) {
            if (strLJIL.equals(it2.next())) {
                Locale localeLIZLLL = this.LIZIZ.LIZLLL(strLJIL);
                if (!LIZLLL() || ((iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi(IPluginService.class)) != null && iPluginService.LJJIFFI(localeLIZLLL))) {
                    this.LIZIZ.LJJ(context);
                    C2273351DyX.LIZ = 3;
                    C2273351DyX.LJ.storeInt("language_is_auto_change", 1);
                    return;
                } else {
                    Keva keva = C2273351DyX.LJ;
                    keva.storeString("download_locale", strLJIL);
                    keva.storeString("perference_system_locale", C2273351DyX.LIZJ);
                    C2273351DyX.LIZJ = null;
                    return;
                }
            }
        }
    }
}
