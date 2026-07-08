package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19920112wp {
    public static final AbstractC19920212wq LIZ;

    public static int LIZJ(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int LIZLLL(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static {
        LIZ = (C19917512wP.LJ && C19917512wP.LIZLLL && !C19915512w5.LIZ()) ? new AbstractC19920212wq() { // from class: X.12wn
            @Override // X.AbstractC19920212wq
            public final String LIZ(int i, byte[] bArr, int i2) throws C19926612xs {
                Charset charset = C19922012x8.LIZ;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    return str;
                }
                throw C19926612xs.LIZJ();
            }

            @Override // X.AbstractC19920212wq
            public final String LIZJ(ByteBuffer byteBuffer, int i, int i2) throws C19926612xs {
                byte bLJII;
                byte bLJII2;
                if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                    long jLJIIIZ = C19917512wP.LIZJ.LJIIIZ(C19917512wP.LJI, byteBuffer) + ((long) i);
                    long j = ((long) i2) + jLJIIIZ;
                    char[] cArr = new char[i2];
                    int i3 = 0;
                    while (jLJIIIZ < j && (bLJII2 = C19917512wP.LJII(jLJIIIZ)) >= 0) {
                        jLJIIIZ++;
                        cArr[i3] = (char) bLJII2;
                        i3++;
                    }
                    while (jLJIIIZ < j) {
                        long j2 = jLJIIIZ + 1;
                        byte bLJII3 = C19917512wP.LJII(jLJIIIZ);
                        if (bLJII3 >= 0) {
                            cArr[i3] = (char) bLJII3;
                            i3++;
                            jLJIIIZ = j2;
                            while (jLJIIIZ < j && (bLJII = C19917512wP.LJII(jLJIIIZ)) >= 0) {
                                jLJIIIZ++;
                                cArr[i3] = (char) bLJII;
                                i3++;
                            }
                        } else if (bLJII3 < -32) {
                            if (j2 < j) {
                                jLJIIIZ = j2 + 1;
                                C19920412ws.LIZJ(bLJII3, C19917512wP.LJII(j2), cArr, i3);
                                i3++;
                            } else {
                                throw C19926612xs.LIZJ();
                            }
                        } else if (bLJII3 < -16) {
                            if (j2 < j - 1) {
                                long j3 = j2 + 1;
                                jLJIIIZ = j3 + 1;
                                C19920412ws.LIZIZ(bLJII3, C19917512wP.LJII(j2), C19917512wP.LJII(j3), cArr, i3);
                                i3++;
                            } else {
                                throw C19926612xs.LIZJ();
                            }
                        } else if (j2 < j - 2) {
                            long j4 = j2 + 1;
                            long j5 = j4 + 1;
                            jLJIIIZ = j5 + 1;
                            C19920412ws.LIZ(bLJII3, C19917512wP.LJII(j2), C19917512wP.LJII(j4), C19917512wP.LJII(j5), cArr, i3);
                            i3 = i3 + 1 + 1;
                        } else {
                            throw C19926612xs.LIZJ();
                        }
                    }
                    return new String(cArr, 0, i3);
                }
                throw new ArrayIndexOutOfBoundsException(C786410Ut5.j4("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
            }

            public static int LJFF(int i, long j, byte[] bArr, int i2) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return C19920112wp.LIZLLL(i, C19917512wP.LJIIIIZZ(j, bArr), C19917512wP.LJIIIIZZ(j + 1, bArr));
                        }
                        throw new AssertionError();
                    }
                    return C19920112wp.LIZJ(i, C19917512wP.LJIIIIZZ(j, bArr));
                }
                AbstractC19920212wq abstractC19920212wq = C19920112wp.LIZ;
                if (i > -12) {
                    return -1;
                }
                return i;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
            @Override // X.AbstractC19920212wq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZLLL(java.lang.String r21, int r22, int r23, byte[] r24) {
                /*
                    Method dump skipped, instruction units count: 272
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19919912wn.LIZLLL(java.lang.String, int, int, byte[]):int");
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            
                if (X.C19917512wP.LJIIIIZZ(r4, r23) > (-65)) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
            
                if (X.C19917512wP.LJIIIIZZ(r4, r23) > (-65)) goto L28;
             */
            /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
            @Override // X.AbstractC19920212wq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LJ(int r22, byte[] r23, int r24, int r25) {
                /*
                    Method dump skipped, instruction units count: 405
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19919912wn.LJ(int, byte[], int, int):int");
            }
        } : new AbstractC19920212wq() { // from class: X.12wo
            @Override // X.AbstractC19920212wq
            public final String LIZ(int i, byte[] bArr, int i2) throws C19926612xs {
                byte b;
                if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                    int i3 = i + i2;
                    char[] cArr = new char[i2];
                    int i4 = 0;
                    while (i < i3) {
                        byte b2 = bArr[i];
                        if (b2 < 0) {
                            break;
                        }
                        i++;
                        cArr[i4] = (char) b2;
                        i4++;
                    }
                    while (i < i3) {
                        int i5 = i + 1;
                        byte b3 = bArr[i];
                        if (b3 >= 0) {
                            int i6 = i4 + 1;
                            cArr[i4] = (char) b3;
                            i = i5;
                            while (true) {
                                i4 = i6;
                                if (i >= i3 || (b = bArr[i]) < 0) {
                                    break;
                                }
                                i++;
                                i6++;
                                cArr[i4] = (char) b;
                            }
                        } else if (b3 < -32) {
                            if (i5 < i3) {
                                i = i5 + 1;
                                C19920412ws.LIZJ(b3, bArr[i5], cArr, i4);
                                i4++;
                            } else {
                                throw C19926612xs.LIZJ();
                            }
                        } else if (b3 < -16) {
                            if (i5 < i3 - 1) {
                                int i7 = i5 + 1;
                                i = i7 + 1;
                                C19920412ws.LIZIZ(b3, bArr[i5], bArr[i7], cArr, i4);
                                i4++;
                            } else {
                                throw C19926612xs.LIZJ();
                            }
                        } else if (i5 < i3 - 2) {
                            int i8 = i5 + 1;
                            int i9 = i8 + 1;
                            i = i9 + 1;
                            C19920412ws.LIZ(b3, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                            i4 = i4 + 1 + 1;
                        } else {
                            throw C19926612xs.LIZJ();
                        }
                    }
                    return new String(cArr, 0, i4);
                }
                throw new ArrayIndexOutOfBoundsException(C786410Ut5.j4("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }

            @Override // X.AbstractC19920212wq
            public final String LIZJ(ByteBuffer byteBuffer, int i, int i2) {
                return AbstractC19920212wq.LIZIZ(byteBuffer, i, i2);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
            @Override // X.AbstractC19920212wq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZLLL(java.lang.String r8, int r9, int r10, byte[] r11) {
                /*
                    Method dump skipped, instruction units count: 230
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19920012wo.LIZLLL(java.lang.String, int, int, byte[]):int");
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
            
                if (r17[r10] > (-65)) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
            
                if (r17[r10] > (-65)) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
            
                if (r17[r10] <= (-65)) goto L51;
             */
            @Override // X.AbstractC19920212wq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LJ(int r16, byte[] r17, int r18, int r19) {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19920012wo.LJ(int, byte[], int, int):int");
            }
        };
    }

    public static int LIZIZ(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C19920312wr(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UTF-8 length does not fit in int: ");
        sbLIZ.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LIZ(ByteBuffer byteBuffer, int i, int i2) {
        AbstractC19920212wq abstractC19920212wq = LIZ;
        abstractC19920212wq.getClass();
        if (byteBuffer.hasArray()) {
            return abstractC19920212wq.LIZ(byteBuffer.arrayOffset() + i, byteBuffer.array(), i2);
        }
        if (byteBuffer.isDirect()) {
            return abstractC19920212wq.LIZJ(byteBuffer, i, i2);
        }
        return AbstractC19920212wq.LIZIZ(byteBuffer, i, i2);
    }

    public static int LJ(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return LIZLLL(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return LIZJ(b, bArr[i]);
        }
        if (b > -12) {
            return -1;
        }
        return b;
    }
}
