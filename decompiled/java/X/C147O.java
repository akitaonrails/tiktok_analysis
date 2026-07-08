package X;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.147O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C147O {
    public static final Method LIZ;
    public static final Method LIZIZ;
    public static final Method LIZJ;
    public static final boolean LIZLLL;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            LIZ = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            LIZIZ = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            LIZJ = declaredMethod3;
            declaredMethod3.setAccessible(true);
            LIZLLL = true;
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
