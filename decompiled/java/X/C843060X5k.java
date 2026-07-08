package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0X5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843060X5k {
    public static final C843060X5k LIZ = new C843060X5k();

    public static boolean LIZIZ(String str) {
        if (str == null) {
            return false;
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(String str) {
        if (!UriProtector.parse(str).isRelative() && !u.LJJIIJZLJL(str, e3.d, false) && !u.LJJIIJZLJL(str, "/", false)) {
            return false;
        }
        return true;
    }

    public final String LIZ(Uri uri) {
        if (!uri.isHierarchical()) {
            return toString();
        }
        try {
            return uri.buildUpon().clearQuery().toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return toString();
        }
    }
}
