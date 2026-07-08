package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: X.08Gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2089108Gj {
    public static URI LIZ(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        try {
            int iIndexOf = str.indexOf("?");
            if (iIndexOf > 0) {
                str = str.substring(0, iIndexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static URI LIZIZ(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return LIZ(str);
            }
        }
    }
}
