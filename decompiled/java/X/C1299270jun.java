package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299270jun {
    public static volatile C1299270jun LJFF;
    public SharedPreferences LIZ;
    public Integer LIZIZ = 0;
    public HashMap<String, Object> LIZJ = null;
    public final HashMap<String, Object> LIZLLL = new HashMap<>();
    public Context LJ = null;

    public static C1299270jun LIZIZ() {
        if (LJFF == null) {
            synchronized (C1299270jun.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1299270jun();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public final HashMap<String, Object> LIZLLL() {
        SharedPreferences sharedPreferences = this.LIZ;
        if (sharedPreferences == null || !sharedPreferences.contains("vmsdk_settings")) {
            return null;
        }
        String string = this.LIZ.getString("vmsdk_settings", "");
        if (this.LIZ.contains("vmsdk_settings_time")) {
            this.LIZIZ = Integer.valueOf(this.LIZ.getInt("vmsdk_settings_time", 0));
        } else {
            this.LIZIZ = 0;
        }
        try {
            Gson gson = new Gson();
            k kVar = (k) gson.LJII(string, k.class);
            if (kVar != null) {
                return (HashMap) gson.LIZJ(kVar.LJIILIIL(), HashMap.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[PHI: r1
      0x0075: PHI (r1v7 java.lang.Object) = (r1v3 java.lang.Object), (r1v1 java.lang.Object) binds: [B:40:0x0073, B:24:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r5 = ""
            r3 = r10
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r6 = 0
            if (r0 == 0) goto Lb
            return r6
        Lb:
            r2 = 0
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r0.getOrDefault(r3, r2)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L34
            java.lang.Class r4 = r5.getClass()     // Catch: java.lang.Throwable -> L2e
            r7 = 1
            r8 = 0
            java.lang.Object r2 = X.C0TKA.LIZJ(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L24
            kotlin.jvm.internal.Intrinsics.LJIIL()     // Catch: java.lang.Throwable -> L2a
            r2 = r5
        L24:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r9.LIZLLL     // Catch: java.lang.Throwable -> L2c
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2a:
            r0 = move-exception
            goto L2f
        L2c:
            r0 = move-exception
            goto L30
        L2e:
            r0 = move-exception
        L2f:
            r2 = r1
        L30:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L33:
            r1 = r2
        L34:
            java.lang.String r4 = "true"
            if (r1 == 0) goto L3e
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L75
        L3e:
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r9.LIZJ
            if (r2 != 0) goto L43
            return r6
        L43:
            java.lang.String r0 = "vmsdk_common"
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L6f
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L73
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto L73
            java.lang.String r2 = "all"
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L6c
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r4.equalsIgnoreCase(r0)     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L6c
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L73:
            if (r1 == 0) goto L84
        L75:
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L84
            java.lang.String r0 = r1.toString()
            boolean r0 = r4.equalsIgnoreCase(r0)
            return r0
        L84:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1299270jun.LIZ(java.lang.String):boolean");
    }

    public final void LIZJ(Context context, String str, Integer num) {
        try {
            Gson gson = new Gson();
            k kVar = (k) gson.LJII(str, k.class);
            if (kVar != null) {
                this.LIZJ = (HashMap) gson.LIZJ(kVar.LJIILIIL(), HashMap.class);
            }
        } catch (Throwable th) {
        }
        if (this.LJ == null && context != null) {
            this.LJ = context;
        }
        if (this.LJ == null) {
            return;
        }
        synchronized (this) {
            try {
                this.LIZIZ = num;
                if (this.LIZ == null) {
                    Context context2 = this.LJ;
                    this.LJ = context2;
                    this.LIZ = C810670Vr7.LIZJ(context2, 0, "vmsdk_settings_manager_sp");
                }
                this.LIZ.edit().putString("vmsdk_settings", str).apply();
                this.LIZ.edit().putInt("vmsdk_settings_time", this.LIZIZ.intValue()).apply();
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
