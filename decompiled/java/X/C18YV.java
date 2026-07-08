package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.18YV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YV extends ViewOutlineProvider {
    public float LIZ;

    public C18YV(float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.LIZ);
    }
}
