package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.0MRE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRE extends ViewOutlineProvider {
    public final int LIZ;

    public C0MRE(int i) {
        this.LIZ = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.LIZ);
    }
}
