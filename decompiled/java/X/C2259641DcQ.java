package X;

/* JADX INFO: renamed from: X.1DcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259641DcQ {
    public char[] LIZ;
    public int LIZIZ;

    public final String toString() {
        return new String(this.LIZ, 0, this.LIZIZ);
    }

    public C2259641DcQ(int i) {
        if (i >= 0) {
            this.LIZ = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    public final void LIZ(char c) {
        int i = this.LIZIZ + 1;
        if (i > this.LIZ.length) {
            LIZJ(i);
        }
        this.LIZ[this.LIZIZ] = c;
        this.LIZIZ = i;
    }

    public final void LIZIZ(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.LIZIZ + length;
        if (i > this.LIZ.length) {
            LIZJ(i);
        }
        str.getChars(0, length, this.LIZ, this.LIZIZ);
        this.LIZIZ = i;
    }

    public final void LIZJ(int i) {
        char[] cArr = new char[Math.max(this.LIZ.length << 1, i)];
        System.arraycopy(this.LIZ, 0, cArr, 0, this.LIZIZ);
        this.LIZ = cArr;
    }

    public final String LIZLLL(int i, int i2) {
        char c;
        if (i >= 0) {
            if (i2 <= this.LIZIZ) {
                if (i > i2) {
                    throw new IndexOutOfBoundsException();
                }
                while (i < i2 && ((c = this.LIZ[i]) == ' ' || c == '\t' || c == '\r' || c == '\n')) {
                    i++;
                }
                while (i2 > i) {
                    int i3 = i2 - 1;
                    char c2 = this.LIZ[i3];
                    if (c2 != ' ' && c2 != '\t' && c2 != '\r' && c2 != '\n') {
                        break;
                    }
                    i2 = i3;
                }
                return new String(this.LIZ, i, i2 - i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }
}
