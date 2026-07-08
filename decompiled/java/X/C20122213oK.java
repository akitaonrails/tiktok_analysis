package X;

import Y.ARunnableS72S0200000_3;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbDevice;
import android.os.Build;
import android.provider.Settings;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13oK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20122213oK {
    public static final C20122213oK LIZ = new C20122213oK();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("de.robv.android.xposed.installer", "org.lsposed.manager", "org.meowcat.edxposed.manager", "com.solohsu.android.edxp.manager", "io.va.exposed", "com.topjohnwu.magisk");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("de.robv.android.xposed.XposedBridge", "de.robv.android.xposed.XC_MethodHook", "com.saurik.substrate.MS$2");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("/system/framework/XposedBridge.jar", "/system/bin/app_process32_xposed", "/system/bin/app_process64_xposed", "/system/bin/app_process_xposed", "/system/lib/libxposed_art.so", "/system/lib64/libxposed_art.so", "/system/lib/libsubstrate.so", "/system/lib64/libsubstrate.so", "/data/local/tmp/frida-server", "/system/bin/frida-server", "/system/xbin/frida-server", "/sbin/frida-server", "/su/bin/frida-server", "/data/adb/lspd", "/data/adb/riru");
    public static final List<List<String>> LJ = C1697810uHb.LJIIJJI(C1697810uHb.LJIIJJI("frida", "gadget"), C1697810uHb.LJIIJJI("xposed", "lsposed", "edxposed"), C1697810uHb.LJIIJJI("substrate", "cydia"));
    public static final List<String> LJFF = C1697810uHb.LJIIJJI("/dev/haima-rfifo", "/dev/haima-wfifo", "/system/etc/haima.agent.d", "/system/bin/ws-server", "/system/app/CloudLauncher", "/system/priv-app/MonitorAppOEM", "/system/priv-app/RedFingerLauncher", "/system/priv-app/RedFingerFileManager", "/sys/bus/platform/devices/ionfb_redfinger.0", "/sys/devices/platform/ionfb_redfinger.0", "/sys/class/redfinger_camera", "/sys/class/redfinger_audio", "/sys/devices/virtual/redfinger_audio", "/sdcard/Android/data/org.appspot.apprtc", "/sdcard/Android/data/com.longene.lglocations", "/sdcard/Android/data/com.longene.lglocation", "/sdcard/Android/data/com.migu.agent", "/sdcard/Android/data/com.migu.controller", "/sdcard/Android/data/com.redfinger.monitor", "/sdcard/Android/data/com.redfinger.filemanager", "/data/data/org.appspot.apprtc", "/data/data/com.longene.lglocations", "/data/data/com.longene.lglocation", "/data/data/com.migu.agent", "/data/data/com.migu.controller", "/data/data/com.redfinger.monitor", "/data/data/com.redfinger.filemanager", "/system/etc/permissions/monbox.xml", "anbox-init.sh", "/init.hi3660.rc", "/data/android_info.conf", "/data/mac", "/acct/docker", "/sys/fs/cgroup/memory/docker", "/dev/cpuset/docker", "/dev/cpuctl/docker", "/dev/memcg/docker", "/dev/cpuset/kube-proxy/", "/dev/sdb", "/dev/sdc", "/lxc/lxcfs/", "/system/bin/android_ttcp", "/system/bin/eeprom_tools", "/system/bin/vcDistributor", "/system/bin/vclusters_server", "/system/bin/iptables_yp", "/system/bin/yp_log", "/system/bin/ypremoteview", "/system/xbin/yp_init.sh", "/system/xbin/ysu", "/fstab.pscloud", "/init.dundi.rc", "/init.pscloud.rc", "/system/bin/client", "/system/bin/lzbaseband", "/system/bin/socat", "/sys/class/lginput/", "/dev/lginput", "/system/bin/lgserver", "/system/lib/libRkTeeGatekeeper.so", "/vendor/bin/tenc-apk-installer.sh", "/vendor/bin/tenc-ethernet.sh", "/vendor/etc/fstab.tenc", "/vendor/lib/hw/gatekeeper.tenc.so", "/vendor/lib/hw/gps.tenc.so");
    public static final List<String> LJI = C1697810uHb.LJIIJJI("/dev/qemu_pipe", "/dev/qemu_trace", "/dev/socket/qemud");
    public static final List<String> LJII = C1697810uHb.LJIIJJI("/system/framework/org.lineageos.platform.jar", "/system/framework/org.lineageos.hardware.jar", "/system/framework/org.cyanogenmod.platform.jar", "/system/framework/org.cyanogenmod.hardware.jar", "/system/framework/org.mokee.platform.jar", "/system/framework/org.mokee.hardware.jar");
    public static final List<String> LJIIIIZZ = C1697810uHb.LJIIJJI("com.topjohnwu.magisk", "io.github.huskydg.magisk", "com.joeykrim.rootcheck", "com.kingroot.kinguser", "com.kingo.root", "me.weishu.kernelsu", "juniojsv.mtk.easy.su", "com.allguide.kingrootguide", "com.noshufou.android.su", "eu.chainfire.supersu", "com.koushikdutta.superuser");
    public static final List<String> LJIIIZ = C1697810uHb.LJIIJJI("/bin/.magisk", "/cache/.disable_magisk", "/cache/magisk.log", "/data/adb/magisk", "/data/adb/magisk.db", "/data/data/com.baidu.easyroot", "/data/data/com.devadvance.rootcloak2", "/data/data/com.kingroot.kinguser", "/data/data/com.mtk.user2root", "/data/data/com.qihoo.permmgr", "/data/data/com.rd.user2root", "/data/data/com.shuame.rootgenius", "/data/data/com.topjohnwu.magisk", "/data/data/hh.root", "/data/magisk", "/data/magisk.apk", "/dev/magisk", "/dev/magisk/img", "/mnt/vendor/persist/magisk", "/sbin/.magisk", "/sbin/magisk", "/sbin/magiskimg", "/sbin/su", "/system/su", "/sdcard/Android/data/com.baidu.easyroot", "/sdcard/Android/data/com.devadvance.rootcloak2", "/sdcard/Android/data/com.kingroot.kinguser", "/sdcard/Android/data/com.mtk.user2root", "/sdcard/Android/data/com.qihoo.permmgr", "/sdcard/Android/data/com.rd.user2root", "/sdcard/Android/data/com.shuame.rootgenius", "/sdcard/Android/data/com.topjohnwu.magisk", "/sdcard/Android/data/hh.root", "/su/bin/su", "/system/app/longeneroot.apk", "/system/app/Supersupro/Supersupro.apk", "/system/app/Superuser/Superuser.apk", "/system/bin/.ext/.su", "/system/bin/.su", "/system/bin/bdsu", "/system/bin/magisk", "/system/bin/shuamesu", "/system/bin/su", "/system/bin/sudo", "/system/bin/sutemp", "/system/usr/we-need-root/su-backup", "/system_ext/bin/su", "/data/local/bin/su", "/data/local/su", "/data/local/xbin/su", "/system/xbin/bdsu", "/system/xbin/bstk/su", "/system/xbin/daemonsu", "/system/xbin/ku.sud", "/system/xbin/mu", "/system/xbin/su", "/vendor/bin/su");
    public static final List<Pair<String, String>> LJIIJ = C1697810uHb.LJIIJJI(new Pair("/system", "system"), new Pair("/system_ext", "system_ext"), new Pair("/vendor", "vendor"), new Pair("/product", "product"));

    public static boolean LJIILLIIL() {
        try {
            String strLJIIIIZZ = LJIIIIZZ("ro.boot.flash.locked");
            if (strLJIIIIZZ != null && strLJIIIIZZ.length() > 0) {
                return Intrinsics.LJFF(strLJIIIIZZ, CardStruct.IStatusCode.DEFAULT);
            }
            String strLJIIIIZZ2 = LJIIIIZZ("ro.boot.verifiedbootstate");
            return strLJIIIIZZ2 != null && u.LJIJI(strLJIIIIZZ2, "orange", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LJJIIJZLJL() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (Intrinsics.LJFF(networkInterface.getName(), "tun0") || Intrinsics.LJFF(networkInterface.getName(), "tun1")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static Map LIZIZ() {
        int i;
        int i2;
        List<String> list = LJFF;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            LIZ.getClass();
            String strLJJIIZ = LJJIIZ(str);
            arrayList.add(C2097608Jq.LJIIIIZZ(new Pair("path", strLJJIIZ), new Pair("state", LJJIJ(strLJJIIZ))));
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Map) it2.next()).get("state"), "detected") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((Map) it3.next()).get("state"), "unknown") && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Pair[] pairArr = new Pair[2];
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("hit", Integer.valueOf(i));
        pairArr2[1] = new Pair("unknown", Integer.valueOf(i2));
        pairArr2[2] = new Pair("cloudPhone", Boolean.valueOf(i > 0));
        pairArr[0] = new Pair("summary", C2097608Jq.LJIIIIZZ(pairArr2));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.LJFF(((Map) obj).get("state"), "not_detected")) {
                arrayList2.add(obj);
            }
        }
        pairArr[1] = new Pair("items", arrayList2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static Map LIZLLL() {
        int i;
        int i2;
        List<String> list = LJI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            LIZ.getClass();
            String strLJJIIZ = LJJIIZ(str);
            arrayList.add(C2097608Jq.LJIIIIZZ(new Pair("path", strLJJIIZ), new Pair("state", LJJIJ(strLJJIIZ))));
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Map) it2.next()).get("state"), "detected") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((Map) it3.next()).get("state"), "unknown") && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        String strLJIIIIZZ = LJIIIIZZ("ro.kernel.qemu");
        Pair[] pairArr = new Pair[3];
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("hit", Integer.valueOf(i));
        pairArr2[1] = new Pair("unknown", Integer.valueOf(i2));
        pairArr2[2] = new Pair("qemu", Boolean.valueOf(Intrinsics.LJFF(strLJIIIIZZ, "1") || i > 0));
        pairArr[0] = new Pair("summary", C2097608Jq.LJIIIIZZ(pairArr2));
        if (strLJIIIIZZ == null) {
            strLJIIIIZZ = "";
        }
        pairArr[1] = new Pair("roKernelQemu", strLJIIIIZZ);
        pairArr[2] = new Pair("items", arrayList);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static Map LJFF() {
        int i;
        int i2;
        List<String> list = LJIIIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            LIZ.getClass();
            String strLJJIIZ = LJJIIZ(str);
            arrayList.add(C2097608Jq.LJIIIIZZ(new Pair("path", strLJJIIZ), new Pair("state", LJJIJ(strLJJIIZ))));
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Map) it2.next()).get("state"), "detected") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((Map) it3.next()).get("state"), "unknown") && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Pair[] pairArr = new Pair[2];
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("hit", Integer.valueOf(i));
        pairArr2[1] = new Pair("unknown", Integer.valueOf(i2));
        pairArr2[2] = new Pair("rootPath", Boolean.valueOf(i > 0));
        pairArr[0] = new Pair("summary", C2097608Jq.LJIIIIZZ(pairArr2));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.LJFF(((Map) obj).get("state"), "not_detected")) {
                arrayList2.add(obj);
            }
        }
        pairArr[1] = new Pair("items", arrayList2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static Map LJI() {
        String str;
        C1888807aY c1888807aYLJJIIZI = LJJIIZI(C1697810uHb.LJIIJJI("su", "-c", FollowStatusChangeMethod.PARAM_UID));
        boolean zLJJIIZI = a0.LJJIIZI(c1888807aYLJJIIZI.LIZ.toLowerCase(Locale.ROOT), "uid=0", false);
        if (c1888807aYLJJIIZI.LIZJ) {
            str = "unknown";
        } else {
            Integer num = c1888807aYLJJIIZI.LIZIZ;
            str = (num != null && num.intValue() == 0 && zLJJIIZI) ? "detected" : "not_detected";
        }
        return C2097608Jq.LJIIIIZZ(new Pair("state", str), new Pair("uidZero", String.valueOf(zLJJIIZI)));
    }

    public static Map LJIIIZ() {
        Object c098200Yq;
        Map mapLJIIIIZZ;
        Object obj;
        int i;
        int i2;
        Object c098200Yq2;
        Object c098200Yq3;
        Object objPrevious;
        Map mapLJIIIIZZ2;
        try {
            c098200Yq = C09RB.LJJII(C09RB.LJIJI(new C1947107jx(C09BH.LJI(new C0VSJ("/proc/mounts"), Charsets.UTF_8)), AFwS231S0000000_3.get$arr$(251)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C13BV c13bv = C13BV.INSTANCE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c13bv;
        }
        List list = (List) c098200Yq;
        List<Pair<String, String>> list2 = LJIIJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<Pair<String, String>> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Pair<String, String> next = it2.next();
            String first = next.getFirst();
            String second = next.getSecond();
            LIZ.getClass();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (Intrinsics.LJFF(((C2102108Lj) objPrevious).LIZIZ, first)) {
                    break;
                }
            }
            C2102108Lj c2102108Lj = (C2102108Lj) objPrevious;
            if (c2102108Lj == null) {
                mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(new Pair("name", second), new Pair("mountPoint", first), new Pair("device", "unknown"), new Pair("options", "unknown"), new Pair("state", "unknown"), new Pair("fsType", "unknown"), new Pair("detail", "Mount point not found"));
            } else {
                List listLJJLIIIJ = a0.LJJLIIIJ(c2102108Lj.LIZLLL, new char[]{','}, false, 0, 6);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
                Iterator it3 = listLJJLIIIJ.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(a0.LJLIIIL((String) it3.next()).toString());
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((String) obj2).length() > 0) {
                        arrayList3.add(obj2);
                    }
                }
                Set setLLIIJI = C13LP.LLIIJI(arrayList3);
                String str = setLLIIJI.contains("rw") ? "detected" : setLLIIJI.contains("ro") ? "not_detected" : "unknown";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fs=");
                sbLIZ.append(c2102108Lj.LIZJ);
                sbLIZ.append(", device=");
                sbLIZ.append(c2102108Lj.LIZ);
                mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(new Pair("name", second), new Pair("mountPoint", c2102108Lj.LIZIZ), new Pair("device", c2102108Lj.LIZ), new Pair("options", c2102108Lj.LIZLLL), new Pair("state", str), new Pair("fsType", c2102108Lj.LIZJ), new Pair("detail", C2188811AlT.LIZIZ(sbLIZ)));
            }
            arrayList.add(mapLJIIIIZZ2);
        }
        try {
            int i3 = Os.stat("/system").st_mode;
            boolean z = (OsConstants.S_IFMT & i3) == OsConstants.S_IFDIR;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(z ? "d" : "-");
            sbLIZ2.append(LJII(i3, OsConstants.S_IRUSR, OsConstants.S_IWUSR, OsConstants.S_IXUSR));
            sbLIZ2.append(LJII(i3, OsConstants.S_IRGRP, OsConstants.S_IWGRP, OsConstants.S_IXGRP));
            sbLIZ2.append(LJII(i3, OsConstants.S_IROTH, OsConstants.S_IWOTH, OsConstants.S_IXOTH));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            CharsKt__CharJVMKt.checkRadix(8);
            String strLJJJJJL = a0.LJJJJJL('0', 4, Integer.toString(i3 & 511, 8));
            try {
                c098200Yq2 = Boolean.valueOf(Os.access("/system", OsConstants.R_OK));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = bool;
            }
            boolean zBooleanValue = ((Boolean) c098200Yq2).booleanValue();
            try {
                c098200Yq3 = Boolean.valueOf(Os.access("/system", OsConstants.W_OK));
                C189200o6.m2constructorimpl(c098200Yq3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                c098200Yq3 = new C098200Yq(th3);
                C189200o6.m2constructorimpl(c098200Yq3);
            }
            Boolean bool2 = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                c098200Yq3 = bool2;
            }
            boolean zBooleanValue2 = ((Boolean) c098200Yq3).booleanValue();
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("path", "/system");
            pairArr[1] = new Pair("permission", strLIZIZ + " (" + strLJJJJJL + ") r=" + zBooleanValue + " w=" + zBooleanValue2);
            pairArr[2] = new Pair("writable", Boolean.valueOf(zBooleanValue2));
            pairArr[3] = new Pair("state", zBooleanValue2 ? "detected" : "not_detected");
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        } catch (ErrnoException e) {
            TryCatchGuardChecker.doCheck(e);
            Pair[] pairArr2 = new Pair[5];
            pairArr2[0] = new Pair("path", "/system");
            pairArr2[1] = new Pair("permission", "unknown");
            pairArr2[2] = new Pair("writable", Boolean.FALSE);
            if (e.errno == OsConstants.ENOENT) {
                obj = "not_detected";
            } else {
                int i4 = OsConstants.EACCES;
                obj = "unknown";
            }
            pairArr2[3] = new Pair("state", obj);
            String message = e.getMessage();
            pairArr2[4] = new Pair("detail", message != null ? message : "system dir access check failed");
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr2);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Pair[] pairArr3 = new Pair[5];
            pairArr3[0] = new Pair("path", "/system");
            pairArr3[1] = new Pair("permission", "unknown");
            pairArr3[2] = new Pair("writable", Boolean.FALSE);
            pairArr3[3] = new Pair("state", "unknown");
            String message2 = e2.getMessage();
            pairArr3[4] = new Pair("detail", message2 != null ? message2 : "system dir access check failed");
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr3);
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it4 = arrayList.iterator();
            i = 0;
            while (it4.hasNext()) {
                if (Intrinsics.LJFF(((Map) it4.next()).get("state"), "detected") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it5 = arrayList.iterator();
            i2 = 0;
            while (it5.hasNext()) {
                if (Intrinsics.LJFF(((Map) it5.next()).get("state"), "unknown") && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        boolean zLJFF = Intrinsics.LJFF(mapLJIIIIZZ.get("state"), "detected");
        Pair[] pairArr4 = new Pair[3];
        Pair[] pairArr5 = new Pair[3];
        pairArr5[0] = new Pair("hit", Integer.valueOf(i));
        pairArr5[1] = new Pair("unknown", Integer.valueOf(i2));
        pairArr5[2] = new Pair("systemRw", Boolean.valueOf(i > 0 || zLJFF));
        pairArr4[0] = new Pair("summary", C2097608Jq.LJIIIIZZ(pairArr5));
        pairArr4[1] = new Pair("systemDir", mapLJIIIIZZ);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!Intrinsics.LJFF(((Map) obj3).get("state"), "not_detected")) {
                arrayList4.add(obj3);
            }
        }
        pairArr4[2] = new Pair("items", arrayList4);
        return C2097608Jq.LJIIIIZZ(pairArr4);
    }

    public static Map LJIIJ() {
        int i;
        int i2;
        List<String> list = LJII;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (String str : list) {
            LIZ.getClass();
            String strLJJIIZ = LJJIIZ(str);
            arrayList.add(C2097608Jq.LJIIIIZZ(new Pair("path", strLJJIIZ), new Pair("state", LJJIJ(strLJJIIZ))));
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = arrayList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Map) it2.next()).get("state"), "detected") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((Map) it3.next()).get("state"), "unknown") && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Pair[] pairArr = new Pair[2];
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("hit", Integer.valueOf(i));
        pairArr2[1] = new Pair("unknown", Integer.valueOf(i2));
        pairArr2[2] = new Pair("nonAosp", Boolean.valueOf(i > 0));
        pairArr[0] = new Pair("summary", C2097608Jq.LJIIIIZZ(pairArr2));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.LJFF(((Map) obj).get("state"), "not_detected")) {
                arrayList2.add(obj);
            }
        }
        pairArr[1] = new Pair("items", arrayList2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static Map LJIILIIL() {
        String next;
        String string;
        String str;
        C1888807aY c1888807aYLJJIIZI = LJJIIZI(C1697810uHb.LJIIJJI("sh", "-c", "which su"));
        Iterator<String> it2 = a0.LJJJJIZL(c1888807aYLJJIIZI.LIZ).iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!(!a0.LJJJIL(next)));
        String str2 = next;
        if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            string = "";
        }
        if (c1888807aYLJJIIZI.LIZJ) {
            str = "unknown";
        } else {
            Integer num = c1888807aYLJJIIZI.LIZIZ;
            str = (num == null || num.intValue() != 0 || string.length() <= 0) ? "not_detected" : "detected";
        }
        return C2097608Jq.LJIIIIZZ(new Pair("state", str), new Pair("path", string));
    }

    public static boolean LJIJJ() {
        String str = Build.FINGERPRINT;
        String str2 = Build.MODEL;
        return u.LJJIIJZLJL(str, "generic", false) || u.LJJIIJZLJL(str, "unknown", false) || a0.LJJIIZI(str2, "google_sdk", false) || a0.LJJIIZI(str2, "Emulator", false) || a0.LJJIIZI(str2, "Android SDK built for x86", false) || a0.LJJIIZI(Build.MANUFACTURER, "Genymotion", false) || (u.LJJIIJZLJL(Build.BRAND, "generic", false) && u.LJJIIJZLJL(Build.DEVICE, "generic", false)) || Intrinsics.LJFF(Build.PRODUCT, "google_sdk");
    }

    public static boolean LJJIIJ() {
        try {
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            return (TextUtils.isEmpty(property) || (property2 != null ? CastIntegerProtector.parseInt(property2) : -1) == -1) ? false : true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LJIIZILJ() {
        Boolean bool;
        Map map;
        Object obj = LIZIZ().get("summary");
        Object obj2 = null;
        if (obj != null && (obj instanceof Map) && (map = (Map) obj) != null) {
            obj2 = map.get("cloudPhone");
        }
        if (!(obj2 instanceof Boolean) || (bool = (Boolean) obj2) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LJJI() {
        Boolean bool;
        Map map;
        Object obj = LIZLLL().get("summary");
        Object obj2 = null;
        if (obj != null && (obj instanceof Map) && (map = (Map) obj) != null) {
            obj2 = map.get("qemu");
        }
        if (!(obj2 instanceof Boolean) || (bool = (Boolean) obj2) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean LJJIFFI() {
        Boolean bool;
        Map map;
        Object obj = LJIIJ().get("summary");
        Object obj2 = null;
        if (obj != null && (obj instanceof Map) && (map = (Map) obj) != null) {
            obj2 = map.get("nonAosp");
        }
        if (!(obj2 instanceof Boolean) || (bool = (Boolean) obj2) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("enabled_accessibility_services", "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "enabled_accessibility_services", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwbfOcfZXL1mqWot3W/xJhrLjMIs=", null));
            }
            return C20123713oZ.LIZ;
        }
        return C2204961BRm.LLIIIL(contentResolver, "enabled_accessibility_services", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwbfOcfZXL1mqWot3W/xJhrLjMIs=", null));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(android.content.Context r24) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20122213oK.LIZJ(android.content.Context):java.util.Map");
    }

    public static Map LJ(Context context) {
        int i;
        int i2;
        if (context == null) {
            return C2097608Jq.LJIIIIZZ(new Pair("summary", C2097608Jq.LJIIIIZZ(new Pair("hit", 0), new Pair("unknown", 0), new Pair("rootPackage", Boolean.FALSE))), new Pair("items", C13BV.INSTANCE));
        }
        List<String> list = LJIIIIZZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (true) {
            String str = "detected";
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            LIZ.getClass();
            if (!LJJ(context, next)) {
                str = "not_detected";
            }
            arrayList.add(LJIILJJIL("package", next, str));
        }
        if (arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            i = 0;
            while (it3.hasNext()) {
                if (Intrinsics.LJFF(((Map) it3.next()).get("state"), "detected") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it4 = arrayList.iterator();
            i2 = 0;
            while (it4.hasNext()) {
                if (Intrinsics.LJFF(((Map) it4.next()).get("state"), "unknown") && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Pair[] pairArr = new Pair[2];
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("hit", Integer.valueOf(i));
        boolean z = true;
        pairArr2[1] = new Pair("unknown", Integer.valueOf(i2));
        if (i <= 0) {
            z = false;
        }
        pairArr2[2] = new Pair("rootPackage", Boolean.valueOf(z));
        pairArr[0] = new Pair("summary", C2097608Jq.LJIIIIZZ(pairArr2));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.LJFF(((Map) obj).get("state"), "not_detected")) {
                arrayList2.add(obj);
            }
        }
        pairArr[1] = new Pair("items", arrayList2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static String LJIIIIZZ(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (!(objInvoke instanceof String)) {
                return null;
            }
            return (String) objInvoke;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJIIJJI(android.content.Context r20) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20122213oK.LJIIJJI(android.content.Context):java.util.Map");
    }

    public static Map LJIIL(Context context) {
        Object c098200Yq;
        String str;
        if (context == null) {
            return C2097608Jq.LJIIIIZZ(new Pair("summary", C2097608Jq.LJIIIIZZ(new Pair("state", "unknown"), new Pair("connected", Boolean.FALSE))), new Pair("items", C13BV.INSTANCE));
        }
        try {
            Intent intentLJIJJ = C786410Ut5.LJIJJ(context, null, new IntentFilter("android.hardware.usb.action.USB_STATE"));
            if (intentLJIJJ == null) {
                c098200Yq = C2097608Jq.LJIIIIZZ(new Pair("summary", C2097608Jq.LJIIIIZZ(new Pair("state", "unknown"), new Pair("connected", Boolean.FALSE))), new Pair("items", C13BV.INSTANCE));
            } else {
                List listLJIIJJI = C1697810uHb.LJIIJJI(LJJIJIIJIL("connected", intentLJIJJ.getBooleanExtra("connected", false)), LJJIJIIJIL("configured", intentLJIJJ.getBooleanExtra("configured", false)), LJJIJIIJIL("adb", intentLJIJJ.getBooleanExtra("adb", false)), LJJIJIIJIL("mtp", intentLJIJJ.getBooleanExtra("mtp", false)), LJJIJIIJIL("ptp", intentLJIJJ.getBooleanExtra("ptp", false)), LJJIJIIJIL("rndis", intentLJIJJ.getBooleanExtra("rndis", false)), LJJIJIIJIL("midi", intentLJIJJ.getBooleanExtra("midi", false)), LJJIJIIJIL("audio_source", intentLJIJJ.getBooleanExtra("audio_source", false)));
                boolean booleanExtra = intentLJIJJ.getBooleanExtra("connected", false);
                Pair[] pairArr = new Pair[2];
                Pair[] pairArr2 = new Pair[2];
                if (!booleanExtra) {
                    str = "not_detected";
                } else {
                    str = "detected";
                }
                pairArr2[0] = new Pair("state", str);
                pairArr2[1] = new Pair("connected", Boolean.valueOf(booleanExtra));
                pairArr[0] = new Pair("summary", C2097608Jq.LJIIIIZZ(pairArr2));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJIIJJI) {
                    if (!Intrinsics.LJFF(((Map) obj).get("state"), "not_detected")) {
                        arrayList.add(obj);
                    }
                }
                pairArr[1] = new Pair("items", arrayList);
                c098200Yq = C2097608Jq.LJIIIIZZ(pairArr);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C2097608Jq.LJIIIIZZ(new Pair("summary", C2097608Jq.LJIIIIZZ(new Pair("state", "unknown"), new Pair("connected", Boolean.FALSE))), new Pair("items", C13BV.INSTANCE));
        }
        return (Map) c098200Yq;
    }

    public static boolean LJIILL(Context context) {
        Object c098200Yq;
        Object c098200Yq2;
        boolean z;
        if (context == null) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "accessibility_enabled", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            return false;
        }
        try {
            c098200Yq2 = LIZ(context.getContentResolver());
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        String str = (String) c098200Yq2;
        if (str == null) {
            str = "";
        }
        return !a0.LJJJIL(str);
    }

    public static boolean LJIJ(Context context) {
        if (context == null) {
            return false;
        }
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) <= 0 && (context.getApplicationInfo().flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static boolean LJIJI(Context context) {
        if (context == null || Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJLI(Context context) {
        Boolean bool;
        Map map;
        Object obj = LIZJ(context).get("summary");
        Object obj2 = null;
        if (obj != null && (obj instanceof Map) && (map = (Map) obj) != null) {
            obj2 = map.get("hook");
        }
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean LJIL(Context context) {
        if (context != null) {
            String str = context.getApplicationInfo().processName;
            String packageName = context.getPackageName();
            List<String> listLJIIJJI = C1697810uHb.LJIIJJI("clone", "dual", "parallel", "multi", "island", "virtual", "shadow");
            if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
                for (String str2 : listLJIIJJI) {
                    if (a0.LJJIIZI(packageName, str2, true) || a0.LJJIIZI(str, str2, true)) {
                        return true;
                    }
                }
            }
            List listLJIIJJI2 = C1697810uHb.LJIIJJI("com.lbe.parallel", "com.parallel.space", "com.oasisfeng.island", "com.tencent.multiopen", "com.tencent.mobileqqi");
            PackageManager packageManager = context.getPackageManager();
            if (!(listLJIIJJI2 instanceof Collection) || !listLJIIJJI2.isEmpty()) {
                Iterator it2 = listLJIIJJI2.iterator();
                while (it2.hasNext()) {
                    try {
                        C786410Ut5.Y3(packageManager, (String) it2.next(), 0);
                        return true;
                    } catch (PackageManager.NameNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJJII(Context context) {
        Map map;
        Object obj;
        Integer num;
        Object obj2 = LJIIJJI(context).get("summary");
        if (obj2 != null && (obj2 instanceof Map) && (map = (Map) obj2) != null && (obj = map.get("video")) != null && (obj instanceof Integer) && (num = (Integer) obj) != null && num.intValue() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LJJIII(Context context) {
        Intent intentLJIJJ;
        if (context == null || (intentLJIJJ = C786410Ut5.LJIJJ(context, null, new IntentFilter("android.hardware.usb.action.USB_STATE"))) == null) {
            return false;
        }
        return intentLJIJJ.getBooleanExtra("connected", false);
    }

    public static String LJJIIZ(String str) {
        if (!u.LJJIIJZLJL(str, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('/');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static C1888807aY LJJIIZI(List list) {
        Process processStart;
        C1888807aY c1888807aY;
        C098200Yq c098200Yq;
        boolean z;
        Unit unit = null;
        try {
            processStart = new ProcessBuilder((List<String>) list).redirectErrorStream(true).start();
            try {
                StringBuilder sb = new StringBuilder();
                Future<?> futureSubmit = C823050WQl.LIZLLL().submit(new ARunnableS72S0200000_3(processStart, sb, 50));
                long jCurrentTimeMillis = System.currentTimeMillis() + 2000;
                while (true) {
                    if (System.currentTimeMillis() < jCurrentTimeMillis) {
                        try {
                            processStart.exitValue();
                            z = true;
                            break;
                        } catch (IllegalThreadStateException e) {
                            TryCatchGuardChecker.doCheck(e);
                            Thread.sleep(20L);
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    processStart.destroy();
                    try {
                        C189200o6.m2constructorimpl(futureSubmit.get(500L, TimeUnit.MILLISECONDS));
                    } catch (Throwable th) {
                    }
                    c1888807aY = new C1888807aY(null, a0.LJLIIIL(sb.toString()).toString(), true);
                } else {
                    try {
                        C189200o6.m2constructorimpl(futureSubmit.get(500L, TimeUnit.MILLISECONDS));
                    } catch (Throwable th2) {
                    }
                    c1888807aY = new C1888807aY(Integer.valueOf(processStart.exitValue()), a0.LJLIIIL(sb.toString()).toString(), false);
                }
                try {
                    processStart.destroy();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return c1888807aY;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq);
                    return c1888807aY;
                }
            } catch (Throwable th4) {
                th = th4;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    c1888807aY = new C1888807aY(null, "", false);
                    if (processStart != null) {
                        try {
                            processStart.destroy();
                            unit = Unit.LIZ;
                        } catch (Throwable th5) {
                            TryCatchGuardChecker.doCheck(th5);
                            c098200Yq = new C098200Yq(th5);
                            C189200o6.m2constructorimpl(c098200Yq);
                            return c1888807aY;
                        }
                    }
                    C189200o6.m2constructorimpl(unit);
                    return c1888807aY;
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    if (processStart != null) {
                        try {
                            processStart.destroy();
                            unit = Unit.LIZ;
                        } finally {
                            TryCatchGuardChecker.doCheck(th2);
                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                        }
                    }
                    C189200o6.m2constructorimpl(unit);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            processStart = null;
        }
    }

    public static String LJJIJ(String str) {
        try {
            Os.stat(str);
            return "detected";
        } catch (ErrnoException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = e.errno;
            if (i == OsConstants.ENOENT) {
                return "not_detected";
            }
            if (i != OsConstants.EACCES) {
            }
            return "unknown";
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return "unknown";
        }
    }

    public static Map LJJIJIIJI(UsbDevice usbDevice) {
        List listSingletonList;
        int interfaceCount = usbDevice.getInterfaceCount();
        ArrayList arrayList = new ArrayList(interfaceCount);
        for (int i = 0; i < interfaceCount; i++) {
            arrayList.add(Integer.valueOf(usbDevice.getInterface(i).getInterfaceClass()));
        }
        if (usbDevice.getDeviceClass() == 0) {
            listSingletonList = arrayList;
        } else {
            listSingletonList = Collections.singletonList(Integer.valueOf(usbDevice.getDeviceClass()));
        }
        boolean zContains = listSingletonList.contains(1);
        boolean zContains2 = listSingletonList.contains(14);
        boolean zContains3 = listSingletonList.contains(8);
        boolean zContains4 = listSingletonList.contains(3);
        C13DA c13da = new C13DA();
        c13da.put("state", "detected");
        c13da.put("deviceName", usbDevice.getDeviceName());
        c13da.put("vendorId", Integer.valueOf(usbDevice.getVendorId()));
        c13da.put("productId", Integer.valueOf(usbDevice.getProductId()));
        c13da.put("deviceClass", Integer.valueOf(usbDevice.getDeviceClass()));
        c13da.put("deviceSubclass", Integer.valueOf(usbDevice.getDeviceSubclass()));
        c13da.put("deviceProtocol", Integer.valueOf(usbDevice.getDeviceProtocol()));
        c13da.put("interfaceCount", Integer.valueOf(usbDevice.getInterfaceCount()));
        c13da.put("interfaceClasses", arrayList);
        c13da.put("hasAudioInterface", Boolean.valueOf(zContains));
        c13da.put("hasVideoInterface", Boolean.valueOf(zContains2));
        c13da.put("hasStorageInterface", Boolean.valueOf(zContains3));
        c13da.put("hasHidInterface", Boolean.valueOf(zContains4));
        String manufacturerName = usbDevice.getManufacturerName();
        if (manufacturerName != null) {
            c13da.put("manufacturerName", manufacturerName);
        }
        String productName = usbDevice.getProductName();
        if (productName != null) {
            c13da.put("productName", productName);
        }
        return c13da.build();
    }

    public static boolean LJJ(Context context, String str) {
        Object c098200Yq;
        Object c098200Yq2;
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                c098200Yq2 = C2204961BRm.LJJJJLI(context.getPackageManager(), str, PackageManager.PackageInfoFlags.of(0L), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAzCCl6sXrQ8QP2B62SNTVjw9zgQhMeLolvaMglKlOZEh6SiH6h7lKwbfOcfZXL1mqWot3W/xJhrLjMIs=", null));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            return C189200o6.m8isSuccessimpl(c098200Yq2);
        }
        try {
            c098200Yq = C786410Ut5.Y3(context.getPackageManager(), str, 0);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return C189200o6.m8isSuccessimpl(c098200Yq);
    }

    public static Map LJJIJIIJIL(String str, boolean z) {
        String str2;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("name", str);
        pairArr[1] = new Pair("value", String.valueOf(z));
        if (z) {
            str2 = "detected";
        } else {
            str2 = "not_detected";
        }
        pairArr[2] = new Pair("state", str2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public static Map LJIILJJIL(String str, String str2, String str3) {
        return C2097608Jq.LJIIIIZZ(new Pair("name", str), new Pair("detail", str2), new Pair("state", str3));
    }

    public static final String LJII(int i, int i2, int i3, int i4) {
        boolean z;
        char c;
        char c2;
        if ((i2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        char c3 = '-';
        if (z) {
            c = 'r';
        } else {
            c = '-';
        }
        if ((i3 & i) != 0) {
            c2 = 'w';
        } else {
            c2 = '-';
        }
        if ((i & i4) != 0) {
            c3 = 'x';
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c);
        sbLIZ.append(c2);
        sbLIZ.append(c3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
