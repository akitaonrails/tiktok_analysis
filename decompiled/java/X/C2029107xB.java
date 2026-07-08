package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: X.07xB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2029107xB<T> {
    public final Class<T> LIZ;
    public final String LIZIZ;
    public final Class<?>[] LIZJ;
    public Method LIZLLL;

    public final boolean LIZ() {
        if (this.LIZLLL == null) {
            try {
                Class<T> cls = this.LIZ;
                String str = this.LIZIZ;
                Class<?>[] clsArr = this.LIZJ;
                this.LIZLLL = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
        return this.LIZLLL != null;
    }

    public C2029107xB(Class<T> cls, String str, Class<?>[] clsArr, Object obj) {
        this.LIZ = cls;
        this.LIZIZ = str;
        this.LIZJ = clsArr;
        new WeakReference(obj);
    }
}
