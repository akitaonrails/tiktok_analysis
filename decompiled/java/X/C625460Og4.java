package X;

import android.app.Application;
import android.content.Context;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Og4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625460Og4 {
    public static final C625460Og4 LIZ;
    public static C054G LIZIZ;
    public static volatile boolean LIZJ;
    public static final C19319410i8 LIZLLL;
    public static final IAccountUserService LJ;
    public static EnumC625700OgS LJFF;

    static {
        C625460Og4 c625460Og4 = new C625460Og4();
        LIZ = c625460Og4;
        LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ);
        LIZLLL = new C19319410i8("OfflineModeCacheVideoManager");
        LJ = C0XQ7.LJFF();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        LJFF = (!C0XF1.LIZLLL(contextLIZ) || C1BMD.LIZIZ.getEffectiveConnectionType() <= 1) ? EnumC625700OgS.NETWORK_NO : C0XF1.LJ(contextLIZ) ? EnumC625700OgS.NETWORK_WIFI : EnumC625700OgS.NETWORK_MOBILE;
        if (C625820Oge.LIZ()) {
            C622680Oba.LIZJ(c625460Og4);
            C1BMD.LIZIZ.addEffectiveConnectionTypeChangedListener(new C1BMO() { // from class: X.0OgX
                @Override // X.C1BMO
                public final void onEffectiveConnectionTypeChanged(int i) {
                    if (C625460Og4.LJFF == EnumC625700OgS.NETWORK_NO && i > 1) {
                        C625460Og4.LIZ.getClass();
                        C625460Og4.LJIILL();
                    }
                }
            });
        }
    }

    public static void LIZJ() {
        String strLIZIZ;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
            sbLIZ2.append(C1478160oZK.LIZ().LJIJJ());
            sbLIZ2.append("/offlinemode/");
            sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
            String curSecUserId = LJ.getCurSecUserId();
            if (curSecUserId == null) {
                strLIZIZ = null;
            } else {
                sbLIZ.append(curSecUserId);
                sbLIZ.append('/');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            C0VSJ c0vsj = new C0VSJ(strLIZIZ);
            if (c0vsj.exists()) {
                String strLJIIIIZZ = LJIIIIZZ();
                C0VSJ c0vsj2 = new C0VSJ(strLJIIIIZZ);
                C2354709Kn.LJFF(strLJIIIIZZ, false);
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        C0VSJ c0vsj3 = new C0VSJ(c0vsj2, file.getName());
                        if (c0vsj3.exists()) {
                            c0vsj3.delete();
                        }
                        if (!file.renameTo(c0vsj3)) {
                            C19319410i8 c19319410i8 = LIZLLL;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("cache file move failed ");
                            sbLIZ3.append(file.getName());
                            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                }
                if (c0vsj.exists() && c0vsj.isDirectory()) {
                    C08QA.LJIIZILJ(c0vsj);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                LruCache<String, SimVideoUrlModel> lruCache2 = C1483340ohg.LIZ;
                sbLIZ4.append(C1478160oZK.LIZ().LJIJJ());
                sbLIZ4.append("/offlinemode/");
                C0VSJ c0vsj4 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
                if (c0vsj4.exists()) {
                    File[] fileArrListFiles2 = c0vsj4.listFiles();
                    if (fileArrListFiles2 == null || fileArrListFiles2.length == 0) {
                        C08QA.LJIIZILJ(c0vsj4);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i82 = LIZLLL;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("checkCacheDir failed: ");
            sbLIZ5.append(e);
            c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public static void LJ() {
        try {
            LIZLLL.LJIIIZ("In clearOfflineFile()");
            C0VSJ c0vsj = new C0VSJ(LJI());
            if (c0vsj.exists() && c0vsj.isDirectory()) {
                C08QA.LJIIZILJ(c0vsj);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i8 = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("delete cache file failed ");
            sbLIZ.append(e);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static String LJI() throws Throwable {
        String absolutePath;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        Context applicationContext = null;
        if (C1475000oUE.LIZIZ().isDebug() && C786410Ut5.y2(contextLIZ, null) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            File fileY2 = C786410Ut5.y2(contextLIZ, null);
            if (fileY2 == null || (absolutePath = fileY2.getAbsolutePath()) == null) {
                absolutePath = "";
            }
            sbLIZ.append(absolutePath);
            sbLIZ.append("/offlinemode/");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextLIZ.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    if (obj instanceof Application) {
                        applicationContext = ((Application) obj).getApplicationContext();
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Application context obtained through ActivityThread: ");
                        sbLIZ3.append(applicationContext);
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ3));
                    } else {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Error: ");
                    sbLIZ4.append(e.getMessage());
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ4));
                }
                if (applicationContext == null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(th.getMessage());
                    sbLIZ5.append(":");
                    sbLIZ5.append(C08RN.LIZJ());
                    sbLIZ5.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ5));
                }
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            }
            file = C786450Ut9.LIZJ;
        }
        sbLIZ2.append(file.getAbsolutePath());
        sbLIZ2.append("/offlinemode/");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJIILL() {
        EnumC625700OgS enumC625700OgS;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        boolean z = true;
        if (C0XF1.LIZLLL(contextLIZ) && C1BMD.LIZIZ.getEffectiveConnectionType() > 1) {
            z = false;
        }
        boolean zLIZJ = C0XF1.LIZJ(contextLIZ);
        boolean zLJ = C0XF1.LJ(contextLIZ);
        if (z) {
            if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
                LJIILLIIL(false);
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NO_NETWORK);
                LJIIJJI(EnumC624960OfG.NO_NET.getValue());
            }
            enumC625700OgS = EnumC625700OgS.NETWORK_NO;
        } else if (zLIZJ) {
            if (C625420Og0.LJIIIZ() && C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
                LJIILLIIL(false);
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NOT_WIFI);
                LJIIJJI(EnumC624960OfG.NOT_WIFI.getValue());
            }
            enumC625700OgS = EnumC625700OgS.NETWORK_MOBILE;
        } else if (!zLJ) {
            return;
        } else {
            enumC625700OgS = EnumC625700OgS.NETWORK_WIFI;
        }
        LJFF = enumC625700OgS;
        C625470Og5.LL.getClass();
        Iterator<InterfaceC625450Og3> it2 = C625470Og5.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().cU1();
        }
        C19319410i8 c19319410i8 = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onNetworkChangeInner] networkState: ");
        sbLIZ.append(LJFF);
        sbLIZ.append(", isNoNet: ");
        sbLIZ.append(z);
        sbLIZ.append(", type: ");
        sbLIZ.append(C1BMD.LIZIZ.getEffectiveConnectionType());
        sbLIZ.append(", isMobile: ");
        sbLIZ.append(zLIZJ);
        sbLIZ.append(", isWifi: ");
        sbLIZ.append(zLJ);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        if (C625420Og0.LJFF().isPauseByNet()) {
            if (C0WYJ.LJI() < 2147483648L) {
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_STORAGE);
                return;
            }
            if (z) {
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NO_NETWORK);
                return;
            }
            if (zLIZJ && C625420Og0.LJIIIZ()) {
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NOT_WIFI);
            } else if (zLJ || (zLIZJ && !C625420Og0.LJIIIZ())) {
                C625470Og5.LL.LLJJIII(EnumC624980OfI.SYSTEM_RESUME);
            }
        }
    }

    public static EnumC624960OfG LIZIZ() {
        if (C0WYJ.LJI() < 2147483648L) {
            if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
                LJIILLIIL(false);
                LJIIJJI(EnumC624960OfG.STORAGE_NOT_ENOUGH.getValue());
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_STORAGE);
            }
            LIZLLL.LJIIIZ("Pause for storage");
            return EnumC624960OfG.STORAGE_NOT_ENOUGH;
        }
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
                LJIILLIIL(false);
                LJIIJJI(EnumC624960OfG.NO_NET.getValue());
                C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NO_NETWORK);
            }
            LIZLLL.LJIIIZ("Pause for no network");
            return EnumC624960OfG.NO_NET;
        }
        if (C0XF1.LJ(C844470XAv.LIZ()) || !C625420Og0.LJIIIZ()) {
            return null;
        }
        if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
            LJIILLIIL(false);
            LJIIJJI(EnumC624960OfG.NOT_WIFI.getValue());
            C625420Og0.LJIILIIL(EnumC624770Oex.PAUSE_NOT_WIFI);
        }
        LIZLLL.LJIIIZ("Pause for not wifi");
        return EnumC624960OfG.NOT_WIFI;
    }

    public static void LJFF() {
        try {
            String strLJIIIIZZ = LJIIIIZZ();
            C625530OgB.LIZ.getClass();
            InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
            String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
            Set setLLIIIZ = C13LP.LLIIIZ(curSecUserId == null ? C13BV.INSTANCE : interfaceC625570OgFLIZLLL.LJJJ(curSecUserId));
            if (Intrinsics.LJFF(strLJIIIIZZ, LJIIIIZZ())) {
                C0VSJ c0vsj = new C0VSJ(strLJIIIIZZ);
                C19319410i8 c19319410i8 = LIZLLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("files size before deleting invalid file: ");
                File[] fileArrListFiles = c0vsj.listFiles();
                sbLIZ.append(fileArrListFiles != null ? Integer.valueOf(fileArrListFiles.length) : null);
                c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                File[] fileArrListFiles2 = c0vsj.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file : fileArrListFiles2) {
                        if (!setLLIIIZ.contains(C08QA.LJIJI(file))) {
                            file.delete();
                        }
                    }
                }
                C19319410i8 c19319410i82 = LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("files size after deleting invalid file: ");
                File[] fileArrListFiles3 = c0vsj.listFiles();
                sbLIZ2.append(fileArrListFiles3 != null ? Integer.valueOf(fileArrListFiles3.length) : null);
                c19319410i82.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i83 = LIZLLL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("deleteInvalidFile failed: ");
            sbLIZ3.append(e);
            c19319410i83.LJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static long LJII() {
        try {
            return C2112608Pk.LJI(new C0VSJ(LJIIIIZZ()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i8 = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUserVideoCacheSize() failed : ");
            sbLIZ.append(e);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
    }

    public static String LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJI());
        String curSecUserId = LJ.getCurSecUserId();
        if (curSecUserId == null) {
            return null;
        }
        sbLIZ.append(curSecUserId);
        sbLIZ.append('/');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(List list) {
        List<String> listLJJIII;
        Object next;
        C19319410i8 c19319410i8 = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear cache videos: ");
        sbLIZ.append(list);
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (list.isEmpty()) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1483340ohg.LJJIIZI((String) it2.next());
        }
        C625530OgB.LIZ.getClass();
        InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
        String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
        if (curSecUserId == null) {
            listLJJIII = C13BV.INSTANCE;
        } else {
            listLJJIII = interfaceC625570OgFLIZLLL.LJJIII(curSecUserId, list);
        }
        try {
            LIZLLL.LJIIIZ("in clearOfflineFileByUrlKeys()");
            C0VSJ c0vsj = new C0VSJ(LJIIIIZZ());
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null) {
                long length = 0;
                for (File file : fileArrListFiles) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : listLJJIII) {
                        if (C123100dR.LIZ(str)) {
                            arrayList.add(str);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (u.LJJIIJZLJL(C08QA.LJIJI(file), (String) next, false)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    String str2 = (String) next;
                    if (C123100dR.LIZ(str2)) {
                        linkedHashSet.add(str2);
                        length += file.length();
                        file.delete();
                    }
                }
                if (length > 0) {
                    LJIIIZ(linkedHashSet.size(), length, EnumC625440Og2.AUTO_CLEAR);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C19319410i8 c19319410i82 = LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("clearOfflineFileByUrlKeys file failed ");
            sbLIZ2.append(e);
            c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LJIIJ(String str) {
        C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_dash_video", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108866, 131071);
    }

    public static void LJIIJJI(int i) {
        if (!C625420Og0.LJIIIIZZ().getBoolean("HAS_DOWNLOAD_START", false)) {
            return;
        }
        C625420Og0.LJIIIIZZ().LIZLLL("HAS_DOWNLOAD_START", false);
        C625420Og0.LJIIIIZZ().LIZJ("keva_end_reason", i);
        int iLIZJ = C625420Og0.LIZJ();
        C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_cache_load_end", null, null, null, null, Integer.valueOf(iLIZJ), null, null, Integer.valueOf(i), Long.valueOf((long) Math.ceil(C625420Og0.LIZIZ())), null, null, null, Long.valueOf(System.currentTimeMillis() - C625420Og0.LJIIIIZZ().getLong("key_start_time_millis", 0L)), Integer.valueOf(C814420VxA.LIZ(((((double) iLIZJ) * 1.0d) / ((double) C625420Og0.LIZ())) * ((double) 100))), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25378, 131071);
    }

    public static void LJIIL(EnumC624980OfI enumC624980OfI) {
        Integer numValueOf;
        if (C625420Og0.LJIIIIZZ().getBoolean("HAS_DOWNLOAD_START", false)) {
            return;
        }
        C625420Og0.LJIIIIZZ().LIZLLL("HAS_DOWNLOAD_START", true);
        C625130OfX c625130OfX = C625130OfX.LIZ;
        Integer numValueOf2 = Integer.valueOf(enumC624980OfI.getValue());
        if (C625420Og0.LJIIIIZZ().getInt("keva_end_reason", -1) == -1) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(C625420Og0.LJIIIIZZ().getInt("keva_end_reason", -1));
        }
        C625130OfX.LJ(c625130OfX, "offline_mode_cache_load_start", null, null, null, null, null, null, numValueOf2, numValueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C625420Og0.LJII(), null, null, -386, 114687);
        C625420Og0.LJIIIIZZ().LIZJ("keva_end_reason", -1);
        C625420Og0.LJIIIIZZ().LJIIIIZZ("key_start_time_millis", System.currentTimeMillis());
    }

    public static void LJIILJJIL(String str) {
        C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_multi_bitrate", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108866, 131071);
    }

    public static void LJIILLIIL(boolean z) {
        LIZLLL.LJIIIZ("pause download");
        if (z) {
            if (C625420Og0.LJFF() == EnumC624770Oex.DOWNLOADING) {
                LJIIJJI(EnumC624960OfG.USER_PAUSE.getValue());
            }
            C625420Og0.LJIILIIL(EnumC624770Oex.USER_PAUSE);
            C625420Og0.LJIIIIZZ().LIZLLL("HAS_DOWNLOAD_START", false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("offline_mode.");
        String curSecUserId = LJ.getCurSecUserId();
        if (curSecUserId == null) {
            return;
        }
        sbLIZ.append(curSecUserId);
        C1483340ohg.LJJIIZI(C2188811AlT.LIZIZ(sbLIZ));
    }

    @C14EU
    public final void onNetworkChangeEvent(C2411409ce c2411409ce) {
        LJIILL();
    }

    public static void LIZ(List list, final EnumC624980OfI enumC624980OfI, final InterfaceC1631620sYq interfaceC1631620sYq) {
        Video video;
        List<BitRate> listLLD;
        List<BitRate> bitRate;
        final String str;
        Video video2;
        List<BitRate> listLLD2;
        List<BitRate> bitRate2;
        UrlModel originCover;
        List<String> urlList;
        LIZLLL.LJIIIZ("in cacheVideos()");
        if (!list.isEmpty() && LIZIZ() == null && C625420Og0.LJFF() != EnumC624770Oex.USER_PAUSE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("offline_mode.");
            String curSecUserId = LJ.getCurSecUserId();
            if (curSecUserId == null) {
                return;
            }
            sbLIZ.append(curSecUserId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            String strLJIIIIZZ = LJIIIIZZ();
            if (strLJIIIIZZ == null) {
                return;
            }
            boolean zLIZ = C279670Axh.LIZ();
            String strLJIIIIZZ2 = LJIIIIZZ();
            if (strLJIIIIZZ2 != null) {
                C2354709Kn.LJFF(strLJIIIIZZ2, false);
            }
            C1478160oZK.LIZ().LJIJJLI();
            int i = 1;
            int i2 = Integer.MAX_VALUE;
            if (zLIZ) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = (Aweme) it2.next();
                    final String aid = aweme.getAid();
                    Video video3 = aweme.getVideo();
                    if (video3 != null && (originCover = video3.getOriginCover()) != null && (urlList = originCover.getUrlList()) != null) {
                        str = (String) C13LP.LJJJLL(urlList);
                    } else {
                        str = null;
                    }
                    if (aweme.getVideo() != null && (video2 = aweme.getVideo()) != null) {
                        Video video4 = aweme.getVideo();
                        if (video4 != null && (bitRate2 = video4.getBitRate()) != null) {
                            listLLD2 = C13LP.LLD(i, bitRate2);
                        } else {
                            listLLD2 = null;
                        }
                        video2.setBitRate(listLLD2);
                    }
                    String strLIZJ = C1483340ohg.LIZJ(aweme, new C0NI4(Integer.MAX_VALUE, EnumC591520NHy.PRELOAD_TASK_PRIORITY_LOW, new C0NIL(strLJIIIIZZ, strLIZIZ), new InterfaceC1475420oUu() { // from class: X.0OgG
                        @Override // X.InterfaceC1475420oUu
                        public final /* synthetic */ void LIZIZ(int i3, long j, String str2, String str3) {
                        }

                        @Override // X.InterfaceC1475420oUu
                        public final void LIZ(int i3, long j, long j2, String str2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("offline_mode.");
                            String curSecUserId2 = C625460Og4.LJ.getCurSecUserId();
                            if (curSecUserId2 == null) {
                                return;
                            }
                            sbLIZ2.append(curSecUserId2);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            if (C123100dR.LIZ(str2) && u.LJJIIJZLJL(str2, strLIZIZ2, false)) {
                                if (i3 != 2) {
                                    if (i3 != 3) {
                                        if (i3 != 5) {
                                            if (i3 != 7) {
                                                if (i3 == 8) {
                                                    C19319410i8 c19319410i8 = C625460Og4.LIZLLL;
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("start downloading ");
                                                    sbLIZ3.append(aid);
                                                    c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                                    C23250099c.LIZLLL(C625460Og4.LIZIZ, null, null, new C625500Og8(aid, enumC624980OfI, str, interfaceC1631620sYq, i3, null), 3);
                                                    return;
                                                }
                                                return;
                                            }
                                            C19319410i8 c19319410i82 = C625460Og4.LIZLLL;
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("task added aid: ");
                                            sbLIZ4.append(aid);
                                            c19319410i82.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                            return;
                                        }
                                        C19319410i8 c19319410i83 = C625460Og4.LIZLLL;
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("cancel download ");
                                        sbLIZ5.append(aid);
                                        c19319410i83.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5));
                                        return;
                                    }
                                    C19319410i8 c19319410i84 = C625460Og4.LIZLLL;
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("download failed ");
                                    sbLIZ6.append(aid);
                                    c19319410i84.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ6));
                                    return;
                                }
                                C23250099c.LIZLLL(C625460Og4.LIZIZ, null, null, new C625490Og7(aid, j, j2, interfaceC1631620sYq, i3, null), 3);
                                return;
                            }
                            if (!C123100dR.LIZ(str2) || !u.LJJIIJZLJL(str2, "offline_mode.", false)) {
                                return;
                            }
                            C1483340ohg.LJJIIZI(str2);
                        }
                    }));
                    if (((Boolean) C261690ANj.LIZ.getValue()).booleanValue()) {
                        try {
                            C1483340ohg.LJJIIJ(aweme);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C19319410i8 c19319410i8 = LIZLLL;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("preloadSubForOffline failed for ");
                            sbLIZ2.append(aid);
                            sbLIZ2.append(": ");
                            sbLIZ2.append(e);
                            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    C23250099c.LIZLLL(LIZIZ, null, null, new C591810NJb(strLIZJ, aid, null), 3);
                    i = 1;
                }
                return;
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final Aweme aweme2 = (Aweme) it3.next();
                if (aweme2.getVideo() != null && (video = aweme2.getVideo()) != null) {
                    Video video5 = aweme2.getVideo();
                    if (video5 != null && (bitRate = video5.getBitRate()) != null) {
                        listLLD = C13LP.LLD(1, bitRate);
                    } else {
                        listLLD = null;
                    }
                    video.setBitRate(listLLD);
                }
                String strLIZJ2 = C1483340ohg.LIZJ(aweme2, new C0NI4(i2, EnumC591520NHy.PRELOAD_TASK_PRIORITY_LOW, new C0NIL(strLJIIIIZZ, strLIZIZ), new InterfaceC1475420oUu() { // from class: X.0Og9
                    @Override // X.InterfaceC1475420oUu
                    public final /* synthetic */ void LIZIZ(int i3, long j, String str2, String str3) {
                    }

                    @Override // X.InterfaceC1475420oUu
                    public final void LIZ(int i3, long j, long j2, String str2) {
                        UrlModel originCover2;
                        List<String> urlList2;
                        String str3;
                        UrlModel originCover3;
                        List<String> urlList3;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("offline_mode.");
                        String curSecUserId2 = C625460Og4.LJ.getCurSecUserId();
                        if (curSecUserId2 == null) {
                            return;
                        }
                        sbLIZ3.append(curSecUserId2);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        if (C123100dR.LIZ(str2) && u.LJJIIJZLJL(str2, strLIZIZ2, false)) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 5) {
                                        if (i3 != 7) {
                                            if (i3 == 8) {
                                                C19319410i8 c19319410i82 = C625460Og4.LIZLLL;
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("start downloading ");
                                                sbLIZ4.append(aweme2.getAid());
                                                c19319410i82.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                                InterfaceC1631620sYq<Integer, Aweme, InterfaceC497601wk, Boolean> interfaceC1631620sYq2 = interfaceC1631620sYq;
                                                if (interfaceC1631620sYq2 != null && interfaceC1631620sYq2.invoke(Integer.valueOf(i3), aweme2, C625460Og4.LIZIZ).booleanValue()) {
                                                    return;
                                                }
                                                C625460Og4.LIZ.getClass();
                                                if (C625460Og4.LIZIZ() == null && C625420Og0.LJFF() != EnumC624770Oex.USER_PAUSE && C625420Og0.LJFF() != EnumC624770Oex.UNINITIALIZED) {
                                                    if (!C625460Og4.LIZJ && enumC624980OfI == EnumC624980OfI.SYSTEM_RESUME && C625420Og0.LJIIIIZZ().getInt("keva_end_reason", -1) == -1) {
                                                        C625460Og4.LIZJ = true;
                                                        C625460Og4.LJIIJJI(EnumC624960OfG.OTHERS.getValue());
                                                    }
                                                    if (!C625420Og0.LJIIIIZZ().getBoolean("HAS_DOWNLOAD_START", false) && C625420Og0.LIZJ() < C625420Og0.LIZ()) {
                                                        C625460Og4.LIZJ = true;
                                                        C625460Og4.LJIIL(enumC624980OfI);
                                                        C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADING);
                                                    }
                                                    Video video6 = aweme2.getVideo();
                                                    if (video6 != null && (originCover2 = video6.getOriginCover()) != null && (urlList2 = originCover2.getUrlList()) != null && (!urlList2.isEmpty())) {
                                                        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                                                        Video video7 = aweme2.getVideo();
                                                        if (video7 != null && (originCover3 = video7.getOriginCover()) != null && (urlList3 = originCover3.getUrlList()) != null) {
                                                            str3 = (String) ListProtector.get(urlList3, 0);
                                                        } else {
                                                            str3 = null;
                                                        }
                                                        c1325540kbALIZ.LJIJ(C1325710kbR.LIZIZ(str3), null);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                sbLIZ5.append("downloadState: ");
                                                sbLIZ5.append(C625420Og0.LJFF());
                                                sbLIZ5.append("  pause download and return");
                                                c19319410i82.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5));
                                                C625460Og4.LJIILLIIL(false);
                                                return;
                                            }
                                            return;
                                        }
                                        C19319410i8 c19319410i83 = C625460Og4.LIZLLL;
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append("task added aid: ");
                                        sbLIZ6.append(aweme2.getAid());
                                        c19319410i83.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ6));
                                        return;
                                    }
                                    C19319410i8 c19319410i84 = C625460Og4.LIZLLL;
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("cancel download ");
                                    sbLIZ7.append(aweme2.getAid());
                                    c19319410i84.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ7));
                                    return;
                                }
                                C19319410i8 c19319410i85 = C625460Og4.LIZLLL;
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("download failed ");
                                sbLIZ8.append(aweme2.getAid());
                                c19319410i85.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ8));
                                return;
                            }
                            C19319410i8 c19319410i86 = C625460Og4.LIZLLL;
                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                            sbLIZ9.append("preload succeed ");
                            sbLIZ9.append(aweme2.getAid());
                            sbLIZ9.append(' ');
                            sbLIZ9.append(j);
                            sbLIZ9.append(' ');
                            sbLIZ9.append(j2);
                            c19319410i86.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ9));
                            InterfaceC1631620sYq<Integer, Aweme, InterfaceC497601wk, Boolean> interfaceC1631620sYq3 = interfaceC1631620sYq;
                            if (interfaceC1631620sYq3 != null && interfaceC1631620sYq3.invoke(Integer.valueOf(i3), aweme2, C625460Og4.LIZIZ).booleanValue()) {
                                return;
                            }
                            if (C625420Og0.LJFF() != EnumC624770Oex.DOWNLOADING) {
                                if (C625420Og0.LIZJ() >= C625420Og0.LIZ()) {
                                    C625420Og0.LJIILIIL(EnumC624770Oex.DOWNLOADED);
                                    return;
                                }
                                return;
                            } else {
                                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                sbLIZ10.append("download complete ");
                                sbLIZ10.append(aweme2.getAid());
                                c19319410i86.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ10));
                                C23250099c.LIZLLL(C625460Og4.LIZIZ, null, null, new C625540OgC(aweme2, null), 3);
                                return;
                            }
                        }
                        if (C123100dR.LIZ(str2) && u.LJJIIJZLJL(str2, "offline_mode.", false)) {
                            C1483340ohg.LJJIIZI(str2);
                        }
                    }
                }));
                if (((Boolean) C261690ANj.LIZ.getValue()).booleanValue()) {
                    try {
                        C1483340ohg.LJJIIJ(aweme2);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C19319410i8 c19319410i82 = LIZLLL;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("preloadSubForOffline failed for ");
                        sbLIZ3.append(aweme2.getAid());
                        sbLIZ3.append(": ");
                        sbLIZ3.append(e2);
                        c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                C23250099c.LIZLLL(LIZIZ, null, null, new C591800NJa(aweme2, strLIZJ2, null), 3);
                i2 = Integer.MAX_VALUE;
            }
        }
    }

    public static void LJIIIZ(int i, long j, EnumC625440Og2 enumC625440Og2) {
        String str;
        C625130OfX c625130OfX = C625130OfX.LIZ;
        long jCeil = (long) Math.ceil(j / 1024.0d);
        String value = enumC625440Og2.getValue();
        if (enumC625440Og2 != EnumC625440Og2.CLICK_CLEAR_ICON) {
            str = null;
        } else if (C625420Og0.LIZJ() == C625420Og0.LIZ()) {
            str = "2";
        } else {
            str = "1";
        }
        C625130OfX.LJ(c625130OfX, "offline_mode_cache_clear", null, null, null, null, Integer.valueOf(i), null, null, null, Long.valueOf(jCeil), str, value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(C625420Og0.LJI()), null, -3618, 98303);
    }

    public static void LJIILIIL(Integer num, Integer num2, String str) {
        C625130OfX.LJ(C625130OfX.LIZ, "offline_mode_download_model_failed", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, num, num2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -939524098, 131071);
    }
}
