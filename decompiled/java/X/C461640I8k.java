package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0I8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461640I8k {
    public static final C461640I8k LIZ = new C461640I8k();

    public static int LIZIZ(Context context, boolean z) {
        EnumC461660I8m enumC461660I8m;
        C461640I8k c461640I8k = LIZ;
        if (z) {
            enumC461660I8m = EnumC461660I8m.END;
        } else {
            enumC461660I8m = EnumC461660I8m.START;
        }
        return LIZJ(c461640I8k, context, enumC461660I8m, 0.82f, 0.8f, 112);
    }

    public final void LIZ(EnumC461660I8m enumC461660I8m, View view) {
        int iLIZJ = LIZJ(this, view.getContext(), enumC461660I8m, 0.0f, 0.0f, 124);
        if (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)) > iLIZJ) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLIZJ;
                C786410Ut5.W5(view, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static int LIZJ(C461640I8k c461640I8k, Context context, EnumC461660I8m enumC461660I8m, float f, float f2, int i) {
        int i2;
        int i3;
        int iLIZIZ;
        int iLIZIZ2;
        if ((i & 4) != 0) {
            f = 0.82f;
        }
        if ((i & 8) != 0) {
            f2 = 0.8f;
        }
        int i4 = 0;
        if ((i & 16) != 0) {
            i2 = 30;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            i4 = 12;
        }
        c461640I8k.getClass();
        int i5 = C461650I8l.LIZ[enumC461660I8m.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    return C497820Jfg.LIZIZ(context);
                }
                throw new C1954807lC();
            }
            iLIZIZ = (int) (C497820Jfg.LIZIZ(context) * f2);
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
        } else {
            iLIZIZ = (((int) (C497820Jfg.LIZIZ(context) * f)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
        }
        return iLIZIZ - iLIZIZ2;
    }
}
