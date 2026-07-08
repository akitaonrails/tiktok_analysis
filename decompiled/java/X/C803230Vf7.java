package X;

import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803230Vf7 extends AbstractC802540Ve0 {
    public static C803230Vf7 LJII;

    @Override // X.AbstractC802540Ve0
    public final void LIZIZ() {
    }

    public static C803230Vf7 LJFF() {
        if (LJII == null) {
            synchronized (C803230Vf7.class) {
                try {
                    if (LJII == null) {
                        LJII = new C803230Vf7();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    @Override // X.AbstractC802540Ve0
    public final boolean LIZJ() {
        return NativeBridge.LJJIJIIJI();
    }
}
