package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;
import irm.AkS95S0100000_29;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS10S0000001_22;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11qr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19628311qr extends AbstractC390720FTq {
    public final C390420FSm LLILZ;
    public Function0<? extends Point> LLILZIL;
    public C0FKI LLILZLL;
    public TuxTextView LLIZ;
    public FrameLayout LLIZLLLIL;
    public FrameLayout LLJ;
    public C0FSC LLJI;
    public MentionStickerModel LLJIJIL;
    public C1664680tQA<MentionStickerModel> LLJILJIL;
    public C1664680tQA<MentionStickerModel> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public InterfaceC19628511qt LLJJIII;

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return 0.0f;
    }

    private final C19630811rG getAnimStickerView() {
        return (C19630811rG) this.LLJJ.getValue();
    }

    private final InterfaceC19628411qs getCoreService() {
        return (InterfaceC19628411qs) this.LLJJI.getValue();
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        InterfaceC19628511qt interfaceC19628511qt = this.LLJJIII;
        if (interfaceC19628511qt != null) {
            interfaceC19628511qt.LIZIZ(8);
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        C1664680tQA<MentionStickerModel> c1664680tQA = this.LLJILJILJ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(394), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(395), true);
        C0FSC c0fsc = this.LLJI;
        if (c0fsc != null) {
            MentionStickerModel mentionStickerModel = this.LLJIJIL;
            MentionStickerModel mentionStickerModel2 = mentionStickerModel != null ? mentionStickerModel : null;
            c0fsc.LIZ(mentionStickerModel2.copy(mentionStickerModel2.baseStickerModel, getStateContainer().LIZ.getUser(), getStateContainer().LIZ.getUserId(), getStateContainer().LIZ.getSecUid(), getStateContainer().LIZ.getUserName(), getStateContainer().LIZ.getAvatarUrl(), getStateContainer().LIZ.getNickname(), mentionStickerModel2.useNickName, false, mentionStickerModel2.visible, mentionStickerModel2.useCapsuleStyle), false);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() {
        C1664680tQA<MentionStickerModel> c1664680tQA = this.LLJILJILJ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS273S0000000_29.get$arr$(396), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(397), true);
        InterfaceC19628511qt interfaceC19628511qt = this.LLJJIII;
        if (interfaceC19628511qt != null) {
            interfaceC19628511qt.LIZIZ(0);
        }
        EditText titleEditText = getMentionStickerView().getTitleEditText();
        String strValueOf = String.valueOf(titleEditText != null ? C2204961BRm.LLJILLL(titleEditText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUMDA5xjmzgVY5VbziVgivgzbNvUnwbDpofiiVT1Tp8khgAu23Q", null)) : null);
        InterfaceC19628511qt interfaceC19628511qt2 = this.LLJJIII;
        if (interfaceC19628511qt2 != null) {
            interfaceC19628511qt2.LIZ(strValueOf);
        }
        if (getStateContainer().LIZ.getUser() != null) {
            InterfaceC19628511qt interfaceC19628511qt3 = this.LLJJIII;
            if (interfaceC19628511qt3 != null) {
                interfaceC19628511qt3.LLJL(getStateContainer().LIZ.getUser());
                return;
            }
            return;
        }
        User user = new User();
        String userId = getStateContainer().LIZ.getUserId();
        if (userId != null) {
            user.setUid(userId);
        }
        String secUid = getStateContainer().LIZ.getSecUid();
        if (secUid != null) {
            user.setSecUid(secUid);
        }
        String nickname = getStateContainer().LIZ.getNickname();
        if (nickname != null) {
            user.setNickname(nickname);
        }
        InterfaceC19628511qt interfaceC19628511qt4 = this.LLJJIII;
        if (interfaceC19628511qt4 != null) {
            interfaceC19628511qt4.LLJL(user);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLJI;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    public final C19630811rG getMentionStickerView() {
        return (C19630811rG) this.LLJILLL.getValue();
    }

    public final C1664680tQA<MentionStickerModel> getStateContainer() {
        C1664680tQA<MentionStickerModel> c1664680tQA = this.LLJILJIL;
        if (c1664680tQA != null) {
            return c1664680tQA;
        }
        return null;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int bottom = frameLayout.getBottom();
        return ((bottom + (this.LLIZLLLIL != null ? r0 : null).getTop()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        MentionStickerModel mentionStickerModel = this.LLJIJIL;
        if (mentionStickerModel == null) {
            mentionStickerModel = null;
        }
        float centerY = mentionStickerModel.getBaseStickerModel().getCenterY();
        MentionStickerModel mentionStickerModel2 = this.LLJIJIL;
        if (mentionStickerModel2 == null) {
            mentionStickerModel2 = null;
        }
        return ((centerY + mentionStickerModel2.getBaseStickerModel().getTranslateY()) + (this.LLJIJIL != null ? r0 : null).getBaseStickerModel().getContainerTop()) - ((getTop() + getBottom()) / 2);
    }

    public final int getTranslateYDiff() {
        Function0<? extends Point> function0 = this.LLILZIL;
        if (function0 == null) {
            function0 = null;
        }
        return function0.invoke().y - ((getTop() + getBottom()) / 2);
    }

    public final C0FSC getStickerEditListener() {
        return this.LLJI;
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLJ;
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
        FrameLayout frameLayout3 = this.LLJ;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
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

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        LIZLLL(i);
        MentionStickerModel mentionStickerModel = this.LLJIJIL;
        C1664680tQA<MentionStickerModel> c1664680tQA = null;
        if (mentionStickerModel == null) {
            mentionStickerModel = null;
        }
        if (!mentionStickerModel.isNotEmptyModel()) {
            C1664680tQA<MentionStickerModel> c1664680tQA2 = this.LLJILJILJ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            c1664680tQA2.LIZLLL(new AwS601S0100000_22(this, 834), true);
        } else {
            float stickerInitTranslationY = getStickerInitTranslationY();
            C19630811rG animStickerView = getAnimStickerView();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(animStickerView);
            animStickerView.setTranslationY(stickerInitTranslationY);
            C1664680tQA<MentionStickerModel> c1664680tQA3 = this.LLJILJILJ;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(new AwS10S0000001_22(stickerInitTranslationY, 9), true);
        }
        C1664680tQA<MentionStickerModel> c1664680tQA4 = this.LLJILJILJ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(398), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(399), true);
        C19630811rG animStickerView2 = getAnimStickerView();
        C1664680tQA<MentionStickerModel> c1664680tQA5 = this.LLJILJILJ;
        if (c1664680tQA5 != null) {
            c1664680tQA = c1664680tQA5;
        }
        LJIIIZ(animStickerView2, c1664680tQA.LIZ.getBaseStickerModel(), BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJZI(int i) {
        super.LJZI(i);
        C1664680tQA<MentionStickerModel> c1664680tQA = this.LLJILJILJ;
        MentionStickerModel mentionStickerModel = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS601S0100000_22(this, 835), true);
        getStateContainer().LIZLLL(AFwS273S0000000_29.get$arr$(400), true);
        if (!getStateContainer().LIZ.isNotEmptyModel()) {
            C1664680tQA<MentionStickerModel> c1664680tQA2 = this.LLJILJILJ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            c1664680tQA2.LIZLLL(AFwS273S0000000_29.get$arr$(401), true);
        }
        MentionStickerModel mentionStickerModel2 = this.LLJIJIL;
        if (mentionStickerModel2 == null) {
            mentionStickerModel2 = null;
        }
        if (!mentionStickerModel2.isNotEmptyModel()) {
            C1664680tQA<MentionStickerModel> c1664680tQA3 = this.LLJILJILJ;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c1664680tQA3.LIZLLL(new AwS608S0100000_29(this, 756), true);
        }
        C1664680tQA<MentionStickerModel> c1664680tQA4 = this.LLJILJILJ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        c1664680tQA4.LIZLLL(AFwS273S0000000_29.get$arr$(393), true);
        C19630811rG animStickerView = getAnimStickerView();
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(getStateContainer().LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null);
        C1664680tQA<MentionStickerModel> c1664680tQA5 = this.LLJILJILJ;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA5.LIZ.getBaseStickerModel();
        MentionStickerModel mentionStickerModel3 = this.LLJIJIL;
        if (mentionStickerModel3 != null) {
            mentionStickerModel = mentionStickerModel3;
        }
        LJIIIIZZ(animStickerView, baseStickerModelCopy$default, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, mentionStickerModel.getBaseStickerModel().getScale(), 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -8388609, 15, null));
    }

    public final void setStateContainer(C1664680tQA<MentionStickerModel> c1664680tQA) {
        this.LLJILJIL = c1664680tQA;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLJI = c0fsc;
    }

    public C19628311qr(Context context, C390420FSm c390420FSm) {
        super(context, null, 0);
        this.LLILZ = c390420FSm;
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(context, 1024));
        this.LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(context, 1019));
        this.LLJJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1021));
    }

    public final void LJIIJJI(User user, String str) {
        InterfaceC19628411qs coreService = getCoreService();
        if (coreService != null) {
            coreService.LIZJ();
            user.setNickname(str);
        }
        user.setUniqueId(str);
    }

    public final void LJIIJ(MentionStickerModel mentionStickerModel, AwS573S0100000_29 awS573S0100000_29, C0FKI c0fki, LifecycleOwner lifecycleOwner) {
        C19629011qy c19629011qyLIZLLL;
        EditText titleEditText;
        List<InputFilter> listLIZ;
        InputFilter[] inputFilterArr;
        EditText titleEditText2;
        C0FKI c0fki2 = null;
        setStateContainer(new C1664680tQA<>(mentionStickerModel.copy(BaseStickerModel.copy$default(mentionStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), mentionStickerModel.user, mentionStickerModel.userId, mentionStickerModel.secUid, mentionStickerModel.userName, mentionStickerModel.avatarUrl, mentionStickerModel.nickname, mentionStickerModel.useNickName, true, false, mentionStickerModel.useCapsuleStyle)));
        this.LLJILJILJ = new C1664680tQA<>(mentionStickerModel.copy(BaseStickerModel.copy$default(mentionStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2139095039, 15, null), mentionStickerModel.user, mentionStickerModel.userId, mentionStickerModel.secUid, mentionStickerModel.userName, mentionStickerModel.avatarUrl, mentionStickerModel.nickname, mentionStickerModel.useNickName, mentionStickerModel.editable, false, mentionStickerModel.useCapsuleStyle));
        this.LLILZLL = c0fki;
        this.LLJIJIL = mentionStickerModel;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d6d, this, true);
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.o84);
        this.LLJ = (FrameLayout) findViewById(R.id.o85);
        this.LLIZ = (TuxTextView) findViewById(R.id.ztg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.addView(getMentionStickerView(), layoutParams);
        addView(getAnimStickerView(), layoutParams);
        C19630811rG mentionStickerView = getMentionStickerView();
        int visibility = mentionStickerView.getVisibility();
        mentionStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, mentionStickerView);
        C19630811rG animStickerView = getAnimStickerView();
        int visibility2 = animStickerView.getVisibility();
        animStickerView.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, animStickerView);
        InterfaceC19628411qs coreService = getCoreService();
        if (coreService != null) {
            C1466510oGX c1466510oGX = new C1466510oGX(this);
            C1215150hj7 c1215150hj7 = new C1215150hj7(this);
            FrameLayout frameLayout2 = this.LLIZLLLIL;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            c19629011qyLIZLLL = coreService.LIZLLL(c1466510oGX, c1215150hj7, frameLayout2);
        } else {
            c19629011qyLIZLLL = null;
        }
        this.LLJJIII = c19629011qyLIZLLL;
        if (c19629011qyLIZLLL != null) {
            c19629011qyLIZLLL.LIZIZ(4);
        }
        setBackgroundColor(C960203pA.LIZ(R.attr.a1_, getContext()));
        getMentionStickerView().LJI(lifecycleOwner, getStateContainer());
        C19630811rG animStickerView2 = getAnimStickerView();
        C1664680tQA<MentionStickerModel> c1664680tQA = this.LLJILJILJ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        animStickerView2.LJI(lifecycleOwner, c1664680tQA);
        FrameLayout frameLayout3 = this.LLJ;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        C786410Ut5.O7(frameLayout3, new AkS95S0100000_29(this, 92));
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.h9(tuxTextView, new AkS88S0100000_19(this, 9));
        if (!getStateContainer().LIZ.getUseCapsuleStyle()) {
            C0FKI c0fki3 = this.LLILZLL;
            if (c0fki3 != null) {
                c0fki2 = c0fki3;
            }
            Typeface typefaceByFontName = c0fki2.getTypefaceByFontName("Neon");
            if (typefaceByFontName != null) {
                EditText titleEditText3 = getMentionStickerView().getTitleEditText();
                if (titleEditText3 != null) {
                    titleEditText3.setTypeface(typefaceByFontName);
                }
                EditText titleEditText4 = getAnimStickerView().getTitleEditText();
                if (titleEditText4 != null) {
                    titleEditText4.setTypeface(typefaceByFontName);
                }
            }
        }
        InterfaceC19628411qs coreService2 = getCoreService();
        if (coreService2 != null && (listLIZ = coreService2.LIZ()) != null && (inputFilterArr = (InputFilter[]) listLIZ.toArray(new InputFilter[0])) != null && (titleEditText2 = getMentionStickerView().getTitleEditText()) != null) {
            titleEditText2.setFilters(inputFilterArr);
        }
        IMentionMixSearchService iMentionMixSearchService = (IMentionMixSearchService) PluggableExtentionKt.pluggableSpi$default(IMentionMixSearchService.class, false, false, false, 14, null);
        if ((iMentionMixSearchService == null || !iMentionMixSearchService.LJI()) && (titleEditText = getMentionStickerView().getTitleEditText()) != null) {
            titleEditText.setInputType(524289);
        }
        EditText titleEditText5 = getMentionStickerView().getTitleEditText();
        if (titleEditText5 != null) {
            titleEditText5.addTextChangedListener(new C19773412Ya(this, 21));
        }
        this.LLILZIL = awS573S0100000_29;
    }
}
