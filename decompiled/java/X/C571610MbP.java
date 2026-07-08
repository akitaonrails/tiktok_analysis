package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0MbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571610MbP implements InterfaceC571580MbM {
    @Override // X.InterfaceC571580MbM
    public final Integer LIZ(int i) {
        if (i <= 720 && 1 <= i) {
            C2216271Bof.LIZ.getClass();
            boolean[] zArr = C2216271Bof.LIZJ;
            if (!zArr[5] && !zArr[4]) {
                return 40;
            }
            return 62;
        }
        return null;
    }

    @Override // X.InterfaceC571580MbM
    public final Pair LIZIZ(int i, int i2, int i3) {
        if (i <= 720 && 1 <= i) {
            if (1 <= i2) {
                if (i2 < 41) {
                    return new Pair(Boolean.TRUE, new Pair(0, Boolean.FALSE));
                }
                if (i2 < 63) {
                    if (i3 == 28) {
                        C2216271Bof.LIZ.getClass();
                        if (C2216271Bof.LIZJ[0]) {
                            return new Pair(Boolean.TRUE, new Pair(0, Boolean.valueOf(C2216271Bof.LIZIZ[0])));
                        }
                    } else if (i3 == 174) {
                        C2216271Bof.LIZ.getClass();
                        if (C2216271Bof.LIZJ[1]) {
                            return new Pair(Boolean.TRUE, new Pair(0, Boolean.valueOf(C2216271Bof.LIZIZ[1])));
                        }
                    }
                }
            } else if (i2 == 0 && i3 == 0) {
                return new Pair(Boolean.TRUE, new Pair(0, Boolean.FALSE));
            }
            return new Pair(Boolean.TRUE, new Pair(-3, Boolean.FALSE));
        }
        Boolean bool = Boolean.FALSE;
        return new Pair(bool, new Pair(-1, bool));
    }
}
