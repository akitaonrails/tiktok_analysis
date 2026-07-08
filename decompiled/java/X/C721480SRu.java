package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0SRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721480SRu extends ViewOutlineProvider {
    public float LIZ;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f = this.LIZ;
        if (f >= 0.0f && f >= 0.5f) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + ((int) Math.ceil(f)), f);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }
}
