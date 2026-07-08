package X;

import com.ss.android.ugc.aweme.social.sticker.language.FontTypeEffectMap;
import com.ss.android.ugc.aweme.social.sticker.language.StoryStickerLanguageConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13we, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20173813we {
    public static final StoryStickerLanguageConfig LIZ = new StoryStickerLanguageConfig(null, 1, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(317));

    public static String LIZ(String str) {
        Map<String, String> fontTypeMap;
        FontTypeEffectMap fontTypeEffectMap = ((StoryStickerLanguageConfig) LIZIZ.getValue()).getFontMap().get(str);
        if (fontTypeEffectMap != null && (fontTypeMap = fontTypeEffectMap.getFontTypeMap()) != null) {
            return fontTypeMap.get(EnumC1157960gEs.BOLD.getValue());
        }
        return null;
    }
}
