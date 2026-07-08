package X;

import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.dataChannel.HourlyRankRewardVisibilityChangedChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1079290eBz extends ElementSpecImpl {
    public final LayeredElementContext LL;

    public C1079290eBz(LayeredElementContext layeredElementContext) {
        super(C1079590eCT.LIZLLL);
        this.LL = layeredElementContext;
        addSceneObserver(new DataChannelSceneObserver<Boolean, HourlyRankRewardVisibilityChangedChannel>(this) { // from class: X.0eBy
            public final C01GW LIZ;

            public final ValueAnimator LIZ() {
                return (ValueAnimator) this.LIZ.getValue();
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<HourlyRankRewardVisibilityChangedChannel> getType() {
                return HourlyRankRewardVisibilityChangedChannel.class;
            }

            {
                super(true);
                this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 642));
            }

            @Override // com.bytedance.ies.sdk.widgets.SceneObserver
            public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) throws Throwable {
                super.dispose(layeredElementContext2, constraintProperty);
                if (LIZ().isRunning()) {
                    LIZ().cancel();
                }
                constraintProperty.forceHasOverlappingRenderingCompat(true);
                constraintProperty.alpha(1.0f);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext2, final ConstraintProperty constraintProperty, Boolean bool) {
                final boolean zBooleanValue = bool.booleanValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("alpha anim: ");
                sbLIZ.append(zBooleanValue);
                C20441214yg.LIZIZ("MainFrame#anim", C2188811AlT.LIZIZ(sbLIZ));
                LIZ().cancel();
                LIZ().removeAllUpdateListeners();
                LIZ().removeAllListeners();
                if (zBooleanValue) {
                    LIZ().setFloatValues(constraintProperty.alpha(), 0.2f);
                } else {
                    LIZ().setFloatValues(constraintProperty.alpha(), 1.0f);
                }
                LIZ().addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 133));
                LIZ().addListener(new Animator.AnimatorListener() { // from class: X.0eC0
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) throws Throwable {
                        if (!zBooleanValue) {
                            constraintProperty.forceHasOverlappingRenderingCompat(true);
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) throws Throwable {
                        if (zBooleanValue) {
                            constraintProperty.forceHasOverlappingRenderingCompat(false);
                        }
                    }
                });
                LIZ().start();
            }
        });
    }
}
