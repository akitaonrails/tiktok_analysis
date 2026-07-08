package Y;

import X.C1157430gE1;
import X.C1167000gTS;
import X.C1167020gTU;
import X.C1167200gTm;
import X.C1171680gb0;
import X.C1172290gbz;
import X.C1173060gdE;
import X.C11NZ;
import X.C12ES;
import X.C1462920oAk;
import X.C1631480sYc;
import X.C1632520saI;
import X.C1652620t6i;
import X.C1658150tFd;
import X.C1665030tQj;
import X.C1701940uOG;
import X.C418440Gaw;
import X.C418740GbQ;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1159860gHw;
import X.InterfaceC1441305kZ;
import X.InterfaceC1623190sLF;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.bytedance.als.h0;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReuseAwemeTTSAndVCRefIDsModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.recorder.exit.p;
import com.ss.android.ugc.gamora.recorder.exit.x1;
import com.ss.android.ugc.gamora.recorder.progress.c;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import nv7.c0;

/* JADX INFO: loaded from: classes19.dex */
public class AObjectS244S0100000_18 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
        }
    }

    public AObjectS244S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        ((Function1) aObjectS244S0100000_18.l0).invoke(obj);
    }

    public static final void onChanged$1(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        int iP2;
        Boolean bool = (Boolean) obj;
        TabHost tabHost = ((C1167000gTS) aObjectS244S0100000_18.l0).LLJILJILJ;
        TabHost tabHost2 = null;
        if (tabHost == null) {
            tabHost = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tabHost.getLayoutParams();
        if (bool.booleanValue()) {
            iP2 = (c0.LIZ.p2() - ((int) C12ES.LIZJ(40.0f, ((C1167000gTS) aObjectS244S0100000_18.l0).requireActivity()))) / 2;
        } else {
            iP2 = 0;
        }
        marginLayoutParams.bottomMargin = iP2;
        TabHost tabHost3 = ((C1167000gTS) aObjectS244S0100000_18.l0).LLJILJILJ;
        if (tabHost3 != null) {
            tabHost2 = tabHost3;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tabHost2);
        tabHost2.setLayoutParams(marginLayoutParams);
    }

    public static final void onChanged$10(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        InterfaceC1623190sLF interfaceC1623190sLFU;
        C11NZ<EnumC1159860gHw> c11nzLi;
        q stickerApiComponent = ((C1632520saI) aObjectS244S0100000_18.l0).getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1623190sLFU = stickerApiComponent.U()) != null && (c11nzLi = interfaceC1623190sLFU.li()) != null) {
            c11nzLi.LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS187S0100000_18((C1632520saI) aObjectS244S0100000_18.l0, 44));
        }
    }

    public static final void onChanged$11(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((Function0) aObjectS244S0100000_18.l0).invoke();
        }
    }

    public static final void onChanged$12(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        boolean z = ((C1652620t6i) obj).LIZIZ;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        if (z) {
            ((p) aObjectS244S0100000_18.l0).LLILZIL.LJII(new Pair<>(fValueOf, fValueOf2));
        } else {
            ((p) aObjectS244S0100000_18.l0).LLILZIL.LJII(new Pair<>(fValueOf2, fValueOf));
        }
    }

    public static final void onChanged$13(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((p) aObjectS244S0100000_18.l0).d5(true);
        } else {
            ((p) aObjectS244S0100000_18.l0).d5(false);
        }
    }

    public static final void onChanged$14(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        Boolean bool = (Boolean) obj;
        if (((p) aObjectS244S0100000_18.l0).getPlanCUIApiComponent().xu0()) {
            ((p) aObjectS244S0100000_18.l0).d5(false);
        } else {
            ((p) aObjectS244S0100000_18.l0).d5(bool.booleanValue());
        }
    }

    public static final void onChanged$15(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C418740GbQ c418740GbQ = ((x1) aObjectS244S0100000_18.l0).LLJJ;
            if (c418740GbQ == null) {
                c418740GbQ = null;
            }
            c418740GbQ.setImageDrawable(drawable);
        }
    }

    public static final void onChanged$16(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            C418740GbQ c418740GbQ = ((x1) aObjectS244S0100000_18.l0).LLJJ;
            C418740GbQ c418740GbQ2 = null;
            if (c418740GbQ == null) {
                c418740GbQ = null;
            }
            C12ES.LIZ(c418740GbQ);
            AlphaAnimation alphaAnimation = new AlphaAnimation(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
            alphaAnimation.setDuration(150L);
            C418740GbQ c418740GbQ3 = ((x1) aObjectS244S0100000_18.l0).LLJJ;
            if (c418740GbQ3 != null) {
                c418740GbQ2 = c418740GbQ3;
            }
            c418740GbQ2.startAnimation(alphaAnimation);
        }
    }

    public static final void onChanged$17(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        C418740GbQ c418740GbQ = ((x1) aObjectS244S0100000_18.l0).LLJJ;
        C418740GbQ c418740GbQ2 = null;
        if (c418740GbQ == null) {
            c418740GbQ = null;
        }
        if (!C1462920oAk.LIZJ(c418740GbQ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), 0)) {
            C418740GbQ c418740GbQ3 = ((x1) aObjectS244S0100000_18.l0).LLJJ;
            if (c418740GbQ3 == null) {
                c418740GbQ3 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c418740GbQ3.getLayoutParams();
            marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(((x1) aObjectS244S0100000_18.l0).mActivity) + ((x1) aObjectS244S0100000_18.l0).getResources().getDimensionPixelSize(R.dimen.adk);
            C418740GbQ c418740GbQ4 = ((x1) aObjectS244S0100000_18.l0).LLJJ;
            if (c418740GbQ4 != null) {
                c418740GbQ2 = c418740GbQ4;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418740GbQ2);
            c418740GbQ2.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void onChanged$18(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        Object first = ((Pair) obj).getFirst();
        x1 x1Var = (x1) aObjectS244S0100000_18.l0;
        Function2<View, String, Unit> function2 = x1Var.LLJI.LIZIZ;
        C418740GbQ c418740GbQ = x1Var.LLJJ;
        if (c418740GbQ == null) {
            c418740GbQ = null;
        }
        function2.invoke(c418740GbQ, (String) first);
    }

    public static final void onChanged$19(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        if (((c) aObjectS244S0100000_18.l0).LLJJI.LIZJ() != null) {
            h0<Boolean> h0Var = ((c) aObjectS244S0100000_18.l0).LLJJI;
            h0Var.LJII(Boolean.valueOf(Intrinsics.LJFF(h0Var.LIZJ(), Boolean.TRUE)));
        }
    }

    public static final void onChanged$2(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        boolean z = ((C1652620t6i) obj).LIZIZ;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        if (z) {
            ((C1173060gdE) aObjectS244S0100000_18.l0).LLILZIL.LJII(new Pair<>(fValueOf, fValueOf2));
        } else {
            ((C1173060gdE) aObjectS244S0100000_18.l0).LLILZIL.LJII(new Pair<>(fValueOf2, fValueOf));
        }
    }

    public static final void onChanged$20(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        InterfaceC1623190sLF interfaceC1623190sLFU;
        C11NZ<EnumC1159860gHw> c11nzLi;
        q stickerApiComponent = ((c) aObjectS244S0100000_18.l0).getStickerApiComponent();
        if (stickerApiComponent != null && (interfaceC1623190sLFU = stickerApiComponent.U()) != null && (c11nzLi = interfaceC1623190sLFU.li()) != null) {
            ((c) aObjectS244S0100000_18.l0).LLLI.LIZ(c11nzLi.LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25((c) aObjectS244S0100000_18.l0, 57)));
        }
    }

    public static final void onChanged$21(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        ((c) aObjectS244S0100000_18.l0).K4(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$22(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        ((c) aObjectS244S0100000_18.l0).W1(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$23(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        C11NZ<EnumC1159860gHw> c11nzLi;
        InterfaceC1623190sLF interfaceC1623190sLFU = ((C1631480sYc) aObjectS244S0100000_18.l0).nq().U();
        if (interfaceC1623190sLFU != null && (c11nzLi = interfaceC1623190sLFU.li()) != null) {
            c11nzLi.LJL(C1701940uOG.LIZIZ()).LJJLJLI(new AfS187S0100000_18((C1631480sYc) aObjectS244S0100000_18.l0, 45));
        }
    }

    public static final void onChanged$24(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        CreativeModel creativeModel;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        ShortVideoContext shortVideoContext = ((C1172290gbz) aObjectS244S0100000_18.l0).getShortVideoContext();
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel) != null) {
            reuseAwemeTTSAndVCRefIDsModel.curMusicTTSRedIDs = new ArrayList<>();
        }
    }

    public static final void onChanged$25(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        String musicId;
        CreativeModel creativeModel;
        ReuseAwemeTTSAndVCRefIDsModel reuseAwemeTTSAndVCRefIDsModel;
        if (((Boolean) obj).booleanValue()) {
            ShortVideoContext shortVideoContext = ((C1172290gbz) aObjectS244S0100000_18.l0).getShortVideoContext();
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (reuseAwemeTTSAndVCRefIDsModel = creativeModel.reuseAwemeTTSAndVCRefIDsModel) != null && Intrinsics.LJFF(reuseAwemeTTSAndVCRefIDsModel.originMusicRemoveTTS, Boolean.TRUE)) {
                return;
            }
            C1172290gbz c1172290gbz = (C1172290gbz) aObjectS244S0100000_18.l0;
            ShortVideoContext shortVideoContext2 = c1172290gbz.getShortVideoContext();
            if (shortVideoContext2 != null) {
                musicId = shortVideoContext2.getMusicId();
            } else {
                musicId = null;
            }
            c1172290gbz.LLILZ = musicId;
            ((C1172290gbz) aObjectS244S0100000_18.l0).qc();
        }
    }

    public static final void onChanged$26(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((Function0) aObjectS244S0100000_18.l0).invoke();
        }
    }

    public static final void onChanged$27(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        if (!((Boolean) obj).booleanValue() && !((C1665030tQj) aObjectS244S0100000_18.l0).LJJIJIIJIL()) {
            ((C1665030tQj) aObjectS244S0100000_18.l0).LLIZLLLIL.setValue(null);
        }
    }

    public static final void onChanged$28(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        ((C1665030tQj) aObjectS244S0100000_18.l0).LLILLJJLI.setValue(C1157430gE1.LIZ);
    }

    public static final void onChanged$29(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        C1658150tFd.LIZIZ(((C1171680gb0) aObjectS244S0100000_18.l0).LL, "DmLoadingScene");
    }

    public static final void onChanged$3(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        Boolean bool = (Boolean) obj;
        if (((C1173060gdE) aObjectS244S0100000_18.l0).getPlanCUIApiComponent().xu0()) {
            ((C1173060gdE) aObjectS244S0100000_18.l0).Z1(false);
        } else {
            ((C1173060gdE) aObjectS244S0100000_18.l0).Z1(bool.booleanValue());
        }
    }

    public static final void onChanged$4(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C418740GbQ c418740GbQ = ((C1167200gTm) aObjectS244S0100000_18.l0).LLJILLL;
            if (c418740GbQ == null) {
                c418740GbQ = null;
            }
            c418740GbQ.setImageDrawable(drawable);
        }
    }

    public static final void onChanged$5(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            C418740GbQ c418740GbQ = ((C1167200gTm) aObjectS244S0100000_18.l0).LLJILLL;
            C418740GbQ c418740GbQ2 = null;
            if (c418740GbQ == null) {
                c418740GbQ = null;
            }
            C12ES.LIZ(c418740GbQ);
            AlphaAnimation alphaAnimation = new AlphaAnimation(((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
            alphaAnimation.setDuration(150L);
            C418740GbQ c418740GbQ3 = ((C1167200gTm) aObjectS244S0100000_18.l0).LLJILLL;
            if (c418740GbQ3 != null) {
                c418740GbQ2 = c418740GbQ3;
            }
            c418740GbQ2.startAnimation(alphaAnimation);
        }
    }

    public static final void onChanged$6(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        C418740GbQ c418740GbQ = ((C1167200gTm) aObjectS244S0100000_18.l0).LLJILLL;
        C418740GbQ c418740GbQ2 = null;
        if (c418740GbQ == null) {
            c418740GbQ = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c418740GbQ.getLayoutParams();
        marginLayoutParams.topMargin = ScreenUtils.getStatusBarHeight(((C1167200gTm) aObjectS244S0100000_18.l0).mActivity) + ((C1167200gTm) aObjectS244S0100000_18.l0).getResources().getDimensionPixelSize(R.dimen.adk);
        C418740GbQ c418740GbQ3 = ((C1167200gTm) aObjectS244S0100000_18.l0).LLJILLL;
        if (c418740GbQ3 != null) {
            c418740GbQ2 = c418740GbQ3;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418740GbQ2);
        c418740GbQ2.setLayoutParams(marginLayoutParams);
    }

    public static final void onChanged$7(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        int statusBarHeight;
        Boolean bool = (Boolean) obj;
        RelativeLayout relativeLayout = ((C1167020gTU) aObjectS244S0100000_18.l0).LLJILLL;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            relativeLayout = null;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (bool.booleanValue()) {
            statusBarHeight = ScreenUtils.getStatusBarHeight(((C1167020gTU) aObjectS244S0100000_18.l0).requireActivity());
        } else {
            statusBarHeight = 0;
        }
        layoutParams.topMargin = statusBarHeight;
        RelativeLayout relativeLayout3 = ((C1167020gTU) aObjectS244S0100000_18.l0).LLJILLL;
        if (relativeLayout3 != null) {
            relativeLayout2 = relativeLayout3;
        }
        C786410Ut5.e6(relativeLayout2, layoutParams);
    }

    public static final void onChanged$8(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        int iP2;
        Boolean bool = (Boolean) obj;
        RelativeLayout relativeLayout = ((C1167020gTU) aObjectS244S0100000_18.l0).LLJILJILJ;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            relativeLayout = null;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        if (bool.booleanValue()) {
            iP2 = c0.LIZ.p2();
        } else {
            iP2 = 0;
        }
        layoutParams.bottomMargin = iP2;
        RelativeLayout relativeLayout3 = ((C1167020gTU) aObjectS244S0100000_18.l0).LLJILJILJ;
        if (relativeLayout3 != null) {
            relativeLayout2 = relativeLayout3;
        }
        C786410Ut5.e6(relativeLayout2, layoutParams);
    }

    public static final void onChanged$9(AObjectS244S0100000_18 aObjectS244S0100000_18, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        RelativeLayout relativeLayout = ((C1167020gTU) aObjectS244S0100000_18.l0).LLJILLL;
        RelativeLayout relativeLayout2 = null;
        if (relativeLayout == null) {
            relativeLayout = null;
        }
        int i2 = 0;
        if (bool.booleanValue()) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LLIIL(relativeLayout, i);
        RelativeLayout relativeLayout3 = ((C1167020gTU) aObjectS244S0100000_18.l0).LLJILJILJ;
        if (relativeLayout3 != null) {
            relativeLayout2 = relativeLayout3;
        }
        if (!bool.booleanValue()) {
            i2 = 4;
        }
        C786410Ut5.LLIIL(relativeLayout2, i2);
    }
}
