package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1946707jt {
    public static final Long LIZIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Long lValueOf = null;
        if (z) {
            return null;
        }
        try {
            lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            return lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return lValueOf;
        }
    }

    public static final String LIZ(Uri uri, String str) {
        try {
            return C1942407jC.LIZIZ(uri, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
