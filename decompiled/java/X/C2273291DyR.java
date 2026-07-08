package X;

import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273291DyR {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("en", "ar", "de", "es", "fr", FollowStatusChangeMethod.PARAM_UID, "ja", "ko", "ru", "th", "tr", "vi", "zh-Hant", "he", "it", "pt", "hi");

    public static String LIZ() {
        List<InterfaceC586170Myt> list = C0XQ5.LIZ;
        String appLanguage = ((ILanguageService) C0XPY.LIZIZ(ILanguageService.class)).getAppLanguage();
        if (!LIZ.contains(appLanguage)) {
            appLanguage = "en";
        }
        return Intrinsics.LJFF(appLanguage, "zh-Hant") ? "zh_Hant" : Intrinsics.LJFF(appLanguage, "he") ? "he_IL" : appLanguage;
    }
}
