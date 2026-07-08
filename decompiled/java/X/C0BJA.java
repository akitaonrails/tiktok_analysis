package X;

/* JADX INFO: renamed from: X.0BJA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BJA {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0BJ9());

    public static final boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue() && !C0BJD.LIZ();
    }

    public static final boolean LIZ(boolean z) {
        if (z) {
            if (C0BJ8.LIZ()) {
                return true;
            }
        } else {
            C01GW c01gw = C0BJB.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 2 && ((Number) c01gw.getValue()).intValue() != 0 && !(!LIZIZ())) {
                return true;
            }
        }
        return false;
    }
}
