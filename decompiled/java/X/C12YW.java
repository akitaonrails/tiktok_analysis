package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.broadcast.LiveCenterCueEvent;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.sticker.newengine.ImageGlobalEditStickerNewEngineComponent;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.editview.StatusBarAdaptSoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.global.GlobalHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackFragment;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import nv7.c0;

/* JADX INFO: renamed from: X.12YW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YW implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onGlobalLayout$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onGlobalLayout$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onGlobalLayout$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onGlobalLayout$13(this);
                break;
            case 14:
                onGlobalLayout$14(this);
                break;
            case 15:
                onGlobalLayout$15(this);
                break;
            case 16:
                onGlobalLayout$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onGlobalLayout$17(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C12YW c12yw) {
        C19549911eD c19549911eD = (C19549911eD) c12yw.l0;
        c19549911eD.getClass();
        c19549911eD.LIZ.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
        if (r1 - r2.bottom > ((double) c19549911eD.LIZ.getWindow().getDecorView().getHeight()) * 0.15d) {
            C19549911eD c19549911eD2 = (C19549911eD) c12yw.l0;
            if (c19549911eD2.LJ < 0) {
                Rect rect = new Rect();
                c19549911eD2.LIZ.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                c19549911eD2.LJ = c19549911eD2.LIZIZ.getMeasuredHeight() - rect.bottom;
            }
            ((C19549911eD) c12yw.l0).LIZJ.LIZIZ();
            return;
        }
        ((C19549911eD) c12yw.l0).LIZJ.LIZJ();
    }

    public static final void onGlobalLayout$1(C12YW c12yw) {
        if (C11VU.LJI((C12ME) c12yw.l0)) {
            C12ME c12me = (C12ME) c12yw.l0;
            if (c12me.LLILZLL) {
                float f = c12me.LLIZ;
                float f2 = c12me.LLIZLLLIL;
                c12me.LLIZ = f2;
                c12me.LLIZLLLIL = f;
                c12me.setPadding((int) f2, (int) c12me.LLJ, (int) f, (int) c12me.LLJI);
            }
        }
        C786410Ut5.C3(((C12ME) c12yw.l0).getViewTreeObserver(), c12yw);
    }

    public static final void onGlobalLayout$10(C12YW c12yw) {
        C196868120s c196868120s = (C196868120s) c12yw.l0;
        if (c196868120s.LLJJIJI != null && !C1428470nHB.LJJZZI(c196868120s.LLJJIJIL)) {
            if (((Boolean) C0BMQ.LIZ.getValue()).booleanValue() && Lifecycle.State.RESUMED != c196868120s.LLILLJJLI.getLifecycle().getCurrentState()) {
                return;
            }
            c196868120s.LLJLLIL = (ScreenUtils.getScreenWidth(c196868120s.LL) - c196868120s.LLJJIJI.getInitSize().width) >> 1;
            c0.LIZ.n2();
        }
    }

    public static final void onGlobalLayout$11(C12YW c12yw) {
        float measuredWidth;
        ((C19416210xk) c12yw.l0).LJIJJ();
        ConstraintLayout constraintLayout = ((C19416210xk) c12yw.l0).LJI;
        if (constraintLayout != null) {
            measuredWidth = constraintLayout.getMeasuredWidth();
            if (measuredWidth > 0.0f) {
                measuredWidth += (int) C497740JfY.LIZIZ(4.0f);
            }
        } else {
            measuredWidth = 0.0f;
        }
        DataChannel dataChannelLJ = ((C19416210xk) c12yw.l0).LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterCueEvent.class, Float.valueOf(measuredWidth));
        }
    }

    public static final void onGlobalLayout$12(C12YW c12yw) {
        float measuredWidth;
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = ((C19416310xl) c12yw.l0).LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c12yw);
            C2187701Ajg.LIZIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ViewGroup viewGroup2 = ((C19416310xl) c12yw.l0).LJI;
        if (viewGroup2 != null) {
            measuredWidth = viewGroup2.getMeasuredWidth();
            if (measuredWidth > 0.0f) {
                measuredWidth += (int) C497740JfY.LIZIZ(4.0f);
            }
        } else {
            measuredWidth = 0.0f;
        }
        DataChannel dataChannelLJ = ((C19416310xl) c12yw.l0).LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterCueEvent.class, Float.valueOf(measuredWidth));
        }
    }

    public static final void onGlobalLayout$13(C12YW c12yw) {
        float measuredWidth;
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = ((C19416410xm) c12yw.l0).LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c12yw);
            C2187701Ajg.LIZIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ViewGroup viewGroup2 = ((C19416410xm) c12yw.l0).LJI;
        if (viewGroup2 != null) {
            measuredWidth = viewGroup2.getMeasuredWidth();
            if (measuredWidth > 0.0f) {
                measuredWidth += (int) C497740JfY.LIZIZ(4.0f);
            }
        } else {
            measuredWidth = 0.0f;
        }
        DataChannel dataChannelLJ = ((C19416410xm) c12yw.l0).LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterCueEvent.class, Float.valueOf(measuredWidth));
        }
    }

    public static final void onGlobalLayout$14(C12YW c12yw) {
        float measuredWidth;
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = ((C19416110xj) c12yw.l0).LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c12yw);
            C2187701Ajg.LIZIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ViewGroup viewGroup2 = ((C19416110xj) c12yw.l0).LJI;
        if (viewGroup2 != null) {
            measuredWidth = viewGroup2.getMeasuredWidth();
            if (measuredWidth > 0.0f) {
                measuredWidth += (int) C497740JfY.LIZIZ(4.0f);
            }
        } else {
            measuredWidth = 0.0f;
        }
        DataChannel dataChannelLJ = ((C19416110xj) c12yw.l0).LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterCueEvent.class, Float.valueOf(measuredWidth));
        }
    }

    public static final void onGlobalLayout$15(C12YW c12yw) {
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = ((C19416610xo) c12yw.l0).LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c12yw);
            C2187701Ajg.LIZIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        if (((C19416610xo) c12yw.l0).LJI != null && r0.getMeasuredWidth() > 0.0f) {
            C497740JfY.LIZIZ(4.0f);
        }
    }

    public static final void onGlobalLayout$16(C12YW c12yw) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C19768812Wg c19768812Wg = (C19768812Wg) c12yw.l0;
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = c19768812Wg.LLJILJILJ;
        if (cutVideoTitleBarViewModel == null) {
            cutVideoTitleBarViewModel = null;
        }
        ViewGroup.LayoutParams layoutParams = c19768812Wg.mView.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.topMargin;
        } else {
            i = 0;
        }
        int height = i + ((C19768812Wg) c12yw.l0).mView.getHeight();
        cutVideoTitleBarViewModel.getClass();
        cutVideoTitleBarViewModel.setState(new AwS41S0001000_29(height, 39));
        C786410Ut5.C3(((C19768812Wg) c12yw.l0).mView.getViewTreeObserver(), c12yw);
    }

    public static final void onGlobalLayout$17(C12YW c12yw) {
        Rect rect = new Rect();
        View view = ((StatusBarAdaptSoftKeyBoardListener) c12yw.l0).LLILLJJLI;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int iHeight = rect.height() + rect.top;
        StatusBarAdaptSoftKeyBoardListener statusBarAdaptSoftKeyBoardListener = (StatusBarAdaptSoftKeyBoardListener) c12yw.l0;
        InterfaceC1463990oCT interfaceC1463990oCT = statusBarAdaptSoftKeyBoardListener.LLIZ;
        if (interfaceC1463990oCT != null && statusBarAdaptSoftKeyBoardListener.LLILLL != iHeight) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("softKeyBoard old Height:");
            sbLIZ.append(((StatusBarAdaptSoftKeyBoardListener) c12yw.l0).LLILLL);
            sbLIZ.append(", new Height:");
            sbLIZ.append(iHeight);
            interfaceC1463990oCT.d(C2188811AlT.LIZIZ(sbLIZ));
        }
        StatusBarAdaptSoftKeyBoardListener statusBarAdaptSoftKeyBoardListener2 = (StatusBarAdaptSoftKeyBoardListener) c12yw.l0;
        int i = statusBarAdaptSoftKeyBoardListener2.LLILLL;
        if (i == 0) {
            statusBarAdaptSoftKeyBoardListener2.LLILLL = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        InterfaceC1391500mJY interfaceC1391500mJY = statusBarAdaptSoftKeyBoardListener2.LLILZ;
        if (interfaceC1391500mJY != null) {
            int i2 = i - iHeight;
            int i3 = statusBarAdaptSoftKeyBoardListener2.LLILZIL;
            if (i2 > i3) {
                interfaceC1391500mJY.LJJIIJ(i - iHeight);
            } else if (i > iHeight) {
                interfaceC1391500mJY.LLLL(i - iHeight);
            } else if (iHeight - i > i3) {
                interfaceC1391500mJY.LJZI(iHeight - i);
            } else if (i < iHeight) {
                interfaceC1391500mJY.LLLL(i - iHeight);
            }
        }
        ((StatusBarAdaptSoftKeyBoardListener) c12yw.l0).LLILLL = iHeight;
    }

    public static final void onGlobalLayout$2(C12YW c12yw) {
        if (((ImageGlobalEditStickerNewEngineComponent) c12yw.l0).LLILLJJLI.getRight() > 0) {
            ((ImageGlobalEditStickerNewEngineComponent) c12yw.l0).T2();
            ImageStickerInfoNewEngine stickerInfoNewEngine = ((ImageGlobalEditStickerNewEngineComponent) c12yw.l0).LLILZIL.getStickerInfoNewEngine();
            if (stickerInfoNewEngine != null) {
                ImageGlobalEditStickerNewEngineComponent imageGlobalEditStickerNewEngineComponent = (ImageGlobalEditStickerNewEngineComponent) c12yw.l0;
                Iterator<GlobalHashTagStickerModel> it2 = stickerInfoNewEngine.getHashStickersGlobal().iterator();
                while (true) {
                    C0FT7 c0ft7 = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    GlobalHashTagStickerModel next = it2.next();
                    C0FT7 c0ft72 = imageGlobalEditStickerNewEngineComponent.LLJILLL;
                    if (c0ft72 != null) {
                        c0ft7 = c0ft72;
                    }
                    c0ft7.f3(next, EnumC356070Dxd.COMMIT);
                }
                if (!C1428650nHT.LIZ()) {
                    for (AddYoursStickerModel addYoursStickerModel : stickerInfoNewEngine.getAddYoursStickerModels()) {
                        C0FT7 c0ft73 = imageGlobalEditStickerNewEngineComponent.LLJILLL;
                        if (c0ft73 == null) {
                            c0ft73 = null;
                        }
                        c0ft73.f3(addYoursStickerModel, EnumC356070Dxd.COMMIT);
                    }
                }
                for (MusicStickerModel musicStickerModel : stickerInfoNewEngine.getMusicStickerModels()) {
                    C0FT7 c0ft74 = imageGlobalEditStickerNewEngineComponent.LLJILLL;
                    if (c0ft74 == null) {
                        c0ft74 = null;
                    }
                    c0ft74.f3(musicStickerModel, EnumC356070Dxd.COMMIT);
                }
                for (DMGroupChatStickerModel dMGroupChatStickerModel : stickerInfoNewEngine.getDmGroupChatStickerModels()) {
                    C0FT7 c0ft75 = imageGlobalEditStickerNewEngineComponent.LLJILLL;
                    if (c0ft75 == null) {
                        c0ft75 = null;
                    }
                    c0ft75.f3(dMGroupChatStickerModel, EnumC356070Dxd.COMMIT);
                }
            }
            View view = ((ImageGlobalEditStickerNewEngineComponent) c12yw.l0).LLILZLL.mView;
            if (view != null && view.isAttachedToWindow()) {
                C786410Ut5.C3(view.getViewTreeObserver(), c12yw);
            }
        }
    }

    public static final void onGlobalLayout$3(C12YW c12yw) {
        ViewGroup viewGroup = ((C11A9) c12yw.l0).LLJJJIL;
        ViewGroup viewGroup2 = null;
        if (viewGroup == null) {
            viewGroup = null;
        }
        int measuredWidth = viewGroup.getMeasuredWidth();
        TextView textView = ((C11A9) c12yw.l0).LLJJJJ;
        if (textView == null) {
            textView = null;
        }
        int measuredWidth2 = textView.getMeasuredWidth();
        LinearLayout linearLayout = ((C11A9) c12yw.l0).LLJJJJJIL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        if (measuredWidth < measuredWidth2 + linearLayout.getMeasuredWidth()) {
            int[] iArr = new int[2];
            TextView textView2 = ((C11A9) c12yw.l0).LLJJJJ;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.getLocationOnScreen(iArr);
            int i = iArr[0];
            int[] iArr2 = new int[2];
            LinearLayout linearLayout2 = ((C11A9) c12yw.l0).LLJJJJJIL;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.getLocationOnScreen(iArr2);
            float fLIZJ = (iArr2[0] - i) - C12ES.LIZJ(16.0f, C545820Lau.LIZIZ((C11A9) c12yw.l0));
            TextView textView3 = ((C11A9) c12yw.l0).LLJJJJ;
            if (textView3 == null) {
                textView3 = null;
            }
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            layoutParams.width = (int) fLIZJ;
            TextView textView4 = ((C11A9) c12yw.l0).LLJJJJ;
            if (textView4 == null) {
                textView4 = null;
            }
            C786410Ut5.g6(textView4, layoutParams);
        }
        ViewGroup viewGroup3 = ((C11A9) c12yw.l0).LLJJJIL;
        if (viewGroup3 != null) {
            viewGroup2 = viewGroup3;
        }
        C786410Ut5.A3(viewGroup2.getViewTreeObserver(), c12yw);
    }

    public static final void onGlobalLayout$4(C12YW c12yw) {
        Rect rect = new Rect();
        View view = ((SoftKeyBoardListener) c12yw.l0).LLILLJJLI;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int iHeight = rect.height();
        SoftKeyBoardListener softKeyBoardListener = (SoftKeyBoardListener) c12yw.l0;
        InterfaceC1463990oCT interfaceC1463990oCT = softKeyBoardListener.LL;
        if (interfaceC1463990oCT != null && softKeyBoardListener.LLILLL != iHeight) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("softKeyBoard old Height:");
            sbLIZ.append(((SoftKeyBoardListener) c12yw.l0).LLILLL);
            sbLIZ.append(", new Height:");
            sbLIZ.append(iHeight);
            interfaceC1463990oCT.d(C2188811AlT.LIZIZ(sbLIZ));
        }
        SoftKeyBoardListener softKeyBoardListener2 = (SoftKeyBoardListener) c12yw.l0;
        int i = softKeyBoardListener2.LLILLL;
        if (i == 0) {
            softKeyBoardListener2.LLILLL = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        InterfaceC1391500mJY interfaceC1391500mJY = softKeyBoardListener2.LLILZ;
        if (interfaceC1391500mJY != null) {
            int i2 = i - iHeight;
            int i3 = softKeyBoardListener2.LLILZIL;
            if (i2 > i3) {
                interfaceC1391500mJY.LJJIIJ(i - iHeight);
            } else if (i > iHeight) {
                interfaceC1391500mJY.LLLL(i - iHeight);
            } else if (iHeight - i > i3) {
                interfaceC1391500mJY.LJZI(iHeight - i);
            } else if (i < iHeight) {
                interfaceC1391500mJY.LLLL(i - iHeight);
            }
        }
        ((SoftKeyBoardListener) c12yw.l0).LLILLL = iHeight;
    }

    public static final void onGlobalLayout$5(C12YW c12yw) {
        View view;
        boolean z;
        HashtagFeedbackFragment hashtagFeedbackFragment = (HashtagFeedbackFragment) c12yw.l0;
        if (hashtagFeedbackFragment.getContext() != null && (view = hashtagFeedbackFragment.LLILLL) != null) {
            int iLIZ = C14KI.LIZ(hashtagFeedbackFragment.getContext());
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect2);
            int i = rect.bottom;
            int i2 = iLIZ - i;
            if (i2 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != hashtagFeedbackFragment.LLILZIL) {
                if (z) {
                    if (i != rect2.bottom) {
                        C426750GoL.LJIIIZ(view, null, null, null, Integer.valueOf(i2), false, 23);
                    }
                } else {
                    C426750GoL.LJIIIZ(view, null, null, null, 0, false, 23);
                }
                view.requestLayout();
            }
            hashtagFeedbackFragment.LLILZIL = i2;
        }
    }

    public static final void onGlobalLayout$6(C12YW c12yw) {
        C19623411q4 c19623411q4 = (C19623411q4) c12yw.l0;
        C1664680tQA<LocationStickerModel> c1664680tQA = c19623411q4.LLJJJJJIL;
        if (c1664680tQA != null) {
            c1664680tQA.LIZLLL(new AwS608S0100000_29(c19623411q4, 539), false);
        }
    }

    public static final void onGlobalLayout$7(C12YW c12yw) {
        C121W c121w = (C121W) c12yw.l0;
        InterfaceC1452170ntP interfaceC1452170ntP = c121w.LLJJIII;
        if (interfaceC1452170ntP != null) {
            c121w.LLJLL = (ScreenUtils.getScreenWidth(c121w.LL) - interfaceC1452170ntP.getInitSize().width) >> 1;
            c0.LIZ.n2();
        }
    }

    public static final void onGlobalLayout$8(C12YW c12yw) {
        ((C123C) c12yw.l0).onGlobalLayout();
    }

    public static final void onGlobalLayout$9(C12YW c12yw) {
        AbstractC19644711tV abstractC19644711tV = (AbstractC19644711tV) c12yw.l0;
        C19644611tU c19644611tU = abstractC19644711tV.LIZIZ;
        if (c19644611tU != null) {
            c19644611tU.LIZ(abstractC19644711tV.LIZLLL(), ((AbstractC19644711tV) c12yw.l0).LJ());
        }
    }

    public C12YW(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
