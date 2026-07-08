package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AwS386S0200000_20;

/* JADX INFO: renamed from: X.0kOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317600kOM<T, F> {
    public final Class<T> LIZ;
    public final String LIZIZ;
    public Field LIZJ;
    public final WeakReference<Object> LIZLLL;

    public final F LIZ() {
        AwS386S0200000_20 awS386S0200000_20;
        boolean zIsAccessible;
        if (this.LIZJ == null) {
            try {
                for (Class<T> superclass = this.LIZ; superclass != null; superclass = superclass.getSuperclass()) {
                    try {
                        this.LIZJ = superclass.getDeclaredField(this.LIZIZ);
                        break;
                    } catch (NoSuchFieldException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Field field = this.LIZJ;
        if (field == null) {
            return null;
        }
        C259800zU c259800zU = new C259800zU();
        try {
            awS386S0200000_20 = new AwS386S0200000_20(c259800zU, this, 4);
            zIsAccessible = field.isAccessible();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            field.setAccessible(true);
            awS386S0200000_20.invoke(field);
            field.setAccessible(zIsAccessible);
            return c259800zU.element;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            field.setAccessible(zIsAccessible);
            throw th3;
        }
    }

    public C1317600kOM(Class<T> cls, String str, Object obj) {
        this.LIZ = cls;
        this.LIZIZ = str;
        this.LIZLLL = new WeakReference<>(obj);
    }
}
