package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09fA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2427009fA {
    public static volatile InterfaceC2427109fB<C2427209fC> LIZ;
    public static final List<InterfaceC345370DgN> LIZIZ = new ArrayList();
    public static InterfaceC2426609f6 LIZJ;

    public static List<InterfaceC345370DgN> LJIIJJI() {
        if (LIZJ == null) {
            return LIZIZ;
        }
        List<InterfaceC345370DgN> list = LIZIZ;
        synchronized (list) {
            try {
                if (!list.containsAll(LIZJ.getStorageList())) {
                    ((ArrayList) list).addAll(LIZJ.getStorageList());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return list;
    }

    public static boolean LJIIL() {
        return (LIZ == null || LIZ.get() == null) ? false : true;
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

    public static C0VSJ LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        File parentFile = c0vsj.getParentFile();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(parentFile.getFreeSpace());
        sbLIZ.append(" ");
        sbLIZ.append(1024L);
        C2188811AlT.LIZIZ(sbLIZ);
        if (parentFile.getFreeSpace() < 1024) {
            return null;
        }
        if (!c0vsj.exists()) {
            try {
                c0vsj.createNewFile();
                return c0vsj;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return c0vsj;
    }

    public static File LIZLLL(Context context) {
        File fileX2;
        try {
            if ("mounted".equals(C786410Ut5.X3()) && (fileX2 = C786410Ut5.x2(context)) != null) {
                long freeSpace = fileX2.getFreeSpace();
                LIZ.get().getClass();
                if (freeSpace >= 0) {
                    return fileX2;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static File LJ(Context context) {
        File fileY2;
        try {
            if ("mounted".equals(C786410Ut5.X3()) && (fileY2 = C786410Ut5.y2(context, null)) != null && fileY2.exists()) {
                long freeSpace = fileY2.getFreeSpace();
                LIZ.get().getClass();
                if (freeSpace >= 0) {
                    return fileY2;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static File LJFF(Context context) {
        File fileLJIIIZ = LJIIIZ(context);
        if (fileLJIIIZ != null && fileLJIIIZ.exists()) {
            long freeSpace = fileLJIIIZ.getFreeSpace();
            LIZ.get().getClass();
            if (freeSpace >= 0) {
                return fileLJIIIZ;
            }
            return null;
        }
        return null;
    }

    public static File LJI(Context context) {
        File fileLJIIJ = LJIIJ(context);
        if (fileLJIIJ != null && fileLJIIJ.exists()) {
            long freeSpace = fileLJIIJ.getFreeSpace();
            LIZ.get().getClass();
            if (freeSpace >= 0) {
                return fileLJIIJ;
            }
            return null;
        }
        return null;
    }

    public static File LJIIIZ(Context context) {
        File[] externalCacheDirs;
        C2427309fD c2427309fDLIZ = C2427309fD.LIZ(context);
        if (c2427309fDLIZ != null && c2427309fDLIZ.LIZJ()) {
            try {
                externalCacheDirs = context.getExternalCacheDirs();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                externalCacheDirs = null;
            }
            File fileLIZJ = LIZJ(externalCacheDirs, context);
            if (fileLIZJ != null) {
                return fileLIZJ;
            }
            try {
                C786410Ut5.x2(context);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c2427309fDLIZ.LIZLLL);
                sbLIZ.append("/Android/data/");
                sbLIZ.append(context.getPackageName());
                sbLIZ.append("/cache");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
                if (!c0vsj.exists()) {
                    return null;
                }
                return c0vsj;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return null;
    }

    public static File LJIIJ(Context context) {
        File[] externalFilesDirs;
        C2427309fD c2427309fDLIZ = C2427309fD.LIZ(context);
        if (c2427309fDLIZ != null && c2427309fDLIZ.LIZJ() && !TextUtils.isEmpty(c2427309fDLIZ.LIZLLL)) {
            try {
                externalFilesDirs = context.getExternalFilesDirs(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                externalFilesDirs = null;
            }
            File fileLIZJ = LIZJ(externalFilesDirs, context);
            if (fileLIZJ != null) {
                return fileLIZJ;
            }
            try {
                C786410Ut5.y2(context, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c2427309fDLIZ.LIZLLL);
                sbLIZ.append("/Android/data/");
                sbLIZ.append(context.getPackageName());
                sbLIZ.append("/files");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
                if (!c0vsj.exists()) {
                    return null;
                }
                return c0vsj;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return null;
    }

    public static File LIZJ(File[] fileArr, Context context) {
        C2427309fD c2427309fDLIZ;
        if (fileArr != null && (c2427309fDLIZ = C2427309fD.LIZ(context)) != null && c2427309fDLIZ.LIZJ() && !TextUtils.isEmpty(c2427309fDLIZ.LIZLLL)) {
            for (File file : fileArr) {
                if (file != null && file.getPath() != null && file.getPath().contains(c2427309fDLIZ.LIZLLL)) {
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }

    public static File LJII(Context context, EnumC2427909fJ enumC2427909fJ) {
        File fileLIZLLL = null;
        if (!LJIIL()) {
            return null;
        }
        int i = C2427809fI.LIZ[enumC2427909fJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LIZLLL(context);
                        }
                    } else {
                        File fileLIZLLL2 = LIZLLL(context);
                        if (fileLIZLLL2 != null) {
                            return fileLIZLLL2;
                        }
                    }
                } else {
                    try {
                        File fileW2 = C786410Ut5.w2(context);
                        if (fileW2 != null) {
                            long freeSpace = fileW2.getFreeSpace();
                            LIZ.get().getClass();
                            if (freeSpace >= 0) {
                                fileLIZLLL = fileW2;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (fileLIZLLL == null) {
                        fileLIZLLL = LIZLLL(context);
                    }
                    if (fileLIZLLL != null) {
                        return fileLIZLLL;
                    }
                }
            } else {
                File fileLIZLLL3 = LIZLLL(context);
                if (fileLIZLLL3 == null) {
                    fileLIZLLL3 = LJFF(context);
                }
                if (fileLIZLLL3 != null) {
                    return fileLIZLLL3;
                }
            }
        } else {
            File fileLJFF = LJFF(context);
            if (fileLJFF == null) {
                fileLJFF = LIZLLL(context);
            }
            if (fileLJFF != null) {
                return fileLJFF;
            }
        }
        return C786410Ut5.w2(context);
    }

    public static File LJIIIIZZ(Context context, EnumC2427909fJ enumC2427909fJ) throws Throwable {
        File fileLJ = null;
        if (!LJIIL()) {
            return null;
        }
        int i = C2427809fI.LIZ[enumC2427909fJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return LJ(context);
                        }
                    } else {
                        File fileLJ2 = LJ(context);
                        if (fileLJ2 != null) {
                            return fileLJ2;
                        }
                    }
                } else {
                    try {
                        File fileLIZ = LIZ(context);
                        if (fileLIZ != null && fileLIZ.exists()) {
                            long freeSpace = fileLIZ.getFreeSpace();
                            LIZ.get().getClass();
                            if (freeSpace >= 0) {
                                fileLJ = fileLIZ;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (fileLJ == null) {
                        fileLJ = LJ(context);
                    }
                    if (fileLJ != null) {
                        return fileLJ;
                    }
                }
            } else {
                File fileLJ3 = LJ(context);
                if (fileLJ3 == null) {
                    fileLJ3 = LJI(context);
                }
                if (fileLJ3 != null) {
                    return fileLJ3;
                }
            }
        } else {
            File fileLJI = LJI(context);
            if (fileLJI == null) {
                fileLJI = LJ(context);
            }
            if (fileLJI != null) {
                return fileLJI;
            }
        }
        return LIZ(context);
    }
}
