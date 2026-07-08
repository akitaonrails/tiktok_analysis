package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.08OQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08OQ {
    public static void LIZ(File file) {
        C0VSV c0vsv = null;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object objInvoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("dumpGfxInfo", FileDescriptor.class, String[].class);
            declaredMethod.setAccessible(true);
            C0VSV c0vsv2 = new C0VSV(new C0VSJ(file, "gfxinfo.txt"));
            try {
                declaredMethod.invoke(objInvoke, c0vsv2.getFD(), new String[0]);
                C2112008Pe.LIZ(c0vsv2);
            } catch (Throwable th) {
                th = th;
                c0vsv = c0vsv2;
                TryCatchGuardChecker.doCheck(th);
                C2112008Pe.LIZ(c0vsv);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
