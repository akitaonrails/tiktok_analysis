package Y;

import X.AnonymousClass0208;
import X.C13LZ;
import X.C1594406Mc;
import X.C1778070wN3;
import X.C1785320wYk;
import X.C1796440wqg;
import X.C1802410x0J;
import X.C1802580x0a;
import X.C1842600y38;
import X.C1846010y8d;
import X.C1849470yED;
import X.C1861240yXC;
import X.C1864930yd9;
import X.C1C7U;
import X.C20553115bd;
import X.C497740JfY;
import X.EnumC904370Zdr;
import X.InterfaceC1804390x3V;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnGlobalLayoutListenerC1849500yEG;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.event.WalletRechargePanelRendered;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletNewRechargeLatencyTrackingEnabledSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import com.ss.android.ugc.aweme.live.liveevent.sticker.sheet.base.SingleOptionSelectionSheet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS32S0201000_27 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        final CreatorRankingSubPageFragment creatorRankingSubPageFragment = (CreatorRankingSubPageFragment) this.l0;
        final C1778070wN3 c1778070wN3 = ((C1785320wYk) this.l1).LIZLLL.LIZLLL;
        final int i = this.i2;
        creatorRankingSubPageFragment.getClass();
        if (c1778070wN3 == null || c1778070wN3.LIZIZ.LIZ.type != i || c1778070wN3.LIZ == creatorRankingSubPageFragment.LLILZIL || (viewOnAttachStateChangeListenerC20604515jv = creatorRankingSubPageFragment.LLILLL) == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(viewOnAttachStateChangeListenerC20604515jv, new Runnable() { // from class: X.0wYX
            public final void LIZ() {
                C1778070wN3 c1778070wN32 = c1778070wN3;
                long j = c1778070wN32.LIZ;
                CreatorRankingSubPageFragment creatorRankingSubPageFragment2 = creatorRankingSubPageFragment;
                if (j != creatorRankingSubPageFragment2.LLILZIL) {
                    if (!creatorRankingSubPageFragment2.OR(c1778070wN32)) {
                        creatorRankingSubPageFragment.LLILZIL = 0L;
                        return;
                    }
                    CreatorRankingSubPageFragment creatorRankingSubPageFragment3 = creatorRankingSubPageFragment;
                    C1778070wN3 c1778070wN33 = c1778070wN3;
                    creatorRankingSubPageFragment3.LLILZIL = c1778070wN33.LIZ;
                    CreatorRankingSubPageFragment creatorRankingSubPageFragment4 = creatorRankingSubPageFragment;
                    if (creatorRankingSubPageFragment4.PR(c1778070wN33.LIZIZ, c1778070wN33.LIZJ, i, new AwS428S0200000_27(creatorRankingSubPageFragment4, c1778070wN33, 102), new AwS571S0100000_27(creatorRankingSubPageFragment, 1384), new AwS271S0300000_27(viewOnAttachStateChangeListenerC20604515jv, creatorRankingSubPageFragment, c1778070wN3, 26)) || !creatorRankingSubPageFragment.OR(c1778070wN3)) {
                        return;
                    }
                    creatorRankingSubPageFragment.LLILZIL = 0L;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.handlePendingScrollToRank$$inlined$doOnPreDraw$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.handlePendingScrollToRank$$inlined$doOnPreDraw$1");
            }
        });
    }

    public final void LIZ$1() {
        DataChannel dataChannel;
        RechargeDialogNew rechargeDialogNew;
        Context context;
        if (this.i2 == 302) {
            ((RechargeDialogNew) this.l0).qS().getClass();
            if (!C1796440wqg.LIZIZ() && (context = (rechargeDialogNew = (RechargeDialogNew) this.l0).LLJLL) != null) {
                C1802580x0a c1802580x0a = C1802580x0a.LIZ;
                String string = context.getString(2131844614);
                String string2 = context.getString(2131844615);
                String strXQ2 = rechargeDialogNew.qS().XQ2();
                Diamond value = rechargeDialogNew.qS().LLLLIILL.getValue();
                C1802410x0J c1802410x0J = new C1802410x0J(strXQ2, value != null ? value.count : 0);
                AnonymousClass0208 anonymousClass0208 = AnonymousClass0208.get$arr$(14);
                c1802580x0a.getClass();
                C1802580x0a.LIZ(context, string, string2, "context", "package", 302, c1802410x0J, 2131837517, anonymousClass0208);
            }
        }
        if (!LiveWalletNewRechargeLatencyTrackingEnabledSetting.INSTANCE.getValue() || (dataChannel = ((RechargeDialogNew) this.l0).LLJZ) == null) {
            return;
        }
        dataChannel.zW(WalletRechargePanelRendered.class, new Pair(Boolean.FALSE, (InterfaceC1804390x3V) this.l1));
    }

    public final void LIZ$2() {
        DetailMediaGridContentAssem detailMediaGridContentAssem = (DetailMediaGridContentAssem) this.l0;
        detailMediaGridContentAssem.LLJJJIL = true;
        if (this.i2 < detailMediaGridContentAssem.LLJJJJLIIL.LIZ && detailMediaGridContentAssem.kp().getScrollState() == 0) {
            detailMediaGridContentAssem.kp().scrollToPosition(0);
        }
        MediaGridViewModel mediaGridViewModelIp = ((DetailMediaGridContentAssem) this.l0).ip();
        EnumC904370Zdr enumC904370Zdr = (EnumC904370Zdr) this.l1;
        int i = C1594406Mc.LIZ[enumC904370Zdr.ordinal()];
        if (i == 1) {
            if (mediaGridViewModelIp.LLILZIL) {
                mediaGridViewModelIp.LLILZIL = false;
                mediaGridViewModelIp.JQ2(enumC904370Zdr);
                return;
            }
            return;
        }
        if (i == 2 && mediaGridViewModelIp.LLILZLL) {
            mediaGridViewModelIp.LLILZLL = false;
            mediaGridViewModelIp.JQ2(enumC904370Zdr);
        }
    }

    public final void LIZ$3() {
        int scrollX = C497740JfY.LJJ() ? ((C1842600y38) this.l0).LJIILIIL.getScrollX() - this.i2 : ((C1842600y38) this.l0).LJIILIIL.getScrollX() + this.i2;
        C1842600y38 c1842600y38 = (C1842600y38) this.l0;
        c1842600y38.LJJIJ = ValueAnimator.ofInt(c1842600y38.LJIILIIL.getScrollX(), scrollX);
        ValueAnimator valueAnimator = ((C1842600y38) this.l0).LJJIJ;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator2 = ((C1842600y38) this.l0).LJJIJ;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration((long) (((this.i2 * 1.0f) / r1.LIZIZ.LJII) * 1000));
        }
        C1842600y38 c1842600y382 = (C1842600y38) this.l0;
        ValueAnimator valueAnimator3 = c1842600y382.LJJIJ;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS275S0100000_27(c1842600y382, 34));
        }
        C1842600y38 c1842600y383 = (C1842600y38) this.l0;
        ValueAnimator valueAnimator4 = c1842600y383.LJJIJ;
        if (valueAnimator4 != null) {
            valueAnimator4.addListener(new C1864930yd9(c1842600y383, (CharSequence) this.l1, 2));
        }
        ValueAnimator valueAnimator5 = ((C1842600y38) this.l0).LJJIJ;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    public static final void run$0(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1$2$3");
        try {
            aRunnableS32S0201000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.onViewCreated$2$1$2$3");
    }

    public static final void run$1(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        C1C7U.LIZ("RechargeDialogNew@383d.onProductLoadError$2");
        try {
            aRunnableS32S0201000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RechargeDialogNew@383d.onProductLoadError$2");
    }

    public static final void run$2(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        int count;
        C1C7U.LIZ("ExploreViewPagerComponent@6933.selectTopicTab$1$1");
        try {
            PagerAdapter adapter = ((C20553115bd) aRunnableS32S0201000_27.l0).getAdapter();
            if (adapter != null && (count = adapter.getCount()) > 0) {
                int iLJ = C13LZ.LJ(aRunnableS32S0201000_27.i2, 0, count - 1);
                if (((C20553115bd) aRunnableS32S0201000_27.l0).getCurrentItem() == iLJ) {
                    C1846010y8d c1846010y8d = ((ExploreViewPagerComponent) aRunnableS32S0201000_27.l1).LLJILJILJ;
                    if (c1846010y8d != null) {
                        c1846010y8d.LJIIIIZZ(iLJ, 0.0f, true, true);
                    }
                } else {
                    ((C20553115bd) aRunnableS32S0201000_27.l0).setCurrentItem(iLJ, true);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.selectTopicTab$1$1");
    }

    public static final void run$3(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        C1C7U.LIZ("DetailMediaGridContentAssem@3762.refresh$2");
        try {
            aRunnableS32S0201000_27.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailMediaGridContentAssem@3762.refresh$2");
    }

    public static final void run$4(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        int height;
        C1C7U.LIZ("SingleOptionSelectionSheet@fa99.onCreateView$7$1");
        try {
            ((LinearLayoutManager) aRunnableS32S0201000_27.l0).scrollToPositionWithOffset(aRunnableS32S0201000_27.i2, 0);
            SingleOptionSelectionSheet singleOptionSelectionSheet = (SingleOptionSelectionSheet) aRunnableS32S0201000_27.l1;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = singleOptionSelectionSheet.LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                ViewGroup viewGroup = singleOptionSelectionSheet.LLJJJIL;
                if (viewGroup != null) {
                    height = viewGroup.getHeight();
                } else {
                    height = 0;
                }
                viewOnAttachStateChangeListenerC20604515jv.setPadding(0, 0, 0, height);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((SingleOptionSelectionSheet) aRunnableS32S0201000_27.l1).LLJJJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                viewOnAttachStateChangeListenerC20604515jv2.requestLayout();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SingleOptionSelectionSheet@fa99.onCreateView$7$1");
    }

    public static final void run$5(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MarqueeProcessor@5a07.playInternal$1");
        try {
            aRunnableS32S0201000_27.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MarqueeProcessor@5a07.playInternal$1");
    }

    public static final void run$6(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoScrollToBottomIndicator@9c54.checkScrollState$2");
        try {
            ((RecyclerView) aRunnableS32S0201000_27.l0).smoothScrollToPosition(aRunnableS32S0201000_27.i2 - ((C1861240yXC) aRunnableS32S0201000_27.l1).LJI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoScrollToBottomIndicator@9c54.checkScrollState$2");
    }

    public static final void run$7(ARunnableS32S0201000_27 aRunnableS32S0201000_27) {
        boolean zLIZ;
        C1C7U.LIZ("PoiBottomBarDescLayout@d4d1.scheduleMeasure$1");
        try {
            ((C1849470yED) aRunnableS32S0201000_27.l0).LJIILIIL(aRunnableS32S0201000_27.i2, (ViewTreeObserverOnGlobalLayoutListenerC1849500yEG) aRunnableS32S0201000_27.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiBottomBarDescLayout@d4d1.scheduleMeasure$1");
    }

    public ARunnableS32S0201000_27(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
