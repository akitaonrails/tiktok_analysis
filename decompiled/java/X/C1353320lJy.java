package X;

import Y.AAListenerS332S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentLikeAndHateServiceImpl;
import com.ss.android.ugc.aweme.comment.services.ICommentLikeAndHateService;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0lJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1353320lJy extends FrameLayout implements LifecycleOwner {
    public final LifecycleRegistry LL;
    public Comment LLILLJJLI;
    public Aweme LLILLL;
    public final boolean LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public RelativeLayout LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxIconView LLJ;
    public TuxIconView LLJI;
    public RelativeLayout LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public AnimatorSet LLJILLL;
    public AnimatorSet LLJJ;
    public AnimatorSet LLJJI;
    public AnimatorSet LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public AnimatorSet LLJJIJIL;
    public AnimatorSet LLJJJ;
    public AnimatorSet LLJJJIL;
    public AnimatorSet LLJJJJ;
    public final Keva LLJJJJJIL;

    public final void LIZJ() {
        Comment comment = this.LLILLJJLI;
        if (!(comment != null && comment.isUserBuried())) {
            AnimatorSet animatorSet = this.LLJJJIL;
            if (animatorSet != null) {
                animatorSet.start();
            }
            Comment comment2 = this.LLILLJJLI;
            if (comment2 != null && comment2.isUserDigged()) {
                AnimatorSet animatorSet2 = this.LLJJI;
                if (animatorSet2 != null && animatorSet2.isRunning()) {
                    AnimatorSet animatorSet3 = this.LLJJI;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    LJI(false);
                }
                LJIIIIZZ(Boolean.FALSE, Boolean.FALSE, 0, true, false);
                Comment comment3 = this.LLILLJJLI;
                if (comment3 != null) {
                    comment3.setUserDigged(0);
                    this.LLJJJJJIL.storeInt(getDiggSpKey(), comment3.getUserDigged());
                }
            }
        } else {
            AnimatorSet animatorSet4 = this.LLJJJJ;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
        Comment comment4 = this.LLILLJJLI;
        if (comment4 != null) {
            comment4.setUserBuried(comment4.getUserBuried() == 1 ? 0 : 1);
            this.LLJJJJJIL.storeInt(getBurySpKey(), comment4.getUserBuried());
        }
    }

    public final void LIZLLL() {
        Comment comment;
        Comment comment2 = this.LLILLJJLI;
        boolean z = !(comment2 != null && comment2.isUserDigged());
        Comment comment3 = this.LLILLJJLI;
        boolean z2 = comment3 != null && comment3.isAuthorDigged();
        if (z) {
            AnimatorSet animatorSet = this.LLJJI;
            if (animatorSet != null) {
                animatorSet.start();
            }
        } else {
            AnimatorSet animatorSet2 = this.LLJJIII;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
        LJIIIIZZ(Boolean.valueOf(z), Boolean.valueOf(z2), 0, true, false);
        if (z && (comment = this.LLILLJJLI) != null && comment.isUserBuried()) {
            AnimatorSet animatorSet3 = this.LLJJJIL;
            if (animatorSet3 != null && animatorSet3.isRunning()) {
                AnimatorSet animatorSet4 = this.LLJJJIL;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                LJ(false);
            }
            LJII(Boolean.FALSE);
            Comment comment4 = this.LLILLJJLI;
            if (comment4 != null) {
                comment4.setUserBuried(0);
                this.LLJJJJJIL.storeInt(getBurySpKey(), comment4.getUserBuried());
            }
        }
        Comment comment5 = this.LLILLJJLI;
        if (comment5 != null) {
            comment5.setUserDigged(comment5.getUserDigged() == 1 ? 0 : 1);
            this.LLJJJJJIL.storeInt(getDiggSpKey(), comment5.getUserDigged());
        }
    }

    private final String getBurySpKey() {
        String awemeId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMMENT_BURY");
        Comment comment = this.LLILLJJLI;
        if (comment == null || (awemeId = comment.getAwemeId()) == null) {
            awemeId = "";
        }
        sbLIZ.append(awemeId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private final String getDiggSpKey() {
        String awemeId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMMENT_DIGG");
        Comment comment = this.LLILLJJLI;
        if (comment == null || (awemeId = comment.getAwemeId()) == null) {
            awemeId = "";
        }
        sbLIZ.append(awemeId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ() {
        ICommentLikeAndHateService iCommentLikeAndHateServiceLJII = CommentLikeAndHateServiceImpl.LJII();
        if (iCommentLikeAndHateServiceLJII != null) {
            AnimatorSet animatorSetLJFF = iCommentLikeAndHateServiceLJII.LJFF(this.LLILZLL);
            this.LLJJ = animatorSetLJFF;
            if (animatorSetLJFF != null) {
                animatorSetLJFF.addListener(new AAListenerS332S0100000_21(this, 44));
            }
            AnimatorSet animatorSetLJFF2 = iCommentLikeAndHateServiceLJII.LJFF(this.LLILZIL);
            this.LLJILLL = animatorSetLJFF2;
            if (animatorSetLJFF2 != null) {
                animatorSetLJFF2.addListener(new AAListenerS332S0100000_21(this, 45));
            }
            AnimatorSet animatorSetLJI = iCommentLikeAndHateServiceLJII.LJI(this.LLILZIL, this.LLILZLL);
            this.LLJJIII = animatorSetLJI;
            if (animatorSetLJI != null) {
                animatorSetLJI.addListener(new AAListenerS332S0100000_21(this, 46));
            }
            AnimatorSet animatorSetLIZLLL = iCommentLikeAndHateServiceLJII.LIZLLL(this.LLILZLL, this.LLILZIL);
            this.LLJJI = animatorSetLIZLLL;
            if (animatorSetLIZLLL != null) {
                animatorSetLIZLLL.addListener(new AAListenerS332S0100000_21(this, 47));
            }
            AnimatorSet animatorSetLJFF3 = iCommentLikeAndHateServiceLJII.LJFF(this.LLJI);
            this.LLJJJ = animatorSetLJFF3;
            if (animatorSetLJFF3 != null) {
                animatorSetLJFF3.addListener(new AAListenerS332S0100000_21(this, 48));
            }
            AnimatorSet animatorSetLJFF4 = iCommentLikeAndHateServiceLJII.LJFF(this.LLJ);
            this.LLJJIJIL = animatorSetLJFF4;
            if (animatorSetLJFF4 != null) {
                animatorSetLJFF4.addListener(new AAListenerS332S0100000_21(this, 49));
            }
            AnimatorSet animatorSetLJI2 = iCommentLikeAndHateServiceLJII.LJI(this.LLJ, this.LLJI);
            this.LLJJJJ = animatorSetLJI2;
            if (animatorSetLJI2 != null) {
                animatorSetLJI2.addListener(new AAListenerS332S0100000_21(this, 50));
            }
            AnimatorSet animatorSetLIZLLL2 = iCommentLikeAndHateServiceLJII.LIZLLL(this.LLJI, this.LLJ);
            this.LLJJJIL = animatorSetLIZLLL2;
            if (animatorSetLIZLLL2 != null) {
                animatorSetLIZLLL2.addListener(new AAListenerS332S0100000_21(this, 51));
            }
        }
        RelativeLayout relativeLayout = this.LLIZ;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(new ATListenerS454S0100000_21(this, 2));
        }
        RelativeLayout relativeLayout2 = this.LLJIJIL;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnTouchListener(new ATListenerS454S0100000_21(this, 3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL.setCurrentState(Lifecycle.State.CREATED);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LL.setCurrentState(Lifecycle.State.DESTROYED);
    }

    public final Aweme getAweme() {
        return this.LLILLL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LL;
    }

    public final void LJ(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLJ;
            if (tuxIconView != null) {
                tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
            TuxIconView tuxIconView2 = this.LLJI;
            if (tuxIconView2 != null) {
                tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLJ;
        if (tuxIconView3 != null) {
            C786410Ut5.hc(tuxIconView3, 1.0f);
        }
        TuxIconView tuxIconView4 = this.LLJ;
        if (tuxIconView4 != null) {
            C786410Ut5.Cc(tuxIconView4, 1.0f);
        }
        TuxIconView tuxIconView5 = this.LLJI;
        if (tuxIconView5 != null) {
            C786410Ut5.hc(tuxIconView5, 1.0f);
        }
        TuxIconView tuxIconView6 = this.LLJI;
        if (tuxIconView6 == null) {
            return;
        }
        C786410Ut5.Cc(tuxIconView6, 1.0f);
    }

    public final void LJI(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
            TuxIconView tuxIconView2 = this.LLILZLL;
            if (tuxIconView2 != null) {
                tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLILZIL;
        if (tuxIconView3 != null) {
            C786410Ut5.hc(tuxIconView3, 1.0f);
        }
        TuxIconView tuxIconView4 = this.LLILZIL;
        if (tuxIconView4 != null) {
            C786410Ut5.Cc(tuxIconView4, 1.0f);
        }
        TuxIconView tuxIconView5 = this.LLILZLL;
        if (tuxIconView5 != null) {
            C786410Ut5.hc(tuxIconView5, 1.0f);
        }
        TuxIconView tuxIconView6 = this.LLILZLL;
        if (tuxIconView6 == null) {
            return;
        }
        C786410Ut5.Cc(tuxIconView6, 1.0f);
    }

    public final void LJII(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            TuxIconView tuxIconView = this.LLJ;
            if (tuxIconView != null) {
                C786410Ut5.x5(tuxIconView, 1.0f);
            }
            TuxIconView tuxIconView2 = this.LLJI;
            if (tuxIconView2 != null) {
                C786410Ut5.x5(tuxIconView2, 0.0f);
            }
            RelativeLayout relativeLayout = this.LLJIJIL;
            if (relativeLayout != null) {
                q0.LJJIFFI(relativeLayout, getContext().getString(2131823220));
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LLJ;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.0f);
        }
        TuxIconView tuxIconView4 = this.LLJI;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, 1.0f);
        }
        RelativeLayout relativeLayout2 = this.LLJIJIL;
        if (relativeLayout2 == null) {
            return;
        }
        q0.LJJIFFI(relativeLayout2, getContext().getString(2131823223));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            if (i != 4 && i != 8) {
                return;
            }
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            this.LL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            return;
        }
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.LL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    public final void setAweme(Aweme aweme) {
        this.LLILLL = aweme;
    }

    public C1353320lJy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new LifecycleRegistry(this);
        boolean zBooleanValue = ((Boolean) C305060BxY.LIZ.getValue()).booleanValue();
        this.LLILZ = zBooleanValue;
        this.LLJJJJJIL = Keva.getRepo("ad_comment");
        FrameLayout.inflate(context, R.layout.cub, this);
        this.LLILZIL = (TuxIconView) findViewById(R.id.lmj);
        this.LLILZLL = (TuxIconView) findViewById(R.id.lf0);
        this.LLIZ = (RelativeLayout) findViewById(R.id.mo0);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.zts);
        this.LLJ = (TuxIconView) findViewById(R.id.ljd);
        this.LLJI = (TuxIconView) findViewById(R.id.lyt);
        this.LLJIJIL = (RelativeLayout) findViewById(R.id.jhi);
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, 0.0f);
        }
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, 1.0f);
        }
        TuxIconView tuxIconView3 = this.LLJ;
        if (tuxIconView3 != null) {
            C786410Ut5.x5(tuxIconView3, 0.0f);
        }
        TuxIconView tuxIconView4 = this.LLJI;
        if (tuxIconView4 != null) {
            C786410Ut5.x5(tuxIconView4, 1.0f);
        }
        RelativeLayout relativeLayout = this.LLIZ;
        if (relativeLayout != null) {
            q0.LJJI(relativeLayout, true);
            q0.LJIJ(relativeLayout, new C786390Ut3(10));
        }
        RelativeLayout relativeLayout2 = this.LLJIJIL;
        if (relativeLayout2 != null) {
            q0.LJJI(relativeLayout2, true);
            q0.LJIJ(relativeLayout2, new C786390Ut3(11));
        }
        if (zBooleanValue) {
            LIZIZ();
        }
    }

    public final void LIZ(CommentStruct commentStruct, Aweme aweme) {
        this.LLILLJJLI = commentStruct;
        this.LLILLL = aweme;
        if (aweme != null) {
            aweme.getAid();
        }
        if (!this.LLILZ) {
            LIZIZ();
        }
        int i = this.LLJJJJJIL.getInt(getDiggSpKey(), -1);
        if (i != -1) {
            commentStruct.setUserDigged(i);
        }
        int i2 = this.LLJJJJJIL.getInt(getBurySpKey(), -1);
        if (i2 != -1) {
            commentStruct.setUserBuried(i2);
        }
        LJIIIIZZ(Boolean.valueOf(commentStruct.isUserDigged()), Boolean.valueOf(commentStruct.isAuthorDigged), 0, true, false);
        C19252910Tv.LIZIZ.LIZLLL().LJIIZILJ().LIZ();
        LJII(Boolean.valueOf(commentStruct.isUserBuried()));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.Boolean r9, java.lang.Boolean r10, java.lang.Integer r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1353320lJy.LJIIIIZZ(java.lang.Boolean, java.lang.Boolean, java.lang.Integer, boolean, boolean):void");
    }
}
