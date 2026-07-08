package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273311DyT {
    public static final Map<String, String> LIZ;

    static {
        HashMap map = new HashMap();
        LIZ = map;
        map.put("en", "en");
        map.put("af", "af-ZA");
        map.put("ar", "ar");
        map.put("bn", "bn-IN");
        map.put("ceb", "ceb-PH");
        map.put("cs", "cs-CZ");
        map.put("de", "de-DE");
        map.put("el", "el-GR");
        map.put("es", "es");
        map.put("fi", "fi-FI");
        map.put("fil", "fil-PH");
        map.put("fr", "fr");
        map.put("iw", "he-IL");
        map.put("he", "he-IL");
        map.put("hi", "hi-IN");
        map.put("hu", "hu-HU");
        map.put("in", "id-ID");
        map.put(FollowStatusChangeMethod.PARAM_UID, "id-ID");
        map.put("it", "it-IT");
        map.put("ja", "ja-JP");
        map.put("jv", "jv-ID");
        map.put("km", "km-KH");
        map.put("kn", "kn-IN");
        map.put("ko", "ko-KR");
        map.put("ml", "ml-IN");
        map.put("ms", "ms-MY");
        map.put("my", "my-MM");
        map.put("nl", "nl-NL");
        map.put("or", "or-IN");
        map.put("pa", "pa-IN");
        map.put("pl", "pl-PL");
        map.put("pt-BR", "pt-BR");
        map.put("ro", "ro-RO");
        map.put("ru", "ru-RU");
        map.put("sv", "sv-SE");
        map.put("ta", "ta-IN");
        map.put("te", "te-IN");
        map.put("th", "th-TH");
        map.put("tr", "tr-TR");
        map.put("ur", "ur");
        map.put("uk", "uk-UA");
        map.put("vi", "vi-VN");
        map.put("tw", "zh-Hant-TW");
        map.put("zh", "zh-Hans");
        map.put("zu", "zu-ZA");
        map.put("uz", "uz");
        map.put("da", "da");
        map.put("gu", "gu");
        map.put("mr", "mr");
        map.put("nb", "nb");
        map.put("fr-CA", "fr-CA");
        map.put("bg", "bg");
        map.put("et", "et");
        map.put("hr", "hr");
        map.put("lt", "lt");
        map.put("lv", "lv");
        map.put("sk", "sk");
        map.put("ca", "ca");
        map.put("sl", "sl");
        map.put("pt", "pt");
        map.put("ga", "ga");
        map.put("is", "is");
        map.put("kk", "kk");
        map.put("sq", "sq");
        map.put("az", "az");
        map.put("sw", "sw");
        map.put("es-419", "es-419");
        map.put("en-GB", "en-GB");
        map.put("fa-IR", "fa-IR");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.util.Locale r4) {
        /*
            java.lang.String r3 = "en"
            if (r4 == 0) goto Lb8
            java.lang.String r0 = X.C786410Ut5.t2(r4)
            if (r0 == 0) goto Lb8
            java.lang.String r2 = X.C786410Ut5.t2(r4)
        Le:
            java.lang.String r1 = X.C837920Wty.LIZIZ(r4)
        L13:
            java.lang.String r0 = "zh"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L27
            java.lang.String r0 = "TW"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L27
            java.lang.String r2 = "tw"
        L27:
            java.lang.String r0 = "fr"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L39
            java.lang.String r0 = "CA"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L39
            java.lang.String r2 = "fr-CA"
        L39:
            java.lang.String r0 = "fa"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = "IR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4b
            java.lang.String r2 = "fa-IR"
        L4b:
            java.lang.String r0 = "pt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5d
            java.lang.String r0 = "BR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5d
            java.lang.String r2 = "pt-BR"
        L5d:
            java.lang.String r0 = "es"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6f
            java.lang.String r0 = "419"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            java.lang.String r2 = "es-419"
        L6f:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L7f
            java.lang.String r0 = "GB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7f
            java.lang.String r2 = "en-GB"
        L7f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r1 < r0) goto La4
            java.lang.String r0 = "in"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8f
            java.lang.String r2 = "id"
        L8f:
            java.lang.String r0 = "iw"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L99
            java.lang.String r2 = "he"
        L99:
            java.lang.String r0 = "ji"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto La4
            java.lang.String r2 = "yi"
        La4:
            java.util.Map<java.lang.String, java.lang.String> r1 = X.C2273311DyT.LIZ
            r0 = r1
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lbf
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Lb8:
            r2 = r3
            if (r4 != 0) goto Le
            java.lang.String r1 = ""
            goto L13
        Lbf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2273311DyT.LIZ(java.util.Locale):java.lang.String");
    }
}
