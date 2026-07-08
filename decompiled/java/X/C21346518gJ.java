package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;

/* JADX INFO: renamed from: X.18gJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21346518gJ {
    public static final String LIZ(InterfaceC1532650pzD interfaceC1532650pzD) {
        Object objLIZIZ;
        InputStream data;
        if (interfaceC1532650pzD == null) {
            objLIZIZ = null;
        } else {
            try {
                objLIZIZ = interfaceC1532650pzD.LIZIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                objLIZIZ = new C098200Yq(th);
                C189200o6.m2constructorimpl(objLIZIZ);
            }
        }
        C189200o6.m2constructorimpl(objLIZIZ);
        if (C189200o6.m7isFailureimpl(objLIZIZ)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (interfaceC1532650pzD == null || (data = interfaceC1532650pzD.getData()) == null) {
            return null;
        }
        return C08KH.LIZIZ(data, str);
    }
}
