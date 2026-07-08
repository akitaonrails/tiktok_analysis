package Y;

import X.AbstractC19563811gS;
import X.AnonymousClass1141;
import X.AnonymousClass1142;
import X.C0N0Z;
import X.C1051900dTo;
import X.C11A3;
import X.C11A9;
import X.C11AF;
import X.C11AS;
import X.C11AT;
import X.C12QW;
import X.C12QX;
import X.C12UW;
import X.C1428470nHB;
import X.C14ZZ;
import X.C15RW;
import X.C19353610ne;
import X.C19398810uw;
import X.C19399210v0;
import X.C194329111b;
import X.C19456511Ad;
import X.C19456611Ae;
import X.C19561611g6;
import X.C19659311vr;
import X.C19659511vt;
import X.C19673011y4;
import X.C1C7U;
import X.C545820Lau;
import X.C786410Ut5;
import X.InterfaceC661730PxT;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget;
import com.ss.android.ugc.aweme.interest.InterestReselectionService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.EditRepeatMusicPlayer;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS110S0201000_29;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS40S0101000_29 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (C1428470nHB.LJJZZI(((C19659311vr) this.l0).getEditModel())) {
            long createTime = ((C19659311vr) this.l0).getEditModel().creativeModel.onThisDayData.getCreateTime();
            C19659311vr c19659311vr = (C19659311vr) this.l0;
            Activity activity = c19659311vr.mActivity;
            if (activity == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            C19659511vt c19659511vt = new C19659511vt(createTime, activity, c19659311vr.LLLII());
            c19659511vt.LIZJ(new AwS110S0201000_29((C19659311vr) this.l0, this.i1, c19659511vt, 0));
            return;
        }
        if (((C19659311vr) this.l0).getEditModel().creativeModel.onThisDayData.getForwardType() == 3 || ((C19659311vr) this.l0).getEditModel().creativeModel.onThisDayData.getForwardType() == 2) {
            long createTime2 = ((C19659311vr) this.l0).getEditModel().creativeModel.onThisDayData.getCreateTime();
            C19659311vr c19659311vr2 = (C19659311vr) this.l0;
            Activity activity2 = c19659311vr2.mActivity;
            if (activity2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            C19659511vt c19659511vt2 = new C19659511vt(createTime2, activity2, c19659311vr2.LLLII());
            c19659511vt2.LIZJ(new AwS395S0200000_29((C19659311vr) this.l0, c19659511vt2, 2));
            return;
        }
        long createTime3 = ((C19659311vr) this.l0).getEditModel().creativeModel.onThisDayData.getCreateTime();
        C19659311vr c19659311vr3 = (C19659311vr) this.l0;
        Activity activity3 = c19659311vr3.mActivity;
        if (activity3 == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C19659511vt c19659511vt3 = new C19659511vt(createTime3, activity3, c19659311vr3.LLLII());
        c19659511vt3.LIZJ(new AwS395S0200000_29((C19659311vr) this.l0, c19659511vt3, 3));
    }

    public final void LIZ$1() {
        C11A3 c11a3;
        C11AS c11as = (C11AS) this.l0;
        if (c11as.LJ || !c11as.LIZ.isPlaying()) {
            return;
        }
        int currentPosition = ((C11AS) this.l0).LIZ.getCurrentPosition();
        if (currentPosition >= this.i1) {
            ((C11AS) this.l0).LIZ.stop();
            ((C11AS) this.l0).LIZ();
            return;
        }
        C19456511Ad c19456511Ad = ((C11AS) this.l0).LIZJ;
        if (c19456511Ad != null && (c11a3 = (C11A3) c19456511Ad.LIZ.findSceneByTag("count_down")) != null) {
            C15RW c15rw = c11a3.LLJI;
            if (c15rw == null) {
                c15rw = null;
            }
            c15rw.setProgress(currentPosition);
        }
        C786410Ut5.LJJZZIII(((C11AS) this.l0).LIZIZ, this);
    }

    public final void LIZ$2() {
        C11A9 c11a9;
        C11AT c11at = (C11AT) this.l0;
        if (c11at.LJ || !c11at.LIZ.isPlaying()) {
            return;
        }
        int currentPosition = ((C11AT) this.l0).LIZ.getCurrentPosition();
        if (currentPosition >= this.i1) {
            ((C11AT) this.l0).LIZ.stop();
            ((C11AT) this.l0).LIZ();
            return;
        }
        C19456611Ae c19456611Ae = ((C11AT) this.l0).LIZJ;
        if (c19456611Ae != null && (c11a9 = (C11A9) c19456611Ae.LIZ.findSceneByTag("count_down")) != null) {
            C11AF c11af = c11a9.LLJIJIL;
            if (c11af == null) {
                c11af = null;
            }
            c11af.setProgress(currentPosition);
        }
        C786410Ut5.LJJZZIII(((C11AT) this.l0).LIZIZ, this);
    }

    public final void LIZ$3() {
        C11A9 c11a9 = (C11A9) this.l0;
        if (c11a9.LLJL == null) {
            Context contextLIZIZ = C545820Lau.LIZIZ(c11a9);
            if (contextLIZIZ == null) {
                return;
            } else {
                ((C11A9) this.l0).LLJL = new C1051900dTo(contextLIZIZ);
            }
        }
        C11A9 c11a92 = (C11A9) this.l0;
        C1051900dTo c1051900dTo = c11a92.LLJL;
        if (c1051900dTo != null) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.i1 != 3 ? 10 : 3);
            c1051900dTo.LIZIZ(0, 2000, c11a92.getString(2131829553, objArr));
        }
    }

    public final void LIZ$4() {
        C19398810uw c19398810uw;
        List<C19398810uw> list = ((C19399210v0) this.l0).LLIZ;
        if (list != null && (c19398810uw = (C19398810uw) ListProtector.get(list, this.i1)) != null) {
            c19398810uw.LIZIZ = true;
        }
        ((C19399210v0) this.l0).LLILLL.notifyItemChanged(this.i1);
        C19399210v0 c19399210v0 = (C19399210v0) this.l0;
        HandlerHook.viewPost(c19399210v0.LLILLJJLI, new ARunnableS40S0101000_29(c19399210v0, this.i1, 13));
    }

    public static final void run$0(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TextModeEditStickerController@5d9d.keyBoardHide$action$1");
        try {
            super/*X.122P*/.LJZI(aRunnableS40S0101000_29.i1);
            ((C19673011y4) aRunnableS40S0101000_29.l0).LJIIL().qz1().LJIIJ(Unit.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextModeEditStickerController@5d9d.keyBoardHide$action$1");
    }

    public static final void run$1(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TextModeEditStickerController@5d9d.keyBoardShow$action$1");
        try {
            super/*X.122P*/.LJJIIJ(aRunnableS40S0101000_29.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextModeEditStickerController@5d9d.keyBoardShow$action$1");
    }

    public static final void run$10(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AEVoiceChangeScene@c6de.voiceChangeProgress$uiAction$1");
        try {
            ((C12QX) aRunnableS40S0101000_29.l0).LLLLZLLIL().LIZJ = aRunnableS40S0101000_29.i1;
            ((C12QX) aRunnableS40S0101000_29.l0).LLLLLLZZ().Mn2(((C12QX) aRunnableS40S0101000_29.l0).LLLLZLLIL().LIZ());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AEVoiceChangeScene@c6de.voiceChangeProgress$uiAction$1");
    }

    public static final void run$11(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("TTSPanelColumnView@49d6.setContentLayoutHeight$1");
        try {
            RelativeLayout relativeLayout = ((C194329111b) aRunnableS40S0101000_29.l0).LLJJIII;
            RelativeLayout relativeLayout2 = null;
            if (relativeLayout == null) {
                relativeLayout = null;
            }
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = aRunnableS40S0101000_29.i1;
            RelativeLayout relativeLayout3 = ((C194329111b) aRunnableS40S0101000_29.l0).LLJJIII;
            if (relativeLayout3 != null) {
                relativeLayout2 = relativeLayout3;
            }
            C786410Ut5.e6(relativeLayout2, layoutParams);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTSPanelColumnView@49d6.setContentLayoutHeight$1");
    }

    public static final void run$12(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CenterSelectionView@80dd.<init>$2$onItemClick$1");
        try {
            if (((C19399210v0) aRunnableS40S0101000_29.l0).LL.getParent() != null) {
                ((C19399210v0) aRunnableS40S0101000_29.l0).LL.smoothScrollToPosition(aRunnableS40S0101000_29.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CenterSelectionView@80dd.<init>$2$onItemClick$1");
    }

    public static final void run$13(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        String name;
        C19398810uw c19398810uw;
        Effect effect;
        C1C7U.LIZ("CenterSelectionView@80dd.highlightSelection$1$1");
        try {
            C19399210v0 c19399210v0 = (C19399210v0) aRunnableS40S0101000_29.l0;
            TextView textView = c19399210v0.LLILLJJLI;
            List<C19398810uw> list = c19399210v0.LLIZ;
            if (list != null && (c19398810uw = (C19398810uw) ListProtector.get(list, aRunnableS40S0101000_29.i1)) != null && (effect = c19398810uw.LIZ) != null) {
                name = effect.getName();
            } else {
                name = null;
            }
            textView.setText(name);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CenterSelectionView@80dd.highlightSelection$1$1");
    }

    public static final void run$14(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CenterSelectionView@80dd.highlightSelection$1");
        try {
            aRunnableS40S0101000_29.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CenterSelectionView@80dd.highlightSelection$1");
    }

    public static final void run$15(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C19398810uw c19398810uw;
        C1C7U.LIZ("CenterSelectionView@80dd.lowlightSelection$1");
        try {
            if (((C19399210v0) aRunnableS40S0101000_29.l0).LL.getParent() != null) {
                List<C19398810uw> list = ((C19399210v0) aRunnableS40S0101000_29.l0).LLIZ;
                if (list != null && (c19398810uw = (C19398810uw) ListProtector.get(list, aRunnableS40S0101000_29.i1)) != null) {
                    c19398810uw.LIZIZ = false;
                }
                ((C19399210v0) aRunnableS40S0101000_29.l0).LLILLL.notifyItemChanged(aRunnableS40S0101000_29.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CenterSelectionView@80dd.lowlightSelection$1");
    }

    public static final void run$16(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("VideoAudioFocusController@c22c.onAudioFocusChange$1");
        try {
            ((C19353610ne) aRunnableS40S0101000_29.l0).LIZ(aRunnableS40S0101000_29.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoAudioFocusController@c22c.onAudioFocusChange$1");
    }

    public static final void run$17(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPhotoSlideRenderer@4d69.notifyListeners$1");
        try {
            AnonymousClass1142 anonymousClass1142 = (AnonymousClass1142) aRunnableS40S0101000_29.l0;
            if (!anonymousClass1142.LLJJJIL) {
                List<InterfaceC661730PxT> list = anonymousClass1142.LLJI;
                int i = aRunnableS40S0101000_29.i1;
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC661730PxT) it2.next()).LIZIZ(anonymousClass1142.LLJJIJI, i, anonymousClass1142.LLJJIJIL);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPhotoSlideRenderer@4d69.notifyListeners$1");
    }

    public static final void run$18(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("SearchPhotoImageStackRenderer@3296.advanceTo$1");
        try {
            AnonymousClass1141 anonymousClass1141 = (AnonymousClass1141) aRunnableS40S0101000_29.l0;
            if (!anonymousClass1141.LLJJJIL) {
                List<InterfaceC661730PxT> list = anonymousClass1141.LLJ;
                int i = aRunnableS40S0101000_29.i1;
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC661730PxT) it2.next()).LIZIZ(anonymousClass1141.LLJJIJI, i, anonymousClass1141.LLJJIJIL);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchPhotoImageStackRenderer@3296.advanceTo$1");
    }

    public static final void run$19(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditRepeatMusicPlayer@b430.buildRepeatRunnable$1");
        try {
            MediaPlayer mediaPlayer = ((EditRepeatMusicPlayer) aRunnableS40S0101000_29.l0).LL;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    ((EditRepeatMusicPlayer) aRunnableS40S0101000_29.l0).LL.pause();
                }
                ((EditRepeatMusicPlayer) aRunnableS40S0101000_29.l0).LIZ(aRunnableS40S0101000_29.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditRepeatMusicPlayer@b430.buildRepeatRunnable$1");
    }

    public static final void run$2(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("EditTextStickerScene@bc67.loadOnThisDay$1");
        try {
            aRunnableS40S0101000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditTextStickerScene@bc67.loadOnThisDay$1");
    }

    public static final void run$20(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("InterestReselectionService@585f.increaseCardShownCount$1");
        try {
            ((InterestReselectionService) aRunnableS40S0101000_29.l0).LJJII().storeInt("keva_key_interest_card_shown_cnt", aRunnableS40S0101000_29.i1 + 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InterestReselectionService@585f.increaseCardShownCount$1");
    }

    public static final void run$21(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BackgroundSurveyLynxViewHelper@f0cd.alignPlayerAndCoverToSurveyPlayerView$2");
        try {
            SmartImageView smartImageView = ((C14ZZ) aRunnableS40S0101000_29.l0).LLJILJIL;
            if (smartImageView != null) {
                smartImageView.getLocationOnScreen(new int[2]);
                C786410Ut5.td(smartImageView, aRunnableS40S0101000_29.i1 - r1[1]);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BackgroundSurveyLynxViewHelper@f0cd.alignPlayerAndCoverToSurveyPlayerView$2");
    }

    public static final void run$22(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BaseResourcePagerScene@f77a.initObserver$6$1");
        try {
            C19561611g6 c19561611g6 = ((AbstractC19563811gS) aRunnableS40S0101000_29.l0).LLJL;
            if (c19561611g6 != null && c19561611g6.getParent() != null) {
                ((AbstractC19563811gS) aRunnableS40S0101000_29.l0).LLLLLLLLL(aRunnableS40S0101000_29.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseResourcePagerScene@f77a.initObserver$6$1");
    }

    public static final void run$23(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        C12UW c12uw = (C12UW) aRunnableS40S0101000_29.l0;
        c12uw.LLJZ.scrollBy(aRunnableS40S0101000_29.i1, 0);
    }

    public static final void run$3(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AdFakeUserProfileVideoPlayWidget@9006.onAdPopupWebPageEvent$1");
        try {
            C0N0Z c0n0z = ((AdFakeUserProfileVideoPlayWidget) aRunnableS40S0101000_29.l0).LLJILJILJ;
            if (c0n0z != null) {
                c0n0z.LIZLLL(aRunnableS40S0101000_29.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdFakeUserProfileVideoPlayWidget@9006.onAdPopupWebPageEvent$1");
    }

    public static final void run$4(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("AdFakeUserProfileVideoPlayWidget@9006.onVisibilityChanged$1");
        try {
            C0N0Z c0n0z = ((AdFakeUserProfileVideoPlayWidget) aRunnableS40S0101000_29.l0).LLJILJILJ;
            if (c0n0z != null) {
                c0n0z.LIZLLL(aRunnableS40S0101000_29.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdFakeUserProfileVideoPlayWidget@9006.onVisibilityChanged$1");
    }

    public static final void run$5(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("FTCCountdownMusicPreview@b912.previewMusic$1");
        try {
            aRunnableS40S0101000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCCountdownMusicPreview@b912.previewMusic$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:3:0x0005, B:5:0x000d, B:7:0x0011, B:8:0x0018, B:10:0x0020, B:13:0x002a), top: B:20:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$6(Y.ARunnableS40S0101000_29 r7) {
        /*
            java.lang.String r6 = "FTCCountdownScene@5596.showSwitchCountDownToast$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r2 = r7.l0     // Catch: java.lang.Throwable -> L3e
            X.11A3 r2 = (X.C11A3) r2     // Catch: java.lang.Throwable -> L3e
            X.0dTo r0 = r2.LLJJL     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L18
            android.app.Activity r1 = r2.mActivity     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L49
            X.0dTo r0 = new X.0dTo     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            r2.LLJJL = r0     // Catch: java.lang.Throwable -> L3e
        L18:
            java.lang.Object r5 = r7.l0     // Catch: java.lang.Throwable -> L3e
            X.11A3 r5 = (X.C11A3) r5     // Catch: java.lang.Throwable -> L3e
            X.0dTo r4 = r5.LLJJL     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L49
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L3e
            int r1 = r7.i1     // Catch: java.lang.Throwable -> L3e
            r0 = 3
            if (r1 == r0) goto L2a
            r0 = 10
        L2a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3e
            r2 = 0
            r3[r2] = r0     // Catch: java.lang.Throwable -> L3e
            r0 = 2131829553(0x7f112331, float:1.9292078E38)
            java.lang.String r1 = r5.getString(r0, r3)     // Catch: java.lang.Throwable -> L3e
            r0 = 2000(0x7d0, float:2.803E-42)
            r4.LIZIZ(r2, r0, r1)     // Catch: java.lang.Throwable -> L3e
            goto L49
        L3e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = X.C2179971ATj.LIZ(r1)
            if (r0 != 0) goto L49
            throw r1
        L49:
            X.C1C7U.LIZIZ(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS40S0101000_29.run$6(Y.ARunnableS40S0101000_29):void");
    }

    public static final void run$7(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CountdownMusicPreview@6db6.previewMusic$1");
        try {
            aRunnableS40S0101000_29.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CountdownMusicPreview@6db6.previewMusic$1");
    }

    public static final void run$8(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CountdownScene@5c50.showSwitchCountDownToast$1");
        try {
            aRunnableS40S0101000_29.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CountdownScene@5c50.showSwitchCountDownToast$1");
    }

    public static final void run$9(ARunnableS40S0101000_29 aRunnableS40S0101000_29) {
        boolean zLIZ;
        C1C7U.LIZ("VoiceChangeScene@ebfa.voiceChangeProgress$uiAction$1");
        try {
            ((C12QW) aRunnableS40S0101000_29.l0).LLLLZLL().LIZJ = aRunnableS40S0101000_29.i1;
            ((C12QW) aRunnableS40S0101000_29.l0).LLLLIL().LJII.invoke(Integer.valueOf(((C12QW) aRunnableS40S0101000_29.l0).LLLLZLL().LIZ()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VoiceChangeScene@ebfa.voiceChangeProgress$uiAction$1");
    }

    public ARunnableS40S0101000_29(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
