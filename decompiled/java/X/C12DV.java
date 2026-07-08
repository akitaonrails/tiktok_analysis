package X;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import zoo.b;

/* JADX INFO: renamed from: X.12DV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12DV extends AbstractC1664490tPr<C19672011xu, C19671911xt> {
    public Integer LLJJJJJIL;
    public int LLJJL;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 610));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 609));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 608));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 611));

    public final C371530EhT LLLLLJIL() {
        return (C371530EhT) this.LLJJJJLIIL.getValue();
    }

    public final C376390EpJ LLLLLJLJLL() {
        return (C376390EpJ) this.LLJJJJ.getValue();
    }

    public final View LLLLLL() {
        return (View) this.LLJJJIL.getValue();
    }

    public final float LLLLLLJ() {
        return ((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).floatValue();
    }

    public final int LLLLLLIL() {
        return LLLLLL().getHeight();
    }

    public final void LLLLLLL(float f, float f2) {
        float f3 = f2 + this.LLJJL;
        int i = (int) f;
        float f4 = 2;
        int i2 = (int) f3;
        LLLLLJIL().layout((int) (i - (LLLLLJIL().getWidth() / f4)), i2 - ((int) (LLLLLJIL().getHeight() / f4)), ((int) (LLLLLJIL().getWidth() / f4)) + i, ((int) (LLLLLJIL().getHeight() / f4)) + i2);
        if (f3 < LLLLLLIL() / 5) {
            LLLLLJLJLL().layout(i - ((int) (LLLLLJLJLL().getWidth() / f4)), (int) ((LLLLLJIL().getHeight() / 2) + i2 + LLLLLLJ()), i + ((int) (LLLLLJLJLL().getWidth() / f4)), (int) (i2 + (LLLLLJIL().getHeight() / 2) + LLLLLLJ() + LLLLLJLJLL().getHeight()));
            C376390EpJ c376390EpJLLLLLJLJLL = LLLLLJLJLL();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376390EpJLLLLLJLJLL);
            c376390EpJLLLLLJLJLL.setRotationX(180.0f);
        } else {
            LLLLLJLJLL().layout(i - ((int) (LLLLLJLJLL().getWidth() / f4)), (int) (((i2 - (LLLLLJIL().getHeight() / 2)) - LLLLLLJ()) - LLLLLJLJLL().getHeight()), i + ((int) (LLLLLJLJLL().getWidth() / f4)), (int) ((i2 - (LLLLLJIL().getHeight() / 2)) - LLLLLLJ()));
            C376390EpJ c376390EpJLLLLLJLJLL2 = LLLLLJLJLL();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c376390EpJLLLLLJLJLL2);
            c376390EpJLLLLLJLJLL2.setRotationX(0.0f);
        }
        LLLLIL().LIZ.invoke(new PointF(f, f3));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLIL().LIZJ.invoke(new C0FUM() { // from class: X.12DW
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                if (bVar == null) {
                    return false;
                }
                this.LL.LLLLLLL(bVar.LJI(), bVar.LJII());
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                if (motionEvent == null) {
                    return false;
                }
                C12DV c12dv = this.LL;
                c12dv.getClass();
                if (motionEvent.getX() > 0.0f && motionEvent.getX() < c12dv.LLLLLL().getWidth() && motionEvent.getY() > 0.0f && motionEvent.getY() < c12dv.LLLLLLIL()) {
                    c12dv.LLLLLLL(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onUp(MotionEvent motionEvent) {
                this.LL.LLLLIL().LIZIZ.invoke(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY() + this.LL.LLJJL));
                return true;
            }
        });
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11xy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19672011xu) obj).LIZ;
            }
        }, new AwS608S0100000_29(this, 345));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11xw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C19672011xu) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 346));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11xz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19672011xu) obj).LIZIZ;
            }
        }, new AwS608S0100000_29(this, 347));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.11xx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19672011xu) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS608S0100000_29(this, 348));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.uo, viewGroup, false);
    }

    public static void LLLLLLLLL(C12DV c12dv, float f, float f2, float f3, AwS573S0100000_29 awS573S0100000_29, AwS573S0100000_29 awS573S0100000_292, int i) {
        float height;
        float width;
        final AwS573S0100000_29 awS573S0100000_293 = awS573S0100000_29;
        final AwS573S0100000_29 awS573S0100000_294 = null;
        if ((i & 16) != 0) {
            awS573S0100000_293 = null;
        }
        if ((i & 32) == 0) {
            awS573S0100000_294 = awS573S0100000_292;
        }
        if (f < 0.0f || f > c12dv.LLLLLLIL()) {
            f = c12dv.LLLLLLIL() / 2;
        }
        if (f < c12dv.LLLLLLIL() / 5) {
            height = ((((c12dv.LLLLLJLJLL().getHeight() + c12dv.LLLLLLJ()) + c12dv.LLLLLJIL().getHeight()) / 2) - c12dv.LLLLLJIL().getWidth()) - c12dv.LLLLLLJ();
        } else {
            height = ((c12dv.LLLLLJLJLL().getHeight() + c12dv.LLLLLLJ()) + c12dv.LLLLLJIL().getHeight()) / 2;
        }
        float f4 = 2;
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, c12dv.LLLLLJLJLL().getWidth() / f4, height);
        scaleAnimation.setInterpolator(C1619980sG4.LJIIIZ());
        scaleAnimation.setDuration(200L);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.0yld
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Function0<Unit> function0 = awS573S0100000_294;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                Function0<Unit> function0 = awS573S0100000_293;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        c12dv.LLLLLJLJLL().startAnimation(scaleAnimation);
        if (f < c12dv.LLLLLLIL() / 5) {
            width = ((c12dv.LLLLLJLJLL().getHeight() + c12dv.LLLLLLJ()) + c12dv.LLLLLJIL().getHeight()) / f4;
        } else {
            width = (-height) + (c12dv.LLLLLJIL().getWidth() / 2);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(f2, f3, f2, f3, c12dv.LLLLLJIL().getWidth() / f4, width);
        scaleAnimation2.setInterpolator(C1619980sG4.LJIIIZ());
        scaleAnimation2.setDuration(200L);
        c12dv.LLLLLJIL().startAnimation(scaleAnimation2);
    }
}
