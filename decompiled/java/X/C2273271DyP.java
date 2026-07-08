package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.1DyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273271DyP {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("en", "ar", "de", "es", "fr", FollowStatusChangeMethod.PARAM_UID, "ja", "ko", "ru", "th", "tr", "vi", "zh-Hant", "he", "it", "pt", "hi");

    public static String LIZ() {
        String appLanguage = C0CHQ.LIZ().getAppLanguage();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://www.tiktok.com/legal/page/row/privacy-policy/");
        sbLIZ.append(appLanguage);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
