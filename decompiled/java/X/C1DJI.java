package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DJI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DJI implements C1DJP {
    public static volatile C1DJI LL;

    @Override // X.C1DJP
    public final void LJIILJJIL(int i) {
    }

    @Override // X.C1DJP
    public final void LLIIL(int i, int i2) {
    }

    @Override // X.C1DJP
    public final void onError(int i, String str) {
    }

    @Override // X.C1DJP
    public final void onInfo(int i, int i2, String str) {
    }

    public static C1DJI LIZ() {
        C1DJI c1dji;
        synchronized (C1DJI.class) {
            try {
                if (LL == null) {
                    synchronized (C1DJI.class) {
                        try {
                            LL = new C1DJI();
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                c1dji = LL;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1dji;
    }
}
