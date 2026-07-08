package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.settings.PnsOpenThirdWebModel;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1886207a8 {
    public static final PnsOpenThirdWebModel LIZ = new PnsOpenThirdWebModel(null, null, 3, null);

    public static boolean LIZ(Uri uri, List list) {
        String lowerCase;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            String host = uri.getHost();
            if (host != null && (lowerCase = host.toLowerCase(Locale.ROOT)) != null && u.LJIIZILJ(lowerCase, str, false)) {
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('.');
            sbLIZ.append(host);
            if (u.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ).toLowerCase(Locale.ROOT), str, false)) {
                return true;
            }
        }
        return false;
    }
}
