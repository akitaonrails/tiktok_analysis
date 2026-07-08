package X;

/* JADX INFO: renamed from: X.13gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20076013gs extends AbstractC20077113h3 {
    public static C20076013gs LIZJ;

    public C20076013gs(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0012, code lost:
    
        if (r5 >= r3) goto L16;
     */
    @Override // X.InterfaceC20077913hB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] LIZ(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.LIZLLL()
            int r3 = r0.length()
            r2 = 0
            if (r3 > 0) goto Lc
            return r2
        Lc:
            if (r5 < r3) goto Lf
            return r2
        Lf:
            if (r5 >= 0) goto L26
            r5 = 0
        L12:
            java.lang.String r0 = r4.LIZLLL()
            char r1 = r0.charAt(r5)
            r0 = 10
            if (r1 != r0) goto L29
            boolean r0 = r4.LJFF(r5)
            if (r0 != 0) goto L29
            int r5 = r5 + 1
        L26:
            if (r5 >= r3) goto L29
            goto L12
        L29:
            if (r5 < r3) goto L2c
            return r2
        L2c:
            int r1 = r5 + 1
        L2e:
            if (r1 >= r3) goto L39
            boolean r0 = r4.LJ(r1)
            if (r0 != 0) goto L39
            int r1 = r1 + 1
            goto L2e
        L39:
            int[] r0 = r4.LIZJ(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20076013gs.LIZ(int):int[]");
    }

    @Override // X.InterfaceC20077913hB
    public final int[] LIZIZ(int i) {
        int i2;
        int length = LIZLLL().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            i2 = i - 1;
            if (LIZLLL().charAt(i2) == '\n' && !LJ(i)) {
                i = i2;
            } else {
                int i3 = i - 1;
                while (i3 > 0 && !LJFF(i3)) {
                    i3--;
                }
                return LIZJ(i3, i);
            }
        } while (i2 > 0);
        return null;
    }

    public final boolean LJ(int i) {
        if (i > 0 && LIZLLL().charAt(i - 1) != '\n') {
            if (i == LIZLLL().length() || LIZLLL().charAt(i) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJFF(int i) {
        if (LIZLLL().charAt(i) != '\n') {
            if (i == 0 || LIZLLL().charAt(i - 1) == '\n') {
                return true;
            }
            return false;
        }
        return false;
    }
}
