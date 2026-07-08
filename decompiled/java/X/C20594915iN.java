package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.15iN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20594915iN {
    public static final C20594915iN LIZ = new C20594915iN();
    public static Method LIZIZ;
    public static volatile Boolean LIZJ;
    public static volatile Boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static final ReentrantLock LJI;
    public static final Condition LJII;
    public static final ReentrantLock LJIIIIZZ;
    public static final Condition LJIIIZ;
    public static String LJIIJ;

    public static boolean LIZIZ() {
        boolean zLJFF = false;
        try {
            Class<?> cls = Class.forName("com.huawei.android.os.SystemPropertiesEx");
            zLJFF = Intrinsics.LJFF("tablet", cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "ro.build.characteristics", ""));
            return zLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1909520zn4.LIZIZ("DeviceAuth", "get tablet properties error");
            return zLJFF;
        }
    }

    public static Boolean LJIIJJI() {
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
        int iLIZIZ = c1389350mG5LIZJ.LIZIZ();
        int iLIZ = c1389350mG5LIZJ.LIZ();
        if (iLIZIZ < iLIZ) {
            iLIZIZ = iLIZ;
        }
        int iLIZIZ2 = c1389350mG5LIZJ.LIZIZ();
        int iLIZ2 = c1389350mG5LIZJ.LIZ();
        if (iLIZIZ2 > iLIZ2) {
            iLIZIZ2 = iLIZ2;
        }
        return Boolean.valueOf(iLIZIZ * 9 >= iLIZIZ2 * 16);
    }

    public static boolean LJIILL() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        LJI = reentrantLock;
        LJII = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        LJIIIIZZ = reentrantLock2;
        LJIIIZ = reentrantLock2.newCondition();
        LJIIJ = "tablet screen size";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ() {
        boolean zLIZ = C1886907aF.LIZ(Build.MODEL.toLowerCase(Locale.ROOT), new String[]{"pixel c", "pixel tablet", "tangorpro", "felix"});
        if (zLIZ == 1) {
            return true;
        }
        if (zLIZ == 2) {
            return false;
        }
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
        C20593115i5 c20593115i5 = C20593115i5.LIZ;
        int iLIZIZ = c1389350mG5LIZJ.LIZIZ();
        int iLIZ = c1389350mG5LIZJ.LIZ();
        c20593115i5.getClass();
        return C20593115i5.LJIIJJI(iLIZIZ, iLIZ);
    }

    public static boolean LIZJ() {
        boolean zContains;
        String str;
        List listLL;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, "ro.build.characteristics");
            if ((objInvoke instanceof String) && (str = (String) objInvoke) != null && a0.LJJIIZI(str, ",", false)) {
                List<String> listSplit = new Regex(",").split(str, 0);
                if (listSplit.isEmpty()) {
                    listLL = C13BV.INSTANCE;
                    String[] strArr = (String[]) listLL.toArray(new String[0]);
                    zContains = C1697810uHb.LJIIJJI(Arrays.copyOf(strArr, strArr.length)).contains("tablet");
                } else {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    listLL = C13BV.INSTANCE;
                    String[] strArr2 = (String[]) listLL.toArray(new String[0]);
                    zContains = C1697810uHb.LJIIJJI(Arrays.copyOf(strArr2, strArr2.length)).contains("tablet");
                }
            } else {
                zContains = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkIsOnePlusTablet result=");
            sbLIZ.append(zContains);
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ));
            return zContains;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get oneplus tablet properties error, msg: ");
            sbLIZ2.append(e.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
    }

    public static boolean LIZLLL() {
        boolean zLJFF = false;
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.tablet");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkIsOppoTablet result=");
            sbLIZ.append(objInvoke);
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ));
            zLJFF = Intrinsics.LJFF(objInvoke, Boolean.TRUE);
            return zLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get oppo tablet properties error, msg: ");
            sbLIZ2.append(e.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ2));
            return zLJFF;
        }
    }

    public static boolean LJFF() {
        boolean zLJFF = false;
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            Object objInvoke = cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkIsVivoTablet dType=");
            sbLIZ.append(objInvoke);
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ));
            zLJFF = Intrinsics.LJFF("tablet", objInvoke);
            return zLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get vivo tablet properties error, msg: ");
            sbLIZ2.append(e.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ2));
            return zLJFF;
        }
    }

    public static int LJII() {
        String lowerCase = Build.BRAND.toLowerCase(Locale.ROOT);
        int i = 0;
        if (Intrinsics.LJFF(lowerCase, "xiaomi")) {
            try {
                C844470XAv.LIZ.getClass();
                int i2 = Settings.Global.getInt(C844470XAv.LIZ().getContentResolver(), "device_posture", 0);
                if (i2 == 1) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 != 3) {
                    i = 0;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                C189200o6.m2constructorimpl(Unit.LIZ);
                return i;
            } catch (Throwable th2) {
                th = th2;
                i = i;
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return i;
            }
        }
        if (Intrinsics.LJFF(lowerCase, "huawei")) {
            try {
                C844470XAv.LIZ.getClass();
                int i3 = Settings.Global.getInt(C844470XAv.LIZ().getContentResolver(), "hw_fold_display_mode_prepare", 0);
                i = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 7 ? 0 : 4 : 2 : 1 : 3;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                C189200o6.m2constructorimpl(Unit.LIZ);
                return i;
            } catch (Throwable th4) {
                th = th4;
                i = i;
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return i;
            }
        }
        return i;
    }

    public static int LJIIIIZZ() {
        int i = 0;
        if (Intrinsics.LJFF(Build.BRAND.toLowerCase(Locale.ROOT), "huawei")) {
            try {
                String str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, "hw_sc.build.os.phonetype", "not getProp by key");
                if (Intrinsics.LJFF(str, "flipPhone")) {
                    i = 2;
                } else if (Intrinsics.LJFF(str, "foldPhone")) {
                    i = 1;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
                return i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return i;
    }

    public static boolean LJIIL() {
        boolean zBooleanValue = false;
        if (C1886907aF.LIZ(Build.MODEL.toLowerCase(Locale.ROOT), new String[]{"cph2519", "cph5381", "opd2302", "opd2303", "pht110", "pgt110", "peum00"})) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                return zBooleanValue;
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get oppo fold properties error, msg: ");
            sbLIZ.append(e.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ));
            return zBooleanValue;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get oppo fold properties error, msg: ");
            sbLIZ2.append(e2.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ2));
            return zBooleanValue;
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("get oppo fold properties error, msg: ");
            sbLIZ3.append(e3.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ3));
            return zBooleanValue;
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("get oppo fold properties error, msg: ");
            sbLIZ4.append(e4.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ4));
        }
        return zBooleanValue;
    }

    public static boolean LJIILIIL() {
        String string;
        Object objInvoke;
        C20595015iO.LIZ.getClass();
        if (C20595015iO.LJFF()) {
            return true;
        }
        if (C20595015iO.LJ()) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            objInvoke = cls.getDeclaredMethod("getString", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD");
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get ss fold device error:");
            sbLIZ.append(e.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ));
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("get ss fold device error:");
            sbLIZ2.append(e2.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("get ss fold device error:");
            sbLIZ3.append(e3.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ3));
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("get ss fold device error:");
            sbLIZ4.append(e4.getMessage());
            C1909520zn4.LIZIZ("DeviceAuth", C2188811AlT.LIZIZ(sbLIZ4));
        }
        if (objInvoke != null) {
            string = objInvoke.toString();
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        if (string.length() == 0) {
            string = "unknown";
        }
        return Intrinsics.LJFF(string, "TRUE");
    }

    public static boolean LJIILJJIL() {
        ReentrantLock reentrantLock;
        boolean zLJJIIZI;
        boolean zLJI = false;
        if (LJ) {
            Boolean bool = LIZJ;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zLJJIIZI = a0.LJJIIZI(C2105708Mt.LIZ("ro.build.characteristics"), "tablet", false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLJJIIZI = false;
            }
            LJIIJ = "tablet oem";
            String str = Build.BRAND;
            if (u.LJIJI(str, "huawei", true) || u.LJIJI(str, "himatepad", true)) {
                zLJI = LIZIZ();
            } else if (u.LJIJI(str, "oneplus", true)) {
                zLJI = LIZJ();
            } else if (u.LJIJI(str, "xiaomi", true) || u.LJIJI(str, "redmi", true)) {
                if (zLJJIIZI && C2162308dZ.LJII()) {
                    zLJI = true;
                }
            } else if (u.LJIJI(str, "vivo", true)) {
                zLJI = LJFF();
            } else if (u.LJIJI(str, "oppo", true)) {
                zLJI = LIZLLL();
            } else if (u.LJIJI(str, "tecno", true) || u.LJIJI(str, "infinix", true) || u.LJIJI(str, "itel", true) || u.LJIJI(str, "tcl", true) || u.LJIJI(str, "xiaodu", true)) {
                zLJI = zLJJIIZI;
            } else if (u.LJIJI(str, "Lenovo", true) || u.LJIJI(str, "honor", true) || u.LJIJI(str, "realme", true) || u.LJIJI(str, "samsung", true)) {
                zLJI = LJI(str.toLowerCase(Locale.ROOT), zLJJIIZI);
            } else if (u.LJIJI(str, "google", true)) {
                zLJI = LIZ();
            } else {
                if (C13LQ.LJJIJIIJI(Build.MODEL.toLowerCase(Locale.ROOT), new String[]{"w200ds", "w201ds", "w202ds", "w203ds", "w205ds", "np03j"}) < 0 && LJ(zLJJIIZI)) {
                    zLJI = true;
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C2344009Gk c2344009Gk = new C2344009Gk();
            Locale locale = Locale.ROOT;
            c2344009Gk.LJIIIIZZ("device_brand", str.toLowerCase(locale));
            c2344009Gk.LJIIIIZZ("device_model", Build.MODEL.toLowerCase(locale));
            c2344009Gk.LIZJ(1, "is_pad_result_source");
            c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
            C20684815ws.LJIILLIIL("device_classification_is_tablet_duration", c2344009Gk.LIZ);
            LIZJ = Boolean.valueOf(zLJI);
            LJ = true;
            reentrantLock = LJI;
            reentrantLock.lock();
            try {
                LJII.signalAll();
                reentrantLock.unlock();
                return zLJI;
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJ = true;
            reentrantLock = LJI;
            reentrantLock.lock();
            try {
                LJII.signalAll();
                reentrantLock.unlock();
                throw th;
            } finally {
            }
        }
    }

    public static boolean LJ(boolean z) {
        int i;
        boolean zLJIIJJI;
        Configuration configuration;
        C844470XAv.LIZ.getClass();
        Resources resources = C844470XAv.LIZ().getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.screenLayout & 15;
        } else {
            i = 2;
        }
        if (i >= 3) {
            zLJIIJJI = true;
        } else {
            C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
            C20593115i5 c20593115i5 = C20593115i5.LIZ;
            int iLIZIZ = c1389350mG5LIZJ.LIZIZ();
            int iLIZ = c1389350mG5LIZJ.LIZ();
            c20593115i5.getClass();
            zLJIIJJI = C20593115i5.LJIIJJI(iLIZIZ, iLIZ);
        }
        LJIIJ = "tablet screen size";
        if (z && zLJIIJJI) {
            return true;
        }
        return false;
    }

    public static String LJIIIZ(String str) {
        try {
            if (LIZIZ == null) {
                LIZIZ = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            }
            Method method = LIZIZ;
            Object objInvoke = null;
            if (method != null) {
                objInvoke = method.invoke(null, str, "unknown");
            }
            return String.valueOf(objInvoke);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "unknown";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJ(boolean r9) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20594915iN.LJIIJ(boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(java.lang.String r57, boolean r58) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20594915iN.LJI(java.lang.String, boolean):boolean");
    }
}
