package X;

import java.util.NoSuchElementException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BUD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUD {
    public byte[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public char LIZLLL;
    public boolean LJ;

    public final boolean LIZJ() {
        int i = this.LIZIZ;
        if (2 != LIZ()) {
            return false;
        }
        int i2 = 0;
        while ("lo".charAt(i2) == this.LIZ[i]) {
            i++;
            i2++;
            if (i2 >= 2) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL() {
        if (this.LIZ == null) {
            throw new IllegalStateException("Must call reset first");
        }
    }

    public final int LIZ() {
        LIZLLL();
        if (!this.LJ) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
        int i = this.LIZJ;
        int i2 = this.LIZIZ;
        if (i <= i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Reading past end of input stream at ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(e3.d);
            throw new NoSuchElementException(C2188811AlT.LIZIZ(sbLIZ));
        }
        byte[] bArr = this.LIZ;
        byte b = this.LIZLLL;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (bArr[i2] != b) {
                i2++;
            } else if (i2 != -1) {
                int i3 = i2 - this.LIZIZ;
                this.LIZIZ = i2 + 1;
                return i3;
            }
        }
        int i4 = this.LIZJ;
        int i5 = i4 - this.LIZIZ;
        this.LIZIZ = i4;
        return i5;
    }

    public final int LIZIZ() {
        LIZLLL();
        if (!this.LJ) {
            throw new IllegalStateException("Must call useDelimiter first");
        }
        int i = this.LIZIZ;
        int iLIZ = LIZ();
        byte[] bArr = this.LIZ;
        int i2 = iLIZ + i;
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            int i5 = bArr[i] - 48;
            if (i5 < 0 || i5 > 9) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid int in buffer at ");
                sbLIZ.append(i4 - 1);
                sbLIZ.append(e3.d);
                throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
            }
            i3 = (i3 * 10) + i5;
            i = i4;
        }
        return i3;
    }
}
