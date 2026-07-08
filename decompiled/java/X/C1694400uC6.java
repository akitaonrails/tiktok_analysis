package X;

/* JADX INFO: renamed from: X.0uC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694400uC6 implements InterfaceC1694390uC5 {
    public final int LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lengthAfterCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1694390uC5
    public final void LIZ(C1694290uBv c1694290uBv) {
        int i = c1694290uBv.LIZJ;
        int i2 = this.LIZIZ;
        int iLIZLLL = i + i2;
        if (((i ^ iLIZLLL) & (i2 ^ iLIZLLL)) < 0) {
            iLIZLLL = c1694290uBv.LIZLLL();
        }
        c1694290uBv.LIZ(c1694290uBv.LIZJ, Math.min(iLIZLLL, c1694290uBv.LIZLLL()));
        int i3 = c1694290uBv.LIZIZ;
        int i4 = this.LIZ;
        int i5 = i3 - i4;
        if (((i3 ^ i5) & (i4 ^ i3)) < 0) {
            i5 = 0;
        }
        c1694290uBv.LIZ(Math.max(0, i5), c1694290uBv.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1694400uC6)) {
            return false;
        }
        C1694400uC6 c1694400uC6 = (C1694400uC6) obj;
        if (this.LIZ == c1694400uC6.LIZ && this.LIZIZ == c1694400uC6.LIZIZ) {
            return true;
        }
        return false;
    }

    public C1694400uC6(int i, int i2) {
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
