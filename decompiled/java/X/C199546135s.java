package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.135s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199546135s {
    public static final C135Z LIZ;
    public static final C135Z LIZIZ;
    public static final C135Z LIZJ;

    static {
        new C135Z("-_.*", true);
        LIZ = new C135Z("-_.!~*'()@:$&,;=+", false);
        new C135Z("-_.!~*'()@:$&,;=++/?", false);
        LIZIZ = new C135Z("-_.!~*'():$&,;=", false);
        LIZJ = new C135Z("-_.!~*'()@:$,;/?:", false);
    }

    public static String LIZ(String str) {
        try {
            return URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }
}
