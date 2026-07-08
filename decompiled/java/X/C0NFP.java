package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0NFP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NFP {
    public static final C0NFP LIZ = new C0NFP();
    public static final Map<String, Boolean> LIZIZ = new LinkedHashMap();

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI() {
        /*
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r2 = X.C844470XAv.LIZ()
            r5 = 0
            if (r2 == 0) goto L9e
            java.io.File r1 = X.C786450Ut9.LIZJ
            if (r1 == 0) goto L14
            boolean r0 = X.C786450Ut9.LJ
            if (r0 != 0) goto L98
        L14:
            java.io.File r0 = r2.getFilesDir()     // Catch: java.lang.Throwable -> L1b
            X.C786450Ut9.LIZJ = r0     // Catch: java.lang.Throwable -> L1b
            goto L96
        L1b:
            r6 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r6)
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L6b
            java.lang.String r1 = "currentActivityThread"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L6b
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch: java.lang.Exception -> L6b
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L6b
            java.lang.Object r2 = r1.invoke(r5, r0)     // Catch: java.lang.Exception -> L6b
            java.lang.String r0 = "mInitialApplication"
            java.lang.reflect.Field r1 = r3.getDeclaredField(r0)     // Catch: java.lang.Exception -> L6b
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Exception -> L6b
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L6b
            boolean r0 = r1 instanceof android.app.Application     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L62
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Exception -> L6b
            android.content.Context r4 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L6b
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Exception -> L6e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = "Application context obtained through ActivityThread: "
            r1.append(r0)     // Catch: java.lang.Exception -> L6e
            r1.append(r4)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L6e
            r2.println(r0)     // Catch: java.lang.Exception -> L6e
            goto L8b
        L62:
            java.io.PrintStream r1 = java.lang.System.out     // Catch: java.lang.Exception -> L6b
            java.lang.String r0 = "Error: mInitialApplication is not an instance of Application"
            r1.println(r0)     // Catch: java.lang.Exception -> L6b
            r4 = r5
            goto L8b
        L6b:
            r3 = move-exception
            r4 = r5
            goto L6f
        L6e:
            r3 = move-exception
        L6f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Error: "
            r1.append(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.println(r0)
        L8b:
            if (r4 == 0) goto L9f
            java.io.File r0 = r4.getFilesDir()
            X.C786450Ut9.LIZJ = r0
            X.C08RN.LIZ(r4)
        L96:
            java.io.File r1 = X.C786450Ut9.LIZJ
        L98:
            if (r1 == 0) goto L9e
            java.lang.String r5 = r1.getAbsolutePath()
        L9e:
            return r5
        L9f:
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r6.getMessage()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = X.C08RN.LIZJ()
            r1.append(r0)
            java.lang.String r0 = " applicationContext is null"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NFP.LJI():java.lang.String");
    }

    public static String LJII() {
        File fileW2;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (contextLIZ == null || (fileW2 = C786410Ut5.w2(contextLIZ)) == null) {
            return null;
        }
        return fileW2.getAbsolutePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL() {
        /*
            boolean r0 = X.C07MO.LIZ()
            if (r0 == 0) goto L3b
            X.0NDs r0 = X.C590420NDs.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r2 = X.C590420NDs.LJI()
            r1 = 0
            if (r2 == 0) goto L3b
            java.lang.String r0 = "key_ready_new_cache_path"
            int r1 = r2.getInt(r0, r1)
            r0 = 1
            if (r1 != r0) goto L3b
            java.lang.String r2 = LJI()
        L1f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L40
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r0 = "feedCache"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            return r0
        L3b:
            java.lang.String r2 = LJII()
            goto L1f
        L40:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NFP.LIZLLL():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r3 = 0
            if (r0 == 0) goto L8
            return r3
        L8:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            if (r0 != 0) goto L14
            return r3
        L14:
            boolean r0 = X.C07MO.LIZ()
            if (r0 == 0) goto L55
            X.0NDs r0 = X.C590420NDs.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r2 = X.C590420NDs.LJI()
            r1 = 0
            if (r2 == 0) goto L55
            java.lang.String r0 = "key_ready_new_cache_path"
            int r1 = r2.getInt(r0, r1)
            r0 = 1
            if (r1 != r0) goto L55
            java.lang.String r1 = LJI()
        L33:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L5a
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            r2.append(r1)
            java.lang.String r1 = java.io.File.separator
            r2.append(r1)
            java.lang.String r0 = "feedCache"
            r2.append(r0)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            return r0
        L55:
            java.lang.String r1 = LJII()
            goto L33
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NFP.LIZJ(java.lang.String):java.lang.String");
    }

    public static final boolean LJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            String strLJL = a0.LJL(str, e3.d, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJL);
            sbLIZ.append(".mdl");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJL);
            sbLIZ2.append(".mdlnodeconf");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            boolean zExists = new C0VSJ(strLIZIZ).exists();
            boolean zExists2 = new C0VSJ(strLIZIZ2).exists();
            if (zExists && zExists2) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final boolean LJFF(String str) {
        if (TextUtils.isEmpty(str) || !new C0VSJ(str).exists()) {
            return false;
        }
        return true;
    }

    public final synchronized boolean LIZ(String str) {
        boolean zBooleanValue;
        Boolean bool = (Boolean) ((LinkedHashMap) LIZIZ).get(str);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        return zBooleanValue;
    }

    public static final String LIZIZ(int i, String str) {
        String strLJII = C590440NDu.LJII(str);
        if (strLJII != null && strLJII.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZLLL());
            sbLIZ.append(File.separator);
            sbLIZ.append(strLJII);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public final synchronized void LJIIIIZZ(String str, boolean z) {
        if (!((Boolean) C279770Axr.LIZ.getValue()).booleanValue()) {
            return;
        }
        LIZIZ.put(str, Boolean.valueOf(z));
    }
}
