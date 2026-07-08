package X;

import Y.AAListenerS144S0300000_32;
import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18nC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21389218nC {
    public static final Animator LIZ(View view) {
        C21390118nL c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        final float width = view.getWidth() / 2.0f;
        final float height = view.getHeight() / 2.0f;
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(C276500Asa.LIZ());
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        InterfaceC21389118nB interfaceC21389118nB = new InterfaceC21389118nB() { // from class: X.18n8
            @Override // X.InterfaceC21389118nB
            public final void LIZ(RenderNode renderNode) {
                float animatedFraction = valueAnimatorOfFloat.getAnimatedFraction();
                renderNode.setPivotX(width);
                renderNode.setPivotY(height);
                renderNode.setScaleX(animatedFraction);
                renderNode.setScaleY(animatedFraction);
            }
        };
        c21390118nL.setRenderNodeDriver(interfaceC21389118nB);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(c21390118nL, 25));
        valueAnimatorOfFloat.addListener(new AAListenerS144S0300000_32(c21390118nL, interfaceC21389118nB, view, 0));
        return valueAnimatorOfFloat;
    }

    public static final Pair<C21390118nL, C21390118nL> LIZIZ(View view) {
        ViewGroup viewGroup;
        if (!(view instanceof C21390118nL) || (viewGroup = (ViewGroup) view) == null || viewGroup.getChildCount() != 1) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (!(childAt instanceof C21390118nL) || childAt == null) {
            return null;
        }
        return new Pair<>(viewGroup, childAt);
    }

    public static final Animator LIZJ(View view) {
        return new C21389518nF(false).LIZ(view, view);
    }
}
