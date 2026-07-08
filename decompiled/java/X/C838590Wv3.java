package X;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: X.0Wv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838590Wv3 {
    public static final List<Set<String>> LIZ = C1697810uHb.LJIIJJI(C13LQ.LJLIIL(new String[]{"zh", "zh_CN"}), C13LQ.LJLIIL(new String[]{"he", "iw"}), C13LQ.LJLIIL(new String[]{FollowStatusChangeMethod.PARAM_UID, "in"}), C13LQ.LJLIIL(new String[]{"yi", "ji"}));

    public static final String LIZ(Configuration configuration) {
        if (Build.VERSION.SDK_INT < 24) {
            Locale locale = configuration.locale;
            if (locale == null) {
                return null;
            }
            return locale.toString();
        }
        LocaleList locales = configuration.getLocales();
        if (locales.isEmpty()) {
            Locale locale2 = configuration.locale;
            if (locale2 == null) {
                return null;
            }
            return locale2.toString();
        }
        return locales.get(0).toString();
    }
}
