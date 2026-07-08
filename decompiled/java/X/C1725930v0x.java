package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS215S0000000_26;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0v0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725930v0x {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(551));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(550));

    public static String LIZIZ(Uri uri) throws JSONException {
        if (!C1726050v19.LIZ().enable) {
            return null;
        }
        try {
            return ((C1725880v0s) LIZ.getValue()).LIZJ(uri);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            ((C1725860v0q) LIZIZ.getValue()).LIZLLL("prefetch", th, null);
            return null;
        }
    }

    public static C1725990v13 LIZ(String str, String str2, boolean z) throws JSONException {
        if (!C1726050v19.LIZ().enable) {
            return null;
        }
        try {
            return ((C1725880v0s) LIZ.getValue()).LIZ(str, str2, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            ((C1725860v0q) LIZIZ.getValue()).LIZLLL("get_result", th, null);
            return null;
        }
    }
}
