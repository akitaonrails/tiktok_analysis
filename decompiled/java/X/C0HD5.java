package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0HD5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HD5 {
    public static final int LIZ(View view, Number number) {
        return C814420VxA.LIZIZ(number.floatValue() * view.getContext().getResources().getDisplayMetrics().density);
    }

    public static final float LIZIZ(View view, Number number) {
        return number.floatValue() * view.getContext().getResources().getDisplayMetrics().density;
    }

    public static final float LIZJ(Number number, Context context) {
        return number.floatValue() * context.getResources().getDisplayMetrics().density;
    }

    public static final int LIZLLL(View view, Number number) {
        return (int) ((number.floatValue() * view.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int LJI(Number number, Context context) {
        return C814420VxA.LIZIZ(number.floatValue() * context.getResources().getDisplayMetrics().density);
    }

    public static final int LJ(Number number, C1340720kze c1340720kze, Context context) {
        if (c1340720kze != null) {
            return LIZLLL(c1340720kze, number);
        }
        return (int) ((number.floatValue() * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int LJFF(Number number, View view, Context context) {
        if (view != null) {
            return LIZ(view, number);
        }
        return LJI(number, context);
    }
}
