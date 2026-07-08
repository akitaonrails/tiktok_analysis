package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS96S1000000_11;

/* JADX INFO: renamed from: X.0SNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720400SNq {
    public static final C720400SNq LIZ = new C720400SNq();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(527));
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final C139M<String, Boolean> LIZLLL = new C139M<>();
    public static final C139M<String, Boolean> LJ = new C139M<>();

    public static String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String path = null;
        if (z) {
            return null;
        }
        try {
            path = new URI(str).getPath();
            return path;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return path;
        }
    }

    public static void LIZIZ(String str) {
        String strLIZ = LIZ(str);
        if (strLIZ == null) {
            return;
        }
        LIZLLL.LIZJ(strLIZ, Boolean.TRUE);
        ((AbstractC1604130rqV) LIZIZ.getValue()).LIZIZ(new AwS96S1000000_11(strLIZ, 16));
    }
}
