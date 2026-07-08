package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.08Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2088708Gf extends C09H1 {
    public static volatile C2088708Gf LIZLLL;
    public final AtomicBoolean LIZJ;

    public C2088708Gf() {
        super(0);
        this.LIZJ = new AtomicBoolean(false);
    }

    public static C2088708Gf LIZJ() {
        if (LIZLLL == null) {
            synchronized (C2088708Gf.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C2088708Gf();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    @Override // X.C09H1
    public final void LIZ() {
        this.LIZJ.set(true);
        Logger.debug();
    }

    @Override // X.C09H1
    public final void LIZIZ() {
        this.LIZJ.set(false);
        Logger.debug();
    }
}
