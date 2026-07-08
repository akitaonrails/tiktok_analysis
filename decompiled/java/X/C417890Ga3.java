package X;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Ga3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417890Ga3 extends ViewOutlineProvider {
    public final Path LIZ = new Path();

    public final void LIZ(int i, boolean z) {
        float f = i;
        this.LIZ.reset();
        this.LIZ.moveTo(C418440Gaw.LIZIZ(44) + f, 0.0f);
        this.LIZ.lineTo(C418440Gaw.LIZIZ(44), 0.0f);
        this.LIZ.arcTo(C418440Gaw.LIZIZ(20), 0.0f, C418440Gaw.LIZIZ(68), C418440Gaw.LIZIZ(48), -90.0f, -66.44354f, false);
        this.LIZ.arcTo(C418440Gaw.LIZIZ(-19), C418440Gaw.LIZIZ(4), C418440Gaw.LIZIZ(18), C418440Gaw.LIZIZ(40), 27.26604f, 62.73396f, false);
        this.LIZ.lineTo(0.0f, C418440Gaw.LIZIZ(40));
        this.LIZ.lineTo(0.0f, C418440Gaw.LIZIZ(42));
        this.LIZ.lineTo(C418440Gaw.LIZIZ(44) + f, C418440Gaw.LIZIZ(42));
        this.LIZ.close();
        if (z) {
            Matrix matrix = new Matrix();
            matrix.setScale(-1.0f, 1.0f, (f + C418440Gaw.LIZIZ(44)) / 2.0f, 0.0f);
            this.LIZ.transform(matrix);
        }
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (Build.VERSION.SDK_INT >= 30 && outline != null) {
            outline.setPath(this.LIZ);
        }
    }
}
