package X;

/* JADX INFO: renamed from: X.12tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19902312tx {
    public static int LJIIJ(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long LJIILIIL(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int LJII(byte[] bArr, int i, C19903812uC c19903812uC) throws C19903212u6 {
        int iLJIIJJI = LJIIJJI(bArr, i, c19903812uC);
        int i2 = c19903812uC.LIZ;
        if (i2 >= 0) {
            if (i2 <= bArr.length - iLJIIJJI) {
                if (i2 == 0) {
                    c19903812uC.LIZJ = AbstractC19854812mI.zza;
                    return iLJIIJJI;
                }
                c19903812uC.LIZJ = AbstractC19854812mI.zza(bArr, iLJIIJJI, i2);
                return iLJIIJJI + i2;
            }
            throw C19903212u6.LIZLLL();
        }
        throw C19903212u6.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIIIZ(byte[] r12, int r13, X.C19903812uC r14) throws X.C19903212u6 {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19902312tx.LJIIIZ(byte[], int, X.12uC):int");
    }

    public static int LJIIJJI(byte[] bArr, int i, C19903812uC c19903812uC) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c19903812uC.LIZ = b;
            return i2;
        }
        return LIZLLL(b, bArr, i2, c19903812uC);
    }

    public static int LJIIL(byte[] bArr, int i, C19903812uC c19903812uC) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c19903812uC.LIZIZ = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & 127)) << i4;
            i3++;
        }
        c19903812uC.LIZIZ = j2;
        return i3;
    }

    public static int LIZLLL(int i, byte[] bArr, int i2, C19903812uC c19903812uC) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c19903812uC.LIZ = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c19903812uC.LIZ = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c19903812uC.LIZ = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c19903812uC.LIZ = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c19903812uC.LIZ = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int LJIIIIZZ(byte[] bArr, int i, InterfaceC19875012pY<?> interfaceC19875012pY, C19903812uC c19903812uC) throws C19903212u6 {
        C19886412rO c19886412rO = (C19886412rO) interfaceC19875012pY;
        int iLJIIJJI = LJIIJJI(bArr, i, c19903812uC);
        int i2 = c19903812uC.LIZ + iLJIIJJI;
        while (iLJIIJJI < i2) {
            iLJIIJJI = LJIIJJI(bArr, iLJIIJJI, c19903812uC);
            c19886412rO.LJ(c19903812uC.LIZ);
        }
        if (iLJIIJJI == i2) {
            return iLJIIJJI;
        }
        throw C19903212u6.LIZLLL();
    }

    public static int LIZ(int i, byte[] bArr, int i2, int i3, C19903812uC c19903812uC) throws C19903212u6 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw new C19903212u6("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = LJIIJJI(bArr, i2, c19903812uC);
                            i6 = c19903812uC.LIZ;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = LIZ(i6, bArr, i2, i3, c19903812uC);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw C19903212u6.LIZJ();
                    }
                    return LJIIJJI(bArr, i2, c19903812uC) + c19903812uC.LIZ;
                }
                return i2 + 8;
            }
            return LJIIL(bArr, i2, c19903812uC);
        }
        throw new C19903212u6("Protocol message contained an invalid tag (zero).");
    }

    public static int LJFF(InterfaceC19900112tb interfaceC19900112tb, byte[] bArr, int i, int i2, C19903812uC c19903812uC) throws C19903212u6 {
        AbstractC19899612tW abstractC19899612tWZza = interfaceC19900112tb.zza();
        int iLJI = LJI(abstractC19899612tWZza, interfaceC19900112tb, bArr, i, i2, c19903812uC);
        interfaceC19900112tb.LIZIZ(abstractC19899612tWZza);
        c19903812uC.LIZJ = abstractC19899612tWZza;
        return iLJI;
    }

    public static int LIZIZ(int i, byte[] bArr, int i2, int i3, InterfaceC19875012pY<?> interfaceC19875012pY, C19903812uC c19903812uC) {
        C19886412rO c19886412rO = (C19886412rO) interfaceC19875012pY;
        int iLJIIJJI = LJIIJJI(bArr, i2, c19903812uC);
        c19886412rO.LJ(c19903812uC.LIZ);
        while (iLJIIJJI < i3) {
            int iLJIIJJI2 = LJIIJJI(bArr, iLJIIJJI, c19903812uC);
            if (i != c19903812uC.LIZ) {
                break;
            }
            iLJIIJJI = LJIIJJI(bArr, iLJIIJJI2, c19903812uC);
            c19886412rO.LJ(c19903812uC.LIZ);
        }
        return iLJIIJJI;
    }

    public static int LIZJ(int i, byte[] bArr, int i2, int i3, C19902412ty c19902412ty, C19903812uC c19903812uC) throws C19903212u6 {
        int iLJIIJJI = i2;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c19902412ty.LIZJ(i, Integer.valueOf(LJIIJ(iLJIIJJI, bArr)));
                                return iLJIIJJI + 4;
                            }
                            throw new C19903212u6("Protocol message contained an invalid tag (zero).");
                        }
                        C19902412ty c19902412ty2 = new C19902412ty();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (iLJIIJJI < i3) {
                            iLJIIJJI = LJIIJJI(bArr, iLJIIJJI, c19903812uC);
                            i6 = c19903812uC.LIZ;
                            if (i6 == i5) {
                                break;
                            }
                            iLJIIJJI = LIZJ(i6, bArr, iLJIIJJI, i3, c19902412ty2, c19903812uC);
                        }
                        if (iLJIIJJI <= i3 && i6 == i5) {
                            c19902412ty.LIZJ(i, c19902412ty2);
                            return iLJIIJJI;
                        }
                        throw C19903212u6.LIZJ();
                    }
                    int iLJIIJJI2 = LJIIJJI(bArr, iLJIIJJI, c19903812uC);
                    int i7 = c19903812uC.LIZ;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - iLJIIJJI2) {
                            if (i7 == 0) {
                                c19902412ty.LIZJ(i, AbstractC19854812mI.zza);
                            } else {
                                c19902412ty.LIZJ(i, AbstractC19854812mI.zza(bArr, iLJIIJJI2, i7));
                            }
                            return iLJIIJJI2 + i7;
                        }
                        throw C19903212u6.LIZLLL();
                    }
                    throw C19903212u6.LIZIZ();
                }
                c19902412ty.LIZJ(i, Long.valueOf(LJIILIIL(iLJIIJJI, bArr)));
                return iLJIIJJI + 8;
            }
            int iLJIIL = LJIIL(bArr, iLJIIJJI, c19903812uC);
            c19902412ty.LIZJ(i, Long.valueOf(c19903812uC.LIZIZ));
            return iLJIIL;
        }
        throw new C19903212u6("Protocol message contained an invalid tag (zero).");
    }

    public static int LJI(Object obj, InterfaceC19900112tb interfaceC19900112tb, byte[] bArr, int i, int i2, C19903812uC c19903812uC) throws C19903212u6 {
        int iLIZLLL = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iLIZLLL = LIZLLL(i3, bArr, iLIZLLL, c19903812uC);
            i3 = c19903812uC.LIZ;
        }
        if (i3 >= 0 && i3 <= i2 - iLIZLLL) {
            int i4 = i3 + iLIZLLL;
            interfaceC19900112tb.LJFF(obj, bArr, iLIZLLL, i4, c19903812uC);
            c19903812uC.LIZJ = obj;
            return i4;
        }
        throw C19903212u6.LIZLLL();
    }

    public static int LJ(InterfaceC19900112tb<?> interfaceC19900112tb, int i, byte[] bArr, int i2, int i3, InterfaceC19875012pY<?> interfaceC19875012pY, C19903812uC c19903812uC) throws C19903212u6 {
        int iLJFF = LJFF(interfaceC19900112tb, bArr, i2, i3, c19903812uC);
        interfaceC19875012pY.add(c19903812uC.LIZJ);
        while (iLJFF < i3) {
            int iLJIIJJI = LJIIJJI(bArr, iLJFF, c19903812uC);
            if (i != c19903812uC.LIZ) {
                break;
            }
            iLJFF = LJFF(interfaceC19900112tb, bArr, iLJIIJJI, i3, c19903812uC);
            interfaceC19875012pY.add(c19903812uC.LIZJ);
        }
        return iLJFF;
    }
}
