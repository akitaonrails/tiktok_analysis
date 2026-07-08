package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: X.0pZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516720pZW {
    public final byte[] LIZ;
    public final int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJII;
    public int LJI = -1;
    public int LJIIIIZZ = -1;
    public final C1516740pZY LJIIIZ = new C1516740pZY();

    public final long LIZIZ() throws ProtocolException {
        if (this.LJFF != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJFF);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long j = this.LIZLLL;
        long j2 = j - this.LIZJ;
        this.LJFF = 6;
        this.LIZJ = j;
        this.LIZLLL = this.LJII;
        this.LJII = -1L;
        return j2;
    }

    public final long LIZJ() throws IOException {
        if (this.LJFF != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.LJ + 1;
        this.LJ = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.LJII;
        this.LJII = -1L;
        this.LJFF = 6;
        return j;
    }

    public final int LJ() throws EOFException {
        int i = (int) this.LIZJ;
        int i2 = i + 4;
        if (i2 > this.LIZIZ) {
            throw new EOFException();
        }
        byte[] bArr = this.LIZ;
        int i3 = (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        this.LIZJ = i2;
        return i3;
    }

    public final long LJFF() throws EOFException {
        int i = (int) this.LIZJ;
        int i2 = i + 8;
        if (i2 > this.LIZIZ) {
            throw new EOFException();
        }
        byte[] bArr = this.LIZ;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((255 & ((long) bArr[i + 6])) << 48) | (((long) bArr[i + 7]) << 56);
        this.LIZJ = i2;
        return j;
    }

    public final int LJI() throws IOException {
        int i;
        int i2 = (int) this.LIZJ;
        if (i2 >= this.LIZIZ) {
            throw new EOFException();
        }
        byte[] bArr = this.LIZ;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            this.LIZJ = i3;
            return b;
        }
        int i4 = i3 + 1;
        int i5 = b ^ (bArr[i3] << 7);
        if (i5 < 0) {
            i = i5 ^ (-128);
        } else {
            int i6 = i4 + 1;
            int i7 = i5 ^ (bArr[i4] << 14);
            if (i7 >= 0) {
                i = i7 ^ 16256;
            } else {
                i4 = i6 + 1;
                int i8 = i7 ^ (bArr[i6] << 21);
                if (i8 < 0) {
                    i = i8 ^ (-2080896);
                } else {
                    i6 = i4 + 1;
                    byte b2 = bArr[i4];
                    i = (i8 ^ (b2 << 28)) ^ 266354560;
                    if (b2 < 0) {
                        i4 = i6 + 1;
                        if (bArr[i6] < 0) {
                            i6 = i4 + 1;
                            if (bArr[i4] < 0) {
                                i4 = i6 + 1;
                                if (bArr[i6] < 0) {
                                    i6 = i4 + 1;
                                    if (bArr[i4] < 0) {
                                        i4 = i6 + 1;
                                        if (bArr[i6] < 0) {
                                            throw new IOException("Malformed varint32");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i4 = i6;
        }
        this.LIZJ = i4;
        return i;
    }

    public final long LJII() throws IOException {
        int i = (int) this.LIZJ;
        if (i >= this.LIZIZ) {
            throw new EOFException();
        }
        long j = 0;
        int i2 = 0;
        while (i < this.LIZIZ) {
            int i3 = i + 1;
            byte b = this.LIZ[i];
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                this.LIZJ = i3;
                return j;
            }
            i2 += 7;
            i = i3;
            if (i2 >= 64) {
                throw new IOException("Malformed varint64");
            }
        }
        throw new EOFException();
    }

    public final int LJIIIIZZ() throws IOException {
        int i = this.LJFF;
        if (i == 7) {
            this.LJFF = 2;
            return this.LJI;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.LIZJ < this.LIZLLL) {
            int iLJI = LJI();
            if (iLJI == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iLJI >>> 3;
            this.LJI = i2;
            int i3 = iLJI & 7;
            if (i3 == 0) {
                this.LJIIIIZZ = 0;
                this.LJFF = 0;
                return i2;
            }
            if (i3 == 1) {
                this.LJIIIIZZ = 1;
                this.LJFF = 1;
                return i2;
            }
            if (i3 == 2) {
                this.LJIIIIZZ = 2;
                this.LJFF = 2;
                int iLJI2 = LJI();
                if (iLJI2 < 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Negative length: ");
                    sbLIZ.append(iLJI2);
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (this.LJII != -1) {
                    throw new IllegalStateException();
                }
                long j = this.LIZLLL;
                this.LJII = j;
                long j2 = this.LIZJ + ((long) iLJI2);
                this.LIZLLL = j2;
                if (j2 <= j) {
                    return this.LJI;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 == 5) {
                    this.LJIIIIZZ = 5;
                    this.LJFF = 5;
                    return i2;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unexpected field encoding: ");
                sbLIZ2.append(i3);
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            LJIILIIL(i2);
        }
        return -1;
    }

    public final C1516740pZY LJIIJ() throws ProtocolException, EOFException {
        if (this.LJFF != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJFF);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long j = this.LIZJ;
        int i = (int) j;
        long j2 = this.LIZLLL;
        int i2 = (int) (j2 - j);
        if (i < 0 || i + i2 > this.LIZIZ) {
            throw new EOFException();
        }
        C1516740pZY c1516740pZY = this.LJIIIZ;
        c1516740pZY.LIZ = this.LIZ;
        c1516740pZY.LIZIZ = i;
        c1516740pZY.LIZJ = i2;
        this.LJFF = 6;
        this.LIZJ = j2;
        this.LIZLLL = this.LJII;
        this.LJII = -1L;
        return c1516740pZY;
    }

    public final int LJIIJJI() throws IOException {
        int i = this.LJFF;
        if (i == 0 || i == 2) {
            int iLJI = LJI();
            LIZ(0);
            return iLJI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
        sbLIZ.append(this.LJFF);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final long LJIIL() throws IOException {
        int i = this.LJFF;
        if (i == 0 || i == 2) {
            long jLJII = LJII();
            LIZ(0);
            return jLJII;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
        sbLIZ.append(this.LJFF);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1516720pZW(byte[] bArr) {
        this.LJFF = 2;
        this.LJII = -1L;
        this.LIZ = bArr;
        int length = bArr.length;
        this.LIZIZ = length;
        this.LIZJ = 0L;
        this.LIZLLL = length;
        this.LJII = length;
        this.LJFF = 2;
    }

    public final void LIZ(int i) throws IOException {
        if (this.LJFF == i) {
            this.LJFF = 6;
            return;
        }
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        if (j <= j2) {
            if (j == j2) {
                this.LIZLLL = this.LJII;
                this.LJII = -1L;
                this.LJFF = 6;
                return;
            }
            this.LJFF = 7;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected to end at ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" but was ");
        sbLIZ.append(this.LIZJ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(long j) throws IOException {
        if (this.LJFF == 6) {
            int i = this.LJ - 1;
            this.LJ = i;
            if (i >= 0 && this.LJII == -1) {
                if (this.LIZJ != this.LIZLLL && i != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected to end at ");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(" but was ");
                    sbLIZ.append(this.LIZJ);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZLLL = j;
                return;
            }
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        throw new IllegalStateException("Unexpected call to endMessage()");
    }

    public final void LJIIIZ(int i) throws EOFException {
        long j = this.LIZJ + ((long) i);
        if (j >= 0 && j <= this.LIZIZ) {
            this.LIZJ = j;
            return;
        }
        throw new EOFException();
    }

    public final void LJIILIIL(int i) throws IOException {
        while (this.LIZJ < this.LIZLLL) {
            int iLJI = LJI();
            if (iLJI != 0) {
                int i2 = iLJI >>> 3;
                int i3 = iLJI & 7;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        LJ();
                                    } else {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Unexpected field encoding: ");
                                        sbLIZ.append(i3);
                                        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                } else if (i2 == i) {
                                    return;
                                } else {
                                    throw new ProtocolException("Unexpected end group");
                                }
                            } else {
                                LJIILIIL(i2);
                            }
                        } else {
                            LJIIIZ(LJI());
                        }
                    } else {
                        LJFF();
                    }
                } else {
                    LJII();
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }
}
