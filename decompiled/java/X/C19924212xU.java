package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12xU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19924212xU {
    public static final boolean LIZ;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(byte r2) {
        /*
            r1 = 48
            if (r1 > r2) goto L14
            r0 = 57
            if (r2 > r0) goto La
            int r2 = r2 - r1
            return r2
        La:
            r1 = 97
            if (r1 > r2) goto L14
            r0 = 122(0x7a, float:1.71E-43)
            if (r2 > r0) goto L14
            int r2 = r2 - r1
            goto L16
        L14:
            int r2 = r2 + (-65)
        L16:
            int r0 = r2 + 10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19924212xU.LIZ(byte):int");
    }

    public static boolean LIZIZ(byte b) {
        if (48 > b) {
            return false;
        }
        if (b > 57) {
            return 97 <= b ? b <= 102 : 65 <= b && b <= 70;
        }
        return true;
    }

    static {
        Logger.getLogger(C19924212xU.class.getName());
        LIZ = System.getenv().getOrDefault("SILENT_MARKER_INSERTION_ENABLED", "false").equals("true");
        new Object() { // from class: X.12wd
            {
                C19918712wb c19918712wb = C19918812wc.LIZ;
            }
        };
    }

    public static AbstractC19922812xG LIZLLL(CharSequence charSequence) throws IOException {
        int i;
        int i2;
        int length;
        byte bByteAt;
        byte bByteAt2;
        String str = (String) charSequence;
        str.toString();
        AbstractC19922812xG abstractC19922812xGCopyFromUtf8 = AbstractC19922812xG.copyFromUtf8(str);
        int size = abstractC19922812xGCopyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i3 = 0;
        int i4 = 0;
        while (i3 < abstractC19922812xGCopyFromUtf8.size()) {
            byte bByteAt3 = abstractC19922812xGCopyFromUtf8.byteAt(i3);
            if (bByteAt3 == 92) {
                i3++;
                if (i3 < abstractC19922812xGCopyFromUtf8.size()) {
                    byte bByteAt4 = abstractC19922812xGCopyFromUtf8.byteAt(i3);
                    if (48 <= bByteAt4) {
                        if (bByteAt4 <= 55) {
                            int iLIZ = LIZ(bByteAt4);
                            int i5 = i3 + 1;
                            if (i5 < abstractC19922812xGCopyFromUtf8.size() && 48 <= (bByteAt2 = abstractC19922812xGCopyFromUtf8.byteAt(i5)) && bByteAt2 <= 55) {
                                iLIZ = (iLIZ * 8) + LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i5));
                                i3 = i5;
                            }
                            int i6 = i3 + 1;
                            if (i6 < abstractC19922812xGCopyFromUtf8.size() && 48 <= (bByteAt = abstractC19922812xGCopyFromUtf8.byteAt(i6)) && bByteAt <= 55) {
                                iLIZ = (iLIZ * 8) + LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i6));
                                i3 = i6;
                            }
                            i = i4 + 1;
                            bArr[i4] = (byte) iLIZ;
                        }
                    } else {
                        if (bByteAt4 == 34) {
                            i2 = i4 + 1;
                            bArr[i4] = 34;
                        }
                        i4 = i2;
                        i3++;
                    }
                    if (bByteAt4 != 39) {
                        if (bByteAt4 != 63) {
                            if (bByteAt4 != 85) {
                                if (bByteAt4 != 92) {
                                    if (bByteAt4 != 102) {
                                        if (bByteAt4 != 110) {
                                            if (bByteAt4 != 114) {
                                                if (bByteAt4 != 120) {
                                                    if (bByteAt4 != 97) {
                                                        if (bByteAt4 != 98) {
                                                            switch (bByteAt4) {
                                                                case 116:
                                                                    i2 = i4 + 1;
                                                                    bArr[i4] = 9;
                                                                    break;
                                                                case 117:
                                                                    int i7 = i3 + 1;
                                                                    i3 = i7 + 3;
                                                                    if (i3 < abstractC19922812xGCopyFromUtf8.size() && LIZIZ(abstractC19922812xGCopyFromUtf8.byteAt(i7))) {
                                                                        int i8 = i7 + 1;
                                                                        if (LIZIZ(abstractC19922812xGCopyFromUtf8.byteAt(i8))) {
                                                                            int i9 = i7 + 2;
                                                                            if (LIZIZ(abstractC19922812xGCopyFromUtf8.byteAt(i9)) && LIZIZ(abstractC19922812xGCopyFromUtf8.byteAt(i3))) {
                                                                                char cLIZ = (char) ((LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i7)) << 12) | (LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i8)) << 8) | (LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i9)) << 4) | LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i3)));
                                                                                if (cLIZ >= 55296 && cLIZ <= 57343) {
                                                                                    final String str2 = "Invalid escape sequence: '\\u' refers to a surrogate";
                                                                                    throw new IOException(str2) { // from class: X.12xV
                                                                                        public static final long serialVersionUID = -8164033650142593304L;
                                                                                    };
                                                                                }
                                                                                byte[] bytes = Character.toString(cLIZ).getBytes(C19922012x8.LIZ);
                                                                                System.arraycopy(bytes, 0, bArr, i4, bytes.length);
                                                                                length = bytes.length;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    final String str3 = "Invalid escape sequence: '\\u' with too few hex chars";
                                                                    throw new IOException(str3) { // from class: X.12xV
                                                                        public static final long serialVersionUID = -8164033650142593304L;
                                                                    };
                                                                case 118:
                                                                    i2 = i4 + 1;
                                                                    bArr[i4] = 11;
                                                                    break;
                                                                default:
                                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                    sbLIZ.append("Invalid escape sequence: '\\");
                                                                    sbLIZ.append((char) bByteAt4);
                                                                    sbLIZ.append('\'');
                                                                    final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                                                    throw new IOException(strLIZIZ) { // from class: X.12xV
                                                                        public static final long serialVersionUID = -8164033650142593304L;
                                                                    };
                                                            }
                                                        } else {
                                                            i2 = i4 + 1;
                                                            bArr[i4] = 8;
                                                        }
                                                    } else {
                                                        i2 = i4 + 1;
                                                        bArr[i4] = 7;
                                                    }
                                                } else {
                                                    i3++;
                                                    if (i3 < abstractC19922812xGCopyFromUtf8.size() && LIZIZ(abstractC19922812xGCopyFromUtf8.byteAt(i3))) {
                                                        int iLIZ2 = LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i3));
                                                        int i10 = i3 + 1;
                                                        if (i10 < abstractC19922812xGCopyFromUtf8.size() && LIZIZ(abstractC19922812xGCopyFromUtf8.byteAt(i10))) {
                                                            iLIZ2 = (iLIZ2 * 16) + LIZ(abstractC19922812xGCopyFromUtf8.byteAt(i10));
                                                            i3 = i10;
                                                        }
                                                        i = i4 + 1;
                                                        bArr[i4] = (byte) iLIZ2;
                                                    } else {
                                                        final String str4 = "Invalid escape sequence: '\\x' with no digits";
                                                        throw new IOException(str4) { // from class: X.12xV
                                                            public static final long serialVersionUID = -8164033650142593304L;
                                                        };
                                                    }
                                                }
                                            } else {
                                                i2 = i4 + 1;
                                                bArr[i4] = 13;
                                            }
                                        } else {
                                            i2 = i4 + 1;
                                            bArr[i4] = 10;
                                        }
                                    } else {
                                        i2 = i4 + 1;
                                        bArr[i4] = 12;
                                    }
                                } else {
                                    i2 = i4 + 1;
                                    bArr[i4] = 92;
                                }
                            } else {
                                int i11 = i3 + 1;
                                i3 = i11 + 7;
                                final String str5 = "Invalid escape sequence: '\\U' with too few hex chars";
                                if (i3 < abstractC19922812xGCopyFromUtf8.size()) {
                                    int iLIZ3 = 0;
                                    int i12 = i11;
                                    while (true) {
                                        int i13 = i11 + 8;
                                        if (i12 < i13) {
                                            byte bByteAt5 = abstractC19922812xGCopyFromUtf8.byteAt(i12);
                                            if (LIZIZ(bByteAt5)) {
                                                iLIZ3 = (iLIZ3 << 4) | LIZ(bByteAt5);
                                                i12++;
                                            } else {
                                                throw new IOException(str5) { // from class: X.12xV
                                                    public static final long serialVersionUID = -8164033650142593304L;
                                                };
                                            }
                                        } else if (Character.isValidCodePoint(iLIZ3)) {
                                            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iLIZ3);
                                            if (unicodeBlockOf == null || (!unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) && !unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) && !unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                                byte[] bytes2 = new String(new int[]{iLIZ3}, 0, 1).getBytes(C19922012x8.LIZ);
                                                System.arraycopy(bytes2, 0, bArr, i4, bytes2.length);
                                                length = bytes2.length;
                                            } else {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("Invalid escape sequence: '\\U");
                                                sbLIZ2.append(abstractC19922812xGCopyFromUtf8.substring(i11, i13).toStringUtf8());
                                                sbLIZ2.append("' refers to a surrogate code unit");
                                                final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                                throw new IOException(strLIZIZ2) { // from class: X.12xV
                                                    public static final long serialVersionUID = -8164033650142593304L;
                                                };
                                            }
                                        } else {
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("Invalid escape sequence: '\\U");
                                            sbLIZ3.append(abstractC19922812xGCopyFromUtf8.substring(i11, i13).toStringUtf8());
                                            sbLIZ3.append("' is not a valid code point value");
                                            final String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                            throw new IOException(strLIZIZ3) { // from class: X.12xV
                                                public static final long serialVersionUID = -8164033650142593304L;
                                            };
                                        }
                                    }
                                } else {
                                    throw new IOException(str5) { // from class: X.12xV
                                        public static final long serialVersionUID = -8164033650142593304L;
                                    };
                                }
                            }
                            i4 += length;
                            i3++;
                        } else {
                            i2 = i4 + 1;
                            bArr[i4] = 63;
                        }
                    } else {
                        i2 = i4 + 1;
                        bArr[i4] = 39;
                    }
                    i4 = i2;
                    i3++;
                } else {
                    final String str6 = "Invalid escape sequence: '\\' at end of string.";
                    throw new IOException(str6) { // from class: X.12xV
                        public static final long serialVersionUID = -8164033650142593304L;
                    };
                }
            } else {
                i = i4 + 1;
                bArr[i4] = bByteAt3;
            }
            i4 = i;
            i3++;
        }
        if (size == i4) {
            return new C19922512xD(bArr);
        }
        return AbstractC19922812xG.copyFrom(bArr, 0, i4);
    }

    public static String LJ(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        return BigInteger.valueOf(j & Long.MAX_VALUE).setBit(63).toString();
    }

    public static long LIZJ(String str, boolean z, boolean z2) {
        int i;
        int i2 = 0;
        if (str.startsWith("-", 0)) {
            if (z) {
                i2 = 1;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Number must be positive: ");
                sbLIZ.append(str);
                throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int i3 = i2;
        if (str.startsWith("0x", i2)) {
            i2 += 2;
            i = 16;
        } else if (str.startsWith(CardStruct.IStatusCode.DEFAULT, i2)) {
            i = 8;
        } else {
            i = 10;
        }
        String strSubstring = str.substring(i2);
        if (strSubstring.length() < 16) {
            long j = CastLongProtector.parseLong(strSubstring, i);
            if (i3 != 0) {
                j = -j;
            }
            if (!z2) {
                if (z) {
                    if (j > 2147483647L || j < -2147483648L) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Number out of range for 32-bit signed integer: ");
                        sbLIZ2.append(str);
                        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    if (j < 4294967296L && j >= 0) {
                        return j;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Number out of range for 32-bit unsigned integer: ");
                    sbLIZ3.append(str);
                    throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            return j;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i);
        if (i3 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (!z2) {
            if (z) {
                if (bigInteger.bitLength() > 31) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Number out of range for 32-bit signed integer: ");
                    sbLIZ4.append(str);
                    throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ4));
                }
            } else if (bigInteger.bitLength() > 32) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Number out of range for 32-bit unsigned integer: ");
                sbLIZ5.append(str);
                throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ5));
            }
        } else if (z) {
            if (bigInteger.bitLength() > 63) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Number out of range for 64-bit signed integer: ");
                sbLIZ6.append(str);
                throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ6));
            }
        } else if (bigInteger.bitLength() > 64) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Number out of range for 64-bit unsigned integer: ");
            sbLIZ7.append(str);
            throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ7));
        }
        return bigInteger.longValue();
    }
}
