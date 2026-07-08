package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.018J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018J {
    public static String LIZ(String str, String str2) {
        try {
            if (str2 == null) {
                return URLEncoder.encode(str, "ISO_8859_1");
            }
            if (!Intrinsics.LJFF(str2, "null_encoding")) {
                return URLEncoder.encode(str, str2);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }
}
