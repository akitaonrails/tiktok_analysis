package X;

/* JADX INFO: renamed from: X.0wLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777000wLK {
    public static int LIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("type needs to be >= FIRST and <= LAST, type=");
                            sbLIZ.append(i);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }
}
