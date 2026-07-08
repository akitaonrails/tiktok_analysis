package X;

/* JADX INFO: renamed from: X.0z82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884080z82 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1884070z81());

    public static boolean LIZJ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZIZ() {
        return !C497740JfY.LJIL() || C497740JfY.LJIIZILJ() > C497740JfY.LJIILLIIL();
    }

    public static int LIZLLL() {
        return Math.min(C497740JfY.LJIIZILJ(), C497740JfY.LJIILLIIL());
    }

    public static boolean LIZ(Integer num) {
        if (num != null && num.intValue() == 0 && LIZIZ()) {
            return true;
        }
        return false;
    }
}
