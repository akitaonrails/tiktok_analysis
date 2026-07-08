package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1DyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273341DyW {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIJ(new Pair("ar", "ar"), new Pair("bg", "bg"), new Pair("bn-IN", "bn"), new Pair("ceb-PH", "ceb"), new Pair("cs-CZ", "cs"), new Pair("da", "da"), new Pair("de-DE", "de"), new Pair("el-GR", "el"), new Pair("en", "en"), new Pair("en-GB", "en-GB"), new Pair("es", "es-ES"), new Pair("et", "et"), new Pair("fi-FI", "fi-FI"), new Pair("fil-PH", "fil"), new Pair("fr", "fr"), new Pair("fr-CA", "fr-CA"), new Pair("gu", "gu"), new Pair("he-IL", "he-IL"), new Pair("hi-IN", "hi"), new Pair("hr", "hr"), new Pair("hu-HU", "hu"), new Pair("id-ID", FollowStatusChangeMethod.PARAM_UID), new Pair("it-IT", "it"), new Pair("ja-JP", "ja-JP"), new Pair("jv-ID", "jv"), new Pair("kk", "kk"), new Pair("km-KH", "km-KH"), new Pair("ko-KR", "ko"), new Pair("lt", "lt"), new Pair("lv", "lv"), new Pair("mr", "mr"), new Pair("ms-MY", "ms"), new Pair("my-MM", "my"), new Pair("nb", "nb"), new Pair("nl-NL", "nl"), new Pair("pl-PL", "pl"), new Pair("pt-BR", "pt-BR"), new Pair("ro-RO", "ro"), new Pair("ru-RU", "ru"), new Pair("sk", "sk"), new Pair("sv-SE", "sv-SE"), new Pair("th-TH", "th"), new Pair("tr-TR", "tr"), new Pair("uk-UA", "uk"), new Pair("ur", "ur"), new Pair("uz", "uz"), new Pair("vi-VN", "vi"), new Pair("zh-Hans", "zh"), new Pair("zh-Hant-TW", "zh-Hant"));

    public static String LIZ() {
        String str;
        try {
            str = (String) ((LinkedHashMap) LIZ).get(C1717770unn.LIZLLL().getCurrentLocaleStr(C1717770unn.LIZJ().getApplicationContext()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str == null ? "en" : str;
    }
}
