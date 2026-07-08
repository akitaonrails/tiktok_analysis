package X;

/* JADX INFO: renamed from: X.12vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19910012vC {
    public static int LIZIZ(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long LJIILJJIL(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static int LIZ(byte[] bArr, int i, C19911712vT c19911712vT) throws C19857612mk {
        int iLJII = LJII(bArr, i, c19911712vT);
        int i2 = c19911712vT.LIZ;
        if (i2 >= 0) {
            if (i2 <= bArr.length - iLJII) {
                if (i2 == 0) {
                    c19911712vT.LIZJ = AbstractC19855612mQ.zza;
                    return iLJII;
                }
                c19911712vT.LIZJ = AbstractC19855612mQ.zzk(bArr, iLJII, i2);
                return iLJII + i2;
            }
            throw new C19857612mk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C19857612mk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJFF(byte[] r13, int r14, X.C19911712vT r15) throws X.C19857612mk {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19910012vC.LJFF(byte[], int, X.12vT):int");
    }

    public static int LJII(byte[] bArr, int i, C19911712vT c19911712vT) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c19911712vT.LIZ = b;
            return i2;
        }
        return LJIIIIZZ(b, bArr, i2, c19911712vT);
    }

    public static int LJIIJ(byte[] bArr, int i, C19911712vT c19911712vT) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c19911712vT.LIZIZ = j;
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
        c19911712vT.LIZIZ = j2;
        return i3;
    }

    public static int LJ(byte[] bArr, int i, InterfaceC19911812vU interfaceC19911812vU, C19911712vT c19911712vT) throws C19857612mk {
        C19887712rb c19887712rb = (C19887712rb) interfaceC19911812vU;
        int iLJII = LJII(bArr, i, c19911712vT);
        int i2 = c19911712vT.LIZ + iLJII;
        while (iLJII < i2) {
            iLJII = LJII(bArr, iLJII, c19911712vT);
            c19887712rb.LJ(c19911712vT.LIZ);
        }
        if (iLJII == i2) {
            return iLJII;
        }
        throw new C19857612mk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int LJIIIIZZ(int i, byte[] bArr, int i2, C19911712vT c19911712vT) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c19911712vT.LIZ = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c19911712vT.LIZ = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c19911712vT.LIZ = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c19911712vT.LIZ = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                c19911712vT.LIZ = i11;
                return i12;
            }
        }
    }

    public static int LIZJ(InterfaceC19908112ut interfaceC19908112ut, byte[] bArr, int i, int i2, C19911712vT c19911712vT) throws C19857612mk {
        AbstractC19907912ur abstractC19907912urLJ = interfaceC19908112ut.LJ();
        int iLJIIL = LJIIL(abstractC19907912urLJ, interfaceC19908112ut, bArr, i, i2, c19911712vT);
        interfaceC19908112ut.LJFF(abstractC19907912urLJ);
        c19911712vT.LIZJ = abstractC19907912urLJ;
        return iLJIIL;
    }

    public static int LJIILIIL(int i, byte[] bArr, int i2, int i3, C19911712vT c19911712vT) throws C19857612mk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw new C19857612mk("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = LJII(bArr, i2, c19911712vT);
                            i6 = c19911712vT.LIZ;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = LJIILIIL(i6, bArr, i2, i3, c19911712vT);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw new C19857612mk("Failed to parse the message.");
                    }
                    return LJII(bArr, i2, c19911712vT) + c19911712vT.LIZ;
                }
                return i2 + 8;
            }
            return LJIIJ(bArr, i2, c19911712vT);
        }
        throw new C19857612mk("Protocol message contained an invalid tag (zero).");
    }

    public static int LJI(int i, byte[] bArr, int i2, int i3, C19910312vF c19910312vF, C19911712vT c19911712vT) throws C19857612mk {
        int iLJII = i2;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c19910312vF.LIZJ(i, Integer.valueOf(LIZIZ(iLJII, bArr)));
                                return iLJII + 4;
                            }
                            throw new C19857612mk("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        C19910312vF c19910312vFLIZIZ = C19910312vF.LIZIZ();
                        int i6 = c19911712vT.LJ + 1;
                        c19911712vT.LJ = i6;
                        if (i6 < 100) {
                            int i7 = 0;
                            while (iLJII < i3) {
                                iLJII = LJII(bArr, iLJII, c19911712vT);
                                i7 = c19911712vT.LIZ;
                                if (i7 == i5) {
                                    break;
                                }
                                iLJII = LJI(i7, bArr, iLJII, i3, c19910312vFLIZIZ, c19911712vT);
                            }
                            c19911712vT.LJ--;
                            if (iLJII <= i3 && i7 == i5) {
                                c19910312vF.LIZJ(i, c19910312vFLIZIZ);
                                return iLJII;
                            }
                            throw new C19857612mk("Failed to parse the message.");
                        }
                        throw new C19857612mk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int iLJII2 = LJII(bArr, iLJII, c19911712vT);
                    int i8 = c19911712vT.LIZ;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - iLJII2) {
                            if (i8 == 0) {
                                c19910312vF.LIZJ(i, AbstractC19855612mQ.zza);
                            } else {
                                c19910312vF.LIZJ(i, AbstractC19855612mQ.zzk(bArr, iLJII2, i8));
                            }
                            return iLJII2 + i8;
                        }
                        throw new C19857612mk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new C19857612mk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                c19910312vF.LIZJ(i, Long.valueOf(LJIILJJIL(iLJII, bArr)));
                return iLJII + 8;
            }
            int iLJIIJ = LJIIJ(bArr, iLJII, c19911712vT);
            c19910312vF.LIZJ(i, Long.valueOf(c19911712vT.LIZIZ));
            return iLJIIJ;
        }
        throw new C19857612mk("Protocol message contained an invalid tag (zero).");
    }

    public static int LJIIIZ(int i, byte[] bArr, int i2, int i3, InterfaceC19911812vU interfaceC19911812vU, C19911712vT c19911712vT) {
        C19887712rb c19887712rb = (C19887712rb) interfaceC19911812vU;
        int iLJII = LJII(bArr, i2, c19911712vT);
        c19887712rb.LJ(c19911712vT.LIZ);
        while (iLJII < i3) {
            int iLJII2 = LJII(bArr, iLJII, c19911712vT);
            if (i != c19911712vT.LIZ) {
                break;
            }
            iLJII = LJII(bArr, iLJII2, c19911712vT);
            c19887712rb.LJ(c19911712vT.LIZ);
        }
        return iLJII;
    }

    public static int LJIIL(Object obj, InterfaceC19908112ut interfaceC19908112ut, byte[] bArr, int i, int i2, C19911712vT c19911712vT) throws C19857612mk {
        int iLJIIIIZZ = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iLJIIIIZZ = LJIIIIZZ(i3, bArr, iLJIIIIZZ, c19911712vT);
            i3 = c19911712vT.LIZ;
        }
        if (i3 >= 0 && i3 <= i2 - iLJIIIIZZ) {
            int i4 = c19911712vT.LJ + 1;
            c19911712vT.LJ = i4;
            if (i4 < 100) {
                int i5 = i3 + iLJIIIIZZ;
                interfaceC19908112ut.LJII(obj, bArr, iLJIIIIZZ, i5, c19911712vT);
                c19911712vT.LJ--;
                c19911712vT.LIZJ = obj;
                return i5;
            }
            throw new C19857612mk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new C19857612mk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int LIZLLL(InterfaceC19908112ut interfaceC19908112ut, int i, byte[] bArr, int i2, int i3, InterfaceC19911812vU interfaceC19911812vU, C19911712vT c19911712vT) throws C19857612mk {
        int iLIZJ = LIZJ(interfaceC19908112ut, bArr, i2, i3, c19911712vT);
        interfaceC19911812vU.add(c19911712vT.LIZJ);
        while (iLIZJ < i3) {
            int iLJII = LJII(bArr, iLIZJ, c19911712vT);
            if (i != c19911712vT.LIZ) {
                break;
            }
            iLIZJ = LIZJ(interfaceC19908112ut, bArr, iLJII, i3, c19911712vT);
            interfaceC19911812vU.add(c19911712vT.LIZJ);
        }
        return iLIZJ;
    }

    public static int LJIIJJI(Object obj, InterfaceC19908112ut interfaceC19908112ut, byte[] bArr, int i, int i2, int i3, C19911712vT c19911712vT) throws C19857612mk {
        C19909612v8 c19909612v8 = (C19909612v8) interfaceC19908112ut;
        int i4 = c19911712vT.LJ + 1;
        c19911712vT.LJ = i4;
        if (i4 < 100) {
            int iLJIJJLI = c19909612v8.LJIJJLI(obj, bArr, i, i2, i3, c19911712vT);
            c19911712vT.LJ--;
            c19911712vT.LIZJ = obj;
            return iLJIJJLI;
        }
        throw new C19857612mk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
