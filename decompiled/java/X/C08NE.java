package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: X.08NE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NE {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        try {
            URI uri = new URI(str);
            if (uri.getHost() == null) {
                return false;
            }
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                return false;
            }
            return true;
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
