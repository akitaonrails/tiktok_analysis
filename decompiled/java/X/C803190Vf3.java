package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.monitor.k;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0Vf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803190Vf3 {
    public static final ConfigManager LIZ = new ConfigManager();
    public static C803730Vfv LIZIZ;

    static {
        new C803120Vew<CrashType, AttachUserData>() { // from class: X.0Vev
            public List<AttachUserData> getAttachUserData(CrashType crashType) {
                C802790VeP c802790VeP = k.LIZ;
                if (c802790VeP == null) {
                    return null;
                }
                return c802790VeP.LIZJ.LIZLLL(crashType);
            }
        };
    }

    public static C803730Vfv LIZ() {
        if (LIZIZ == null) {
            synchronized (C803190Vf3.class) {
                try {
                    LIZIZ = new C803730Vfv();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
