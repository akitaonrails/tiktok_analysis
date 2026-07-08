package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.14hY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20335014hY {
    public static C20335014hY LIZIZ;
    public final HashMap<String, C204683157h> LIZ = new HashMap<>();

    public static C20335014hY LIZ() {
        if (LIZIZ == null) {
            synchronized (C20335014hY.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C20335014hY();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
