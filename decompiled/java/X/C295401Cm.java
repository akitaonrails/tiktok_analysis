package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.01Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C295401Cm {
    public static final /* synthetic */ int LIZ = 0;

    public static C805400Vic LIZ(Uri uri) {
        String strSubstring;
        if (uri == null) {
            return null;
        }
        try {
            String string = uri.buildUpon().clearQuery().toString();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String encodedQuery = uri.getEncodedQuery();
            String str = "";
            if (encodedQuery != null) {
                int i = 0;
                do {
                    int iLJJIZ = a0.LJJIZ(encodedQuery, '&', i, false, 4);
                    if (iLJJIZ == -1) {
                        iLJJIZ = encodedQuery.length();
                    }
                    int iLJJIZ2 = a0.LJJIZ(encodedQuery, '=', i, false, 4);
                    if (iLJJIZ2 > iLJJIZ || iLJJIZ2 == -1) {
                        iLJJIZ2 = iLJJIZ;
                    }
                    String strSubstring2 = encodedQuery.substring(i, iLJJIZ2);
                    if (iLJJIZ2 - i == strSubstring2.length() && u.LJIJJLI(encodedQuery, i, false, 0, strSubstring2.length(), strSubstring2)) {
                        if (iLJJIZ2 != iLJJIZ) {
                            linkedHashMap.put(strSubstring2, Uri.decode(encodedQuery.substring(iLJJIZ2 + 1, iLJJIZ)));
                        } else {
                            linkedHashMap.put(strSubstring2, "");
                        }
                    }
                    i = iLJJIZ + 1;
                } while (i < encodedQuery.length());
            }
            String host = uri.getHost();
            if (host != null) {
                strSubstring = host.substring(a0.LJJJ(host, e3.d, 0, false, 6) + 1, host.length());
            } else {
                strSubstring = null;
            }
            if (!u.LJJIIJZLJL(string, "/data/", false) && !u.LJJIIJZLJL(string, "local_file://", false) && !u.LJJIIJZLJL(string, "/mnt/", false)) {
                if (linkedHashMap.containsKey(Scene.SCENE_SERVICE)) {
                }
                if (uri.getScheme() == null) {
                    uri.getHost();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "";
                }
                sbLIZ.append(scheme);
                sbLIZ.append("://");
                String host2 = uri.getHost();
                if (host2 != null) {
                    str = host2;
                }
                sbLIZ.append(str);
                return new C805400Vic(string, C2188811AlT.LIZIZ(sbLIZ), uri.getScheme(), uri.getHost(), strSubstring, uri.getPath(), encodedQuery, linkedHashMap);
            }
            return new C805400Vic(string, string, uri.getScheme(), uri.getHost(), strSubstring, "", encodedQuery, linkedHashMap);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static C805400Vic LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return LIZ(UriProtector.parse(str));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
