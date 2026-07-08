package X;

import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C2S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2S {
    public static final List<String> LIZ = new ArrayList();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6124));

    public static boolean LIZ(TokenCert tokenCert) {
        Iterable iterable;
        if (((Boolean) C268440Afa.LIZ.getValue()).booleanValue() && (iterable = (Iterable) LIZIZ.getValue()) != null && C13LP.LJJJJ(tokenCert.getToken(), iterable)) {
            return true;
        }
        return false;
    }
}
