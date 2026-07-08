package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0f7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115090f7j {
    public static final Method LJII;
    public C19EG LIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJFF;
    public boolean LJI;
    public final Rect LIZIZ = new Rect();
    public boolean LJ = true;

    static {
        Method method = null;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Method declaredMethod = Window.class.getDeclaredMethod("decorFitsSystemWindows", new Class[0]);
                declaredMethod.setAccessible(true);
                method = declaredMethod;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJII = method;
    }
}
