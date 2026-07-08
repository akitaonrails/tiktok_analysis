package X;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.12oA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19866412oA {
    public final Context LIZ;
    public final String LIZIZ;
    public final List<Pattern> LIZJ;
    public final List<Uri> LIZLLL;
    public final String LJ;
    public final InterfaceC19866612oC LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public C19866412oA(C19866512oB c19866512oB) throws Throwable {
        Object obj;
        Context context = c19866512oB.LIZ;
        if (context != null) {
            Context contextN3 = C786410Ut5.N3(context);
            if (contextN3 == null) {
                this.LIZ = c19866512oB.LIZ;
            } else {
                this.LIZ = contextN3;
            }
            if (TextUtils.isEmpty(c19866512oB.LIZJ)) {
                this.LJI = C2362609No.LIZJ(this.LIZ);
            } else {
                this.LJI = c19866512oB.LIZJ;
            }
            if (!TextUtils.isEmpty(c19866512oB.LIZIZ)) {
                this.LIZIZ = c19866512oB.LIZIZ;
                if (!TextUtils.isEmpty(c19866512oB.LJIIIIZZ)) {
                    this.LJII = c19866512oB.LJIIIIZZ;
                    this.LIZJ = c19866512oB.LJFF;
                    List<Uri> list = c19866512oB.LJI;
                    if (list == null) {
                        Uri[] uriArr = new Uri[1];
                        Context context2 = this.LIZ;
                        File file = C786450Ut9.LIZJ;
                        if (file == null || !C786450Ut9.LJ) {
                            try {
                                C786450Ut9.LIZJ = context2.getFilesDir();
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
                        uriArr[0] = Uri.fromFile(new C0VSJ(file, "gecko_offline_res_x"));
                        this.LIZLLL = Arrays.asList(uriArr);
                    } else {
                        this.LIZLLL = list;
                    }
                    this.LJ = c19866512oB.LJII;
                    this.LJFF = c19866512oB.LIZLLL;
                    String str = c19866512oB.LJIIIZ;
                    this.LJIIIIZZ = str;
                    if (!TextUtils.isEmpty(str)) {
                        return;
                    } else {
                        throw new IllegalArgumentException("region == null");
                    }
                }
                throw new IllegalArgumentException("host empty");
            }
            throw new IllegalArgumentException("accessKey empty");
        }
        throw new IllegalArgumentException("context == null");
    }
}
