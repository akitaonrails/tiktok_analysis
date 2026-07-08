package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0JSD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, C0JSE c0jse, C0JSE c0jse2) {
        if (view != null) {
            int i = c0jse.LIZ;
            int i2 = c0jse.LIZIZ;
            int i3 = c0jse2.LIZ;
            int i4 = c0jse2.LIZIZ;
            double d = i;
            double d2 = i2;
            double d3 = i3;
            double d4 = i4;
            if (d / d2 > d3 / d4) {
                i4 = (int) ((d3 * d2) / d);
            } else {
                i3 = (int) ((d4 * d) / d2);
            }
            C0JSE c0jse3 = new C0JSE(i3, i4);
            int i5 = c0jse3.LIZ;
            int i6 = c0jse3.LIZIZ;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width == i5 && marginLayoutParams.height == i6) {
                return;
            }
            marginLayoutParams.width = i5;
            marginLayoutParams.height = i6;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }
}
