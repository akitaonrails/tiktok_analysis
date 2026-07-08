package X;

import Y.AAListenerS332S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentLikeAndHateServiceImpl;
import com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0lJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353310lJx {
    public Comment LIZ;
    public TuxIconView LIZJ;
    public TuxIconView LIZLLL;
    public ConstraintLayout LJ;
    public TuxTextView LJFF;
    public TuxIconView LJI;
    public TuxIconView LJII;
    public RelativeLayout LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public AnimatorSet LJIIJJI;
    public AnimatorSet LJIIL;
    public AnimatorSet LJIILIIL;
    public AnimatorSet LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public AnimatorSet LJIIZILJ;
    public AnimatorSet LJIJ;
    public AnimatorSet LJIJI;
    public AnimatorSet LJIJJ;
    public final boolean LIZIZ = ((Boolean) C305060BxY.LIZ.getValue()).booleanValue();
    public final Keva LJIJJLI = Keva.getRepo("ad_comment");

    public final void LIZLLL() {
        Comment comment = this.LIZ;
        if (!(comment != null && comment.isUserBuried())) {
            AnimatorSet animatorSet = this.LJIJI;
            if (animatorSet != null) {
                animatorSet.start();
            }
            Comment comment2 = this.LIZ;
            if (comment2 != null && comment2.isUserDigged()) {
                AnimatorSet animatorSet2 = this.LJIILIIL;
                if (animatorSet2 != null && animatorSet2.isRunning()) {
                    AnimatorSet animatorSet3 = this.LJIILIIL;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    LJI(false);
                }
                LJIIIIZZ(Boolean.FALSE, 0);
                Comment comment3 = this.LIZ;
                if (comment3 != null) {
                    comment3.setUserDigged(0);
                    this.LJIJJLI.storeInt(LIZIZ(), comment3.getUserDigged());
                }
            }
        } else {
            AnimatorSet animatorSet4 = this.LJIJJ;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
        Comment comment4 = this.LIZ;
        if (comment4 != null) {
            comment4.setUserBuried(comment4.getUserBuried() == 1 ? 0 : 1);
            this.LJIJJLI.storeInt(LIZ(), comment4.getUserBuried());
        }
    }

    public final void LJ() {
        Comment comment;
        Comment comment2 = this.LIZ;
        boolean z = !(comment2 != null && comment2.isUserDigged());
        Comment comment3 = this.LIZ;
        if (comment3 != null) {
            comment3.isAuthorDigged();
        }
        if (z) {
            AnimatorSet animatorSet = this.LJIILIIL;
            if (animatorSet != null) {
                animatorSet.start();
            }
        } else {
            AnimatorSet animatorSet2 = this.LJIILJJIL;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
        LJIIIIZZ(Boolean.valueOf(z), 0);
        if (z && (comment = this.LIZ) != null && comment.isUserBuried()) {
            AnimatorSet animatorSet3 = this.LJIJI;
            if (animatorSet3 != null && animatorSet3.isRunning()) {
                AnimatorSet animatorSet4 = this.LJIJI;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                LJFF(false);
            }
            LJII(Boolean.FALSE);
            Comment comment4 = this.LIZ;
            if (comment4 != null) {
                comment4.setUserBuried(0);
                this.LJIJJLI.storeInt(LIZ(), comment4.getUserBuried());
            }
        }
        Comment comment5 = this.LIZ;
        if (comment5 != null) {
            comment5.setUserDigged(comment5.getUserDigged() == 1 ? 0 : 1);
            this.LJIJJLI.storeInt(LIZIZ(), comment5.getUserDigged());
        }
    }

    public final String LIZ() {
        String awemeId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMMENT_BURY");
        Comment comment = this.LIZ;
        if (comment == null || (awemeId = comment.getAwemeId()) == null) {
            awemeId = "";
        }
        sbLIZ.append(awemeId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        String awemeId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMMENT_DIGG");
        Comment comment = this.LIZ;
        if (comment == null || (awemeId = comment.getAwemeId()) == null) {
            awemeId = "";
        }
        sbLIZ.append(awemeId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ() {
        ICommentLikeAndHateService iCommentLikeAndHateServiceLJII = CommentLikeAndHateServiceImpl.LJII();
        if (iCommentLikeAndHateServiceLJII != null) {
            AnimatorSet animatorSetLJFF = iCommentLikeAndHateServiceLJII.LJFF(this.LIZLLL);
            this.LJIIL = animatorSetLJFF;
            if (animatorSetLJFF != null) {
                animatorSetLJFF.addListener(new AAListenerS332S0100000_21(this, 36));
            }
            AnimatorSet animatorSetLJFF2 = iCommentLikeAndHateServiceLJII.LJFF(this.LIZJ);
            this.LJIIJJI = animatorSetLJFF2;
            if (animatorSetLJFF2 != null) {
                animatorSetLJFF2.addListener(new AAListenerS332S0100000_21(this, 37));
            }
            AnimatorSet animatorSetLJI = iCommentLikeAndHateServiceLJII.LJI(this.LIZJ, this.LIZLLL);
            this.LJIILJJIL = animatorSetLJI;
            if (animatorSetLJI != null) {
                animatorSetLJI.addListener(new AAListenerS332S0100000_21(this, 38));
            }
            AnimatorSet animatorSetLIZLLL = iCommentLikeAndHateServiceLJII.LIZLLL(this.LIZLLL, this.LIZJ);
            this.LJIILIIL = animatorSetLIZLLL;
            if (animatorSetLIZLLL != null) {
                animatorSetLIZLLL.addListener(new AAListenerS332S0100000_21(this, 39));
            }
            AnimatorSet animatorSetLJFF3 = iCommentLikeAndHateServiceLJII.LJFF(this.LJII);
            this.LJIJ = animatorSetLJFF3;
            if (animatorSetLJFF3 != null) {
                animatorSetLJFF3.addListener(new AAListenerS332S0100000_21(this, 40));
            }
            AnimatorSet animatorSetLJFF4 = iCommentLikeAndHateServiceLJII.LJFF(this.LJI);
            this.LJIIZILJ = animatorSetLJFF4;
            if (animatorSetLJFF4 != null) {
                animatorSetLJFF4.addListener(new AAListenerS332S0100000_21(this, 41));
            }
            AnimatorSet animatorSetLJI2 = iCommentLikeAndHateServiceLJII.LJI(this.LJI, this.LJII);
            this.LJIJJ = animatorSetLJI2;
            if (animatorSetLJI2 != null) {
                animatorSetLJI2.addListener(new AAListenerS332S0100000_21(this, 42));
            }
            AnimatorSet animatorSetLIZLLL2 = iCommentLikeAndHateServiceLJII.LIZLLL(this.LJII, this.LJI);
            this.LJIJI = animatorSetLIZLLL2;
            if (animatorSetLIZLLL2 != null) {
                animatorSetLIZLLL2.addListener(new AAListenerS332S0100000_21(this, 43));
            }
        }
        ConstraintLayout constraintLayout = this.LJ;
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(new ATListenerS454S0100000_21(this, 16));
        }
        RelativeLayout relativeLayout = this.LJIIIIZZ;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(new ATListenerS454S0100000_21(this, 17));
        }
    }

    public final void LJFF(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LJI;
            if (tuxIconView != null) {
                tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
            TuxIconView tuxIconView2 = this.LJII;
            if (tuxIconView2 != null) {
                tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LJI;
        if (tuxIconView3 != null) {
            C786410Ut5.hc(tuxIconView3, 1.0f);
        }
        TuxIconView tuxIconView4 = this.LJI;
        if (tuxIconView4 != null) {
            C786410Ut5.Cc(tuxIconView4, 1.0f);
        }
        TuxIconView tuxIconView5 = this.LJII;
        if (tuxIconView5 != null) {
            C786410Ut5.hc(tuxIconView5, 1.0f);
        }
        TuxIconView tuxIconView6 = this.LJII;
        if (tuxIconView6 == null) {
            return;
        }
        C786410Ut5.Cc(tuxIconView6, 1.0f);
    }

    public final void LJI(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LIZJ;
            if (tuxIconView != null) {
                tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
            TuxIconView tuxIconView2 = this.LIZLLL;
            if (tuxIconView2 != null) {
                tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LIZJ;
        if (tuxIconView3 != null) {
            C786410Ut5.hc(tuxIconView3, 1.0f);
        }
        TuxIconView tuxIconView4 = this.LIZJ;
        if (tuxIconView4 != null) {
            C786410Ut5.Cc(tuxIconView4, 1.0f);
        }
        TuxIconView tuxIconView5 = this.LIZLLL;
        if (tuxIconView5 != null) {
            C786410Ut5.hc(tuxIconView5, 1.0f);
        }
        TuxIconView tuxIconView6 = this.LIZLLL;
        if (tuxIconView6 == null) {
            return;
        }
        C786410Ut5.Cc(tuxIconView6, 1.0f);
    }

    public final void LJII(Boolean bool) {
        Context context;
        Context context2;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            TuxIconView tuxIconView = this.LJI;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 1.0f);
            }
            TuxIconView tuxIconView2 = this.LJII;
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 0.0f);
            }
            RelativeLayout relativeLayout = this.LJIIIIZZ;
            if (relativeLayout != null && (context2 = relativeLayout.getContext()) != null) {
                q0.LJJIFFI(relativeLayout, context2.getString(2131823220));
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LJI;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.0f);
        }
        TuxIconView tuxIconView4 = this.LJII;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, 1.0f);
        }
        RelativeLayout relativeLayout2 = this.LJIIIIZZ;
        if (relativeLayout2 == null || (context = relativeLayout2.getContext()) == null) {
            return;
        }
        q0.LJJIFFI(relativeLayout2, context.getString(2131823223));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.Boolean r9, java.lang.Integer r10) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353310lJx.LJIIIIZZ(java.lang.Boolean, java.lang.Integer):void");
    }
}
