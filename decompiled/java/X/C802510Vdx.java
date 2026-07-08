package X;

import Y.AComparatorS32S0000000_13;
import Y.ARunnableS92S0000000_13;
import android.app.ApplicationExitInfo;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Process;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import dl3.h;
import im3.b;
import im3.o;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vdx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802510Vdx {
    public static String LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static C0VSJ LIZLLL;
    public static C0VSJ LJ;
    public static C0VSJ LJFF;
    public static final ConcurrentLinkedQueue<InterfaceC803770Vfz> LJI = new ConcurrentLinkedQueue<>();
    public static final ConcurrentLinkedQueue<InterfaceC803780Vg0> LJII = new ConcurrentLinkedQueue<>();
    public static boolean LJIIIIZZ = false;
    public static boolean LJIIIZ = false;

    public static void LIZ() {
        if (LIZLLL.exists() && !LJIIIZ) {
            LJIIIZ = true;
            File[] fileArrListFiles = LIZLLL.listFiles(new FilenameFilter() { // from class: X.0VfG
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    if (str.split("_").length == 2) {
                        return true;
                    }
                    return false;
                }
            });
            if (fileArrListFiles == null || fileArrListFiles.length <= 20) {
                return;
            }
            Arrays.sort(fileArrListFiles, new AComparatorS32S0000000_13(14));
            for (int i = 0; i < fileArrListFiles.length - 20; i++) {
                C08SE.LIZIZ(fileArrListFiles[i]);
            }
        }
    }

    public static void LJ() {
        ARunnableS92S0000000_13 aRunnableS92S0000000_13;
        final C802790VeP c802790VeP = k.LIZ;
        try {
            if (LJIIIIZZ || c802790VeP == null) {
                aRunnableS92S0000000_13 = new ARunnableS92S0000000_13(32);
            } else {
                LJFF();
                if (C802270VdZ.LJ()) {
                    LJIIIIZZ = true;
                    final List<ApplicationExitInfo> listLIZIZ = C802650VeB.LIZIZ();
                    if (listLIZIZ == null || ((ArrayList) listLIZIZ).size() == 0) {
                        aRunnableS92S0000000_13 = new ARunnableS92S0000000_13(32);
                    } else {
                        C0VXF.post(new Runnable() { // from class: X.0Vef
                            public final /* synthetic */ boolean LLILLL = true;
                            public final /* synthetic */ boolean LLILZ = true;

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("TerminateMonitor@c1b1.forceStart$1");
                                try {
                                    Iterator it2 = listLIZIZ.iterator();
                                    while (it2.hasNext()) {
                                        C802510Vdx.LJII(c802790VeP, (ApplicationExitInfo) it2.next(), this.LLILLL, this.LLILZ);
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("TerminateMonitor@c1b1.forceStart$1");
                            }
                        });
                        aRunnableS92S0000000_13 = new ARunnableS92S0000000_13(32);
                    }
                } else {
                    aRunnableS92S0000000_13 = new ARunnableS92S0000000_13(32);
                }
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                aRunnableS92S0000000_13 = new ARunnableS92S0000000_13(32);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C0VXF.post(new ARunnableS92S0000000_13(32));
                throw th2;
            }
        }
        C0VXF.post(aRunnableS92S0000000_13);
    }

    public static void LJFF() {
        C0VSJ c0vsjLJFF;
        if (LIZIZ || (c0vsjLJFF = C0VX9.LJFF()) == null) {
            return;
        }
        LIZIZ = true;
        C0VSJ c0vsjLIZIZ = C2112008Pe.LIZIZ(c0vsjLJFF, "killHistory");
        LJFF = c0vsjLIZIZ;
        C2112008Pe.LIZIZ(c0vsjLIZIZ, "kill_info");
        LJ = C2112008Pe.LIZIZ(LJFF, "proc");
        C0VX9.LJ();
        LIZLLL = C2112008Pe.LIZIZ(LJ, C802270VdZ.LIZ().replace(e3.d, "_").replace(":", "-"));
        try {
            C0VSJ c0vsj = LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Process.myPid());
            sbLIZ.append("_");
            sbLIZ.append(C0VX9.LIZJ());
            new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ)).createNewFile();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(C0VSJ c0vsj, Map map) {
        try {
            try {
                NativeBridge.LJIIJJI(c0vsj.getAbsolutePath(), true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, "logcat.txt");
                if (c0vsj2.exists() && !c0vsj2.isDirectory()) {
                    if (c0vsj2.length() < 50) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            String strLIZJ = C08SE.LIZJ(new C0VSJ(c0vsj, "logcat.txt"));
            LIZ = strLIZJ;
            if (!strLIZJ.isEmpty() && LIZ.length() > 10) {
                ((HashMap) map).put("has_logcat", "true");
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("KillInfo:");
            sbLIZ.append(th3);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZLLL(C0VSJ c0vsj, Map map) {
        String strLIZJ;
        try {
            NativeBridge.LJIIL(c0vsj.getAbsolutePath());
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, "os_memory.txt");
            if (c0vsj2.exists() && c0vsj2.length() > 10 && (strLIZJ = C08SE.LIZJ(c0vsj2)) != null && strLIZJ.contains("kB")) {
                ((HashMap) map).put("has_os_memory", "true");
            } else {
                ((HashMap) map).put("has_os_memory", "false");
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("KillInfo:");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x0065
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZIZ(X.C0VSJ r6, java.util.Map r7, X.C802720VeI r8, long r9) {
        /*
            java.lang.String r0 = r8.LIZ     // Catch: java.lang.Throwable -> L75
            X.0VSJ r5 = X.C0VXM.LIZIZ(r9, r0)     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = "has_process_track"
            if (r5 == 0) goto L6d
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L6d
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "process_track.txt"
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L75
            r3 = 1
            r2 = 0
            X.C08SE.LIZ(r5, r1, r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = "true"
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Throwable -> L65
            r7.put(r4, r0)     // Catch: java.lang.Throwable -> L65
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L65
            X.0VSF r0 = new X.0VSF     // Catch: java.lang.Throwable -> L65
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L65
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L65
        L2e:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L3e
            java.lang.String r0 = "onResume"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L2e
            r2 = r1
            goto L2e
        L3e:
            if (r2 == 0) goto L5e
            java.lang.String r1 = " "
            r0 = 3
            java.lang.String[] r1 = r2.split(r1, r0)     // Catch: java.lang.Throwable -> L62
            int r0 = r1.length     // Catch: java.lang.Throwable -> L62
            if (r0 <= r3) goto L5e
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = ".onResume"
            int r2 = r3.indexOf(r0)     // Catch: java.lang.Throwable -> L62
            if (r2 <= 0) goto L5e
            java.lang.String r1 = "scene"
            r0 = 0
            java.lang.String r0 = r3.substring(r0, r2)     // Catch: java.lang.Throwable -> L62
            r7.put(r1, r0)     // Catch: java.lang.Throwable -> L62
        L5e:
            X.C798010VSd.LIZ(r4)     // Catch: java.lang.Throwable -> L75
            return
        L62:
            r0 = move-exception
            r2 = r4
            goto L66
        L65:
            r0 = move-exception
        L66:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
            X.C798010VSd.LIZ(r2)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Throwable -> L75
        L6d:
            java.lang.String r0 = "false"
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Throwable -> L75
            r7.put(r4, r0)     // Catch: java.lang.Throwable -> L75
            return
        L75:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "dumpActivityInfo"
            X.C801940Vd2.LIZ(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802510Vdx.LIZIZ(X.0VSJ, java.util.Map, X.0VeI, long):void");
    }

    public static boolean LJI(C802790VeP c802790VeP, long j, JSONObject jSONObject, C0VSJ c0vsj) {
        try {
            JSONObject jSONObject2 = Header.LIZIZ(c802790VeP, j, CrashType.NATIVE_CUSTOMIZE, Process.myPid()).LIZ;
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject3.put("data", jSONArray);
            jSONObject3.put("header", jSONObject2);
            if (LIZ != null) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(LIZ);
                jSONObject3.put("logcat", jSONArray2);
            }
            String strLIZLLL = o.LIZLLL(h.LJIIJJI.LJFF, jSONObject2);
            String strJ3 = C786410Ut5.J3(jSONObject3);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new File[]{c0vsj}[0]);
            return b.LJFF("ensure_zip", strLIZLLL, strJ3, arrayList).LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LJII(C802790VeP c802790VeP, ApplicationExitInfo applicationExitInfo, boolean z, boolean z2) {
        String str;
        Object objLIZ;
        HashMap map = new HashMap();
        final C802720VeI c802720VeI = new C802720VeI();
        c802720VeI.LIZ = applicationExitInfo.getProcessName();
        c802720VeI.LIZIZ = applicationExitInfo.getTimestamp();
        c802720VeI.LIZJ = applicationExitInfo.getPid();
        c802720VeI.LJFF = applicationExitInfo.getImportance();
        switch (applicationExitInfo.getReason()) {
            case 1:
                str = "EXIT_SELF";
                break;
            case 2:
                str = "SIGNALED";
                break;
            case 3:
                str = "LOW_MEMORY";
                break;
            case 4:
                str = "APP CRASH(EXCEPTION)";
                break;
            case 5:
                str = "APP CRASH(NATIVE)";
                break;
            case 6:
                str = "ANR";
                break;
            case 7:
                str = "INITIALIZATION FAILURE";
                break;
            case 8:
                str = "PERMISSION CHANGE";
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                str = "EXCESSIVE RESOURCE USAGE";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                str = "USER REQUESTED";
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                str = "USER STOPPED";
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                str = "DEPENDENCY DIED";
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                str = "OTHER KILLS BY SYSTEM";
                break;
            case 14:
                str = "FREEZER";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        c802720VeI.LIZLLL = str;
        c802720VeI.LJ = applicationExitInfo.getStatus();
        c802720VeI.LJIIIZ = applicationExitInfo.getPss();
        c802720VeI.LJIIJ = applicationExitInfo.getRss();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(applicationExitInfo.getPss() / 1024);
        sbLIZ.append("M");
        c802720VeI.LJI = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(applicationExitInfo.getRss() / 1024);
        sbLIZ2.append("M");
        c802720VeI.LJII = C2188811AlT.LIZIZ(sbLIZ2);
        c802720VeI.LJIIIIZZ = applicationExitInfo.getDescription();
        try {
            try {
                objLIZ = C1965307mt.LIZ(applicationExitInfo, new Object[0]);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Meet exception when call Method '");
                sbLIZ3.append("getSubReason");
                sbLIZ3.append("' in ");
                sbLIZ3.append(applicationExitInfo);
                C2188811AlT.LIZIZ(sbLIZ3);
                objLIZ = null;
            }
            c802720VeI.LJIIJJI = C802860VeW.LIZLLL(((Integer) objLIZ).intValue());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c802720VeI.LJIIJJI = "UNKNOWN";
        }
        final long[] jArr = {0};
        try {
            new C0VSJ(LJ, c802720VeI.LIZ.replace(e3.d, "_").replace(":", "-")).listFiles(new FilenameFilter() { // from class: X.0VeZ
                public long LIZ = 2147483647L;

                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str2) {
                    try {
                        String[] strArrSplit = str2.split("_");
                        int i = CastIntegerProtector.parseInt(strArrSplit[0]);
                        long j = CastLongProtector.parseLong(strArrSplit[1]);
                        C802720VeI c802720VeI2 = c802720VeI;
                        if (i == c802720VeI2.LIZJ) {
                            long j2 = c802720VeI2.LIZIZ - j;
                            if (j2 > 0 && j2 < this.LIZ) {
                                jArr[0] = j;
                                this.LIZ = j2;
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    return false;
                }
            });
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        long j = jArr[0];
        if (j == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c802720VeI.LIZLLL);
        sb.append("\npid:");
        sb.append(c802720VeI.LIZJ);
        sb.append(" process:");
        sb.append(c802720VeI.LIZ);
        sb.append(" alive_time:");
        sb.append(c802720VeI.LIZIZ - j);
        sb.append(" last_alive_time:");
        sb.append(c802720VeI.LIZIZ - j);
        sb.append("\n#exitInfo\n");
        if (Build.VERSION.SDK_INT >= 24) {
            sb.append(new SimpleDateFormat().format(new Date(c802720VeI.LIZIZ)));
            sb.append("\n");
        }
        sb.append("importance=");
        sb.append(c802720VeI.LJFF);
        sb.append("\nsub_reason=");
        sb.append(c802720VeI.LJIIJJI);
        sb.append("\nstatus=");
        sb.append(c802720VeI.LJ);
        sb.append("\ndescription=");
        sb.append(c802720VeI.LJIIIIZZ);
        sb.append("\npss=");
        sb.append(c802720VeI.LJI);
        sb.append("\nreason=");
        sb.append(c802720VeI.LIZLLL);
        sb.append("\nprocess=");
        sb.append(c802720VeI.LIZ);
        sb.append("\nrss=");
        sb.append(c802720VeI.LJII);
        sb.append("\n");
        String string = sb.toString();
        map.put("exit_reason", c802720VeI.LIZLLL);
        map.put("exit_sub_reason", c802720VeI.LJIIJJI);
        map.put("exit_description", c802720VeI.LJIIIIZZ);
        map.put("exit_status", String.valueOf(c802720VeI.LJ));
        map.put("exit_pss", C802860VeW.LIZJ(c802720VeI.LJIIIZ));
        map.put("exit_rss", C802860VeW.LIZJ(c802720VeI.LJIIJ));
        map.put("importance", String.valueOf(c802720VeI.LJFF));
        map.put("has_exit_info", "true");
        if (!((String) map.get("exit_reason")).equals("not obtained") && !((String) map.get("exit_reason")).equals("USER REQUESTED")) {
            long j2 = jArr[0];
            HashMap map2 = new HashMap();
            map2.put("exit_status", String.valueOf(c802720VeI.LJ));
            map2.put("exit_pss", C802860VeW.LIZJ(c802720VeI.LJIIIZ));
            map2.put("exit_rss", C802860VeW.LIZJ(c802720VeI.LJIIJ));
            map2.put("has_exit_info", "true");
            map2.put("exit_reason", c802720VeI.LIZLLL);
            map2.put("exit_sub_reason", c802720VeI.LJIIJJI);
            HashMap map3 = new HashMap(map2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event_type", "exception");
                jSONObject.put("crash_time", c802720VeI.LIZIZ);
                jSONObject.put("log_type", "PROCESS_DIED");
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("message", "PROCESS_DIED");
                jSONObject.put("crash_thread_name", "UNKNOW");
                jSONObject.put("crash_md5", C820840WHy.LIZ(string));
                jSONObject.put("process_name", c802720VeI.LIZ);
                jSONObject.put("app_start_time", j2);
                jSONObject.put("exception_type", 1);
                jSONObject.put("pid", c802720VeI.LIZJ);
                jSONObject.put("class_ref", "Native");
                jSONObject.put("method", "Native");
                jSONObject.put("is_core", 1);
                jSONObject.put("line_num", -1);
                jSONObject.put("ensure_type", "EnsureNotReachHere");
                jSONObject.put("stack", string);
                jSONObject.put("has_dump", "true");
                jSONObject.put("java_data", "DiedProcess.unknownReason: App was killed, please see logcat.\n");
                C802720VeI.LIZ(jSONObject, map2);
                C802720VeI.LIZIZ(jSONObject, map3);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            try {
                C0VSJ c0vsj = new C0VSJ(LJFF, "custom_data");
                c0vsj.mkdirs();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(c802720VeI.LIZIZ);
                sbLIZ4.append("_");
                sbLIZ4.append(c802720VeI.LIZJ);
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ4));
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdirs();
                }
                LIZIZ(c0vsj2, map, c802720VeI, jArr[0]);
                if (z2) {
                    LIZJ(c0vsj2, map);
                }
                LIZLLL(c0vsj2, map);
                if (z) {
                    try {
                        C802110VdJ.LIZIZ(applicationExitInfo.getProcessName(), 0L, applicationExitInfo.getTimestamp(), CrashType.NATIVE_CUSTOMIZE);
                        map.put("has_alog", "true");
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        try {
                            sbLIZ5.append("KillInfo:");
                            sbLIZ5.append(th4);
                            C2188811AlT.LIZIZ(sbLIZ5);
                        } catch (Throwable th5) {
                            th = th5;
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("KillInfo:");
                            sbLIZ6.append(th);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            return;
                        }
                    }
                }
                C802720VeI.LIZIZ(jSONObject, map);
                boolean zLJI = LJI(c802790VeP, c802720VeI.LIZIZ, jSONObject, c0vsj2);
                if (zLJI) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("upload success:");
                    sbLIZ7.append(zLJI);
                    C2188811AlT.LIZIZ(sbLIZ7);
                    C2112008Pe.LJ(c0vsj2);
                }
                C2112008Pe.LJ(c0vsj2);
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            try {
                IApmAgent iApmAgent = (IApmAgent) C792600V7i.LIZ(IApmAgent.class);
                JSONObject jSONObject2 = new JSONObject();
                if (iApmAgent != null) {
                    jSONObject2.put("reason", map.get("exit_reason"));
                    iApmAgent.monitorEvent("app_exit", jSONObject2, null, null);
                }
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
            }
        }
    }
}
