package X;

import android.content.Context;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129410fUp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Window window) {
        if (window == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (C753060TgO.LIZ()) {
            window.setNavigationBarColor(-16777216);
            return;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c_u, window.getContext());
        if (numLIZJ == null) {
            return;
        }
        window.setNavigationBarColor(numLIZJ.intValue());
    }

    public static void LIZIZ(Context context, boolean z, ConstraintLayout constraintLayout, int i, int i2, int i3, int i4, int i5, boolean z2) {
        float fLJI;
        int iLIZJ;
        int width = constraintLayout.getWidth();
        int height = constraintLayout.getHeight();
        if (width > 0 && height > 0) {
            if (C497740JfY.LJJ() && !z) {
                fLJI = i3 + i;
            } else if (C497740JfY.LJJ() && z) {
                fLJI = i;
            } else if (z2) {
                fLJI = (C14KS.LJI(context) - width) - i;
            } else {
                fLJI = (i4 - width) - i;
            }
            C786410Ut5.Fd(constraintLayout, fLJI);
            if (z2) {
                iLIZJ = ((i5 - height) - i2) - C497820Jfg.LIZJ(context);
            } else {
                iLIZJ = (i5 - height) - i2;
            }
            C786410Ut5.Ld(constraintLayout, iLIZJ);
        }
    }
}
