package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844450XAt {
    public static final String[] LIZ = new String[0];
    public static final Pattern LIZIZ = PatternProtector.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", 42);

    public static String[] LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        String[] strArr = LIZ;
        String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("tt_dm_sec_domain", String[].class, strArr);
        return strArr2 != null ? strArr2 : strArr;
    }

    public static boolean LJ(UrlModel urlModel) {
        List<String> urlList;
        String[] strArrLIZIZ = LIZIZ();
        if (strArrLIZIZ.length != 0 && urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(urlList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (LIZJ((String) it2.next(), strArrLIZIZ)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LIZ(String str, String[] strArr) {
        if (strArr.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        Regex regex = new Regex(LIZIZ);
        if (str == null) {
            return false;
        }
        Iterator it2 = Regex.findAll$default(regex, str, 0, 2, null).iterator();
        while (it2.hasNext()) {
            if (LIZJ(((MatchResult) it2.next()).getValue(), strArr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(String str, String[] strArr) {
        if (strArr.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        try {
            String string = null;
            if (str != null) {
                string = a0.LJLIIIL(str).toString();
            }
            String host = new URI(string).getHost();
            if (host == null) {
                return false;
            }
            for (String str2 : strArr) {
                if (!u.LJIJI(host, str2, true)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('.');
                    sbLIZ.append(str2);
                    if (!u.LJIIZILJ(host, C2188811AlT.LIZIZ(sbLIZ), true)) {
                    }
                }
                if (str2 == null) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("url is malformed ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        }
    }
}
