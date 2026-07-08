package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0Iwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482920Iwk {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(View view) {
        int width;
        View view2;
        C21681819tI c21681819tI;
        int iLIZ = C1617890sCh.LIZ();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer numValueOf = null;
        if ((layoutParams instanceof C21681819tI) && (c21681819tI = (C21681819tI) layoutParams) != null) {
            numValueOf = Integer.valueOf(c21681819tI.LIZ());
        }
        if (numValueOf != null && numValueOf.intValue() >= 0) {
            if (iLIZ > 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(numValueOf.intValue() + 1);
                sbLIZ.append('/');
                sbLIZ.append(iLIZ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            if (numValueOf.intValue() == 0) {
                return "left";
            }
            return "right";
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            width = view2.getWidth();
        } else {
            width = view.getResources().getDisplayMetrics().widthPixels;
        }
        if (iLIZ > 2) {
            int x = ((int) (view.getX() / (width / iLIZ))) + 1;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(x);
            sbLIZ2.append('/');
            sbLIZ2.append(iLIZ);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        float f = width / 2.0f;
        if (f <= 0.0f || view.getX() < f) {
            return "left";
        }
        return "right";
    }
}
