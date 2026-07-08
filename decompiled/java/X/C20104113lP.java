package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.13lP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20104113lP {
    public static final Method LIZ;
    public static final Method LIZIZ;

    static {
        try {
            RecyclerView.ViewHolder.class.getDeclaredMethod("shouldIgnore", new Class[0]).setAccessible(true);
            RecyclerView.ViewHolder.class.getDeclaredMethod("isInvalid", new Class[0]).setAccessible(true);
            RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]).setAccessible(true);
            Class cls = Integer.TYPE;
            Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", cls, cls);
            LIZIZ = declaredMethod;
            declaredMethod.setAccessible(true);
            try {
                LIZ = RecyclerView.ViewHolder.class.getDeclaredMethod("isChanged", new Class[0]);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ = RecyclerView.ViewHolder.class.getDeclaredMethod("isUpdated", new Class[0]);
            }
            LIZ.setAccessible(true);
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZ(RecyclerView.ViewHolder viewHolder, int i) {
        try {
            C2204961BRm.a0(LIZIZ, viewHolder, new Object[]{0, Integer.valueOf(i)}, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5Sn8defrWuQXD+mhYCWsgzO2RCbsZl919sqD4QassFE3g7Pbr0L+", null));
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
