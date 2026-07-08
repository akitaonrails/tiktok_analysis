package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.08Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2109008Oa {
    public static volatile String LIZ;
    public static volatile String LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile List<String> LJ = new ArrayList();
    public static volatile List<String> LJFF = new ArrayList();
    public static volatile boolean LJI = false;
    public static volatile List<Pattern> LJII = new ArrayList();
    public static volatile List<String> LJIIIIZZ = new CopyOnWriteArrayList();

    public static String LIZ(Context context) {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open("ttnet_config.json");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            String str = new String(bArr, "UTF-8");
            try {
                inputStreamOpen.close();
                return str;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return str;
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                        return "";
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return "";
                    }
                }
                return "";
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                        throw th2;
                    } catch (IOException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        throw th2;
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean LIZIZ(Context context) throws Throwable {
        Object obj;
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
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        String absolutePath = file.getAbsolutePath();
        if (!TextUtils.isEmpty(absolutePath)) {
            try {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(absolutePath);
                sbLIZ4.append("/");
                sbLIZ4.append("ttnet_boe.flag");
                if (new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4)).exists()) {
                    return true;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(android.content.Context r7, java.lang.String r8, java.util.List<X.C080U> r9) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2109008Oa.LIZJ(android.content.Context, java.lang.String, java.util.List):java.lang.String");
    }
}
