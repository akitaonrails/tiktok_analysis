package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.09Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2340909Ff {
    public static int LIZ;

    public static int LIZ(Context context) {
        int height;
        boolean z;
        boolean z2;
        Window window;
        View decorView;
        View viewFindViewById;
        int i = LIZ;
        if (i > 0) {
            return i;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            activityLIZ = C2214201BlK.LJFF();
        }
        if (activityLIZ != null && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.content)) != null) {
            height = viewFindViewById.getHeight();
        } else {
            height = 0;
        }
        int iLJIIJJI = height - C12ES.LJIIJJI(context);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
        if (iLJIIIIZZ >= iLJIIJJI) {
            iLJIIJJI = iLJIIIIZZ;
        }
        if (C2341009Fg.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = (int) (iLJIIJJI * 0.68f);
            LIZ = i2;
            return i2;
        }
        if (C2341009Fg.LIZ() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i3 = (int) (iLJIIJJI * 0.73f);
            LIZ = i3;
            return i3;
        }
        int dimension = ((int) context.getResources().getDimension(com.zhiliaoapp.musically.R.dimen.jm)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        if (C2341009Fg.LIZ() == 3) {
            int iMax = Math.max((int) (iLJIIJJI * 0.68f), dimension);
            LIZ = iMax;
            return iMax;
        }
        if (C2341009Fg.LIZ() == 4) {
            int iMax2 = Math.max((int) (iLJIIJJI * 0.73f), dimension);
            LIZ = iMax2;
            return iMax2;
        }
        LIZ = dimension;
        return dimension;
    }

    public static int LIZIZ(Context context) {
        Window window;
        View decorView;
        View viewFindViewById;
        int height;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if ((activityLIZ != null || ((abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null)) && (window = activityLIZ.getWindow()) != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(R.id.content)) != null) {
            height = viewFindViewById.getHeight();
        } else {
            height = 0;
        }
        int iLJIIJJI = height - C12ES.LJIIJJI(context);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
        if (iLJIIIIZZ >= iLJIIJJI) {
            return iLJIIIIZZ;
        }
        return iLJIIJJI;
    }
}
