package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.math.BigInteger;
import java.security.MessageDigest;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.13KL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13KL {
    public static final C13KL LIZ = new C13KL();

    public static BigInteger LIZ(String str) {
        return C13KN.LIZJ(str).mod(new BigInteger("9223372036854775807"));
    }

    public static String LIZIZ(String str) {
        C1507240pKE c1507240pKE;
        IMHostApi.LIZ.getClass();
        IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
        if (iMHostApiLIZ != null) {
            c1507240pKE = new C1507240pKE(iMHostApiLIZ.LJIIIIZZ(str.getBytes(Charsets.UTF_8)));
        } else {
            c1507240pKE = null;
        }
        return String.valueOf(c1507240pKE);
    }

    public static String LIZJ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = C08HL.LIZIZ(MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
