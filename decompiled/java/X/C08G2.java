package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.StandardCharsets;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.08G2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08G2 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2++) {
                bytes[i2] = (byte) (bytes[i2] ^ (-99));
            }
            return Base64.encodeToString(bytes, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (String) obj;
        }
    }

    public static String LIZIZ(int i, String str) {
        boolean z;
        Object c098200Yq;
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, i);
            if (bArrDecode.length != 0) {
                z2 = false;
            }
            if (z2) {
                c098200Yq = null;
            } else {
                int length = bArrDecode.length;
                for (int i2 = 0; i2 < length; i2++) {
                    bArrDecode[i2] = (byte) (bArrDecode[i2] ^ (-99));
                }
                c098200Yq = new String(bArrDecode, Charsets.UTF_8);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }
}
