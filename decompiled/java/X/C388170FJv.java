package X;

import X.C08CQ;
import X.C0FF8;
import X.C388170FJv;
import X.EnumC388580FLk;
import X.InterfaceC388160FJu;
import Y.AAListenerS260S0200000_5;
import Y.ACListenerS140S0100000_5;
import Y.ALAdapterS0S0220000_5;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Editable;
import android.text.TextPaint;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.hashtag.HashtagSpanData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.mention.MentionSpanData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.SubTemplateInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS21S0100001_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0FJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388170FJv extends AbstractC390720FTq {
    public static final /* synthetic */ int LLLLL = 0;
    public final Context LLILZ;
    public final C390420FSm LLILZIL;
    public final FrameLayout LLILZLL;
    public final FrameLayout LLIZ;
    public final InterfaceC388760FMc LLIZLLLIL;
    public final C0FLH LLJ;
    public final C0FL9 LLJI;
    public final C0FKH LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C1664680tQA<C0FKT> LLJJIJIIJIL;
    public int LLJJIJIL;
    public long LLJJJ;
    public long LLJJJIL;
    public long LLJJJJ;
    public final long LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public InterfaceC388330FKl LLJJL;
    public InterfaceC385890FBb LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final TextPaint LLJLIL;
    public C0FLW LLJLILLLLZIIL;
    public C0FKP LLJLL;
    public final int LLJLLIL;
    public boolean LLJLLL;
    public Function0<Unit> LLJZ;
    public final C01GW LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public final C388180FJw LLLFF;
    public final C01GW LLLFFI;
    public C1664680tQA<TextStickerModel> LLLFZ;
    public C1664680tQA<TextStickerModel> LLLI;
    public LifecycleOwner LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final AwS584S0100000_5 LLLIIIL;
    public FrameLayout LLLIIL;
    public TuxTextView LLLIILIL;
    public TextStickerModel LLLIL;
    public C0FKI LLLILZ;
    public ViewGroup LLLILZJ;
    public ViewGroup LLLILZLLLI;
    public View LLLIZZ;
    public C0FL4 LLLJ;
    public View LLLJIL;
    public FrameLayout LLLJL;
    public int LLLL;
    public final C01GW LLLLII;
    public final C01GW LLLLIIIILLL;
    public C0FSC LLLLIIL;
    public Pair<Integer, Integer> LLLLIILL;
    public final C01GW LLLLIILLL;
    public boolean LLLLIL;
    public boolean LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;

    private final float getContainerOffsetY() {
        getLocationOnScreen(new int[2]);
        this.LLIZ.getLocationOnScreen(new int[2]);
        return r1[1] - r3[1];
    }

    @Override // X.AbstractC390720FTq
    public final void LJ() {
        C0FGR c0fgrLIZJ;
        setAnimStickerViewVisible(false);
        setTextStickerViewVisible(true);
        if (!getAbilityContainer().LJIL) {
            getTextStickerView().requestFocus();
        }
        this.LLJL = true;
        C786410Ut5.c2(getTextStickerView(), 0);
        C786410Ut5.T5(getTextStickerView(), 1.0f);
        C0FF8 c0ff8 = getAbilityContainer().LJFF;
        if (c0ff8 == null || (c0fgrLIZJ = c0ff8.LIZJ()) == null) {
            return;
        }
        c0fgrLIZJ.LJFF(System.currentTimeMillis());
    }

    public final void LJJIJ() {
        setAnimStickerViewVisible(true);
        setTextStickerViewVisible(false);
        C385340F8y animTextStickerView = getAnimTextStickerView();
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(c1664680tQA.LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -25165825, 15, null);
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLI;
        if (c1664680tQA2 == null) {
            c1664680tQA2 = null;
        }
        BaseStickerModel baseStickerModel = c1664680tQA2.LIZ.getBaseStickerModel();
        TextStickerModel textStickerModel = this.LLLIL;
        if (textStickerModel == null) {
            textStickerModel = null;
        }
        float scale = textStickerModel.getBaseStickerModel().getScale() * this.LLIZ.getScaleY();
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLLI;
        LJIIIIZZ(animTextStickerView, baseStickerModelCopy$default, BaseStickerModel.copy$default(baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, (c1664680tQA3 != null ? c1664680tQA3 : null).LIZ.getBaseStickerModel().getTranslateX() * this.LLIZ.getScaleX(), 0.0f, scale, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -10485761, 15, null));
    }

    private final C385340F8y getAnimTextStickerView() {
        return (C385340F8y) this.LLLIIIIL.getValue();
    }

    private final ContextThemeWrapper getDarkContext() {
        return (ContextThemeWrapper) this.LLJJIII.getValue();
    }

    private final int getDefaultKeyboardHeight() {
        return ((Number) this.LLLLIIIILLL.getValue()).intValue();
    }

    private final C21410318qb getEditText() {
        C0FL4 c0fl4 = this.LLLJ;
        return c0fl4 == null ? getTextStickerView() : c0fl4;
    }

    private final List<C0FTJ<StickerModel>> getStickerList() {
        return (List) this.LLJILJIL.getValue();
    }

    @Override // X.AbstractC390720FTq
    public final void LJFF() {
        C0FSC c0fsc = this.LLLLIIL;
        if (c0fsc != null) {
            c0fsc.LIZLLL(true);
        }
        Function0<Unit> function0 = this.LLJZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJZ = null;
    }

    public final void LJIILLIIL() {
        C0FGR c0fgrLIZJ;
        Editable editableLLJJIII;
        setAnimDuration(0L);
        if (getConfig().LJJ.LJ) {
            String recommentAYText = getRecommentAYText();
            C21410318qb editText = getEditText();
            if (editText != null && (editableLLJJIII = C2204961BRm.LLJJIII(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/ZIWQRTRl9aeopi+cKXIZl+XK/2okSrjqQBtENwQ==", null))) != null) {
                Integer numValueOf = Integer.valueOf(a0.LJJJJI(editableLLJJIII, recommentAYText, 0, 6));
                if (numValueOf.intValue() != -1) {
                    int iIntValue = numValueOf.intValue();
                    Editable editableDelete = editableLLJJIII.delete(iIntValue, recommentAYText.length() + iIntValue);
                    if (editableDelete != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("delete the text used to recommend AY first, leaving the text that belongs to textStickerAY text：");
                        sbLIZ.append(recommentAYText);
                        sbLIZ.append(", textSticker text：");
                        sbLIZ.append((Object) editableDelete);
                        C388320FKk.LIZ.d(C2188811AlT.LIZIZ(sbLIZ));
                        C21410318qb editText2 = getEditText();
                        if (editText2 != null) {
                            editText2.setText(editableDelete);
                        }
                    }
                }
            }
        } else {
            C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            c1664680tQA.LIZLLL(AFwS234S0000000_5.get$arr$(572), true);
        }
        LIZ(getTextStickerView());
        C0FF8 c0ff8 = getAbilityContainer().LJFF;
        if (c0ff8 == null || (c0fgrLIZJ = c0ff8.LIZJ()) == null) {
            return;
        }
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
        c0fgrLIZJ.LJIIJ((c1664680tQA2 != null ? c1664680tQA2 : null).LIZ);
    }

    public final boolean LJIL() {
        TextStickerModel textStickerModel = this.LLLIL;
        if (textStickerModel == null) {
            textStickerModel = null;
        }
        return textStickerModel.getTextStr().length() == 0;
    }

    public final boolean LJJ() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        TextStyleModel textStyle = c1664680tQA.LIZ.getTextStyle();
        return textStyle != null && textStyle.isEffectStyle && getConfig().LJJIIZ;
    }

    public final boolean LJJI() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (Intrinsics.LJFF(c1664680tQA.LIZ.getCompatModel().getShowPunctuation(), Boolean.FALSE)) {
            return true;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC363350EMj.NONE, EnumC363350EMj.DEFAULT);
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
        return !listLJIIJJI.contains((c1664680tQA2 != null ? c1664680tQA2 : null).LIZ.getCompatModel().getCapitalizationState());
    }

    public final boolean LJJIFFI() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        return c1664680tQA.LIZ.getTextTemplateModel().enableTextTemplate;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0515  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII() {
        /*
            Method dump skipped, instruction units count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388170FJv.LJJIII():void");
    }

    public final void LJJIIZ() {
        float bottom;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C385670FAf<C386100FBw> c385670FAfRf;
        C386100FBw c386100FBwLIZJ;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (this.LLLL == 0) {
            this.LLLL = getTextStickerView().getHeight();
        }
        InterfaceC385890FBb interfaceC385890FBb = this.LLJJLIIIJLLLLLLLZ;
        int i = 0;
        if (interfaceC385890FBb == null || (c385670FAfRf = interfaceC385890FBb.Rf()) == null || (c386100FBwLIZJ = c385670FAfRf.LIZJ()) == null) {
            FrameLayout frameLayout = this.LLLIIL;
            if (frameLayout == null) {
                frameLayout = null;
            }
            int top = frameLayout.getTop();
            FrameLayout frameLayout2 = this.LLLIIL;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            bottom = (top + frameLayout2.getBottom()) / 2.0f;
            ViewGroup.LayoutParams layoutParams = getTextStickerView().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams.topMargin;
            }
        } else {
            int i2 = c386100FBwLIZJ.LIZIZ;
            int bottom2 = this.LLILZLL.getBottom();
            ViewGroup viewGroup = this.LLLILZLLLI;
            int height = bottom2 - (viewGroup != null ? viewGroup.getHeight() : 0);
            View view = this.LLLIZZ;
            int height2 = (height - (view != null ? view.getHeight() : 0)) - i2;
            View view2 = this.LLLJIL;
            if (view2 == null) {
                view2 = null;
            }
            bottom = (height2 + view2.getBottom()) / 2.0f;
            ViewGroup.LayoutParams layoutParams2 = getTextStickerView().getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i = marginLayoutParams2.topMargin;
            }
        }
        float f = bottom + i;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        (c1664680tQA != null ? c1664680tQA : null).LIZLLL(new AwS21S0100001_5(f, this, 3), true);
    }

    public final void LJJIIZI() {
        Scene sceneLIZ;
        Activity activity;
        Window window;
        WindowManager.LayoutParams attributes;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = this.LLLILZJ;
        if (viewGroup == null || viewGroup.getLayoutParams() == null || (sceneLIZ = C0EBE.LIZ(this)) == null || (activity = sceneLIZ.mActivity) == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null || attributes.softInputMode != 32) {
            return;
        }
        int iLIZ = this.LLJJIJIL;
        if (iLIZ == 0 && (iLIZ = C388240FKc.LIZ()) == 0) {
            iLIZ = getDefaultKeyboardHeight();
        }
        ViewGroup viewGroup2 = this.LLLILZJ;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.bottomMargin = iLIZ;
    }

    public final void LJJIJL() {
        InterfaceC388390FKr textStickerEditViewTextTemplateApi;
        if (!LJIL()) {
            if (this.LLLLILI) {
                this.LLLLILI = false;
            } else if (!LJJIFFI() && !LJIILIIL()) {
                float stickerInitTranslationY = getStickerInitTranslationY();
                C385340F8y animTextStickerView = getAnimTextStickerView();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(animTextStickerView);
                animTextStickerView.setTranslationY(stickerInitTranslationY);
                C1664680tQA<TextStickerModel> c1664680tQA = this.LLLI;
                if (c1664680tQA == null) {
                    c1664680tQA = null;
                }
                BaseStickerModel baseStickerModel = c1664680tQA.LIZ.getBaseStickerModel();
                C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLI;
                if (c1664680tQA2 == null) {
                    c1664680tQA2 = null;
                }
                c1664680tQA2.LIZLLL(new AwS21S0100001_5(baseStickerModel, stickerInitTranslationY, 5), true);
                setAnimStickerViewVisible(true);
                setTextStickerViewVisible(false);
                C385340F8y animTextStickerView2 = getAnimTextStickerView();
                C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLLI;
                if (c1664680tQA3 == null) {
                    c1664680tQA3 = null;
                }
                BaseStickerModel baseStickerModel2 = c1664680tQA3.LIZ.getBaseStickerModel();
                C1664680tQA<TextStickerModel> c1664680tQA4 = this.LLLI;
                if (c1664680tQA4 == null) {
                    c1664680tQA4 = null;
                }
                float scale = c1664680tQA4.LIZ.getBaseStickerModel().getScale() * this.LLIZ.getScaleY();
                C1664680tQA<TextStickerModel> c1664680tQA5 = this.LLLI;
                if (c1664680tQA5 == null) {
                    c1664680tQA5 = null;
                }
                BaseStickerModel baseStickerModelCopy$default = BaseStickerModel.copy$default(baseStickerModel2, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, c1664680tQA5.LIZ.getBaseStickerModel().getTranslateX() * this.LLIZ.getScaleX(), 0.0f, scale, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -10485761, 15, null);
                C1664680tQA<TextStickerModel> c1664680tQA6 = this.LLLFZ;
                LJIIIZ(animTextStickerView2, baseStickerModelCopy$default, BaseStickerModel.copy$default((c1664680tQA6 != null ? c1664680tQA6 : null).LIZ.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -16777217, 15, null));
                if (getConfig().LIZJ) {
                    LJJII(false);
                    return;
                }
                return;
            }
        }
        setTextStickerViewVisible(true);
        setAnimStickerViewVisible(false);
        float stickerInitTranslationY2 = getStickerInitTranslationY();
        C385340F8y animTextStickerView3 = getAnimTextStickerView();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(animTextStickerView3);
        animTextStickerView3.setTranslationY(stickerInitTranslationY2);
        C1664680tQA<TextStickerModel> c1664680tQA7 = this.LLLI;
        if (c1664680tQA7 == null) {
            c1664680tQA7 = null;
        }
        BaseStickerModel baseStickerModel3 = c1664680tQA7.LIZ.getBaseStickerModel();
        C1664680tQA<TextStickerModel> c1664680tQA8 = this.LLLI;
        if (c1664680tQA8 == null) {
            c1664680tQA8 = null;
        }
        c1664680tQA8.LIZLLL(new AwS21S0100001_5(baseStickerModel3, stickerInitTranslationY2, 4), true);
        C817403Hg c817403Hg = new C817403Hg();
        if (this.LLLLJI) {
            c817403Hg.element = 1.0f;
            this.LLLLJI = false;
        }
        if (LJIILIIL()) {
            LJJIIZ();
            C0FGA textStickerPlayer = getTextStickerPlayer();
            if (textStickerPlayer != null) {
                C1664680tQA<TextStickerModel> c1664680tQA9 = this.LLLFZ;
                if (c1664680tQA9 == null) {
                    c1664680tQA9 = null;
                }
                textStickerPlayer.LJI(c1664680tQA9.LIZ, new AwS549S0100000_5(this, 1630));
            }
        }
        Function0<Unit> function0 = this.LLJZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LLJZ = null;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getAlphaView(), "alpha", c817403Hg.element, 1.0f);
        objectAnimatorOfFloat.setDuration(this.LLJJJJJIL);
        objectAnimatorOfFloat.addListener(new AAListenerS260S0200000_5(this, c817403Hg, 0));
        C786410Ut5.Pd(objectAnimatorOfFloat);
        C0FSC c0fsc = this.LLLLIIL;
        if (c0fsc != null) {
            c0fsc.LIZLLL(!LJIL());
        }
        if (!LJJIFFI()) {
            if (getConfig().LIZJ) {
                LJJII(false);
                return;
            }
            return;
        }
        C1664680tQA<TextStickerModel> c1664680tQA10 = this.LLLFZ;
        if (c1664680tQA10 == null) {
            c1664680tQA10 = null;
        }
        LJJII(!c1664680tQA10.LIZ.getTextTemplateModel().fromInspirationPanel);
        if (this.LLJJIJIL == 0 || (textStickerEditViewTextTemplateApi = getTextStickerEditViewTextTemplateApi()) == null) {
            return;
        }
        int i = this.LLJJIJIL;
        C1664680tQA<TextStickerModel> c1664680tQA11 = this.LLLFZ;
        textStickerEditViewTextTemplateApi.LLZLI(false, i, (c1664680tQA11 != null ? c1664680tQA11 : null).LIZ.getTextTemplateModel(), null, new AwS584S0100000_5(this, 1165));
    }

    public final void LJJIL() {
        ViewGroup viewGroup;
        View childAt;
        View view = this.LLLIZZ;
        if (view != null) {
            C426750GoL.LJIIL(view, null, null, null, 0, 23);
        }
        ViewGroup viewGroup2 = this.LLLILZLLLI;
        if (viewGroup2 != null && viewGroup2.getChildCount() > 0 && (viewGroup = this.LLLILZLLLI) != null && (childAt = viewGroup.getChildAt(0)) != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
            childAt.setBackground(c384050F3z.LIZ(getDarkContext()));
        }
        AbstractC388250FKd abstractC388250FKd = (AbstractC388250FKd) getAbilityContainer().LIZJ(C13LE.LIZ(AbstractC388250FKd.class));
        if (abstractC388250FKd != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, getDarkContext());
            abstractC388250FKd.LJIIIIZZ(numLIZJ != null ? numLIZJ.intValue() : -16777216);
        }
        getAbilityContainer().LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(570), true);
    }

    public final C388200FJy getAbilityContainer() {
        return (C388200FJy) this.LLLLIILLL.getValue();
    }

    public final InterfaceC390170FRn getAddYoursStickerService() {
        return (InterfaceC390170FRn) this.LLJJI.getValue();
    }

    @Override // X.AbstractC390720FTq
    public View getAlphaView() {
        ViewGroup viewGroup = this.LLLILZJ;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    public final C0FK0 getConfig() {
        return (C0FK0) this.LLJJ.getValue();
    }

    public final C0FPH getEditTextAction() {
        return (C0FPH) this.LLJZIJLIL.getValue();
    }

    public final C1664680tQA<C387990FJd> getEditViewTextStickerEditState() {
        return (C1664680tQA) this.LLJJIJI.getValue();
    }

    public final InterfaceC386690FEd getGetVeEditor() {
        return (InterfaceC386690FEd) this.LLJILLL.getValue();
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationY() {
        FrameLayout frameLayout = this.LLLIIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        int top = frameLayout.getTop();
        return ((top + (this.LLLIIL != null ? r0 : null).getBottom()) / 2) - ((getTop() + getBottom()) / 2);
    }

    @Override // X.AbstractC390720FTq
    public float getStickerInitTranslationY() {
        float height = this.LLIZ.getHeight() / 2;
        TextStickerModel textStickerModel = this.LLLIL;
        if (textStickerModel == null) {
            textStickerModel = null;
        }
        return (((height + textStickerModel.getBaseStickerModel().getTranslateY()) * this.LLIZ.getScaleY()) - (getHeight() / 2)) + getContainerOffsetY();
    }

    public final InterfaceC388390FKr getTextStickerEditViewTextTemplateApi() {
        return (InterfaceC388390FKr) this.LLLFFI.getValue();
    }

    public final C0FGA getTextStickerPlayer() {
        return (C0FGA) this.LLLLII.getValue();
    }

    public final C0FF8 getTextStickerService() {
        return (C0FF8) this.LLJILJILJ.getValue();
    }

    public final C385340F8y getTextStickerView() {
        return (C385340F8y) this.LLLIIII.getValue();
    }

    private final C0FKS getSizeBarAbilityApi() {
        return (C0FKS) getAbilityContainer().LIZJ(C13LE.LIZ(C0FKS.class));
    }

    @Override // X.AbstractC390720FTq
    public final void LIZIZ() {
        C0FGR c0fgrLIZJ;
        LJJIII();
        LJJIJIL();
        C0FGA textStickerPlayer = getTextStickerPlayer();
        if (textStickerPlayer != null) {
            textStickerPlayer.LIZJ();
        }
        C0FGA textStickerPlayer2 = getTextStickerPlayer();
        if (textStickerPlayer2 != null) {
            textStickerPlayer2.recycleEngine();
        }
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1632);
        AwS549S0100000_5 awS549S0100000_52 = new AwS549S0100000_5(this, 1631);
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (c1664680tQA.LIZ.isVERenderSticker()) {
            C01TT.LIZJ(new AwS406S0200000_5(awS549S0100000_52, awS549S0100000_5, 160));
        } else {
            awS549S0100000_52.invoke();
        }
        C0FF8 c0ff8 = getAbilityContainer().LJFF;
        if (c0ff8 == null || (c0fgrLIZJ = c0ff8.LIZJ()) == null) {
            return;
        }
        long j = this.LLJJJIL;
        long j2 = this.LLJJJJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
        c0fgrLIZJ.LJJIII(j, j2, jCurrentTimeMillis, C0F8Y.LJIIIIZZ((c1664680tQA2 != null ? c1664680tQA2 : null).LIZ));
    }

    public final boolean LJIILIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableTextInput: ");
        sbLIZ.append(LJJ());
        sbLIZ.append(' ');
        sbLIZ.append(LJJI());
        sbLIZ.append(' ');
        sbLIZ.append(getAbilityContainer().LJIL);
        sbLIZ.append(' ');
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        sbLIZ.append(c1664680tQA.LIZ.getForceEffectRender());
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ != null);
        C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
        if (!LJJ() && !LJJI() && !getAbilityContainer().LJIL) {
            C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
            if (!(c1664680tQA2 != null ? c1664680tQA2 : null).LIZ.getForceEffectRender()) {
                return false;
            }
        }
        return this.LLJJLIIIJLLLLLLLZ != null;
    }

    public final void LJIILJJIL() {
        getSoftKeyBoardListener().LIZ();
        LIZ(getTextStickerView());
        C0FKP c0fkp = this.LLJLL;
        if (c0fkp != null) {
            c0fkp.LIZJ = C387990FJd.LIZ(c0fkp.LIZIZ.LJIIJ.LIZ, null, null, null, null, null, null, 63);
            c0fkp.LIZLLL = true;
        }
        C0FKN c0fkn = (C0FKN) getAbilityContainer().LIZJ(C13LE.LIZ(C0FKN.class));
        this.LLJJJJLIIL = c0fkn != null ? c0fkn.LJIIIIZZ() : false;
    }

    public final void LJIJJ() {
        InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        C0FF8 c0ff8 = getAbilityContainer().LJFF;
        if (c0ff8 == null || (interfaceC388160FJuLJIIJ = c0ff8.LJIIJ()) == null) {
            return;
        }
        interfaceC388160FJuLJIIJ.LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL() {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388170FJv.LJJIIJZLJL():void");
    }

    public final void LJJIJIL() {
        if (!LJIILIIL() || getAbilityContainer().LJ.LIZ.getEnable()) {
            return;
        }
        getAbilityContainer().LJ.LIZLLL(AFwS234S0000000_5.get$arr$(577), true);
    }

    public final String getRecommentAYText() {
        String strLJJIFFI;
        C0FKN c0fkn = (C0FKN) getAbilityContainer().LIZJ(C13LE.LIZ(C0FKN.class));
        boolean z = c0fkn != null && c0fkn.LJIIJ();
        C0FKM c0fkm = (C0FKM) getAbilityContainer().LIZJ(C13LE.LIZ(C0FKM.class));
        boolean z2 = c0fkm != null && c0fkm.LJIIIZ();
        if (!getConfig().LJJ.LJ || (!z && !z2)) {
            return a0.LJLIIIL(getAbilityContainer().LJ.LIZ.getTextStr()).toString();
        }
        String string = a0.LJLIIIL(getAbilityContainer().LJ.LIZ.getTextStr()).toString();
        if (z) {
            strLJJIFFI = string;
            for (MentionSpanData mentionSpanData : C0FMX.LIZJ(C2204961BRm.G(getTextStickerView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/ZIWQRTRl9aeopi+cKXIZl+XK/2okSrjqQBtENwQ==", null)))) {
                String str = mentionSpanData.text;
                if (str != null) {
                    strLJJIFFI = u.LJJIFFI(string, str, " ", false);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Replace the mention in the text with a space, and the text after the replacement is：");
            sbLIZ.append(strLJJIFFI);
            C388320FKk.LIZ.i(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            strLJJIFFI = string;
        }
        if (z2) {
            for (HashtagSpanData hashtagSpanData : C0FMV.LIZIZ(C2204961BRm.G(getTextStickerView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/ZIWQRTRl9aeopi+cKXIZl+XK/2okSrjqQBtENwQ==", null)))) {
                String str2 = hashtagSpanData.text;
                if (str2 != null) {
                    strLJJIFFI = u.LJJIFFI(string, str2, " ", false);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Replace the hashtag in the text with a space, and the text after the replacement is：");
            sbLIZ2.append(strLJJIFFI);
            C388320FKk.LIZ.i(C2188811AlT.LIZIZ(sbLIZ2));
        }
        String str3 = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL(strLJJIFFI, new String[]{" "}, 0, 6));
        return str3 != null ? str3 : strLJJIFFI;
    }

    @Override // X.AbstractC390720FTq
    public float getStickerContainerTranslationX() {
        return ((getTextStickerView().getLeft() + getTextStickerView().getRight()) / 2) - ((getLeft() + getRight()) / 2);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !getConfig().LJIILJJIL;
    }

    private final View getTextContainer() {
        return this.LLLILZLLLI;
    }

    public final C0FWO getApi() {
        return this.LLLFF;
    }

    public final Pair<Integer, Integer> getCenterPoint() {
        return this.LLLLIILL;
    }

    public final int getLastOpenKeyBoardHeight() {
        return this.LLJJIJIL;
    }

    public final long getShowTime() {
        return this.LLJJJ;
    }

    public final C0FSC getStickerEditListener() {
        return this.LLLLIIL;
    }

    public final C1664680tQA<C0FKT> getTextStickerEditNotPanelState() {
        return this.LLJJIJIIJIL;
    }

    public static final void LJJIJLIJ(C388170FJv c388170FJv) {
        String textStr;
        C388180FJw c388180FJw = c388170FJv.LLLFF;
        C1664680tQA<TextStickerModel> c1664680tQA = c388170FJv.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        TextStickerModel textStickerModel = c1664680tQA.LIZ;
        if (textStickerModel.getTextTemplateModel().isGroupTextTemplates) {
            SubTemplateInfo subTemplateInfo = (SubTemplateInfo) C13LP.LJJJLZIJ(textStickerModel.getCompatModel().getSelectSlotIndex(), textStickerModel.getCompatModel().getSubTemplates());
            if (subTemplateInfo == null || (textStr = subTemplateInfo.text) == null) {
                textStr = "";
            }
        } else {
            textStr = textStickerModel.getTextStr();
        }
        c388180FJw.y4(textStr, EnumC1409650mmp.TEXT_STICKER);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZ(EditText editText) {
        if (LJIILIIL() && getConfig().LJJIJ) {
            InterfaceC385890FBb interfaceC385890FBb = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385890FBb != null) {
                interfaceC385890FBb.LJLZ();
                return;
            }
            return;
        }
        super.LIZ(editText);
    }

    @Override // X.AbstractC390720FTq
    public final void LIZLLL(int i) {
        int iMax;
        EnumC388580FLk enumC388580FLkS4;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ2;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        Object parent = getParent();
        C1664680tQA<TextStickerModel> c1664680tQA = null;
        if ((parent instanceof View) && (view = (View) parent) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            iMax = Math.max(0, i - i2);
        } else {
            iMax = i;
        }
        ViewGroup viewGroup = this.LLLILZJ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        marginLayoutParams2.bottomMargin = iMax;
        ViewGroup viewGroup2 = this.LLLILZJ;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        C786410Ut5.X5(marginLayoutParams2, viewGroup2);
        ViewGroup viewGroup3 = this.LLLILZJ;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        viewGroup3.requestLayout();
        if (i > 0) {
            if (this.LLJJIJIL == 0 && LJJIFFI()) {
                C0FF8 textStickerService = getTextStickerService();
                if (textStickerService != null && (interfaceC388160FJuLJIIJ2 = textStickerService.LJIIJ()) != null) {
                    enumC388580FLkS4 = interfaceC388160FJuLJIIJ2.S4();
                } else {
                    enumC388580FLkS4 = null;
                }
                EnumC388580FLk enumC388580FLk = EnumC388580FLk.ONLY_EDITOR;
                if (enumC388580FLkS4 == enumC388580FLk) {
                    C0FF8 textStickerService2 = getTextStickerService();
                    if (textStickerService2 != null && (interfaceC388160FJuLJIIJ = textStickerService2.LJIIJ()) != null) {
                        interfaceC388160FJuLJIIJ.LIZJ(new AnonymousClass1150(i, enumC388580FLk, true, false, false, 116));
                    }
                    InterfaceC388390FKr textStickerEditViewTextTemplateApi = getTextStickerEditViewTextTemplateApi();
                    if (textStickerEditViewTextTemplateApi != null) {
                        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
                        if (c1664680tQA2 != null) {
                            c1664680tQA = c1664680tQA2;
                        }
                        textStickerEditViewTextTemplateApi.LLZLI(false, i, c1664680tQA.LIZ.getTextTemplateModel(), null, new AwS584S0100000_5(this, 1171));
                    }
                }
            }
            this.LLJJIJIL = i;
            Keva.getRepo("STUDIO_KEYBOARD_HEIGHT_HELPER").storeInt("HEIGHT", i);
        }
    }

    @Override // X.AbstractC390720FTq
    public final void LJI(int i) {
        FrameLayout frameLayout = this.LLLIIL;
        FrameLayout frameLayout2 = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        marginLayoutParams.bottomMargin = i + this.LLJLLIL;
        FrameLayout frameLayout3 = this.LLLIIL;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        C786410Ut5.a6(frameLayout2, marginLayoutParams);
    }

    @Override // X.AbstractC390720FTq
    public final void LJII(EditText editText) {
        if (LJIILIIL()) {
            C0F8J.LIZ("inspiration", "show textInput from openKeyboard");
            C786410Ut5.T5(getTextStickerView(), 0.0f);
            InterfaceC385890FBb interfaceC385890FBb = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385890FBb != null) {
                interfaceC385890FBb.WD0();
            }
            View textContainer = getTextContainer();
            if (textContainer != null) {
                C786410Ut5.T4(textContainer, 0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getTextContainer(), "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(this.LLJJJJJIL);
                C786410Ut5.Pd(objectAnimatorOfFloat);
            }
            InterfaceC385890FBb interfaceC385890FBb2 = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385890FBb2 != null) {
                interfaceC385890FBb2.pe0();
                return;
            }
            return;
        }
        InterfaceC385890FBb interfaceC385890FBb3 = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC385890FBb3 != null) {
            interfaceC385890FBb3.Co2();
        }
        editText.requestFocus();
        KeyboardUtils.LIZIZ(this.LLILZ, editText);
    }

    public final void LJIILL(EnumC1409650mmp enumC1409650mmp) {
        getAbilityContainer().LJIJJ = enumC1409650mmp;
        getAbilityContainer().LJIJJLI = true;
        LJIILJJIL();
        getSoftKeyBoardListener().LIZ();
        getSoftKeyBoardListener().LLILLL = 0;
        C0FKH c0fkh = getAbilityContainer().LJJ;
        if (c0fkh != null) {
            c0fkh.LJIIIZ(enumC1409650mmp);
        }
        LJIIJ(AFwS191S0000000_5.get$arr$(412), false, false);
    }

    public final void LJIIZILJ(boolean z) {
        EnumC388580FLk enumC388580FLkS4;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ2;
        EnumC388580FLk enumC388580FLkS42;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ3;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ4;
        C0FF8 c0ff8 = getAbilityContainer().LJFF;
        if (c0ff8 != null && (interfaceC388160FJuLJIIJ4 = c0ff8.LJIIJ()) != null) {
            enumC388580FLkS4 = interfaceC388160FJuLJIIJ4.S4();
        } else {
            enumC388580FLkS4 = null;
        }
        if (enumC388580FLkS4 != EnumC388580FLk.ONLY_PANEL) {
            C0FF8 c0ff82 = getAbilityContainer().LJFF;
            if (c0ff82 != null && (interfaceC388160FJuLJIIJ3 = c0ff82.LJIIJ()) != null) {
                enumC388580FLkS42 = interfaceC388160FJuLJIIJ3.S4();
            } else {
                enumC388580FLkS42 = null;
            }
            if (enumC388580FLkS42 != EnumC388580FLk.PANEL_EDITOR) {
                return;
            }
        }
        if (z) {
            C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            if (c1664680tQA.LIZ.getTextTemplateModel().isHint) {
                C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
                if (c1664680tQA2 == null) {
                    c1664680tQA2 = null;
                }
                c1664680tQA2.LIZ.setTextTemplateModel(new TextTemplateModel(null, false, false, false, null, false, false, false, null, null, null, false, false, null, null, 0, null, false, false, false, false, null, null, false, false, 0, null, null, 268435455, null));
            }
            C0FGA textStickerPlayer = getTextStickerPlayer();
            if (textStickerPlayer != null) {
                textStickerPlayer.LLZLLLL();
            }
            C0FF8 c0ff83 = getAbilityContainer().LJFF;
            if (c0ff83 != null && (interfaceC388160FJuLJIIJ2 = c0ff83.LJIIJ()) != null) {
                interfaceC388160FJuLJIIJ2.LLZLLLL();
            }
        }
        C0FF8 c0ff84 = getAbilityContainer().LJFF;
        if (c0ff84 != null && (interfaceC388160FJuLJIIJ = c0ff84.LJIIJ()) != null) {
            interfaceC388160FJuLJIIJ.LJFF();
        }
        this.LLLLILI = true;
        this.LLLLJI = true;
        C786410Ut5.c2(getTextStickerView(), 0);
        getTextStickerView().setEnabled(true);
        C385340F8y textStickerView = getTextStickerView();
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLLFZ;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        textStickerView.setText(c1664680tQA3.LIZ.getTextStr());
        C385340F8y textStickerView2 = getTextStickerView();
        C1664680tQA<TextStickerModel> c1664680tQA4 = this.LLLFZ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        textStickerView2.setSelection(c1664680tQA4.LIZ.getTextStr().length());
        getSoftKeyBoardListener().LLILLL = 0;
        LJII(getTextStickerView());
        C0FKS c0fks = (C0FKS) getAbilityContainer().LIZJ(C13LE.LIZ(C0FKS.class));
        if (c0fks != null) {
            c0fks.LJIIJ(true);
        }
        C0FKS c0fks2 = (C0FKS) getAbilityContainer().LIZJ(C13LE.LIZ(C0FKS.class));
        if (c0fks2 != null) {
            c0fks2.LJIIIIZZ();
        }
        getAbilityContainer().LJIIJ.LIZLLL(new AwS584S0100000_5(this, 1169), true);
        getSoftKeyBoardListener().LIZIZ(this);
    }

    public final String LJIJ(String str) {
        if (a0.LJJJIL(str)) {
            return str;
        }
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        TextStickerModel textStickerModel = c1664680tQA.LIZ;
        if (Intrinsics.LJFF(textStickerModel.getCompatModel().getShowPunctuation(), Boolean.FALSE)) {
            str = C385050F7v.LJI().LIZ(str);
        }
        int i = C384270F4v.LIZ[textStickerModel.getCompatModel().getCapitalizationState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return C385050F7v.LIZJ(str);
                }
                return str;
            }
            return str.toLowerCase(Locale.ROOT);
        }
        return str.toUpperCase(Locale.ROOT);
    }

    public final void LJIJI(String str) {
        EnumC388580FLk enumC388580FLkS4;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ2;
        InterfaceC388160FJu interfaceC388160FJuLJIIJ3;
        C0FF8 c0ff8 = getAbilityContainer().LJFF;
        C1664680tQA<TextStickerModel> c1664680tQA = null;
        if (c0ff8 != null && (interfaceC388160FJuLJIIJ3 = c0ff8.LJIIJ()) != null) {
            enumC388580FLkS4 = interfaceC388160FJuLJIIJ3.S4();
        } else {
            enumC388580FLkS4 = null;
        }
        if (enumC388580FLkS4 == EnumC388580FLk.ONLY_EDITOR) {
            return;
        }
        C0FF8 textStickerService = getTextStickerService();
        if (textStickerService != null && (interfaceC388160FJuLJIIJ2 = textStickerService.LJIIJ()) != null) {
            C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
            if (c1664680tQA2 == null) {
                c1664680tQA2 = null;
            }
            interfaceC388160FJuLJIIJ2.Gc(str, C0F8Y.LJIIL(c1664680tQA2.LIZ));
        }
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLLFZ;
        if (c1664680tQA3 != null) {
            c1664680tQA = c1664680tQA3;
        }
        if (c1664680tQA.LIZ.getTextTemplateModel().enableTextTemplate) {
            C0FF8 c0ff82 = getAbilityContainer().LJFF;
            if (c0ff82 != null && (interfaceC388160FJuLJIIJ = c0ff82.LJIIJ()) != null) {
                interfaceC388160FJuLJIIJ.LIZJ(new AnonymousClass1150(this.LLJJIJIL, EnumC388580FLk.PANEL_EDITOR, false, false, false, 124));
                return;
            }
            return;
        }
        getAbilityContainer().LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(573), true);
        LJJII(false);
        LJIIZILJ(false);
    }

    public final void LJJII(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needTranslationConfigView ");
        sbLIZ.append(z);
        C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            View view = this.LLLIZZ;
            if (view != null) {
                C786410Ut5.ed(view, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
                return;
            }
            return;
        }
        View view2 = this.LLLIZZ;
        if (view2 == null) {
            return;
        }
        C786410Ut5.ed(view2, 0.0f);
    }

    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    public final void LJJIIJ(int i) {
        if (this.LLLLJ) {
            this.LLLLJ = false;
            return;
        }
        this.LLL = false;
        LIZLLL(i);
        if (this.LLLLIL) {
            this.LLLLIL = false;
        } else {
            LJJIJL();
        }
    }

    public final void LJJIZ(TextStickerModel textStickerModel) {
        this.LLLIL = textStickerModel.deepCopy();
        getAbilityContainer().LJJI = textStickerModel.getBaseStickerModel().getScale();
        this.LLLF = true;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLFZ;
        C1664680tQA<TextStickerModel> c1664680tQA2 = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS584S0100000_5(textStickerModel, 1167), true);
        this.LLLF = false;
        setTextStickerViewVisible(false);
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLLI;
        if (c1664680tQA3 != null) {
            c1664680tQA2 = c1664680tQA3;
        }
        c1664680tQA2.LIZLLL(new AwS584S0100000_5(textStickerModel, 1168), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC390720FTq, X.InterfaceC1391500mJY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZI(int r10) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388170FJv.LJZI(int):void");
    }

    public final void setAlsOCContainer(C1DRG c1drg) {
        if (c1drg != null) {
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC385890FBb) c1drg.LJIIL(null, InterfaceC385890FBb.class);
        }
    }

    public final void setAnimStickerViewVisible(boolean z) {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLI;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS20S0010000_5(z, 69), true);
    }

    public final void setCenterPoint(Pair<Integer, Integer> pair) {
        this.LLLLIILL = pair;
    }

    public final void setLastOpenKeyBoardHeight(int i) {
        this.LLJJIJIL = i;
    }

    public final void setStickerEditListener(C0FSC c0fsc) {
        this.LLLLIIL = c0fsc;
    }

    public final void setTextStickerViewVisible(boolean z) {
        int i;
        FrameLayout frameLayout = this.LLLIIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJZ(i, frameLayout);
    }

    public final void setUpdateModel(boolean z) {
        this.LLLF = z;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        InterfaceC388330FKl interfaceC388330FKl = this.LLJJL;
        if (interfaceC388330FKl != null) {
            interfaceC388330FKl.LJIIJJI(visibility, i);
        }
    }

    public final void setVisibilityChangeListener(InterfaceC388330FKl interfaceC388330FKl) {
        this.LLJJL = interfaceC388330FKl;
    }

    public final void LJJIJIIJI(int i, int i2) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3 = this.LLLIIL;
        FrameLayout frameLayout4 = null;
        if (frameLayout3 == null) {
            frameLayout = null;
            frameLayout3 = null;
        } else {
            frameLayout = frameLayout3;
        }
        int paddingTop = frameLayout3.getPaddingTop();
        FrameLayout frameLayout5 = this.LLLIIL;
        if (frameLayout5 == null) {
            frameLayout5 = null;
        }
        frameLayout.setPadding(i, paddingTop, i2, frameLayout5.getPaddingBottom());
        FrameLayout frameLayout6 = this.LLLJL;
        if (frameLayout6 == null) {
            frameLayout2 = null;
            frameLayout6 = null;
        } else {
            frameLayout2 = frameLayout6;
        }
        int paddingTop2 = frameLayout6.getPaddingTop();
        FrameLayout frameLayout7 = this.LLLJL;
        if (frameLayout7 != null) {
            frameLayout4 = frameLayout7;
        }
        frameLayout2.setPadding(i, paddingTop2, i2, frameLayout4.getPaddingBottom());
        C0FKS sizeBarAbilityApi = getSizeBarAbilityApi();
        if (sizeBarAbilityApi != null) {
            sizeBarAbilityApi.LJIIJJI(i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(final long r14, X.C388340FKm r16) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C388170FJv.LJJIJIIJIL(long, X.0FKm):void");
    }

    public final void LJIIJ(Function0 function0, boolean z, boolean z2) {
        getTextStickerView().setEnabled(z);
        C1664680tQA<TextStickerModel> c1664680tQA = null;
        if (z) {
            ViewPropertyAnimator viewPropertyAnimatorScaleY = getTextStickerView().animate().scaleX(1.0f).scaleY(1.0f);
            C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
            if (c1664680tQA2 != null) {
                c1664680tQA = c1664680tQA2;
            }
            viewPropertyAnimatorScaleY.rotationBy(-c1664680tQA.LIZ.getBaseStickerModel().getRotation()).setDuration(100L).setListener(new ALAdapterS0S0220000_5(this, z, z2, function0, 0)).start();
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = getTextStickerView().animate();
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLLFZ;
        if (c1664680tQA3 == null) {
            c1664680tQA3 = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(c1664680tQA3.LIZ.getBaseStickerModel().getScale());
        C1664680tQA<TextStickerModel> c1664680tQA4 = this.LLLFZ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorScaleY2 = viewPropertyAnimatorScaleX.scaleY(c1664680tQA4.LIZ.getBaseStickerModel().getScale());
        C1664680tQA<TextStickerModel> c1664680tQA5 = this.LLLFZ;
        if (c1664680tQA5 != null) {
            c1664680tQA = c1664680tQA5;
        }
        viewPropertyAnimatorScaleY2.rotationBy(c1664680tQA.LIZ.getBaseStickerModel().getRotation()).setDuration(100L).setListener(new ALAdapterS0S0220000_5(this, z, z2, function0, 1)).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v63, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.0tQB] */
    /* JADX WARN: Type inference failed for: r0v73, types: [X.0FKA] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r117v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r124v0, types: [X.0FJv, X.0FTq, android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4, types: [X.0tQA] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r16v3, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r16v4, types: [X.0tQA] */
    /* JADX WARN: Type inference failed for: r16v6, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v30, types: [X.0FKr] */
    /* JADX WARN: Type inference failed for: r2v33, types: [X.0tQB] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v99 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.bytedance.tux.input.TuxTextView] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference failed for: r4v17, types: [com.bytedance.als.ui.state.LiveState, com.bytedance.als.ui.state.LiveState<STATE>] */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.bytedance.als.ui.state.LiveState] */
    /* JADX WARN: Type inference failed for: r4v20, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIJJLI(TextStickerModel textStickerModel, C0FKI c0fki, LifecycleOwner lifecycleOwner) {
        InterfaceC390170FRn addYoursStickerService;
        C0FL9 c0fl9;
        C0FKH c0fkh;
        C0FLH c0flh;
        C0FLH c0flh2;
        InterfaceC390170FRn addYoursStickerService2;
        boolean zLJIJ;
        int iLJIIZILJ;
        View view;
        this.LLLIL = textStickerModel.deepCopy();
        FrameLayout frameLayout = null;
        this.LLLFZ = new C1664680tQA<>(TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2122317823, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, true, true, false, true, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, TextStickerCompatModel.copy$default(textStickerModel.getCompatModel(), false, false, null, null, null, null, null, null, null, false, null, null, null, 0, new ArrayList(textStickerModel.getCompatModel().getSubTemplates()), 0.0f, null, null, null, null, null, 2080767, null), -11266, 32767, null));
        FrameLayout frameLayout2 = null;
        this.LLLI = new C1664680tQA<>(TextStickerModel.copy$default(textStickerModel, BaseStickerModel.copy$default(textStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2122317823, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -11266, 65535, null));
        this.LLLII = lifecycleOwner;
        this.LLLILZ = c0fki;
        C786410Ut5.Sd(R.layout.fsm, C786410Ut5.ne(this.LLILZ), this);
        this.LLLIZZ = findViewById(R.id.w4t);
        this.LLLILZJ = (ViewGroup) findViewById(R.id.xm8);
        C0FF8 textStickerService = getTextStickerService();
        if (textStickerService == null || !textStickerService.LJIJ()) {
            this.LLLILZLLLI = (ViewGroup) findViewById(R.id.xoc);
        }
        this.LLLJIL = findViewById(R.id.y1z);
        this.LLLIIL = (FrameLayout) findViewById(R.id.w4v);
        int iLIZLLL = C0JAI.LIZLLL(this.LLILZ) + C1919207fS.LJ();
        View view2 = this.LLLJIL;
        if (view2 == null) {
            view2 = null;
        }
        ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).topMargin = iLIZLLL;
        FrameLayout frameLayout3 = this.LLLIIL;
        if (frameLayout3 != null) {
            frameLayout2 = frameLayout3;
        }
        Integer num = null;
        C426750GoL.LJIIIZ(frameLayout2, null, Integer.valueOf(iLIZLLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))), null, null, false, 29);
        setTextStickerViewVisible(false);
        FrameLayout frameLayout4 = new FrameLayout(this.LLILZ);
        this.LLLJL = frameLayout4;
        addView(frameLayout4, new FrameLayout.LayoutParams(-1, -1));
        this.LLLIILIL = (TuxTextView) findViewById(R.id.tv_sure);
        C786410Ut5.T4(getAlphaView(), 0.0f);
        if (getAbilityContainer().LJIIIZ.LJIL.LIZ) {
            getSoftKeyBoardListener().LIZJ();
        }
        if (getAbilityContainer().LJIIIZ.LJJ.LIZ && (view = this.LLLIZZ) != null) {
            num = null;
            C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 23);
        }
        if (getAbilityContainer().LJIIIZ.LJIL.LIZ && C387980FJc.LIZ(this.LLILZ)) {
            TuxTextView tuxTextView = this.LLLIILIL;
            ?? r12 = tuxTextView;
            if (tuxTextView == null) {
                r12 = num;
            }
            C426750GoL.LJIIIZ(r12, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), num, 0, false, 21);
            Object obj = this.LLLIILIL;
            if (obj == null) {
                obj = num;
            }
            num = num;
            C426750GoL.LJIIL(obj, num, 0, num, num, 29);
        }
        if (getAbilityContainer().LJIIIZ.LJJ.LIZIZ) {
            num = num;
            C426750GoL.LJIIL(findViewById(R.id.w4t), num, num, num, 0, 23);
            findViewById(R.id.ih4).getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
            findViewById(R.id.e8b).getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        }
        if (getAbilityContainer().LJIIIZ.LJJIIJ) {
            C0FF8 textStickerService2 = getTextStickerService();
            if (textStickerService2 != null) {
                iLJIIZILJ = textStickerService2.LJIIZILJ();
            } else {
                iLJIIZILJ = 0;
            }
            int iLIZIZ = iLJIIZILJ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            if (iLIZIZ > 0) {
                FrameLayout frameLayout5 = this.LLLIIL;
                if (frameLayout5 != null) {
                    frameLayout = frameLayout5;
                }
                C426750GoL.LJIIIZ(frameLayout, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + iLIZIZ), num, num, false, 29);
                Object obj2 = this.LLLJIL;
                if (obj2 == null) {
                    obj2 = num;
                }
                C426750GoL.LJIIIZ(obj2, num, Integer.valueOf(iLIZIZ), num, num, false, 29);
            }
            Integer num2 = num;
            num = num;
            C426750GoL.LJIIIZ(findViewById(R.id.ip3), num2, 0, num, num, false, 29);
        }
        C388200FJy abilityContainer = getAbilityContainer();
        C0FKP c0fkp = new C0FKP(getAbilityContainer());
        this.LLJLL = c0fkp;
        abilityContainer.LIZLLL(c0fkp);
        FrameLayout frameLayout6 = this.LLLIIL;
        ?? r122 = frameLayout6;
        if (frameLayout6 == null) {
            r122 = num;
        }
        C388200FJy abilityContainer2 = getAbilityContainer();
        C390420FSm c390420FSm = abilityContainer.LIZ;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LLLI;
        ?? r15 = c1664680tQA;
        if (c1664680tQA == null) {
            r15 = num;
        }
        Object obj3 = this.LLLJL;
        if (obj3 == null) {
            obj3 = num;
        }
        abilityContainer.LIZLLL(new C0FK3(r122, abilityContainer2, c390420FSm, r15, obj3));
        abilityContainer.LIZLLL(new C0FJZ((ViewGroup) findViewById(R.id.ya9), getAbilityContainer(), (RecyclerView) findViewById(R.id.ip3)));
        C388270FKf c388270FKfLIZJ = abilityContainer.LJIIIIZZ.LIZJ((ViewGroup) findViewById(R.id.ih4), getAbilityContainer(), abilityContainer.LJIIIZ);
        if (c388270FKfLIZJ != null) {
            abilityContainer.LIZLLL(c388270FKfLIZJ);
        }
        abilityContainer.LIZLLL(new C0FHA((ViewGroup) findViewById(R.id.w4t), getAbilityContainer()));
        if (abilityContainer.LJIIIZ.LJIIIZ && !abilityContainer.LJ.LIZ.getAutoAdaptCanvas()) {
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.xqe);
            C388200FJy abilityContainer3 = getAbilityContainer();
            C0FF8 c0ff8 = abilityContainer.LJFF;
            if (c0ff8 != null) {
                zLJIJ = c0ff8.LJIJ();
            } else {
                zLJIJ = false;
            }
            boolean zLJIJJLI = this.LLIZLLLIL.LJIJJLI();
            Object obj4 = this.LLLIIL;
            if (obj4 == null) {
                obj4 = num;
            }
            abilityContainer.LIZLLL(new C388700FLw(viewGroup, abilityContainer3, zLJIJ, zLJIJJLI, obj4));
        }
        abilityContainer.LIZLLL(new C388370FKp((ViewGroup) findViewById(R.id.nat), getAbilityContainer()));
        if (abilityContainer.LJIIIZ.LIZJ) {
            abilityContainer.LIZLLL(new C388210FJz(this, getTextStickerView(), getAbilityContainer(), getSoftKeyBoardListener(), abilityContainer.LJ));
            FrameLayout frameLayout7 = this.LLLIIL;
            ?? r8 = frameLayout7;
            if (frameLayout7 == null) {
                r8 = num;
            }
            C0FHG c0fhg = new C0FHG(r8, this.LLILZLL, getTextStickerPlayer(), getAbilityContainer());
            abilityContainer.LIZLLL(c0fhg);
            C0F8J.LIZ("inspiration", "register TextTemplateBorderAbility,borderAbility : " + c0fhg + " stickerPlayer: " + getTextStickerPlayer());
        }
        List<C0FTJ<StickerModel>> stickerList = getStickerList();
        if ((stickerList instanceof Collection) && stickerList.isEmpty()) {
            if (Keva.getRepo("text_suggest_ay").getInt("count", 0) >= 10) {
                C0FLW c0flw = new C0FLW((ViewGroup) findViewById(R.id.xm2), getAbilityContainer());
                this.LLJLILLLLZIIL = c0flw;
                abilityContainer.LIZLLL(c0flw);
            } else {
                C0FLW c0flw2 = new C0FLW((ViewGroup) findViewById(R.id.xm2), getAbilityContainer());
                this.LLJLILLLLZIIL = c0flw2;
                abilityContainer.LIZLLL(c0flw2);
            }
        } else {
            Iterator<C0FTJ<StickerModel>> it2 = stickerList.iterator();
            while (it2.hasNext()) {
                if (it2.next().getStickerType() == EnumC1466150oFx.ADD_YOURS) {
                    break;
                }
            }
            if ((Keva.getRepo("text_suggest_ay").getInt("count", 0) >= 10 || getConfig().LJJ.LJ) && !getConfig().LJI.invoke().booleanValue() && (addYoursStickerService2 = getAddYoursStickerService()) != null && addYoursStickerService2.LJIIIZ()) {
                C0FLW c0flw22 = new C0FLW((ViewGroup) findViewById(R.id.xm2), getAbilityContainer());
                this.LLJLILLLLZIIL = c0flw22;
                abilityContainer.LIZLLL(c0flw22);
            }
        }
        C0FLH c0flh3 = getAbilityContainer().LJIILL;
        if (c0flh3 != null && c0flh3.LLLLLJLJLL()) {
            abilityContainer.LIZLLL(new C0FLB((ViewGroup) findViewById(R.id.o7v), (ViewGroup) findViewById(R.id.w4t), getAbilityContainer()));
        }
        if (getConfig().LJJ.LIZLLL && ((((addYoursStickerService = getAddYoursStickerService()) != null && addYoursStickerService.LJIIIZ()) || (((c0fl9 = getAbilityContainer().LJIJI) != null && c0fl9.LIZ()) || (((c0fkh = getAbilityContainer().LJJ) != null && c0fkh.LIZJ()) || getConfig().LJJ.LJFF))) && (c0flh = getAbilityContainer().LJIILL) != null && c0flh.LLLLLJLJLL() && (c0flh2 = getAbilityContainer().LJIILL) != null && c0flh2.LIZ())) {
            abilityContainer.LIZLLL(new C0FL5((ViewGroup) findViewById(R.id.cdh), getAbilityContainer()));
        }
        if (abilityContainer.LJIIIZ.LJJ.LIZJ) {
            abilityContainer.LIZLLL(new C0FLR((ViewGroup) findViewById(R.id.jh7), getAbilityContainer()));
        }
        if (getConfig().LIZJ) {
            Object obj5 = this.LLLFZ;
            if (obj5 == null) {
                obj5 = num;
            }
            ViewGroup viewGroup2 = this.LLLILZJ;
            ?? r4 = viewGroup2;
            if (viewGroup2 == null) {
                r4 = num;
            }
            final C0FGA textStickerPlayer = getTextStickerPlayer();
            final AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5((C388170FJv) this, 1650);
            final AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5((C388170FJv) this, 1182);
            final C238400w2 c238400w2 = new C238400w2();
            final C817403Hg c817403Hg = new C817403Hg();
            final C817403Hg c817403Hg2 = new C817403Hg();
            final C013C c013c = new C013C();
            final ?? r16 = obj5;
            r4.setOnTouchListener(new View.OnTouchListener() { // from class: X.0F4F
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    TextTemplateParams textTemplateParamsLIZ;
                    if (motionEvent.getAction() == 0) {
                        c817403Hg.element = motionEvent.getRawX();
                        c817403Hg2.element = motionEvent.getRawY();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C238400w2 c238400w22 = c238400w2;
                        if (jCurrentTimeMillis - c238400w22.element > 1000) {
                            c013c.element = true;
                            c238400w22.element = System.currentTimeMillis();
                        }
                        return true;
                    }
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return false;
                    }
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        c013c2.element = false;
                        r16.LIZ.getTextTemplateModel();
                        if (textStickerPlayer != null && r16.LIZ.getTextTemplateModel().enableTextTemplate) {
                            Rect rectInvoke = awS549S0100000_5.invoke();
                            if (rectInvoke == null) {
                                awS584S0100000_5.invoke(Boolean.FALSE);
                                return true;
                            }
                            int iWidth = rectInvoke.width();
                            int iHeight = rectInvoke.height();
                            if (iHeight != 0) {
                                C0FGA c0fga = textStickerPlayer;
                                if (c0fga != null && (textTemplateParamsLIZ = c0fga.LIZ()) != null) {
                                    Function1<Boolean, Unit> function1 = awS584S0100000_5;
                                    C817403Hg c817403Hg3 = c817403Hg;
                                    C817403Hg c817403Hg4 = c817403Hg2;
                                    List<Double> list = textTemplateParamsLIZ.bounding_box;
                                    if (list.size() == 4) {
                                        if (((Number) ListProtector.get(list, 3)).doubleValue() != ((Number) ListProtector.get(list, 1)).doubleValue() && ((Number) ListProtector.get(list, 0)).doubleValue() != ((Number) ListProtector.get(list, 2)).doubleValue()) {
                                            RectF rectF = new RectF();
                                            rectF.left = C363400EMo.LIZJ((float) ((Number) ListProtector.get(list, 0)).doubleValue());
                                            rectF.top = C363400EMo.LIZLLL((float) ((Number) ListProtector.get(list, 1)).doubleValue());
                                            rectF.right = C363400EMo.LIZJ((float) ((Number) ListProtector.get(list, 2)).doubleValue());
                                            rectF.bottom = C363400EMo.LIZLLL((float) ((Number) ListProtector.get(list, 3)).doubleValue());
                                            float f = rectF.left;
                                            float f2 = iWidth;
                                            float f3 = (f * f2) + rectInvoke.left;
                                            float f4 = iHeight;
                                            float f5 = (rectF.top * f4) + rectInvoke.top;
                                            int iAbs = (int) Math.abs((rectF.right - f) * f2);
                                            int iAbs2 = (int) Math.abs((rectF.bottom - rectF.top) * f4);
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onTouch: left = ");
                                            sbLIZ.append(f3);
                                            sbLIZ.append(", top = ");
                                            sbLIZ.append(f5);
                                            sbLIZ.append(", width = ");
                                            sbLIZ.append(iAbs);
                                            sbLIZ.append(", height = ");
                                            sbLIZ.append(iAbs2);
                                            C0F8J.LIZ("Debug-F VETextStickerClickHelper", C2188811AlT.LIZIZ(sbLIZ));
                                            float f6 = c817403Hg3.element;
                                            if (f6 > f3 && f6 < f3 + iAbs) {
                                                float f7 = c817403Hg4.element;
                                                if (f7 > f5 && f7 < f5 + iAbs2) {
                                                    function1.invoke(Boolean.TRUE);
                                                    return true;
                                                }
                                            }
                                            function1.invoke(Boolean.FALSE);
                                            return true;
                                        }
                                        function1.invoke(Boolean.FALSE);
                                        return true;
                                    }
                                } else {
                                    awS584S0100000_5.invoke(Boolean.FALSE);
                                    return true;
                                }
                            } else {
                                awS584S0100000_5.invoke(Boolean.FALSE);
                                return true;
                            }
                        } else {
                            awS584S0100000_5.invoke(Boolean.FALSE);
                        }
                    }
                    return true;
                }
            });
            C0FHG c0fhg2 = (C0FHG) getAbilityContainer().LIZJ(C13LE.LIZ(C0FHG.class));
            if (c0fhg2 != null) {
                c0fhg2.LJIIIZ.add(new AwS584S0100000_5((C388170FJv) this, 1183));
            }
        } else {
            ViewGroup viewGroup3 = this.LLLILZJ;
            ?? r3 = viewGroup3;
            if (viewGroup3 == null) {
                r3 = num;
            }
            C786410Ut5.K7(r3, new ACListenerS140S0100000_5(this, 155));
        }
        TuxTextView tuxTextView2 = this.LLLIILIL;
        ?? r32 = tuxTextView2;
        if (tuxTextView2 == null) {
            r32 = num;
        }
        C786410Ut5.h9(r32, new ACListenerS140S0100000_5(this, 156));
        if (getConfig().LJJIJ) {
            C14K9.LJIJJ(this, new C0F76(new C0F77() { // from class: X.0FKO
                @Override // X.C0F77
                public final void El(int i, boolean z) {
                    ViewGroup viewGroup4 = this.LL.LLLILZJ;
                    ViewGroup viewGroup5 = null;
                    if (viewGroup4 == null) {
                        viewGroup4 = null;
                    }
                    viewGroup4.getLayoutParams().height = this.LL.getHeight() - i;
                    ViewGroup viewGroup6 = this.LL.LLLILZJ;
                    if (viewGroup6 != null) {
                        viewGroup5 = viewGroup6;
                    }
                    viewGroup5.requestLayout();
                }
            }));
        }
        LifecycleOwner lifecycleOwner2 = this.LLLII;
        ?? r0 = lifecycleOwner2;
        if (lifecycleOwner2 == null) {
            r0 = num;
        }
        r0.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tools.sticker.common.text.TextStickerEditView$initObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                EnumC388580FLk enumC388580FLkS4;
                InterfaceC388160FJu interfaceC388160FJuLJIIJ;
                InterfaceC388160FJu interfaceC388160FJuLJIIJ2;
                InterfaceC388160FJu interfaceC388160FJuLJIIJ3;
                if (C08CQ.LIZ[event.ordinal()] == 1 && this.LL.getVisibility() == 0) {
                    C0FF8 textStickerService3 = this.LL.getTextStickerService();
                    EnumC388580FLk enumC388580FLkS42 = null;
                    if (textStickerService3 != null && (interfaceC388160FJuLJIIJ3 = textStickerService3.LJIIJ()) != null) {
                        enumC388580FLkS4 = interfaceC388160FJuLJIIJ3.S4();
                    } else {
                        enumC388580FLkS4 = null;
                    }
                    if (enumC388580FLkS4 != EnumC388580FLk.PANEL_EDITOR) {
                        C0FF8 textStickerService4 = this.LL.getTextStickerService();
                        if (textStickerService4 != null && (interfaceC388160FJuLJIIJ2 = textStickerService4.LJIIJ()) != null) {
                            enumC388580FLkS42 = interfaceC388160FJuLJIIJ2.S4();
                        }
                        if (enumC388580FLkS42 != EnumC388580FLk.ONLY_EDITOR) {
                            C388170FJv c388170FJv = this.LL;
                            c388170FJv.LIZ(c388170FJv.getTextStickerView());
                            return;
                        }
                    }
                    C0FF8 textStickerService5 = this.LL.getTextStickerService();
                    if (textStickerService5 == null || (interfaceC388160FJuLJIIJ = textStickerService5.LJIIJ()) == null) {
                        return;
                    }
                    interfaceC388160FJuLJIIJ.LJJIL();
                }
            }
        });
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LLLFZ;
        ?? r02 = c1664680tQA2;
        if (c1664680tQA2 == null) {
            r02 = num;
        }
        ?? r42 = r02.LJI;
        LifecycleOwner lifecycleOwner3 = this.LLLII;
        ?? r33 = lifecycleOwner3;
        if (lifecycleOwner3 == null) {
            r33 = num;
        }
        r42.LJIIIZ(r33, Lifecycle.State.STARTED, new AwS584S0100000_5((C388170FJv) this, 1184));
        ?? textStickerEditViewTextTemplateApi = getTextStickerEditViewTextTemplateApi();
        if (textStickerEditViewTextTemplateApi != 0) {
            textStickerEditViewTextTemplateApi.LLZZ(new InterfaceC388360FKo() { // from class: X.0FKA
                @Override // X.InterfaceC388360FKo
                public final void LIZ() {
                    C0FHG c0fhg3 = (C0FHG) this.LIZ.getAbilityContainer().LIZJ(C13LE.LIZ(C0FHG.class));
                    if (c0fhg3 != null) {
                        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LIZ.LLLFZ;
                        if (c1664680tQA3 == null) {
                            c1664680tQA3 = null;
                        }
                        c0fhg3.LJIIJJI(c1664680tQA3.LIZ);
                    }
                }
            });
        }
        getTextStickerView().addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 19));
        C1664680tQA<TextStickerModel> c1664680tQA3 = this.LLLFZ;
        ?? r2 = c1664680tQA3;
        if (c1664680tQA3 == null) {
            r2 = num;
        }
        ?? LIZ = r2.LIZ(new C2217371BqR() { // from class: X.0F8t
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj6) {
                return ((TextStickerModel) obj6).getTextTemplateModel();
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj6, Object obj7) {
                ((TextStickerModel) obj6).setTextTemplateModel((TextTemplateModel) obj7);
            }
        });
        LifecycleOwner lifecycleOwner4 = this.LLLII;
        ?? r34 = lifecycleOwner4;
        if (lifecycleOwner4 == null) {
            r34 = num;
        }
        LIZ.LJIIIZ(r34, Lifecycle.State.STARTED, new AwS584S0100000_5((C388170FJv) this, 1185));
    }

    public C388170FJv(Context context, C390420FSm c390420FSm, FrameLayout frameLayout, FrameLayout frameLayout2) {
        super(context, null, 0);
        this.LLILZ = context;
        this.LLILZIL = c390420FSm;
        this.LLILZLL = frameLayout;
        this.LLIZ = frameLayout2;
        this.LLIZLLLIL = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
        this.LLJ = ((InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LJIILLIIL();
        this.LLJI = ((InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LJIL();
        this.LLJIJIL = ((InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class))).LJIIJ();
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1639));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1644));
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1643));
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1645));
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1634));
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1651));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(411));
        this.LLJJIJIIJIL = new C1664680tQA<>(new C0FKT(0));
        this.LLJJJJJIL = 300L;
        this.LLJLIL = new TextPaint();
        this.LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1635));
        this.LLLFF = new C388180FJw(this);
        this.LLLFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1640));
        this.LLLIIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1646));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1636));
        this.LLLIIIL = new AwS584S0100000_5(this, 1164);
        this.LLLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1642));
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1652));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1633));
    }

    public static final void LJIIJJI(C388170FJv c388170FJv, boolean z, boolean z2, Function0<Unit> function0) {
        int i;
        int i2;
        C388200FJy abilityContainer = c388170FJv.getAbilityContainer();
        if (z) {
            abilityContainer.LJIIJ.LIZLLL(new AwS584S0100000_5(c388170FJv, 1166), true);
        } else {
            InterfaceC385890FBb interfaceC385890FBb = c388170FJv.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385890FBb != null) {
                interfaceC385890FBb.Co2();
            }
            abilityContainer.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(571), true);
        }
        AbstractC388140FJs abstractC388140FJs = (AbstractC388140FJs) abilityContainer.LIZJ(C13LE.LIZ(AbstractC388140FJs.class));
        if (abstractC388140FJs != null) {
            abstractC388140FJs.LJIIL(z);
        }
        C0FKS c0fks = (C0FKS) abilityContainer.LIZJ(C13LE.LIZ(C0FKS.class));
        if (c0fks != null) {
            c0fks.LJIIJ(z);
        }
        AbstractC388260FKe abstractC388260FKe = (AbstractC388260FKe) abilityContainer.LIZJ(C13LE.LIZ(AbstractC388260FKe.class));
        if (abstractC388260FKe != null) {
            abstractC388260FKe.LJIIJJI(z);
        }
        View view = c388170FJv.LLLJIL;
        if (view == null) {
            view = null;
        }
        int i3 = 4;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJLLLLLL(i, view);
        if (z2) {
            View viewFindViewById = c388170FJv.findViewById(R.id.boe);
            if (z) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
        } else {
            C786410Ut5.LJLLLLLL(0, c388170FJv.findViewById(R.id.boe));
        }
        View viewFindViewById2 = c388170FJv.findViewById(R.id.xqd);
        if (z) {
            i3 = 0;
        }
        C786410Ut5.LJLLLLLL(i3, viewFindViewById2);
        if (!c388170FJv.LJIILIIL()) {
            C786410Ut5.c2(c388170FJv.getTextStickerView(), 0);
            C786410Ut5.T5(c388170FJv.getTextStickerView(), 1.0f);
        }
        function0.invoke();
    }
}
