package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Ol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2110108Ol extends C09AY implements Function0<File> {
    public final /* synthetic */ C1527670prB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2110108Ol(C1527670prB c1527670prB) {
        super(0);
        this.LL = c1527670prB;
    }

    @Override // kotlin.jvm.functions.Function0
    public final File invoke() throws Throwable {
        Context context = this.LL.LL;
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
                if (applicationContext == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            }
            file = C786450Ut9.LIZJ;
        }
        return file.getAbsoluteFile();
    }
}
