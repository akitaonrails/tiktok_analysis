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
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS25S0100001_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS79S1000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11sY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19638811sY extends AbstractC390720FTq {
    public final C390420FSm LLILZ;
    public PollStickerModel LLILZIL;
    public ViewGroup LLILZLL;
    public C1664680tQA<PollStickerModel> LLIZ;
    public C1664680tQA<PollStickerModel> LLIZLLLIL;
    public LifecycleOwner LLJ;
    public FrameLayout LLJI;
    public C0FSC LLJIJIL;
    public final C01GW LLJILJIL;
    public C19615211ok LLJILJILJ;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZJ() {
        C0FSC c0fsc = this.LLJIJIL;
        if (c0fsc != null) {
            c0fsc.LJ();
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() throws Throwable {
        C1664680tQA<PollStickerModel> c1664680tQA = this.LLIZLLLIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(355), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(356), true);
        getPollStickerView().getPollStickerTitleEditText().requestFocus();
        C1842280y2c pollStickerTitleEditText = getPollStickerView().getPollStickerTitleEditText();
        Editable editableE = C2204961BRm.E(getPollStickerView().getPollStickerTitleEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF066YdQ2ynBJ5dIQaqwEzk8jW6o0M=", null));
        pollStickerTitleEditText.setSelection(editableE != null ? editableE.length() : 0);
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJIJIL;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    public final boolean LJIIJ() {
        Iterator<C0FTJ<StickerModel>> it2 = C390410FSl.LIZLLL(this.LLILZ).iterator();
        while (it2.hasNext()) {
            C0FTJ<StickerModel> next = it2.next();
            if (next.getStickerType() == EnumC1466150oFx.POLL) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        ViewGroup viewGroup = this.LLILZLL;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    public final C19615211ok getPollStickerView() {
        return (C19615211ok) this.LLJILJIL.getValue();
    }

    public final C1664680tQA<PollStickerModel> getStateContainer() {
        C1664680tQA<PollStickerModel> c1664680tQA = this.LLIZ;
        if (c1664680tQA != null) {
            return c1664680tQA;
        }
        return null;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLJI;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int top = frameLayout.getTop();
        return ((top + (this.LLJI != null ? r0 : null).getBottom()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        PollStickerModel pollStickerModel = this.LLILZIL;
        if (pollStickerModel == null) {
            pollStickerModel = null;
        }
        float centerY = pollStickerModel.getBaseStickerModel().getCenterY();
        PollStickerModel pollStickerModel2 = this.LLILZIL;
        if (pollStickerModel2 == null) {
            pollStickerModel2 = null;
        }
        return ((centerY + pollStickerModel2.getBaseStickerModel().getTranslateY()) + (this.LLILZIL != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<PollStickerModel> c1664680tQA = this.LLIZLLLIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(353), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(354), true);
        PollStickerModel pollStickerModel = this.LLILZIL;
        PollStickerModel pollStickerModel2 = pollStickerModel != null ? pollStickerModel : null;
        PollStickerModel pollStickerModelCopy = pollStickerModel2.copy(pollStickerModel2.baseStickerModel, true, false, false, getStateContainer().LIZ.getQuestion(), getStateContainer().LIZ.getOption1(), getStateContainer().LIZ.getOption2(), pollStickerModel2.pollStickerId);
        C0FSC c0fsc = this.LLJIJIL;
        if (c0fsc != null) {
            c0fsc.LIZ(pollStickerModelCopy, false);
        }
    }

    public final void LJIIJJI() {
        if (!Intrinsics.LJFF(getStateContainer().LIZ.getQuestion(), String.valueOf(C2204961BRm.E(getPollStickerView().getPollStickerTitleEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF066YdQ2ynBJ5dIQaqwEzk8jW6o0M=", null))))) {
            getStateContainer().LIZLLL(new AwS608S0100000_29(this, 680), true);
        }
        String strValueOf = String.valueOf(C2204961BRm.E(getPollStickerView().getPollStickerOptionFirstEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF066YdQ2ynBJ5dIQaqwEzk8jW6o0M=", null)));
        if (strValueOf.length() == 0) {
            strValueOf = getContext().getString(2131858399);
        }
        getStateContainer().LIZLLL(new AwS79S1000000_29(strValueOf, 8), true);
        String strValueOf2 = String.valueOf(C2204961BRm.E(getPollStickerView().getPollStickerOptionSecondText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUPDAF066YdQ2ynBJ5dIQaqwEzk8jW6o0M=", null)));
        if (strValueOf2.length() == 0) {
            strValueOf2 = getContext().getString(2131858400);
        }
        getStateContainer().LIZLLL(new AwS79S1000000_29(strValueOf2, 9), true);
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup viewGroup = this.LLILZLL;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        ViewGroup viewGroup3 = this.LLILZLL;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        C786410Ut5.X5(marginLayoutParams, viewGroup2);
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        FrameLayout frameLayout = this.LLJI;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        FrameLayout frameLayout3 = this.LLJI;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        LIZLLL(i);
        if (LJIIJ()) {
            float stickerInitTranslationY = getStickerInitTranslationY();
            C19615211ok c19615211ok = this.LLJILJILJ;
            C1664680tQA<PollStickerModel> c1664680tQA = null;
            if (c19615211ok == null) {
                c19615211ok = null;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19615211ok);
            c19615211ok.setTranslationY(stickerInitTranslationY);
            C1664680tQA<PollStickerModel> c1664680tQA2 = this.LLIZLLLIL;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            BaseStickerModel baseStickerModel = c1664680tQA2.LIZ.getBaseStickerModel();
            C1664680tQA<PollStickerModel> c1664680tQA3 = this.LLIZLLLIL;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(new AwS25S0100001_29(baseStickerModel, stickerInitTranslationY, 2), true);
            C1664680tQA<PollStickerModel> c1664680tQA4 = this.LLIZLLLIL;
            if (c1664680tQA4 == null) {
                c1664680tQA4 = null;
            }
            c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(351), true);
            getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(352), true);
            C19615211ok c19615211ok2 = this.LLJILJILJ;
            if (c19615211ok2 == null) {
                c19615211ok2 = null;
            }
            C1664680tQA<PollStickerModel> c1664680tQA5 = this.LLIZLLLIL;
            if (c1664680tQA5 != null) {
                c1664680tQA = c1664680tQA5;
            }
            LJIIIZ(c19615211ok2, c1664680tQA.LIZ.getBaseStickerModel(), getStateContainer().LIZ.getBaseStickerModel());
            return;
        }
        getStateContainer().LIZLLL(new AwS608S0100000_29(this, 678), true);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getPollStickerView(), "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getPollStickerView(), "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat3.setDuration(300L);
        objectAnimatorOfFloat3.addListener(new AAListenerS339S0100000_29(this, 13));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(C1697810uHb.LJIIJJI(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3));
        animatorSet.start();
        C0FSC c0fsc = this.LLJIJIL;
        if (c0fsc == null) {
            return;
        }
        c0fsc.LIZLLL(false);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        super.LJZI(i);
        LJIIJJI();
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(349), true);
        C1664680tQA<PollStickerModel> c1664680tQA = this.LLIZLLLIL;
        PollStickerModel pollStickerModel = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 677), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(350), true);
        C19615211ok c19615211ok = this.LLJILJILJ;
        if (c19615211ok == null) {
            c19615211ok = null;
        }
        BaseStickerModel baseStickerModel = getStateContainer().LIZ.getBaseStickerModel();
        C1664680tQA<PollStickerModel> c1664680tQA2 = this.LLIZLLLIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        BaseStickerModel baseStickerModel2 = c1664680tQA2.LIZ.getBaseStickerModel();
        PollStickerModel pollStickerModel2 = this.LLILZIL;
        if (pollStickerModel2 != null) {
            pollStickerModel = pollStickerModel2;
        }
        LJIIIIZZ(c19615211ok, baseStickerModel, BaseStickerModel.copy$default(baseStickerModel2, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, pollStickerModel.getBaseStickerModel().getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
    }

    public final void setStateContainer(C1664680tQA<PollStickerModel> c1664680tQA) {
        this.LLIZ = c1664680tQA;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJIJIL = c0fsc;
    }

    public C19638811sY(Context context, C390420FSm c390420FSm) {
        super(context, null, 0);
        this.LLILZ = c390420FSm;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS430S0200000_29(context, this, 101));
    }
}
