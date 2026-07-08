package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18zj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21466918zj extends C21467618zq {
    public final C21467418zo LIZJ;
    public AnimatorSet LIZLLL;

    public C21466918zj(C21467418zo c21467418zo) {
        this.LIZJ = c21467418zo;
    }

    @Override // X.C21467618zq
    public final void LIZIZ(ViewGroup viewGroup) {
        String str;
        AnimatorSet animatorSet = this.LIZLLL;
        if (animatorSet == null) {
            this.LIZJ.LIZ.LIZJ(this);
            return;
        }
        C21468018zu c21468018zu = this.LIZJ.LIZ;
        if (c21468018zu.LJI) {
            if (Build.VERSION.SDK_INT >= 26) {
                C21467018zk.LIZ(animatorSet);
            }
        } else {
            animatorSet.end();
        }
        if (!FragmentManager.LJLI()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Animator from operation ");
        sbLIZ.append(c21468018zu);
        sbLIZ.append(" has been canceled");
        if (c21468018zu.LJI) {
            str = " with seeking.";
        } else {
            str = e3.d;
        }
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C21467618zq
    public final void LIZJ(ViewGroup viewGroup) {
        C21468018zu c21468018zu = this.LIZJ.LIZ;
        AnimatorSet animatorSet = this.LIZLLL;
        if (animatorSet == null) {
            c21468018zu.LIZJ(this);
        } else {
            animatorSet.start();
        }
    }

    @Override // X.C21467618zq
    public final void LIZLLL(C1776540wKa c1776540wKa) {
        C21468018zu c21468018zu = this.LIZJ.LIZ;
        AnimatorSet animatorSet = this.LIZLLL;
        if (animatorSet == null) {
            c21468018zu.LIZJ(this);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && c21468018zu.LIZJ.mTransitioning) {
            long jLIZ = C21467118zl.LIZ(animatorSet);
            long j = (long) (c1776540wKa.LIZJ * jLIZ);
            if (j == 0) {
                j = 1;
            }
            if (j == jLIZ) {
                j = jLIZ - 1;
            }
            C21467018zk.LIZIZ(animatorSet, j);
        }
    }

    @Override // X.C21467618zq
    public final void LJ(final ViewGroup viewGroup) {
        AnimatorSet animatorSet;
        final boolean z;
        if (this.LIZJ.LIZ()) {
            return;
        }
        C21375018ku c21375018kuLIZIZ = this.LIZJ.LIZIZ(viewGroup.getContext());
        if (c21375018kuLIZIZ != null) {
            animatorSet = c21375018kuLIZIZ.LIZIZ;
        } else {
            animatorSet = null;
        }
        this.LIZLLL = animatorSet;
        final C21468018zu c21468018zu = this.LIZJ.LIZ;
        Fragment fragment = c21468018zu.LIZJ;
        if (c21468018zu.LIZ == EnumC21467818zs.GONE) {
            z = true;
        } else {
            z = false;
        }
        final View view = fragment.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet2 = this.LIZLLL;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new AnimatorListenerAdapter() { // from class: X.18zi
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewGroup.endViewTransition(view);
                    if (z || c21468018zu.LIZ == EnumC21467818zs.GONE) {
                        c21468018zu.LIZ.applyState(view, viewGroup);
                    }
                    C21466918zj c21466918zj = this;
                    c21466918zj.LIZJ.LIZ.LIZJ(c21466918zj);
                }
            });
        }
        AnimatorSet animatorSet3 = this.LIZLLL;
        if (animatorSet3 != null) {
            animatorSet3.setTarget(view);
        }
    }
}
