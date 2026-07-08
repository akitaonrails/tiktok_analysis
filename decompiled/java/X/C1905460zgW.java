package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905460zgW {
    public static float LIZ;

    public static void LIZ(View view) {
        view.setForeground(C800330VaR.LIZIZ(view.getContext(), R.drawable.ai3));
    }

    public static int LIZIZ(Context context) {
        float f = LIZ;
        if (f > 0.0f) {
            return (int) f;
        }
        float fLIZJ = LIZJ(context);
        LIZ = fLIZJ;
        return (int) fLIZJ;
    }

    public static float LIZJ(Context context) {
        float f = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {2131837643, R.string.hz7, 2131837677, 2131837645, 2131838287, 2131838312, 2131832371, 2131834735, 2131837236};
        Paint paint = new Paint();
        paint.setTextSize(C12ES.LIZJ(14.0f, context));
        float fLIZJ = C12ES.LIZJ(88.0f, context);
        float fLIZJ2 = C12ES.LIZJ(120.0f, context);
        int i = 0;
        do {
            float fMeasureText = paint.measureText(context.getString(iArr[i]));
            if (fMeasureText > f) {
                f = fMeasureText;
            }
            i++;
        } while (i < 9);
        float fLIZJ3 = f + C12ES.LIZJ(16.0f, context);
        if (fLIZJ3 > fLIZJ2) {
            return fLIZJ2;
        }
        if (fLIZJ3 < fLIZJ) {
            return fLIZJ;
        }
        return fLIZJ3;
    }
}
