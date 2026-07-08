package X;

import Y.ARunnableS0S2110000_13;
import Y.ARunnableS4S2000000_13;
import Y.ARunnableS7S2100000_13;
import android.text.TextUtils;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.jvm.internal.AwS54S0100100_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550600qSA {
    public static final C1550600qSA LIZ = new C1550600qSA();

    static {
        C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    public static final List LIZIZ(C0VSJ c0vsj) {
        Object c098200Yq;
        Object c098200Yq2;
        File[] fileArrListFiles = c0vsj.listFiles(new FileFilter() { // from class: X.0qSD
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (fileArrListFiles == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            try {
                c098200Yq = new C1550640qSE(CastLongProtector.parseLong(name), false);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = null;
                if (u.LJIIZILJ(name, "--compress", false)) {
                    try {
                        c098200Yq2 = new C1550640qSE(CastLongProtector.parseLong((String) ListProtector.get(a0.LJJLIIIJILLIZJL(name, new String[]{"--compress"}, 0, 6), 0)), true);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq = c098200Yq2;
                    }
                    c098200Yq = (C1550640qSE) c098200Yq;
                }
            }
            if (c098200Yq != null) {
                arrayList.add(c098200Yq);
            }
        }
        return arrayList;
    }

    public static final boolean LIZ(String str, String str2) {
        boolean z;
        long jLongValue;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!C1957007lY.LIZ.LJIJI) {
            C1551780qU4.LJIIIZ(str, str2, "ResLoadUtils.checkExist");
        }
        Pair<Long, Boolean> pairLJIIJ = LJIIJ(str, str2, true);
        if (pairLJIIJ == null) {
            pairLJIIJ = new Pair<>(null, Boolean.FALSE);
        }
        Long first = pairLJIIJ.getFirst();
        boolean zBooleanValue = pairLJIIJ.getSecond().booleanValue();
        if (first != null) {
            z = true;
        } else {
            z = false;
        }
        if (zBooleanValue && !C1549140qPo.LIZ().opt_objective.contains("opt_consume") && first != null) {
            first.longValue();
            try {
                C1550730qSN.LIZ.getClass();
                C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str, str2);
                if (c1550720qSMLIZIZ != null) {
                    UpdatePackage updatePackage = new UpdatePackage(c1550720qSMLIZIZ, first.longValue(), str, str2);
                    updatePackage.setDecompressFrom(2);
                    C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                    AFwS263S0000000_23 aFwS263S0000000_23 = AFwS263S0000000_23.get$arr$(58);
                    c1551980qUO.getClass();
                    C1551980qUO.LIZ(updatePackage, aFwS263S0000000_23);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkExist: failed to start async decompression for channel:");
                sbLIZ.append(str2);
                C1553130qWF.LJ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), th);
            }
        }
        C1551330qTL c1551330qTL = C1551330qTL.LIZ;
        if (first != null) {
            jLongValue = first.longValue();
        } else {
            jLongValue = 0;
        }
        EnumC797980VSa enumC797980VSa = EnumC797980VSa.CHECK_EXIST;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1551330qTL.getClass();
        C1551330qTL.LJIIIZ(str, str2, jLongValue, enumC797980VSa, z, jCurrentTimeMillis, zBooleanValue);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkExist returning ");
        sbLIZ2.append(z);
        sbLIZ2.append(" for ak: ");
        sbLIZ2.append(str);
        sbLIZ2.append(", channel: ");
        sbLIZ2.append(str2);
        C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public static final C1550640qSE LJIIJJI(String str, String str2) {
        long jLongValue;
        Pair<Long, Boolean> pairLJIIJ = LJIIJ(str, str2, true);
        if (pairLJIIJ != null) {
            Long first = pairLJIIJ.getFirst();
            if (first != null) {
                jLongValue = first.longValue();
            } else {
                jLongValue = 0;
            }
            return new C1550640qSE(jLongValue, pairLJIIJ.getSecond().booleanValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LJFF(long j, String str, String str2) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getChannelPathWithVersion called for ak: ");
        sbLIZ.append(str);
        sbLIZ.append(", channel: ");
        sbLIZ.append(str2);
        sbLIZ.append(", version: ");
        sbLIZ.append(j);
        C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && j != 0) {
            String strLJ = C1550610qSB.LJ(str2);
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            try {
                C1550730qSN.LIZ.getClass();
                C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str, strLJ);
                if (c1550720qSMLIZIZ != null) {
                    if (CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL) != j) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        c1550720qSMLIZIZ = null;
                    }
                    if (c1550720qSMLIZIZ != null) {
                        if (!c1550720qSMLIZIZ.LIZIZ) {
                            c1550720qSMLIZIZ = null;
                        }
                        if (c1550720qSMLIZIZ != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getChannelPath: version ");
                            sbLIZ2.append(j);
                            sbLIZ2.append(" is compressed for ");
                            sbLIZ2.append(strLJ);
                            sbLIZ2.append(", should decompress it first");
                            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                            C259800zU c259800zU = new C259800zU();
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            try {
                                UpdatePackage updatePackage = new UpdatePackage(c1550720qSMLIZIZ, j, str, strLJ);
                                updatePackage.setDecompressFrom(2);
                                C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                                AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3(c259800zU, (C259800zU<String>) countDownLatch, (CountDownLatch) 26);
                                c1551980qUO.getClass();
                                C1551980qUO.LIZ(updatePackage, awS369S0200000_3);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("getChannelPath: failed to decompress channel:");
                                sbLIZ3.append(strLJ);
                                sbLIZ3.append(", version is ");
                                sbLIZ3.append(j);
                                C1553130qWF.LJ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ3), th);
                                countDownLatch.countDown();
                            }
                            countDownLatch.await();
                            return (String) c259800zU.element;
                        }
                    }
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                String str3 = File.separator;
                sbLIZ4.append(str3);
                sbLIZ4.append(strLJ);
                sbLIZ4.append(str3);
                sbLIZ4.append(j);
                sbLIZ4.append(str3);
                sbLIZ4.append("res");
                C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ4));
                if (c0vsj.exists() && c0vsj.isDirectory()) {
                    String absolutePath = c0vsj.getAbsolutePath();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("getChannelPathWithVersion returning path: ");
                    sbLIZ5.append(absolutePath);
                    sbLIZ5.append(" for ak: ");
                    sbLIZ5.append(str);
                    sbLIZ5.append(", channel: ");
                    sbLIZ5.append(str2);
                    sbLIZ5.append(", version: ");
                    sbLIZ5.append(j);
                    C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ5));
                    return absolutePath;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("getChannelPath: res dir not found for ");
                sbLIZ6.append(strLJ);
                sbLIZ6.append(", version is ");
                sbLIZ6.append(j);
                C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ6));
                return null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1553130qWF.LJ("gecko-debug-tag", "getChannelPath:error:", th2);
                return null;
            }
        }
        return null;
    }

    public static final String LJI(long j, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getChannelPathWithVersionOpt called for ak: ");
        sbLIZ.append(str);
        sbLIZ.append(", channel: ");
        sbLIZ.append(str2);
        sbLIZ.append(", version: ");
        sbLIZ.append(j);
        C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ));
        C1550730qSN c1550730qSN = C1550730qSN.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf = Long.valueOf(j);
        c1550730qSN.getClass();
        C1550730qSN.LJI(str, str2, new AwS54S0100100_23(jCurrentTimeMillis, lValueOf, 1));
        return LJFF(j, str, str2);
    }

    @InterfaceC1294060jmO
    public static final Pair<File, Long> LJII(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getLatestChannelVersionAndPathInnerOnly called for ak: ");
            sbLIZ.append(str);
            sbLIZ.append(", channel: ");
            sbLIZ.append(str2);
            C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ));
            C1550730qSN.LIZ.getClass();
            C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str, str2);
            if (c1550720qSMLIZIZ != null && c1550720qSMLIZIZ.LIZIZ) {
                C1550730qSN.LJI(str, str2, AFwS263S0000000_23.get$arr$(59));
                return new Pair<>(null, Long.valueOf(CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL)));
            }
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                String str3 = File.separator;
                sbLIZ2.append(str3);
                sbLIZ2.append(str2);
                C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ2));
                Pair<Long, Boolean> pairLJIIJ = LJIIJ(str, str2, z);
                if (pairLJIIJ == null) {
                    pairLJIIJ = new Pair<>(null, Boolean.FALSE);
                }
                Long first = pairLJIIJ.getFirst();
                if (!c0vsj.exists() || !c0vsj.isDirectory() || first == null || first.longValue() == 0) {
                    return null;
                }
                C1550730qSN.LJI(str, str2, new AwS602S0100000_23(first, 87));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(first);
                sbLIZ3.append(str3);
                sbLIZ3.append("res");
                return new Pair<>(new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ3)), first);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1553130qWF.LJ("gecko-debug-tag", "innerGetLatestChannelVersion:error:", th);
            }
        }
        return null;
    }

    public static final Pair<Long, Boolean> LJIIJ(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C1550730qSN.LIZ.getClass();
            C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str, str2);
            if (c1550720qSMLIZIZ != null && c1550720qSMLIZIZ.LIZIZ) {
                return new Pair<>(Long.valueOf(CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL)), Boolean.TRUE);
            }
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            if (rootDirectory.exists() && rootDirectory.isDirectory()) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    String str3 = File.separator;
                    sbLIZ.append(str3);
                    sbLIZ.append(str);
                    C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ));
                    if (!c0vsj.exists()) {
                        return null;
                    }
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj.getAbsolutePath(), str2);
                    Long lLIZ = C1550650qSF.LIZ(c0vsj2);
                    if (!c0vsj2.exists() || lLIZ == null || lLIZ.longValue() == 0) {
                        return null;
                    }
                    if (z) {
                        String absolutePath = c0vsj2.getAbsolutePath();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(lLIZ);
                        sbLIZ2.append(str3);
                        sbLIZ2.append("res");
                        if (!new C0VSJ(absolutePath, C2188811AlT.LIZIZ(sbLIZ2)).exists()) {
                            if (c1550720qSMLIZIZ != null && c1550720qSMLIZIZ.LIZIZ) {
                                return new Pair<>(lLIZ, Boolean.TRUE);
                            }
                            try {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Unexpected channel file exit local, delete it, channel:");
                                sbLIZ3.append(str2);
                                sbLIZ3.append(", version:");
                                sbLIZ3.append(lLIZ);
                                C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ3));
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(lLIZ);
                                sbLIZ4.append("--compress");
                                C0X9F.LJ(new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ4)));
                                return null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }
                    }
                    return new Pair<>(lLIZ, Boolean.FALSE);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1553130qWF.LJ("gecko-debug-tag", "innerGetLatestChannelVersion:error:", th);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZJ(String str, Long l, boolean z, String str2) {
        Long first;
        final boolean zBooleanValue;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getChannelPath called for ak: ");
        final String str3 = str;
        sbLIZ.append(str3);
        sbLIZ.append(", channel: ");
        sbLIZ.append(str2);
        C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            return null;
        }
        final String strLJ = C1550610qSB.LJ(str2);
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
        if (!rootDirectory.exists() || !rootDirectory.isDirectory()) {
            return null;
        }
        boolean z3 = C1957007lY.LIZ.LJIJI;
        if (z && !z3) {
            C1551780qU4.LJIIIZ(str3, strLJ, "ResLoadUtils.getChannelPath");
        }
        try {
            Pair<Long, Boolean> pairLJIIJ = LJIIJ(str3, strLJ, true);
            if (pairLJIIJ == null) {
                pairLJIIJ = new Pair<>(null, Boolean.FALSE);
            }
            first = pairLJIIJ.getFirst();
            zBooleanValue = pairLJIIJ.getSecond().booleanValue();
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (first == null) {
                if (z) {
                    if (z3) {
                        C1551500qTc.LIZIZ(new Runnable() { // from class: X.0X9J
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ResLoadUtilsNew@422c.getChannelPath$1");
                                try {
                                    C1551330qTL c1551330qTL = C1551330qTL.LIZ;
                                    String str4 = str3;
                                    String str5 = strLJ;
                                    EnumC797980VSa enumC797980VSa = EnumC797980VSa.GET_PATH;
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    boolean z4 = zBooleanValue;
                                    c1551330qTL.getClass();
                                    C1551330qTL.LJIIIZ(str4, str5, 0L, enumC797980VSa, false, jCurrentTimeMillis, z4);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ResLoadUtilsNew@422c.getChannelPath$1");
                            }
                        });
                        return null;
                    }
                    C1551330qTL c1551330qTL = C1551330qTL.LIZ;
                    EnumC797980VSa enumC797980VSa = EnumC797980VSa.GET_PATH;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c1551330qTL.getClass();
                    C1551330qTL.LJIIIZ(str3, strLJ, 0L, enumC797980VSa, false, jCurrentTimeMillis, zBooleanValue);
                }
                return null;
            }
            if (zBooleanValue) {
                C1550730qSN.LIZ.getClass();
                C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str3, strLJ);
                if (c1550720qSMLIZIZ == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getChannelPath: compressed state found but no access record for ");
                    sbLIZ2.append(strLJ);
                    C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
                    return null;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C259800zU c259800zU = new C259800zU();
                try {
                    try {
                        UpdatePackage updatePackage = new UpdatePackage(c1550720qSMLIZIZ, first.longValue(), str3, strLJ);
                        updatePackage.setDecompressFrom(2);
                        C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                        AwS369S0200000_3 awS369S0200000_3 = new AwS369S0200000_3(c259800zU, (C259800zU<String>) countDownLatch, (CountDownLatch) 25);
                        c1551980qUO.getClass();
                        C1551980qUO.LIZ(updatePackage, awS369S0200000_3);
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("getChannelPath: failed to decompress channel:");
                        sbLIZ3.append(strLJ);
                        C1553130qWF.LJ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ3), th);
                        countDownLatch.countDown();
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                if (l == null) {
                    countDownLatch.await();
                } else {
                    countDownLatch.await(l.longValue(), TimeUnit.MILLISECONDS);
                }
                if (c259800zU.element == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z) {
                    if (!z3) {
                        C1551330qTL c1551330qTL2 = C1551330qTL.LIZ;
                        long jLongValue = first.longValue();
                        EnumC797980VSa enumC797980VSa2 = EnumC797980VSa.GET_PATH;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        c1551330qTL2.getClass();
                        C1551330qTL.LJIIIZ(str3, strLJ, jLongValue, enumC797980VSa2, z2, jCurrentTimeMillis2, true);
                    } else {
                        C1551500qTc.LIZIZ(new ARunnableS0S2110000_13(str3, first, z2, strLJ, 3));
                    }
                }
                return (String) c259800zU.element;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(rootDirectory.getAbsolutePath());
            String str4 = File.separator;
            sbLIZ4.append(str4);
            sbLIZ4.append(str3);
            sbLIZ4.append(str4);
            sbLIZ4.append(strLJ);
            sbLIZ4.append(str4);
            sbLIZ4.append(first);
            sbLIZ4.append(str4);
            sbLIZ4.append("res");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            if (z) {
                if (z3) {
                    C1551500qTc.LIZIZ(new ARunnableS7S2100000_13(first, str3, strLJ, 8));
                } else {
                    C1551330qTL c1551330qTL3 = C1551330qTL.LIZ;
                    long jLongValue2 = first.longValue();
                    EnumC797980VSa enumC797980VSa3 = EnumC797980VSa.GET_PATH;
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    c1551330qTL3.getClass();
                    strLJ = strLJ;
                    str3 = str3;
                    C1551330qTL.LJIIIZ(str3, strLJ, jLongValue2, enumC797980VSa3, true, jCurrentTimeMillis3, false);
                }
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getChannelPath returning path: ");
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append(" for ak: ");
            sbLIZ5.append(str3);
            sbLIZ5.append(", channel: ");
            sbLIZ5.append(strLJ);
            C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ5));
            return strLIZIZ;
        } catch (Throwable th4) {
            th = th4;
            TryCatchGuardChecker.doCheck(th);
            C1553130qWF.LJ("gecko-debug-tag", "getChannelPath:error:", th);
            return null;
        }
    }

    public static final String LIZLLL(String str, Long l, boolean z, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getChannelPathOpt called for ak: ");
        sbLIZ.append(str);
        sbLIZ.append(", channel: ");
        sbLIZ.append(str2);
        C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ));
        C1550730qSN.LJI(str, str2, new C1550620qSC());
        return LIZJ(str, l, z, str2);
    }

    public static final Long LJIIIIZZ(final String str, String str2, boolean z, boolean z2) throws InterruptedException {
        final long jLongValue;
        final String strSubstring = str2;
        CountDownLatch countDownLatch = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strSubstring)) {
            LIZ.getClass();
            if (a0.LJJJ(strSubstring, "/", 0, false, 6) == 0) {
                strSubstring = strSubstring.substring(1);
            }
            if (a0.LJJJJI(strSubstring, "/", 0, 6) == strSubstring.length() - 1) {
                strSubstring = strSubstring.substring(0, a0.LJJJJI(strSubstring, "/", 0, 6));
            }
            boolean z3 = C1957007lY.LIZ.LJIJI;
            if (z2 && !z3) {
                C1551780qU4.LJIIIZ(str, strSubstring, "ResLoadUtils.getLatestChannelVersion");
            }
            C1550730qSN.LIZ.getClass();
            C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(str, strSubstring);
            if (c1550720qSMLIZIZ != null && c1550720qSMLIZIZ.LIZIZ) {
                long j = CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL);
                if (!z) {
                    countDownLatch = new CountDownLatch(1);
                }
                try {
                    UpdatePackage updatePackage = new UpdatePackage(c1550720qSMLIZIZ, j, str, strSubstring);
                    updatePackage.setDecompressFrom(2);
                    C1551980qUO c1551980qUO = C1551980qUO.LIZ;
                    AFwS263S0000000_23 aFwS263S0000000_23 = AFwS263S0000000_23.get$arr$(60);
                    c1551980qUO.getClass();
                    C1551980qUO.LIZ(updatePackage, aFwS263S0000000_23);
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getLatestChannelVersion: failed to start async decompression for channel:");
                    sbLIZ.append(strSubstring);
                    C1553130qWF.LJ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), th);
                }
                if (countDownLatch != null) {
                    countDownLatch.await();
                }
                if (z2) {
                    if (z3) {
                        C1551500qTc.LIZIZ(new ARunnableS7S2100000_13(c1550720qSMLIZIZ, str, strSubstring, 7));
                    } else {
                        C1551330qTL c1551330qTL = C1551330qTL.LIZ;
                        long j2 = CastLongProtector.parseLong(c1550720qSMLIZIZ.LIZLLL);
                        EnumC797980VSa enumC797980VSa = EnumC797980VSa.GET_VERSION;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c1551330qTL.getClass();
                        C1551330qTL.LJIIIZ(str, strSubstring, j2, enumC797980VSa, true, jCurrentTimeMillis, true);
                    }
                }
                return Long.valueOf(j);
            }
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            File rootDirectory = c1551940qUK.LIZLLL.getRootDirectory();
            if (rootDirectory.exists() && rootDirectory.isDirectory()) {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append(str);
                    C0VSJ c0vsj = new C0VSJ(rootDirectory, C2188811AlT.LIZIZ(sbLIZ2));
                    if (!c0vsj.exists()) {
                        return null;
                    }
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, strSubstring);
                    if (!c0vsj2.exists() && z2) {
                        if (z3) {
                            C1551500qTc.LIZIZ(new ARunnableS4S2000000_13(str, strSubstring, 4));
                            return null;
                        }
                        C1551330qTL c1551330qTL2 = C1551330qTL.LIZ;
                        EnumC797980VSa enumC797980VSa2 = EnumC797980VSa.GET_VERSION;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        c1551330qTL2.getClass();
                        C1551330qTL.LJIIIZ(str, strSubstring, 0L, enumC797980VSa2, false, jCurrentTimeMillis2, false);
                        return null;
                    }
                    Long lLIZ = C1550650qSF.LIZ(c0vsj2);
                    if (lLIZ != null) {
                        jLongValue = lLIZ.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    if (z2) {
                        if (z3) {
                            C1551500qTc.LIZIZ(new Runnable() { // from class: X.0X9K
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("ResLoadUtilsNew@422c.getLatestChannelVersionWithDecompress$4");
                                    try {
                                        C1551330qTL c1551330qTL3 = C1551330qTL.LIZ;
                                        String str3 = str;
                                        String str4 = strSubstring;
                                        long j3 = jLongValue;
                                        EnumC797980VSa enumC797980VSa3 = EnumC797980VSa.GET_VERSION;
                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                        c1551330qTL3.getClass();
                                        C1551330qTL.LJIIIZ(str3, str4, j3, enumC797980VSa3, true, jCurrentTimeMillis3, false);
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("ResLoadUtilsNew@422c.getLatestChannelVersionWithDecompress$4");
                                }
                            });
                            return lLIZ;
                        }
                        C1551330qTL c1551330qTL3 = C1551330qTL.LIZ;
                        EnumC797980VSa enumC797980VSa3 = EnumC797980VSa.GET_VERSION;
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        c1551330qTL3.getClass();
                        C1551330qTL.LJIIIZ(str, strSubstring, jLongValue, enumC797980VSa3, true, jCurrentTimeMillis3, false);
                    }
                    return lLIZ;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1553130qWF.LJ("gecko-debug-tag", "getLatestChannelVersion:error:", th2);
                }
            }
        }
        return null;
    }

    public static final Long LJIIIZ(String str, String str2, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLatestChannelVersionWithDecompressOpt called for ak: ");
        sbLIZ.append(str);
        sbLIZ.append(", channel: ");
        sbLIZ.append(str2);
        sbLIZ.append(", async: ");
        sbLIZ.append(z);
        C1553130qWF.LIZ("gecko-debug-tag-res_load_new", C2188811AlT.LIZIZ(sbLIZ));
        C1550730qSN.LJI(str, str2, new C1547720qNW());
        return LJIIIIZZ(str, str2, z, z2);
    }
}
