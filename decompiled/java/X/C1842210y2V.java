package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0y2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842210y2V {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, List list) {
        String host;
        String host2;
        if (C204575153d.LIZJ()) {
            C2197011Ayh.LIZ.getClass();
            if (!C2197011Ayh.LJ().optBoolean("IS_NATIVE_GAME_DEBUG_ENABLE_DOMAIN_CHECK_MOCK", true)) {
                return true;
            }
        }
        Uri uri = UriProtector.parse(str);
        String scheme = uri.getScheme();
        if (scheme == null || (host = uri.getHost()) == null) {
            return false;
        }
        int port = uri.getPort();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri2 = UriProtector.parse((String) it2.next());
                String scheme2 = uri2.getScheme();
                if (scheme2 != null && (host2 = uri2.getHost()) != null) {
                    int port2 = uri2.getPort();
                    if (Intrinsics.LJFF(scheme2, scheme) && Intrinsics.LJFF(host2, host)) {
                        String lowerCase = scheme2.toLowerCase(Locale.ROOT);
                        if (Intrinsics.LJFF(lowerCase, "https")) {
                            if (port2 != -1) {
                                if (port == port2) {
                                    return true;
                                }
                            } else if (port == -1) {
                                return true;
                            }
                        } else {
                            Intrinsics.LJFF(lowerCase, "wss");
                            return true;
                        }
                    }
                }
            }
        }
        C1888007aQ c1888007aQ = new C1888007aQ(MinisTtmgConfigSettings.LIZ().nativeGameTrustHosts);
        if (!a0.LJJJIL(host)) {
            Iterator it3 = ((List) c1888007aQ.LIZIZ.getValue()).iterator();
            while (it3.hasNext()) {
                if (((Pattern) it3.next()).matcher(host).matches()) {
                    return true;
                }
            }
        }
        return false;
    }
}
