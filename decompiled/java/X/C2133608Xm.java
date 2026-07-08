package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;

/* JADX INFO: renamed from: X.08Xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133608Xm implements C08Y1 {
    @Override // X.C08Y1
    public final boolean LIZ(Object obj, File file, C0VSJ c0vsj) {
        try {
            return !((Boolean) C2133408Xk.LIZJ(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
