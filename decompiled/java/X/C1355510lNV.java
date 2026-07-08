package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355510lNV {
    public static volatile C1355510lNV LIZIZ;
    public final List<C1355520lNW> LIZ = new ArrayList();

    public static final C1355510lNV LIZ() {
        if (LIZIZ == null) {
            synchronized (C1355510lNV.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1355510lNV();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZIZ(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            try {
                Iterator it2 = ((ArrayList) this.LIZ).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1355520lNW c1355520lNW = (C1355520lNW) it2.next();
                    if (c1355520lNW != null && TextUtils.equals(c1355520lNW.LIZ, str)) {
                        z = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
