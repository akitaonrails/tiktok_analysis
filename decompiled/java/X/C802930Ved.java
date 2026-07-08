package X;

import android.content.Context;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ved, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802930Ved {
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public final C801700Vce LIZ;

    public C802930Ved(Context context, C801700Vce c801700Vce) {
        this.LIZ = c801700Vce;
        try {
            System.loadLibrary("npth");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                Librarian.LJI(C0VX9.LJ(), "npth");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        NativeBridge.LJJJZ(context, c801700Vce.LIZ);
    }
}
