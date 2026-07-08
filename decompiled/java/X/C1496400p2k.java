package X;

import com.bytedance.compression.zstd.Zstd;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.zoin.zstd.ZstdInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0p2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496400p2k {
    public static Map<String, String> LIZLLL;
    public static final C1496400p2k LIZ = new C1496400p2k();
    public static final Keva LIZIZ = Keva.getRepo("zstd_dict_file_repo");
    public static final Map<String, byte[]> LIZJ = new LinkedHashMap();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(52));

    public static void LIZIZ() {
        long[] funAddressesBySymbols = Zstd.getFunAddressesBySymbols(new String[]{"ZSTD_createDCtx", "ZSTD_decompressStream", "ZSTD_freeDCtx", "ZSTD_isError", "ZSTD_createDDict", "ZSTD_DCtx_refDDict", "ZSTD_freeDDict", "ZSTD_DCtx_reset"});
        if (funAddressesBySymbols != null && funAddressesBySymbols.length == 8) {
            long j = funAddressesBySymbols[0];
            if (j != 0) {
                long j2 = funAddressesBySymbols[1];
                if (j2 != 0) {
                    long j3 = funAddressesBySymbols[2];
                    if (j3 != 0) {
                        long j4 = funAddressesBySymbols[3];
                        if (j4 != 0) {
                            long j5 = funAddressesBySymbols[4];
                            if (j5 != 0) {
                                long j6 = funAddressesBySymbols[5];
                                if (j6 != 0) {
                                    long j7 = funAddressesBySymbols[6];
                                    if (j7 != 0) {
                                        long j8 = funAddressesBySymbols[7];
                                        if (j8 != 0) {
                                            try {
                                                TTNetInit.setZstdFuncAddr(j, j2, j3, j4, j5, j6, j7, j8);
                                                int i = C0XM3.LIZ;
                                                return;
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                int i2 = C0XM3.LIZ;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i3 = C0XM3.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LIZJ(X.C0VSP r7) throws java.lang.Throwable {
        /*
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r6]
            r4 = 0
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L3c
            r3.<init>()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L3c
        La:
            r2 = 0
            int r1 = r7.read(r5, r2, r6)     // Catch: java.lang.Throwable -> L21
            r0 = -1
            if (r1 == r0) goto L16
            r3.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L21
            goto La
        L16:
            byte[] r0 = r3.toByteArray()     // Catch: java.lang.Throwable -> L21
            X.C2107108Nh.LIZ(r3, r4)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L3c
            r7.close()
            return r0
        L21:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L28
            throw r1     // Catch: java.lang.Throwable -> L26
        L26:
            r0 = move-exception
            goto L2a
        L28:
            r0 = move-exception
            r1 = r4
        L2a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L2a
        L30:
            X.C2107108Nh.LIZ(r3, r1)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L3c
            throw r0     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L3c
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3c
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r1 = move-exception
            r4 = r0
            goto L3d
        L3c:
            r1 = move-exception
        L3d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L46
            r7.close()
            throw r1
        L46:
            r7.close()     // Catch: java.io.IOException -> L4a
            throw r1
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C13SZ.LIZ(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496400p2k.LIZJ(X.0VSP):byte[]");
    }

    public static ZstdInputStream LIZ(InputStream inputStream, String str) {
        byte[] bArrLIZJ;
        ZstdInputStream zstdInputStream = new ZstdInputStream(inputStream);
        if (str != null) {
            synchronized (LIZ) {
                Map<String, byte[]> map = LIZJ;
                bArrLIZJ = (byte[]) ((LinkedHashMap) map).get(str);
                if (bArrLIZJ == null) {
                    C0VSJ c0vsj = new C0VSJ(LIZIZ.getString(str, ""));
                    if (c0vsj.exists()) {
                        bArrLIZJ = LIZJ(new C0VSP(c0vsj));
                        map.put(str, bArrLIZJ);
                    }
                }
            }
            zstdInputStream.setDict(bArrLIZJ);
        }
        return zstdInputStream;
    }
}
