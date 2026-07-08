package X;

import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0svP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645610svP {
    public static final void LIZIZ(C19YA c19ya, int i) {
        int i2 = 0;
        if (i <= 1) {
            c19ya.setHideIndicatorView(true);
        } else {
            c19ya.setHideIndicatorView(false);
            if (i <= 4) {
            }
            c19ya.setTabMode(i2);
        }
        i2 = 1;
        c19ya.setTabMode(i2);
    }

    public static final void LIZ(C19YA c19ya, int i, List list) {
        float fMeasureText;
        LIZIZ(c19ya, i);
        if (C580130Mp9.LIZ(list)) {
            return;
        }
        Paint paint = new Paint();
        paint.setTextSize(C11VU.LIZIZ(15.0f, c19ya.getContext()));
        int i2 = 0;
        for (String str : (ArrayList) list) {
            if (str != null) {
                fMeasureText = paint.measureText(str);
            } else {
                fMeasureText = 0.0f;
            }
            if (fMeasureText > i2) {
                i2 = (int) fMeasureText;
            }
        }
        if (i2 > C11VU.LIZIZ(50.0f, c19ya.getContext()) && i > 2) {
            c19ya.setTabMode(0);
        }
    }
}
