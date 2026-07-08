package X;

/* JADX INFO: renamed from: X.0wrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797210wrv {
    public static C1797250wrz LIZ(C1797200wru c1797200wru) {
        C1797250wrz c1797250wrz = new C1797250wrz();
        c1797250wrz.LIZLLL = c1797200wru.getOrderId();
        c1797250wrz.LIZ = c1797200wru.getErrorCode();
        c1797250wrz.LIZIZ = c1797200wru.getDetailCode();
        c1797200wru.getAction();
        c1797250wrz.LIZJ = c1797200wru.getException();
        c1797250wrz.LJI = c1797200wru.getInternalCode();
        c1797250wrz.LJIIJJI = Long.valueOf(c1797200wru.getFailureLatency());
        c1797250wrz.LJIIL = Long.valueOf(c1797200wru.getCashierShownTime());
        return c1797250wrz;
    }
}
