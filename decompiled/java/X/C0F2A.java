package X;

import Y.ACListenerS140S0100000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS74S0200000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import avg.f;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.ss.android.ugc.aweme.edit.RevealStoryCreationModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import mf.a;

/* JADX INFO: renamed from: X.0F2A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F2A extends AbstractC1664490tPr<C0F2E, C0F2H> {
    public C0F4H LLJJJIL;
    public C197039127h LLJJJJ;
    public ViewPropertyAnimator LLJJJJJIL;
    public C0P0T LLJJJJLIIL;

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        C0P0T c0p0t;
        super.onStop();
        C0P0T c0p0t2 = this.LLJJJJLIIL;
        if (c0p0t2 == null || !c0p0t2.isShowing() || (c0p0t = this.LLJJJJLIIL) == null) {
            return;
        }
        c0p0t.dismiss();
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLIL().LIZ.invoke(view);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F2B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0F2E) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 110));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F2D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0F2E) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 111));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0F2C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0F2E) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 112));
        if (!C12866051s.LIZ("reveal_story_guide_edit_button_shake_shown")) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LLLLLJIL(this, -2.5f, 2.5f), LLLLLJIL(this, 2.5f, -2.5f));
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0F2G
                public boolean LL = true;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    this.LL = false;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (this.LL) {
                        animator.start();
                    }
                }
            });
            animatorSet.start();
            LifecycleOwnerExtensionsKt.LIZIZ(this, Mp4ScreenVideoLoadTimeout.CONTROL, new ARunnableS74S0200000_5(animatorSet, this, 14));
        }
        Number number = (Number) AnonymousClass0515.LIZ(0, "reveal_story_guide_preview_button_tooltip_shown");
        int iIntValue = number.intValue();
        if (iIntValue < 2) {
            AnonymousClass0515.LIZIZ(Integer.valueOf(iIntValue + 1), "reveal_story_guide_preview_button_tooltip_shown");
        }
        if (number.intValue() < 2) {
            LifecycleOwnerExtensionsKt.LIZIZ(this, 500L, new ARunnableS105S0100000_5(this, 21));
        }
    }

    public static final ValueAnimator LLLLLJIL(C0F2A c0f2a, float f, float f2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(c0f2a, 5));
        return valueAnimatorOfFloat;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        Context contextRequireSceneContext = requireSceneContext();
        RevealStoryCreationModel revealStoryCreationModelInvoke = LLLLIL().LIZJ.invoke();
        C0F4H c0f4hLIZIZ = C0F4G.LIZIZ(contextRequireSceneContext);
        C0F4G.LIZ(c0f4hLIZIZ, revealStoryCreationModelInvoke, C0F4G.LIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f4hLIZIZ);
        c0f4hLIZIZ.setLayoutParams(layoutParams);
        View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0F2F
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        if (C1848410yCV.LIZ) {
            fVar = new f(fVar);
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0f4hLIZIZ);
        }
        c0f4hLIZIZ.setOnClickListener(aVar);
        int visibility = c0f4hLIZIZ.getVisibility();
        c0f4hLIZIZ.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c0f4hLIZIZ);
        frameLayout.addView(c0f4hLIZIZ);
        this.LLJJJIL = c0f4hLIZIZ;
        C197039127h c197039127h = new C197039127h(requireSceneContext(), null, 6, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86));
        layoutParams2.gravity = 81;
        C786410Ut5.J6(c197039127h, layoutParams2);
        c197039127h.setButtonVariant(-1);
        c197039127h.LJJJJL(new AwS371S0200000_5(c197039127h, this, 16));
        c197039127h.setText(getString(2131849068));
        c197039127h.setMaxWidth(114514);
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_eye_fill));
        C786410Ut5.U8(c197039127h, new ACListenerS140S0100000_5(this, 7));
        frameLayout.addView(c197039127h);
        this.LLJJJJ = c197039127h;
        return frameLayout;
    }
}
