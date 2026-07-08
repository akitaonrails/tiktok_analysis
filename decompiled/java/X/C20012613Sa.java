package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20012613Sa {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").matches(str);
    }

    public static final String LIZ(String str, C14SE c14se) {
        if (LIZIZ(str)) {
            if (c14se == C14SE.PLAIN) {
                return str;
            }
            try {
                byte[] bytes = str.getBytes(Charsets.LIZIZ);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                return Base64.encodeToString(messageDigest.digest(), 11);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C1BJO(e);
            }
        }
        throw new C1BJO("Invalid Code Verifier.");
    }
}
