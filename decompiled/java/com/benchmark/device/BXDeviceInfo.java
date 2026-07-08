package com.benchmark.device;

import X.C0VSJ;
import X.C0VSP;
import X.C0WZX;
import X.C1305370k4d;
import X.C1305380k4e;
import X.C1305390k4f;
import X.C1305400k4g;
import X.C2079408Cq;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C806930Vl5;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class BXDeviceInfo {
    public static C1305380k4e LIZ;
    public static C1305400k4g LIZIZ;
    public static C1305390k4f LIZJ;
    public static final C1305370k4d LIZLLL = new FileFilter() { // from class: X.0k4d
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static int LJI() throws Throwable {
        int length = -1;
        try {
            int iLIZJ = LIZJ("/sys/devices/system/cpu/possible");
            if (iLIZJ == -1) {
                iLIZJ = LIZJ("/sys/devices/system/cpu/present");
            }
            if (iLIZJ != -1) {
                return iLIZJ;
            }
            length = new C0VSJ("/sys/devices/system/cpu/").listFiles(LIZLLL).length;
            return length;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return length;
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return length;
        }
    }

    public static native void nativeGPUInfoInit();

    public static native void nativeGPUInfoRelease();

    public static native String nativeGetCpuModelName();

    public static native String nativeGetGLExtensions();

    public static native String nativeGetGLRenderer();

    public static native String nativeGetGLVendor();

    public static native String nativeGetGLVersion();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r0 = r3[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        LIZ(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: IOException -> 0x00e6, TryCatch #4 {IOException -> 0x00e6, blocks: (B:26:0x005e, B:28:0x0064, B:30:0x0084, B:42:0x00ba, B:46:0x00c4, B:47:0x00c7, B:43:0x00bd, B:49:0x00ca, B:53:0x00da, B:56:0x00e2, B:57:0x00e5, B:31:0x008d, B:32:0x0091, B:34:0x0099, B:37:0x009e, B:39:0x00b1, B:41:0x00b7, B:50:0x00cf), top: B:76:0x005e, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca A[Catch: IOException -> 0x00e6, TRY_LEAVE, TryCatch #4 {IOException -> 0x00e6, blocks: (B:26:0x005e, B:28:0x0064, B:30:0x0084, B:42:0x00ba, B:46:0x00c4, B:47:0x00c7, B:43:0x00bd, B:49:0x00ca, B:53:0x00da, B:56:0x00e2, B:57:0x00e5, B:31:0x008d, B:32:0x0091, B:34:0x0099, B:37:0x009e, B:39:0x00b1, B:41:0x00b7, B:50:0x00cf), top: B:76:0x005e, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1305400k4g LIZLLL() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.device.BXDeviceInfo.LIZLLL():X.0k4g");
    }

    public static C1305390k4f LJ() {
        C1305390k4f c1305390k4f = new C1305390k4f();
        if (!C2079408Cq.LIZIZ) {
            return null;
        }
        nativeGPUInfoInit();
        c1305390k4f.LIZLLL = nativeGetGLExtensions();
        c1305390k4f.LIZ = nativeGetGLRenderer();
        c1305390k4f.LIZIZ = nativeGetGLVendor();
        c1305390k4f.LIZJ = nativeGetGLVersion();
        nativeGPUInfoRelease();
        return c1305390k4f;
    }

    public static String LJIIIIZZ() {
        String[] strArr = Build.SUPPORTED_ABIS;
        String strLIZIZ = "";
        if (strArr != null) {
            for (String str : strArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(str);
                sbLIZ.append("_");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return strLIZIZ;
    }

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static int LIZJ(String str) throws Throwable {
        C0VSP c0vsp;
        int iIntValue = -1;
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            String line = new BufferedReader(new InputStreamReader(c0vsp)).readLine();
            if (line != null && line.matches("0-[\\d]+$")) {
                iIntValue = CastIntegerProtector.valueOf(line.substring(2)).intValue() + 1;
            }
            try {
                c0vsp.close();
                return iIntValue;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return iIntValue;
            }
        } catch (IOException e3) {
            e = e3;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    return -1;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static JSONObject LJFF(Context context) throws Throwable {
        new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        JSONObject jSONObject = new JSONObject();
        if (windowManager != null) {
            try {
                Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgA/UcnUWFYzTlyAYzTy5V7KoQBJijrM5NvgzMON", null));
                if (Build.VERSION.SDK_INT >= 24) {
                    Display.HdrCapabilities hdrCapabilities = displayLLILZIL.getHdrCapabilities();
                    HashMap map = new HashMap();
                    map.put(1, "Dolby Vision");
                    map.put(3, "HLG");
                    map.put(2, "HDR 10");
                    map.put(4, "HDR 10+");
                    int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                    JSONArray jSONArray = new JSONArray();
                    for (int i : supportedHdrTypes) {
                        jSONArray.put(map.get(Integer.valueOf(i)));
                        map.get(Integer.valueOf(i));
                        C806930Vl5.LIZ("ByteBench");
                    }
                    jSONObject.put("hdrFeature_display", jSONArray);
                }
                MediaCodecInfo codecInfo = MediaCodec.createEncoderByType("video/hevc").getCodecInfo();
                String[] supportedTypes = codecInfo.getSupportedTypes();
                Arrays.toString(supportedTypes);
                C806930Vl5.LIZJ("ByteBench");
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(supportedTypes[0]);
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 : capabilitiesForType.colorFormats) {
                    jSONArray2.put(i2);
                    C806930Vl5.LIZ("ByteBench");
                }
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                JSONArray jSONArray3 = new JSONArray();
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    jSONArray3.put(codecProfileLevel.profile);
                }
                jSONObject.put("hdrFeature_mideacodec_profileLevels", jSONArray3);
                jSONObject.put("hdrFeature_mideacodec", jSONArray2);
                C786410Ut5.J3(jSONObject);
                C806930Vl5.LIZ("ByteBench");
                return jSONObject;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static C1305380k4e LJII(Context context) throws Throwable {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        C1305380k4e c1305380k4e = new C1305380k4e();
        if (windowManager != null) {
            Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgA/UcnUWFYzTlyAYzTy5V7KoQBJijrM5NvgzMON", null));
            displayLLILZIL.getMetrics(displayMetrics);
            c1305380k4e.LIZ = displayMetrics.widthPixels;
            c1305380k4e.LIZIZ = displayMetrics.heightPixels;
            c1305380k4e.LIZJ = displayMetrics.xdpi;
            c1305380k4e.LIZLLL = displayMetrics.ydpi;
            c1305380k4e.LJ = displayMetrics.density;
            c1305380k4e.LJFF = displayMetrics.densityDpi;
            Point point = new Point();
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgA/UcnUWFYzTlyAYzTy5V7KoQBJijrM5NvgzMON", null)).getRealSize(point);
            int i = point.x;
            if (i > c1305380k4e.LIZ) {
                c1305380k4e.LIZ = i;
            }
            int i2 = point.y;
            if (i2 > c1305380k4e.LIZIZ) {
                c1305380k4e.LIZIZ = i2;
            }
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgA/UcnUWFYzTlyAYzTy5V7KoQBJijrM5NvgzMON", null)).getRealMetrics(displayMetrics);
            int i3 = displayMetrics.widthPixels;
            if (i3 > c1305380k4e.LIZ) {
                c1305380k4e.LIZ = i3;
            }
            int i4 = displayMetrics.heightPixels;
            if (i4 > c1305380k4e.LIZIZ) {
                c1305380k4e.LIZIZ = i4;
            }
            int physicalWidth = displayLLILZIL.getMode().getPhysicalWidth();
            int physicalHeight = displayLLILZIL.getMode().getPhysicalHeight();
            if (physicalWidth > c1305380k4e.LIZ) {
                c1305380k4e.LIZ = physicalWidth;
            }
            if (physicalHeight > c1305380k4e.LIZIZ) {
                c1305380k4e.LIZIZ = physicalHeight;
            }
            c1305380k4e.LJI = Math.sqrt(Math.pow(c1305380k4e.LIZ / c1305380k4e.LIZJ, 2.0d) + Math.pow(c1305380k4e.LIZIZ / c1305380k4e.LIZLLL, 2.0d));
        }
        return c1305380k4e;
    }

    public static long LJIIIZ(Context context) throws Throwable {
        long j;
        C0VSP c0vsp;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
        C0VSP c0vsp2 = null;
        if (activityManager != null) {
            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgA/UcnUWFYzTlyAYzTy5V7KoQBJijrM5NvgzMON", null));
            j = memoryInfo.totalMem;
            if (j == -1) {
            }
            return j;
        }
        j = -1;
        try {
            try {
                c0vsp = new C0VSP("/proc/meminfo");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long jLJIIJ = ((long) LJIIJ("MemTotal", c0vsp)) * 1024;
            LIZ(c0vsp);
            return jLJIIJ;
        } catch (Exception e2) {
            e = e2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            LIZ(c0vsp2);
            return j;
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    LIZ(c0vsp2);
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    public static int LIZIZ(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return CastIntegerProtector.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: NumberFormatException -> 0x0038, IOException -> 0x003d, TryCatch #2 {IOException -> 0x003d, NumberFormatException -> 0x0038, blocks: (B:3:0x0005, B:5:0x000c, B:12:0x001b, B:14:0x0025, B:16:0x002d, B:18:0x0032, B:19:0x0035, B:9:0x0016), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: NumberFormatException -> 0x0038, IOException -> 0x003d, TryCatch #2 {IOException -> 0x003d, NumberFormatException -> 0x0038, blocks: (B:3:0x0005, B:5:0x000c, B:12:0x001b, B:14:0x0025, B:16:0x002d, B:18:0x0032, B:19:0x0035, B:9:0x0016), top: B:26:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIIJ(java.lang.String r8, X.C0VSP r9) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r0]
            r6 = -1
            int r5 = r9.read(r7)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            r4 = 0
        La:
            if (r4 >= r5) goto L41
            r1 = r7[r4]     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            r0 = 10
            if (r1 == r0) goto L16
            if (r4 != 0) goto L35
            if (r1 != r0) goto L18
        L16:
            int r4 = r4 + 1
        L18:
            r3 = r4
        L19:
            if (r3 >= r5) goto L35
            int r2 = r3 - r4
            r1 = r7[r3]     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            char r0 = r8.charAt(r2)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            if (r1 != r0) goto L35
            int r0 = r8.length()     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            int r0 = r0 + (-1)
            if (r2 != r0) goto L32
            int r0 = LIZIZ(r7, r3)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            return r0
        L32:
            int r3 = r3 + 1
            goto L19
        L35:
            int r4 = r4 + 1
            goto La
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.benchmark.device.BXDeviceInfo.LJIIJ(java.lang.String, X.0VSP):int");
    }
}
