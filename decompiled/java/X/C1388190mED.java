package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388190mED {
    public static Function1<? super Context, Unit> LIZ;

    public static final Activity LIZ(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static final C19EG LIZIZ(Context context) {
        Activity activityLIZ = LIZ(context);
        if (activityLIZ instanceof C19EG) {
            return (C19EG) activityLIZ;
        }
        return null;
    }

    public static final boolean LIZLLL(int i) {
        int iLJIIL = C2441009hQ.LJIIL(i, 255);
        int iLJIIIZ = C2441009hQ.LJIIIZ(4.5f, -1, iLJIIL);
        int iLJIIIZ2 = C2441009hQ.LJIIIZ(3.0f, -1, iLJIIL);
        if (iLJIIIZ != -1 && iLJIIIZ2 != -1) {
            return true;
        }
        int iLJIIIZ3 = C2441009hQ.LJIIIZ(4.5f, -16777216, iLJIIL);
        int iLJIIIZ4 = C2441009hQ.LJIIIZ(3.0f, -16777216, iLJIIL);
        if ((iLJIIIZ3 == -1 || iLJIIIZ4 == -1) && iLJIIIZ2 != -1) {
            return true;
        }
        return false;
    }

    public static final int LIZJ(Context context, boolean z) {
        int i;
        if (z) {
            i = R.attr.g0b;
        } else {
            i = R.attr.g0e;
        }
        Integer numLIZ = C1308910kAL.LIZ(i, context);
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        return 0;
    }

    public static final C1361400lX0 LJ(int i, Context context) {
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, i);
        Function1<? super Context, Unit> function1 = LIZ;
        if (function1 != null) {
            function1.invoke(c1361400lX0);
        }
        return c1361400lX0;
    }

    public static final C1361400lX0 LJFF(Context context, Resources.Theme theme) {
        C1361400lX0 c1361400lX0 = new C1361400lX0(context, theme);
        Function1<? super Context, Unit> function1 = LIZ;
        if (function1 != null) {
            function1.invoke(c1361400lX0);
        }
        return c1361400lX0;
    }
}
