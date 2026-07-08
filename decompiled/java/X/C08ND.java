package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.08ND, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08ND {
    public Pattern LIZ;

    public final boolean LIZ(URI uri) {
        if (uri != null && !TextUtils.isEmpty(uri.getHost()) && this.LIZ != null) {
            String host = uri.getHost();
            if (!TextUtils.isEmpty(uri.getPath())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(host);
                sbLIZ.append(uri.getPath());
                host = C2188811AlT.LIZIZ(sbLIZ);
            }
            try {
                return this.LIZ.matcher(host).matches();
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
