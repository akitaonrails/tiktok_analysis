package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS14S0000001_29;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11oX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19613911oX extends AbstractC390720FTq {
    public Function0<? extends Point> LLILZ;
    public C0FKI LLILZIL;
    public TuxTextView LLILZLL;
    public FrameLayout LLIZ;
    public FrameLayout LLIZLLLIL;
    public C0FSC LLJ;
    public HashTagStickerModel LLJI;
    public C1664680tQA<HashTagStickerModel> LLJIJIL;
    public C1664680tQA<HashTagStickerModel> LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    private final C19630611rE getAnimStickerView() {
        return (C19630611rE) this.LLJILLL.getValue();
    }

    private final C0FLT getStickerListViewManager() {
        return (C0FLT) this.LLJJI.getValue();
    }

    private final C0FF8 getTextStickerService() {
        return (C0FF8) this.LLJJIII.getValue();
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() {
        C1664680tQA<HashTagStickerModel> c1664680tQA = this.LLJILJIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(368), true);
        C1664680tQA<HashTagStickerModel> c1664680tQA2 = this.LLJIJIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(369), true);
        C0FLT stickerListViewManager = getStickerListViewManager();
        if (stickerListViewManager != null) {
            stickerListViewManager.LIZIZ(0);
        }
        EditText titleEditText = getHashtagStickerView().getTitleEditText();
        LJIIL(String.valueOf(titleEditText != null ? C2204961BRm.LLJILLL(titleEditText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUMDA5xjmzgUIpIcyWbiyvlya5zbwz+5UyyEAZ1e4DILy9ex4YC", null)) : null));
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJ;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    public final InterfaceC19614111oZ getCoreService() {
        return (InterfaceC19614111oZ) this.LLJJ.getValue();
    }

    public final C19630611rE getHashtagStickerView() {
        return (C19630611rE) this.LLJILJILJ.getValue();
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLIZ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int bottom = frameLayout.getBottom();
        return ((bottom + (this.LLIZ != null ? r0 : null).getTop()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        HashTagStickerModel hashTagStickerModel = this.LLJI;
        if (hashTagStickerModel == null) {
            hashTagStickerModel = null;
        }
        float centerY = hashTagStickerModel.getBaseStickerModel().getCenterY();
        HashTagStickerModel hashTagStickerModel2 = this.LLJI;
        if (hashTagStickerModel2 == null) {
            hashTagStickerModel2 = null;
        }
        return ((centerY + hashTagStickerModel2.getBaseStickerModel().getTranslateY()) + (this.LLJI != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    public final int getTranslateYDiff() {
        Function0<? extends Point> function0 = this.LLILZ;
        if (function0 == null) {
            function0 = null;
        }
        return function0.invoke().y - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<HashTagStickerModel> c1664680tQA = this.LLJILJIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(366), true);
        C1664680tQA<HashTagStickerModel> c1664680tQA2 = this.LLJIJIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(367), true);
        C0FSC c0fsc = this.LLJ;
        if (c0fsc != null) {
            HashTagStickerModel hashTagStickerModel = this.LLJI;
            if (hashTagStickerModel == null) {
                hashTagStickerModel = null;
            }
            C1664680tQA<HashTagStickerModel> c1664680tQA3 = this.LLJIJIL;
            c0fsc.LIZ(hashTagStickerModel.copy(hashTagStickerModel.baseStickerModel, (c1664680tQA3 != null ? c1664680tQA3 : null).LIZ.getHashtagName(), false, hashTagStickerModel.visible, hashTagStickerModel.useCapsuleStyle), false);
        }
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJ;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLIZLLLIL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
            }
        } else {
            marginLayoutParams = null;
        }
        FrameLayout frameLayout3 = this.LLIZLLLIL;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLIZ;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
            }
        } else {
            marginLayoutParams = null;
        }
        FrameLayout frameLayout3 = this.LLIZ;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    public final void LJIIJ(HashtagStruct hashtagStruct) {
        C0FGR c0fgrLIZJ;
        String hashtagName;
        C0FF8 textStickerService = getTextStickerService();
        if (textStickerService != null && (c0fgrLIZJ = textStickerService.LIZJ()) != null) {
            if (hashtagStruct == null || (hashtagName = hashtagStruct.getHashtagName()) == null) {
                hashtagName = "";
            }
            c0fgrLIZJ.LIZLLL(new C387650FHv("hashtag_sticker", hashtagName));
        }
    }

    public final void LJIIL(String str) {
        C0FLT stickerListViewManager = getStickerListViewManager();
        if (stickerListViewManager != null) {
            stickerListViewManager.LIZ(str);
        }
    }

    public final void LJIILIIL(HashtagStruct hashtagStruct) {
        C0FGR c0fgrLIZJ;
        String hashtagName;
        C0FF8 textStickerService = getTextStickerService();
        if (textStickerService != null && (c0fgrLIZJ = textStickerService.LIZJ()) != null) {
            if (hashtagStruct == null || (hashtagName = hashtagStruct.getHashtagName()) == null) {
                hashtagName = "";
            }
            c0fgrLIZJ.LJI(new C387650FHv("hashtag_sticker", hashtagName));
        }
        C1664680tQA<HashTagStickerModel> c1664680tQA = this.LLJIJIL;
        C1664680tQA<HashTagStickerModel> c1664680tQA2 = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(hashtagStruct, 715), true);
        C1664680tQA<HashTagStickerModel> c1664680tQA3 = this.LLJILJIL;
        if (c1664680tQA3 != null) {
            c1664680tQA2 = c1664680tQA3;
        }
        c1664680tQA2.LIZLLL(new AwS608S0100000_29(hashtagStruct, 716), true);
        EditText titleEditText = getHashtagStickerView().getTitleEditText();
        if (titleEditText != null) {
            HandlerHook.viewPostDelay(titleEditText, new ARunnableS129S0100000_29(this, 195), 200L);
        }
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        LIZLLL(i);
        HashTagStickerModel hashTagStickerModel = this.LLJI;
        C1664680tQA<HashTagStickerModel> c1664680tQA = null;
        if (hashTagStickerModel == null) {
            hashTagStickerModel = null;
        }
        if (hashTagStickerModel.getHashtagName() == null) {
            C1664680tQA<HashTagStickerModel> c1664680tQA2 = this.LLJILJIL;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            c1664680tQA2.LIZLLL(new AwS608S0100000_29(this, 723), true);
        } else {
            float stickerInitTranslationY = getStickerInitTranslationY();
            C19630611rE animStickerView = getAnimStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(animStickerView);
            animStickerView.setTranslationY(stickerInitTranslationY);
            C1664680tQA<HashTagStickerModel> c1664680tQA3 = this.LLJILJIL;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(new AwS14S0000001_29(stickerInitTranslationY, 9), true);
        }
        C1664680tQA<HashTagStickerModel> c1664680tQA4 = this.LLJILJIL;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(370), true);
        C1664680tQA<HashTagStickerModel> c1664680tQA5 = this.LLJIJIL;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        c1664680tQA5.LIZLLL(AFwS273S0000000_29.get$arr$(371), true);
        C19630611rE animStickerView2 = getAnimStickerView();
        C1664680tQA<HashTagStickerModel> c1664680tQA6 = this.LLJILJIL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA6.LIZ.getBaseStickerModel();
        C1664680tQA<HashTagStickerModel> c1664680tQA7 = this.LLJIJIL;
        if (c1664680tQA7 != null) {
            c1664680tQA = c1664680tQA7;
        }
        LJIIIZ(animStickerView2, baseStickerModel, BaseStickerModel.copy$default(c1664680tQA.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        super.LJZI(i);
        C1664680tQA<HashTagStickerModel> c1664680tQA = this.LLJILJIL;
        HashTagStickerModel hashTagStickerModel = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS608S0100000_29(this, 724), true);
        C1664680tQA<HashTagStickerModel> c1664680tQA2 = this.LLJIJIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(372), true);
        C1664680tQA<HashTagStickerModel> c1664680tQA3 = this.LLJIJIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        if (c1664680tQA3.LIZ.getHashtagName() == null) {
            C1664680tQA<HashTagStickerModel> c1664680tQA4 = this.LLJILJIL;
            if (c1664680tQA4 == null) {
                c1664680tQA4 = null;
            }
            c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(373), true);
        }
        HashTagStickerModel hashTagStickerModel2 = this.LLJI;
        if (hashTagStickerModel2 == null) {
            hashTagStickerModel2 = null;
        }
        if (hashTagStickerModel2.getHashtagName() == null) {
            C1664680tQA<HashTagStickerModel> c1664680tQA5 = this.LLJILJIL;
            if (c1664680tQA5 == null) {
                c1664680tQA5 = null;
            }
            c1664680tQA5.LIZLLL(new AwS608S0100000_29(this, 725), true);
        }
        C1664680tQA<HashTagStickerModel> c1664680tQA6 = this.LLJILJIL;
        if (c1664680tQA6 == null) {
            c1664680tQA6 = null;
        }
        c1664680tQA6.LIZLLL(AFwS273S0000000_29.get$arr$(374), true);
        C19630611rE animStickerView = getAnimStickerView();
        C1664680tQA<HashTagStickerModel> c1664680tQA7 = this.LLJIJIL;
        if (c1664680tQA7 == null) {
            c1664680tQA7 = null;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(c1664680tQA7.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
        C1664680tQA<HashTagStickerModel> c1664680tQA8 = this.LLJILJIL;
        if (c1664680tQA8 == null) {
            c1664680tQA8 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA8.LIZ.getBaseStickerModel();
        HashTagStickerModel hashTagStickerModel3 = this.LLJI;
        if (hashTagStickerModel3 != null) {
            hashTagStickerModel = hashTagStickerModel3;
        }
        LJIIIIZZ(animStickerView, baseStickerModelCopy$default, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, hashTagStickerModel.getBaseStickerModel().getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJ = c0fsc;
    }

    public C19613911oX(Context context, C390420FSm c390420FSm) {
        super(context, null, 0);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(context, 992));
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(context, 990));
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1292));
        this.LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 988));
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(c390420FSm, 1291));
    }

    public final void LJIIJJI(HashTagStickerModel hashTagStickerModel, AwS573S0100000_29 awS573S0100000_29, C0FKI c0fki, LifecycleOwner lifecycleOwner) {
        List<InputFilter> listLIZ;
        InputFilter[] inputFilterArr;
        EditText titleEditText;
        this.LLJIJIL = new C1664680tQA<>(hashTagStickerModel.copy(BaseStickerModel.copy$default(hashTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), hashTagStickerModel.hashtagName, true, false, hashTagStickerModel.useCapsuleStyle));
        this.LLJILJIL = new C1664680tQA<>(hashTagStickerModel.copy(BaseStickerModel.copy$default(hashTagStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), hashTagStickerModel.hashtagName, hashTagStickerModel.editable, false, hashTagStickerModel.useCapsuleStyle));
        this.LLILZIL = c0fki;
        this.LLJI = hashTagStickerModel;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d6d, this, true);
        this.LLIZ = (FrameLayout) findViewById(R.id.o84);
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.o85);
        this.LLILZLL = (TuxTextView) findViewById(R.id.ztg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout frameLayout = this.LLIZ;
        C0FKI c0fki2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.addView(getHashtagStickerView(), layoutParams);
        addView(getAnimStickerView(), layoutParams);
        C19630611rE hashtagStickerView = getHashtagStickerView();
        int visibility = hashtagStickerView.getVisibility();
        hashtagStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, hashtagStickerView);
        C19630611rE animStickerView = getAnimStickerView();
        int visibility2 = animStickerView.getVisibility();
        animStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, animStickerView);
        C0FLT stickerListViewManager = getStickerListViewManager();
        if (stickerListViewManager != null) {
            FrameLayout frameLayout2 = this.LLIZ;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            getContext();
            stickerListViewManager.LIZJ(frameLayout2, new C388610FLn(this), new C388600FLm(this));
        }
        C0FLT stickerListViewManager2 = getStickerListViewManager();
        if (stickerListViewManager2 != null) {
            stickerListViewManager2.LIZIZ(4);
        }
        setBackgroundColor(C960203pA.LIZ(R.attr.a1_, getContext()));
        C19630611rE hashtagStickerView2 = getHashtagStickerView();
        C1664680tQA<HashTagStickerModel> c1664680tQA = this.LLJIJIL;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        hashtagStickerView2.LJI(lifecycleOwner, c1664680tQA);
        C19630611rE animStickerView2 = getAnimStickerView();
        C1664680tQA<HashTagStickerModel> c1664680tQA2 = this.LLJILJIL;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        animStickerView2.LJI(lifecycleOwner, c1664680tQA2);
        FrameLayout frameLayout3 = this.LLIZLLLIL;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        C786410Ut5.O7(frameLayout3, new AkS95S0100000_29(this, 81));
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.h9(tuxTextView, new AkS95S0100000_29(this, 82));
        C1664680tQA<HashTagStickerModel> c1664680tQA3 = this.LLJIJIL;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        if (!c1664680tQA3.LIZ.getUseCapsuleStyle()) {
            C0FKI c0fki3 = this.LLILZIL;
            if (c0fki3 != null) {
                c0fki2 = c0fki3;
            }
            Typeface typefaceByFontName = c0fki2.getTypefaceByFontName("Neon");
            if (typefaceByFontName != null) {
                EditText titleEditText2 = getHashtagStickerView().getTitleEditText();
                if (titleEditText2 != null) {
                    titleEditText2.setTypeface(typefaceByFontName);
                }
                EditText titleEditText3 = getAnimStickerView().getTitleEditText();
                if (titleEditText3 != null) {
                    titleEditText3.setTypeface(typefaceByFontName);
                }
            }
        }
        InterfaceC19614111oZ coreService = getCoreService();
        if (coreService != null && (listLIZ = coreService.LIZ()) != null && (inputFilterArr = (InputFilter[]) listLIZ.toArray(new InputFilter[0])) != null && (titleEditText = getHashtagStickerView().getTitleEditText()) != null) {
            titleEditText.setFilters(inputFilterArr);
        }
        EditText titleEditText4 = getHashtagStickerView().getTitleEditText();
        if (titleEditText4 != null) {
            titleEditText4.addTextChangedListener(new C19773412Ya(this, 19));
        }
        this.LLILZ = awS573S0100000_29;
    }
}
