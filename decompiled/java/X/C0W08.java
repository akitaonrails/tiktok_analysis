package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W08, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W08 {
    public static final Field LIZ;

    static {
        try {
            LIZ = View.class.getDeclaredField("mContext");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r4) {
        /*
            boolean r0 = r4 instanceof X.C199Y
            r3 = 0
            if (r0 == 0) goto L52
            r1 = r4
            X.19FO r1 = (X.C19FO) r1
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            X.0qmi r0 = (X.AbstractC1563340qmi) r0
            X.0QpW r2 = X.EnumC682280QpW.IS_FINISHING
            boolean r0 = r0.LJI(r2)
            if (r0 != 0) goto L24
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            X.0qmi r1 = (X.AbstractC1563340qmi) r1
            X.0QpW r0 = X.EnumC682280QpW.IS_DESTROY
            boolean r0 = r1.LJI(r0)
            if (r0 == 0) goto L52
        L24:
            int r1 = r2.getValue()
            X.0QpW r0 = X.EnumC682280QpW.IS_DESTROY
            int r0 = r0.getValue()
            r1 = r1 | r0
            java.lang.Integer r2 = X.C1565730qqZ.LIZ(r1, r4)
            if (r2 == 0) goto L52
            boolean r0 = r4 instanceof X.C19EG
            if (r0 == 0) goto L50
            r1 = r4
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L48
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L50
        L48:
            int r0 = r2.intValue()
            X.C1565730qqZ.LIZIZ(r0, r4)
        L4f:
            return r3
        L50:
            r3 = 1
            goto L48
        L52:
            boolean r0 = r4 instanceof X.C19EG
            if (r0 == 0) goto L65
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r0 = r4.isDestroyed()
            if (r0 != 0) goto L4f
            boolean r0 = r4.isFinishing()
            if (r0 == 0) goto L65
            return r3
        L65:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W08.LIZ(android.content.Context):boolean");
    }

    public static void LIZIZ(Activity activity, View view) {
        int childCount;
        synchronized (view) {
            try {
                if (!(view.getContext() instanceof Activity) || (!Intrinsics.LJFF(view.getContext(), activity))) {
                    int i = 0;
                    try {
                        Field field = LIZ;
                        if (field != null) {
                            field.setAccessible(true);
                            field.set(view, activity);
                            field.setAccessible(false);
                        } else {
                            int i2 = C2187451AjH.LIZ;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i3 = C2187451AjH.LIZ;
                    }
                    if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount() - 1) >= 0) {
                        while (true) {
                            LIZIZ(activity, ((ViewGroup) view).getChildAt(i));
                            if (i == childCount) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
