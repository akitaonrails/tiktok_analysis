package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: X.12vI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19910612vI {
    public static final /* synthetic */ int LIZ = 0;

    static {
        try {
            if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
                return;
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C19907112uj.LIZLLL) {
            Unsafe unsafe = C19907112uj.LIZ;
        }
    }

    public static int LIZIZ(String str) throws Exception {
        int length = str.length();
        int i = 0;
        final int i2 = 0;
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
                try {
                    final int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 >= 2048) {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) >= 65536) {
                                    i2++;
                                } else {
                                    throw new Exception(i2, length2) { // from class: X.0kP0
                                        /* JADX WARN: Illegal instructions before constructor call */
                                        {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Unpaired surrogate at index ");
                                            sbLIZ.append(i2);
                                            sbLIZ.append(" of ");
                                            sbLIZ.append(length2);
                                            super(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                    };
                                }
                            }
                        } else {
                            i += (127 - cCharAt2) >>> 31;
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (C1318000kP0 e) {
                    TryCatchGuardChecker.doCheck(e);
                    return str.getBytes(C19856312mX.LIZ).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static boolean LIZJ(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 < i2 && b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return false;
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
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
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                            return false;
                        }
                    } else {
                        if (i3 >= i2 - 2) {
                            return false;
                        }
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 > -65 || (((b << 28) + (b3 + 112)) >> 30) != 0) {
                            return false;
                        }
                        int i6 = i5 + 1;
                        if (bArr[i5] > -65) {
                            return false;
                        }
                        i3 = i6 + 1;
                        if (bArr[i6] > -65) {
                            return false;
                        }
                    }
                }
                i = i3;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r9 < 2048) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.String r12, int r13, int r14, byte[] r15) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19910612vI.LIZ(java.lang.String, int, int, byte[]):int");
    }
}
