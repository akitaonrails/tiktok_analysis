package X;

/* JADX INFO: renamed from: X.0uC7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694410uC7 implements InterfaceC1694390uC5 {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lengthAfterCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1694390uC5
    public final void LIZ(C1694290uBv c1694290uBv) {
        int i = this.LIZ;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < i) {
                i3++;
                int i4 = c1694290uBv.LIZIZ;
                if (i4 > i3) {
                    char cLIZIZ = c1694290uBv.LIZIZ((i4 - i3) - 1);
                    char cLIZIZ2 = c1694290uBv.LIZIZ(c1694290uBv.LIZIZ - i3);
                    if (Character.isHighSurrogate(cLIZIZ) && Character.isLowSurrogate(cLIZIZ2)) {
                        i3++;
                    }
                    i2++;
                } else {
                    i3 = i4;
                    break;
                }
            } else {
                break;
            }
        }
        int i5 = this.LIZIZ;
        int i6 = 0;
        int iLIZLLL = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            iLIZLLL++;
            if (c1694290uBv.LIZJ + iLIZLLL < c1694290uBv.LIZLLL()) {
                char cLIZIZ3 = c1694290uBv.LIZIZ((c1694290uBv.LIZJ + iLIZLLL) - 1);
                char cLIZIZ4 = c1694290uBv.LIZIZ(c1694290uBv.LIZJ + iLIZLLL);
                if (Character.isHighSurrogate(cLIZIZ3) && Character.isLowSurrogate(cLIZIZ4)) {
                    iLIZLLL++;
                }
                i6++;
            } else {
                iLIZLLL = c1694290uBv.LIZLLL() - c1694290uBv.LIZJ;
                break;
            }
        }
        int i7 = c1694290uBv.LIZJ;
        c1694290uBv.LIZ(i7, iLIZLLL + i7);
        int i8 = c1694290uBv.LIZIZ;
        c1694290uBv.LIZ(i8 - i3, i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694410uC7)) {
            return false;
        }
        C1694410uC7 c1694410uC7 = (C1694410uC7) obj;
        if (this.LIZ == c1694410uC7.LIZ && this.LIZIZ == c1694410uC7.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1694410uC7(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
        sbLIZ.append(i);
        sbLIZ.append(" and ");
        sbLIZ.append(i2);
        sbLIZ.append(" respectively.");
        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
