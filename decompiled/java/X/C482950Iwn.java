package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Iwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482950Iwn extends ViewOutlineProvider {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;

    public C482950Iwn(float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.LIZ > 0.0f && this.LIZIZ > 0.0f && this.LIZJ > 0.0f) {
            float f = 2;
            outline.setRoundRect((int) ((view.getWidth() - this.LIZIZ) / f), (int) ((view.getHeight() - this.LIZJ) / f), (int) ((view.getWidth() + this.LIZIZ) / f), (int) ((view.getHeight() + this.LIZJ) / f), this.LIZ);
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0.0f);
    }
}
