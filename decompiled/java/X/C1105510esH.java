package X;

import com.bytedance.android.livesdk.model.message.Contributor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0esH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105510esH {
    public static C1105510esH LIZJ;
    public List<Contributor> LIZ;
    public int LIZIZ;

    public static C1105510esH LIZ() {
        if (LIZJ == null) {
            synchronized (C1105510esH.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1105510esH();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
