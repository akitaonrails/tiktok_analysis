package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0GzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433530GzH {
    public static final /* synthetic */ int LIZ = 0;

    public static Unit LIZ(float f, long j, View view) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator duration;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(f)) != null && (duration = viewPropertyAnimatorScaleY.setDuration(j)) != null) {
            duration.start();
            return Unit.LIZ;
        }
        return null;
    }
}
