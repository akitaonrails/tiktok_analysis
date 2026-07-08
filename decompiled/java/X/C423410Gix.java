package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Gix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423410Gix extends ViewOutlineProvider {
    public final Float LIZ;
    public final float LIZIZ = 0.0f;

    public C423410Gix(Float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view == null) {
            return;
        }
        if (this.LIZ != null) {
            if (outline != null) {
                outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.LIZ.floatValue());
            }
        } else {
            if (outline == null) {
                return;
            }
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), view.getWidth() * this.LIZIZ);
        }
    }
}
