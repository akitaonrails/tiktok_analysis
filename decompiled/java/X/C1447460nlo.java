package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0nlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447460nlo extends ViewOutlineProvider {
    public final Float LIZ;
    public final float LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1447460nlo() {
        float f = 0.0f;
        this(f, null, 3);
    }

    public C1447460nlo(float f, Float f2) {
        this.LIZ = f2;
        this.LIZIZ = f;
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

    public /* synthetic */ C1447460nlo(float f, Float f2, int i) {
        this((i & 2) != 0 ? 0.0f : f, (i & 1) != 0 ? null : f2);
    }
}
