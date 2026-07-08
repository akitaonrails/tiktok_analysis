package Y;

import X.C0DS1;
import X.C0PEM;
import X.C0U7R;
import X.C0UFI;
import X.C0UFT;
import X.C0UKC;
import X.C0UKP;
import X.C0UKU;
import X.C1116210f9X;
import X.C1120000fFe;
import X.C1143920fsE;
import X.C1161920gLG;
import X.C13LE;
import X.C19290410dS;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C752230Tf3;
import X.C764890TzT;
import X.C767200U7q;
import X.C767850UAd;
import X.C770190UJd;
import X.C770200UJe;
import X.C770210UJf;
import X.C774700UaC;
import X.C776870Udh;
import X.C776940Udo;
import X.C779520Uhy;
import X.C780980UkK;
import X.C780990UkL;
import X.C781300Ukq;
import X.C781580UlI;
import X.C782340UmW;
import X.C782360UmY;
import X.C782430Umf;
import X.C814420VxA;
import X.EnumC1116160f9S;
import X.EnumC773710UWr;
import X.ViewOnLayoutChangeListenerC766940U6q;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.effect.api.ActionEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalOverlayEvent;
import com.bytedance.android.live.effect.api.PreviewRevisionClickMoreEvent;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.effect.panel.LiveEnhanceDialogFragment;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewGuestLayoutZoomSurfaceWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewReverseCameraRevisionWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewRevisionMoreWidget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastInteractionFragment;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenMarkViewGuideTouchEvent;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment;
import com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBeautyCompareIntervalTime;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.aicreation.AICreatorSwipeGuideUIComponent;
import com.ss.android.ugc.aweme.ecommerce.search.detail.shoptab.ui.EcomSearchSwipeGuideUiComponent;
import com.ss.android.ugc.aweme.feed.adapter.widget.LongPressWidget;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeAutoRotationSwipeGuideUIComponent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class ATListenerS446S0100000_12 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onTouch$13(this, view, motionEvent);
            case 14:
                return onTouch$14(this, view, motionEvent);
            case 15:
                return onTouch$15(this, view, motionEvent);
            case 16:
                return onTouch$16(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return onTouch$17(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return onTouch$18(this, view, motionEvent);
            case 19:
                return onTouch$19(this, view, motionEvent);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return onTouch$20(this, view, motionEvent);
            case 21:
                return onTouch$21(this, view, motionEvent);
            case 22:
                return onTouch$22(this, view, motionEvent);
            case 23:
                return onTouch$23(this, view, motionEvent);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return onTouch$24(this, view, motionEvent);
            case 25:
                return onTouch$25(this, view, motionEvent);
            case 26:
                return onTouch$26(this, view, motionEvent);
            case 27:
                return onTouch$27(this, view, motionEvent);
            case 28:
                return onTouch$28(this, view, motionEvent);
            case 29:
                return onTouch$29(this, view, motionEvent);
            case 30:
                return onTouch$30(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS446S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        Boolean boolInvoke = ((C782430Umf) aTListenerS446S0100000_12.l0).LLILLL.invoke(motionEvent);
        if (boolInvoke != null) {
            return boolInvoke.booleanValue();
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = ((GamePhoneCameraScannerFragment) aTListenerS446S0100000_12.l0).LLJI;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        GestureDetector gestureDetector2 = ((GamePhoneCameraScannerFragment) aTListenerS446S0100000_12.l0).LLIZLLLIL;
        if (gestureDetector2 != null && gestureDetector2.onTouchEvent(motionEvent)) {
            return true;
        }
        ScaleGestureDetector scaleGestureDetector = ((GamePhoneCameraScannerFragment) aTListenerS446S0100000_12.l0).LLIZ;
        if (scaleGestureDetector != null && scaleGestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        return view.onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$10(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        TryModeGoLiveWidget tryModeGoLiveWidget = ((TryModeBroadcastInteractionFragment) aTListenerS446S0100000_12.l0).LLJZIJLIL;
        if (tryModeGoLiveWidget != null) {
            if ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && System.currentTimeMillis() - tryModeGoLiveWidget.LLILZLL >= 1000) {
                tryModeGoLiveWidget.y1();
                tryModeGoLiveWidget.LLILZLL = System.currentTimeMillis();
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean onTouch$11(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        ((C781300Ukq) aTListenerS446S0100000_12.l0).LIZ.LC0(LiveExtendedScreenMarkViewGuideTouchEvent.class, motionEvent);
        return true;
    }

    public static final boolean onTouch$12(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        String str;
        EnumC1116160f9S enumC1116160f9S;
        if (motionEvent.getAction() == 0) {
            ((C779520Uhy) aTListenerS446S0100000_12.l0).setStartX((int) motionEvent.getRawX());
            ((C779520Uhy) aTListenerS446S0100000_12.l0).setCanHide(true);
        } else {
            if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 2) || !((C779520Uhy) aTListenerS446S0100000_12.l0).getCanHide()) {
                return true;
            }
            ((C779520Uhy) aTListenerS446S0100000_12.l0).setEndX((int) motionEvent.getRawX());
            int iLIZ = C439101nJ.LIZ(8);
            int endX = ((C779520Uhy) aTListenerS446S0100000_12.l0).getEndX() - ((C779520Uhy) aTListenerS446S0100000_12.l0).getStartX();
            if (C497740JfY.LJJ() ? endX > iLIZ : endX < (-iLIZ)) {
                ((C779520Uhy) aTListenerS446S0100000_12.l0).setHideNum(((C779520Uhy) aTListenerS446S0100000_12.l0).getHideNum() + 1);
                C779520Uhy c779520Uhy = (C779520Uhy) aTListenerS446S0100000_12.l0;
                C1116210f9X c1116210f9X = c779520Uhy.LLJ;
                if (c1116210f9X == null || (str = c1116210f9X.LL) == null) {
                    str = "";
                }
                c779520Uhy.LLJILJILJ = str;
                c779520Uhy.LLJILLL = true;
                c779520Uhy.LJJJJLL(true);
                ((C779520Uhy) aTListenerS446S0100000_12.l0).setCanHide(false);
                C779520Uhy c779520Uhy2 = (C779520Uhy) aTListenerS446S0100000_12.l0;
                C1116210f9X c1116210f9X2 = c779520Uhy2.LLJ;
                if (c1116210f9X2 != null) {
                    enumC1116160f9S = c1116210f9X2.LLJIJIL;
                } else {
                    enumC1116160f9S = null;
                }
                if (enumC1116160f9S == EnumC1116160f9S.BLANK) {
                    c779520Uhy2.LLJILJILJ = "";
                    return true;
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$13(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        return ((C782340UmW) aTListenerS446S0100000_12.l0).LIZJ(motionEvent);
    }

    public static final boolean onTouch$14(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        return ((C782340UmW) aTListenerS446S0100000_12.l0).LIZJ(motionEvent);
    }

    public static final boolean onTouch$15(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        ((AICreatorSwipeGuideUIComponent) aTListenerS446S0100000_12.l0).dismiss();
        return false;
    }

    public static final boolean onTouch$16(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        ((LandscapeAutoRotationSwipeGuideUIComponent) aTListenerS446S0100000_12.l0).dismiss();
        return false;
    }

    public static final boolean onTouch$17(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            C767850UAd c767850UAd = (C767850UAd) aTListenerS446S0100000_12.l0;
            c767850UAd.LJIIJJI(c767850UAd.LIZJ.LL);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$18(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        ((LongPressWidget) aTListenerS446S0100000_12.l0).LLJJIJIL = motionEvent.getRawX();
        ((LongPressWidget) aTListenerS446S0100000_12.l0).LLJJJ = motionEvent.getRawY();
        return false;
    }

    public static final boolean onTouch$19(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                    if (C0UFI.LJIIIIZZ() && (dataChannel2 = ((C770210UJf) aTListenerS446S0100000_12.l0).LLLII) != null) {
                        dataChannel2.LC0(LiveGoalOverlayEvent.class, new ActionEvent(true, motionEvent.getX(), motionEvent.getY()));
                    }
                }
            } else {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C0UFI.LJIIIIZZ() && (dataChannel = ((C770210UJf) aTListenerS446S0100000_12.l0).LLLII) != null) {
                    dataChannel.LC0(LiveGoalOverlayEvent.class, new ActionEvent(false, motionEvent.getX(), motionEvent.getY()));
                }
            }
        } else {
            ((C770210UJf) aTListenerS446S0100000_12.l0).requestFocus();
            DataChannel dataChannel3 = ((C770210UJf) aTListenerS446S0100000_12.l0).LLLII;
            if (dataChannel3 != null) {
                dataChannel3.FQ2(PreviewHideKeyboardEvent.class);
            }
        }
        C0UFT.LIZ();
        C1120000fFe c1120000fFe = ((C770210UJf) aTListenerS446S0100000_12.l0).LLLIIIL;
        if (c1120000fFe == null) {
            return false;
        }
        return c1120000fFe.LIZ(motionEvent, new C0UKP(C0UFT.LIZIZ, C0UFT.LIZJ, C0UFT.LJII, C0UFT.LJI), null);
    }

    public static final boolean onTouch$2(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ((LiveSheetFragment) aTListenerS446S0100000_12.l0).bS(false);
        }
        return true;
    }

    public static final boolean onTouch$20(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                    if (C0UFI.LJIIIIZZ() && (dataChannel2 = ((C770200UJe) aTListenerS446S0100000_12.l0).LLLLILI) != null) {
                        dataChannel2.LC0(LiveGoalOverlayEvent.class, new ActionEvent(true, motionEvent.getX(), motionEvent.getY()));
                    }
                }
            } else {
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C0UFI.LJIIIIZZ() && (dataChannel = ((C770200UJe) aTListenerS446S0100000_12.l0).LLLLILI) != null) {
                    dataChannel.LC0(LiveGoalOverlayEvent.class, new ActionEvent(false, motionEvent.getX(), motionEvent.getY()));
                }
            }
        } else {
            ((C770200UJe) aTListenerS446S0100000_12.l0).requestFocus();
            DataChannel dataChannel3 = ((C770200UJe) aTListenerS446S0100000_12.l0).LLLLILI;
            if (dataChannel3 != null) {
                dataChannel3.FQ2(PreviewHideKeyboardEvent.class);
            }
        }
        C0UFT.LIZ();
        C1120000fFe c1120000fFe = ((C770200UJe) aTListenerS446S0100000_12.l0).LLLLL;
        if (c1120000fFe == null) {
            return false;
        }
        return c1120000fFe.LIZ(motionEvent, new C0UKP(C0UFT.LIZIZ, C0UFT.LIZJ, C0UFT.LJII, C0UFT.LJI), view);
    }

    public static final boolean onTouch$21(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        DataChannel dataChannel;
        int i;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        if (Intrinsics.LJFF(((C770190UJd) aTListenerS446S0100000_12.l0).LLLZIL, Boolean.TRUE)) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                    if (C0UFI.LJIIIIZZ() && (dataChannel3 = ((C770190UJd) aTListenerS446S0100000_12.l0).LLLIIL) != null) {
                        dataChannel3.LC0(LiveGoalOverlayEvent.class, new ActionEvent(true, motionEvent.getX(), motionEvent.getY()));
                    }
                }
            } else {
                if (System.currentTimeMillis() - ((C770190UJd) aTListenerS446S0100000_12.l0).LLLZ < 500) {
                    float fAbs = Math.abs(motionEvent.getX() - ((C770190UJd) aTListenerS446S0100000_12.l0).LLLLZLLIL);
                    float fAbs2 = Math.abs(motionEvent.getY() - ((C770190UJd) aTListenerS446S0100000_12.l0).LLLLZLLLI);
                    if (fAbs < 10.0f && fAbs2 < 10.0f) {
                        PreviewWidget previewWidgetLJFF = C0UKC.LJFF(C13LE.LIZ(PreviewRevisionMoreWidget.class));
                        if (previewWidgetLJFF != null) {
                            int[] iArr = new int[2];
                            View view2 = previewWidgetLJFF.getView();
                            if (view2 != null) {
                                view2.getLocationOnScreen(iArr);
                            }
                            i = iArr[1];
                        } else {
                            i = 0;
                        }
                        int iLJIIZILJ = (C497740JfY.LJIIZILJ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))) / 2;
                        float f = ((C770190UJd) aTListenerS446S0100000_12.l0).LLLLZLLLI;
                        if (f < i && f > i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) {
                            float f2 = ((C770190UJd) aTListenerS446S0100000_12.l0).LLLLZLLIL;
                            if (f2 > iLJIIZILJ && f2 < iLJIIZILJ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)) && (dataChannel2 = ((C770190UJd) aTListenerS446S0100000_12.l0).LLLIIL) != null) {
                                dataChannel2.FQ2(PreviewRevisionClickMoreEvent.class);
                            }
                        }
                    }
                }
                ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalEffectHelper();
                if (C0UFI.LJIIIIZZ() && (dataChannel = ((C770190UJd) aTListenerS446S0100000_12.l0).LLLIIL) != null) {
                    dataChannel.LC0(LiveGoalOverlayEvent.class, new ActionEvent(false, motionEvent.getX(), motionEvent.getY()));
                }
            }
        } else {
            ((C770190UJd) aTListenerS446S0100000_12.l0).LLLLZLLIL = motionEvent.getX();
            ((C770190UJd) aTListenerS446S0100000_12.l0).LLLLZLLLI = motionEvent.getY();
            ((C770190UJd) aTListenerS446S0100000_12.l0).LLLZ = System.currentTimeMillis();
            ((C770190UJd) aTListenerS446S0100000_12.l0).requestFocus();
            DataChannel dataChannel4 = ((C770190UJd) aTListenerS446S0100000_12.l0).LLLIIL;
            if (dataChannel4 != null) {
                dataChannel4.FQ2(PreviewHideKeyboardEvent.class);
            }
        }
        C0UFT.LIZ();
        C1120000fFe c1120000fFe = ((C770190UJd) aTListenerS446S0100000_12.l0).LLLILZ;
        if (c1120000fFe == null) {
            return false;
        }
        return c1120000fFe.LIZ(motionEvent, new C0UKP(C0UFT.LIZIZ, C0UFT.LIZJ, C0UFT.LJII, C0UFT.LJI), view);
    }

    public static final boolean onTouch$22(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((EcomSearchSwipeGuideUiComponent) aTListenerS446S0100000_12.l0).dismiss();
        }
        return true;
    }

    public static final boolean onTouch$23(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        float xVelocity;
        LiveEnhanceDialogFragment liveEnhanceDialogFragment = (LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0;
        if (liveEnhanceDialogFragment.LLILZIL == null) {
            liveEnhanceDialogFragment.LLILZIL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = ((LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0).LLILZIL;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (!C767200U7q.LJ && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            VelocityTracker velocityTracker2 = ((LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0).LLILZIL;
            if (velocityTracker2 != null) {
                velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
            }
            VelocityTracker velocityTracker3 = ((LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0).LLILZIL;
            if (velocityTracker3 != null) {
                xVelocity = velocityTracker3.getXVelocity();
            } else {
                xVelocity = 0.0f;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("processUpOrCancel: ACTION_UP, velocityX: ");
            sbLIZ.append(xVelocity);
            C20441214yg.LJIIIZ("LiveBeautyFilterDialogFragmentOpt", C2188811AlT.LIZIZ(sbLIZ));
            if ((!((LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0).LLJI || xVelocity != 0.0f) && Math.abs(xVelocity) > 100.0f) {
                GestureDetector gestureDetector = ((LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0).LLILZLL;
                if (gestureDetector != null) {
                    gestureDetector.onTouchEvent(motionEvent);
                }
            } else {
                C767200U7q.LIZ.LJIIIZ(null);
            }
            ((LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0).LLJI = false;
        } else {
            GestureDetector gestureDetector2 = ((LiveEnhanceDialogFragment) aTListenerS446S0100000_12.l0).LLILZLL;
            if (gestureDetector2 != null) {
                gestureDetector2.onTouchEvent(motionEvent);
                return true;
            }
        }
        return true;
    }

    public static final boolean onTouch$24(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q = (ViewOnLayoutChangeListenerC766940U6q) aTListenerS446S0100000_12.l0;
                HandlerHook.viewPost(viewOnLayoutChangeListenerC766940U6q.LLILLL, new ARunnableS112S0100000_12(viewOnLayoutChangeListenerC766940U6q, 386));
            }
            return true;
        }
        if (((ViewOnLayoutChangeListenerC766940U6q) aTListenerS446S0100000_12.l0).LLJJJJ + LiveBroadcastBeautyCompareIntervalTime.getValue() > System.currentTimeMillis()) {
            return false;
        }
        C0U7R.LIZ.LJFF("see original", "");
        ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q2 = (ViewOnLayoutChangeListenerC766940U6q) aTListenerS446S0100000_12.l0;
        HandlerHook.viewPost(viewOnLayoutChangeListenerC766940U6q2.LLILLL, new ARunnableS112S0100000_12(viewOnLayoutChangeListenerC766940U6q2, 385));
        return true;
    }

    public static final boolean onTouch$25(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        View view2;
        int[] iArr;
        C774700UaC c774700UaCH1;
        if ((motionEvent.getAction() & 255) == 0) {
            PreviewGuestLayoutZoomSurfaceWidget previewGuestLayoutZoomSurfaceWidget = (PreviewGuestLayoutZoomSurfaceWidget) aTListenerS446S0100000_12.l0;
            if (previewGuestLayoutZoomSurfaceWidget.LLILZIL != EnumC773710UWr.ZOOM_IN) {
                C20441214yg.LIZIZ(previewGuestLayoutZoomSurfaceWidget.LLILZ, "Do not in zoomin status.");
            } else {
                String str = previewGuestLayoutZoomSurfaceWidget.LLILZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("event: ");
                sbLIZ.append(motionEvent.getX());
                sbLIZ.append(" - ");
                sbLIZ.append(motionEvent.getY());
                C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                PreviewWidget previewWidgetLJFF = C0UKC.LJFF(C13LE.LIZ(PreviewReverseCameraRevisionWidget.class));
                if (previewWidgetLJFF != null) {
                    view2 = previewWidgetLJFF.getView();
                } else {
                    view2 = null;
                }
                int[] iArr2 = new int[2];
                for (View view3 : Collections.singletonList(view2)) {
                    if (view3 != null && view3.getVisibility() == 0) {
                        view3.getLocationInWindow(iArr2);
                        if (PreviewGuestLayoutZoomSurfaceWidget.L1(iArr2, view3.getWidth(), view3.getHeight(), motionEvent)) {
                            C20441214yg.LIZIZ(previewGuestLayoutZoomSurfaceWidget.LLILZ, "checkInterceptViews intercept...");
                            return false;
                        }
                    }
                }
                C774700UaC c774700UaCH12 = previewGuestLayoutZoomSurfaceWidget.H1();
                if (c774700UaCH12 != null && (iArr = c774700UaCH12.LIZJ) != null && (c774700UaCH1 = previewGuestLayoutZoomSurfaceWidget.H1()) != null) {
                    int i = c774700UaCH1.LIZ;
                    C774700UaC c774700UaCH13 = previewGuestLayoutZoomSurfaceWidget.H1();
                    if (c774700UaCH13 != null) {
                        int i2 = c774700UaCH13.LIZIZ;
                        String str2 = previewGuestLayoutZoomSurfaceWidget.LLILZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isTouchInView(pos, width, height, event): ");
                        sbLIZ2.append(PreviewGuestLayoutZoomSurfaceWidget.L1(iArr, i, i2, motionEvent));
                        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        if (!PreviewGuestLayoutZoomSurfaceWidget.L1(iArr, i, i2, motionEvent)) {
                            Fragment fragment = previewGuestLayoutZoomSurfaceWidget.widgetCallback.getFragment();
                            C1DFH c1dfh = C0PEM.LIZ;
                            C500260Jjc.LJJJJJ(fragment, C2107308Nj.LIZ, new C0DS1(previewGuestLayoutZoomSurfaceWidget, null), 2);
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$26(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        ((C776870Udh) aTListenerS446S0100000_12.l0).LJJLIIIJLJLI.LIZIZ();
        C776940Udo c776940Udo = ((C776870Udh) aTListenerS446S0100000_12.l0).LJJLIIIJLLLLLLLZ;
        if (c776940Udo != null) {
            AtomicLong atomicLong = c776940Udo.LIZIZ;
            atomicLong.set(atomicLong.get() + 1);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$27(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            ((C752230Tf3) aTListenerS446S0100000_12.l0).setStartX((int) motionEvent.getRawX());
            ((C752230Tf3) aTListenerS446S0100000_12.l0).setCanHide(true);
        } else {
            if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 2) || !((C752230Tf3) aTListenerS446S0100000_12.l0).getCanHide()) {
                return true;
            }
            ((C752230Tf3) aTListenerS446S0100000_12.l0).setEndX((int) motionEvent.getRawX());
            int iLIZ = C439101nJ.LIZ(8);
            int endX = ((C752230Tf3) aTListenerS446S0100000_12.l0).getEndX() - ((C752230Tf3) aTListenerS446S0100000_12.l0).getStartX();
            if (C497740JfY.LJJ() ? endX > iLIZ : endX < (-iLIZ)) {
                ((C752230Tf3) aTListenerS446S0100000_12.l0).e0(true, true);
                C752230Tf3 c752230Tf3 = (C752230Tf3) aTListenerS446S0100000_12.l0;
                c752230Tf3.LLJIJIL++;
                c752230Tf3.h0(false);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$28(Y.ATListenerS446S0100000_12 r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = 0
            if (r9 == 0) goto L65
            r6 = 1
            if (r10 == 0) goto L65
            int r0 = r10.getAction()
            if (r0 != 0) goto L65
            java.lang.Object r3 = r8.l0
            com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem r3 = (com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem) r3
            float r5 = r10.getRawX()
            float r4 = r10.getRawY()
            r0 = 2
            int[] r2 = new int[r0]
            com.bytedance.android.live.design.widget.LiveEditText r0 = r3.Oo()
            r0.getLocationOnScreen(r2)
            r1 = r2[r7]
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L4c
            com.bytedance.android.live.design.widget.LiveEditText r0 = r3.Oo()
            int r0 = r0.getWidth()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L4c
            r1 = r2[r6]
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L4c
            com.bytedance.android.live.design.widget.LiveEditText r0 = r3.Oo()
            int r0 = r0.getHeight()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L65
        L4c:
            java.lang.Object r0 = r8.l0
            com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem r0 = (com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem) r0
            com.bytedance.android.live.design.widget.LiveEditText r0 = r0.Oo()
            boolean r0 = r0.isFocusable()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r8.l0
            com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem r0 = (com.bytedance.android.livesdk.game.gamelist.GameTopicListAssem) r0
            com.bytedance.android.live.design.widget.LiveEditText r0 = r0.Oo()
            r0.clearFocus()
        L65:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS446S0100000_12.onTouch$28(Y.ATListenerS446S0100000_12, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$29(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        if (view != null && motionEvent != null && ((motionEvent.getAction() == 2 || motionEvent.getAction() == 1) && ((GameTopicListAssem) aTListenerS446S0100000_12.l0).Oo().isFocusable())) {
            ((GameTopicListAssem) aTListenerS446S0100000_12.l0).Oo().clearFocus();
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && Math.abs(((KaraokeSearchSongListFragment) aTListenerS446S0100000_12.l0).LLJJIJIIJIL - motionEvent.getX()) <= 5.0f && Math.abs(((KaraokeSearchSongListFragment) aTListenerS446S0100000_12.l0).LLJJIJIL - motionEvent.getY()) <= 5.0f) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((KaraokeSearchSongListFragment) aTListenerS446S0100000_12.l0), null, null, new C764890TzT((KaraokeSearchSongListFragment) aTListenerS446S0100000_12.l0, null), 3);
                return false;
            }
            return false;
        }
        ((KaraokeSearchSongListFragment) aTListenerS446S0100000_12.l0).LLJJIJIIJIL = motionEvent.getX();
        ((KaraokeSearchSongListFragment) aTListenerS446S0100000_12.l0).LLJJIJIL = motionEvent.getY();
        return false;
    }

    public static final boolean onTouch$30(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        ObjectAnimator objectAnimator = ((C781580UlI) aTListenerS446S0100000_12.l0).LLILLJJLI;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = ((C781580UlI) aTListenerS446S0100000_12.l0).LLILLL;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        C1143920fsE c1143920fsE = ((C781580UlI) aTListenerS446S0100000_12.l0).LLILZ;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C500260Jjc.LJIILIIL((C781580UlI) aTListenerS446S0100000_12.l0);
        return true;
    }

    public static final boolean onTouch$4(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return false;
        }
        C0UFI c0ufi = C0UFI.LIZ;
        if (C0UFI.LJIIIIZZ()) {
            int action = motionEvent.getAction() & 255;
            if (action != 1) {
                if (action == 2) {
                    ((LiveGoalBackgroundDialogFragment) aTListenerS446S0100000_12.l0).WR(true);
                }
            } else {
                ((LiveGoalBackgroundDialogFragment) aTListenerS446S0100000_12.l0).WR(false);
            }
            return ((C0UKU) ((LiveGoalBackgroundDialogFragment) aTListenerS446S0100000_12.l0).LLJJ.getValue()).LIZ(motionEvent, new C0UKP(view.getWidth(), view.getHeight(), view.getTop(), view.getLeft()), null);
        }
        C19290410dS c19290410dS = (C19290410dS) ((LiveGoalBackgroundDialogFragment) aTListenerS446S0100000_12.l0).LLJJI.getValue();
        if (c19290410dS == null) {
            return true;
        }
        c19290410dS.LIZ(motionEvent);
        return true;
    }

    public static final boolean onTouch$5(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        return ((C780980UkK) aTListenerS446S0100000_12.l0).LLILLL.onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$6(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        return ((C780990UkL) aTListenerS446S0100000_12.l0).LLILLJJLI.onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$7(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        return ((C782360UmY) aTListenerS446S0100000_12.l0).LIZJ(motionEvent);
    }

    public static final boolean onTouch$8(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        return ((C782360UmY) aTListenerS446S0100000_12.l0).LIZJ(motionEvent);
    }

    public static final boolean onTouch$9(ATListenerS446S0100000_12 aTListenerS446S0100000_12, View view, MotionEvent motionEvent) {
        return ((TryModeBroadcastInteractionFragment) aTListenerS446S0100000_12.l0).onTouchEvent(motionEvent);
    }
}
