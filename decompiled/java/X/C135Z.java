package X;

/* JADX INFO: renamed from: X.135Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C135Z extends AbstractC199530135c {
    public static final char[] LIZJ = {'+'};
    public static final char[] LIZLLL = "0123456789ABCDEF".toCharArray();
    public final boolean LIZ;
    public final boolean[] LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135Z.LIZ(java.lang.String):java.lang.String");
    }

    public C135Z(String str, boolean z) {
        if (!str.matches(".*[0-9A-Za-z].*")) {
            if (z && str.contains(" ")) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            if (!str.contains("%")) {
                this.LIZ = z;
                char[] charArray = str.toCharArray();
                int iMax = 122;
                for (char c : charArray) {
                    iMax = Math.max((int) c, iMax);
                }
                boolean[] zArr = new boolean[iMax + 1];
                int i = 48;
                do {
                    zArr[i] = true;
                    i++;
                } while (i <= 57);
                int i2 = 65;
                do {
                    zArr[i2] = true;
                    i2++;
                } while (i2 <= 90);
                int i3 = 97;
                do {
                    zArr[i3] = true;
                    i3++;
                } while (i3 <= 122);
                for (char c2 : charArray) {
                    zArr[c2] = true;
                }
                this.LIZIZ = zArr;
                return;
            }
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }
}
