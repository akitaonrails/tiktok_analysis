package X;

import android.os.Looper;
import android.util.Base64;
import com.bytedance.minizip.MiniZip;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.internal.AwS35S2000000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13SB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13SB {
    public static final String LIZ = File.separator;

    public static C20012513Rz LIZ(File file) {
        EnumC1287920jcU enumC1287920jcU;
        if (file.isDirectory()) {
            enumC1287920jcU = EnumC1287920jcU.Directory;
        } else if (file.isFile()) {
            enumC1287920jcU = EnumC1287920jcU.Regular;
        } else {
            enumC1287920jcU = EnumC1287920jcU.Unknown;
        }
        String name = file.getName();
        C13M9 c13m9 = new C13M9(file.getAbsolutePath());
        new C13M9(file.getCanonicalPath());
        return new C20012513Rz(name, c13m9, Double.valueOf(file.lastModified()), Long.valueOf(file.length()), enumC1287920jcU);
    }

    public static void LIZIZ(C13SE c13se) {
        try {
            c13se.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZLLL(C13M9 c13m9) {
        String str;
        if (c13m9 == null || (str = c13m9.LIZ) == null) {
            return false;
        }
        return LJ(str);
    }

    public static boolean LJ(String str) {
        if (str == null) {
            return false;
        }
        return new C0VSJ(str).getAbsoluteFile().exists();
    }

    public static C20012513Rz LJFF(C13M9 c13m9) {
        String str;
        if (c13m9 == null || (str = c13m9.LIZ) == null) {
            return null;
        }
        return LIZ(new C0VSJ(str));
    }

    public static String LJI(String str) {
        if (str == null) {
            return null;
        }
        return new C0VSJ(str).getName();
    }

    public static List LJII(String str) {
        File absoluteFile;
        Object objValueOf;
        if (str == null || (absoluteFile = new C0VSJ(str).getAbsoluteFile()) == null || !absoluteFile.exists()) {
            return null;
        }
        if (!absoluteFile.isDirectory()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = absoluteFile.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList2 = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    if (!a0.LJJIIZI(file.getName(), "__MACOSX", false)) {
                        List listLJII = LJII(file.getAbsolutePath());
                        if (listLJII != null) {
                            objValueOf = Boolean.valueOf(arrayList.addAll(listLJII));
                        } else {
                            objValueOf = null;
                        }
                    } else {
                        objValueOf = Unit.LIZ;
                    }
                } else {
                    objValueOf = Boolean.valueOf(arrayList.add(file.getAbsolutePath()));
                }
                arrayList2.add(objValueOf);
            }
        }
        return arrayList;
    }

    public static String LJIIIIZZ(String str) {
        int iLJJJJI;
        if (str == null || (iLJJJJI = a0.LJJJJI(str, LIZ, 0, 6)) < 0) {
            return null;
        }
        return str.substring(iLJJJJI + 1, str.length());
    }

    public static String LJIIIZ(C20008813Qo c20008813Qo) throws Throwable {
        Charset charset;
        EnumC20009313Qt enumC20009313Qt = EnumC20009313Qt.Utf8;
        InputStream inputStreamLIZ = c20008813Qo.LIZ();
        if (C20009413Qu.LIZ[enumC20009313Qt.ordinal()] == 1) {
            charset = Charsets.LIZIZ;
        } else {
            charset = Charsets.UTF_8;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStreamLIZ, charset.name());
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            for (int i = inputStreamReader.read(cArr); i != -1; i = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, i);
            }
            String string = stringWriter.toString();
            C2107108Nh.LIZ(inputStreamReader, null);
            return string;
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(inputStreamReader, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static void LJIIJ(String str) {
        new C0VSJ(str).getAbsoluteFile().mkdirs();
    }

    public static C20008813Qo LJIIJJI(C13M9 c13m9) {
        String str;
        if (c13m9 == null || (str = c13m9.LIZ) == null) {
            return null;
        }
        return LJIIL(str);
    }

    public static C20008813Qo LJIIL(String str) {
        C0VSP c0vsp = new C0VSP(new C0VSJ(str).getAbsoluteFile());
        C20008813Qo c20008813Qo = new C20008813Qo();
        c20008813Qo.LIZ = c0vsp;
        return c20008813Qo;
    }

    public static List LJIILL(String str) {
        File[] fileArrListFiles = new C0VSJ(str).getAbsoluteFile().listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(LIZ(file));
            }
            return arrayList;
        }
        return null;
    }

    public static boolean LJIILLIIL(C13M9 c13m9) {
        String str;
        if (c13m9 != null && (str = c13m9.LIZ) != null) {
            return LJIIZILJ(str);
        }
        return false;
    }

    public static boolean LJIIZILJ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && C08QA.LJIIZILJ(c0vsj.getAbsoluteFile())) {
            return true;
        }
        return false;
    }

    public static String LJIJI(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String strLJJI = u.LJJI(str, '\\', '/', false);
        if (u.LJJIIJZLJL(strLJJI, "/", false) || u.LJJIIJZLJL(strLJJI, "../", false) || a0.LJJIIZI(strLJJI, ":/", false)) {
            return null;
        }
        Iterator it2 = a0.LJJLIIIJ(strLJJI, new char[]{'/'}, false, 0, 6).iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), "..")) {
                return null;
            }
        }
        return strLJJI;
    }

    public static C13SD LJIILIIL(C13M9 c13m9, boolean z) {
        String str;
        if (c13m9 == null || (str = c13m9.LIZ) == null) {
            return null;
        }
        return LJIILJJIL(str, z);
    }

    public static C13SD LJIILJJIL(String str, boolean z) {
        C0VSV c0vsv = new C0VSV(new C0VSJ(str).getAbsoluteFile(), z);
        C13SD c13sd = new C13SD();
        c13sd.LIZ = c0vsv;
        return c13sd;
    }

    public static boolean LJIJ(C13M9 c13m9, C13M9 c13m92) {
        if (c13m9 == null || c13m92 == null) {
            return false;
        }
        if (LIZLLL(c13m92)) {
            LJIILLIIL(c13m92);
        }
        C0VSJ c0vsj = new C0VSJ(c13m9.LIZ);
        C0VSJ c0vsj2 = new C0VSJ(c13m92.LIZ);
        if (!c0vsj.exists()) {
            return false;
        }
        return c0vsj.renameTo(c0vsj2);
    }

    public static boolean LJIJJ(String str, String str2) {
        return LJJ(str, str2, new AwS35S2000000_30(str, str2, 1));
    }

    public static boolean LJIJJLI(String str, String str2) throws C2225308nj {
        try {
            LJJI(str, str2);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String strLJIIIIZZ = LJIIIIZZ(str);
            if (strLJIIIIZZ != null) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Unzip][B][File: ");
                sbLIZ.append(strLJIIIIZZ);
                sbLIZ.append("][");
                sbLIZ.append(C08KG.LIZIZ(e));
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("JKL", strLIZIZ, null);
            }
            try {
                return LJJ(str, str2, null);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                String message = e2.getMessage();
                if (message == null) {
                    message = "Unzip Failed";
                }
                throw new C2225308nj(message);
            }
        }
    }

    public static void LJIL(String str, String str2) throws C2225308nj {
        if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
            C0VSJ c0vsj = new C0VSJ(str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_tmp");
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj2.exists()) {
                C08QA.LJIIZILJ(c0vsj2);
            }
            if (!c0vsj2.mkdirs() && !c0vsj2.isDirectory()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to create tmp dir: ");
                sbLIZ2.append(c0vsj2.getAbsolutePath());
                throw new C2225308nj(C2188811AlT.LIZIZ(sbLIZ2));
            }
            try {
                LJJIFFI(c0vsj2, str);
                if (c0vsj.exists()) {
                    C08QA.LJIIZILJ(c0vsj);
                }
                if (c0vsj2.renameTo(c0vsj)) {
                    return;
                }
                C08QA.LJIILL(c0vsj2, c0vsj, true, 4);
                C08QA.LJIIZILJ(c0vsj2);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08QA.LJIIZILJ(c0vsj2);
                throw th;
            }
        }
        "unzip3 must not run on main thread".toString();
        throw new IllegalStateException("unzip3 must not run on main thread");
    }

    public static void LJJI(String str, String str2) throws C2225308nj, IOException {
        String strLJIIIIZZ = LJIIIIZZ(str);
        if (strLJIIIIZZ != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Unzip][B][File: ");
            sbLIZ.append(strLJIIIIZZ);
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("JKL", strLIZIZ);
        }
        C09NU c09nu = new C09NU(str);
        C0VSJ c0vsj = new C0VSJ(str2);
        if (c0vsj.exists()) {
            LJIIZILJ(c0vsj.getAbsolutePath());
        }
        String canonicalPath = c0vsj.getCanonicalPath();
        Enumeration<? extends ZipEntry> enumerationEntries = c09nu.entries();
        byte[] bArr = new byte[8192];
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, zipEntryNextElement.getName());
            String name = zipEntryNextElement.getName();
            if (name != null && !a0.LJJIIZI(name, "../", false)) {
                if (u.LJJIIJZLJL(c0vsj2.getCanonicalPath(), canonicalPath, false)) {
                    if (zipEntryNextElement.isDirectory()) {
                        c0vsj2.mkdirs();
                    } else {
                        if (c0vsj2.getParentFile() != null && !c0vsj2.getParentFile().exists()) {
                            c0vsj2.getParentFile().mkdirs();
                        }
                        InputStream inputStream = c09nu.getInputStream(zipEntryNextElement);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj2));
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr, 0, i);
                            }
                        }
                        inputStream.close();
                        bufferedOutputStream.close();
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Entry is outside of the target dir: ");
                    sbLIZ2.append(zipEntryNextElement.getName());
                    throw new C2225308nj(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        if (strLJIIIIZZ != null) {
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[Unzip][B][End][File: ");
            sbLIZ3.append(strLJIIIIZZ);
            sbLIZ3.append("][Suc]");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c13ss2.getClass();
            C13SS.LIZ("JKL", strLIZIZ2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:59:0x00a7
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJJIFFI(X.C0VSJ r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SB.LJJIFFI(X.0VSJ, java.lang.String):void");
    }

    public static boolean LJJII(String str, String str2) {
        String strLJIIIIZZ = LJIIIIZZ(str);
        if (strLJIIIIZZ != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Unzip][B][File: ");
            sbLIZ.append(strLJIIIIZZ);
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("JKL", strLIZIZ);
        }
        C0VSJ c0vsj = new C0VSJ(str2);
        if (c0vsj.exists()) {
            LJIIZILJ(c0vsj.getAbsolutePath());
        }
        return MiniZip.LIZ(str, c0vsj.getAbsolutePath());
    }

    public static long LJJIII(String str, String str2) throws Throwable {
        EnumC20009313Qt enumC20009313Qt = EnumC20009313Qt.Utf8;
        File absoluteFile = new C0VSJ(str).getAbsoluteFile();
        if (!absoluteFile.exists()) {
            absoluteFile.createNewFile();
        }
        if (enumC20009313Qt == EnumC20009313Qt.Base64) {
            str2 = Base64.encodeToString(str2.getBytes(Charsets.UTF_8), 0);
        } else if (C20009413Qu.LIZ[enumC20009313Qt.ordinal()] == 1) {
            str2 = new String(str2.getBytes(Charsets.UTF_8), Charsets.LIZIZ);
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new C0VSV(absoluteFile, false));
            try {
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                C2107108Nh.LIZ(outputStreamWriter, null);
                return str2.length();
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(outputStreamWriter, th);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(outputStreamWriter, th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.io.File r6, java.io.File r7, X.C13MY r8) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13SB.LIZJ(java.io.File, java.io.File, X.13MY):java.lang.String");
    }

    public static boolean LJJ(String str, String str2, AwS35S2000000_30 awS35S2000000_30) throws Throwable {
        String canonicalPath;
        ZipInputStream zipInputStream;
        String strLJIIIIZZ = LJIIIIZZ(str);
        if (strLJIIIIZZ != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Unzip][A][Start][File: ");
            sbLIZ.append(strLJIIIIZZ);
            sbLIZ.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("JKL", strLIZIZ);
        }
        C0VSJ c0vsj = new C0VSJ(str2);
        if (c0vsj.exists()) {
            LJIIZILJ(c0vsj.getAbsolutePath());
        }
        boolean z = false;
        ZipInputStream zipInputStream2 = null;
        try {
            try {
                canonicalPath = c0vsj.getCanonicalPath();
                zipInputStream = new ZipInputStream(new BufferedInputStream(new C0VSP(str)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (a0.LJJIIZI(name, "../", false)) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    C0VSJ c0vsj2 = new C0VSJ(c0vsj, name);
                    if (u.LJJIIJZLJL(c0vsj2.getCanonicalPath(), canonicalPath, false)) {
                        if (nextEntry.isDirectory()) {
                            c0vsj2.mkdirs();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            File parentFile = c0vsj2.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                            } else if (c0vsj2.exists()) {
                                c0vsj2.delete();
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj2));
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, i);
                            }
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Entry is outside of the target dir: ");
                        sbLIZ2.append(nextEntry.getName());
                        throw new C2225308nj(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            if (strLJIIIIZZ != null) {
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[Unzip][A][End][File: ");
                sbLIZ3.append(strLJIIIIZZ);
                sbLIZ3.append("][Suc]");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                c13ss2.getClass();
                C13SS.LIZ("JKL", strLIZIZ2);
            }
            try {
                zipInputStream.close();
                return true;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return true;
            }
        } catch (Exception e3) {
            e = e3;
            zipInputStream2 = zipInputStream;
            TryCatchGuardChecker.doCheck(e);
            if (awS35S2000000_30 != null) {
                if (strLJIIIIZZ != null) {
                    try {
                        C13SS c13ss3 = C13SS.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("[Unzip][B][File: ");
                        sbLIZ4.append(strLJIIIIZZ);
                        sbLIZ4.append("][");
                        sbLIZ4.append(C08KG.LIZIZ(e));
                        sbLIZ4.append(']');
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                        c13ss3.getClass();
                        C13SS.LIZIZ("JKL", strLIZIZ3, null);
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        String message = e4.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        throw new C2225308nj(message);
                    }
                }
                awS35S2000000_30.invoke();
                z = true;
            }
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                    return z;
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    return z;
                }
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream2 = zipInputStream;
            TryCatchGuardChecker.doCheck(th);
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                    throw th;
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    throw th;
                }
            }
            throw th;
        }
    }
}
