package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08PT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PT {
    public static final C01GW LIZ;
    public static final C08CX LIZIZ;
    public static final C08CX LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZ = C452501pT.LIZ(enumC452301pR, new C08PV());
        C08CX c08cx = C08CX.INSTANCE;
        LIZIZ = c08cx;
        LIZJ = c08cx;
        LIZLLL = C452501pT.LIZ(enumC452301pR, new C2109508Of());
        LJ = C452501pT.LIZ(enumC452301pR, new C08PU());
        LJFF = C452501pT.LIZIZ(new C08PX());
    }

    public static final Set<String> LIZJ() {
        Set<String> setLJLIIL;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        try {
            String[] strArr = C786410Ut5.Y3(contextLIZ.getPackageManager(), contextLIZ.getPackageName(), 0).splitNames;
            return (strArr == null || (setLJLIIL = C13LQ.LJLIIL(strArr)) == null) ? C08CX.INSTANCE : setLJLIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C08CX.INSTANCE;
        }
    }

    public static final Set<String> LIZLLL() {
        try {
            return C15442062u.LJIIIZ(C1BLO.LIZJ.LJFF(), LIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("!!ERROR!!\n");
            sbLIZ.append(C13SZ.LIZIZ(th));
            return Collections.singleton(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final int LJ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
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
        return C786450Ut9.LIZJ;
    }

    public static final List LIZIZ(C0VSJ c0vsj, String str, String str2) {
        try {
            File[] fileArrListFiles = C08QA.LJIL(c0vsj, str2).listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('.');
                    if (u.LJJIIJZLJL(name, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        arrayList.add(file);
                    }
                }
                return arrayList;
            }
            return C13BV.INSTANCE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C13BV.INSTANCE;
        }
    }
}
