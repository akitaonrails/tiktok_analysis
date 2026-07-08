package X;

import g86.c$d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.0kWY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1322680kWY extends AbstractC1322760kWg {
    public static final long serialVersionUID = 1;
    public final byte[] LLILLL;

    public int LJIIJJI() {
        return 0;
    }

    @Override // X.AbstractC1322720kWc
    public final AbstractC1317820kOi newCodedInput() {
        return AbstractC1317820kOi.LIZ(this.LLILLL, LJIIJJI(), size(), true);
    }

    @Override // X.AbstractC1322720kWc
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.LLILLL, LJIIJJI(), size());
    }

    @Override // X.AbstractC1322720kWc
    public int size() {
        return this.LLILLL.length;
    }

    @Override // X.AbstractC1322720kWc
    public final boolean isValidUtf8() {
        int iLIZIZ;
        int iLJIIJJI = LJIIJJI();
        byte[] bArr = this.LLILLL;
        int size = size() + iLJIIJJI;
        C1322670kWX.LIZ.getClass();
        while (iLJIIJJI < size && bArr[iLJIIJJI] >= 0) {
            iLJIIJJI++;
        }
        if (iLJIIJJI < size) {
            while (iLJIIJJI < size) {
                int i = iLJIIJJI + 1;
                byte b = bArr[iLJIIJJI];
                if (b < 0) {
                    if (b >= -32) {
                        if (b < -16) {
                            if (i >= size - 1) {
                                iLIZIZ = C1322670kWX.LIZIZ(i, bArr, size);
                            } else {
                                int i2 = i + 1;
                                byte b2 = bArr[i];
                                if (b2 > -65) {
                                    return false;
                                }
                                if (b == -32) {
                                    if (b2 < -96) {
                                        return false;
                                    }
                                } else if (b == -19 && b2 >= -96) {
                                    return false;
                                }
                                iLJIIJJI = i2 + 1;
                                if (bArr[i2] > -65) {
                                    return false;
                                }
                            }
                        } else if (i >= size - 2) {
                            iLIZIZ = C1322670kWX.LIZIZ(i, bArr, size);
                        } else {
                            int i3 = i + 1;
                            byte b3 = bArr[i];
                            if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0) {
                                return false;
                            }
                            int i4 = i3 + 1;
                            if (bArr[i3] > -65) {
                                return false;
                            }
                            i = i4 + 1;
                            if (bArr[i4] > -65) {
                                return false;
                            }
                        }
                        if (iLIZIZ != 0) {
                            return false;
                        }
                    } else {
                        if (i >= size || b < -62) {
                            return false;
                        }
                        iLJIIJJI = i + 1;
                        if (bArr[i] > -65) {
                            return false;
                        }
                    }
                }
                iLJIIJJI = i;
            }
        }
        return true;
    }

    public C1322680kWY(byte[] bArr) {
        if (bArr != null) {
            this.LLILLL = bArr;
            return;
        }
        throw null;
    }

    @Override // X.AbstractC1322720kWc
    public byte LJFF(int i) {
        return this.LLILLL[i];
    }

    @Override // X.AbstractC1322720kWc
    public final String LJIIIZ(Charset charset) {
        return new String(this.LLILLL, LJIIJJI(), size(), charset);
    }

    @Override // X.AbstractC1322720kWc
    public final void LJIIJ(c$d c_d) {
        c_d.LJII(this.LLILLL, LJIIJJI(), size());
    }

    @Override // X.AbstractC1322720kWc
    public byte byteAt(int i) {
        return this.LLILLL[i];
    }

    @Override // X.AbstractC1322720kWc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1322720kWc) || size() != ((AbstractC1322720kWc) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C1322680kWY) {
            C1322680kWY c1322680kWY = (C1322680kWY) obj;
            int i = this.hash;
            int i2 = c1322680kWY.hash;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size <= c1322680kWY.size()) {
                if (size <= c1322680kWY.size()) {
                    byte[] bArr = this.LLILLL;
                    byte[] bArr2 = c1322680kWY.LLILLL;
                    int iLJIIJJI = LJIIJJI() + size;
                    int iLJIIJJI2 = LJIIJJI();
                    int iLJIIJJI3 = c1322680kWY.LJIIJJI();
                    while (iLJIIJJI2 < iLJIIJJI) {
                        if (bArr[iLJIIJJI2] != bArr2[iLJIIJJI3]) {
                            return false;
                        }
                        iLJIIJJI2++;
                        iLJIIJJI3++;
                    }
                    return true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Ran off end of other: ");
                sbLIZ.append(0);
                sbLIZ.append(", ");
                sbLIZ.append(size);
                sbLIZ.append(", ");
                sbLIZ.append(c1322680kWY.size());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Length too large: ");
            sbLIZ2.append(size);
            sbLIZ2.append(size());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC1322720kWc
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // X.AbstractC1322720kWc
    public final int LJIIIIZZ(int i, int i2) {
        byte[] bArr = this.LLILLL;
        int iLJIIJJI = LJIIJJI();
        Charset charset = C1317930kOt.LIZ;
        for (int i3 = iLJIIJJI; i3 < iLJIIJJI + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // X.AbstractC1322720kWc
    public final AbstractC1322720kWc substring(int i, int i2) {
        final int iLIZJ = AbstractC1322720kWc.LIZJ(i, i2, size());
        if (iLIZJ == 0) {
            return AbstractC1322720kWc.EMPTY;
        }
        final byte[] bArr = this.LLILLL;
        final int iLJIIJJI = LJIIJJI() + i;
        return new C1322680kWY(bArr, iLJIIJJI, iLIZJ) { // from class: X.0kWZ
            public static final long serialVersionUID = 1;
            public final int LLILZ;
            public final int LLILZIL;

            public Object writeReplace() {
                return new C1322680kWY(toByteArray());
            }

            @Override // X.C1322680kWY
            public final int LJIIJJI() {
                return this.LLILZ;
            }

            @Override // X.C1322680kWY, X.AbstractC1322720kWc
            public final int size() {
                return this.LLILZIL;
            }

            private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
                throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
            }

            @Override // X.C1322680kWY, X.AbstractC1322720kWc
            public final byte LJFF(int i3) {
                return this.LLILLL[this.LLILZ + i3];
            }

            @Override // X.C1322680kWY, X.AbstractC1322720kWc
            public final byte byteAt(int i3) {
                int i4 = this.LLILZIL;
                if (((i4 - (i3 + 1)) | i3) < 0) {
                    if (i3 < 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Index < 0: ");
                        sbLIZ.append(i3);
                        throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Index > length: ");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(i4);
                    throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                return this.LLILLL[this.LLILZ + i3];
            }

            {
                super(bArr);
                AbstractC1322720kWc.LIZJ(iLJIIJJI, iLJIIJJI + iLIZJ, bArr.length);
                this.LLILZ = iLJIIJJI;
                this.LLILZIL = iLIZJ;
            }

            @Override // X.C1322680kWY, X.AbstractC1322720kWc
            public final void LJ(int i3, byte[] bArr2, int i4, int i5) {
                System.arraycopy(this.LLILLL, this.LLILZ + i3, bArr2, i4, i5);
            }
        };
    }

    @Override // X.AbstractC1322720kWc
    public void LJ(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.LLILLL, i, bArr, i2, i3);
    }
}
