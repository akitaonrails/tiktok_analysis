package X;

import Y.ACListenerS163S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.social.sticker.editcomponent.secretreplies.basesticker.SecretRepliesFeedViewModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import mf.a;

/* JADX INFO: renamed from: X.11ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19577711ih extends AbstractC19588311kP<SecretRepliesStickerModel> implements InterfaceC789470Uy1 {
    public final Aweme LLILZIL;
    public final Keva LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final SecretRepliesFeedViewModel LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    public final void LIZLLL() throws Throwable {
        C705930RmZ c705930RmZ;
        InterfaceC19578011ik interfaceC19578011ik;
        LJIIIIZZ(false);
        LJII(false);
        KeyboardUtils.LIZ(getContext(), getReplyArea());
        C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
        if (interactStickerContainerCommonParam == null || (c705930RmZ = interactStickerContainerCommonParam.LJFF) == null || (interfaceC19578011ik = c705930RmZ.LJIILL) == null) {
            return;
        }
        interfaceC19578011ik.LJ();
    }

    @Override // X.InterfaceC789470Uy1
    public int getStatus() {
        return 0;
    }

    private final SmartAvatarImageView getAvatarView() {
        return (SmartAvatarImageView) this.LLIZ.getValue();
    }

    private final TuxIconView getIcon() {
        return (TuxIconView) this.LLJILJILJ.getValue();
    }

    private final TextView getInfoTextView() {
        return (TextView) this.LLJJI.getValue();
    }

    private final C0I7D getQuestionText() {
        return (C0I7D) this.LLIZLLLIL.getValue();
    }

    private final TextView getQuestionTitle() {
        return (TextView) this.LLJ.getValue();
    }

    private final TuxTextView getReplyText() {
        return (TuxTextView) this.LLJI.getValue();
    }

    private final InterfaceC730270Skj getSecretRepliesManager() {
        return (InterfaceC730270Skj) this.LLJJIJI.getValue();
    }

    private final LinearLayout getStickerContainer() {
        return (LinearLayout) this.LLJJIII.getValue();
    }

    private final C19577811ii getStickerStartPosData() {
        return (C19577811ii) this.LLJJIJIL.getValue();
    }

    public final void LJFF() {
        String value = this.LLJJIJIIJIL.LL.getValue();
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (this.LLILZIL != null && C123100dR.LIZ(value) && activityLIZ != null) {
            getSecretRepliesManager().LIZIZ(this.LLILZIL, getSecretRepliesBackground(), value);
        }
        LIZLLL();
        C783760Uoo.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", "send");
        C20684815ws.LJIILLIIL("send_secret_reply", c0lab.LIZ);
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LJIIZILJ() {
        View.OnClickListener aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 198);
        if (C1848410yCV.LIZ) {
            aCListenerS163S0100000_29 = new f(aCListenerS163S0100000_29);
        }
        a aVar = new a(aCListenerS163S0100000_29);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final C0I7D getReplyArea() {
        return (C0I7D) this.LLJIJIL.getValue();
    }

    public final FrameLayout getSecretRepliesBackground() {
        return (FrameLayout) this.LLJJ.getValue();
    }

    public final FrameLayout getSecretRepliesView() {
        return (FrameLayout) this.LLJILLL.getValue();
    }

    public final C197039127h getSendBtn() {
        return (C197039127h) this.LLJILJIL.getValue();
    }

    public final Aweme getAweme() {
        return this.LLILZIL;
    }

    public final void LIZIZ(boolean z) {
        C705930RmZ c705930RmZ;
        InterfaceC19578011ik interfaceC19578011ik;
        if (z) {
            LJIIIIZZ(true);
            LJII(true);
            KeyboardUtils.LIZIZ(getContext(), getReplyArea());
            C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam != null && (c705930RmZ = interactStickerContainerCommonParam.LJFF) != null && (interfaceC19578011ik = c705930RmZ.LJIILL) != null) {
                interfaceC19578011ik.LIZ();
            }
            C783760Uoo.LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("action_type", "show");
            C20684815ws.LJIILLIIL("send_secret_reply", c0lab.LIZ);
        } else {
            LIZLLL();
        }
        this.LLJJIJIIJIL.LLILLJJLI.setValue(Boolean.valueOf(z));
    }

    public final void LJ(boolean z) {
        ObjectAnimator objectAnimatorOfFloat;
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(getSecretRepliesBackground(), "alpha", 0.0f, 0.5f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(getSecretRepliesBackground(), "alpha", 0.5f, 0.0f);
        }
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LJII(boolean z) throws Throwable {
        FrameLayout.LayoutParams layoutParams = null;
        if (z) {
            C786410Ut5.LLLLLLJ(getSendBtn(), 0);
            C786410Ut5.LJZ(0, getSecretRepliesBackground());
            C786410Ut5.LLLLLZL(getReplyArea(), 0);
            C786410Ut5.LLLLZLL(getReplyText(), 8);
            getReplyArea().setEnabled(true);
            getReplyArea().setInputType(1);
            getReplyArea().setClickable(true);
            getReplyArea().setFocusableInTouchMode(true);
            getReplyArea().requestFocus();
            getReplyArea().setSelection(0);
            ViewGroup.LayoutParams layoutParams2 = getReplyArea().getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.gravity = 8388611;
            }
            C786410Ut5.P6(getReplyArea(), layoutParams);
            LJ(true);
            return;
        }
        C786410Ut5.LLLLLLJ(getSendBtn(), 8);
        C786410Ut5.LJZ(8, getSecretRepliesBackground());
        C786410Ut5.LLLLLZL(getReplyArea(), 8);
        C786410Ut5.LLLLZLL(getReplyText(), 0);
        Editable editableLLLLJI = C2204961BRm.LLLLJI(getReplyArea(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV/JolMnC3GIt2Qychq2+5OzPP0huV1EAC0ZONw3kPWliANtKYtALUIkyM+01O26fa393eHmKsQn07lZhMGA=", null));
        if (editableLLLLJI != null) {
            editableLLLLJI.clear();
        }
        getReplyArea().clearFocus();
        ViewGroup.LayoutParams layoutParams3 = getReplyArea().getLayoutParams();
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
            layoutParams.gravity = 49;
        }
        C786410Ut5.P6(getReplyArea(), layoutParams);
        LJ(false);
    }

    public final void LJIIIIZZ(boolean z) {
        int iLIZIZ;
        int iLIZ;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        C19577811ii c19577811ii = new C19577811ii(0.0f, 0.0f, getSecretRepliesView().getRotation(), getSecretRepliesView().getScaleX());
        if (z) {
            getStickerStartPosData();
        } else {
            getStickerStartPosData();
        }
        if (z) {
            C19591211ks interactStickerContainerCommonParam = getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam != null && (frameLayout2 = interactStickerContainerCommonParam.LIZIZ) != null) {
                iLIZIZ = frameLayout2.getWidth();
            } else {
                iLIZIZ = C497820Jfg.LIZIZ(getContext());
            }
            C19591211ks interactStickerContainerCommonParam2 = getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam2 != null && (frameLayout = interactStickerContainerCommonParam2.LIZIZ) != null) {
                iLIZ = frameLayout.getHeight();
            } else {
                iLIZ = C497820Jfg.LIZ(getContext());
            }
            LJI(c19577811ii, new C19577811ii((iLIZIZ / 2.0f) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240)) / 2), (iLIZ / 2.0f) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)) * 2), 0.0f, 1.0f));
            return;
        }
        LJI(new C19577811ii(getStickerStartPosData().LIZ, getStickerStartPosData().LIZIZ, 0.0f, 1.0f), getStickerStartPosData());
    }

    @Override // X.AbstractC19588311kP, X.InterfaceC19592111l1
    public final void LIZJ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        String str;
        C1C1T c1c1t;
        C1C1Q c1c1q;
        C1518210pbv c1518210pbv;
        this.LLILZ = interactStickerStruct;
        Aweme aweme = this.LLILZIL;
        if (aweme != null && (c1c1t = C2203191BKr.LIZ(aweme).socialBlob) != null && (c1c1q = c1c1t.secret_reply_blob) != null && (c1518210pbv = c1c1q.secret_reply_sticker_blob) != null) {
            str = c1518210pbv.prompt_text;
        } else {
            str = null;
        }
        if (str == null) {
            C786410Ut5.LJZ(8, getSecretRepliesView());
            return;
        }
        C786410Ut5.LLIL(getQuestionTitle(), 0);
        C786410Ut5.LLLLLLJ(getSendBtn(), 8);
        getQuestionTitle().setText(str);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public final void LJI(C19577811ii c19577811ii, C19577811ii c19577811ii2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(getSecretRepliesView(), "x", c19577811ii2.LIZ), ObjectAnimator.ofFloat(getSecretRepliesView(), "y", c19577811ii2.LIZIZ), ObjectAnimator.ofFloat(getSecretRepliesView(), "scaleX", c19577811ii.LIZLLL, c19577811ii2.LIZLLL), ObjectAnimator.ofFloat(getSecretRepliesView(), "scaleY", c19577811ii.LIZLLL, c19577811ii2.LIZLLL), ObjectAnimator.ofFloat(getSecretRepliesView(), "rotation", c19577811ii.LIZJ, c19577811ii2.LIZJ));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19577711ih(X.C19EG r7, X.C19591211ks r8, com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19577711ih.<init>(X.19EG, X.11ks, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
