package X;

import Y.ARunnableS22S0400000_13;
import android.os.Looper;
import android.os.Process;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dl3.h;
import im3.b;
import im3.o;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jl3.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC802520Vdy {
    public final C802790VeP LIZ;
    public final File LIZIZ;
    public final String LIZJ;

    public static String LIZLLL(long j) {
        return j <= 350 ? "~350MB" : j <= 450 ? "350MB~450MB" : j <= 550 ? "450MB~550MB" : j <= 650 ? "550MB~650MB" : j <= 750 ? "650MB~750MB" : j <= 850 ? "750MB~850MB" : j <= 950 ? "850MB~950MB" : j <= 1050 ? "950MB~1050MB" : j <= 1250 ? "1050MB~1250MB" : j <= 1450 ? "1250MB~1450MB" : j <= 1650 ? "1450MB~1650MB" : j <= 1850 ? "1650MB~1850MB" : j <= 2050 ? "1850MB~2050MB" : ">2.3G";
    }

    public abstract boolean LJIIIZ(File file, C802900Vea c802900Vea);

    public final void LJIIJJI() {
        File[] fileArrListFiles = this.LIZIZ.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            File file = fileArrListFiles[i2];
            if (!this.LIZJ.equals(file.getAbsolutePath()) && !file.isFile()) {
                String[] list = file.list();
                if (list == null || list.length == 0) {
                    C08SE.LIZIZ(file);
                } else {
                    int i3 = i + 1;
                    if (i >= 10) {
                        i = i3;
                        C08SE.LIZIZ(file);
                    } else {
                        C802900Vea c802900Vea = new C802900Vea();
                        HashMap map = new HashMap();
                        try {
                            if (LJIIIZ(file, c802900Vea)) {
                                LJII(map, c802900Vea);
                                NativeBridge.LJJIL(file.getAbsolutePath(), true);
                                LJFF(file, map, c802900Vea);
                            } else {
                                C08SE.LIZIZ(file);
                            }
                        } finally {
                            try {
                            } catch (Throwable th) {
                            }
                        }
                        C08SE.LIZIZ(file);
                        i = i3;
                    }
                }
            }
        }
    }

    public static String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return sb.toString().toUpperCase();
    }

    public static String LJ(long j) {
        String str;
        long j2 = j;
        Long[] lArr = {0L, 1L, 16L, 128L, 512L, 1024L};
        if (j2 < 1024) {
            lArr = new Long[]{0L, 16L, 64L, 128L, 256L, 512L, 1024L};
            str = "KB";
        } else {
            j2 /= 1024;
            str = "MB";
        }
        C802910Veb c802910Veb = new C802910Veb(str);
        c802910Veb.LIZJ(lArr);
        return c802910Veb.LIZ(j2);
    }

    public AbstractC802520Vdy(C802790VeP c802790VeP, C0VSJ c0vsj) {
        this.LIZ = c802790VeP;
        this.LIZIZ = c0vsj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0vsj.getAbsolutePath());
        sbLIZ.append("/");
        sbLIZ.append(C802600Ve6.LIZ());
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(String str, String str2) {
        if (str == null) {
            return "other";
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = "B";
        }
        if (!str2.equals("GB")) {
            if (!str2.equals("MB")) {
                return "0~1MB";
            }
            try {
                int i = CastIntegerProtector.parseInt(str.substring(0, str.indexOf(46)));
                if (i < 200) {
                    return "0~200MB";
                }
                if (i < 500) {
                    return "200~500MB";
                }
                if (i < 800) {
                    return "500~800MB";
                }
                return "800~1024MB(1G)";
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return "other";
            }
        }
        return "1GB+";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x005c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJIIIIZZ(java.io.File r4, X.C802900Vea r5) {
        /*
            X.0VSJ r3 = new X.0VSJ     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "process_track.txt"
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6c
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.LJII     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "has_process_track"
            if (r0 == 0) goto L64
            r2 = 0
            java.lang.String r0 = "true"
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L5c
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L5c
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5c
            X.0VSF r0 = new X.0VSF     // Catch: java.lang.Throwable -> L5c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5c
        L24:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L34
            java.lang.String r0 = "onResume"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L24
            r2 = r1
            goto L24
        L34:
            if (r2 == 0) goto L55
            java.lang.String r1 = " "
            r0 = 3
            java.lang.String[] r2 = r2.split(r1, r0)     // Catch: java.lang.Throwable -> L59
            int r1 = r2.length     // Catch: java.lang.Throwable -> L59
            r0 = 1
            if (r1 <= r0) goto L55
            r3 = r2[r0]     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = ".onResume"
            int r2 = r3.indexOf(r0)     // Catch: java.lang.Throwable -> L59
            if (r2 <= 0) goto L55
            java.lang.String r1 = "scene"
            r0 = 0
            java.lang.String r0 = r3.substring(r0, r2)     // Catch: java.lang.Throwable -> L59
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L59
        L55:
            X.C798010VSd.LIZ(r4)     // Catch: java.lang.Throwable -> L6c
            return
        L59:
            r0 = move-exception
            r2 = r4
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5c
            X.C798010VSd.LIZ(r2)     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L6c
        L64:
            java.lang.String r0 = "false"
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch: java.lang.Throwable -> L6c
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "parseProcessTrack"
            X.C801940Vd2.LIZ(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC802520Vdy.LJIIIIZZ(java.io.File, X.0Vea):void");
    }

    public void LJII(Map<String, String> map, C802900Vea c802900Vea) {
        ((HashMap) map).putAll(c802900Vea.LJII);
    }

    public static int LIZIZ(int i, String str, JSONArray jSONArray) {
        while (i < jSONArray.length()) {
            String strOptString = jSONArray.optString(i, null);
            if (strOptString != null && strOptString.startsWith(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void LJIIJ(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        C0VSJ c0vsj = new C0VSJ(file, "summary.json");
        C0VSJ c0vsj2 = new C0VSJ(file, "crash_time");
        String strLJFF = C2112008Pe.LJFF(c0vsj);
        String strLJFF2 = C2112008Pe.LJFF(c0vsj2);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("filters");
        if (strLJFF != null) {
            try {
                JSONObject jSONObject3 = new JSONObject(strLJFF);
                C0VJO.LIZLLL(jSONObject, jSONObject3.optJSONObject("header"));
                C0VJO.LIZLLL(jSONObjectOptJSONObject, jSONObject3.optJSONObject("filters"));
                jSONObject2.put("app_start_time", jSONObject.opt("app_start_time"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (strLJFF2 != null) {
            long j = CastLongProtector.parseLong(strLJFF2) * 1000;
            jSONObject2.put("crash_time", j);
            jSONObject2.put("timestamp", j);
        }
    }

    public final void LJFF(File file, Map<String, String> map, C802900Vea c802900Vea) {
        C802790VeP c802790VeP = this.LIZ;
        if (c802790VeP != null) {
            c802790VeP.LJ();
            if (c802900Vea.LJ == 0) {
                c802900Vea.LJ = Process.myPid();
            }
            g gVar = new g((int) c802900Vea.LJ, c802900Vea.LIZ, c802900Vea.LIZIZ, c802900Vea.LIZLLL, c802900Vea.LIZJ, "1", map);
            if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                LJI(gVar, file, c802900Vea);
            } else {
                C0VXF.post(new ARunnableS22S0400000_13(this, gVar, file, c802900Vea, 5));
            }
        }
    }

    public final void LJI(g gVar, File file, C802900Vea c802900Vea) {
        try {
            JSONObject jSONObject = Header.LIZIZ(this.LIZ, System.currentTimeMillis(), CrashType.NATIVE_CUSTOMIZE, (int) c802900Vea.LJ).LIZ;
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObjectLJ = gVar.LJ(this.LIZ);
            jSONArray.put(jSONObjectLJ);
            jSONObject2.put("data", jSONArray);
            jSONObject2.put("crash_lib_uuid", c802900Vea.LJI);
            C0VJO.LIZLLL(jSONObject2, c802900Vea.LJIIIIZZ);
            jSONObject2.put("header", jSONObject);
            LJIIJ(jSONObject, jSONObjectLJ, file);
            String strLIZLLL = o.LIZLLL(h.LJIIJJI.LJFF, jSONObject);
            String strJ3 = C786410Ut5.J3(jSONObject2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new File[]{file}[0]);
            if (b.LJFF("ensure_zip", strLIZLLL, strJ3, arrayList).LIZ()) {
                C802300Vdc.LIZ();
                C08SE.LIZIZ(file);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
