package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: X.0WV5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WV5 {
    public static int LJ = -1;
    public final PackageManager LIZ;
    public final ComponentName LIZIZ;
    public final boolean LIZJ;
    public final SharedPreferences LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0WV5(android.content.Context r12, X.C844770XBz r13) {
        /*
            r11 = this;
            r11.<init>()
            android.content.Context r0 = X.C786410Ut5.N3(r12)
            android.content.SharedPreferences r3 = X.C844580XBg.LIZ(r12, r13)
            r11.LIZLLL = r3
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            r11.LIZ = r2
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.bytedance.bdinstall.migrate.MigrateDetectorActivity> r0 = com.bytedance.bdinstall.migrate.MigrateDetectorActivity.class
            r1.<init>(r12, r0)
            r11.LIZIZ = r1
            int r10 = X.C0WV5.LJ
            r0 = -1
            r8 = 0
            if (r10 != r0) goto L2e
            int r10 = r2.getComponentEnabledSetting(r1)     // Catch: java.lang.Exception -> L29
            X.C0WV5.LJ = r10     // Catch: java.lang.Exception -> L29
            goto L2e
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L6c
        L2e:
            java.lang.String r0 = "component_state"
            int r9 = r3.getInt(r0, r8)
            java.lang.StringBuilder r7 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "MigrateDetector#isMigrateInternal cs="
            r7.append(r0)
            java.lang.String r6 = "UNKNOWN"
            java.lang.String r5 = "STATE_DISABLED"
            java.lang.String r4 = "STATE_ENABLED"
            java.lang.String r3 = "STATE_DEFAULT"
            r2 = 2
            r1 = 1
            if (r10 == 0) goto L8a
            if (r10 == r1) goto L88
            if (r10 == r2) goto L86
            r0 = r6
        L4e:
            r7.append(r0)
            java.lang.String r0 = " ss="
            r7.append(r0)
            if (r9 == 0) goto L84
            if (r9 == r1) goto L82
            if (r9 != r2) goto L5d
            r6 = r5
        L5d:
            r7.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r7)
            X.C844830XCf.LIZ(r0)
            if (r10 != 0) goto L6c
            if (r9 != r2) goto L6c
            r8 = 1
        L6c:
            r11.LIZJ = r8
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "MigrateDetector#constructor migrate="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C844830XCf.LIZ(r0)
            return
        L82:
            r6 = r4
            goto L5d
        L84:
            r6 = r3
            goto L5d
        L86:
            r0 = r5
            goto L4e
        L88:
            r0 = r4
            goto L4e
        L8a:
            r0 = r3
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WV5.<init>(android.content.Context, X.0XBz):void");
    }

    public static void LIZ(Context context, C844770XBz c844770XBz, String str, boolean z) {
        SharedPreferences.Editor editorEdit = C844580XBg.LIZ(context, c844770XBz).edit();
        editorEdit.putString("old_did", str);
        if (z) {
            editorEdit.putBoolean("is_migrate", true);
        } else {
            editorEdit.remove("is_migrate");
        }
        editorEdit.apply();
    }
}
