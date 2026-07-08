package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602200rnO {
    public static volatile C1602200rnO LIZIZ;
    public EnumC585000Mx0 LIZ = EnumC585000Mx0.COLD_STARTUP;

    public static C1602200rnO LIZ() {
        if (LIZIZ == null) {
            synchronized (C1602200rnO.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1602200rnO();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final boolean LIZIZ() {
        return this.LIZ.ordinal() >= EnumC585000Mx0.COLD_STARTUP_COMPLETED.ordinal();
    }

    public final boolean LIZJ() {
        return this.LIZ.equals(EnumC585000Mx0.FIRST_FEED_COMPLETED);
    }

    public final void LIZLLL(EnumC585000Mx0 enumC585000Mx0) {
        this.LIZ = enumC585000Mx0;
        C1602200rnO c1602200rnO = new C1602200rnO();
        c1602200rnO.LIZ = enumC585000Mx0;
        C1602210rnP c1602210rnPLJJIFFI = C1602210rnP.LJJIFFI();
        c1602210rnPLJJIFFI.LJFF = c1602200rnO;
        c1602210rnPLJJIFFI.LJJ(c1602200rnO);
    }
}
