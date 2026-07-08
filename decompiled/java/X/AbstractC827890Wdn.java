package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC827890Wdn {
    public static volatile C827880Wdm LIZIZ;
    public int LIZ;

    public static C827880Wdm LIZIZ() {
        if (LIZIZ == null) {
            synchronized (AbstractC827890Wdn.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C827880Wdm();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public AbstractC827890Wdn() {
        C844470XAv.LIZ.getClass();
        this.LIZ = (int) C844470XAv.LIZIZ();
        C844470XAv.LIZ();
    }
}
