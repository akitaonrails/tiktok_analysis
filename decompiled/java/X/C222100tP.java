package X;

/* JADX INFO: renamed from: X.00tP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C222100tP {
    public static final C01GW LIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(478));

    public static final boolean LIZ(int i) {
        if (i <= 0) {
            return false;
        }
        if (i >= 100) {
            return true;
        }
        long j = 100;
        long jLongValue = ((Number) LIZ.getValue()).longValue() % j;
        if (((int) (jLongValue + (j & (((jLongValue ^ j) & ((-jLongValue) | jLongValue)) >> 63)))) >= i) {
            return false;
        }
        return true;
    }
}
