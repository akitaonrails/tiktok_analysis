package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.util.Log;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mGS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389580mGS {
    public static final C1389580mGS LIZ = new C1389580mGS();

    public static void LIZ(Activity activity) {
        Object c098200Yq;
        try {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C1088190eQL.LIZ(activity)) {
                LIZIZ(1.0f);
                C07XO.LIZ = false;
                c098200Yq = Unit.LIZ;
            } else {
                Resources.Theme theme = activity.getTheme();
                if (theme != null) {
                    theme.applyStyle(R.style.yj, true);
                }
                Window window = activity.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.yj);
                }
                LIZIZ(0.0f);
                C07XO.LIZ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ActivityReduceMotionProcessor reduceMotionIfNeed for ");
                sbLIZ.append(activity);
                c098200Yq = Integer.valueOf(Log.e("ReduceMotion", C2188811AlT.LIZIZ(sbLIZ)));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZIZ(float f) {
        Object c098200Yq;
        try {
            Method declaredMethod = ValueAnimator.class.getDeclaredMethod("setDurationScale", Float.TYPE);
            declaredMethod.setAccessible(true);
            c098200Yq = declaredMethod.invoke(null, Float.valueOf(f));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
