package X;

import android.graphics.Color;
import android.view.View;

/* JADX INFO: renamed from: X.19PM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19PM {
    public static int LIZ(int i, int i2) {
        return C2441009hQ.LJIIL(i, (Color.alpha(i) * i2) / 255);
    }

    public static int LIZIZ(int i, View view) {
        return C19PF.LIZIZ(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static int LIZJ(float f, int i, int i2) {
        return C2441009hQ.LJIIJ(C2441009hQ.LJIIL(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
