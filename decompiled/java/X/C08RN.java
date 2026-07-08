package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08RN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RN {
    public static volatile boolean LIZ;
    public static final StringBuilder LIZIZ = new StringBuilder("debug-[");

    public static Application LIZIZ() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            if (obj instanceof Application) {
                return (Application) obj;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            PrintStream printStream = System.out;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error: ");
            sbLIZ.append(e.getMessage());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        return null;
    }

    public static String LIZJ() {
        return LIZIZ.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r4) {
        /*
            boolean r0 = X.C08RN.LIZ
            if (r0 == 0) goto L5
            return
        L5:
            com.bytedance.keva.KevaBuilder r2 = com.bytedance.keva.KevaBuilder.getInstance()
            android.content.Context r0 = r2.getContext()
            java.lang.StringBuilder r3 = X.C08RN.LIZIZ
            if (r0 != 0) goto L41
            boolean r0 = r4 instanceof android.app.Activity     // Catch: java.lang.Exception -> L4a
            if (r0 == 0) goto L37
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Exception -> L4a
            android.app.Application r1 = r4.getApplication()     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L2e
            java.lang.String r0 = "Activity.getApplication==null;"
            r3.append(r0)     // Catch: java.lang.Exception -> L4a
            android.app.Application r1 = LIZIZ()     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L2e
            java.lang.String r0 = "application==null;"
            r3.append(r0)     // Catch: java.lang.Exception -> L4a
            goto L6a
        L2e:
            java.lang.String r0 = "application!=null;"
            r3.append(r0)     // Catch: java.lang.Exception -> L4a
            android.content.Context r4 = r1.getBaseContext()     // Catch: java.lang.Exception -> L4a
        L37:
            if (r4 == 0) goto L6a
            r2.setContext(r4)
            java.lang.String r0 = "aweme_ported_sp_repo"
            r2.setPortedRepoName(r0)
        L41:
            java.lang.String r0 = "]"
            r3.append(r0)
            r0 = 1
            X.C08RN.LIZ = r0
            return
        L4a:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "e="
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = ";"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r3.append(r0)
        L6a:
            java.lang.String r0 = "baseContext==null;"
            r3.append(r0)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08RN.LIZ(android.content.Context):void");
    }
}
