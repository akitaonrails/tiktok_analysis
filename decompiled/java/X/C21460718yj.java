package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21460718yj extends AbstractC21460218ye {
    public C21460718yj() {
    }

    public C21460718yj(int i) {
        if ((i & (-4)) == 0) {
            this.LLJJLIIIJLLLLLLLZ = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // X.AbstractC21463118z7
    public final void LJI(C1489080oqw c1489080oqw) {
        AbstractC21460218ye.LJJIZ(c1489080oqw);
        Map<String, Object> map = c1489080oqw.LIZ;
        HashMap map2 = (HashMap) map;
        map2.put("android:fade:transitionAlpha", Float.valueOf(C21461118yn.LIZ.LIZIZ(c1489080oqw.LIZIZ)));
    }

    @Override // X.AbstractC21460218ye
    public final Animator LJJJIL(ViewGroup viewGroup, View view, C1489080oqw c1489080oqw) {
        float fFloatValue;
        Float f;
        C21461118yn.LIZ.getClass();
        if (c1489080oqw != null && (f = (Float) ((HashMap) c1489080oqw.LIZ).get("android:fade:transitionAlpha")) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        return LJJJJ(fFloatValue, 0.0f, view);
    }

    public final Animator LJJJJ(float f, float f2, final View view) {
        if (f == f2) {
            return null;
        }
        C21461118yn.LIZ.LIZJ(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C21461118yn.LIZIZ, f2);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter(view) { // from class: X.18yk
            public final View LL;
            public boolean LLILLJJLI;

            {
                this.LL = view;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C21461118yn.LIZ.LIZJ(this.LL, 1.0f);
                if (this.LLILLJJLI) {
                    this.LL.setLayerType(0, null);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (this.LL.hasOverlappingRendering() && this.LL.getLayerType() == 0) {
                    this.LLILLJJLI = true;
                    this.LL.setLayerType(2, null);
                }
            }
        });
        LIZ(new C1149100g0a() { // from class: X.18ym
            @Override // X.C1149100g0a, X.InterfaceC21462418z0
            public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
                View view2 = view;
                C21461218yo c21461218yo = C21461118yn.LIZ;
                c21461218yo.LIZJ(view2, 1.0f);
                c21461218yo.getClass();
                abstractC21463118z7.LJJII(this);
            }
        });
        return objectAnimatorOfFloat;
    }

    @Override // X.AbstractC21460218ye
    public final Animator LJJJI(ViewGroup viewGroup, View view, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        float fFloatValue;
        Float f;
        float f2 = 0.0f;
        if (c1489080oqw != null && (f = (Float) ((HashMap) c1489080oqw.LIZ).get("android:fade:transitionAlpha")) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        if (fFloatValue != 1.0f) {
            f2 = fFloatValue;
        }
        return LJJJJ(f2, 1.0f, view);
    }
}
