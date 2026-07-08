package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VTF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VTF implements C0VTA {
    public static volatile C0VTF LIZ;

    @Override // X.C0VTA
    public final void LIZ(int i) {
    }

    public static C0VTF LIZIZ() {
        if (LIZ == null) {
            synchronized (C0VTF.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C0VTF();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
