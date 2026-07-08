package X;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516770pZb {
    public final InterfaceC1516890pZn LIZ;

    public C1516770pZb(InterfaceC1516890pZn interfaceC1516890pZn) {
        this.LIZ = interfaceC1516890pZn;
    }

    public static final void LIZJ(C013C c013c, C1516790pZd c1516790pZd) {
        if (!c013c.element) {
            c1516790pZd.LIZ((byte) 44);
        } else {
            c013c.element = false;
        }
    }

    public final void LIZ(C1516850pZj c1516850pZj, C1516720pZW c1516720pZW, C1516790pZd c1516790pZd) throws IOException {
        C1516820pZg c1516820pZg;
        Integer numValueOf;
        c1516790pZd.LIZ((byte) 123);
        long jLIZJ = c1516720pZW.LIZJ();
        boolean z = false;
        while (true) {
            while (true) {
                int iLJIIIIZZ = c1516720pZW.LJIIIIZZ();
                while (iLJIIIIZZ != -1) {
                    C1516820pZg[] c1516820pZgArr = c1516850pZj.LIZIZ;
                    if (c1516820pZgArr != null && iLJIIIIZZ < c1516820pZgArr.length) {
                        c1516820pZg = c1516820pZgArr[iLJIIIIZZ];
                    } else {
                        c1516820pZg = c1516850pZj.LIZ.get(iLJIIIIZZ);
                    }
                    if (c1516820pZg == null) {
                        break;
                    }
                    if (z) {
                        c1516790pZd.LIZ((byte) 44);
                    }
                    byte[] bArr = c1516820pZg.LJII;
                    if (bArr != null) {
                        c1516790pZd.LIZ.write(bArr);
                        c1516790pZd.LIZ.writeByte(58);
                    } else {
                        String str = c1516820pZg.LIZ;
                        c1516790pZd.LIZ.writeByte(34);
                        c1516790pZd.LIZ.LJJJJZI(str, StandardCharsets.UTF_8);
                        c1516790pZd.LIZ.LJLLILLLL("\":");
                    }
                    if (c1516820pZg.LIZLLL && c1516820pZg.LIZJ != 21) {
                        c1516790pZd.LIZ((byte) 91);
                        C013C c013c = new C013C();
                        c013c.element = true;
                        LIZJ(c013c, c1516790pZd);
                        LIZLLL(c1516820pZg, c1516720pZW, c1516790pZd);
                        while (c1516720pZW.LJFF == 7) {
                            LIZJ(c013c, c1516790pZd);
                            LIZLLL(c1516820pZg, c1516720pZW, c1516790pZd);
                        }
                        int iLJIIIIZZ2 = c1516720pZW.LJIIIIZZ();
                        while (iLJIIIIZZ2 == iLJIIIIZZ) {
                            LIZJ(c013c, c1516790pZd);
                            LIZLLL(c1516820pZg, c1516720pZW, c1516790pZd);
                            while (c1516720pZW.LJFF == 7) {
                                LIZJ(c013c, c1516790pZd);
                                LIZLLL(c1516820pZg, c1516720pZW, c1516790pZd);
                            }
                            iLJIIIIZZ2 = c1516720pZW.LJIIIIZZ();
                        }
                        c1516790pZd.LIZ((byte) 93);
                        numValueOf = Integer.valueOf(iLJIIIIZZ2);
                        if (numValueOf.intValue() == -1) {
                            numValueOf = null;
                        }
                    } else {
                        if (c1516820pZg.LIZJ == 21) {
                            c1516790pZd.LIZ((byte) 123);
                            C013C c013c2 = new C013C();
                            if (LIZIZ(c1516820pZg, c1516720pZW, c013c2, c1516790pZd, this)) {
                                c013c2.element = true;
                            }
                            int iLJIIIIZZ3 = c1516720pZW.LJIIIIZZ();
                            while (iLJIIIIZZ3 == iLJIIIIZZ) {
                                if (LIZIZ(c1516820pZg, c1516720pZW, c013c2, c1516790pZd, this)) {
                                    c013c2.element = true;
                                }
                                iLJIIIIZZ3 = c1516720pZW.LJIIIIZZ();
                            }
                            c1516790pZd.LIZ((byte) 125);
                            numValueOf = Integer.valueOf(iLJIIIIZZ3);
                            if (numValueOf.intValue() == -1) {
                            }
                        } else {
                            LIZLLL(c1516820pZg, c1516720pZW, c1516790pZd);
                        }
                        numValueOf = null;
                    }
                    z = true;
                    if (numValueOf != null) {
                        iLJIIIIZZ = numValueOf.intValue();
                    }
                }
                c1516720pZW.LIZLLL(jLIZJ);
                c1516790pZd.LIZ((byte) 125);
                return;
            }
            C1516730pZX.LJ(c1516720pZW);
        }
    }

    public final void LIZLLL(C1516820pZg c1516820pZg, C1516720pZW c1516720pZW, C1516790pZd c1516790pZd) throws IOException {
        byte[] bArr;
        int iLIZJ;
        int iLIZLLL;
        int i = c1516820pZg.LIZJ;
        if (i != 20) {
            switch (i) {
                case 0:
                    boolean zLIZ = C1516730pZX.LIZ(c1516720pZW);
                    InterfaceC1496780p3M interfaceC1496780p3M = c1516790pZd.LIZ;
                    if (zLIZ) {
                        bArr = C1516790pZd.LJII;
                    } else {
                        bArr = C1516790pZd.LJIIIIZZ;
                    }
                    interfaceC1496780p3M.write(bArr);
                    return;
                case 1:
                    byte[] bArrLIZIZ = C1516730pZX.LIZIZ(c1516720pZW);
                    byte[] bArr2 = C1516790pZd.LIZLLL;
                    int length = bArrLIZIZ.length;
                    c1516790pZd.LIZ.writeByte(34);
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 3;
                        if (i3 <= length) {
                            int i4 = bArrLIZIZ[i2] & 255;
                            int i5 = bArrLIZIZ[i2 + 1] & 255;
                            int i6 = bArrLIZIZ[i2 + 2] & 255;
                            byte[] bArr3 = c1516790pZd.LIZJ;
                            byte[] bArr4 = C1516790pZd.LJIIJ;
                            bArr3[0] = bArr4[i4 >>> 2];
                            bArr3[1] = bArr4[((i4 & 3) << 4) | (i5 >>> 4)];
                            bArr3[2] = bArr4[((i5 & 15) << 2) | (i6 >>> 6)];
                            bArr3[3] = bArr4[i6 & 63];
                            c1516790pZd.LIZ.write(bArr3);
                            i2 = i3;
                        } else {
                            int i7 = length - i2;
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    int i8 = bArrLIZIZ[i2] & 255;
                                    int i9 = bArrLIZIZ[i2 + 1] & 255;
                                    byte[] bArr5 = c1516790pZd.LIZJ;
                                    byte[] bArr6 = C1516790pZd.LJIIJ;
                                    bArr5[0] = bArr6[i8 >>> 2];
                                    bArr5[1] = bArr6[((i8 & 3) << 4) | (i9 >>> 4)];
                                    bArr5[2] = bArr6[(i9 & 15) << 2];
                                    bArr5[3] = 61;
                                    c1516790pZd.LIZ.write(bArr5);
                                }
                            } else {
                                int i10 = bArrLIZIZ[i2] & 255;
                                byte[] bArr7 = c1516790pZd.LIZJ;
                                byte[] bArr8 = C1516790pZd.LJIIJ;
                                bArr7[0] = bArr8[i10 >>> 2];
                                bArr7[1] = bArr8[(i10 & 3) << 4];
                                bArr7[2] = 61;
                                bArr7[3] = 61;
                                c1516790pZd.LIZ.write(bArr7);
                            }
                            c1516790pZd.LIZ.writeByte(34);
                            return;
                        }
                    }
                    break;
                case 2:
                    c1516790pZd.LIZ.LJLLILLLL(String.valueOf(C1516730pZX.LIZJ(c1516720pZW)));
                    return;
                case 3:
                    c1516790pZd.LIZ.LJLLILLLL(String.valueOf(C1516730pZX.LIZLLL(c1516720pZW)));
                    return;
                case 4:
                case 7:
                    int iLJIIJJI = c1516720pZW.LJIIJJI();
                    if (iLJIIJJI == Integer.MIN_VALUE) {
                        c1516790pZd.LIZ.write(C1516790pZd.LJFF);
                        return;
                    }
                    int length2 = c1516790pZd.LIZIZ.length;
                    if (iLJIIJJI < 0) {
                        iLIZJ = c1516790pZd.LIZJ(-iLJIIJJI, length2) - 1;
                        c1516790pZd.LIZIZ[iLIZJ] = 45;
                    } else {
                        iLIZJ = c1516790pZd.LIZJ(iLJIIJJI, length2);
                    }
                    InterfaceC1496780p3M interfaceC1496780p3M2 = c1516790pZd.LIZ;
                    byte[] bArr9 = c1516790pZd.LIZIZ;
                    interfaceC1496780p3M2.LJJIII(iLIZJ, bArr9, bArr9.length - iLIZJ);
                    return;
                case 5:
                case 8:
                    long jLJIIL = c1516720pZW.LJIIL();
                    if (jLJIIL == Long.MIN_VALUE) {
                        c1516790pZd.LIZ.write(C1516790pZd.LJI);
                        return;
                    }
                    int length3 = c1516790pZd.LIZIZ.length;
                    if (jLJIIL < 0) {
                        iLIZLLL = c1516790pZd.LIZLLL(length3, -jLJIIL) - 1;
                        c1516790pZd.LIZIZ[iLIZLLL] = 45;
                    } else {
                        iLIZLLL = c1516790pZd.LIZLLL(length3, jLJIIL);
                    }
                    InterfaceC1496780p3M interfaceC1496780p3M3 = c1516790pZd.LIZ;
                    byte[] bArr10 = c1516790pZd.LIZIZ;
                    interfaceC1496780p3M3.LJJIII(iLIZLLL, bArr10, bArr10.length - iLIZLLL);
                    return;
                case 6:
                    C1516740pZY c1516740pZYLJIIJ = c1516720pZW.LJIIJ();
                    c1516790pZd.LIZIZ(c1516740pZYLJIIJ.LIZIZ, c1516740pZYLJIIJ.LIZ, c1516740pZYLJIIJ.LIZJ);
                    return;
                default:
                    C1516730pZX.LJ(c1516720pZW);
                    return;
            }
        } else {
            C1516850pZj c1516850pZj = c1516820pZg.LJI;
            if (c1516850pZj == null) {
                String str = c1516820pZg.LJ;
                if (str != null) {
                    c1516850pZj = this.LIZ.get(str);
                    if (c1516850pZj == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("message '");
                        sbLIZ.append(str);
                        sbLIZ.append("' not found for field '");
                        sbLIZ.append(c1516820pZg.LIZ);
                        sbLIZ.append('\'');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalStateException(strLIZIZ);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("field '");
                    sbLIZ2.append(c1516820pZg.LIZ);
                    sbLIZ2.append("' lacks fqName for T_FQ_NAME");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalStateException(strLIZIZ2);
                }
            }
            LIZ(c1516850pZj, c1516720pZW, c1516790pZd);
        }
    }

    public static final boolean LIZIZ(C1516820pZg c1516820pZg, C1516720pZW c1516720pZW, C013C c013c, C1516790pZd c1516790pZd, C1516770pZb c1516770pZb) throws IOException {
        C1516870pZl second;
        Pair<C1516860pZk, C1516870pZl> pair = c1516820pZg.LJFF;
        if (pair != null && (second = pair.getSecond()) != null) {
            long jLIZJ = c1516720pZW.LIZJ();
            C1516740pZY c1516740pZYLJIIJ = null;
            boolean z = false;
            byte[] bArrLJZL = null;
            while (true) {
                int iLJIIIIZZ = c1516720pZW.LJIIIIZZ();
                if (iLJIIIIZZ == -1) {
                    break;
                }
                if (iLJIIIIZZ != 1) {
                    if (iLJIIIIZZ != 2) {
                        C1516730pZX.LJ(c1516720pZW);
                    } else if (c1516740pZYLJIIJ != null) {
                        if (c013c.element) {
                            c1516790pZd.LIZ((byte) 44);
                        }
                        c1516790pZd.LIZIZ(c1516740pZYLJIIJ.LIZIZ, c1516740pZYLJIIJ.LIZ, c1516740pZYLJIIJ.LIZJ);
                        c1516790pZd.LIZ((byte) 58);
                        c1516770pZb.LIZLLL(second, c1516720pZW, c1516790pZd);
                        z = true;
                    } else {
                        C1496690p3D c1496690p3D = new C1496690p3D();
                        c1516770pZb.LIZLLL(second, c1516720pZW, new C1516790pZd(c1496690p3D));
                        bArrLJZL = c1496690p3D.LJZL();
                    }
                } else {
                    c1516740pZYLJIIJ = c1516720pZW.LJIIJ();
                }
            }
            c1516720pZW.LIZLLL(jLIZJ);
            if (!z && c1516740pZYLJIIJ != null && bArrLJZL != null) {
                if (c013c.element) {
                    c1516790pZd.LIZ((byte) 44);
                }
                c1516790pZd.LIZIZ(c1516740pZYLJIIJ.LIZIZ, c1516740pZYLJIIJ.LIZ, c1516740pZYLJIIJ.LIZJ);
                c1516790pZd.LIZ((byte) 58);
                c1516790pZd.LIZ.write(bArrLJZL);
                return true;
            }
            return z;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("map field '");
        sbLIZ.append(c1516820pZg.LIZ);
        sbLIZ.append("' lacks mapInfo.second");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
