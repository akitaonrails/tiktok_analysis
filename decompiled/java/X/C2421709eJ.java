package X;

import android.os.StatFs;
import android.system.ErrnoException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.zoin.model.LibModuleInfo;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.09eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2421709eJ {
    public static volatile boolean LIZ;
    public static C0VSJ LIZIZ;
    public static C0VSJ LIZJ;
    public static C0VSJ LIZLLL;
    public static final AtomicInteger LJ = new AtomicInteger(0);

    public static synchronized File LIZIZ() {
        if (LIZJ == null) {
            C0VSJ c0vsj = new C0VSJ(LIZLLL(), C2421809eK.LIZIZ());
            if (!c0vsj.exists()) {
                boolean zMkdirs = c0vsj.mkdirs();
                C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CurrentDir mkdirs ");
                sbLIZ.append(c0vsj);
                sbLIZ.append(" ");
                sbLIZ.append(zMkdirs);
                c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                if (!zMkdirs) {
                    boolean zMkdirs2 = c0vsj.mkdirs();
                    C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("CurrentDir retry mkdirs ");
                    sbLIZ2.append(c0vsj);
                    sbLIZ2.append(" ");
                    sbLIZ2.append(zMkdirs2);
                    c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            LIZJ = c0vsj;
        }
        return LIZJ;
    }

    public static synchronized File LIZJ() {
        if (LIZLLL == null) {
            LIZLLL = new C0VSJ(LIZLLL(), C2421809eK.LIZJ());
        }
        return LIZLLL;
    }

    public static synchronized File LIZLLL() {
        if (LIZIZ == null) {
            C0VSJ c0vsj = new C0VSJ(C2421809eK.LIZ.getFilesDir(), "zoin");
            LIZIZ = c0vsj;
            if (!c0vsj.exists()) {
                boolean zMkdirs = LIZIZ.mkdirs();
                C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RootDir mkdirs ");
                sbLIZ.append(LIZIZ);
                sbLIZ.append(" ");
                sbLIZ.append(zMkdirs);
                c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                if (!zMkdirs) {
                    boolean zMkdirs2 = LIZIZ.mkdirs();
                    C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("RootDir retry mkdirs ");
                    sbLIZ2.append(LIZIZ);
                    sbLIZ2.append(" ");
                    sbLIZ2.append(zMkdirs2);
                    c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        return LIZIZ;
    }

    public static synchronized void LJ() {
        if (LJ.incrementAndGet() == 1) {
            boolean zLIZIZ = C08PB.LIZIZ(LIZIZ());
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set writeable true ");
            sbLIZ.append(zLIZIZ);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static synchronized void LJFF() {
        if (LJ.decrementAndGet() == 0) {
            boolean writable = LIZIZ().setWritable(false);
            C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set writeable false ");
            sbLIZ.append(writable);
            c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(List<LibModuleInfo> list) {
        long jLLII;
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        LJ();
        File filesDir = C2421809eK.LIZ.getFilesDir();
        File cacheDir = C2421809eK.LIZ.getCacheDir();
        C2418109dj c2418109djLIZLLL = C2418109dj.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilesDir: ");
        sbLIZ.append(filesDir);
        sbLIZ.append(" ");
        sbLIZ.append(filesDir.exists());
        sbLIZ.append(" ");
        sbLIZ.append(filesDir.canRead());
        sbLIZ.append(" ");
        sbLIZ.append(filesDir.canWrite());
        sbLIZ.append(" ");
        sbLIZ.append(filesDir.canExecute());
        c2418109djLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        C2418109dj c2418109djLIZLLL2 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CacheDir: ");
        sbLIZ2.append(cacheDir);
        sbLIZ2.append(" ");
        sbLIZ2.append(cacheDir.exists());
        sbLIZ2.append(" ");
        sbLIZ2.append(cacheDir.canRead());
        sbLIZ2.append(" ");
        sbLIZ2.append(cacheDir.canWrite());
        sbLIZ2.append(" ");
        sbLIZ2.append(cacheDir.canExecute());
        c2418109djLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        C2418109dj c2418109djLIZLLL3 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Current innerSpace ");
        try {
            jLLII = C2204961BRm.LLII(new StatFs(C2421809eK.LIZ.getFilesDir().getPath()), new C0WZX("dzBzEgAjS8/YVFkiQFyeaXBVeaiWPEhjudxgzvzOqA==", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2418109dj.LIZLLL().LJFF("get inner space error " + C2418209dk.LIZ(th));
            jLLII = 0;
        }
        sbLIZ3.append(jLLII);
        c2418109djLIZLLL3.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
        if (filesDir.exists()) {
            C2418109dj.LIZLLL().LJFF("Print FilesDir");
            File[] fileArrListFiles3 = filesDir.listFiles();
            if (fileArrListFiles3 != null && fileArrListFiles3.length > 0) {
                for (File file : fileArrListFiles3) {
                    C2418109dj c2418109djLIZLLL4 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(file.getName());
                    sbLIZ4.append(" ");
                    sbLIZ4.append(file.exists());
                    sbLIZ4.append(" ");
                    sbLIZ4.append(file.canRead());
                    sbLIZ4.append(" ");
                    sbLIZ4.append(file.canWrite());
                    sbLIZ4.append(" ");
                    sbLIZ4.append(file.canExecute());
                    c2418109djLIZLLL4.LJFF(C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
            C2418109dj.LIZLLL().LJFF("Print FilesDir END");
        } else {
            File parentFile = filesDir.getParentFile();
            if (parentFile.exists()) {
                C2418109dj.LIZLLL().LJFF("Print ParentFile");
                File[] fileArrListFiles4 = parentFile.listFiles();
                if (fileArrListFiles4 != null && fileArrListFiles4.length > 0) {
                    for (File file2 : fileArrListFiles4) {
                        C2418109dj c2418109djLIZLLL5 = C2418109dj.LIZLLL();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(file2.getName());
                        sbLIZ5.append(" ");
                        sbLIZ5.append(file2.exists());
                        sbLIZ5.append(" ");
                        sbLIZ5.append(file2.canRead());
                        sbLIZ5.append(" ");
                        sbLIZ5.append(file2.canWrite());
                        sbLIZ5.append(" ");
                        sbLIZ5.append(file2.canExecute());
                        c2418109djLIZLLL5.LJFF(C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
                C2418109dj.LIZLLL().LJFF("Print ParentFile END");
            } else {
                C2418109dj.LIZLLL().LJFF("FILES NOT WORK");
            }
        }
        if (LIZLLL().exists()) {
            C2418109dj.LIZLLL().LJFF("Print RootDir");
            File[] fileArrListFiles5 = LIZLLL().listFiles();
            if (fileArrListFiles5 != null && fileArrListFiles5.length > 0) {
                for (File file3 : fileArrListFiles5) {
                    C2418109dj c2418109djLIZLLL6 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(file3.getName());
                    sbLIZ6.append(" ");
                    sbLIZ6.append(file3.exists());
                    sbLIZ6.append(" ");
                    sbLIZ6.append(file3.canRead());
                    sbLIZ6.append(" ");
                    sbLIZ6.append(file3.canWrite());
                    sbLIZ6.append(" ");
                    sbLIZ6.append(file3.canExecute());
                    c2418109djLIZLLL6.LJFF(C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
            C2418109dj.LIZLLL().LJFF("Print RootDir END");
        }
        boolean z = true;
        try {
            boolean zCreateNewFile = new C0VSJ(LIZIZ(), "createFile.test").createNewFile();
            C2418109dj c2418109djLIZLLL7 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("TestSuccess ");
            sbLIZ7.append(zCreateNewFile);
            c2418109djLIZLLL7.LJFF(C2188811AlT.LIZIZ(sbLIZ7));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C2418109dj c2418109djLIZLLL8 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("TestCreateFail ");
            sbLIZ8.append(e.getMessage());
            c2418109djLIZLLL8.LJFF(C2188811AlT.LIZIZ(sbLIZ8));
            Throwable cause = e.getCause();
            if (cause != null && (cause instanceof ErrnoException)) {
                ErrnoException errnoException = (ErrnoException) cause;
                C2418109dj c2418109djLIZLLL9 = C2418109dj.LIZLLL();
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("FindErrno ");
                sbLIZ9.append(errnoException.errno);
                c2418109djLIZLLL9.LJFF(C2188811AlT.LIZIZ(sbLIZ9));
                int i = errnoException.errno;
                if ((i == 23 || i == 24) && !C2422409eQ.LIZ) {
                    C2422409eQ.LIZ = true;
                }
            }
        }
        C2418109dj c2418109djLIZLLL10 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("MD5Check:");
        sbLIZ10.append(C2421809eK.LIZJ());
        sbLIZ10.append(" Now:");
        sbLIZ10.append(C2421809eK.LIZIZ());
        c2418109djLIZLLL10.LJFF(C2188811AlT.LIZIZ(sbLIZ10));
        C2418109dj c2418109djLIZLLL11 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("CurrentDirExist: ");
        sbLIZ11.append(LIZIZ());
        sbLIZ11.append(" ");
        sbLIZ11.append(LIZIZ().exists());
        c2418109djLIZLLL11.LJFF(C2188811AlT.LIZIZ(sbLIZ11));
        C2418109dj c2418109djLIZLLL12 = C2418109dj.LIZLLL();
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("LastDirExist: ");
        sbLIZ12.append(LIZJ());
        sbLIZ12.append(" ");
        sbLIZ12.append(LIZJ().exists());
        c2418109djLIZLLL12.LJFF(C2188811AlT.LIZIZ(sbLIZ12));
        if (!C2421809eK.LIZIZ().equals(C2421809eK.LIZJ())) {
            C08PB.LIZIZ(LIZJ());
            for (LibModuleInfo libModuleInfo : list) {
                List<ZoinBuildFileInfo> list2 = libModuleInfo.curAbiInfo.libFileInfoList;
                File fileLIZIZ = LIZIZ();
                File fileLIZJ = LIZJ();
                C2421809eK.LIZJ();
                String str = libModuleInfo.moduleName;
                LIZ = z;
                if (fileLIZJ.exists()) {
                    HashSet hashSet = new HashSet();
                    File[] fileArrListFiles6 = fileLIZJ.listFiles(new FilenameFilter() { // from class: X.09eP
                        public final /* synthetic */ String LIZ = ".so";

                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file4, String str2) {
                            return str2.endsWith(this.LIZ);
                        }
                    });
                    if (fileArrListFiles6 != null) {
                        for (File file4 : fileArrListFiles6) {
                            ZoinBuildFileInfo zoinBuildFileInfo = new ZoinBuildFileInfo();
                            zoinBuildFileInfo.checkNumber = C2418609do.LIZ(file4);
                            zoinBuildFileInfo.name = file4.getName();
                            hashSet.add(zoinBuildFileInfo);
                        }
                    }
                    Iterator<ZoinBuildFileInfo> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ZoinBuildFileInfo next = it2.next();
                        if (hashSet.contains(next)) {
                            String str2 = next.name;
                            boolean zRenameTo = new C0VSJ(fileLIZJ, str2).renameTo(new C0VSJ(fileLIZIZ, str2));
                            C2418109dj c2418109djLIZLLL13 = C2418109dj.LIZLLL();
                            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                            sbLIZ13.append("RenameTo ");
                            sbLIZ13.append(next.name);
                            sbLIZ13.append(" ");
                            sbLIZ13.append(zRenameTo);
                            c2418109djLIZLLL13.LJFF(C2188811AlT.LIZIZ(sbLIZ13));
                            if (zRenameTo) {
                                it2.remove();
                            }
                        }
                    }
                    C2418109dj c2418109djLIZLLL14 = C2418109dj.LIZLLL();
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("files which need to be decompressed:");
                    sbLIZ14.append(list2);
                    c2418109djLIZLLL14.LJFF(C2188811AlT.LIZIZ(sbLIZ14));
                } else {
                    if (list2 != null) {
                    }
                    C2421809eK.LJ(C2421809eK.LIZLLL(str, "is_first_load"), true);
                    z = true;
                }
                if (list2.size() > 0) {
                    C2421809eK.LJ(C2421809eK.LIZLLL(str, "key.lib.decode.finished"), false);
                }
                C2421809eK.LJ(C2421809eK.LIZLLL(str, "is_first_load"), true);
                z = true;
            }
            String strLIZIZ = C2421809eK.LIZIZ();
            C2418109dj.LIZLLL().LJ().edit().putString("key.meta.md5", strLIZIZ).apply();
            C2418109dj c2418109djLIZLLL15 = C2418109dj.LIZLLL();
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append("putString ");
            sbLIZ15.append("key.meta.md5");
            sbLIZ15.append(" ");
            sbLIZ15.append(strLIZIZ);
            c2418109djLIZLLL15.LJFF(C2188811AlT.LIZIZ(sbLIZ15));
        } else {
            for (LibModuleInfo libModuleInfo2 : list) {
                Iterator<ZoinBuildFileInfo> it3 = libModuleInfo2.curAbiInfo.libFileInfoList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C0VSJ c0vsj = new C0VSJ(LIZIZ(), it3.next().name);
                        if (!c0vsj.exists()) {
                            C2418109dj c2418109djLIZLLL16 = C2418109dj.LIZLLL();
                            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                            sbLIZ16.append(libModuleInfo2.moduleName);
                            sbLIZ16.append(" reInit because ");
                            sbLIZ16.append(c0vsj);
                            sbLIZ16.append(" not exist");
                            c2418109djLIZLLL16.LJFF(C2188811AlT.LIZIZ(sbLIZ16));
                            C2421809eK.LJ(C2421809eK.LIZLLL(libModuleInfo2.moduleName, "key.lib.decode.finished"), false);
                            break;
                        }
                    }
                }
            }
        }
        C2418109dj.LIZLLL().getClass();
        if (C2421809eK.LIZIZ().equals("defaultmd5")) {
            C2418109dj.LIZLLL().LJFF("read metadata md5 failed, use backup md5");
        } else {
            try {
                File parentFile2 = C2421809eK.LIZ.getFilesDir().getParentFile();
                try {
                    File[] fileArrListFiles7 = new File[0];
                    if ((parentFile2 == null || (fileArrListFiles7 = parentFile2.listFiles()) != null) && fileArrListFiles7.length > 0) {
                        for (File file5 : fileArrListFiles7) {
                            if (file5.getName().startsWith("app_zoin")) {
                                C2418109dj c2418109djLIZLLL17 = C2418109dj.LIZLLL();
                                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                sbLIZ17.append("clean old ");
                                sbLIZ17.append(file5);
                                c2418109djLIZLLL17.LJFF(C2188811AlT.LIZIZ(sbLIZ17));
                                C2422209eO.LIZ(file5);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (C2421809eK.LIZIZ().equals("defaultmd5")) {
            C2418109dj.LIZLLL().LJFF("read metadata md5 failed, use backup md5");
        } else {
            try {
                File fileLIZIZ2 = LIZIZ();
                File parentFile3 = fileLIZIZ2.getParentFile();
                if (parentFile3 != null && parentFile3.exists() && (fileArrListFiles = parentFile3.listFiles()) != null && fileArrListFiles.length > 0) {
                    for (File file6 : fileArrListFiles) {
                        if (!file6.getName().equals(fileLIZIZ2.getName())) {
                            C2418109dj c2418109djLIZLLL18 = C2418109dj.LIZLLL();
                            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                            sbLIZ18.append("clean last old ");
                            sbLIZ18.append(file6);
                            c2418109djLIZLLL18.LJFF(C2188811AlT.LIZIZ(sbLIZ18));
                            C2422209eO.LIZ(file6);
                        }
                    }
                }
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        try {
            File fileLIZIZ3 = LIZIZ();
            if (fileLIZIZ3 != null && fileLIZIZ3.exists() && (fileArrListFiles2 = fileLIZIZ3.listFiles()) != null && fileArrListFiles2.length > 0) {
                for (File file7 : fileArrListFiles2) {
                    if (file7.isFile() && file7.getName().endsWith(".temp")) {
                        boolean zDelete = file7.delete();
                        C2418109dj c2418109djLIZLLL19 = C2418109dj.LIZLLL();
                        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                        sbLIZ19.append("Clean tmp ");
                        sbLIZ19.append(file7);
                        sbLIZ19.append(" ");
                        sbLIZ19.append(zDelete);
                        c2418109djLIZLLL19.LJFF(C2188811AlT.LIZIZ(sbLIZ19));
                    }
                }
            }
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LJFF();
    }
}
