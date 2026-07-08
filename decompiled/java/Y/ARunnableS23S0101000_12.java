package Y;

import X.C01U6;
import X.C09JN;
import X.C0SR4;
import X.C0SZ8;
import X.C0T2S;
import X.C0U6W;
import X.C0UAO;
import X.C0UBC;
import X.C0UCW;
import X.C1129650fVD;
import X.C11G7;
import X.C11S5;
import X.C1273890jFr;
import X.C1274690jH9;
import X.C1274850jHP;
import X.C12ES;
import X.C1338270kvh;
import X.C1389890mGx;
import X.C1425490nCN;
import X.C1603970rqF;
import X.C1603980rqG;
import X.C1701940uOG;
import X.C19EG;
import X.C1C7U;
import X.C20483915Dh;
import X.C21546719Ub;
import X.C480460Ism;
import X.C497740JfY;
import X.C763970Txz;
import X.C766590U5h;
import X.C766640U5m;
import X.C766650U5n;
import X.C766660U5o;
import X.C767880UAg;
import X.C770190UJd;
import X.C770200UJe;
import X.C770210UJf;
import X.C786410Ut5;
import X.RunnableC781530UlD;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.live.effect.api.FaceDetectEvent;
import com.bytedance.android.live.effect.sticker.LivePreviewableEffectSheet;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.blacklight.SeaPdpBlackLightActivity;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeUser;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS166S0101000_28;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS23S0101000_12 implements Runnable {
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
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        List<CollaborativeUser> list;
        CollectionContentFragment collectionContentFragment = (CollectionContentFragment) this.l0;
        if (collectionContentFragment.LLJJ != null && (list = collectionContentFragment.qS().collaborativeUserList) != null && !list.isEmpty()) {
            C19EG activity = ((CollectionContentFragment) this.l0).getActivity();
            if (activity != null) {
                ((CollectionContentFragment) this.l0).YS(activity, null);
                return;
            }
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(((CollectionContentFragment) this.l0).requireActivity());
        Resources resources = ((CollectionContentFragment) this.l0).getResources();
        int i = this.i1;
        c1389890mGx.LJIIJ(resources.getQuantityString(2131755308, i, String.valueOf(i)));
        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(R.attr.a0i);
        c1389890mGx.LJIIJJI();
    }

    public final void LIZ$1() {
        RecyclerView recyclerView = ((C11G7) this.l0).LLJJ;
        if (recyclerView != null) {
            recyclerView.setVerticalScrollBarEnabled(true);
        }
        C11G7 c11g7 = (C11G7) this.l0;
        RecyclerView recyclerView2 = c11g7.LLJJ;
        if (recyclerView2 != null) {
            recyclerView2.setScrollBarSize((int) C12ES.LIZJ(4.0f, c11g7.getContext()));
        }
        if (((C11G7) this.l0).LLJJ.getHeight() > this.i1 / 2) {
            RecyclerView recyclerView3 = ((C11G7) this.l0).LLJJ;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (recyclerView3 != null ? recyclerView3.getLayoutParams() : null);
            marginLayoutParams.height = this.i1 / 2;
            RecyclerView recyclerView4 = ((C11G7) this.l0).LLJJ;
            if (recyclerView4 != null) {
                C786410Ut5.p6(recyclerView4, marginLayoutParams);
            }
        }
    }

    public final void LIZ$2() {
        C19EG activity;
        C770190UJd c770190UJd = (C770190UJd) this.l0;
        if (c770190UJd.LLLIILIL && c770190UJd.LJJ()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C770190UJd c770190UJd2 = (C770190UJd) this.l0;
            if (jCurrentTimeMillis - c770190UJd2.LLLJIL > 100 || this.i1 != c770190UJd2.LLLJL) {
                c770190UJd2.LLLJIL = System.currentTimeMillis();
                C770190UJd c770190UJd3 = (C770190UJd) this.l0;
                c770190UJd3.LLLJL = this.i1;
                if (!c770190UJd3.LL || (activity = c770190UJd3.LLILZ.getActivity()) == null) {
                    return;
                }
                activity.runOnUiThread(new ARunnableS23S0101000_12(this.i1, (C770190UJd) this.l0, 17));
            }
        }
    }

    public final void LIZ$3() {
        FullFeedFragmentPanel fullFeedFragmentPanel;
        C0SR4 c0sr4;
        if (((FullFeedFragmentPanel) this.l0).LLILLL() || (c0sr4 = (fullFeedFragmentPanel = (FullFeedFragmentPanel) this.l0).LLJL) == null || fullFeedFragmentPanel.LLLII == null) {
            return;
        }
        int i = fullFeedFragmentPanel.LLJLILLLLZIIL;
        int count = c0sr4.getCount();
        ((FullFeedFragmentPanel) this.l0).getClass();
        if (i < count - FullFeedFragmentPanel.a()) {
            FullFeedFragmentPanel fullFeedFragmentPanel2 = (FullFeedFragmentPanel) this.l0;
            if (fullFeedFragmentPanel2.LLJLILLLLZIIL >= fullFeedFragmentPanel2.LLJL.getCount() - this.i1) {
                ((FullFeedFragmentPanel) this.l0).LLLII.Ed("v0_smart_prefetch");
            }
        }
    }

    public final void LIZ$4() {
        C480460Ism.LIZ().getClass();
        ((GiftRetrofitApi) C480460Ism.LIZIZ(GiftRetrofitApi.class)).getGiftCustomSetting(this.i1).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12((C1129650fVD) this.l0, 237), new C09JN() { // from class: X.0T7j
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GiftRepository@13a6.getCustomSetting$1$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("network error");
                sbLIZ.append(obj);
                C20441214yg.LIZIZ("live_gift_sync_enabled", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("GiftRepository@13a6.getCustomSetting$1$2");
            }
        });
    }

    public static final void run$0(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@b84d.errorListener$1$1");
        try {
            int i = aRunnableS23S0101000_12.i1;
            if (i == -301) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C1274850jHP c1274850jHP = ((C1273890jFr) aRunnableS23S0101000_12.l0).LJII;
                if (c1274850jHP != null && C1274690jH9.LIZJ() != null && !C786410Ut5.LJJZZIII(C1274690jH9.LIZJ(), new ARunnableS112S0100000_12(c1274850jHP, 387))) {
                    c1274850jHP.LJIIZILJ();
                }
            } else if (i == -302) {
                Map<String, Object> map2 = C1338270kvh.LIZ;
                C1274850jHP c1274850jHP2 = ((C1273890jFr) aRunnableS23S0101000_12.l0).LJII;
                if (c1274850jHP2 != null && C1274690jH9.LIZJ() != null && !C786410Ut5.LJJZZIII(C1274690jH9.LIZJ(), new ARunnableS112S0100000_12(c1274850jHP2, 387))) {
                    c1274850jHP2.LJIIZILJ();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@b84d.errorListener$1$1");
    }

    public static final void run$1(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewableEffectSheet@dba.initObserver$1$1$1$3");
        try {
            RecyclerView recyclerView = ((LivePreviewableEffectSheet) aRunnableS23S0101000_12.l0).LLLI;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(aRunnableS23S0101000_12.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewableEffectSheet@dba.initObserver$1$1$1$3");
    }

    public static final void run$10(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreCardPlayAttributionDetailDelegate@da30.tryAttachPlayer$1");
        try {
            ((C0T2S) aRunnableS23S0101000_12.l0).LIZJ(aRunnableS23S0101000_12.i1 - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreCardPlayAttributionDetailDelegate@da30.tryAttachPlayer$1");
    }

    public static final void run$11(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("AnchorPanel@6777.onCreate$15");
        try {
            aRunnableS23S0101000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnchorPanel@6777.onCreate$15");
    }

    public static final void run$12(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStickerDialogView@9284.scrollToTargetTab$1");
        try {
            ((C0UAO) aRunnableS23S0101000_12.l0).LLILZLL.setCurrentItem(aRunnableS23S0101000_12.i1);
            if (C497740JfY.LJJ()) {
                ((C0UAO) aRunnableS23S0101000_12.l0).LLILZIL.LJIILL(aRunnableS23S0101000_12.i1, 0.0f, false, true);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStickerDialogView@9284.scrollToTargetTab$1");
    }

    public static final void run$13(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStickerTabView@8fe8.scrollToTabByCategory$1");
        try {
            ((C0UBC) aRunnableS23S0101000_12.l0).LIZIZ.setCurrentItem(aRunnableS23S0101000_12.i1);
            if (C497740JfY.LJJ()) {
                ((C0UBC) aRunnableS23S0101000_12.l0).LIZ.LJIILL(aRunnableS23S0101000_12.i1, 0.0f, false, true);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStickerTabView@8fe8.scrollToTabByCategory$1");
    }

    public static final void run$14(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("SearchStickerDialogView@2b0d.onViewShow$1");
        try {
            ((C767880UAg) aRunnableS23S0101000_12.l0).LLILZIL.smoothScrollToPosition(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchStickerDialogView@2b0d.onViewShow$1");
    }

    public static final void run$15(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("VideoModeSimpleContainer@7233.detectListener$1$1");
        try {
            DataChannel dataChannel = ((C770210UJf) aRunnableS23S0101000_12.l0).LLLII;
            if (dataChannel != null) {
                if (aRunnableS23S0101000_12.i1 <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                dataChannel.LC0(FaceDetectEvent.class, Boolean.valueOf(z));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoModeSimpleContainer@7233.detectListener$1$1");
    }

    public static final void run$16(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("VideoModeContainer@8970.detectListener$1$1");
        try {
            DataChannel dataChannel = ((C770200UJe) aRunnableS23S0101000_12.l0).LLLLILI;
            if (dataChannel != null) {
                if (aRunnableS23S0101000_12.i1 <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                dataChannel.LC0(FaceDetectEvent.class, Boolean.valueOf(z));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoModeContainer@8970.detectListener$1$1");
    }

    public static final void run$17(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("VideoModeContainerRevision@ec60.detectListener$1$1$1");
        try {
            DataChannel dataChannel = ((C770190UJd) aRunnableS23S0101000_12.l0).LLLIIL;
            if (dataChannel != null) {
                if (aRunnableS23S0101000_12.i1 <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                dataChannel.LC0(FaceDetectEvent.class, Boolean.valueOf(z));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoModeContainerRevision@ec60.detectListener$1$1$1");
    }

    public static final void run$18(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("VideoModeContainerRevision@ec60.detectListener$1$1");
        try {
            aRunnableS23S0101000_12.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoModeContainerRevision@ec60.detectListener$1$1");
    }

    public static final void run$19(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FullFeedFragmentPanel@9b2e.lambda$new$10$1");
        try {
            aRunnableS23S0101000_12.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FullFeedFragmentPanel@9b2e.lambda$new$10$1");
    }

    public static final void run$2(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$6$2");
        try {
            RecyclerView recyclerViewLLII = ((CommunityFlaggedManageSheetFragment) aRunnableS23S0101000_12.l0).LLII();
            if (recyclerViewLLII != null) {
                recyclerViewLLII.scrollToPosition(aRunnableS23S0101000_12.i1 + 1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$6$2");
    }

    public static final void run$20(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        BaseListFragmentPanel baseListFragmentPanel;
        C0SR4 c0sr4;
        C1603970rqF c1603970rqF = (C1603970rqF) aRunnableS23S0101000_12.l0;
        int i = aRunnableS23S0101000_12.i1;
        c1603970rqF.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$7L");
        if (!c1603970rqF.LLJ.LLILLL() && (c0sr4 = (baseListFragmentPanel = c1603970rqF.LLJ).LLJL) != null) {
            baseListFragmentPanel.LLIILZL(c0sr4.getItem(i));
            c1603970rqF.LLJ.xR1();
            c1603970rqF.LLJ.LLJJJJLIIL();
            int i2 = i + 1;
            if (i2 < c1603970rqF.LLJ.LLJL.getCount()) {
                c1603970rqF.LLJ.LJJJZ(i2);
            }
            c1603970rqF.LLJ.LJJJZ(i);
            if (i > 0) {
                c1603970rqF.LLJ.LJJJZ(i - 1);
            }
            C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$7L");
            return;
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$7L");
    }

    public static final void run$21(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        C1603970rqF c1603970rqF = (C1603970rqF) aRunnableS23S0101000_12.l0;
        int i = aRunnableS23S0101000_12.i1;
        c1603970rqF.getClass();
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$1L");
        c1603970rqF.LLJ.LLILLIZIL(i);
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$1L");
    }

    public static final void run$22(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        C0SZ8 c0sz8 = (C0SZ8) aRunnableS23S0101000_12.l0;
        int i = aRunnableS23S0101000_12.i1;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$2L");
        c0sz8.onPageSelected(i);
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$1$onPageSelectedInternal$2L");
    }

    public static final void run$23(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        C1603980rqG c1603980rqG = (C1603980rqG) aRunnableS23S0101000_12.l0;
        int i = aRunnableS23S0101000_12.i1;
        c1603980rqG.getClass();
        C1C7U.LIZ("BaseListPageSelectedCallback@9b19.runPanelInvokeSelectCallback$1L");
        c1603980rqG.LL.LLILLIZIL(i);
        C1C7U.LIZIZ("BaseListPageSelectedCallback@9b19.runPanelInvokeSelectCallback$1L");
    }

    public static final void run$24(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListPageSelectedCallback@9b19.runPanelInvokeSelectCallback$1");
        try {
            if (!((C1603980rqG) aRunnableS23S0101000_12.l0).LL.LLILLL()) {
                ((C1603980rqG) aRunnableS23S0101000_12.l0).LL.LLILLIZIL(aRunnableS23S0101000_12.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListPageSelectedCallback@9b19.runPanelInvokeSelectCallback$1");
    }

    public static final void run$25(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("GiftRepository@13a6.getCustomSetting$1");
        try {
            aRunnableS23S0101000_12.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftRepository@13a6.getCustomSetting$1");
    }

    public static final void run$26(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("NaviAvatarListView@4744.setSelectedIndex$1");
        try {
            ((C0UCW) aRunnableS23S0101000_12.l0).getNaviAdapter().LLLIIIIL(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NaviAvatarListView@4744.setSelectedIndex$1");
    }

    public static final void run$27(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("NaviAvatarListView@4744.showLoading$1");
        try {
            ((C0UCW) aRunnableS23S0101000_12.l0).getNaviAdapter().LLLII(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NaviAvatarListView@4744.showLoading$1");
    }

    public static final void run$28(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("VideoBroadcastInteractionFragment@9445.observeTTNetworkStatusChange$1$2");
        try {
            DataChannel dataChannel = ((VideoBroadcastInteractionFragment) aRunnableS23S0101000_12.l0).LLJLIL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.zW(NetworkStatus.class, Integer.valueOf(aRunnableS23S0101000_12.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoBroadcastInteractionFragment@9445.observeTTNetworkStatusChange$1$2");
    }

    public static final void run$29(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBeautyItemBaseAdapter@604f.beautyDownloadCallback$1$onSuccess$1");
        try {
            ((C766660U5o) aRunnableS23S0101000_12.l0).LLLIIIIL(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBeautyItemBaseAdapter@604f.beautyDownloadCallback$1$onSuccess$1");
    }

    public static final void run$3(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("SinglePropsSelectorDialog@7b93.initData$1$1$1$1$1");
        try {
            RunnableC781530UlD runnableC781530UlD = ((SinglePropsSelectorDialog) aRunnableS23S0101000_12.l0).LLILZIL;
            if (runnableC781530UlD != null) {
                runnableC781530UlD.scrollToPosition(aRunnableS23S0101000_12.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SinglePropsSelectorDialog@7b93.initData$1$1$1$1$1");
    }

    public static final void run$30(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBeautySubItemBaseAdapter@6341.beautyDownloadCallback$1$onSuccess$1");
        try {
            ((C0U6W) aRunnableS23S0101000_12.l0).notifyItemChanged(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBeautySubItemBaseAdapter@6341.beautyDownloadCallback$1$onSuccess$1");
    }

    public static final void run$31(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBeautyItemListView@64cb.processEffectData$2$1");
        try {
            ((C766590U5h) aRunnableS23S0101000_12.l0).LIZIZ.smoothScrollToPosition(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBeautyItemListView@64cb.processEffectData$2$1");
    }

    public static final void run$32(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBeautyItemAnchorAdapter@a945.selectItemReal$1");
        try {
            C766640U5m c766640U5m = (C766640U5m) aRunnableS23S0101000_12.l0;
            c766640U5m.LLLJ(c766640U5m.LLILZ);
            ((C766640U5m) aRunnableS23S0101000_12.l0).LLLILZ(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBeautyItemAnchorAdapter@a945.selectItemReal$1");
    }

    public static final void run$33(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        C20483915Dh c20483915Dh = (C20483915Dh) aRunnableS23S0101000_12.l0;
        int i = aRunnableS23S0101000_12.i1;
        c20483915Dh.getClass();
        C1C7U.LIZ("LiveSheetHeaderView@af51.setTabBarItemList$1L");
        C21546719Ub c21546719Ub = c20483915Dh.LL;
        if (c21546719Ub == null) {
            C1C7U.LIZIZ("LiveSheetHeaderView@af51.setTabBarItemList$1L");
            return;
        }
        C763970Txz c763970TxzLJIIJ = c21546719Ub.LJIIJ(i);
        if (c763970TxzLJIIJ == null) {
            C1C7U.LIZIZ("LiveSheetHeaderView@af51.setTabBarItemList$1L");
        } else {
            c763970TxzLJIIJ.LIZ();
            C1C7U.LIZIZ("LiveSheetHeaderView@af51.setTabBarItemList$1L");
        }
    }

    public static final void run$34(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBeautyItemMultiGuestAdapter@c8af.selectItemReal$1");
        try {
            C766650U5n c766650U5n = (C766650U5n) aRunnableS23S0101000_12.l0;
            c766650U5n.LLLJ(c766650U5n.LLILZ);
            ((C766650U5n) aRunnableS23S0101000_12.l0).LLLILZ(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBeautyItemMultiGuestAdapter@c8af.selectItemReal$1");
    }

    public static final void run$35(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("SpecialCardPictureManager@8a59.uploadAction$1");
        try {
            C01U6.LIZIZ(new AwS166S0101000_28(aRunnableS23S0101000_12.i1, (ReferralFeedBanner) aRunnableS23S0101000_12.l0, 8));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecialCardPictureManager@8a59.uploadAction$1");
    }

    public static final void run$36(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("SeaPdpBlackLightActivity@75f0.initTabBarAndViewPager$3");
        try {
            ((SeaPdpBlackLightActivity) aRunnableS23S0101000_12.l0).LLLLZLLIL(aRunnableS23S0101000_12.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaPdpBlackLightActivity@75f0.initTabBarAndViewPager$3");
    }

    public static final void run$4(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("TuxMultiSelectionSheet@ec28.onCreateView$5$1");
        try {
            ((LinearLayoutManager) aRunnableS23S0101000_12.l0).scrollToPositionWithOffset(aRunnableS23S0101000_12.i1, 0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TuxMultiSelectionSheet@ec28.onCreateView$5$1");
    }

    public static final void run$5(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("TuxSingleSelectionSheet@2355.onCreateView$5$1");
        try {
            ((LinearLayoutManager) aRunnableS23S0101000_12.l0).scrollToPositionWithOffset(aRunnableS23S0101000_12.i1, 0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TuxSingleSelectionSheet@2355.onCreateView$5$1");
    }

    public static final void run$6(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        ViewGroup.LayoutParams layoutParams;
        Integer numInvoke;
        C1C7U.LIZ("EditorTabTemplateHelpComponent@eef6.showTemplateScene$1");
        try {
            ViewGroup viewGroup = ((C1425490nCN) aRunnableS23S0101000_12.l0).LLJJI;
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null && (numInvoke = ((C1425490nCN) aRunnableS23S0101000_12.l0).LLILZ.invoke()) != null) {
                layoutParams.height = numInvoke.intValue() + aRunnableS23S0101000_12.i1;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditorTabTemplateHelpComponent@eef6.showTemplateScene$1");
    }

    public static final void run$7(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CollectionContentFragment@3f31.onResume$3$1");
        try {
            aRunnableS23S0101000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CollectionContentFragment@3f31.onResume$3$1");
    }

    public static final void run$8(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$doOnPageSelected$1");
        try {
            if (!((C1603970rqF) aRunnableS23S0101000_12.l0).LLJ.LLILLL()) {
                ((C1603970rqF) aRunnableS23S0101000_12.l0).LIZLLL(aRunnableS23S0101000_12.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$doOnPageSelected$1");
    }

    public static final void run$9(ARunnableS23S0101000_12 aRunnableS23S0101000_12) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.onViewCreated$3$onPageSelectedInternal$1");
        try {
            if (!((C1603970rqF) aRunnableS23S0101000_12.l0).LLJ.LLILLL()) {
                ((C1603970rqF) aRunnableS23S0101000_12.l0).LLJ.LLILLIZIL(aRunnableS23S0101000_12.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.onViewCreated$3$onPageSelectedInternal$1");
    }

    public ARunnableS23S0101000_12(C1603970rqF c1603970rqF, int i, int i2) {
        this.$t = i2;
        if (9 - i2 != 0) {
            this.l0 = c1603970rqF;
            this.i1 = i;
        } else {
            this.l0 = c1603970rqF;
            this.i1 = i;
        }
    }

    public ARunnableS23S0101000_12(C1603980rqG c1603980rqG, int i, int i2) {
        this.$t = i2;
        if (23 - i2 != 0) {
            this.l0 = c1603980rqG;
            this.i1 = i;
        } else {
            this.l0 = c1603980rqG;
            this.i1 = i;
        }
    }

    public ARunnableS23S0101000_12(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public ARunnableS23S0101000_12(C1603970rqF c1603970rqF, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = c1603970rqF;
        this.i1 = i;
    }
}
