package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01e8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C382201e8 {
    public static final C382201e8 LIZ = new C382201e8();

    public static boolean LIZ(String str, String str2) {
        Object c098200Yq;
        StringBuilder sb;
        String lowerCase;
        String lowerCase2;
        String host;
        String lowerCase3;
        String lowerCase4;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return false;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme == null || scheme.length() == 0) {
            if (u.LJJIIJZLJL(str, "//", false)) {
                sb = new StringBuilder("https:");
            } else {
                sb = new StringBuilder("https://");
            }
            sb.append(str);
            str = sb.toString();
        }
        Keva repo = Keva.getRepo("bulletin_preview_domain_allowlist_repo");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("allowlist_");
        sbLIZ.append(str2);
        List<String> listLJJLL = C13LQ.LJJLL(repo.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0]));
        if ((listLJJLL instanceof Collection) && listLJJLL.isEmpty()) {
            return false;
        }
        for (String str3 : listLJJLL) {
            LIZ.getClass();
            if (str != null && str.length() != 0 && str3.length() != 0) {
                try {
                    Uri uri2 = UriProtector.parse(str);
                    try {
                        Uri uri3 = UriProtector.parse(str3);
                        String scheme2 = uri2.getScheme();
                        if (scheme2 != null && (lowerCase = scheme2.toLowerCase(Locale.ROOT)) != null && lowerCase.length() != 0) {
                            String scheme3 = uri3.getScheme();
                            if (scheme3 != null) {
                                lowerCase2 = scheme3.toLowerCase(Locale.ROOT);
                            } else {
                                lowerCase2 = null;
                            }
                            if (Intrinsics.LJFF(lowerCase, lowerCase2) && (host = uri2.getHost()) != null && (lowerCase3 = host.toLowerCase(Locale.ROOT)) != null && lowerCase3.length() != 0) {
                                String host2 = uri3.getHost();
                                if (host2 != null) {
                                    lowerCase4 = host2.toLowerCase(Locale.ROOT);
                                } else {
                                    lowerCase4 = null;
                                }
                                if (Intrinsics.LJFF(lowerCase3, lowerCase4)) {
                                    return true;
                                }
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        return false;
    }
}
