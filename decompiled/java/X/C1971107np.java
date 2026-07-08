package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;

/* JADX INFO: renamed from: X.07np, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1971107np {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(String str) throws Throwable {
        int i = 0;
        Object[] objArr = {str, 493, -1, -1};
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class[] clsArr = new Class[4];
            while (true) {
                Class<?> cls2 = null;
                if (i < 4) {
                    Object obj = objArr[i];
                    if (obj != null) {
                        cls2 = obj.getClass();
                    }
                    clsArr[i] = cls2;
                    i++;
                } else {
                    C2204961BRm.a0(C1965207ms.LIZ(cls, clsArr), null, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyJaZYcJ8F1QKUvN/qhwKsqXlSso8D4FUHL/A==", null));
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
