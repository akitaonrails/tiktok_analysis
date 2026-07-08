package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0qX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553670qX7 {
    public static final C1553670qX7 LIZ = new C1553670qX7();

    public static final String LIZ() {
        int i = C1551070qSv.LIZ[C1552050qUV.LJII().ordinal()];
        return i != 1 ? i != 2 ? "95bcaef5f85b57bef49180849da0ab20" : "365b20e8f6c343df1eff65214a0e3e74" : "9f87ed36c915115ff7febd807c9e1a23";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:28:0x0073, B:36:0x00a5, B:23:0x0061, B:25:0x0064, B:27:0x0067, B:29:0x0086, B:31:0x008c, B:32:0x0090, B:34:0x0096), top: B:50:0x0061, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.util.regex.Pattern> LIZJ() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1553670qX7.LIZJ():java.util.List");
    }

    public static C0VSJ LIZLLL() {
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
        C0VSJ c0vsj = new C0VSJ(file, "offlineX");
        C2354709Kn.LJI(c0vsj);
        return c0vsj;
    }

    public static String LIZIZ() {
        Keva repo;
        return (!C19273010ae.LIZIZ() || (repo = Keva.getRepo("hybrid_debug_settings")) == null) ? "gecko-va.tiktokv.com" : repo.getString("gecko_host_spinner", "gecko-va.tiktokv.com");
    }
}
