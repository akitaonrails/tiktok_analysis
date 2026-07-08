package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07yz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2040307yz {
    public static final C2040307yz LIZ = new C2040307yz();
    public static volatile Integer LIZIZ;
    public static volatile boolean LIZJ;

    public final boolean LIZ() {
        Integer num = LIZIZ;
        if (num != null) {
            return num.intValue() == 1;
        }
        if (LIZJ) {
            return false;
        }
        synchronized (this) {
            try {
                if (LIZJ) {
                    return false;
                }
                LIZJ = true;
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.07yy
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SearchGlobalCustomImageDiskCache@dfdd.loadValueAsync$2");
                        int iLJIJ = 0;
                        try {
                            try {
                                iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_global_custom_disk_cache", true);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            C2040307yz.LIZIZ = Integer.valueOf(iLJIJ);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SearchGlobalCustomImageDiskCache@dfdd.loadValueAsync$2");
                    }
                });
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
