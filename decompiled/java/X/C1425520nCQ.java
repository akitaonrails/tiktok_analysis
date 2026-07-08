package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0nCQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425520nCQ {
    public final View LIZ;
    public float LIZIZ = 1.0f;
    public final Rect LIZJ = new Rect();

    public final Float LIZ() {
        float f;
        if (this.LIZ.getLocalVisibleRect(this.LIZJ)) {
            float fHeight = this.LIZJ.height();
            int height = this.LIZ.getHeight();
            if (height < 1) {
                height = 1;
            }
            f = fHeight / height;
            if (f >= 0.0f && f <= 1.0f) {
            }
            return null;
        }
        if (this.LIZIZ == 0.0f) {
            return null;
        }
        f = 0.0f;
        if (f != this.LIZIZ) {
            C786410Ut5.T4(this.LIZ, f);
            this.LIZIZ = f;
            return Float.valueOf(f);
        }
        return null;
    }

    public C1425520nCQ(View view) {
        this.LIZ = view;
    }
}
