package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: X.0Qd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674580Qd6 {
    public static C674570Qd5 LIZ(View view) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
            if (c20246014JuLIZ != null) {
                boolean zLJIIIIZZ = c20246014JuLIZ.LJIIIIZZ(8);
                if (zLJIIIIZZ) {
                    int i2 = c20246014JuLIZ.LIZ(8).LIZLLL - c20246014JuLIZ.LIZ(2).LIZLLL;
                    if (i2 >= 0) {
                        i = i2;
                    }
                }
                return new C674570Qd5(zLJIIIIZZ, i);
            }
            return new C674570Qd5(false, 0);
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return new C674570Qd5(false, 0);
        }
        int height = rootView.getHeight();
        if (height <= 0) {
            return new C674570Qd5(false, 0);
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i3 = height - rect.bottom;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > height * 0.15f) {
            return new C674570Qd5(true, i3);
        }
        return new C674570Qd5(false, 0);
    }
}
