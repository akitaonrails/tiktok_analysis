package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805560Vis {
    public static ArrayMap<String, File> LIZLLL;
    public final SharedPreferences LIZ;
    public static final Map<String, C805560Vis> LIZIZ = new HashMap();
    public static boolean LIZJ = false;
    public static C0VSJ LJ = null;
    public static Method LJFF = null;

    public static C805560Vis LIZLLL() {
        return LJ("safe_mode_config_sp");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:11:0x001b, B:13:0x001f, B:14:0x0026, B:16:0x0030, B:18:0x0037, B:20:0x0053, B:26:0x008d, B:27:0x0091, B:21:0x005d, B:23:0x0063, B:24:0x0079), top: B:41:0x001b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C805560Vis(java.lang.String r11) {
        /*
            r10 = this;
            r10.<init>()
            boolean r0 = X.C805560Vis.LIZJ
            r3 = 0
            if (r0 == 0) goto Lb1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto La4
            r0 = 34
            if (r1 > r0) goto La4
            X.1BMY r0 = X.C1BMY.LIZIZ()
            android.content.Context r5 = r0.LJ
            java.lang.Class<X.0Vis> r9 = X.C805560Vis.class
            monitor-enter(r9)     // Catch: java.lang.Exception -> L99
            android.util.ArrayMap<java.lang.String, java.io.File> r0 = X.C805560Vis.LIZLLL     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L26
            android.util.ArrayMap r0 = new android.util.ArrayMap     // Catch: java.lang.Throwable -> L93
            r0.<init>()     // Catch: java.lang.Throwable -> L93
            X.C805560Vis.LIZLLL = r0     // Catch: java.lang.Throwable -> L93
        L26:
            android.util.ArrayMap<java.lang.String, java.io.File> r0 = X.C805560Vis.LIZLLL     // Catch: java.lang.Throwable -> L93
            java.lang.Object r8 = r0.get(r11)     // Catch: java.lang.Throwable -> L93
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Throwable -> L93
            if (r8 != 0) goto L5d
            LJFF(r5)     // Catch: java.lang.Throwable -> L93
            X.0VSJ r0 = X.C805560Vis.LJ     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L8d
            java.io.File r2 = LJFF(r5)     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L93
            r1.append(r11)     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = ".xml"
            r1.append(r0)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L93
            char r0 = java.io.File.separatorChar     // Catch: java.lang.Throwable -> L93
            int r0 = r1.indexOf(r0)     // Catch: java.lang.Throwable -> L93
            if (r0 >= 0) goto L8d
            X.0VSJ r8 = new X.0VSJ     // Catch: java.lang.Throwable -> L93
            r8.<init>(r2, r1)     // Catch: java.lang.Throwable -> L93
            android.util.ArrayMap<java.lang.String, java.io.File> r0 = X.C805560Vis.LIZLLL     // Catch: java.lang.Throwable -> L93
            r0.put(r11, r8)     // Catch: java.lang.Throwable -> L93
        L5d:
            java.lang.reflect.Method r0 = X.C805560Vis.LJFF     // Catch: java.lang.Throwable -> L93
            r7 = 1
            r6 = 2
            if (r0 != 0) goto L79
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "getSharedPreferences"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L93
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r1[r3] = r0     // Catch: java.lang.Throwable -> L93
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L93
            r1[r7] = r0     // Catch: java.lang.Throwable -> L93
            java.lang.reflect.Method r0 = r4.getMethod(r2, r1)     // Catch: java.lang.Throwable -> L93
            X.C805560Vis.LJFF = r0     // Catch: java.lang.Throwable -> L93
        L79:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.reflect.Method r2 = X.C805560Vis.LJFF     // Catch: java.lang.Exception -> L99
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L99
            r1[r3] = r8     // Catch: java.lang.Exception -> L99
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L99
            r1[r7] = r0     // Catch: java.lang.Exception -> L99
            java.lang.Object r0 = r2.invoke(r5, r1)     // Catch: java.lang.Exception -> L99
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch: java.lang.Exception -> L99
            goto La1
        L8d:
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r11, r3)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L93
            goto La1
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L93
            throw r0     // Catch: java.lang.Exception -> L99
        L99:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.content.SharedPreferences r0 = r5.getSharedPreferences(r11, r3)
        La1:
            r10.LIZ = r0
            return
        La4:
            X.1BMY r0 = X.C1BMY.LIZIZ()
            android.content.Context r0 = r0.LJ
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r3)
            r10.LIZ = r0
            return
        Lb1:
            X.1BMY r0 = X.C1BMY.LIZIZ()
            android.content.Context r0 = r0.LJ
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r3)
            r10.LIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C805560Vis.<init>(java.lang.String):void");
    }

    public static C805560Vis LJ(String str) {
        C805560Vis c805560Vis;
        if (TextUtils.isEmpty(str)) {
            str = "safe_mode_config_sp";
        }
        Map<String, C805560Vis> map = LIZIZ;
        C805560Vis c805560Vis2 = (C805560Vis) ((HashMap) map).get(str);
        if (c805560Vis2 == null) {
            synchronized (C805560Vis.class) {
                try {
                    c805560Vis = (C805560Vis) ((HashMap) map).get(str);
                    if (c805560Vis == null) {
                        c805560Vis = new C805560Vis(str);
                        ((HashMap) map).put(str, c805560Vis);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c805560Vis;
        }
        return c805560Vis2;
    }

    public static File LJFF(Context context) {
        try {
            if (LJ == null) {
                LJ = new C0VSJ(context.getApplicationInfo().dataDir, "shared_prefs");
            }
            if (!LJ.exists()) {
                LJ = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ = null;
        }
        return LJ;
    }

    public final int LIZ(int i, String str) {
        return this.LIZ.getInt(str, i);
    }

    public final long LIZIZ(long j, String str) {
        return this.LIZ.getLong(str, j);
    }

    public final String LIZJ(String str, String str2) {
        return this.LIZ.getString(str, str2);
    }

    public final void LJI(int i, String str) {
        this.LIZ.edit().putInt(str, i).apply();
    }

    public final void LJII(long j, String str) {
        this.LIZ.edit().putLong(str, j).apply();
    }

    public final void LJIIIIZZ(String str, String str2) {
        this.LIZ.edit().putString(str, str2).apply();
    }
}
