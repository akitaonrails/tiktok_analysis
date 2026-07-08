package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.task.resaltas.ResAltasConfig;
import com.ss.android.ugc.aweme.task.resaltas.TargetedSamplingConfig;
import com.ss.android.ugc.aweme.task.resaltas.WindowConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BAC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BAC {
    public static InterfaceC1790030wgL LIZJ;
    public static int LJFF;
    public static C1BAE LJI;
    public static C19372510qh LJII;
    public static C19371910qb LJIIIIZZ;
    public static C1160850gJX LJIIIZ;
    public static volatile boolean LJIILIIL;
    public static ResAltasConfig LJIILLIIL;
    public static Context LJIIZILJ;
    public static String LJIJ;
    public static C0VSJ LJIJI;
    public static volatile boolean LJIJJ;
    public static C21173417tU LJIJJLI;
    public static volatile C08AX LJIL;
    public static volatile boolean LJJ;
    public static volatile InterfaceC21511219Gk LJJI;
    public static final List<InterfaceC21173617tW> LIZ = new ArrayList();
    public static final List<C1BAA> LIZIZ = new ArrayList();
    public static int LIZLLL = 200;
    public static boolean LJ = true;
    public static String[] LJIIJ = new String[0];
    public static final AtomicInteger LJIIJJI = new AtomicInteger(0);
    public static final AtomicInteger LJIIL = new AtomicInteger(0);
    public static Set<String> LJIILJJIL = C08CX.INSTANCE;
    public static Map<String, ? extends Set<String>> LJIILL = C2097608Jq.LJ();
    public static final AtomicBoolean LJJIFFI = new AtomicBoolean(false);
    public static final C01GW LJJII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(196));

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

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:44:0x0126
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZIZ(X.C0VSJ r15) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BAC.LIZIZ(X.0VSJ):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, byte[]] */
    public static void LIZJ(C0VSJ c0vsj) {
        BufferedWriter bufferedWriter;
        BufferedOutputStream bufferedOutputStream;
        C1BAE c1bae = LJI;
        Throwable th = null;
        boolean z = true;
        if (c1bae != null) {
            ResAltasConfig resAltasConfig = LJIILLIIL;
            if (resAltasConfig != null && resAltasConfig.uploadRawMmap) {
                c1bae.LLILZIL.lock();
                try {
                    c1bae.LLILZ.force();
                    if (c1bae.LLIZLLLIL == 0) {
                        c1bae.LLILZIL.unlock();
                        return;
                    }
                    c1bae.LLILZIL.unlock();
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(c1bae.LL, "r");
                        try {
                            C0VSV c0vsv = new C0VSV(c0vsj);
                            try {
                                randomAccessFile.getChannel().transferTo(0L, randomAccessFile.length(), c0vsv.getChannel());
                                C2107108Nh.LIZ(c0vsv, null);
                                C2107108Nh.LIZ(randomAccessFile, null);
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        th = null;
                                        TryCatchGuardChecker.doCheck(th);
                                        C2107108Nh.LIZ(c0vsv, th);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        } finally {
                            try {
                                try {
                                } catch (Throwable th5) {
                                    while (true) {
                                    }
                                }
                            } catch (Throwable th6) {
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th7) {
                    TryCatchGuardChecker.doCheck(th7);
                    c1bae.LLILZIL.unlock();
                    throw th7;
                }
            } else {
                c1bae.LLILZIL.lock();
                try {
                    try {
                        c1bae.LLILZ.force();
                        if (c1bae.LLIZLLLIL != 0) {
                            C259800zU c259800zU = new C259800zU();
                            c259800zU.element = new byte[8192];
                            OutputStream c0vsv2 = new C0VSV(c0vsj);
                            if (c0vsv2 instanceof BufferedOutputStream) {
                                bufferedOutputStream = (BufferedOutputStream) c0vsv2;
                            } else {
                                bufferedOutputStream = new BufferedOutputStream(c0vsv2, 8192);
                            }
                            try {
                                int i = c1bae.LLIZ;
                                int i2 = 0;
                                while (i2 < c1bae.LLIZLLLIL) {
                                    int i3 = i + 48;
                                    int i4 = c1bae.LLILZ.getInt(i3);
                                    if (i4 == 0) {
                                        i = 0;
                                    } else {
                                        if (i4 <= 0 || i4 > c1bae.LLILLL) {
                                            break;
                                        }
                                        if (i4 > ((byte[]) c259800zU.element).length) {
                                            c259800zU.element = new byte[i4];
                                        }
                                        int i5 = i3 + 4;
                                        byte[] bArr = (byte[]) c259800zU.element;
                                        int i6 = 0;
                                        do {
                                            bArr[i6] = c1bae.LLILZ.get(i5 + i6);
                                            i6++;
                                        } while (i6 < i4);
                                        bufferedOutputStream.write((byte[]) c259800zU.element, 0, i4);
                                        bufferedOutputStream.write(10);
                                        i += i4 + 4;
                                        i2++;
                                    }
                                }
                                C2107108Nh.LIZ(bufferedOutputStream, null);
                            } catch (Throwable th8) {
                                th = th8;
                                try {
                                    try {
                                        throw th;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        th = null;
                                        TryCatchGuardChecker.doCheck(th);
                                        C2107108Nh.LIZ(bufferedOutputStream, th);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    c1bae.LLILZIL.unlock();
                } catch (Throwable th11) {
                    TryCatchGuardChecker.doCheck(th11);
                    c1bae.LLILZIL.unlock();
                    throw th11;
                }
            }
        } else {
            LJIILIIL = true;
            try {
                int i7 = LJIIL.get();
                if (i7 != 0) {
                    if (i7 < LIZLLL) {
                        z = false;
                    }
                    int i8 = LJIIJJI.get();
                    bufferedWriter = new BufferedWriter(new C794210VDn(c0vsj));
                    if (z) {
                        int i9 = LIZLLL;
                        for (int i10 = i8; i10 < i9; i10++) {
                            String str = LJIIJ[i10];
                            if (str != null) {
                                bufferedWriter.write(str);
                                bufferedWriter.newLine();
                            }
                        }
                        for (int i11 = 0; i11 < i8; i11++) {
                            String str2 = LJIIJ[i11];
                            if (str2 != null) {
                                bufferedWriter.write(str2);
                                bufferedWriter.newLine();
                            }
                        }
                    } else {
                        for (int i12 = 0; i12 < i7; i12++) {
                            String str3 = LJIIJ[i12];
                            if (str3 != null) {
                                bufferedWriter.write(str3);
                                bufferedWriter.newLine();
                            }
                        }
                    }
                    C2107108Nh.LIZ(bufferedWriter, null);
                }
                LJIILIIL = false;
            } catch (Throwable th12) {
                try {
                } catch (Throwable th13) {
                    th = th13;
                }
                try {
                    throw th12;
                } catch (Throwable th14) {
                    th = th14;
                    th = th12;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedWriter, th);
                            throw th;
                        } catch (Throwable th15) {
                            th = th15;
                        }
                    }
                }
            } finally {
                TryCatchGuardChecker.doCheck(th12);
                LJIILIIL = false;
            }
        }
    }

    public static void LJ(Context context, ResAltasConfig resAltasConfig, InterfaceC19372610qi interfaceC19372610qi) {
        TargetedSamplingConfig targetedSamplingConfig = resAltasConfig.targetedSampling;
        if (targetedSamplingConfig == null || !targetedSamplingConfig.enable || targetedSamplingConfig.windows.isEmpty() || interfaceC19372610qi == null) {
            return;
        }
        LJII = new C19372510qh(context, targetedSamplingConfig, interfaceC19372610qi);
        List<WindowConfig> list = targetedSamplingConfig.windows;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<WindowConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().name);
        }
    }

    public static void LJFF(String str, String str2, Map map) {
        if (LJIJJ) {
            LIZLLL(System.currentTimeMillis(), str, str2, map, false, null);
        }
    }

    public static List LJI(String str, Set set, boolean z) {
        if (z) {
            set = LJIILJJIL;
        } else if (set == null && (set = (Set) LJIILL.get(str)) == null) {
            set = C08CX.INSTANCE;
        }
        if (set.isEmpty()) {
            return LIZ;
        }
        List<InterfaceC21173617tW> list = LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (!set.contains(((InterfaceC21173617tW) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x003f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJII(X.C0VSJ r5, java.io.File r6, X.C0VSJ r7) {
        /*
            X.0VSV r4 = new X.0VSV
            r4.<init>(r6)
            r3 = 0
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L37
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L37
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L24
            LJIIIIZZ(r5, r2, r1)     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto L1d
            boolean r0 = r7.isDirectory()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1d
            LJIIIZ(r7, r2, r1)     // Catch: java.lang.Throwable -> L24
        L1d:
            X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L37
            X.C2107108Nh.LIZ(r4, r3)
            return
        L24:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L2b
            throw r1     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            goto L2d
        L2b:
            r0 = move-exception
            r1 = r3
        L2d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r0 = move-exception
            goto L2d
        L33:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.lang.Throwable -> L37
        L37:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r0 = move-exception
            r3 = r1
            goto L40
        L3f:
            r0 = move-exception
        L40:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3f
            X.C2107108Nh.LIZ(r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BAC.LJII(X.0VSJ, java.io.File, X.0VSJ):void");
    }

    public static void LJIIIIZZ(C0VSJ c0vsj, ZipOutputStream zipOutputStream, byte[] bArr) throws Throwable {
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && !Intrinsics.LJFF(C08QA.LJIJ(file), "zip")) {
                    C0VSP c0vsp = new C0VSP(file);
                    Throwable th = null;
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                        while (true) {
                            int i = c0vsp.read(bArr);
                            if (i < 0) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, i);
                            }
                        }
                        C2107108Nh.LIZ(c0vsp, null);
                    } catch (Throwable th2) {
                        try {
                            TryCatchGuardChecker.doCheck(th2);
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th2;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        C2107108Nh.LIZ(c0vsp, th);
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        }
    }

    public static void LJIIIZ(C0VSJ c0vsj, ZipOutputStream zipOutputStream, byte[] bArr) throws Throwable {
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    C0VSP c0vsp = new C0VSP(file);
                    Throwable th = null;
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("res_checker/");
                        sbLIZ.append(file.getName());
                        zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ)));
                        while (true) {
                            int i = c0vsp.read(bArr);
                            if (i < 0) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, i);
                            }
                        }
                        C2107108Nh.LIZ(c0vsp, null);
                    } catch (Throwable th2) {
                        try {
                            TryCatchGuardChecker.doCheck(th2);
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th2;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        C2107108Nh.LIZ(c0vsp, th);
                                        throw th;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        }
    }

    public static void LIZLLL(final long j, final String str, final String str2, final Map map, final boolean z, final Set set) {
        final long jNanoTime;
        final boolean z2 = C248900xj.LIZ;
        if (z2) {
            jNanoTime = System.nanoTime();
        } else {
            jNanoTime = 0;
        }
        Runnable runnable = new Runnable() { // from class: X.1BAD
            /* JADX WARN: Can't wrap try/catch for region: R(40:0|2|(1:4)(1:13)|5|(1:12)(1:9)|(2:130|15)(1:14)|16|(1:18)(1:50)|19|(1:49)(1:23)|24|(1:26)(1:48)|27|(11:30|(1:32)(1:33)|136|34|(1:38)|39|(1:41)|44|(1:143)(3:140|47|144)|141|28)|139|51|(1:53)(1:71)|54|(1:56)(1:70)|57|(1:59)(1:69)|60|(19:62|(1:64)(1:68)|65|(1:67)|101|93|(1:95)|132|102|(1:104)|134|107|(2:109|(1:111))|114|(1:116)(1:124)|117|(1:119)(1:123)|120|(2:122|125)(1:146))(2:72|(4:74|(1:76)(1:99)|77|(1:145)(22:81|(1:83)(1:98)|84|(1:86)(1:97)|87|(1:89)|90|(1:92)(1:96)|93|(0)|132|102|(0)|134|107|(0)|114|(0)(0)|117|(0)(0)|120|(0)(0))))|100|101|93|(0)|132|102|(0)|134|107|(0)|114|(0)(0)|117|(0)(0)|120|(0)(0)|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0187, code lost:
            
                r2 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0188, code lost:
            
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x01a9, code lost:
            
                r2 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:113:0x01aa, code lost:
            
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
             */
            /* JADX WARN: Removed duplicated region for block: B:104:0x017f A[Catch: all -> 0x0187, TRY_LEAVE, TryCatch #1 {all -> 0x0187, blocks: (B:102:0x017b, B:104:0x017f), top: B:132:0x017b, outer: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:109:0x018f A[Catch: all -> 0x01a9, TryCatch #2 {all -> 0x01a9, blocks: (B:107:0x018b, B:109:0x018f, B:111:0x019d), top: B:134:0x018b, outer: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:116:0x01b1 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:16:0x002d, B:18:0x003b, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:24:0x004d, B:26:0x0056, B:27:0x005a, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:34:0x0077, B:36:0x007b, B:39:0x0085, B:41:0x008d, B:44:0x0099, B:47:0x009f, B:38:0x0081, B:43:0x0096, B:51:0x00b8, B:53:0x00bc, B:54:0x00c2, B:56:0x00c6, B:57:0x00ca, B:59:0x00e7, B:60:0x00ed, B:62:0x00f1, B:64:0x00f5, B:65:0x00f9, B:67:0x0100, B:93:0x0161, B:95:0x0165, B:114:0x01ad, B:116:0x01b1, B:117:0x01b7, B:119:0x01bb, B:120:0x01c1, B:122:0x01c5, B:113:0x01aa, B:106:0x0188, B:72:0x0113, B:74:0x0119, B:76:0x011d, B:77:0x0121, B:79:0x0125, B:81:0x012b, B:83:0x012f, B:84:0x0138, B:86:0x013c, B:87:0x0140, B:89:0x0144, B:90:0x0157, B:92:0x015b, B:15:0x0029, B:102:0x017b, B:104:0x017f, B:107:0x018b, B:109:0x018f, B:111:0x019d), top: B:130:0x0029, inners: #1, #2, #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x01bb A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:16:0x002d, B:18:0x003b, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:24:0x004d, B:26:0x0056, B:27:0x005a, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:34:0x0077, B:36:0x007b, B:39:0x0085, B:41:0x008d, B:44:0x0099, B:47:0x009f, B:38:0x0081, B:43:0x0096, B:51:0x00b8, B:53:0x00bc, B:54:0x00c2, B:56:0x00c6, B:57:0x00ca, B:59:0x00e7, B:60:0x00ed, B:62:0x00f1, B:64:0x00f5, B:65:0x00f9, B:67:0x0100, B:93:0x0161, B:95:0x0165, B:114:0x01ad, B:116:0x01b1, B:117:0x01b7, B:119:0x01bb, B:120:0x01c1, B:122:0x01c5, B:113:0x01aa, B:106:0x0188, B:72:0x0113, B:74:0x0119, B:76:0x011d, B:77:0x0121, B:79:0x0125, B:81:0x012b, B:83:0x012f, B:84:0x0138, B:86:0x013c, B:87:0x0140, B:89:0x0144, B:90:0x0157, B:92:0x015b, B:15:0x0029, B:102:0x017b, B:104:0x017f, B:107:0x018b, B:109:0x018f, B:111:0x019d), top: B:130:0x0029, inners: #1, #2, #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x01c5 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:16:0x002d, B:18:0x003b, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:24:0x004d, B:26:0x0056, B:27:0x005a, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:34:0x0077, B:36:0x007b, B:39:0x0085, B:41:0x008d, B:44:0x0099, B:47:0x009f, B:38:0x0081, B:43:0x0096, B:51:0x00b8, B:53:0x00bc, B:54:0x00c2, B:56:0x00c6, B:57:0x00ca, B:59:0x00e7, B:60:0x00ed, B:62:0x00f1, B:64:0x00f5, B:65:0x00f9, B:67:0x0100, B:93:0x0161, B:95:0x0165, B:114:0x01ad, B:116:0x01b1, B:117:0x01b7, B:119:0x01bb, B:120:0x01c1, B:122:0x01c5, B:113:0x01aa, B:106:0x0188, B:72:0x0113, B:74:0x0119, B:76:0x011d, B:77:0x0121, B:79:0x0125, B:81:0x012b, B:83:0x012f, B:84:0x0138, B:86:0x013c, B:87:0x0140, B:89:0x0144, B:90:0x0157, B:92:0x015b, B:15:0x0029, B:102:0x017b, B:104:0x017f, B:107:0x018b, B:109:0x018f, B:111:0x019d), top: B:130:0x0029, inners: #1, #2, #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:123:0x01cb  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x01ce  */
            /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0165 A[Catch: all -> 0x01d3, TryCatch #0 {all -> 0x01d3, blocks: (B:16:0x002d, B:18:0x003b, B:19:0x0040, B:21:0x0044, B:23:0x0048, B:24:0x004d, B:26:0x0056, B:27:0x005a, B:28:0x0060, B:30:0x0066, B:32:0x0070, B:34:0x0077, B:36:0x007b, B:39:0x0085, B:41:0x008d, B:44:0x0099, B:47:0x009f, B:38:0x0081, B:43:0x0096, B:51:0x00b8, B:53:0x00bc, B:54:0x00c2, B:56:0x00c6, B:57:0x00ca, B:59:0x00e7, B:60:0x00ed, B:62:0x00f1, B:64:0x00f5, B:65:0x00f9, B:67:0x0100, B:93:0x0161, B:95:0x0165, B:114:0x01ad, B:116:0x01b1, B:117:0x01b7, B:119:0x01bb, B:120:0x01c1, B:122:0x01c5, B:113:0x01aa, B:106:0x0188, B:72:0x0113, B:74:0x0119, B:76:0x011d, B:77:0x0121, B:79:0x0125, B:81:0x012b, B:83:0x012f, B:84:0x0138, B:86:0x013c, B:87:0x0140, B:89:0x0144, B:90:0x0157, B:92:0x015b, B:15:0x0029, B:102:0x017b, B:104:0x017f, B:107:0x018b, B:109:0x018f, B:111:0x019d), top: B:130:0x0029, inners: #1, #2, #3 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 472
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BAD.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ResAltasCore@f32f.executeCollect$task$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ResAltasCore@f32f.executeCollect$task$1");
            }
        };
        if (LJ) {
            C823050WQl.LIZIZ().execute(runnable);
        } else {
            runnable.run();
        }
    }
}
