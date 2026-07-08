package X;

import Y.ARunnableS127S0100000_27;
import Y.AsS53S0100000_27;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.android.livesdk.livesetting.gift.LiveViewerWishesBarCarouselVelocitySetting;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.model.message.GameTricksGiftInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.viewer_picks.model.ControlChaosInfo;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickExtra;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickExtraGameTricks;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickExtraGameTricksStorage;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPickWithScore;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksHeaderImage;
import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import com.bytedance.android.livesdk.viewerwishes.common.ui.TopSnappedLinearLayoutManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS165S0101000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import wh6.AbS207S1100000_27;
import wh6.AbS706S0100000_27;

/* JADX INFO: renamed from: X.0yGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850820yGO extends FrameLayout implements InterfaceC2176981AHw {
    public final ViewGroup LL;
    public final C19563611gQ LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final C1324720kZq LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public final View LLIZLLLIL;
    public final C16F5 LLJ;
    public final C1324720kZq LLJI;
    public final View LLJIJIL;
    public final LiveIconView LLJILJIL;
    public final C1324720kZq LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public C0TLO LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final ARunnableS127S0100000_27 LLJJJIL;
    public ARunnableS127S0100000_27 LLJJJJ;
    public boolean LLJJJJJIL;
    public DataChannel LLJJJJLIIL;
    public List<GiftPickWithScore> LLJJL;

    public final void LIZIZ() {
        TopSnappedLinearLayoutManager topSnappedLinearLayoutManager;
        final C19563611gQ c19563611gQ = this.LLILLJJLI;
        LiveIconView liveIconView = this.LLJILJIL;
        if (c19563611gQ == null || liveIconView == null || c19563611gQ.getLayoutParams() == null) {
            return;
        }
        setCollapsed(!this.LLJJ);
        final boolean z = this.LLJJ;
        RecyclerView.LayoutManager layoutManager = c19563611gQ.getLayoutManager();
        if ((layoutManager instanceof TopSnappedLinearLayoutManager) && (topSnappedLinearLayoutManager = (TopSnappedLinearLayoutManager) layoutManager) != null) {
            topSnappedLinearLayoutManager.LL = !z;
        }
        int iLJIIIZ = this.LLJILLL;
        C19563611gQ c19563611gQ2 = this.LLILLJJLI;
        this.LLJILLL = c19563611gQ2 != null ? c19563611gQ2.getHeight() : 0;
        if (z) {
            iLJIIIZ = this.LLJJI ? 1 : C497740JfY.LJIIIZ(R.dimen.ap4) + C497740JfY.LJIIIZ(R.dimen.apc);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c19563611gQ.getHeight(), iLJIIIZ);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        final C013C c013c = new C013C();
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0yGJ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue;
                Integer num;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = c19563611gQ.getLayoutParams().height;
                }
                if (!c013c.element && valueAnimator.getAnimatedFraction() >= 0.5f) {
                    c013c.element = true;
                    c19563611gQ.setVerticalFadingEdgeEnabled(true ^ z);
                }
                c19563611gQ.getLayoutParams().height = iIntValue;
                c19563611gQ.requestLayout();
            }
        });
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(liveIconView, (Property<LiveIconView, Float>) View.ROTATION, liveIconView.getRotation(), (liveIconView.getRotation() + 180) % 360);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0yGI
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                if (!z) {
                    ViewGroup.LayoutParams layoutParams = c19563611gQ.getLayoutParams();
                    if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.height = 0;
                        C19563611gQ c19563611gQ3 = c19563611gQ;
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19563611gQ3);
                        c19563611gQ3.setLayoutParams(marginLayoutParams);
                        c19563611gQ.requestLayout();
                    }
                }
                this.setRecyclerViewVisible(z);
                this.setDividerVisible(z);
                C19563611gQ c19563611gQ4 = c19563611gQ;
                HandlerHook.viewPost(c19563611gQ4, new ARunnableS127S0100000_27(c19563611gQ4, 10));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C0TLO c0tlo;
                C500260Jjc.LLFFF(c19563611gQ);
                C500260Jjc.LLFFF(this.LLILLJJLI);
                C1850820yGO c1850820yGO = this;
                if (c1850820yGO.LLJJI && (c0tlo = c1850820yGO.LLJJIJI) != null && c0tlo.getItemCount() > 0) {
                    C500260Jjc.LLFFF(this.LLIZLLLIL);
                }
            }
        });
        animatorSet.start();
        LIZ(-1, this.LLJJ ? "fold" : "expand");
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFII() {
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJJJJ;
        if (aRunnableS127S0100000_27 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS127S0100000_27);
        }
        this.LLJJJJ = null;
        LJLI(0L);
        if (this.LLJJIJIL) {
            C500260Jjc.LJIILLIIL(this.LLJ);
            C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
            c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
            C500260Jjc.LLFFF(this.LLJI);
            C1324720kZq c1324720kZq = this.LLJI;
            if (c1324720kZq != null) {
                c1320810kTXLIZJ.LJIIJJI = true;
                c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
            }
            ARunnableS127S0100000_27 aRunnableS127S0100000_272 = new ARunnableS127S0100000_27(this, 8);
            this.LLJJJJ = aRunnableS127S0100000_272;
            HandlerHook.viewPostDelay(this, aRunnableS127S0100000_272, ((long) ViewerWishesConfig.INSTANCE.getGetValue().settlementDuration) * 1000);
        }
    }

    private final void setCollapsed(boolean z) {
        this.LLJJ = z;
        C0TLO c0tlo = this.LLJJIJI;
        if (c0tlo != null) {
            c0tlo.LLILZ = z;
        }
    }

    private final void setCountdownView(Long l) {
        if (this.LLJJIJIIJIL) {
            C500260Jjc.LLFFF(this.LLJ);
            long j = 0;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue >= 0) {
                    j = jLongValue;
                }
            }
            LJLI(j);
        } else {
            C500260Jjc.LJIILIIL(this.LLJ);
        }
        C500260Jjc.LJIILIIL(this.LLJI);
    }

    private final void setGiftList(List<GiftPickWithScore> list) {
        Pair pair;
        String str;
        GiftPick giftPick;
        GiftPickWithScore giftPickWithScore = (GiftPickWithScore) C13LP.LJJJLL(list);
        if (giftPickWithScore != null && (giftPick = giftPickWithScore.giftPick) != null && giftPick.isPriorityRequest) {
            pair = new Pair(C13LP.LJJJLL(list), 0);
        } else {
            pair = new Pair(null, -1);
        }
        GiftPickWithScore giftPickWithScore2 = (GiftPickWithScore) pair.getFirst();
        int iIntValue = ((Number) pair.getSecond()).intValue();
        ArrayList arrayList = new ArrayList(list);
        C19719512Dh.LIZ(arrayList).remove(giftPickWithScore2);
        boolean z = this.LLJJIJIL;
        View view = this.LLILZ;
        C1324720kZq c1324720kZq = this.LLILZIL;
        C16F5 c16f5 = this.LLILZLL;
        C16F5 c16f52 = this.LLIZ;
        View view2 = this.LLIZLLLIL;
        if (giftPickWithScore2 != null && view != null && c1324720kZq != null && c16f5 != null && c16f52 != null && view2 != null) {
            this.LLJJI = true;
            C500260Jjc.LLFFF(view);
            C289401Ae.LIZ(view, c1324720kZq, c16f5, c16f52, giftPickWithScore2, this.LLJJJJLIIL, this.LLJJJJJIL, z, new AwS165S0101000_27(this, iIntValue, 1));
        } else {
            this.LLJJI = false;
            C500260Jjc.LJIILIIL(view);
        }
        if (this.LLJJIJI == null) {
            boolean z2 = this.LLJJJJJIL;
            boolean z3 = this.LLJJ;
            boolean z4 = this.LLJJIJIL;
            DataChannel dataChannel = this.LLJJJJLIIL;
            if (z2) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            C0TLO c0tlo = new C0TLO(arrayList, giftPickWithScore2, z2, z3, z4, dataChannel, str, false);
            this.LLJJIJI = c0tlo;
            C19563611gQ c19563611gQ = this.LLILLJJLI;
            if (c19563611gQ != null) {
                c19563611gQ.setAdapter(c0tlo);
            }
            C19563611gQ c19563611gQ2 = this.LLILLJJLI;
            if (c19563611gQ2 != null) {
                c19563611gQ2.setLayoutManager(new TopSnappedLinearLayoutManager(getContext()));
            }
            C19563611gQ c19563611gQ3 = this.LLILLJJLI;
            if (c19563611gQ3 != null) {
                c19563611gQ3.addOnScrollListener(new AsS53S0100000_27(this, 4));
            }
        }
        C0TLO c0tlo2 = this.LLJJIJI;
        if (c0tlo2 != null) {
            boolean z5 = this.LLJJIJIL;
            boolean z6 = this.LLJJIII;
            c0tlo2.LL = arrayList;
            c0tlo2.LLILLJJLI = giftPickWithScore2;
            c0tlo2.LLILZIL = z5;
            c0tlo2.LLJ = z6;
        }
        if (!C0TLO.LLJJ.isEmpty()) {
            C0TLO.LLJJI = new ARunnableS127S0100000_27(this, 9);
            return;
        }
        C0TLO c0tlo3 = this.LLJJIJI;
        if (c0tlo3 == null) {
            return;
        }
        c0tlo3.notifyDataSetChanged();
    }

    @Override // X.InterfaceC2176981AHw
    public final void LJLI(long j) {
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            if (j < 0) {
                j = 0;
            }
            c16f5.setText(C963140bAe.LJIIJ(j));
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void b(GameTricksGiftInfo gameTricksGiftInfo) {
        C2176881AHm c2176881AHm;
        C1125770fOx c1125770fOx;
        ViewerPicksInfo viewerPicksInfo;
        Integer numValueOf;
        Long lLJIILIIL;
        final boolean z;
        GiftPickExtra giftPickExtra;
        GiftPickExtraGameTricks giftPickExtraGameTricks;
        GiftPickExtraGameTricksStorage giftPickExtraGameTricksStorage;
        ControlChaosInfo controlChaosInfo;
        final boolean z2;
        GiftPick giftPick;
        BPEAHandler bPEAHandler;
        DataChannel dataChannel = this.LLJJJJLIIL;
        if (dataChannel != null && (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) != null && (c1125770fOx = c2176881AHm.LIZIZ) != null && (viewerPicksInfo = c1125770fOx.LIZIZ) != null && (numValueOf = Integer.valueOf(viewerPicksInfo.scene)) != null && numValueOf.intValue() == 5 && (lLJIILIIL = C2095008Iq.LJIILIIL(gameTricksGiftInfo.giftIdStr)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(gameTricksGiftInfo.fromUserIdStr);
            if (lLJIILIIL2 != null) {
                if (lLJIILIIL2.longValue() == UserService.getInstance().user().getCurrentUserId()) {
                    z = true;
                } else {
                    z = false;
                }
                for (final GiftPickWithScore giftPickWithScore : this.LLJJL) {
                    GiftPick giftPick2 = giftPickWithScore.giftPick;
                    if (giftPick2 != null && giftPick2.giftId == jLongValue) {
                        GiftPick giftPick3 = giftPickWithScore.giftPick;
                        if (giftPick3 != null && (giftPickExtra = giftPick3.extra) != null && (giftPickExtraGameTricks = giftPickExtra.gameTricks) != null && (giftPickExtraGameTricksStorage = giftPickExtraGameTricks.storage) != null && (controlChaosInfo = giftPickExtraGameTricksStorage.controlChaosInfo) != null) {
                            int i = controlChaosInfo.actionType;
                            if (i == 1 || (i != 2 && i != 3)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            final C0TLO c0tlo = this.LLJJIJI;
                            if (c0tlo != null) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - c0tlo.LLJIJIL <= 50 && (giftPick = giftPickWithScore.giftPick) != null && C0TLO.LLJJIII == giftPick.giftId && (bPEAHandler = c0tlo.LLJI) != null) {
                                    bPEAHandler.removeCallbacksAndMessages(null);
                                }
                                c0tlo.LLJIJIL = jCurrentTimeMillis;
                                BPEAHandler bPEAHandler2 = c0tlo.LLJI;
                                if (bPEAHandler2 != null) {
                                    C786410Ut5.LJLIIL(50L, bPEAHandler2, new Runnable() { // from class: X.0TJ7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("VerticalGiftBarAdapter@a4ae.startGameTricky$1");
                                            try {
                                                GiftPick giftPick4 = giftPickWithScore.giftPick;
                                                C0TLO.LLJJIII = giftPick4 != null ? giftPick4.giftId : 0L;
                                                C0TLO.LLJILJIL = true;
                                                C0TLO.LLJILLL = z;
                                                C0TLO.LLJILJILJ = z2;
                                                c0tlo.notifyDataSetChanged();
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("VerticalGiftBarAdapter@a4ae.startGameTricky$1");
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC2176981AHw
    public final void onFinish(boolean z) {
        setCollapsed(false);
        this.LLJILLL = 0;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLJJJJ;
        if (aRunnableS127S0100000_27 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS127S0100000_27);
        }
        this.LLJJJJ = null;
        C19563611gQ c19563611gQ = this.LLILLJJLI;
        if (c19563611gQ != null) {
            HandlerHook.viewRemoveCallbacks(c19563611gQ, this.LLJJJIL);
        }
        C0TLO c0tlo = this.LLJJIJI;
        if (c0tlo != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            C0TLO.LLJILJIL = false;
            C0TLO.LLJILLL = false;
            C0TLO.LLJJ.clear();
            C0TLO.LLJJI = null;
            BPEAHandler bPEAHandler = c0tlo.LLJI;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            c0tlo.LLJI = null;
            C0TLO.LLJJIJI.LJ();
        }
        this.LLJJIJI = null;
        C500260Jjc.LJIILIIL(this);
    }

    public final void setCollapsableMode(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        TopSnappedLinearLayoutManager topSnappedLinearLayoutManager;
        RecyclerView.LayoutManager layoutManager = null;
        if (z) {
            View view = this.LLJIJIL;
            if (view != null && !C500260Jjc.LJJJJIZL(view)) {
                ViewGroup viewGroup = this.LL;
                if (viewGroup != null) {
                    viewGroup.setBackgroundResource(R.drawable.fex);
                }
                View view2 = this.LLILLL;
                if (view2 != null) {
                    C426750GoL.LJIIIZ(view2, 0, Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.apc)), 0, 0, false, 16);
                }
                C19563611gQ c19563611gQ = this.LLILLJJLI;
                if (c19563611gQ != null) {
                    c19563611gQ.setPadding(0, 0, 0, C497740JfY.LJIIIZ(R.dimen.apc));
                }
                C500260Jjc.LLFFF(this.LLJIJIL);
                View view3 = this.LLJIJIL;
                if (view3 != null) {
                    final AwS606S0100000_27 awS606S0100000_27 = new AwS606S0100000_27(this, 71);
                    final C238400w2 c238400w2 = new C238400w2();
                    final long j = 500;
                    C786410Ut5.I7(new View.OnClickListener() { // from class: X.0gIj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C238400w2 c238400w22 = c238400w2;
                            if (jCurrentTimeMillis - c238400w22.element >= j) {
                                c238400w22.element = jCurrentTimeMillis;
                                awS606S0100000_27.invoke(view4);
                            }
                        }
                    }, view3);
                }
            }
        } else {
            View view4 = this.LLJIJIL;
            if (view4 != null && C500260Jjc.LJJJJIZL(view4)) {
                ViewGroup viewGroup2 = this.LL;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundResource(R.drawable.few);
                }
                View view5 = this.LLILLL;
                if (view5 != null) {
                    C426750GoL.LJIIIZ(view5, 0, Integer.valueOf(C497740JfY.LJIIIZ(R.dimen.apa)), 0, 0, false, 16);
                }
                C19563611gQ c19563611gQ2 = this.LLILLJJLI;
                if (c19563611gQ2 != null) {
                    c19563611gQ2.setPadding(0, 0, 0, C497740JfY.LJIIIZ(R.dimen.apa));
                }
                C500260Jjc.LJIILIIL(this.LLJIJIL);
                View view6 = this.LLJIJIL;
                if (view6 != null) {
                    C786410Ut5.I7(null, view6);
                }
            }
        }
        setCollapsed(false);
        this.LLJILLL = 0;
        C19563611gQ c19563611gQ3 = this.LLILLJJLI;
        if (c19563611gQ3 != null) {
            layoutManager = c19563611gQ3.getLayoutManager();
        }
        if ((layoutManager instanceof TopSnappedLinearLayoutManager) && (topSnappedLinearLayoutManager = (TopSnappedLinearLayoutManager) layoutManager) != null) {
            topSnappedLinearLayoutManager.LL = true;
        }
        C19563611gQ c19563611gQ4 = this.LLILLJJLI;
        if (c19563611gQ4 != null) {
            c19563611gQ4.scrollToPosition(0);
        }
        C19563611gQ c19563611gQ5 = this.LLILLJJLI;
        if (c19563611gQ5 != null) {
            c19563611gQ5.setVerticalFadingEdgeEnabled(true);
        }
        C19563611gQ c19563611gQ6 = this.LLILLJJLI;
        if (c19563611gQ6 != null && (layoutParams = c19563611gQ6.getLayoutParams()) != null) {
            layoutParams.height = 0;
        }
        LiveIconView liveIconView = this.LLJILJIL;
        if (liveIconView != null) {
            C786410Ut5.Db(liveIconView, 0.0f);
        }
        setRecyclerViewVisible(false);
        setDividerVisible(false);
        requestLayout();
    }

    public final void setDividerVisible(boolean z) {
        C0TLO c0tlo;
        if (this.LLJJI && (c0tlo = this.LLJJIJI) != null && c0tlo.getItemCount() > 0) {
            if (z) {
                C500260Jjc.LJIILLIIL(this.LLIZLLLIL);
                return;
            } else {
                C500260Jjc.LLFFF(this.LLIZLLLIL);
                return;
            }
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
    }

    public final void setRecyclerViewVisible(boolean z) {
        if (z && this.LLJJI) {
            C500260Jjc.LJIILLIIL(this.LLILLJJLI);
        } else {
            C500260Jjc.LLFFF(this.LLILLJJLI);
        }
    }

    public C1850820yGO(Context context, AttributeSet attributeSet) {
        C1324720kZq c1324720kZq;
        C16F5 c16f5;
        super(context, attributeSet, 0);
        this.LLJJIJIIJIL = true;
        this.LLJJJIL = new ARunnableS127S0100000_27(this, 40);
        this.LLJJL = C13BV.INSTANCE;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hws, this, true);
        this.LL = (ViewGroup) findViewById(R.id.vertical_gift_bar_panel);
        this.LLILLJJLI = (C19563611gQ) findViewById(R.id.vertical_gift_picked_list);
        this.LLILLL = findViewById(R.id.ydi);
        View viewFindViewById = findViewById(R.id.qhr);
        this.LLILZ = viewFindViewById;
        this.LLIZLLLIL = findViewById(R.id.fz3);
        if (viewFindViewById != null) {
            c1324720kZq = (C1324720kZq) viewFindViewById.findViewById(R.id.l6f);
        } else {
            c1324720kZq = null;
        }
        this.LLILZIL = c1324720kZq;
        if (viewFindViewById != null) {
            c16f5 = (C16F5) viewFindViewById.findViewById(R.id.z45);
        } else {
            c16f5 = null;
        }
        this.LLILZLL = c16f5;
        this.LLIZ = viewFindViewById != null ? (C16F5) viewFindViewById.findViewById(R.id.z44) : null;
        this.LLJ = (C16F5) findViewById(R.id.f10);
        this.LLJI = (C1324720kZq) findViewById(R.id.e1a);
        this.LLJIJIL = findViewById(R.id.cc9);
        this.LLJILJIL = (LiveIconView) findViewById(R.id.cc_);
        this.LLJILJILJ = (C1324720kZq) findViewById(R.id.viewer_wishes_banner);
    }

    public final void LIZ(int i, String str) {
        String str2;
        List<GiftPickWithScore> list = this.LLJJL;
        DataChannel dataChannel = this.LLJJJJLIIL;
        boolean z = this.LLJJJJJIL;
        boolean z2 = this.LLJJIII;
        if (z) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        C1AI0.LJIIJ(list, dataChannel, i, z, z2, str2, "original", str, this.LLJJ);
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLIZLLLIL(ViewerPicksInfo viewerPicksInfo, boolean z) {
        this.LLJJL = new ArrayList(viewerPicksInfo.giftPickList);
        setGiftList(viewerPicksInfo.giftPickList);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ap_);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLJIIIZ, Integer.MIN_VALUE);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, iLJIIIZ), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    @Override // X.InterfaceC2176981AHw
    public final void LLFF(ViewerPicksInfo viewerPicksInfo, boolean z, DataChannel dataChannel, Long l) {
        boolean z2;
        boolean z3;
        long jLongValue;
        Long l2;
        ImageModel imageModel;
        C500260Jjc.LLFFF(this);
        this.LLJJJJLIIL = dataChannel;
        this.LLJJJJJIL = z;
        this.LLJJIJIL = viewerPicksInfo.hasScore;
        if (viewerPicksInfo.headerImage != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJIII = z2;
        this.LLJJL = new ArrayList(viewerPicksInfo.giftPickList);
        this.LLJJIJIIJIL = viewerPicksInfo.hasDuration;
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.I7(new AbS706S0100000_27(this, 6, 42), viewGroup);
        }
        setCountdownView(l);
        setGiftList(viewerPicksInfo.giftPickList);
        if (viewerPicksInfo.giftPickList.size() >= 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        setCollapsableMode(z3);
        ViewerPicksHeaderImage viewerPicksHeaderImage = viewerPicksInfo.headerImage;
        if (viewerPicksHeaderImage != null && (imageModel = viewerPicksHeaderImage.image) != null) {
            C500260Jjc.LLFFF(this.LLJILJILJ);
            String str = viewerPicksHeaderImage.schemaUrl;
            C500260Jjc.LLFFF(this.LLJILJILJ);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIILL = new float[]{C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(6), 0.0f, 0.0f};
            c1324610kZfLJIIIZ.LJJI(this.LLJILJILJ);
            C1324720kZq c1324720kZq = this.LLJILJILJ;
            if (c1324720kZq != null) {
                C786410Ut5.I7(new AbS207S1100000_27(str, this, 1), c1324720kZq);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJILJILJ);
        }
        if (!this.LLJJJJJIL && !LiveViewerWishesBarCarouselVelocitySetting.INSTANCE.enabled()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        DataChannel dataChannel2 = this.LLJJJJLIIL;
        if (dataChannel2 != null && (l2 = (Long) dataChannel2.gg0(C1082850eHj.class)) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jCurrentTimeMillis - jLongValue;
        if (!this.LLJJJJJIL && j < 20000) {
            C19563611gQ c19563611gQ = this.LLILLJJLI;
            if (c19563611gQ == null) {
                return;
            }
            HandlerHook.viewPostDelay(c19563611gQ, this.LLJJJIL, 20000 - j);
            return;
        }
        C19563611gQ c19563611gQ2 = this.LLILLJJLI;
        if (c19563611gQ2 == null) {
            return;
        }
        HandlerHook.viewPost(c19563611gQ2, this.LLJJJIL);
    }
}
