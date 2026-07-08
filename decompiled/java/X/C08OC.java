package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08OC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OC {
    public static final Map<String, File> LIZ = new LinkedHashMap();
    public static final boolean LIZIZ = ((Boolean) C306870C1d.LIZJ.getValue()).booleanValue();
    public static final C01GW LIZJ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, AFwS189S0000000_3.get$arr$(1379));

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LIZIZ(Context context) {
        C13BV c13bvLJJII;
        if (LIZIZ) {
            return;
        }
        ((LinkedHashMap) LIZ).clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("splitcompat/");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJ());
        sbLIZ.append("/native-libraries/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (((Boolean) C306870C1d.LIZIZ.getValue()).booleanValue()) {
            File[] fileArrListFiles = new C0VSJ(LIZ(context), strLIZIZ).listFiles();
            if (fileArrListFiles != null) {
                c13bvLJJII = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        c13bvLJJII.add(file);
                    }
                }
            } else {
                c13bvLJJII = C13BV.INSTANCE;
            }
        } else {
            c13bvLJJII = C09RB.LJJII(C09RB.LJIIIZ(C08QB.LJIIL(new C0VSJ(LIZ(context), strLIZIZ)), AFwS231S0000000_3.get$arr$(218)));
        }
        for (File file2 : c13bvLJJII) {
            Map<String, File> map = LIZ;
            String name = file2.getName();
            map.put(a0.LJJZ(name, ".config.", name), (File) LIZJ.getValue());
        }
    }
}
