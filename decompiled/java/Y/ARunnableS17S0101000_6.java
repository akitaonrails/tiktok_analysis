package Y;

import X.AbstractC21673619ry;
import X.AbstractC444320Hba;
import X.AbstractC848400XPy;
import X.C0H4Y;
import X.C0IDI;
import X.C0UCW;
import X.C0XQ7;
import X.C1303280k1G;
import X.C1389880mGw;
import X.C1420790n4n;
import X.C1619980sG4;
import X.C1C7U;
import X.C2188811AlT;
import X.C421980Gge;
import X.C422020Ggi;
import X.C422030Ggj;
import X.C424040Gjy;
import X.C426090GnH;
import X.C441190HRt;
import X.C444280HbW;
import X.C446310Hen;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS0S0203000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.UsHeaderVH;
import com.ss.android.ugc.aweme.feed.assem.stitchbutton.VideoStitchButtonAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.MixStudioResultsPageV2Assem;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarChoosePhotoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.view.PostModeGuideComponent;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyListAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS17S0101000_6 implements Runnable {
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

    public final void LIZ$0() throws Throwable {
        TuxIconView tuxIconView;
        int i = this.i1;
        C426090GnH c426090GnH = (C426090GnH) this.l0;
        if (i == c426090GnH.LLJIJIL && c426090GnH.isAttachedToWindow()) {
            if (!((C426090GnH) this.l0).isLaidOut()) {
                C426090GnH c426090GnH2 = (C426090GnH) this.l0;
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c426090GnH2, new ARunnableS75S0200000_6(c426090GnH2, c426090GnH2, 22));
                return;
            }
            C426090GnH c426090GnH3 = (C426090GnH) this.l0;
            AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c426090GnH3, 47);
            LinearLayout linearLayout = c426090GnH3.LLILLL;
            if (linearLayout == null || (tuxIconView = c426090GnH3.LLILLJJLI) == null) {
                return;
            }
            Integer numValueOf = Integer.valueOf(linearLayout.getWidth());
            int iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : linearLayout.getMeasuredWidth();
            if (iIntValue <= 0) {
                C786410Ut5.W4(linearLayout, 0.0f);
                C786410Ut5.LJZL(8, linearLayout);
                C786410Ut5.Uc(tuxIconView, 0.0f);
                awS550S0100000_6.invoke();
                return;
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = iIntValue;
            C786410Ut5.d6(linearLayout, layoutParams);
            linearLayout.requestLayout();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, 0);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(linearLayout, 15));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, linearLayout.getAlpha(), 0.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView, (Property<TuxIconView, Float>) View.TRANSLATION_X, tuxIconView.getTranslationX(), 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.addListener(new ALAdapterS1S0300000_6(linearLayout, tuxIconView, awS550S0100000_6, 7));
            animatorSet.start();
            c426090GnH3.LLILZIL = animatorSet;
        }
    }

    public final void LIZ$1() {
        if (this.i1 < ((C422030Ggj) this.l0).LLIZ.size()) {
            C786410Ut5.V4((ImageView) ListProtector.get(((C422030Ggj) this.l0).LLIZ, this.i1), 1.0f);
            ((ImageView) ListProtector.get(((C422030Ggj) this.l0).LLIZ, this.i1)).setImageResource(((C422030Ggj) this.l0).getDotIndicatorBackground());
        }
    }

    public final void LIZ$2() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = ((RepostReplyListAssem) this.l0).Go().getLayoutManager();
        LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager2 != null ? linearLayoutManager2.findFirstCompletelyVisibleItemPosition() : 0;
        RecyclerView.LayoutManager layoutManager2 = ((RepostReplyListAssem) this.l0).Go().getLayoutManager();
        int iFindLastCompletelyVisibleItemPosition = (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager2) == null) ? 0 : linearLayoutManager.findLastCompletelyVisibleItemPosition();
        int i = this.i1 + 1;
        if (iFindFirstCompletelyVisibleItemPosition > i || i > iFindLastCompletelyVisibleItemPosition) {
            ((RepostReplyListAssem) this.l0).Go().smoothScrollToPosition(this.i1 + 1);
        }
    }

    public final void LIZ$3() {
        if (this.i1 < ((AbstractC444320Hba) this.l0).LLIZ.size()) {
            C786410Ut5.V4((ImageView) ListProtector.get(((AbstractC444320Hba) this.l0).LLIZ, this.i1), 1.0f);
            ((ImageView) ListProtector.get(((AbstractC444320Hba) this.l0).LLIZ, this.i1)).setImageResource(((AbstractC444320Hba) this.l0).getDotIndicatorBackground());
        }
    }

    public final void LIZ$4() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((C0H4Y) this.l0).getViewBinding().LLILLJJLI;
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv != null ? viewOnAttachStateChangeListenerC20604515jv.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null) {
            return;
        }
        C0H4Y c0h4y = (C0H4Y) this.l0;
        int i = this.i1;
        Context context = c0h4y.getContext();
        if (context == null || i < 0 || i >= ((ArrayList) c0h4y.getViewBinding().LLILLJJLI.getState().LJII()).size()) {
            return;
        }
        C0IDI c0idi = new C0IDI(context, 1);
        c0idi.LIZ = i;
        layoutManager.startSmoothScroll(c0idi);
    }

    public final void LIZ$5() {
        C1303280k1G c1303280k1G = ((PostModeGuideComponent) this.l0).LLILZ;
        if (c1303280k1G != null) {
            c1303280k1G.setRepeatCount(-1);
        }
        C1303280k1G c1303280k1G2 = ((PostModeGuideComponent) this.l0).LLILZ;
        if (c1303280k1G2 != null) {
            c1303280k1G2.setAnimation(R.raw.tux_lottie_tux_gestures_only_tt_double_tap);
        }
        C1303280k1G c1303280k1G3 = ((PostModeGuideComponent) this.l0).LLILZ;
        if (c1303280k1G3 != null) {
            c1303280k1G3.playAnimation();
        }
        Keva keva = (Keva) ((PostModeGuideComponent) this.l0).LLJI.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        sbLIZ.append("_half_dig_show_cnt");
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), this.i1 + 1);
    }

    public final void LIZ$6() {
        if (((UsHeaderVH) this.l0).i6().getParent() == null) {
            return;
        }
        final int width = ((UsHeaderVH) this.l0).i6().getWidth();
        final int height = ((UsHeaderVH) this.l0).i6().getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        C424040Gjy c424040GjyZ6 = ((UsHeaderVH) this.l0).z6();
        final UsHeaderVH usHeaderVH = (UsHeaderVH) this.l0;
        final int i = this.i1;
        HandlerHook.viewPost(c424040GjyZ6, new Runnable() { // from class: X.0H1S
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1");
                try {
                    ImageView selectedView = usHeaderVH.z6().getSelectedView();
                    if (selectedView != null) {
                        HandlerHook.viewPost(selectedView, new ARunnableS0S0203000_6(usHeaderVH, selectedView, i, width, height, 0));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1");
            }
        });
    }

    public final void LIZ$7() {
        if (this.i1 < ((C444280HbW) this.l0).LLIZ.size()) {
            C786410Ut5.V4((ImageView) ListProtector.get(((C444280HbW) this.l0).LLIZ, this.i1), 1.0f);
            ((ImageView) ListProtector.get(((C444280HbW) this.l0).LLIZ, this.i1)).setImageResource(((C444280HbW) this.l0).getDotIndicatorBackground());
        }
    }

    public static final void run$0(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        View view;
        C1C7U.LIZ("TemplateEditDialog@4388.initObserver$1$4$1$1$1$1");
        try {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((C1420790n4n) aRunnableS17S0101000_6.l0).findViewHolderForAdapterPosition(aRunnableS17S0101000_6.i1);
            if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                view.performClick();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateEditDialog@4388.initObserver$1$4$1$1$1$1");
    }

    public static final void run$1(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MusicLyricTagView@e592.scheduleAutoCollapse$autoCollapseRunnable$1");
        try {
            aRunnableS17S0101000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicLyricTagView@e592.scheduleAutoCollapse$autoCollapseRunnable$1");
    }

    public static final void run$10(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        C1C7U.LIZ("MixStudioIdDropdownView@743b.setIds$2");
        try {
            RecyclerView.LayoutManager layoutManager = ((C441190HRt) aRunnableS17S0101000_6.l0).LLJJ.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(aRunnableS17S0101000_6.i1, 0);
            }
            C786410Ut5.LJLLLLLL(0, ((C441190HRt) aRunnableS17S0101000_6.l0).LLJJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixStudioIdDropdownView@743b.setIds$2");
    }

    public static final void run$11(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("DotIndicatorView@3ad5.disappearAnimation$1");
        try {
            ((C422020Ggi) aRunnableS17S0101000_6.l0).setSmallDot(aRunnableS17S0101000_6.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DotIndicatorView@3ad5.disappearAnimation$1");
    }

    public static final void run$12(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("DotIndicatorViewV2@30c4.shrinkDot$1");
        try {
            aRunnableS17S0101000_6.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DotIndicatorViewV2@30c4.shrinkDot$1");
    }

    public static final void run$13(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PoiChips@84aa.scrollToPositionEnd$1");
        try {
            aRunnableS17S0101000_6.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiChips@84aa.scrollToPositionEnd$1");
    }

    public static final void run$14(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("NaviAvatarListView@4744.scrollToPosition$1");
        try {
            RecyclerView recyclerView = ((C0UCW) aRunnableS17S0101000_6.l0).LLILLJJLI;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(aRunnableS17S0101000_6.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NaviAvatarListView@4744.scrollToPosition$1");
    }

    public static final void run$15(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SpanPreservingTextWatcher@a73c.afterTextChanged$2");
        try {
            ((C446310Hen) aRunnableS17S0101000_6.l0).LL.setSelection(aRunnableS17S0101000_6.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpanPreservingTextWatcher@a73c.afterTextChanged$2");
    }

    public static final void run$16(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        int iIntValue;
        C1C7U.LIZ("SearchKeyframeOptDir3PanelAssem@2187.updatePanelLayout$1$1");
        try {
            SearchKeyframeOptDir3PanelAssem searchKeyframeOptDir3PanelAssem = (SearchKeyframeOptDir3PanelAssem) aRunnableS17S0101000_6.l0;
            int i = aRunnableS17S0101000_6.i1;
            RecyclerView recyclerView = searchKeyframeOptDir3PanelAssem.LLJLLIL;
            if (recyclerView != null) {
                Integer numValueOf = Integer.valueOf(i);
                if (numValueOf.intValue() > 0) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = -2;
                }
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.height = iIntValue;
                C786410Ut5.p6(recyclerView, layoutParams);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchKeyframeOptDir3PanelAssem@2187.updatePanelLayout$1$1");
    }

    public static final void run$17(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeGuideComponent@61c4.show$1$1");
        try {
            aRunnableS17S0101000_6.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeGuideComponent@61c4.show$1$1");
    }

    public static final void run$18(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MixStudioResultsPageV2Assem@459e.moveToGeneratingItem$2$1");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((MixStudioResultsPageV2Assem) aRunnableS17S0101000_6.l0).LLLJ;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS17S0101000_6.i1, true);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixStudioResultsPageV2Assem@459e.moveToGeneratingItem$2$1");
    }

    public static final void run$19(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1$2");
        try {
            ((UsHeaderVH) aRunnableS17S0101000_6.l0).z6().LJIIJ(aRunnableS17S0101000_6.i1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1$1$1$2");
    }

    public static final void run$2(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("UsHeaderVH@175a.bindViewPager$1$onPageSelected$1");
        try {
            ((UsHeaderVH) aRunnableS17S0101000_6.l0).z6().setSelectedIndex(aRunnableS17S0101000_6.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsHeaderVH@175a.bindViewPager$1$onPageSelected$1");
    }

    public static final void run$20(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1");
        try {
            aRunnableS17S0101000_6.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsHeaderVH@175a.updateIndicatorStyleOpt$1");
    }

    public static final void run$21(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("VideoStitchButtonAssem@b312.setContainerVisibility$1");
        try {
            C786410Ut5.LJLLLLLL(aRunnableS17S0101000_6.i1, ((VideoStitchButtonAssem) aRunnableS17S0101000_6.l0).LJJIJL());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoStitchButtonAssem@b312.setContainerVisibility$1");
    }

    public static final void run$22(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("DotIndicatorView@e4ab.shrinkDot$1");
        try {
            aRunnableS17S0101000_6.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DotIndicatorView@e4ab.shrinkDot$1");
    }

    public static final void run$23(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        View view;
        C1C7U.LIZ("NoticeBoardDialog@1ba2.initObserver$1$4$1$1$1$1");
        try {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((C1420790n4n) aRunnableS17S0101000_6.l0).findViewHolderForAdapterPosition(aRunnableS17S0101000_6.i1);
            if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                view.performClick();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NoticeBoardDialog@1ba2.initObserver$1$4$1$1$1$1");
    }

    public static final void run$3(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PoiDotIndicatorView@815a.shrinkDot$1");
        try {
            aRunnableS17S0101000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiDotIndicatorView@815a.shrinkDot$1");
    }

    public static final void run$4(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        AbstractC21673619ry adapter;
        C1C7U.LIZ("ImageThumbnailContainer@3c20.touchHelper$1$clearView$1");
        try {
            if (((RecyclerView) aRunnableS17S0101000_6.l0).getParent() != null && (adapter = ((RecyclerView) aRunnableS17S0101000_6.l0).getAdapter()) != null) {
                adapter.notifyItemChanged(aRunnableS17S0101000_6.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageThumbnailContainer@3c20.touchHelper$1$clearView$1");
    }

    public static final void run$5(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        AbstractC21673619ry adapter;
        C1C7U.LIZ("ImageThumbnailContainer@3c20.touchHelperForDelete$1$clearView$1");
        try {
            if (((RecyclerView) aRunnableS17S0101000_6.l0).getParent() != null && (adapter = ((RecyclerView) aRunnableS17S0101000_6.l0).getAdapter()) != null) {
                adapter.notifyItemChanged(aRunnableS17S0101000_6.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageThumbnailContainer@3c20.touchHelperForDelete$1$clearView$1");
    }

    public static final void run$6(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MixStudioResultsPageV2Assem@459e.refreshList$1$3");
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((MixStudioResultsPageV2Assem) aRunnableS17S0101000_6.l0).LLLJ;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(aRunnableS17S0101000_6.i1, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixStudioResultsPageV2Assem@459e.refreshList$1$3");
    }

    public static final void run$7(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SocialAvatarChoosePhotoScene@4151.showErrorPopup$2$1");
        try {
            C1389880mGw c1389880mGw = new C1389880mGw((Activity) aRunnableS17S0101000_6.l0);
            c1389880mGw.LJIIIIZZ(aRunnableS17S0101000_6.i1);
            c1389880mGw.LIZLLL(2000L);
            c1389880mGw.LJIIJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SocialAvatarChoosePhotoScene@4151.showErrorPopup$2$1");
    }

    public static final void run$8(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("RepostReplyListAssem@2015.onViewCreated$4$1");
        try {
            aRunnableS17S0101000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RepostReplyListAssem@2015.onViewCreated$4$1");
    }

    public static final void run$9(ARunnableS17S0101000_6 aRunnableS17S0101000_6) {
        boolean zLIZ;
        C1C7U.LIZ("DotIndicatorView@30b4.hideDotAt$1");
        try {
            ((C421980Gge) aRunnableS17S0101000_6.l0).setSmallDot(aRunnableS17S0101000_6.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DotIndicatorView@30b4.hideDotAt$1");
    }

    public ARunnableS17S0101000_6(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public ARunnableS17S0101000_6(Activity activity, int i, SocialAvatarChoosePhotoScene socialAvatarChoosePhotoScene, int i2) {
        this.$t = i2;
        this.l0 = activity;
        this.i1 = i;
    }
}
