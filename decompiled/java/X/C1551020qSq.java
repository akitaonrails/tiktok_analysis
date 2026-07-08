package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551020qSq {
    public static void LIZ(File file) {
        ExecutorC1550590qS9.LIZ().execute(new ARunnableS123S0100000_23(file, 194));
    }

    public static boolean LIZJ(String str) {
        try {
            LJFF(str);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete old channel version failed，path：");
            sbLIZ.append(str);
            C2222008nC.LIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th));
            return false;
        }
    }

    public static void LJFF(String str) {
        if (AppSettingsManager.LIZIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append("update.lock");
            C2222208nE c2222208nELIZ = C2222208nE.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (c2222208nELIZ == null) {
                return;
            }
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(str2);
                sbLIZ2.append("select.lock");
                C2222308nF c2222308nFLIZ = C2222308nF.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                try {
                    C0X9F.LJ(new C0VSJ(str));
                    c2222308nFLIZ.LIZIZ();
                    c2222208nELIZ.LIZIZ();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c2222308nFLIZ.LIZIZ();
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c2222208nELIZ.LIZIZ();
                throw th2;
            }
        }
        if (!C0X9L.LJ(str)) {
            return;
        }
        try {
            C0X9F.LJ(new C0VSJ(str));
            C0X9L.LJFF(str);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C0X9L.LJFF(str);
            throw th3;
        }
    }

    public static void LJI(Context context, C1551140qT2 c1551140qT2) {
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        if (c1551940qUK.LIZLLL != null) {
            c1551940qUK.LIZIZ();
            if (c1551940qUK.LIZLLL.getEnv() != GeckoGlobalConfig.ENVType.PROD) {
                String str = c1551140qT2.LIZ.get("X-Gecko-Tt-Env");
                if (TextUtils.isEmpty(str)) {
                    str = c1551140qT2.LIZ.get("x-gecko-tt-env");
                }
                C1551420qTU c1551420qTU = C1551440qTW.LIZ;
                c1551420qTU.LIZIZ(context);
                String string = c1551420qTU.LIZ.getString("gecko_x_tt_env", null);
                if (string != null ? !string.equals(str) : str != null) {
                    C1553130qWF.LIZ("gecko-debug-tag", "gecko combine response header[X-Gecko-Tt-Env] has been changed,delete all local resources");
                    c1551940qUK.LIZIZ();
                    Iterator<File> it2 = c1551940qUK.LIZLLL.getCandidateRootDirectories().iterator();
                    while (it2.hasNext()) {
                        C0X9F.LJ(it2.next());
                    }
                }
                C1551440qTW.LIZ.LIZJ(context, "gecko_x_tt_env", str);
            }
        }
    }

    public static List<File> LJII(File[] fileArr, long j, List<File> list) {
        File parentFile;
        File parentFile2;
        ArrayList<File> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String name = null;
        String name2 = null;
        File file = null;
        long j2 = 0;
        final boolean z = false;
        long j3 = 0;
        for (File file2 : fileArr) {
            String name3 = file2.getName();
            if (name == null && (parentFile = file2.getParentFile()) != null && (parentFile2 = parentFile.getParentFile()) != null) {
                name2 = parentFile.getName();
                name = parentFile2.getName();
            }
            if (name3.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name3.endsWith("--pending-delete")) {
                LIZ(file2);
                ((ArrayList) list).add(file2);
            } else {
                boolean zEndsWith = name3.endsWith("--compress");
                if (zEndsWith) {
                    name3 = name3.substring(0, name3.lastIndexOf("--compress"));
                }
                try {
                    long j4 = CastLongProtector.parseLong(name3);
                    if (j != 0) {
                        if (j4 != j) {
                            arrayList2.add(file2);
                        } else {
                            z = zEndsWith;
                        }
                    } else {
                        long jLastModified = file2.lastModified();
                        if (j2 != 0) {
                            if (jLastModified < j3) {
                                arrayList2.add(file2);
                            } else {
                                try {
                                    arrayList2.add(file);
                                    z = zEndsWith;
                                    file = file2;
                                    j2 = j4;
                                    j3 = jLastModified;
                                } catch (Exception e) {
                                    e = e;
                                    z = zEndsWith;
                                    TryCatchGuardChecker.doCheck(e);
                                    LIZ(file2);
                                    ((ArrayList) list).add(file2);
                                }
                            }
                        } else {
                            z = zEndsWith;
                            file = file2;
                            j2 = j4;
                            j3 = jLastModified;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
        if (name != null) {
            if (j != 0) {
                j2 = j;
            }
            final String strValueOf = String.valueOf(j2);
            C1550730qSN.LIZ.getClass();
            C1550720qSM c1550720qSMLIZIZ = C1550730qSN.LIZIZ(name, name2);
            if (c1550720qSMLIZIZ != null && !c1550720qSMLIZIZ.LIZLLL.equals(strValueOf)) {
                C1550730qSN.LJI(name, name2, new Function1() { // from class: X.0qSo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str = strValueOf;
                        boolean z2 = z;
                        C1550720qSM c1550720qSM = (C1550720qSM) obj;
                        c1550720qSM.LIZLLL = str;
                        c1550720qSM.LIZIZ = z2;
                        return Unit.LIZ;
                    }
                });
            }
        }
        long j5 = 0;
        for (File file3 : arrayList) {
            if (file3.getName().indexOf("--updating") == -1) {
                LIZ(file3);
                ((ArrayList) list).add(file3);
            } else {
                long jLastModified2 = file3.lastModified();
                if (j5 != 0 && j5 <= jLastModified2) {
                    LIZ(file3);
                    ((ArrayList) list).add(file3);
                } else {
                    j5 = jLastModified2;
                }
            }
        }
        return arrayList2;
    }

    public static void LIZIZ(final Long l, final String str, final boolean z, final boolean z2) {
        if (ExecutorC1551030qSr.LLILLJJLI == null) {
            synchronized (ExecutorC1551030qSr.class) {
                try {
                    if (ExecutorC1551030qSr.LLILLJJLI == null) {
                        ExecutorC1551030qSr.LLILLJJLI = new ExecutorC1551030qSr();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        ExecutorC1551030qSr.LLILLJJLI.execute(new Runnable() { // from class: X.08nR
            public final void LIZ() {
                try {
                    Long l2 = l;
                    C1551020qSq.LJ(l2 != null ? l2.longValue() : 0L, str, z, z2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("delete old channel version failed，path：");
                    sbLIZ.append(str);
                    C2222008nC.LIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th2));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ChannelCleanHelper@6fb2.clean$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ChannelCleanHelper@6fb2.clean$1");
            }
        });
    }

    public static int LIZLLL(Long l, String str, boolean z, boolean z2) {
        long jLongValue;
        if (l == null) {
            jLongValue = 0;
        } else {
            try {
                jLongValue = l.longValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete old channel version failed，path：");
                sbLIZ.append(str);
                C2222008nC.LIZ(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), th));
                return 0;
            }
        }
        return LJ(jLongValue, str, z, z2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:81:0x01cf
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static int LJ(long r17, java.lang.String r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551020qSq.LJ(long, java.lang.String, boolean, boolean):int");
    }
}
