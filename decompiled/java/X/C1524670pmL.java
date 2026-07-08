package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524670pmL {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("https", "http");
    public static final List<String> LIZIZ = Collections.singletonList("https");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("wss", "ws");
    public static final List<String> LIZLLL = Collections.singletonList("wss");

    static {
        PatternProtector.compile("^[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public static C1525190pnB LIZ(String str, String str2, C1304160k2g c1304160k2g) {
        List<String> list;
        if (!TextUtils.isEmpty(str2) && a0.LJJIIZI(str2, "://", false)) {
            u.LJIJI(str, "request", true);
            int iHashCode = str.hashCode();
            if (iHashCode == -838595071 ? !str.equals("upload") : iHashCode == 1095692943 ? !str.equals("request") : !(iHashCode == 1427818632 && str.equals("download"))) {
                list = null;
            } else {
                list = LIZ;
            }
            Uri uri = UriProtector.parse(str2);
            if (list != null) {
                String scheme = uri.getScheme();
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (TextUtils.equals(it2.next(), scheme)) {
                    }
                }
                return new C1525190pnB(EnumC1524730pmR.PROTOCOL_ERROR, list.toString());
            }
            IClientAdapterService iClientAdapterServiceLIZIZ = c1304160k2g.LIZIZ();
            if (iClientAdapterServiceLIZIZ != null && !iClientAdapterServiceLIZIZ.checkHttpUrlValidity(str2)) {
                return new C1525190pnB(EnumC1524730pmR.INVALID_DOMAIN, null);
            }
            return new C1525190pnB(EnumC1524730pmR.SUCCESS, null);
        }
        return new C1525190pnB(EnumC1524730pmR.INVALID_URL, null);
    }
}
