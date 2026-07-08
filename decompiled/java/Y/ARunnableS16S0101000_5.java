package Y;

import X.C0EJZ;
import X.C0F6N;
import X.C0F6O;
import X.C0F6U;
import X.C0F90;
import X.C0FO6;
import X.C113Z;
import X.C1390380mHk;
import X.C1919207fS;
import X.C19U1;
import X.C1C7U;
import X.C201955140j;
import X.C21578619ce;
import X.C2188811AlT;
import X.C360690ECd;
import X.C360920EDa;
import X.C384570F5z;
import X.C384580F6a;
import X.C389250FNz;
import X.C390230FRt;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.ui.AudioBeatsPanelFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS3S0000001_5;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS16S0101000_5 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C384580F6a c384580F6a;
        C0F90 c0f90;
        RecyclerView recyclerView = ((C0F6N) this.l0).LLIZLLLIL;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView != null ? recyclerView.findViewHolderForAdapterPosition(this.i1) : null;
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof C384580F6a) || (c384580F6a = (C384580F6a) viewHolderFindViewHolderForAdapterPosition) == null || (c0f90 = c384580F6a.LL) == null) {
            return;
        }
        int i = this.i1;
        C0F6N c0f6n = (C0F6N) this.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> requestFocusAtPos: requestFocus fmc pos ");
        sbLIZ.append(i);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        c0f90.requestFocus();
        c0f6n.LLILZIL.Wf(c0f90);
    }

    public static final void run$0(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("VideoLengthChecker@b1d0.removeMusicAndShowToast$runnable$1");
        try {
            Activity activity = (Activity) aRunnableS16S0101000_5.l0;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(aRunnableS16S0101000_5.i1);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 3008, creativeToastBuilder);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoLengthChecker@b1d0.removeMusicAndShowToast$runnable$1");
    }

    public static final void run$1(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C0F6O c0f6o;
        C0F90 c0f90;
        C1C7U.LIZ("SubtitleAdapter@e35a.requestFocusAtPos$1");
        try {
            RecyclerView recyclerView = ((C384570F5z) aRunnableS16S0101000_5.l0).LLJILLL;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(aRunnableS16S0101000_5.i1);
            }
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C0F6O) && (c0f6o = (C0F6O) viewHolderFindViewHolderForAdapterPosition) != null && (c0f90 = c0f6o.LLIZLLLIL) != null) {
                c0f90.requestFocus();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubtitleAdapter@e35a.requestFocusAtPos$1");
    }

    public static final void run$10(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("LyricStickerEffectAdapter@5798.autoClickDefaultApplyItem$1");
        try {
            RecyclerView recyclerView = ((C0FO6) aRunnableS16S0101000_5.l0).LLILLL;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(aRunnableS16S0101000_5.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LyricStickerEffectAdapter@5798.autoClickDefaultApplyItem$1");
    }

    public static final void run$11(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("MaxBidFragmentKt@5d01.tryScrollToBottom$1");
        try {
            if (((C21578619ce) aRunnableS16S0101000_5.l0).getParent() != null) {
                ((C21578619ce) aRunnableS16S0101000_5.l0).scrollTo(0, aRunnableS16S0101000_5.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MaxBidFragmentKt@5d01.tryScrollToBottom$1");
    }

    public static final void run$12(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("UsMaxBidFragmentKt@c0eb.tryScrollToBottom$1");
        try {
            if (((C21578619ce) aRunnableS16S0101000_5.l0).getParent() != null) {
                ((C21578619ce) aRunnableS16S0101000_5.l0).scrollTo(0, aRunnableS16S0101000_5.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UsMaxBidFragmentKt@c0eb.tryScrollToBottom$1");
    }

    public static final void run$13(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("AutoPagerController@b4d2.scheduleAutoAdvance$exec$1");
        try {
            int currentItem = ((ViewPager) aRunnableS16S0101000_5.l0).getCurrentItem();
            int i = aRunnableS16S0101000_5.i1;
            if (currentItem != i) {
                ((ViewPager) aRunnableS16S0101000_5.l0).setCurrentItem(i, true);
            }
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("AutoPagerController@b4d2.scheduleAutoAdvance$exec$1");
    }

    public static final void run$14(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        View viewFindViewById;
        C1C7U.LIZ("EditEffectPanelView@6a50.requestEffectA11yFocus$1");
        try {
            ViewPager viewPager = ((C113Z) aRunnableS16S0101000_5.l0).LLJILJIL;
            if (viewPager == null) {
                viewPager = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("position:");
            sbLIZ.append(aRunnableS16S0101000_5.i1);
            ViewGroup viewGroup = (ViewGroup) viewPager.findViewWithTag(C2188811AlT.LIZIZ(sbLIZ));
            if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.l1n)) != null) {
                viewFindViewById.sendAccessibilityEvent(8);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditEffectPanelView@6a50.requestEffectA11yFocus$1");
    }

    public static final void run$15(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("AudioBeatsPanelFragment@8e62.initView$10$1$1");
        try {
            ((AudioBeatsPanelFragment) aRunnableS16S0101000_5.l0).mT().LIZ(aRunnableS16S0101000_5.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AudioBeatsPanelFragment@8e62.initView$10$1$1");
    }

    public static final void run$2(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("SubtitleEditAdapter@f76b.mergeSentences$2");
        try {
            C0F6U c0f6u = (C0F6U) aRunnableS16S0101000_5.l0;
            c0f6u.LLJILJILJ = false;
            LinearLayoutManager linearLayoutManager = c0f6u.LLJJ;
            if (linearLayoutManager != null) {
                int i = aRunnableS16S0101000_5.i1;
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int i2 = i - 1;
                if (iFindFirstCompletelyVisibleItemPosition > i2 || i2 > iFindLastCompletelyVisibleItemPosition) {
                    linearLayoutManager.scrollToPosition(i2);
                }
            }
            C0F6U c0f6u2 = (C0F6U) aRunnableS16S0101000_5.l0;
            int i3 = aRunnableS16S0101000_5.i1 - 1;
            RecyclerView recyclerView = c0f6u2.LLIZ;
            if (recyclerView != null) {
                HandlerHook.viewPost(recyclerView, new ARunnableS16S0101000_5(i3, c0f6u2, 3));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubtitleEditAdapter@f76b.mergeSentences$2");
    }

    public static final void run$3(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C384580F6a c384580F6a;
        C0F90 c0f90;
        C1C7U.LIZ("SubtitleEditAdapter@f76b.requestFocusAtPos$1");
        try {
            RecyclerView recyclerView = ((C0F6U) aRunnableS16S0101000_5.l0).LLIZ;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(aRunnableS16S0101000_5.i1);
            }
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C384580F6a) && (c384580F6a = (C384580F6a) viewHolderFindViewHolderForAdapterPosition) != null && (c0f90 = c384580F6a.LL) != null) {
                C0F6U c0f6u = (C0F6U) aRunnableS16S0101000_5.l0;
                c0f90.requestFocus();
                c0f6u.LL.LJI.showSoftInput(c0f90, 1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubtitleEditAdapter@f76b.requestFocusAtPos$1");
    }

    public static final void run$4(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("AddYoursEditViewItem@a7cd.wrapStickerText$1");
        try {
            float fLJIIJ = (aRunnableS16S0101000_5.i1 + C1919207fS.LJIIJ()) / ((C390230FRt) aRunnableS16S0101000_5.l0).LJIIIIZZ().getWidth();
            C390230FRt c390230FRt = (C390230FRt) aRunnableS16S0101000_5.l0;
            if (fLJIIJ <= 1.0f) {
                c390230FRt.LIZJ.LJ.LIZLLL(new AwS3S0000001_5(fLJIIJ, 18), true);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AddYoursEditViewItem@a7cd.wrapStickerText$1");
    }

    public static final void run$5(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C360690ECd c360690ECd;
        C0EJZ resourceMultiTab;
        C1C7U.LIZ("VideoTransitionPanelScene@6369.selectIndex$1");
        try {
            C360690ECd c360690ECd2 = ((C360920EDa) aRunnableS16S0101000_5.l0).LLLII;
            if (c360690ECd2 != null && c360690ECd2.getParent() != null && ((C360920EDa) aRunnableS16S0101000_5.l0).isVisible() && (c360690ECd = ((C360920EDa) aRunnableS16S0101000_5.l0).LLLII) != null && (resourceMultiTab = c360690ECd.getResourceMultiTab()) != null) {
                int i = aRunnableS16S0101000_5.i1;
                C19U1 c19u1 = (C19U1) resourceMultiTab.findViewById(R.id.oq1);
                if (c19u1 != null) {
                    c19u1.selectTab(c19u1.getTabAt(i));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoTransitionPanelScene@6369.selectIndex$1");
    }

    public static final void run$6(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        View view;
        C1C7U.LIZ("BottomBarUIManager@58c3.performItemClick$1$1$1$1$1");
        try {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((RecyclerView) aRunnableS16S0101000_5.l0).findViewHolderForAdapterPosition(aRunnableS16S0101000_5.i1);
            if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                view.performClick();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomBarUIManager@58c3.performItemClick$1$1$1$1$1");
    }

    public static final void run$7(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("LyricStickerEffectScene@b672.handleAutoSelect$1");
        try {
            RecyclerView recyclerViewLLLLLJLJLL = ((C389250FNz) aRunnableS16S0101000_5.l0).LLLLLJLJLL();
            if (recyclerViewLLLLLJLJLL != null) {
                recyclerViewLLLLLJLJLL.scrollToPosition(aRunnableS16S0101000_5.i1);
            }
            RecyclerView recyclerViewLLLLLJLJLL2 = ((C389250FNz) aRunnableS16S0101000_5.l0).LLLLLJLJLL();
            if (recyclerViewLLLLLJLJLL2 != null) {
                HandlerHook.viewPost(recyclerViewLLLLLJLJLL2, new ARunnableS105S0100000_5((C389250FNz) aRunnableS16S0101000_5.l0, 84));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LyricStickerEffectScene@b672.handleAutoSelect$1");
    }

    public static final void run$8(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("CaptionEditAdapter@a1b9.mergeSentences$2");
        try {
            C0F6N c0f6n = (C0F6N) aRunnableS16S0101000_5.l0;
            c0f6n.LLJILLL = false;
            LinearLayoutManager linearLayoutManager = c0f6n.LLJ;
            if (linearLayoutManager != null) {
                int i = aRunnableS16S0101000_5.i1;
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int i2 = i - 1;
                if (iFindFirstCompletelyVisibleItemPosition > i2 || i2 > iFindLastCompletelyVisibleItemPosition) {
                    linearLayoutManager.scrollToPosition(i2);
                }
            }
            C0F6N c0f6n2 = (C0F6N) aRunnableS16S0101000_5.l0;
            int i3 = aRunnableS16S0101000_5.i1 - 1;
            RecyclerView recyclerView = c0f6n2.LLIZLLLIL;
            if (recyclerView != null) {
                HandlerHook.viewPost(recyclerView, new ARunnableS16S0101000_5(i3, c0f6n2, 9));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CaptionEditAdapter@a1b9.mergeSentences$2");
    }

    public static final void run$9(ARunnableS16S0101000_5 aRunnableS16S0101000_5) {
        boolean zLIZ;
        C1C7U.LIZ("CaptionEditAdapter@a1b9.requestFocusAtPos$1");
        try {
            aRunnableS16S0101000_5.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CaptionEditAdapter@a1b9.requestFocusAtPos$1");
    }

    public ARunnableS16S0101000_5(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
