package X;

import java.util.Random;

/* JADX INFO: renamed from: X.0VFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794830VFx {
    public static final C794840VFy LIZ = new ThreadLocal<Random>() { // from class: X.0VFy
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    };

    public static String LIZ() {
        return C786410Ut5.j4("%016x", new Object[]{Long.valueOf(LIZIZ())});
    }

    public static long LIZIZ() {
        long jNextLong;
        do {
            jNextLong = LIZ.get().nextLong();
        } while (jNextLong == 0);
        return Math.abs(jNextLong);
    }
}
