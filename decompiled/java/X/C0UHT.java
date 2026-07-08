package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UHT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UHT {
    public static void LIZ(C19U0 c19u0) {
        View viewFindViewById;
        C16F5 c16f5;
        View view = c19u0.LJFF;
        if (view != null && (c16f5 = (C16F5) view.findViewById(R.id.wyg)) != null) {
            C786410Ut5.k5(c16f5, 1.0f);
            c16f5.setTextSize(1, 17.0f);
            C1119920fFW.LJI(500, c16f5);
        }
        View view2 = c19u0.LJFF;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.wxy)) != null) {
            C500260Jjc.LLFFF(viewFindViewById);
        }
    }

    public static void LIZIZ(C19U0 c19u0) {
        View viewFindViewById;
        C16F5 c16f5;
        View view = c19u0.LJFF;
        if (view != null && (c16f5 = (C16F5) view.findViewById(R.id.wyg)) != null) {
            C786410Ut5.k5(c16f5, 0.5f);
            c16f5.setTextSize(1, 15.0f);
            C1119920fFW.LJI(400, c16f5);
        }
        View view2 = c19u0.LJFF;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.wxy)) != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
    }
}
