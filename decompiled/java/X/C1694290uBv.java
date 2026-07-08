package X;

/* JADX INFO: renamed from: X.0uBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694290uBv {
    public final C1694300uBw LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;

    public final C1692280u8g LIZJ() {
        int i = this.LIZLLL;
        if (i != -1) {
            return new C1692280u8g(C1680680tpy.LIZ(i, this.LJ));
        }
        return null;
    }

    public final int LIZLLL() {
        return this.LIZ.LIZ();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public final char LIZIZ(int i) {
        C1694300uBw c1694300uBw = this.LIZ;
        C1694350uC1 c1694350uC1 = c1694300uBw.LIZIZ;
        if (c1694350uC1 == null) {
            return c1694300uBw.LIZ.charAt(i);
        }
        int i2 = c1694300uBw.LIZJ;
        if (i < i2) {
            return c1694300uBw.LIZ.charAt(i);
        }
        int i3 = c1694350uC1.LIZ;
        int i4 = c1694350uC1.LIZLLL;
        int i5 = c1694350uC1.LIZJ;
        int i6 = i3 - (i4 - i5);
        if (i < i6 + i2) {
            int i7 = i - i2;
            if (i7 < i5) {
                return c1694350uC1.LIZIZ[i7];
            }
            return c1694350uC1.LIZIZ[(i7 - i5) + i4];
        }
        return c1694300uBw.LIZ.charAt(i - ((i6 - c1694300uBw.LIZLLL) + i2));
    }

    public final void LJII(int i) {
        if (i < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot set selectionEnd to a negative value: ");
            sbLIZ.append(i);
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZJ = i;
    }

    public final void LJIIIIZZ(int i) {
        if (i < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot set selectionStart to a negative value: ");
            sbLIZ.append(i);
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZIZ = i;
    }

    public C1694290uBv(C1692220u8a c1692220u8a, long j) {
        this.LIZ = new C1694300uBw(c1692220u8a.LLILLJJLI);
        this.LIZIZ = C1692280u8g.LJI(j);
        this.LIZJ = C1692280u8g.LJFF(j);
        int iLJI = C1692280u8g.LJI(j);
        int iLJFF = C1692280u8g.LJFF(j);
        if (iLJI >= 0 && iLJI <= c1692220u8a.length()) {
            if (iLJFF >= 0 && iLJFF <= c1692220u8a.length()) {
                if (iLJI <= iLJFF) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Do not set reversed range: ");
                sbLIZ.append(iLJI);
                sbLIZ.append(" > ");
                sbLIZ.append(iLJFF);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end (");
            sbLIZ2.append(iLJFF);
            sbLIZ2.append(") offset is outside of text region ");
            sbLIZ2.append(c1692220u8a.length());
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("start (");
        sbLIZ3.append(iLJI);
        sbLIZ3.append(") offset is outside of text region ");
        sbLIZ3.append(c1692220u8a.length());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LIZ(int i, int i2) {
        long jLIZ = C1680680tpy.LIZ(i, i2);
        this.LIZ.LIZIZ(i, i2, "");
        long jLIZ2 = C1692480u90.LIZ(C1680680tpy.LIZ(this.LIZIZ, this.LIZJ), jLIZ);
        LJIIIIZZ(C1692280u8g.LJI(jLIZ2));
        LJII(C1692280u8g.LJFF(jLIZ2));
        int i3 = this.LIZLLL;
        if (i3 != -1) {
            long jLIZ3 = C1692480u90.LIZ(C1680680tpy.LIZ(i3, this.LJ), jLIZ);
            if (C1692280u8g.LIZJ(jLIZ3)) {
                this.LIZLLL = -1;
                this.LJ = -1;
            } else {
                this.LIZLLL = C1692280u8g.LJI(jLIZ3);
                this.LJ = C1692280u8g.LJFF(jLIZ3);
            }
        }
    }

    public final void LJFF(int i, int i2) {
        if (i >= 0 && i <= this.LIZ.LIZ()) {
            if (i2 >= 0 && i2 <= this.LIZ.LIZ()) {
                if (i < i2) {
                    this.LIZLLL = i;
                    this.LJ = i2;
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Do not set reversed or empty range: ");
                sbLIZ.append(i);
                sbLIZ.append(" > ");
                sbLIZ.append(i2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end (");
            sbLIZ2.append(i2);
            sbLIZ2.append(") offset is outside of text region ");
            sbLIZ2.append(this.LIZ.LIZ());
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("start (");
        sbLIZ3.append(i);
        sbLIZ3.append(") offset is outside of text region ");
        sbLIZ3.append(this.LIZ.LIZ());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJI(int i, int i2) {
        if (i >= 0 && i <= this.LIZ.LIZ()) {
            if (i2 >= 0 && i2 <= this.LIZ.LIZ()) {
                if (i <= i2) {
                    LJIIIIZZ(i);
                    LJII(i2);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Do not set reversed range: ");
                sbLIZ.append(i);
                sbLIZ.append(" > ");
                sbLIZ.append(i2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end (");
            sbLIZ2.append(i2);
            sbLIZ2.append(") offset is outside of text region ");
            sbLIZ2.append(this.LIZ.LIZ());
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("start (");
        sbLIZ3.append(i);
        sbLIZ3.append(") offset is outside of text region ");
        sbLIZ3.append(this.LIZ.LIZ());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJ(int i, int i2, String str) {
        if (i >= 0 && i <= this.LIZ.LIZ()) {
            if (i2 >= 0 && i2 <= this.LIZ.LIZ()) {
                if (i <= i2) {
                    this.LIZ.LIZIZ(i, i2, str);
                    LJIIIIZZ(str.length() + i);
                    LJII(i + str.length());
                    this.LIZLLL = -1;
                    this.LJ = -1;
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Do not set reversed range: ");
                sbLIZ.append(i);
                sbLIZ.append(" > ");
                sbLIZ.append(i2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("end (");
            sbLIZ2.append(i2);
            sbLIZ2.append(") offset is outside of text region ");
            sbLIZ2.append(this.LIZ.LIZ());
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("start (");
        sbLIZ3.append(i);
        sbLIZ3.append(") offset is outside of text region ");
        sbLIZ3.append(this.LIZ.LIZ());
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
