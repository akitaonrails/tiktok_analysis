package X;

import Y.ARunnableS65S0300000_32;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: X.18zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21466618zg extends C21467618zq {
    public final C21467418zo LIZJ;

    public C21466618zg(C21467418zo c21467418zo) {
        this.LIZJ = c21467418zo;
    }

    @Override // X.C21467618zq
    public final void LIZIZ(ViewGroup viewGroup) {
        View view = this.LIZJ.LIZ.LIZJ.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        this.LIZJ.LIZ.LIZJ(this);
    }

    @Override // X.C21467618zq
    public final void LIZJ(final ViewGroup viewGroup) {
        if (this.LIZJ.LIZ()) {
            this.LIZJ.LIZ.LIZJ(this);
            return;
        }
        Context context = viewGroup.getContext();
        C21467418zo c21467418zo = this.LIZJ;
        C21468018zu c21468018zu = c21467418zo.LIZ;
        final View view = c21468018zu.LIZJ.mView;
        C21375018ku c21375018kuLIZIZ = c21467418zo.LIZIZ(context);
        if (c21375018kuLIZIZ != null) {
            Animation animation = c21375018kuLIZIZ.LIZ;
            if (animation != null) {
                if (c21468018zu.LIZ != EnumC21467818zs.REMOVED) {
                    view.startAnimation(animation);
                    this.LIZJ.LIZ.LIZJ(this);
                    return;
                } else {
                    viewGroup.startViewTransition(view);
                    C18QM c18qm = new C18QM(animation, viewGroup, view);
                    c18qm.setAnimationListener(new Animation.AnimationListener() { // from class: X.18zh
                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationRepeat(Animation animation2) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationStart(Animation animation2) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public final void onAnimationEnd(Animation animation2) {
                            ViewGroup viewGroup2 = viewGroup;
                            viewGroup2.post(new ARunnableS65S0300000_32(viewGroup2, view, this, 1));
                        }
                    });
                    view.startAnimation(c18qm);
                    return;
                }
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }
}
