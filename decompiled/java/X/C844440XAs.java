package X;

import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C844440XAs {
    public static final C844440XAs LIZ = new C844440XAs();
    public static final LruCache<String, C0OT7> LIZIZ = new LruCache<>(100);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(366));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(365));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(363));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(364));

    public static String LIZ(String str) {
        Object c098200Yq;
        if (!a0.LJJIIZI(str, "&", false)) {
            return str;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                c098200Yq = Html.fromHtml(str, 0).toString();
            } else {
                c098200Yq = Html.fromHtml(str).toString();
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = str;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static Object LIZIZ(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        Object c098200Yq;
        StringBuilder sb;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C0OT6("BulletinPreviewOGFetcher fetchOgMeta url should not be empty", 1);
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
            return new C0OT6("BulletinPreviewOGFetcher fetchOgMeta url should be valid", 1);
        }
        String scheme = uri.getScheme();
        if (scheme != null && scheme.length() != 0) {
            z2 = false;
        }
        if (z2) {
            if (u.LJJIIJZLJL(str, "//", false)) {
                sb = new StringBuilder("https:");
            } else {
                sb = new StringBuilder("https://");
            }
            sb.append(str);
            str = sb.toString();
        }
        C0OT7 c0ot7 = LIZIZ.get(str);
        if (c0ot7 != null) {
            if (System.currentTimeMillis() < c0ot7.LIZ + ((long) 86400000)) {
                return c0ot7;
            }
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C844430XAr(str, null));
    }
}
