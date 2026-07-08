package X;

import Y.ALAdapterS0S0310000_17;
import Y.ALAdapterS7S0300000_17;
import Y.AUListenerS224S0200000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1080280eDa extends DataChannelSceneObserver<C0KVO, StartClearScreenEvent> {
    public final LayeredElementContext LIZ;
    public final C01GW LIZIZ;
    public AnimatorSet LIZJ;
    public C0KVO LIZLLL;

    public final ValueAnimator LIZIZ() {
        return (ValueAnimator) this.LIZIZ.getValue();
    }

    public final void LIZ() {
        LIZIZ().setInterpolator(null);
        LIZIZ().cancel();
        LIZIZ().removeAllUpdateListeners();
        LIZIZ().removeAllListeners();
        AnimatorSet animatorSet = this.LIZJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LIZJ;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    public final Class<StartClearScreenEvent> getType() {
        return StartClearScreenEvent.class;
    }

    public C1080280eDa(LayeredElementContext layeredElementContext) {
        super(true);
        this.LIZ = layeredElementContext;
        this.LIZIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 495));
    }

    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) throws Throwable {
        super.dispose(layeredElementContext, constraintProperty);
        constraintProperty.forceHasOverlappingRenderingCompat(true);
        constraintProperty.translationX(0.0f);
        constraintProperty.alpha(1.0f);
        LIZIZ().cancel();
        AnimatorSet animatorSet = this.LIZJ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LIZLLL = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public void onEvent(final C0KVO c0kvo, final ConstraintProperty constraintProperty, final LayeredElementContext layeredElementContext) {
        final float width;
        float width2;
        C0KVO c0kvo2 = this.LIZLLL;
        if (c0kvo2 != null && c0kvo2.LIZ == c0kvo.LIZ) {
            return;
        }
        this.LIZLLL = c0kvo;
        layeredElementContext.getDataChannel().SX0(C753960Thq.class, Boolean.valueOf(c0kvo.LIZ));
        layeredElementContext.getDataChannel().SX0(C1082820eHg.class, c0kvo);
        if (c0kvo.LIZJ instanceof C1080310eDd) {
            LIZ();
            if (c0kvo.LIZ) {
                ValueAnimator duration = new ValueAnimator().setDuration(75L);
                ValueAnimator duration2 = new ValueAnimator().setDuration(300L);
                if (layeredElementContext.getContainer().getLayoutDirection() == 1) {
                    width2 = -layeredElementContext.getContainer().getWidth();
                } else {
                    width2 = layeredElementContext.getContainer().getWidth();
                }
                duration.setFloatValues(constraintProperty.alpha(), 0.0f);
                duration.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 96));
                duration2.setFloatValues(constraintProperty.translationX(), width2);
                duration2.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 97));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new ALAdapterS7S0300000_17(c0kvo, constraintProperty, layeredElementContext, 5));
                animatorSet.playTogether(duration, duration2);
                animatorSet.start();
                this.LIZJ = animatorSet;
                return;
            }
            LIZIZ().setInterpolator(new DecelerateInterpolator());
            LIZIZ().setFloatValues(constraintProperty.translationX(), 0.0f);
            LIZIZ().addUpdateListener(new AUListenerS224S0200000_17(constraintProperty, layeredElementContext, 15));
            LIZIZ().addListener(new ALAdapterS7S0300000_17(c0kvo, constraintProperty, layeredElementContext, 6));
            LIZIZ().start();
            return;
        }
        LIZ();
        AbstractC1080290eDb abstractC1080290eDb = c0kvo.LIZJ;
        final boolean z = abstractC1080290eDb.LIZ;
        boolean z2 = abstractC1080290eDb.LIZIZ;
        if (c0kvo.LIZ) {
            if (layeredElementContext.getContainer().getLayoutDirection() == 1) {
                width = -layeredElementContext.getContainer().getWidth();
            } else {
                width = layeredElementContext.getContainer().getWidth();
            }
            if (z) {
                LIZIZ().setFloatValues(constraintProperty.alpha(), 0.0f);
            } else {
                LIZIZ().setFloatValues(constraintProperty.translationX(), width);
            }
            LIZIZ().addListener(new AnimatorListenerAdapter() { // from class: X.0eDe
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C784440Upu.LIZ().LIZIZ(new C0IGJ(true));
                    if (z) {
                        constraintProperty.translationX(width);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) throws Throwable {
                    super.onAnimationStart(animator);
                    constraintProperty.forceHasOverlappingRenderingCompat(false);
                    C784440Upu.LIZ().LIZIZ(c0kvo);
                    layeredElementContext.getDataChannel().SX0(C1082780eHc.class, Boolean.valueOf(c0kvo.LIZ));
                }
            });
        } else {
            if (z) {
                LIZIZ().setFloatValues(constraintProperty.alpha(), 1.0f);
            } else {
                LIZIZ().setFloatValues(constraintProperty.translationX(), 0.0f);
            }
            LIZIZ().addListener(new ALAdapterS0S0310000_17(c0kvo, z, constraintProperty, layeredElementContext, 1));
        }
        LIZIZ().addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eDZ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (z) {
                    constraintProperty.alpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    return;
                }
                constraintProperty.translationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                float width3 = layeredElementContext.getContainer().getWidth();
                if (width3 > 0.0f) {
                    ConstraintProperty constraintProperty2 = constraintProperty;
                    constraintProperty2.alpha(1 - Math.abs(constraintProperty2.translationX() / width3));
                } else {
                    constraintProperty.alpha(1.0f);
                }
            }
        });
        if (z2) {
            LIZIZ().start();
        } else {
            LIZIZ().end();
        }
    }
}
