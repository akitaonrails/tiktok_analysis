package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0V1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V1Z {
    public volatile List<C790960V1a> LIZ;

    public final String LIZ(Uri uri) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = new ArrayList();
                        throw null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (true) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
                C786950Utx.LIZ("AddressParam");
            }
            if (it2.hasNext()) {
                C790960V1a c790960V1a = (C790960V1a) it2.next();
                if (c790960V1a.LIZ == null) {
                    c790960V1a.LIZ = PatternProtector.compile(null);
                }
                Matcher matcher = c790960V1a.LIZ.matcher(uri.toString());
                while (matcher.find()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("match str = ");
                    sbLIZ.append(matcher.group());
                    sbLIZ.append(" matcher.start() ");
                    sbLIZ.append(matcher.start());
                    C2188811AlT.LIZIZ(sbLIZ);
                    C786950Utx.LIZ("AddressParam");
                    if (matcher.start() == 0) {
                        return null;
                    }
                }
            } else if (!it2.hasNext()) {
                return null;
            }
        }
    }
}
