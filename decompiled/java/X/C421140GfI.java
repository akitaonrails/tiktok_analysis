package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0GfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421140GfI extends ViewOutlineProvider {
    public final float LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, this.LIZIZ, this.LIZJ), this.LIZ);
    }

    public C421140GfI(float f, int i, int i2) {
        this.LIZ = f;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
