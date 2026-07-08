package X;

import android.content.Context;
import android.icu.util.ULocale;
import android.os.Build;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextLanguage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.social.sticker.language.FontTypeEffectMap;
import com.ss.android.ugc.aweme.social.sticker.language.StoryStickerLanguageConfig;
import java.util.Map;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20174913wp {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 400));

    public static String LIZJ() {
        String strLIZ;
        IAVSettingService iAVSettingService = (IAVSettingService) PluggableExtentionKt.pluggableSpi$default(IAVSettingService.class, false, false, false, 14, null);
        if (iAVSettingService != null) {
            C844470XAv.LIZ.getClass();
            InterfaceC1910030znt currentI18nItem = iAVSettingService.getCurrentI18nItem(C844470XAv.LIZ());
            if (currentI18nItem != null && (strLIZ = currentI18nItem.LIZ()) != null) {
                return strLIZ;
            }
        }
        return "";
    }

    public final String LIZ() {
        Map<String, String> fontTypeMap;
        StoryStickerLanguageConfig storyStickerLanguageConfig = C20173813we.LIZ;
        FontTypeEffectMap fontTypeEffectMap = ((StoryStickerLanguageConfig) C20173813we.LIZIZ.getValue()).getFontMap().get(this.LIZ.getValue());
        if (fontTypeEffectMap == null || (fontTypeMap = fontTypeEffectMap.getFontTypeMap()) == null) {
            return null;
        }
        return fontTypeMap.get(EnumC1157960gEs.BLACK.getValue());
    }

    public static String LIZIZ(Context context, String str) {
        Object c098200Yq;
        Object obj = null;
        if (str == null) {
            return null;
        }
        try {
            c098200Yq = LIZLLL(context, str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str2 = (String) obj;
        StoryStickerLanguageConfig storyStickerLanguageConfig = C20173813we.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        return C20173813we.LIZ(str2);
    }

    public static String LIZLLL(Context context, String str) {
        TextClassificationManager textClassificationManager;
        String language;
        int i = 0;
        if (str.length() == 0) {
            return LIZJ();
        }
        if (Build.VERSION.SDK_INT > 29) {
            Object objH2 = C786410Ut5.H2(context, "textclassification");
            ULocale uLocale = null;
            if ((objH2 instanceof TextClassificationManager) && (textClassificationManager = (TextClassificationManager) objH2) != null) {
                TextLanguage textLanguageDetectLanguage = textClassificationManager.getTextClassifier().detectLanguage(new TextLanguage.Request.Builder(str).build());
                if (textLanguageDetectLanguage.getLocaleHypothesisCount() <= 0) {
                    return LIZJ();
                }
                int localeHypothesisCount = textLanguageDetectLanguage.getLocaleHypothesisCount() - 1;
                if (localeHypothesisCount >= 0) {
                    float f = 0.0f;
                    while (true) {
                        ULocale locale = textLanguageDetectLanguage.getLocale(i);
                        float confidenceScore = textLanguageDetectLanguage.getConfidenceScore(locale);
                        if (confidenceScore > f) {
                            uLocale = locale;
                            f = confidenceScore;
                        }
                        if (i == localeHypothesisCount) {
                            break;
                        }
                        i++;
                    }
                    if (uLocale == null || (language = uLocale.getLanguage()) == null) {
                        return "";
                    }
                    int iHashCode = language.hashCode();
                    if (iHashCode == 3121) {
                        if (language.equals("ar")) {
                            return "ar";
                        }
                        return "";
                    }
                    if (iHashCode != 3148) {
                        if (iHashCode != 3325) {
                            if (iHashCode != 3329) {
                                if (iHashCode != 3383) {
                                    if (iHashCode != 3426) {
                                        if (iHashCode != 3428) {
                                            if (iHashCode != 3500) {
                                                if (iHashCode != 3700) {
                                                    if (iHashCode != 3886 || !language.equals("zh")) {
                                                        return "";
                                                    }
                                                    return "zh-Hans";
                                                }
                                                if (!language.equals("th")) {
                                                    return "";
                                                }
                                                return "th-TH";
                                            }
                                            if (!language.equals("my")) {
                                                return "";
                                            }
                                            return "my-MM";
                                        }
                                        if (!language.equals("ko")) {
                                            return "";
                                        }
                                        return "ko-KR";
                                    }
                                    if (!language.equals("km")) {
                                        return "";
                                    }
                                    return "km-KH";
                                }
                                if (!language.equals("ja")) {
                                    return "";
                                }
                                return "ja-JP";
                            }
                            if (!language.equals("hi")) {
                                return "";
                            }
                            return "hi-IN";
                        }
                        if (!language.equals("he")) {
                            return "";
                        }
                        return "he-IL";
                    }
                    if (!language.equals("bn")) {
                        return "";
                    }
                    return "bn-IN";
                }
                return "";
            }
            return LIZJ();
        }
        return LIZJ();
    }
}
