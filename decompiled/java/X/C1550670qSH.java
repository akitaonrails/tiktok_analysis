package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.compression.zstd.ZstdOutputStream;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.CRC32;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0qSH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550670qSH {
    public static final C1550670qSH LIZ = new C1550670qSH();
    public static final ExecutorService LIZIZ = C786410Ut5.h4();
    public static volatile long LIZJ;
    public static Function0<Boolean> LIZLLL;

    static {
        new BPEAHandler(Looper.getMainLooper());
        LIZLLL = AFwS212S0000000_23.get$arr$(10);
    }

    public static long LIZ(File file) throws Throwable {
        CRC32 crc32 = new CRC32();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(file));
        Throwable th = null;
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i != -1) {
                    crc32.update(bArr, 0, i);
                } else {
                    C2107108Nh.LIZ(bufferedInputStream, null);
                    return crc32.getValue();
                }
            }
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th2;
            } catch (Throwable th4) {
                th = th4;
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(bufferedInputStream, th);
                        throw th;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            }
        }
    }

    public static void LIZJ(C0VSJ c0vsj, C0VSJ c0vsj2, C1550690qSJ c1550690qSJ) throws Throwable {
        if (c0vsj.exists()) {
            File parentFile = c0vsj2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            long length = c0vsj.length();
            ZstdOutputStream zstdOutputStream = new ZstdOutputStream(new BufferedOutputStream(new C0VSV(c0vsj2)), 19);
            Throwable th = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(c0vsj));
                try {
                    byte[] bArr = new byte[8192];
                    long j = 0;
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i != -1) {
                            zstdOutputStream.write(bArr, 0, i);
                            j += (long) i;
                            c1550690qSJ.LIZ((int) ((((long) 100) * j) / length));
                        } else {
                            C2107108Nh.LIZ(bufferedInputStream, null);
                            zstdOutputStream.flush();
                            C2107108Nh.LIZ(zstdOutputStream, null);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(bufferedInputStream, th);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th = null;
                    }
                }
            } catch (Throwable th6) {
                try {
                    TryCatchGuardChecker.doCheck(th6);
                } catch (Throwable th7) {
                    th = th7;
                }
                try {
                    throw th6;
                } catch (Throwable th8) {
                    th = th8;
                    th = th6;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(zstdOutputStream, th);
                    throw th;
                }
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Source file does not exist: ");
            sbLIZ.append(c0vsj);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:49:0x012c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZLLL(java.io.File r14, X.C0VSJ r15, java.lang.String r16, X.C1550680qSI r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1550670qSH.LIZLLL(java.io.File, X.0VSJ, java.lang.String, X.0qSI):void");
    }

    public static final void LIZIZ(String str, String str2, C1550720qSM c1550720qSM, int i, InterfaceC1550700qSK interfaceC1550700qSK) {
        StringBuilder sbLIZ;
        Long lLIZ;
        AtomicInteger atomicIntegerPutIfAbsent;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Processing channel: ");
        sbLIZ2.append(str2);
        C1553130qWF.LIZ("gecko-debug-tag-Compressor", C2188811AlT.LIZIZ(sbLIZ2));
        C1550600qSA c1550600qSA = C1550600qSA.LIZ;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            String strLJ = C1550610qSB.LJ(str2);
            try {
                sbLIZ = C2188811AlT.LIZ();
            } catch (Throwable th) {
                th = th;
            }
            try {
                sbLIZ.append(str);
                String str3 = File.separator;
                sbLIZ.append(str3);
                sbLIZ.append(strLJ);
                C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists() && c0vsj.isDirectory() && (lLIZ = C1550650qSF.LIZ(c0vsj)) != null) {
                    long jLongValue = lLIZ.longValue();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c0vsj.getAbsolutePath());
                    sbLIZ3.append(str3);
                    sbLIZ3.append(jLongValue);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    if (strLIZIZ != null && strLIZIZ.length() != 0) {
                        C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                        if (c0vsj2.exists() && c0vsj2.isDirectory()) {
                            C0VSJ c0vsj3 = new C0VSJ(c0vsj2, "res");
                            if (c0vsj3.exists() && c0vsj3.isDirectory()) {
                                C1550710qSL c1550710qSL = new C1550710qSL(c0vsj3, c0vsj2, str2, interfaceC1550700qSK, str, c1550720qSM, jCurrentTimeMillis, i);
                                C1551360qTO.LIZ.getClass();
                                String strLIZJ = C1551360qTO.LIZJ(str, str2);
                                ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = C1551360qTO.LJIIL;
                                AtomicInteger atomicInteger = concurrentHashMap.get(strLIZJ);
                                if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZJ, (atomicInteger = new AtomicInteger(0)))) != null) {
                                    atomicInteger = atomicIntegerPutIfAbsent;
                                }
                                atomicInteger.incrementAndGet();
                                try {
                                    c1550710qSL.invoke();
                                    AtomicInteger atomicInteger2 = concurrentHashMap.get(strLIZJ);
                                    if (atomicInteger2 != null && atomicInteger2.decrementAndGet() <= 0) {
                                        concurrentHashMap.remove(strLIZJ, atomicInteger2);
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C1551360qTO.LIZ.getClass();
                                    ConcurrentHashMap<String, AtomicInteger> concurrentHashMap2 = C1551360qTO.LJIIL;
                                    AtomicInteger atomicInteger3 = concurrentHashMap2.get(strLIZJ);
                                    if (atomicInteger3 != null && atomicInteger3.decrementAndGet() <= 0) {
                                        concurrentHashMap2.remove(strLIZJ, atomicInteger3);
                                    }
                                    throw th2;
                                }
                            }
                            return;
                        }
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Version directory does not exist for channel: ");
                        sbLIZ4.append(str2);
                        sbLIZ4.append(", maybe version in compressed state");
                        C1553130qWF.LIZLLL("gecko-debug-tag-Compressor", C2188811AlT.LIZIZ(sbLIZ4));
                        C1551780qU4.LJI(str, str2, CastLongProtector.parseLong(c1550720qSM.LIZLLL), false, System.currentTimeMillis() - jCurrentTimeMillis, 0L, 0L, 2, "version dir missing or not directory", i, 96);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                C1553130qWF.LJ("gecko-debug-tag", "getChannelPath:error:", th);
            }
        }
    }
}
