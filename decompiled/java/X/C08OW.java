package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08OW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OW {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
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
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Application context obtained through ActivityThread: ");
                        sbLIZ2.append(applicationContext);
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Error: ");
                    sbLIZ3.append(e.getMessage());
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(th.getMessage());
                    sbLIZ4.append(":");
                    sbLIZ4.append(C08RN.LIZJ());
                    sbLIZ4.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
            file = C786450Ut9.LIZJ;
        }
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("/cutsame");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(Context context, EnumC23090092y enumC23090092y) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ(context));
        sbLIZ.append('/');
        sbLIZ.append(enumC23090092y.getDirName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        new C0VSJ(strLIZIZ).mkdirs();
        return strLIZIZ;
    }
}
