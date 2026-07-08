package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.14a2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20288414a2 extends ViewOutlineProvider {
    public Float LIZ;
    public float LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public C20288414a2(Float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f = this.LIZJ;
        float f2 = this.LIZIZ;
        int i = (int) (f * f2);
        int i2 = (int) (this.LIZLLL * f2);
        int width = view.getWidth();
        int height = view.getHeight();
        Float f3 = this.LIZ;
        if (f3 != null) {
            outline.setRoundRect(i, i2, width - i, height - i2, f3.floatValue());
        }
    }
}
