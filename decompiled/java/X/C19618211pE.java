package X;

import Y.AAListenerS339S0100000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS25S0100001_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS79S1000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19618211pE extends AbstractC390720FTq {
    public final C390420FSm LLILZ;
    public ViewGroup LLILZIL;
    public LifecycleOwner LLILZLL;
    public C1664680tQA<SecretRepliesStickerModel> LLIZ;
    public FrameLayout LLIZLLLIL;
    public C0FSC LLJ;
    public C1295960jpS LLJI;
    public TuxTextView LLJIJIL;
    public SecretRepliesStickerModel LLJILJIL;
    public C1664680tQA<SecretRepliesStickerModel> LLJILJILJ;
    public C11BN LLJILLL;
    public final C01GW LLJJ;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZJ() {
        C0FSC c0fsc = this.LLJ;
        if (c0fsc != null) {
            c0fsc.LJ();
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() throws Throwable {
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA != null) {
            c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(295), true);
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA2 = this.LLJILJILJ;
        if (c1664680tQA2 != null) {
            c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(296), true);
        }
        getSecretRepliesStickerView().getSecretReplyQuestionEditText().requestFocus();
        C0I7D secretReplyQuestionEditText = getSecretRepliesStickerView().getSecretReplyQuestionEditText();
        Editable editableLLLLJI = C2204961BRm.LLLLJI(getSecretRepliesStickerView().getSecretReplyQuestionEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV/JolMnC3GIt2Qychq2+5OzPP0huV1EAC0ZONw3kPWliANtKYtALUIkyM+01O26fa393eHmKpBj4k4HM5cS0H3pdKnr+", null));
        secretReplyQuestionEditText.setSelection(editableLLLLJI != null ? editableLLLLJI.length() : 0);
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJ;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    public final boolean LJIIJJI() {
        Iterator<C0FTJ<StickerModel>> it2 = C390410FSl.LIZLLL(this.LLILZ).iterator();
        while (it2.hasNext()) {
            C0FTJ<StickerModel> next = it2.next();
            if (next.getStickerType() == EnumC1466150oFx.SECRET_REPLIES) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        ViewGroup viewGroup = this.LLILZIL;
        return viewGroup == null ? new View(getContext()) : viewGroup;
    }

    public final C11BN getSecretRepliesStickerView() {
        return (C11BN) this.LLJJ.getValue();
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLIZLLLIL;
        int top = frameLayout != null ? frameLayout.getTop() : 0;
        return ((top + (this.LLIZLLLIL != null ? r0.getBottom() : 0)) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        BaseStickerModel baseStickerModel;
        BaseStickerModel baseStickerModel2;
        BaseStickerModel baseStickerModel3;
        SecretRepliesStickerModel secretRepliesStickerModel = this.LLJILJIL;
        float translateY = 0.0f;
        float centerY = (secretRepliesStickerModel == null || (baseStickerModel3 = secretRepliesStickerModel.getBaseStickerModel()) == null) ? 0.0f : baseStickerModel3.getCenterY();
        SecretRepliesStickerModel secretRepliesStickerModel2 = this.LLJILJIL;
        if (secretRepliesStickerModel2 != null && (baseStickerModel2 = secretRepliesStickerModel2.getBaseStickerModel()) != null) {
            translateY = baseStickerModel2.getTranslateY();
        }
        float f = centerY + translateY;
        SecretRepliesStickerModel secretRepliesStickerModel3 = this.LLJILJIL;
        return (f + ((secretRepliesStickerModel3 == null || (baseStickerModel = secretRepliesStickerModel3.getBaseStickerModel()) == null) ? 0 : baseStickerModel.getContainerTop())) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        C0FSC c0fsc;
        SecretRepliesStickerModel secretRepliesStickerModel;
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA != null) {
            c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(293), true);
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA2 = this.LLJILJILJ;
        if (c1664680tQA2 != null) {
            c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(294), true);
        }
        SecretRepliesStickerModel secretRepliesStickerModel2 = this.LLJILJIL;
        if (secretRepliesStickerModel2 == null || (c0fsc = this.LLJ) == null) {
            return;
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA3 = this.LLJILJILJ;
        c0fsc.LIZ(secretRepliesStickerModel2.copy(secretRepliesStickerModel2.baseStickerModel, true, (c1664680tQA3 == null || (secretRepliesStickerModel = c1664680tQA3.LIZ) == null) ? null : secretRepliesStickerModel.getQuestionText(), false), false);
    }

    public final void LJIIJ() {
        LIZ(getSecretRepliesStickerView().getSecretReplyQuestionEditText());
        C783760Uoo.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", "story");
        C20684815ws.LJIILLIIL("complete_secret_story_edit_page", c0lab.LIZ);
    }

    public final void LJIIL() {
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA;
        SecretRepliesStickerModel secretRepliesStickerModel;
        String questionText = null;
        String strValueOf = String.valueOf(C2204961BRm.LLLLJI(getSecretRepliesStickerView().getSecretReplyQuestionEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV/JolMnC3GIt2Qychq2+5OzPP0huV1EAC0ZONw3kPWliANtKYtALUIkyM+01O26fa393eHmKpBj4k4HM5cS0H3pdKnr+", null)));
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA2 = this.LLJILJILJ;
        if (c1664680tQA2 != null && (secretRepliesStickerModel = c1664680tQA2.LIZ) != null) {
            questionText = secretRepliesStickerModel.getQuestionText();
        }
        if (Intrinsics.LJFF(questionText, strValueOf) || (c1664680tQA = this.LLJILJILJ) == null) {
            return;
        }
        c1664680tQA.LIZLLL(new AwS79S1000000_29(strValueOf, 5), true);
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJ;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = this.LLILZIL;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams2 = marginLayoutParams;
        }
        ViewGroup viewGroup2 = this.LLILZIL;
        if (viewGroup2 != null) {
            C786410Ut5.X5(marginLayoutParams2, viewGroup2);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLIZLLLIL;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
            marginLayoutParams2 = marginLayoutParams;
        }
        FrameLayout frameLayout2 = this.LLIZLLLIL;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, marginLayoutParams2);
        }
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        BaseStickerModel baseStickerModel;
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA;
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA2;
        SecretRepliesStickerModel secretRepliesStickerModel;
        BaseStickerModel baseStickerModel2;
        SecretRepliesStickerModel secretRepliesStickerModel2;
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        LIZLLL(i);
        if (LJIIJJI()) {
            float stickerInitTranslationY = getStickerInitTranslationY();
            C11BN c11bn = this.LLJILLL;
            if (c11bn != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c11bn);
                c11bn.setTranslationY(stickerInitTranslationY);
            }
            C1664680tQA<SecretRepliesStickerModel> c1664680tQA3 = this.LLIZ;
            if (c1664680tQA3 == null || (secretRepliesStickerModel2 = c1664680tQA3.LIZ) == null || (baseStickerModel = secretRepliesStickerModel2.getBaseStickerModel()) == null) {
                baseStickerModel = new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -1, 15, null);
            }
            C1664680tQA<SecretRepliesStickerModel> c1664680tQA4 = this.LLIZ;
            if (c1664680tQA4 != null) {
                c1664680tQA4.LIZLLL(new AwS25S0100001_29(baseStickerModel, stickerInitTranslationY, 1), true);
            }
            C1664680tQA<SecretRepliesStickerModel> c1664680tQA5 = this.LLIZ;
            if (c1664680tQA5 != null) {
                c1664680tQA5.LIZLLL(AFwS273S0000000_29.get$arr$(291), true);
            }
            C1664680tQA<SecretRepliesStickerModel> c1664680tQA6 = this.LLJILJILJ;
            if (c1664680tQA6 != null) {
                c1664680tQA6.LIZLLL(AFwS273S0000000_29.get$arr$(292), true);
            }
            C11BN c11bn2 = this.LLJILLL;
            if (c11bn2 != null && (c1664680tQA = this.LLJILJILJ) != null && (c1664680tQA2 = this.LLIZ) != null && (secretRepliesStickerModel = c1664680tQA2.LIZ) != null && (baseStickerModel2 = secretRepliesStickerModel.getBaseStickerModel()) != null) {
                LJIIIZ(c11bn2, baseStickerModel2, c1664680tQA.LIZ.getBaseStickerModel());
                return;
            }
            return;
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA7 = this.LLJILJILJ;
        if (c1664680tQA7 != null) {
            c1664680tQA7.LIZLLL(new AwS608S0100000_29(c1664680tQA7, (C1664680tQA<SecretRepliesStickerModel>) 551), true);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getSecretRepliesStickerView(), "scaleX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getSecretRepliesStickerView(), "scaleY", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(300L);
        objectAnimatorOfFloat3.addListener(new AAListenerS339S0100000_29(this, 9));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(C1697810uHb.LJIIJJI(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3));
        animatorSet.start();
        C0FSC c0fsc = this.LLJ;
        if (c0fsc == null) {
            return;
        }
        c0fsc.LIZLLL(false);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA;
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA2;
        SecretRepliesStickerModel secretRepliesStickerModel;
        BaseStickerModel baseStickerModel;
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        super.LJZI(i);
        LJIIL();
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA3 = this.LLJILJILJ;
        if (c1664680tQA3 != null) {
            c1664680tQA3.LIZLLL(AFwS273S0000000_29.get$arr$(289), true);
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA4 = this.LLIZ;
        if (c1664680tQA4 != null) {
            c1664680tQA4.LIZLLL(new AwS395S0200000_29(this, (C19618211pE) c1664680tQA4, (C1664680tQA<SecretRepliesStickerModel>) 70), true);
        }
        C1664680tQA<SecretRepliesStickerModel> c1664680tQA5 = this.LLJILJILJ;
        if (c1664680tQA5 != null) {
            c1664680tQA5.LIZLLL(AFwS273S0000000_29.get$arr$(290), true);
        }
        C11BN c11bn = this.LLJILLL;
        if (c11bn != null && (c1664680tQA = this.LLJILJILJ) != null && (c1664680tQA2 = this.LLIZ) != null && (secretRepliesStickerModel = c1664680tQA2.LIZ) != null && (baseStickerModel = secretRepliesStickerModel.getBaseStickerModel()) != null) {
            LJIIIIZZ(c11bn, BaseStickerModel.copy$default(c1664680tQA.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null), BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, baseStickerModel.getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
        }
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJ = c0fsc;
    }

    public C19618211pE(Context context, C390420FSm c390420FSm) {
        super(context, null, 0);
        this.LLILZ = c390420FSm;
        this.LLJJ = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 76));
    }
}
