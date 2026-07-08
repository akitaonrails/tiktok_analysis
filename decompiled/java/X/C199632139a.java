package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.139a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C199632139a extends C214698190m {
    public final C199633139b LIZLLL = new C199633139b();

    @Override // X.InterfaceC214697190l
    public void LIZJ(View view, int i, int i2, int i3, int i4) {
        this.LIZLLL.getClass();
        if (!C199633139b.LIZIZ) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setLeftTopRightBottom", cls, cls, cls, cls);
                C199633139b.LIZ = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C199633139b.LIZIZ = true;
        }
        Method method = C199633139b.LIZ;
        if (method != null) {
            try {
                C2204961BRm.a0(method, view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, new C0WZX("dzBzEgAjS8/YVFkiQFyXZaXm8G1avWjRBM6DOGFwCR0ryGcsAPmhDmgPnLtuHclmzUCw99s8WxiqWd+Y2xjmpK1a+XJxiShg2cgLsa+G/OT6GMljuQ1xJxWJ", null));
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}
