package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0Ga8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417940Ga8 extends ViewOutlineProvider {
    public int LIZ;

    public C417940Ga8(int i) {
        this.LIZ = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.LIZ);
        }
    }
}
