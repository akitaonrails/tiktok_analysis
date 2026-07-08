package Y;

import X.C1474810oTv;
import X.C1481110oe5;
import X.C1558520qew;
import X.C1AV2;
import X.C1AVH;
import X.C1C7U;
import X.C2180521AVm;
import X.C2188811AlT;
import X.C2524409us;
import X.C690360R6c;
import X.C786410Ut5;
import X.EnumC2180541AVo;
import X.InterfaceC665370Q7z;
import X.InterfaceC690350R6b;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.ab.FixProfileInnerFlowBackgroundSurveyCoverFlickerSetting;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView;
import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.common.sub.reveal.StoryRevealPhotoComponent;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyTemp;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.annotation.FcpAnnotationContainer;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS30S0110000_11 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        BaseFeedPlayerView baseFeedPlayerView;
        C690360R6c c690360R6c;
        ViewGroup viewGroup;
        View viewLIZ;
        CellSurveyTemp cellSurveyTemp;
        if (C1481110oe5.LIZ && ((VideoViewCell) this.l0).LJIIIIZZ() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("do unselect. aweme desc:");
            sbLIZ.append(((VideoViewCell) this.l0).LJIIIIZZ().getDesc());
            C1481110oe5.LIZIZ("VideoViewCell", C2188811AlT.LIZIZ(sbLIZ));
        }
        ((VideoViewCell) this.l0).LLJLIL.wa(false);
        if (!C1474810oTv.LJLJJLL() && !((VideoViewCell) this.l0).go1()) {
            ((VideoViewCell) this.l0).LLJLIL.L41();
        }
        if (C1474810oTv.LJLJJLL() || ((VideoViewCell) this.l0).go1()) {
            return;
        }
        if (((VideoViewCell) this.l0).LLJLLIL != null && (!FixProfileInnerFlowBackgroundSurveyCoverFlickerSetting.INSTANCE.isEnable() || (cellSurveyTemp = ((VideoViewCell) this.l0).LLLLZLLLI) == null || !cellSurveyTemp.Gg1())) {
            ((VideoViewCell) this.l0).LLJLLIL.lD2(this.z1);
        }
        if (this.z1 || !C2524409us.LIZ || (baseFeedPlayerView = ((VideoViewCell) this.l0).LLJLIL) == null || !baseFeedPlayerView.Mg() || (c690360R6c = ((VideoViewCell) this.l0).LLJZ) == null) {
            return;
        }
        InterfaceC690350R6b interfaceC690350R6b = c690360R6c.LIZJ().LIZLLL().LIZ;
        ViewParent parent = null;
        if (interfaceC690350R6b != null && (viewLIZ = interfaceC690350R6b.LIZ()) != null) {
            parent = viewLIZ.getParent();
        }
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJLZ(0, viewGroup);
    }

    public static final void run$0(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("CommerceVideoDelegateKt@740c.translationOutDesc$1");
        try {
            C2180521AVm.LIZ((LinearLayout) aRunnableS30S0110000_11.l0, EnumC2180541AVo.V_VISIBLITY, (C1AV2) C1AVH.LJJIIZ.getValue());
            LinearLayout linearLayout = (LinearLayout) aRunnableS30S0110000_11.l0;
            if (aRunnableS30S0110000_11.z1) {
                i = 8;
            } else {
                i = 4;
            }
            C786410Ut5.LJZL(i, linearLayout);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceVideoDelegateKt@740c.translationOutDesc$1");
    }

    public static final void run$1(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoViewCell@c979.notifySurfaceViewSelect$1");
        try {
            aRunnableS30S0110000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoViewCell@c979.notifySurfaceViewSelect$1");
    }

    public static final void run$10(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardStateViewModel@f4b1.needShowingKeyboard$1");
        try {
            ((KeyboardStateViewModel) aRunnableS30S0110000_11.l0).LLILLJJLI.setValue(Boolean.valueOf(aRunnableS30S0110000_11.z1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardStateViewModel@f4b1.needShowingKeyboard$1");
    }

    public static final void run$11(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardStateViewModel@f4b1.setKeyboardShowingState$1");
        try {
            ((KeyboardStateViewModel) aRunnableS30S0110000_11.l0).LL.setValue(Boolean.valueOf(aRunnableS30S0110000_11.z1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardStateViewModel@f4b1.setKeyboardShowingState$1");
    }

    public static final void run$12(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FcpAnnotationContainer@17c4.scheduleRenderAnnotationContent$1");
        try {
            FcpAnnotationContainer fcpAnnotationContainer = (FcpAnnotationContainer) aRunnableS30S0110000_11.l0;
            fcpAnnotationContainer.LLLILZJ = false;
            fcpAnnotationContainer.hp(aRunnableS30S0110000_11.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FcpAnnotationContainer@17c4.scheduleRenderAnnotationContent$1");
    }

    public static final void run$2(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("LandscapeVideoViewCell@2e53.animShowOrHideView$1$1");
        try {
            View view = (View) aRunnableS30S0110000_11.l0;
            if (aRunnableS30S0110000_11.z1) {
                i = 4;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandscapeVideoViewCell@2e53.animShowOrHideView$1$1");
    }

    public static final void run$3(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("FeedInfoAreaContainer@2fe3.onCreate$3$2");
        try {
            View view = (View) aRunnableS30S0110000_11.l0;
            if (aRunnableS30S0110000_11.z1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedInfoAreaContainer@2fe3.onCreate$3$2");
    }

    public static final void run$4(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ICommentPageContainer iCommentPageContainer;
        C1C7U.LIZ("CommentPublishViewModel@7f7.tryShowReminderDialog$1$1");
        try {
            if (aRunnableS30S0110000_11.z1 && (interfaceC665370Q7z = ((CommentPublishViewModel) aRunnableS30S0110000_11.l0).LLILLJJLI) != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageContainer.class, null)) != null) {
                iCommentPageContainer.Kb1("");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.tryShowReminderDialog$1$1");
    }

    public static final void run$5(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ICommentPageContainer iCommentPageContainer;
        C1C7U.LIZ("CommentPublishViewModel@7f7.tryShowReminderDialog$1$2");
        try {
            if (aRunnableS30S0110000_11.z1 && (interfaceC665370Q7z = ((CommentPublishViewModel) aRunnableS30S0110000_11.l0).LLILLJJLI) != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageContainer.class, null)) != null) {
                iCommentPageContainer.Qh0();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.tryShowReminderDialog$1$2");
    }

    public static final void run$6(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("InteractBottomBannerComponent@3f5.showContainerView$1");
        try {
            if (aRunnableS30S0110000_11.z1 && !((InteractBottomBannerComponent) aRunnableS30S0110000_11.l0).zp()) {
                C786410Ut5.LJLLLLLL(0, ((InteractBottomBannerComponent) aRunnableS30S0110000_11.l0).LJJIJL());
            } else if (!aRunnableS30S0110000_11.z1) {
                C786410Ut5.LJLLLLLL(8, ((InteractBottomBannerComponent) aRunnableS30S0110000_11.l0).LJJIJL());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractBottomBannerComponent@3f5.showContainerView$1");
    }

    public static final void run$7(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("StoryRevealPhotoComponent@9536.showHideContent$1");
        try {
            ((StoryRevealPhotoComponent) aRunnableS30S0110000_11.l0).Fp(!aRunnableS30S0110000_11.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryRevealPhotoComponent@9536.showHideContent$1");
    }

    public static final void run$8(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("LivePhotoViewHolder@6e20.postDelayPlay$delayRun$1");
        try {
            LivePhotoViewHolder livePhotoViewHolder = (LivePhotoViewHolder) aRunnableS30S0110000_11.l0;
            if (livePhotoViewHolder.LLLLLLZ && livePhotoViewHolder.LLJILJILJ != null) {
                livePhotoViewHolder.LJLJLLL(aRunnableS30S0110000_11.z1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePhotoViewHolder@6e20.postDelayPlay$delayRun$1");
    }

    public static final void run$9(ARunnableS30S0110000_11 aRunnableS30S0110000_11) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardStateViewModel@f4b1.needDismissKeyboard$1");
        try {
            ((KeyboardStateViewModel) aRunnableS30S0110000_11.l0).LLILLL.setValue(Boolean.valueOf(aRunnableS30S0110000_11.z1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardStateViewModel@f4b1.needDismissKeyboard$1");
    }

    public ARunnableS30S0110000_11(LivePhotoViewHolder livePhotoViewHolder, int i) {
        this.$t = i;
        this.l0 = livePhotoViewHolder;
        this.z1 = true;
    }

    public ARunnableS30S0110000_11(KeyboardStateViewModel keyboardStateViewModel, int i) {
        this.$t = i;
        this.l0 = keyboardStateViewModel;
        this.z1 = true;
    }

    public ARunnableS30S0110000_11(InteractBottomBannerComponent interactBottomBannerComponent, int i) {
        this.$t = i;
        this.z1 = false;
        this.l0 = interactBottomBannerComponent;
    }

    public ARunnableS30S0110000_11(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
