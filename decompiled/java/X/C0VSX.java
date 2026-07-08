package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0VSX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSX {
    public final Map<String, C0X9I> LIZ = new HashMap();
    public final String LIZIZ;
    public final String LIZJ;

    public final Map<String, Long> LIZJ() {
        HashMap map = new HashMap();
        synchronized (this.LIZ) {
            try {
                Collection<C0X9I> collectionValues = ((HashMap) this.LIZ).values();
                if (collectionValues == null) {
                    return map;
                }
                for (C0X9I c0x9i : collectionValues) {
                    map.put(c0x9i.LIZJ, c0x9i.LJ);
                }
                return map;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ() {
        synchronized (this.LIZ) {
            try {
                Iterator it2 = ((HashMap) this.LIZ).values().iterator();
                while (it2.hasNext()) {
                    ((C0X9I) it2.next()).LIZJ();
                }
                ((HashMap) this.LIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
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

    public final C0X9I LIZIZ(String str) {
        C0X9I c0x9i;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            C0X9I c0x9i2 = (C0X9I) ((HashMap) this.LIZ).get(strSubstring);
            if (c0x9i2 == null) {
                synchronized (this.LIZ) {
                    try {
                        c0x9i = (C0X9I) ((HashMap) this.LIZ).get(strSubstring);
                        if (c0x9i == null) {
                            c0x9i = new C0X9I(this.LIZIZ, this.LIZJ, strSubstring);
                            ((HashMap) this.LIZ).put(strSubstring, c0x9i);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                return c0x9i;
            }
            return c0x9i2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channel is needed：");
        sbLIZ.append(str);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C0VSP LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0X9I c0x9iLIZIZ = LIZIZ(str.trim());
            C0X9H c0x9hLIZIZ = c0x9iLIZIZ.LIZIZ(c0x9iLIZIZ.LIZJ, EnumC797980VSa.GET_INPUT_STREAM);
            String strSubstring = str.substring(c0x9iLIZIZ.LIZJ.length() + 1);
            c0x9hLIZIZ.getClass();
            return new C0VSP(c0x9hLIZIZ.LIZ(c0x9hLIZIZ.LIZ, strSubstring));
        }
        throw new RuntimeException("relativePath is empty");
    }

    public C0VSX(Context context, String str, C0VSJ c0vsj) {
        if (!TextUtils.isEmpty(str)) {
            this.LIZIZ = str;
            this.LIZJ = new C0VSJ(c0vsj, str).getAbsolutePath();
            return;
        }
        throw new RuntimeException("access key is empty");
    }
}
