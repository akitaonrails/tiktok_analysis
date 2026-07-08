package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.08OL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OL implements C08OM {
    public final Context LIZ;
    public Keva LIZIZ;

    public C08OL(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }

    public final Keva LIZ(String str) {
        if (this.LIZIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZIZ == null) {
                        String[] strArrLIZIZ = LIZIZ(str);
                        this.LIZIZ = KevaImpl.getRepoWithPath(strArrLIZIZ[1], strArrLIZIZ[0], 0, false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZIZ;
    }

    public final String[] LIZIZ(String str) throws Throwable {
        Context context = this.LIZ;
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
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Application context obtained through ActivityThread: ");
                        sbLIZ.append(applicationContext);
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Error: ");
                    sbLIZ2.append(e.getMessage());
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            file = C786450Ut9.LIZJ;
        }
        String absolutePath = file.getAbsolutePath();
        if (str.startsWith(absolutePath)) {
            str = str.substring(absolutePath.length());
        }
        C0VSJ c0vsj = new C0VSJ(str);
        String parent = c0vsj.getParent();
        String name = c0vsj.getName();
        if (parent.startsWith("/")) {
            parent = parent.substring(1);
        }
        if (!parent.endsWith("/")) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(parent);
            sbLIZ4.append("/");
            parent = C2188811AlT.LIZIZ(sbLIZ4);
        }
        return new String[]{parent, name};
    }
}
