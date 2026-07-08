package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: renamed from: X.19RB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19RB extends ViewOutlineProvider {
    public final /* synthetic */ float LIZ;

    public C19RB(float f) {
        this.LIZ = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, view.getWidth(), view.getHeight()), this.LIZ);
    }
}
