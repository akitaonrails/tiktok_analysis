package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.13lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20104213lQ {
    public static final Method LIZIZ;
    public static final Method LIZJ;
    public static final Method LIZLLL;
    public static final Method LJ;
    public final RecyclerView.ViewHolder LIZ;

    static {
        try {
            RecyclerView.ViewHolder.class.getDeclaredMethod("shouldIgnore", new Class[0]).setAccessible(true);
            Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("isInvalid", new Class[0]);
            LIZIZ = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
            LIZJ = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Class cls = Integer.TYPE;
            Method declaredMethod3 = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", cls, cls);
            LJ = declaredMethod3;
            declaredMethod3.setAccessible(true);
            try {
                LIZLLL = RecyclerView.ViewHolder.class.getDeclaredMethod("isChanged", new Class[0]);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                LIZLLL = RecyclerView.ViewHolder.class.getDeclaredMethod("isUpdated", new Class[0]);
            }
            LIZLLL.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public C20104213lQ(RecyclerView.ViewHolder viewHolder) {
        this.LIZ = viewHolder;
    }

    public static void LIZ(RecyclerView.ViewHolder viewHolder, int i) throws Throwable {
        try {
            C2204961BRm.a0(LJ, viewHolder, new Object[]{0, Integer.valueOf(i)}, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KYwkfTaHYJk/j45QfBpnaHO5k4gTCIlNDMKvFsFXHHhiCZzguH+", null));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
