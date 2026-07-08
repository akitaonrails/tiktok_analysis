package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941020aay {
    public static final C01GW LIZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(101));
    public static final C01GW LIZIZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(102));

    public static final void LIZIZ(ImageView imageView, float f, float f2) {
        if (imageView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = (int) C497740JfY.LIZIZ(f);
        layoutParams.height = (int) C497740JfY.LIZIZ(f2);
        C786410Ut5.c6(imageView, layoutParams);
    }

    public static final void LIZ(int i, C1324720kZq c1324720kZq, C16F5 c16f5, C16F5 c16f52) {
        if (i <= ((int) C497740JfY.LIZIZ(80.0f))) {
            LIZIZ(c1324720kZq, 50.0f, 30.0f);
        } else if (i > ((int) C497740JfY.LIZIZ(80.0f)) && i <= ((int) C497740JfY.LIZIZ(110.0f))) {
            LIZIZ(c1324720kZq, 60.0f, 36.0f);
        } else if (i > ((int) C497740JfY.LIZIZ(110.0f)) && i <= ((int) C497740JfY.LIZIZ(210.0f))) {
            LIZIZ(c1324720kZq, 88.0f, 53.0f);
        } else if (i > ((int) C497740JfY.LIZIZ(210.0f))) {
            LIZIZ(c1324720kZq, 188.0f, 113.0f);
        }
        if (i < ((int) C497740JfY.LIZIZ(160.0f))) {
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
                return;
            }
            return;
        }
        if (i >= ((int) C497740JfY.LIZIZ(160.0f)) && i < ((int) C497740JfY.LIZIZ(220.0f))) {
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 0);
            }
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
            if (c16f5 != null) {
                c16f5.setTextSize(10.0f);
            }
            if (c16f52 == null) {
                return;
            }
            c16f52.setTextSize(10.0f);
            return;
        }
        if (i <= ((int) C497740JfY.LIZIZ(220.0f))) {
            return;
        }
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 0);
        }
        if (c16f5 != null) {
            c16f5.setTextSize(17.0f);
        }
        if (c16f52 == null) {
            return;
        }
        c16f52.setTextSize(15.0f);
    }
}
