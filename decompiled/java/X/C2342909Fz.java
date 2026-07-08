package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.logging.Level;

/* JADX INFO: renamed from: X.09Fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2342909Fz implements C09G0 {
    public static final boolean LIZ;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        LIZ = z;
    }

    @Override // X.C09G0
    public final void LIZIZ(Level level, String str) {
    }

    @Override // X.C09G0
    public final void LIZ(Level level, String str, Throwable th) {
    }
}
