package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: renamed from: X.19dK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21582819dK extends Animation {
    public final /* synthetic */ SwipeRefreshLayout LL;

    public C21582819dK(SwipeRefreshLayout swipeRefreshLayout) {
        this.LL = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.LL.setAnimationProgress(1.0f - f);
    }
}
