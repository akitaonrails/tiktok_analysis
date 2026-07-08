package X;

import com.bytedance.hybrid.web.extension.seclink.config.SeclinkPetConfigSettings;
import com.bytedance.pns.psi.PsiEncrypt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.1B2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198391B2f {
    public static volatile C2198391B2f LIZLLL;
    public static ExecutorService LJ;
    public static InterfaceC2373709Rv LJFF;
    public static int LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public final byte[] LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public static C2198391B2f LIZ() {
        if (LIZLLL == null) {
            synchronized (C2198391B2f.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C2198391B2f();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public C2198391B2f() {
        byte[] bArrCreateNewKey = PsiEncrypt.LIZ.createNewKey();
        this.LIZ = bArrCreateNewKey;
        this.LIZIZ = SeclinkPetConfigSettings.LIZ().enable;
        if (bArrCreateNewKey.length <= 0) {
            this.LIZIZ = false;
        }
        this.LIZJ = SeclinkPetConfigSettings.LIZ().riskDiff;
    }
}
