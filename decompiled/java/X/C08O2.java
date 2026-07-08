package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08O2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08O2 {
    public static C0VSJ LIZ() {
        C844470XAv.LIZ.getClass();
        String path = C786410Ut5.y2(C844470XAv.LIZ(), null).getPath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(path);
        sbLIZ.append("/aweme_monitor");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj;
    }

    public static C0VSJ LIZIZ() throws Throwable {
        Object obj;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextLIZ.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (!(obj instanceof Application)) {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(th.getMessage());
                    sbLIZ2.append(":");
                    sbLIZ2.append(C08RN.LIZJ());
                    sbLIZ2.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                }
                applicationContext = ((Application) obj).getApplicationContext();
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Application context obtained through ActivityThread: ");
                sbLIZ3.append(applicationContext);
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                }
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append(th.getMessage());
                sbLIZ22.append(":");
                sbLIZ22.append(C08RN.LIZJ());
                sbLIZ22.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ22));
            }
            file = C786450Ut9.LIZJ;
        }
        String absolutePath = file.getAbsolutePath();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(absolutePath);
        sbLIZ4.append("/aweme_monitor");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj;
    }
}
