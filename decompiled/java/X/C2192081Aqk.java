package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.applog.filter.NativeFilterJNI;
import com.bytedance.applog.log.NativeLogWrapper;
import com.bytedance.applog.priority.PriorityWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192081Aqk extends AbstractC2194001Atq {
    public final String LIZLLL;
    public boolean LJ;

    @Override // X.AbstractC2194001Atq
    public final boolean LIZLLL(String str) {
        return false;
    }

    @Override // X.AbstractC2194001Atq
    public final boolean LJ(HashSet<String> hashSet, String str) {
        return false;
    }

    @Override // X.InterfaceC2194031Att
    public final boolean LIZIZ() {
        return !this.LJ;
    }

    public C2192081Aqk(final C2209901BeO c2209901BeO, final JSONObject jSONObject) {
        super(null, null);
        String str = c2209901BeO.LJIIIZ;
        this.LIZLLL = str == null ? "" : str;
        new C08UT<Boolean>() { // from class: X.1Aqj
            @Override // X.C08UT
            public final Object LIZ() throws Throwable {
                PriorityWrapper.LJIIIZ.LIZIZ(new Object[0]);
                if (c2209901BeO.LLLII()) {
                    NativeLogWrapper.LIZ();
                }
                String str2 = this.LIZLLL;
                Application application = c2209901BeO.LJIIJ;
                File file = C786450Ut9.LIZJ;
                if (file == null || !C786450Ut9.LJ) {
                    try {
                        C786450Ut9.LIZJ = application.getFilesDir();
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
                if (NativeFilterJNI.nativeInitServerFilter(str2, file.getAbsolutePath()) == 0) {
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        NativeFilterJNI.nativeSetServerFilterConfig(this.LIZLLL, C786410Ut5.J3(jSONObject2));
                    }
                    this.LJ = !NativeFilterJNI.nativeIsServerFilterEmpty(r1.LIZLLL);
                }
                return Boolean.TRUE;
            }
        }.LIZIZ(new Object[0]);
    }

    @Override // X.AbstractC2194001Atq
    public final boolean LIZJ(String str, String str2) {
        if (!this.LJ) {
            return true;
        }
        String str3 = this.LIZLLL;
        if (str == null) {
            str = "";
        }
        return NativeFilterJNI.nativeIsEventAllowed(str3, str);
    }
}
