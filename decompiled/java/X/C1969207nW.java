package X;

import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07nW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1969207nW {
    public static final Constructor<?> LIZ;
    public static final Method LIZIZ;

    static {
        Constructor<?> constructor;
        Method method;
        try {
            Class<?> cls = Class.forName("android.view.RenderNodeAnimator");
            constructor = cls.getConstructor(Integer.TYPE, Float.TYPE);
            constructor.setAccessible(true);
            method = cls.getMethod("setTarget", View.class);
            method.setAccessible(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            constructor = null;
            method = null;
        }
        LIZ = constructor;
        LIZIZ = method;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reflect: RenderNodeAnimator reflection ");
        sbLIZ.append((constructor == null || method == null) ? "UNAVAILABLE" : "OK");
        sbLIZ.append(" (sdk=");
        sbLIZ.append(Build.VERSION.SDK_INT);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
