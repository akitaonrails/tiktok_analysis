package X;

import Y.AComparatorS22S0000000_3;
import Y.ARunnableS72S0200000_3;
import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.refcache.FileLocker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import java.io.File;
import java.io.FileFilter;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.09fH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2427709fH {
    public static volatile boolean LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static C0VSJ LIZLLL;
    public static File LJ;

    public static Set<String> LJIILIIL() throws Throwable {
        ICacheService iCacheServiceCacheConfig;
        File fileY2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        try {
            iCacheServiceCacheConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iCacheServiceCacheConfig = null;
        }
        if (iCacheServiceCacheConfig != null) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_setting_disk_manager", true) == 1) {
                hashSet2.addAll(iCacheServiceCacheConfig.allowList());
            } else {
                hashSet2.addAll(iCacheServiceCacheConfig.draftAllowList());
            }
            hashSet2.addAll(iCacheServiceCacheConfig.tempVideoFile());
            hashSet2.addAll(iCacheServiceCacheConfig.originSoundFile());
            hashSet2.add(iCacheServiceCacheConfig.mvRootDir());
        }
        hashSet.addAll(hashSet2);
        if (LIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.W3().getAbsolutePath());
            sbLIZ.append("/DCIM/Camera/");
            LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        hashSet.add(new C0VSJ(LIZIZ).getAbsolutePath());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ2.append(C786410Ut5.y2(C844470XAv.LIZ(), null));
        sbLIZ2.append("/splashad");
        hashSet.add(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        Context contextLIZ = C844470XAv.LIZ();
        if (Environment.isExternalStorageEmulated() || (fileY2 = C786410Ut5.y2(contextLIZ, null)) == null) {
            fileY2 = C2354709Kn.LIZ(contextLIZ);
        } else {
            C2354709Kn.LJI(fileY2);
        }
        sbLIZ3.append(fileY2.getPath());
        sbLIZ3.append("/LiveWallpaper");
        hashSet.add(C2188811AlT.LIZIZ(sbLIZ3));
        C19881812qe c19881812qe = new C19881812qe(hashSet, new InterfaceC19882712qn<String, String>() { // from class: X.09fK
            @Override // X.InterfaceC19882712qn
            public final String apply(String str) {
                return str.replaceFirst("/data/data/", "/data/user/0/");
            }
        });
        C19881812qe c19881812qe2 = new C19881812qe(hashSet, new InterfaceC19882712qn<String, String>() { // from class: X.09fL
            @Override // X.InterfaceC19882712qn
            public final String apply(String str) {
                return str.replaceFirst("/data/user/0/", "/data/data/");
            }
        });
        HashSet hashSet3 = new HashSet();
        hashSet3.addAll(hashSet);
        hashSet3.addAll(c19881812qe);
        hashSet3.addAll(c19881812qe2);
        return hashSet3;
    }

    public static File LJIILJJIL() {
        C0VSJ c0vsj = LIZLLL;
        if (c0vsj != null) {
            return c0vsj;
        }
        C844470XAv.LIZ.getClass();
        File fileLJII = C2427009fA.LJII(C844470XAv.LIZ(), EnumC2427909fJ.PREFER_SD_CARD);
        if (fileLJII == null) {
            C0VSJ c0vsjLJIILIIL = C2354709Kn.LJIILIIL();
            LIZLLL = c0vsjLJIILIIL;
            return c0vsjLJIILIIL;
        }
        C0VSJ c0vsj2 = new C0VSJ(fileLJII, "picture");
        if (!c0vsj2.exists()) {
            c0vsj2.mkdirs();
        }
        LIZLLL = c0vsj2;
        return c0vsj2;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static void LIZJ(int i) throws Throwable {
        File[] fileArrTempDuetFile;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearDuetFiles ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        File[] fileArrRawDuetFile = null;
        try {
            ICacheService iCacheServiceCacheConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig();
            if (iCacheServiceCacheConfig != null) {
                int i2 = i * 2;
                try {
                    fileArrTempDuetFile = iCacheServiceCacheConfig.tempDuetFile();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    fileArrTempDuetFile = null;
                }
                LJ(LJIL(fileArrTempDuetFile, i2 * 2));
                try {
                    fileArrRawDuetFile = iCacheServiceCacheConfig.rawDuetFile();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                LJFF(LJIL(fileArrRawDuetFile, i));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(List<File> list) {
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("del:");
                    sbLIZ.append(file.getAbsolutePath());
                    C2188811AlT.LIZIZ(sbLIZ);
                    String absolutePath = file.getAbsolutePath();
                    if (FileLocker.LIZ && FileLocker.getStatus(absolutePath) >= 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(file.getAbsolutePath());
                        sbLIZ2.append(" in use");
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    public static void LJFF(List<File> list) throws Throwable {
        if (list != null && list.size() > 0) {
            Set<String> setLJIILIIL = LJIILIIL();
            for (File file : list) {
                if (file != null && file.exists()) {
                    if (!((HashSet) setLJIILIIL).contains(file.getAbsolutePath())) {
                        String absolutePath = file.getAbsolutePath();
                        if (FileLocker.LIZ && FileLocker.getStatus(absolutePath) >= 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(file.getAbsolutePath());
                            sbLIZ.append(" in use");
                            C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            file.delete();
                        }
                    }
                }
            }
        }
    }

    public static File LJI(Context context) {
        File file = LJ;
        if (file != null) {
            return file;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ttk_alog_dir_opt_exp", true, false)) {
            C0VSJ c0vsj = new C0VSJ(LIZ(context), "logs");
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C823050WQl.LIZLLL().execute(new ARunnableS72S0200000_3(context, c0vsj, 14));
            LJ = c0vsj;
        } else {
            LJ = LJJI(context, true);
        }
        return LJ;
    }

    public static long LJII(List<File> list) {
        long length = 0;
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    length += file.length();
                }
            }
        }
        return length;
    }

    public static long LJIIIIZZ(List<File> list) throws Throwable {
        long length = 0;
        if (list != null && list.size() > 0) {
            Set<String> setLJIILIIL = LJIILIIL();
            for (File file : list) {
                if (file != null && file.exists()) {
                    if (!((HashSet) setLJIILIIL).contains(file.getAbsolutePath())) {
                        String absolutePath = file.getAbsolutePath();
                        if (FileLocker.LIZ && FileLocker.getStatus(absolutePath) >= 0) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(file.getAbsolutePath());
                            sbLIZ.append(" in use");
                            C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            length += file.length();
                        }
                    }
                }
            }
        }
        return length;
    }

    public static String LJIILL(Context context) throws Throwable {
        String path;
        if (context == null) {
            return "";
        }
        String str = LIZJ;
        if (str != null && !str.isEmpty()) {
            return LIZJ;
        }
        File fileLJIIIIZZ = C2427009fA.LJIIIIZZ(context, EnumC2427909fJ.PREFER_PRIVATE);
        if (fileLJIIIIZZ != null) {
            path = fileLJIIIIZZ.getPath();
        } else if (C786410Ut5.y2(context, null) == null) {
            path = C786410Ut5.W3().getPath();
        } else {
            path = C786410Ut5.y2(context, null).getPath();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(path);
        sbLIZ.append("/share/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZJ = strLIZIZ;
        return strLIZIZ;
    }

    public static String LJIILLIIL(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIILL(context));
        sbLIZ.append("out");
        sbLIZ.append("/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIZILJ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIILL(context));
        sbLIZ.append("pic");
        sbLIZ.append("/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIJ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIILL(context));
        sbLIZ.append("tmp");
        sbLIZ.append("/");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(int i, Context context) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearDraftsV2 ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        if (context != null) {
            if (LIZ(context) != null) {
                LJFF(LJIIJ(i, LIZ(context)));
            }
            try {
                if (C786410Ut5.y2(context, null) != null) {
                    LJFF(LJIIJ(i, C786410Ut5.y2(context, null)));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZLLL(int i, Context context) {
        try {
            Boolean cleanShareFiles = C0CLW.LIZIZ.LIZ.getCleanShareFiles();
            if (cleanShareFiles != null && cleanShareFiles.booleanValue()) {
                i = 0;
            }
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (context == null) {
            return;
        }
        LJ(LJIJI(i, context));
        C0VSJ c0vsj = new C0VSJ(LJIILL(context));
        C0VSJ c0vsj2 = new C0VSJ(C786410Ut5.y2(context, null), "share");
        if (c0vsj2.exists() && !TextUtils.equals(c0vsj2.getAbsolutePath(), c0vsj.getAbsolutePath())) {
            LJJ(i, c0vsj2);
        }
        File fileLJIIJ = C2427009fA.LJIIJ(context);
        if (fileLJIIJ != null) {
            C0VSJ c0vsj3 = new C0VSJ(fileLJIIJ, "share");
            if (c0vsj3.exists() && !TextUtils.equals(c0vsj3.getAbsolutePath(), c0vsj3.getAbsolutePath())) {
                LJJ(i, c0vsj3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static List LJIIIZ(int i, Context context) {
        ICacheService iCacheServiceCacheConfig;
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (context != null && LIZ(context) != null) {
            arrayList2.addAll(LJIJJ(i, LIZ(context)));
        }
        String strCompatMusDraftDir = null;
        if (context != null) {
            try {
                if (C786410Ut5.y2(context, null) != null) {
                    arrayList2.addAll(LJIJJ(i, C786410Ut5.y2(context, null)));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            iCacheServiceCacheConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            iCacheServiceCacheConfig = null;
        }
        if (iCacheServiceCacheConfig == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            try {
                strCompatMusDraftDir = iCacheServiceCacheConfig.compatMusDraftDir();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (strCompatMusDraftDir != null) {
                C0VSJ c0vsj = new C0VSJ(strCompatMusDraftDir);
                if (c0vsj.exists()) {
                    ArrayList arrayList3 = new ArrayList();
                    LJIIJJI(c0vsj, arrayList3);
                    arrayList.addAll(arrayList3);
                }
            }
        }
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static List LJIIJ(int i, File file) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append(File.separator);
        sbLIZ.append("cache");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles(new FileFilter() { // from class: X.09fM
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                if (file2 != null && file2.getName().endsWith("-concat-v")) {
                    return true;
                }
                return false;
            }
        })) != null && fileArrListFiles.length > 0) {
            arrayList.addAll(LJIL(fileArrListFiles, i));
        }
        return arrayList;
    }

    public static void LJIIJJI(File file, List<File> list) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            ((ArrayList) list).add(file);
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            LJIIJJI(file2, list);
        }
    }

    public static List LJIIL(int i, Context context) throws Throwable {
        File fileLIZ;
        File fileLIZ2;
        C0VSJ c0vsj = null;
        if (context != null && (fileLIZ2 = LIZ(context)) != null && fileLIZ2.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(fileLIZ2.getAbsolutePath());
            sbLIZ.append(File.separator);
            sbLIZ.append("music/download");
            c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        ArrayList arrayList = new ArrayList();
        if (c0vsj != null && c0vsj.exists()) {
            arrayList.addAll(LJIJJLI(i, c0vsj));
        }
        if (context != null && (fileLIZ = LIZ(context)) != null && fileLIZ.exists()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(fileLIZ.getAbsolutePath());
            sbLIZ2.append(File.separator);
            sbLIZ2.append("music/rhythm");
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
            if (c0vsj2.exists()) {
                arrayList.addAll(LJIJJLI(i, c0vsj2));
            }
        }
        Set<String> setLJIILIIL = LJIILIIL();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            File file = (File) it2.next();
            if (file != null && file.exists()) {
                if (((HashSet) setLJIILIIL).contains(file.getAbsolutePath())) {
                }
            }
            it2.remove();
        }
        return arrayList;
    }

    public static List LJIJI(int i, Context context) {
        ArrayList arrayList = new ArrayList();
        C0VSJ c0vsj = new C0VSJ(LJIILLIIL(context));
        if (c0vsj.exists()) {
            arrayList.addAll(LJIJJLI(i, c0vsj));
            arrayList.addAll(LJIJJLI(i, new C0VSJ(LJIJ(context))));
            arrayList.addAll(LJIJJLI(i, new C0VSJ(LJIIZILJ(context))));
        }
        return arrayList;
    }

    public static List LJIJJ(int i, File file) {
        ICacheService iCacheServiceCacheConfig;
        File[] fileArrRawVideoFile;
        File[] fileArrVoiceFile;
        File[] fileArrOutputFile;
        List<File> listLJIL;
        if (file.exists()) {
            ArrayList arrayList = new ArrayList();
            File[] fileArrSynthesisFile = null;
            try {
                iCacheServiceCacheConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                iCacheServiceCacheConfig = null;
            }
            if (iCacheServiceCacheConfig == null) {
                return Collections.EMPTY_LIST;
            }
            try {
                fileArrRawVideoFile = iCacheServiceCacheConfig.rawVideoFile();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                fileArrRawVideoFile = null;
            }
            if (fileArrRawVideoFile != null && (listLJIL = LJIL(fileArrRawVideoFile, i * 2)) != null) {
                arrayList.addAll(listLJIL);
            }
            try {
                fileArrVoiceFile = iCacheServiceCacheConfig.voiceFile();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                fileArrVoiceFile = null;
            }
            List<File> listLJIL2 = LJIL(fileArrVoiceFile, i);
            if (listLJIL2 != null) {
                arrayList.addAll(listLJIL2);
            }
            try {
                fileArrOutputFile = iCacheServiceCacheConfig.outputFile();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                fileArrOutputFile = null;
            }
            List<File> listLJIL3 = LJIL(fileArrOutputFile, i);
            if (listLJIL3 != null) {
                arrayList.addAll(listLJIL3);
            }
            try {
                fileArrSynthesisFile = iCacheServiceCacheConfig.synthesisFile();
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            List<File> listLJIL4 = LJIL(fileArrSynthesisFile, i);
            if (listLJIL4 != null) {
                arrayList.addAll(listLJIL4);
            }
            C0VSJ c0vsj = new C0VSJ(C1102804Ta.LIZIZ.getDownloadDir());
            if (c0vsj.exists() && LJIJJLI(i * 2, c0vsj) != null) {
                arrayList.addAll(listLJIL4);
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public static List LJIJJLI(int i, C0VSJ c0vsj) {
        File[] fileArrListFiles;
        if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles()) != null && fileArrListFiles.length > 0) {
            List listAsList = Arrays.asList(fileArrListFiles);
            Collections.sort(listAsList, new AComparatorS22S0000000_3(10));
            if (listAsList.size() > i) {
                return listAsList.subList(0, listAsList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static List<File> LJIL(File[] fileArr, int i) {
        if (fileArr != null && fileArr.length > 0) {
            List listAsList = Arrays.asList(fileArr);
            Collections.sort(listAsList, new AComparatorS22S0000000_3(9));
            if (listAsList.size() > i) {
                return listAsList.subList(0, listAsList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static void LJJ(int i, C0VSJ c0vsj) {
        LJ(LJIJJLI(i, new C0VSJ(c0vsj, "out")));
        LJ(LJIJJLI(i, new C0VSJ(c0vsj, "tmp")));
        LJ(LJIJJLI(i, new C0VSJ(c0vsj, "pic")));
    }

    public static File LJJI(Context context, boolean z) {
        File c0vsj;
        File fileLJIIIIZZ = C2427009fA.LJIIIIZZ(context, EnumC2427909fJ.PREFER_SD_CARD);
        if (fileLJIIIIZZ == null) {
            try {
                c0vsj = C786410Ut5.y2(context, "logs");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0vsj = null;
            }
            if (c0vsj == null) {
                c0vsj = new C0VSJ(LIZ(context), "logs");
            }
            if (z && !c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            return c0vsj;
        }
        C0VSJ c0vsj2 = new C0VSJ(fileLJIIIIZZ, "logs");
        if (z && !c0vsj2.exists()) {
            c0vsj2.mkdirs();
        }
        return c0vsj2;
    }
}
