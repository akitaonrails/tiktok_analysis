package X;

import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0COD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COD {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C300420Bq4());
    public static int LIZIZ;

    public static int LIZLLL() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZ() {
        return (LIZLLL() & 1) == 1;
    }

    public static final boolean LIZJ() {
        return (LIZLLL() & 16) == 16;
    }

    public static final boolean LJ() {
        if (LJFF()) {
            return false;
        }
        return !C104100aN.LIZ().LJIILIIL() && ((LIZLLL() & 32) == 32) && LIZIZ > 0;
    }

    public static final boolean LJFF() {
        return !C104100aN.LIZ().LJIILIIL() && ((LIZLLL() & 64) == 64) && LIZIZ >= 2;
    }

    public static final void LIZIZ(C0CME c0cme, Runnable runnable) {
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && abstractC1387200mCcLJFF.LIZLLL() != null) {
            C312240CLu.LIZ(new C0CM3(C0CMJ.HIGH_PRIORITY.getType(), c0cme, "cold_boot_request_msg", new AwS548S0100000_4(runnable, 477), true));
        } else {
            runnable.run();
        }
    }
}
