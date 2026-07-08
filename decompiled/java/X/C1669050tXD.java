package X;

/* JADX INFO: renamed from: X.0tXD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669050tXD {
    public static final C1669400tXm LIZ = LIZ(50);

    public static final C1669400tXm LIZ(int i) {
        final float f = i;
        InterfaceC1160240gIY interfaceC1160240gIY = new InterfaceC1160240gIY(f) { // from class: X.0tXE
            public final float LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1669060tXE) && Float.compare(this.LIZ, ((C1669060tXE) obj).LIZ) == 0;
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.LIZ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CornerSize(size = ");
                sbLIZ.append(this.LIZ);
                sbLIZ.append("%)");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = f;
                if (f < 0.0f || f > 100.0f) {
                    C1691080u6k.LIZ("The percent should be in the range of [0, 100]");
                }
            }

            @Override // X.InterfaceC1160240gIY
            public final float LIZ(long j, InterfaceC1690500u5o interfaceC1690500u5o) {
                return C1680770tq7.LIZJ(j) * (this.LIZ / 100.0f);
            }
        };
        return new C1669400tXm(interfaceC1160240gIY, interfaceC1160240gIY, interfaceC1160240gIY, interfaceC1160240gIY);
    }

    public static final C1669400tXm LIZIZ(float f) {
        C1669040tXC c1669040tXC = new C1669040tXC(f);
        return new C1669400tXm(c1669040tXC, c1669040tXC, c1669040tXC, c1669040tXC);
    }

    public static final C1669400tXm LIZJ(float f, float f2, float f3, float f4) {
        return new C1669400tXm(new C1669040tXC(f), new C1669040tXC(f2), new C1669040tXC(f3), new C1669040tXC(f4));
    }

    public static C1669400tXm LIZLLL(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return LIZJ(f, f2, f3, f4);
    }
}
