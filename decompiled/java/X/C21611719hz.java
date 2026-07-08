package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: X.19hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21611719hz extends Animation {
    public final /* synthetic */ C21610619ho LL;

    public C21611719hz(C21610619ho c21610619ho) {
        this.LL = c21610619ho;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LL.setAnimationProgress(1.0f - f);
    }
}
