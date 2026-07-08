package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1225, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1225 {
    public final Context LIZ;
    public AnimatorSet LIZIZ;
    public ObjectAnimator LIZJ;
    public ObjectAnimator LIZLLL;

    public AnonymousClass1225(Context context) {
        this.LIZ = context;
        C11VU.LIZIZ(15.0f, context);
    }

    public final void LIZ(final View view, final AnonymousClass1228 anonymousClass1228) {
        AnimatorSet.Builder builderPlay;
        AnimatorSet animatorSet = this.LIZIZ;
        if (animatorSet == null) {
            this.LIZIZ = new AnimatorSet();
        } else {
            animatorSet.removeAllListeners();
            AnimatorSet animatorSet2 = this.LIZIZ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
        }
        this.LIZJ = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        this.LIZLLL = ObjectAnimator.ofFloat(view, "translationY", C11VU.LIZIZ(15.0f, this.LIZ), 0.0f);
        AnimatorSet animatorSet3 = this.LIZIZ;
        if (animatorSet3 != null && (builderPlay = animatorSet3.play(this.LIZJ)) != null) {
            builderPlay.with(this.LIZLLL);
        }
        AnimatorSet animatorSet4 = this.LIZIZ;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(200L);
        }
        AnimatorSet animatorSet5 = this.LIZIZ;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new AnimatorListenerAdapter() { // from class: X.1226
                public final /* synthetic */ boolean LL = true;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (!this.LL) {
                        C786410Ut5.LJLLLLLL(8, view);
                        try {
                            AnonymousClass1225 anonymousClass1225 = this;
                            Context context = anonymousClass1225.LIZ;
                            if (context instanceof C19EG) {
                                if (!((C19EG) context).isFinishing()) {
                                    this.getClass();
                                }
                            } else {
                                anonymousClass1225.getClass();
                            }
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C122D c122dLIZIZ = C123O.LIZIZ();
                            if (c122dLIZIZ != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AlphaPopAnimManager: dismiss pop failed :");
                                sbLIZ.append(e.getMessage());
                                c122dLIZIZ.d(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                    AnonymousClass1228 anonymousClass12282 = anonymousClass1228;
                    if (anonymousClass12282 != null) {
                        anonymousClass12282.LIZIZ();
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (this.LL) {
                        C786410Ut5.LJLLLLLL(0, view);
                    }
                    AnonymousClass1228 anonymousClass12282 = anonymousClass1228;
                    if (anonymousClass12282 != null) {
                        anonymousClass12282.LIZ();
                    }
                }
            });
        }
        AnimatorSet animatorSet6 = this.LIZIZ;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
    }
}
