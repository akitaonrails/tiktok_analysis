package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.13pb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20130113pb {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static long LIZJ(String str) {
        try {
            return (CastLongProtector.parseLong(str, 16) - 31) >> 4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttmd5 decryptNum error, num = ");
            sbLIZ.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static C20130313pd LIZLLL(String str) {
        if (!str.startsWith("ttmd5:")) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        String[] strArrSplit2 = strArrSplit[0].split(":");
        C20130313pd c20130313pd = new C20130313pd();
        int i = CastIntegerProtector.parseInt(strArrSplit2[1]);
        c20130313pd.LIZ = i;
        if (i > 1) {
            return c20130313pd;
        }
        c20130313pd.LIZIZ = CastIntegerProtector.parseInt(strArrSplit2[2]);
        String[] strArrSplit3 = strArrSplit2[3].split("g");
        c20130313pd.LIZJ = (int) LIZJ(strArrSplit3[0]);
        c20130313pd.LIZLLL = LIZJ(strArrSplit3[1]);
        c20130313pd.LJ = strArrSplit[1];
        return c20130313pd;
    }

    public static String LJ(C0VSJ c0vsj) {
        if (c0vsj != null) {
            try {
                if (c0vsj.exists()) {
                    return LIZ(new C20130213pc(c0vsj), 9, 8192L);
                }
                return "";
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00ee: INVOKE (r15 I:X.13pe) INTERFACE call: X.13pe.close():void A[Catch: all -> 0x00f2, MD:():void (m), TRY_ENTER, TRY_LEAVE] (LINE:50331886), block:B:44:0x00ee */
    public static String LIZ(InterfaceC20130413pe interfaceC20130413pe, int i, long j) throws NoSuchAlgorithmException {
        InterfaceC20130413pe interfaceC20130413peClose;
        int i2 = i;
        long j2 = j;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        if (messageDigest == null) {
            return "";
        }
        try {
            long length = interfaceC20130413pe.length();
            if (i2 <= 0 || j2 <= 0 || ((long) i2) * j2 > (8 * length) / 10) {
                j2 = length;
                i2 = 1;
            }
            byte[] bArr = new byte[8192];
            long j3 = 0;
            LJFF(interfaceC20130413pe, messageDigest, bArr, 0L, j2);
            if (i2 > 2) {
                int i3 = i2 - 1;
                long j4 = (length - (((long) i2) * j2)) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    j3 += j2 + j4;
                    LJFF(interfaceC20130413pe, messageDigest, bArr, j3, j2);
                }
            }
            if (i2 > 1) {
                LJFF(interfaceC20130413pe, messageDigest, bArr, length - j2, j2);
            }
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest != null) {
                int length2 = bArrDigest.length * 2;
                char[] cArr = new char[length2];
                int i5 = 0;
                for (byte b : bArrDigest) {
                    int i6 = b & 255;
                    int i7 = i5 + 1;
                    char[] cArr2 = LIZ;
                    cArr[i5] = cArr2[i6 >> 4];
                    i5 = i7 + 1;
                    cArr[i7] = cArr2[i6 & 15];
                }
                String str = new String(cArr, 0, length2);
                if (i2 == 1 && j2 == length) {
                    try {
                        interfaceC20130413pe.close();
                        return str;
                    } catch (Throwable th) {
                        return str;
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ttmd5:1:1:");
                sbLIZ2.append(Long.toHexString((((long) i2) << 4) + 31));
                sbLIZ2.append("g");
                sbLIZ2.append(Long.toHexString((j2 << 4) + 31));
                sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                sbLIZ.append(";");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                try {
                    interfaceC20130413pe.close();
                    return strLIZIZ;
                } catch (Throwable th2) {
                    return strLIZIZ;
                }
            }
            throw new NullPointerException("bytes is null");
        } catch (Throwable th22) {
            try {
                interfaceC20130413peClose.close();
                throw th22;
            } finally {
                TryCatchGuardChecker.doCheck(th22);
            }
        }
    }

    public static int LIZIZ(String str, File file, C20130513pf c20130513pf) {
        int i;
        long j;
        String strLIZ;
        if (str != null && str.length() != 0) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 99;
            }
            if (c20130513pf != null) {
                if (c20130513pf.length() <= 0) {
                    try {
                        c20130513pf.close();
                        return 5;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        return 5;
                    }
                }
                TryCatchGuardChecker.doCheck(th);
                return 99;
            }
            if (file == null || !file.exists()) {
                return 5;
            }
            try {
                C20130313pd c20130313pdLIZLLL = LIZLLL(str);
                if (c20130313pdLIZLLL != null) {
                    if (c20130313pdLIZLLL.LIZ > 1) {
                        return 3;
                    }
                    i = c20130313pdLIZLLL.LIZJ;
                    j = c20130313pdLIZLLL.LIZLLL;
                } else {
                    i = -1;
                    j = -1;
                }
                try {
                    if (c20130513pf != null) {
                        strLIZ = LIZ(c20130513pf, i, j);
                    } else {
                        strLIZ = LIZ(new C20130213pc(file), i, j);
                    }
                    if (strLIZ != null && strLIZ.length() != 0) {
                        if (c20130313pdLIZLLL == null || (c20130313pdLIZLLL.LIZ == 1 && c20130313pdLIZLLL.LIZIZ == 1)) {
                            if (strLIZ.equals(str)) {
                                return 0;
                            }
                        } else if (c20130313pdLIZLLL.LJ != null) {
                            try {
                                C20130313pd c20130313pdLIZLLL2 = LIZLLL(strLIZ);
                                if (c20130313pdLIZLLL2 != null && c20130313pdLIZLLL.LIZJ == c20130313pdLIZLLL2.LIZJ && c20130313pdLIZLLL.LIZLLL == c20130313pdLIZLLL2.LIZLLL && c20130313pdLIZLLL.LJ.equals(c20130313pdLIZLLL2.LJ)) {
                                    return 0;
                                }
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                        }
                        return 1;
                    }
                    return 6;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    return 6;
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                return 4;
            }
        }
        return 2;
    }

    public static void LJFF(InterfaceC20130413pe interfaceC20130413pe, MessageDigest messageDigest, byte[] bArr, long j, long j2) throws IOException {
        interfaceC20130413pe.LIZIZ(j);
        long j3 = 0;
        while (j3 < j2) {
            int iLIZ = interfaceC20130413pe.LIZ(bArr, (int) Math.min(j2 - j3, bArr.length));
            if (iLIZ > 0) {
                messageDigest.update(bArr, 0, iLIZ);
                j3 += (long) iLIZ;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateSample unexpected readCount <= 0, readCount = ");
                sbLIZ.append(iLIZ);
                sbLIZ.append(", readTotalCount = ");
                sbLIZ.append(j3);
                sbLIZ.append(", sampleSize = ");
                sbLIZ.append(j2);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
