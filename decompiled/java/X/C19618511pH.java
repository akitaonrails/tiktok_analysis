package X;

import Y.AAListenerS339S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS25S0100001_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11pH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19618511pH extends AbstractC390720FTq {
    public EmbedHashTagStickerModel LLILZ;
    public C1664680tQA<EmbedHashTagStickerModel> LLILZIL;
    public C1664680tQA<EmbedHashTagStickerModel> LLILZLL;
    public C19584311jl LLIZ;
    public C19584311jl LLIZLLLIL;
    public LifecycleOwner LLJ;
    public ViewGroup LLJI;
    public FrameLayout LLJIJIL;
    public View LLJILJIL;
    public C0FSC LLJILJILJ;
    public int LLJILLL;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        EmbedHashTagStickerModel embedHashTagStickerModel;
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(414), true);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(415), true);
        EmbedHashTagStickerModel embedHashTagStickerModel2 = this.LLILZ;
        if (embedHashTagStickerModel2 == null) {
            embedHashTagStickerModel = null;
            embedHashTagStickerModel2 = null;
        } else {
            embedHashTagStickerModel = embedHashTagStickerModel2;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(embedHashTagStickerModel2.getBaseStickerModel(), 0, 0, EnumC1466150oFx.PICTURE_HASHTAG_EMBED, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA3 = this.LLILZIL;
        EmbedHashTagStickerModel embedHashTagStickerModelCopy = embedHashTagStickerModel.copy(baseStickerModelCopy$default, embedHashTagStickerModel.hashtagId, (c1664680tQA3 != null ? c1664680tQA3 : null).LIZ.getContentText(), false, false, true);
        C0FSC c0fsc = this.LLJILJILJ;
        if (c0fsc != null) {
            c0fsc.LIZ(embedHashTagStickerModelCopy, false);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() {
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA = this.LLILZLL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(416), true);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA2 = this.LLILZIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(417), true);
        C19584311jl c19584311jl = this.LLIZ;
        (c19584311jl != null ? c19584311jl : null).getContentEditText().requestFocus();
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJILJILJ;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        ViewGroup viewGroup = this.LLJI;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLJIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int top = frameLayout.getTop();
        return ((top + (this.LLJIJIL != null ? r0 : null).getBottom()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        EmbedHashTagStickerModel embedHashTagStickerModel = this.LLILZ;
        if (embedHashTagStickerModel == null) {
            embedHashTagStickerModel = null;
        }
        float centerY = embedHashTagStickerModel.getBaseStickerModel().getCenterY();
        EmbedHashTagStickerModel embedHashTagStickerModel2 = this.LLILZ;
        if (embedHashTagStickerModel2 == null) {
            embedHashTagStickerModel2 = null;
        }
        return ((centerY + embedHashTagStickerModel2.getBaseStickerModel().getTranslateY()) + (this.LLILZ != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    public final int getHashTagStickerContainerTopMargin() {
        return this.LLJILLL;
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJILJILJ;
    }

    public C19618511pH(Context context) {
        super(context, null, 0);
        this.LLJILLL = C0JAI.LIZLLL(context);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup viewGroup = this.LLJI;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams.bottomMargin = i - ((int) C0JAI.LIZ(62.0f, getContext()));
        ViewGroup viewGroup3 = this.LLJI;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        C786410Ut5.X5(marginLayoutParams, viewGroup2);
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        FrameLayout frameLayout = this.LLJIJIL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        FrameLayout frameLayout3 = this.LLJIJIL;
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
        EmbedHashTagStickerModel embedHashTagStickerModel = this.LLILZ;
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA = null;
        if (embedHashTagStickerModel == null) {
            embedHashTagStickerModel = null;
        }
        if (embedHashTagStickerModel.getContentText().length() == 0) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.addListener(new AAListenerS339S0100000_29(this, 25));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            return;
        }
        float stickerInitTranslationY = getStickerInitTranslationY();
        C19584311jl c19584311jl = this.LLIZLLLIL;
        if (c19584311jl == null) {
            c19584311jl = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19584311jl);
        c19584311jl.setTranslationY(stickerInitTranslationY);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA2 = this.LLILZLL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA2.LIZ.getBaseStickerModel();
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA3 = this.LLILZLL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        c1664680tQA3.LIZLLL(new AwS25S0100001_29(baseStickerModel, stickerInitTranslationY, 3), true);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA4 = this.LLILZLL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(420), true);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA5 = this.LLILZIL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        c1664680tQA5.LIZLLL(AFwS273S0000000_29.get$arr$(421), true);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA6 = this.LLILZIL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        c1664680tQA6.LIZLLL(AFwS273S0000000_29.get$arr$(422), true);
        C19584311jl c19584311jl2 = this.LLIZLLLIL;
        if (c19584311jl2 == null) {
            c19584311jl2 = null;
        }
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA7 = this.LLILZIL;
        if (c1664680tQA7 != null) {
            c1664680tQA = c1664680tQA7;
        }
        LJIIIZ(c19584311jl2, baseStickerModel, BaseStickerModel.copy$default(c1664680tQA.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        if (getState() == C0J1Y.PAUSE) {
            return;
        }
        super.LJZI(i);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA = this.LLILZIL;
        EmbedHashTagStickerModel embedHashTagStickerModel = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 791), true);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA2 = this.LLILZLL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(new AwS608S0100000_29(this, 792), true);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA3 = this.LLILZIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        c1664680tQA3.LIZLLL(AFwS273S0000000_29.get$arr$(413), true);
        C19584311jl c19584311jl = this.LLIZLLLIL;
        if (c19584311jl == null) {
            c19584311jl = null;
        }
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA4 = this.LLILZIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(c1664680tQA4.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
        C1664680tQA<EmbedHashTagStickerModel> c1664680tQA5 = this.LLILZLL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA5.LIZ.getBaseStickerModel();
        EmbedHashTagStickerModel embedHashTagStickerModel2 = this.LLILZ;
        if (embedHashTagStickerModel2 != null) {
            embedHashTagStickerModel = embedHashTagStickerModel2;
        }
        LJIIIIZZ(c19584311jl, baseStickerModelCopy$default, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, embedHashTagStickerModel.getBaseStickerModel().getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
    }

    public final void setHashTagStickerContainerTopMargin(int i) {
        this.LLJILLL = i;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJILJILJ = c0fsc;
    }
}
