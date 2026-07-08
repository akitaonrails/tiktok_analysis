package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: X.0pZS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516680pZS {
    public InterfaceC1516690pZT LIZ;
    public long LIZIZ;
    public int LIZLLL;
    public long LIZJ = Long.MAX_VALUE;
    public int LJ = 2;
    public int LJFF = -1;
    public long LJI = -1;
    public int LJII = -1;

    public final long LIZIZ() throws ProtocolException {
        if (this.LJ != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJ);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long j = this.LIZJ;
        long j2 = j - this.LIZIZ;
        this.LJ = 6;
        this.LIZIZ = j;
        this.LIZJ = this.LJI;
        this.LJI = -1L;
        return j2;
    }

    public final long LIZJ() throws IOException {
        if (this.LJ != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unexpected call to beginMessage(), detail:\n");
            sbLIZ.append(LIZLLL());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int i = this.LIZLLL + 1;
        this.LIZLLL = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.LJI;
        this.LJI = -1L;
        this.LJ = 6;
        return j;
    }

    public final String LIZLLL() {
        String str;
        StringBuilder sb = new StringBuilder("{pos:");
        sb.append(this.LIZIZ);
        sb.append(", limit:");
        sb.append(this.LIZJ);
        sb.append(", recursionDepth:");
        sb.append(this.LIZLLL);
        switch (this.LJ) {
            case 0:
                str = "STATE_VARINT";
                break;
            case 1:
                str = "STATE_FIXED64";
                break;
            case 2:
                str = "STATE_LENGTH_DELIMITED";
                break;
            case 3:
                str = "STATE_START_GROUP";
                break;
            case 4:
                str = "STATE_END_GROUP";
                break;
            case 5:
                str = "STATE_FIXED32";
                break;
            case 6:
                str = "STATE_TAG";
                break;
            case 7:
                str = "STATE_PACKED_TAG";
                break;
            default:
                str = "";
                break;
        }
        sb.append(", state:");
        sb.append(str);
        sb.append(", tag:");
        sb.append(this.LJFF);
        sb.append(", pushedLimit:");
        sb.append(this.LJI);
        sb.append(", nextFieldEncoding:");
        sb.append(this.LJII);
        sb.append("}\n");
        InterfaceC1516690pZT interfaceC1516690pZT = this.LIZ;
        if (interfaceC1516690pZT instanceof C1506330pIl) {
            byte[] bArr = ((C1506330pIl) interfaceC1516690pZT).LIZIZ;
            char[] cArr = new char[bArr.length << 1];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                char[] cArr2 = C1516710pZV.LIZ;
                cArr[i] = cArr2[(b & 240) >>> 4];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            sb.append("data:");
            sb.append(cArr);
        } else {
            sb.append("data is InputStreamSource.");
        }
        return sb.toString();
    }

    public final int LJFF() throws ProtocolException {
        int i;
        this.LIZIZ++;
        byte b = this.LIZ.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & 127;
        this.LIZIZ++;
        byte b2 = this.LIZ.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & 127) << 7;
            this.LIZIZ++;
            byte b3 = this.LIZ.readByte();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & 127) << 14;
                this.LIZIZ++;
                byte b4 = this.LIZ.readByte();
                if (b4 < 0) {
                    this.LIZIZ++;
                    byte b5 = this.LIZ.readByte();
                    int i3 = i2 | ((b4 & 127) << 21) | (b5 << 28);
                    if (b5 >= 0) {
                        return i3;
                    }
                    int i4 = 0;
                    do {
                        this.LIZIZ++;
                        if (this.LIZ.readByte() >= 0) {
                            return i3;
                        }
                        i4++;
                    } while (i4 < 5);
                    throw new ProtocolException("Malformed VARINT");
                }
                i = b4 << 21;
            }
        }
        return i2 | i;
    }

    public final int LJI() throws IOException {
        int i = this.LJ;
        if (i == 7) {
            this.LJ = 2;
            return this.LJFF;
        }
        if (i != 6) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unexpected call to nextTag(), detail:\n");
            sbLIZ.append(LIZLLL());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        while (this.LIZIZ < this.LIZJ && this.LIZ.LIZ()) {
            int iLJFF = LJFF();
            if (iLJFF == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iLJFF >> 3;
            this.LJFF = i2;
            int i3 = iLJFF & 7;
            if (i3 == 0) {
                this.LJII = 0;
                this.LJ = 0;
                return i2;
            }
            if (i3 == 1) {
                this.LJII = 1;
                this.LJ = 1;
                return i2;
            }
            if (i3 == 2) {
                this.LJII = 2;
                this.LJ = 2;
                int iLJFF2 = LJFF();
                if (iLJFF2 < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Negative length: ");
                    sbLIZ2.append(iLJFF2);
                    throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (this.LJI != -1) {
                    throw new IllegalStateException();
                }
                long j = this.LIZJ;
                this.LJI = j;
                long j2 = this.LIZIZ + ((long) iLJFF2);
                this.LIZJ = j2;
                if (j2 <= j) {
                    return this.LJFF;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 == 5) {
                    this.LJII = 5;
                    this.LJ = 5;
                    return i2;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Unexpected field encoding: ");
                sbLIZ3.append(i3);
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ3));
            }
            LJIILIIL(i2);
        }
        return -1;
    }

    public final int LJIIIIZZ() throws IOException {
        int i = this.LJ;
        if (i == 5 || i == 2) {
            this.LIZIZ += 4;
            int iLJJIFFI = this.LIZ.LJJIFFI();
            LIZ(5);
            return iLJJIFFI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sbLIZ.append(this.LJ);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final long LJIIIZ() throws IOException {
        int i = this.LJ;
        if (i == 1 || i == 2) {
            this.LIZIZ += 8;
            long jLJIIJ = this.LIZ.LJIIJ();
            LIZ(1);
            return jLJIIJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sbLIZ.append(this.LJ);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final int LJIIJ() throws IOException {
        int i = this.LJ;
        if (i == 0 || i == 2) {
            int iLJFF = LJFF();
            LIZ(0);
            return iLJFF;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
        sbLIZ.append(this.LJ);
        throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final long LJIIJJI() throws IOException {
        int i = this.LJ;
        if (i != 0 && i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected VARINT or LENGTH_DELIMITED but was ");
            sbLIZ.append(this.LJ);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long j = 0;
        int i2 = 0;
        do {
            this.LIZIZ++;
            byte b = this.LIZ.readByte();
            j |= ((long) (b & 127)) << i2;
            if ((b & 128) == 0) {
                LIZ(0);
                return j;
            }
            i2 += 7;
        } while (i2 < 64);
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final byte[] LJII() throws ProtocolException {
        return this.LIZ.LJJIJ(LIZIZ());
    }

    public final void LIZ(int i) throws IOException {
        if (this.LJ == i) {
            this.LJ = 6;
            return;
        }
        long j = this.LIZIZ;
        long j2 = this.LIZJ;
        if (j <= j2) {
            if (j == j2) {
                this.LIZJ = this.LJI;
                this.LJI = -1L;
                this.LJ = 6;
                return;
            }
            this.LJ = 7;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected to end at ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" but was ");
        sbLIZ.append(this.LIZIZ);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJ(long j) throws IOException {
        if (this.LJ == 6) {
            int i = this.LIZLLL - 1;
            this.LIZLLL = i;
            if (i >= 0 && this.LJI == -1) {
                if (this.LIZIZ != this.LIZJ && i != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Expected to end at ");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(" but was ");
                    sbLIZ.append(this.LIZIZ);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LIZJ = j;
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No corresponding call to beginMessage(), detail:\n");
            sbLIZ2.append(LIZLLL());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Unexpected call to endMessage(), detail:\n");
        sbLIZ3.append(LIZLLL());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJIIL(InterfaceC1516690pZT interfaceC1516690pZT) {
        this.LIZ = interfaceC1516690pZT;
        this.LIZIZ = 0L;
        this.LIZJ = Long.MAX_VALUE;
        this.LIZLLL = 0;
        this.LJ = 2;
        this.LJFF = -1;
        this.LJI = -1L;
        this.LJII = -1;
    }

    public final void LJIILIIL(int i) throws IOException {
        while (this.LIZIZ < this.LIZJ && this.LIZ.LIZ()) {
            int iLJFF = LJFF();
            if (iLJFF != 0) {
                int i2 = iLJFF >> 3;
                int i3 = iLJFF & 7;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        this.LJ = 5;
                                        LJIIIIZZ();
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
                            long jLJFF = LJFF();
                            this.LIZIZ += jLJFF;
                            this.LIZ.skip(jLJFF);
                        }
                    } else {
                        this.LJ = 1;
                        LJIIIZ();
                    }
                } else {
                    this.LJ = 0;
                    LJIIJJI();
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }
}
