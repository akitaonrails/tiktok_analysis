package X;

/* JADX INFO: renamed from: X.13Js, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19991013Js {
    public static C19990513Jn LIZ(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            if (j > 0) {
                C19990513Jn.Companion.getClass();
                return C19990513Jn.MAX;
            }
            C19990513Jn.Companion.getClass();
            return C19990513Jn.MIN;
        }
        if (j4 < -31557014167219200L) {
            return C19990513Jn.MIN;
        }
        if (j4 > 31556889864403199L) {
            return C19990513Jn.MAX;
        }
        long j5 = j2 % 1000000000;
        return new C19990513Jn(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
    }
}
