package X;

import android.os.Environment;
import android.os.StatFs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20012413Ry {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(2));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1));

    public static long LJII() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEhEpEd/bVhkkQxSBZa5jOkRIoaR7De98s+W04MPKSiYYZwwkQg==", null)) * C2204961BRm.LLFF(statFs, new C0WZX("dzBzEhEpEd/bVhkkQxSBZa5jOkRIoaR7De98s+W04MPKSiYYZwwkQg==", null));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    public static String LIZ(String str) {
        if (str == null) {
            return null;
        }
        String str2 = C13SB.LIZ;
        if (u.LJIIZILJ(str, str2, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C13LN.LJLL(1, str));
            sbLIZ.append("_tmp");
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("_tmp");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static boolean LJ(C13M9 c13m9) {
        if (c13m9 == null) {
            return false;
        }
        boolean zLJIILLIIL = C13SB.LJIILLIIL(c13m9);
        if (!zLJIILLIIL && C13SB.LIZLLL(c13m9)) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove file: ");
            sbLIZ.append(c13m9.LIZ);
            sbLIZ.append(" failed!");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("FileUtils", strLIZIZ, null);
            String str = c13m9.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c13m9.LIZ);
            sbLIZ2.append("_dirty");
            LJIIL(str, C2188811AlT.LIZIZ(sbLIZ2), true);
        }
        return zLJIILLIIL;
    }

    public static boolean LJFF(String str) {
        if (str == null) {
            return false;
        }
        boolean zLJIIZILJ = C13SB.LJIIZILJ(str);
        if (!zLJIIZILJ && C13SB.LJ(str)) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove file: ");
            sbLIZ.append(str);
            sbLIZ.append(" failed!");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("FileUtils", strLIZIZ, null);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_dirty");
            LJIIL(str, C2188811AlT.LIZIZ(sbLIZ2), true);
        }
        return zLJIIZILJ;
    }

    public static String LJI(String str) {
        byte[] bArr = new byte[4];
        if (C13SB.LJIIL(str).LIZIZ(bArr, 4) < 4) {
            return "unknown";
        }
        byte b = bArr[0];
        if (b == 40) {
            if (bArr[1] != -75 || bArr[2] != 47 || bArr[3] != -3) {
                return "unknown";
            }
            return "zstd";
        }
        if (b != 80 || bArr[1] != 75 || bArr[2] != 3 || bArr[3] != 4) {
            return "unknown";
        }
        return "zip";
    }

    public static String LJIIIIZZ(String str) throws IOException {
        C20008813Qo c20008813QoLJIIL = C13SB.LJIIL(str);
        C13S2 c13s2 = new C13S2();
        byte[] bArr = new byte[1024];
        for (int iLIZIZ = c20008813QoLJIIL.LIZIZ(bArr, 1024); iLIZIZ > 0; iLIZIZ = c20008813QoLJIIL.LIZIZ(bArr, 1024)) {
            c13s2.LJFF(bArr, iLIZIZ);
        }
        byte[] bArrLJ = c13s2.LJ();
        c20008813QoLJIIL.close();
        return C0XRT.LIZ(bArrLJ);
    }

    public static String LJIIIZ(String str) {
        int iLJJJJI;
        if (str == null || (iLJJJJI = a0.LJJJJI(str, C13SB.LIZ, 0, 6)) < 0) {
            return null;
        }
        return str.substring(iLJJJJI + 1, str.length());
    }

    public static long LJIIJ(String str) {
        long jLongValue;
        if (str == null) {
            return 0L;
        }
        C20012513Rz c20012513RzLIZ = C13SB.LIZ(new C0VSJ(str));
        if (c20012513RzLIZ.LJ == EnumC1287920jcU.Directory) {
            List<C20012513Rz> listLJIILL = C13SB.LJIILL(str);
            if (listLJIILL == null) {
                return 0L;
            }
            long j = 0;
            for (C20012513Rz c20012513Rz : listLJIILL) {
                if (c20012513Rz.LJ == EnumC1287920jcU.Directory) {
                    jLongValue = LJIIJ(c20012513Rz.LIZIZ.LIZ);
                } else {
                    Long l = c20012513Rz.LIZLLL;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                }
                j += jLongValue;
            }
            return j;
        }
        Long l2 = c20012513RzLIZ.LIZLLL;
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue();
    }

    public static String LJIIJJI(String str) {
        int iLJJJJI;
        if (str == null || (iLJJJJI = a0.LJJJJI(str, C13SB.LIZ, 0, 6)) < 0) {
            return null;
        }
        return str.substring(0, iLJJJJI);
    }

    public static void LJIILIIL(String str, C20008813Qo c20008813Qo) {
        LIZIZ(c20008813Qo, C13SB.LJIILJJIL(str, false), 0L, null);
    }

    public static boolean LJIIL(String str, String str2, boolean z) {
        if (str == null) {
            return false;
        }
        if (C13SB.LJ(str2)) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rename warning: dest path exists before rename, originPath=");
            sbLIZ.append(str);
            sbLIZ.append(", destPath=");
            sbLIZ.append(str2);
            sbLIZ.append(", deleteAfterRename=");
            sbLIZ.append(z);
            sbLIZ.append(", caller=");
            sbLIZ.append(C20519082b.LIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LJ("FileUtils", strLIZIZ);
        }
        if (!new C0VSJ(str).getAbsoluteFile().renameTo(new C0VSJ(str2).getAbsoluteFile())) {
            if (!z) {
                return false;
            }
            return C13SB.LJIJ(new C13M9(str), new C13M9(str2));
        }
        return true;
    }

    public static long LIZIZ(C20008813Qo c20008813Qo, C13SD c13sd, long j, Function2 function2) {
        byte[] bArr = new byte[8192];
        int iLIZIZ = c20008813Qo.LIZIZ(bArr, 8192);
        long j2 = 0;
        while (iLIZIZ > 0) {
            c13sd.LIZIZ(bArr, iLIZIZ);
            j2 += (long) iLIZIZ;
            if (j2 < j && j > 0 && function2 != null) {
                function2.invoke(Integer.valueOf((int) ((j2 / j) * 100)), Long.valueOf(j));
            }
            iLIZIZ = c20008813Qo.LIZIZ(bArr, 8192);
        }
        if (function2 != null) {
            function2.invoke(100, Long.valueOf(j));
        }
        c13sd.LIZ();
        c13sd.close();
        return j2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:40:0x0099
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZJ(X.C20008813Qo r16, X.C13SD r17, long r18, kotlin.jvm.functions.Function2 r20) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20012413Ry.LIZJ(X.13Qo, X.13SD, long, kotlin.jvm.functions.Function2):java.lang.String");
    }

    public static final void LIZLLL(byte[] bArr, MessageDigest messageDigest, long j, C238400w2 c238400w2, C118300cf c118300cf, Function2<? super Integer, ? super Long, Unit> function2, C13SD c13sd, int i) throws IOException {
        c13sd.LIZIZ(bArr, i);
        messageDigest.update(bArr, 0, i);
        if (j > 0) {
            long j2 = c238400w2.element + ((long) i);
            c238400w2.element = j2;
            int i2 = 100;
            int i3 = (int) ((j2 * ((long) 100)) / j);
            if (((Boolean) LIZIZ.getValue()).booleanValue()) {
                if (i3 - c118300cf.element < 10) {
                    return;
                }
            } else if (i3 == c118300cf.element) {
                return;
            }
            c118300cf.element = i3;
            if (function2 != null) {
                if (i3 <= 100) {
                    i2 = i3;
                }
                function2.invoke(Integer.valueOf(i2), Long.valueOf(j));
            }
        }
    }
}
