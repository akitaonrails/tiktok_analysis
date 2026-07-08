package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0cXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015570cXD {
    public static volatile C1015570cXD LJFF;
    public List<C1049860dQW> LIZ;
    public InterfaceC1015600cXG LIZIZ;
    public InterfaceC1337220ku0 LIZJ;
    public C1982107pb LIZLLL;
    public boolean LJ;

    public static C1015570cXD LIZ() {
        if (LJFF == null) {
            synchronized (C1015570cXD.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1015570cXD();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }
}
