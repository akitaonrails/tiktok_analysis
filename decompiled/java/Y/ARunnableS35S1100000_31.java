package Y;

import X.C0CAU;
import X.C1149270g0r;
import X.C1303560k1i;
import X.C150D;
import X.C1548820qPI;
import X.C15SM;
import X.C15SN;
import X.C1AMZ;
import X.C1C7U;
import X.C20337314hv;
import X.C20526015Tm;
import X.C20580115fz;
import X.C20581915gH;
import X.C20589415hU;
import X.C20610115kp;
import X.C20644415qM;
import X.C20644515qN;
import X.C20644815qQ;
import X.C20645115qT;
import X.C2188811AlT;
import X.C2246671Cwb;
import X.C316990Cbh;
import X.C785410UrT;
import X.C844470XAv;
import X.DialogC20589315hT;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.content.MutableContextWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedComponent;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mention.ui.assem.VideoCaptionMentionSearchListAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS35S1100000_31 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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

    public final void LIZ$1() {
        try {
            C2246671Cwb c2246671Cwb = C2246671Cwb.LIZ;
            Context context = (Context) this.l1;
            String str = this.s0;
            c2246671Cwb.getClass();
            C2246671Cwb.LJFF(context, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryPreloadFromExternal failed, preloadPath=");
            sbLIZ.append(this.s0);
            sbLIZ.append(", error=");
            sbLIZ.append(th.getMessage());
            C1149270g0r.LIZ("LiveGiftVideoCacheManager_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ$2() {
        MutableContextWrapper mutableContextWrapper;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((C20644815qQ) this.l1).LIZJ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            return;
        }
        ((C20644815qQ) this.l1).LIZJ = null;
        C1303560k1i c1303560k1i = C20644815qQ.LJIIIIZZ;
        C20644415qM c20644415qMLIZ = C20644515qN.LIZ(((C20644815qQ) this.l1).LIZ);
        if (c20644415qMLIZ == null) {
            C20589415hU.LIZIZ("removeManager: key is null");
        } else {
            C1303560k1i c1303560k1i2 = C20644815qQ.LJIIIIZZ;
            synchronized (c1303560k1i2) {
                try {
                    c1303560k1i2.remove(c20644415qMLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Context context = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getContext();
        if ((context instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context) != null) {
            C844470XAv.LIZ.getClass();
            mutableContextWrapper.setBaseContext(C844470XAv.LIZ());
        }
        C1548820qPI.LJIIIIZZ("on_pop_appear_receive", ((C20644815qQ) this.l1).LJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy: destroy, tag=");
        sbLIZ.append(this.s0);
        sbLIZ.append(", popupKey=");
        sbLIZ.append(((C20644815qQ) this.l1).LIZ.popupKey);
        C20589415hU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C0CAU.LIZIZ(new ARunnableS33S1200000_31((C20644815qQ) this.l1, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this.s0, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$3() {
        ExploreFeedCell exploreFeedCell;
        List<C20526015Tm> list = ((C15SN) ((ExploreTopicGeneralFeedListComponent) this.l1).ip().getState()).LL.LLILZ;
        if (list == null) {
            return;
        }
        String str = this.s0;
        Iterator<C20526015Tm> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LL.getAid(), str)) {
                if (i >= 0) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((ExploreTopicGeneralFeedListComponent) this.l1).Go().findViewHolderForAdapterPosition(i);
                    if (!(viewHolderFindViewHolderForAdapterPosition instanceof ExploreFeedCell) || (exploreFeedCell = (ExploreFeedCell) viewHolderFindViewHolderForAdapterPosition) == null) {
                        return;
                    }
                    exploreFeedCell.r7(this.s0);
                    return;
                }
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$4() {
        ExploreFeedCell exploreFeedCell;
        C20526015Tm c20526015Tm;
        Aweme aweme;
        List<C150D> list = ((C15SM) ((ExploreFeedComponent) this.l1).ip().getState()).LLILZ.LLILZ;
        if (list == null) {
            return;
        }
        String str = this.s0;
        Iterator<C150D> it2 = list.iterator();
        int i = 0;
        while (true) {
            String aid = null;
            if (!it2.hasNext()) {
                return;
            }
            C150D next = it2.next();
            if ((next instanceof C20526015Tm) && (c20526015Tm = (C20526015Tm) next) != null && (aweme = c20526015Tm.LL) != null) {
                aid = aweme.getAid();
            }
            if (Intrinsics.LJFF(aid, str)) {
                if (i >= 0) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((ExploreFeedComponent) this.l1).Go().findViewHolderForAdapterPosition(i);
                    if (!(viewHolderFindViewHolderForAdapterPosition instanceof ExploreFeedCell) || (exploreFeedCell = (ExploreFeedCell) viewHolderFindViewHolderForAdapterPosition) == null) {
                        return;
                    }
                    exploreFeedCell.r7(this.s0);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LIZ$5() {
        if (Intrinsics.LJFF(((C20337314hv) this.l1).LJ.peek(), this.s0)) {
            ((C20337314hv) this.l1).LJ.pop();
            ((C20337314hv) this.l1).LJIIIIZZ().storeString("exit_monitor_key_last_page", ((C20337314hv) this.l1).LJ.peek());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS35S1100000_31.LIZ$0():void");
    }

    public static final void run$0(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreResponseInterceptorFactory$ChunkFrontLoadAdapter@2e27.triggerParallelPreload$1");
        try {
            aRunnableS35S1100000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreResponseInterceptorFactory$ChunkFrontLoadAdapter@2e27.triggerParallelPreload$1");
    }

    public static final void run$1(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCaptionMentionSearchListAssem@5192.onViewCreated$11$1$1$1");
        try {
            ((VideoCaptionMentionSearchListAssem) aRunnableS35S1100000_31.l1).ip().LL = aRunnableS35S1100000_31.s0;
            C20610115kp c20610115kp = (C20610115kp) ((VideoCaptionMentionSearchListAssem) aRunnableS35S1100000_31.l1).LLJJ.getValue();
            c20610115kp.LLJIJIL.onNext(aRunnableS35S1100000_31.s0);
            C316990Cbh c316990Cbh = (C316990Cbh) ((VideoCaptionMentionSearchListAssem) aRunnableS35S1100000_31.l1).LLJJI.getValue();
            c316990Cbh.LLJIJIL.onNext(aRunnableS35S1100000_31.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCaptionMentionSearchListAssem@5192.onViewCreated$11$1$1$1");
    }

    public static final void run$10(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("StoryThoughtCreationFragment@2547.setUpBubbleViewQuickInput$1$1");
        try {
            ((C20581915gH) aRunnableS35S1100000_31.l1).LLJILLL.LJIIJJI(aRunnableS35S1100000_31.s0.length());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryThoughtCreationFragment@2547.setUpBubbleViewQuickInput$1$1");
    }

    public static final void run$11(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.setUpBubbleViewQuickInput$1$1");
        try {
            ((C20580115fz) aRunnableS35S1100000_31.l1).LLJJJIL.LJIIJJI(aRunnableS35S1100000_31.s0.length());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.setUpBubbleViewQuickInput$1$1");
    }

    public static final void run$12(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.setUpBubbleViewQuickInput$2$1");
        try {
            ((C20580115fz) aRunnableS35S1100000_31.l1).LLJJJIL.LJIIJJI(aRunnableS35S1100000_31.s0.length());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.setUpBubbleViewQuickInput$2$1");
    }

    public static final void run$13(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("StoryThoughtAvatarCreationFragment@ce9f.setUpBubbleViewQuickInput$3$1");
        try {
            ((C20580115fz) aRunnableS35S1100000_31.l1).LLJJJIL.LJIIJJI(aRunnableS35S1100000_31.s0.length());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryThoughtAvatarCreationFragment@ce9f.setUpBubbleViewQuickInput$3$1");
    }

    public static final void run$14(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        C1AMZ c1amz = (C1AMZ) aRunnableS35S1100000_31.l1;
        String str = aRunnableS35S1100000_31.s0;
        C1C7U.LIZ("AudioEnginePlayer@a813.setSrc$1L");
        c1amz.LJFF(str);
        C1C7U.LIZIZ("AudioEnginePlayer@a813.setSrc$1L");
    }

    public static final void run$15(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        C1AMZ c1amz = (C1AMZ) aRunnableS35S1100000_31.l1;
        String str = aRunnableS35S1100000_31.s0;
        C1C7U.LIZ("AudioEnginePlayer@a813.setSrc$2L");
        c1amz.LJFF(str);
        C1C7U.LIZIZ("AudioEnginePlayer@a813.setSrc$2L");
    }

    public static final void run$2(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("VideoCaptionMentionSearchListAssem@5192.onViewCreated$11$1$1");
        try {
            HandlerHook.viewPost(((VideoCaptionMentionSearchListAssem) aRunnableS35S1100000_31.l1).Go(), new ARunnableS35S1100000_31((VideoCaptionMentionSearchListAssem) aRunnableS35S1100000_31.l1, aRunnableS35S1100000_31.s0, 1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoCaptionMentionSearchListAssem@5192.onViewCreated$11$1$1");
    }

    public static final void run$3(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftVideoCacheManager@6da.tryPreload$1");
        try {
            C2246671Cwb c2246671Cwb = C2246671Cwb.LIZ;
            Context context = (Context) aRunnableS35S1100000_31.l1;
            String str = aRunnableS35S1100000_31.s0;
            c2246671Cwb.getClass();
            C2246671Cwb.LJFF(context, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftVideoCacheManager@6da.tryPreload$1");
    }

    public static final void run$4(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveGiftVideoCacheManager@6da.tryPreloadFromExternal$1");
        try {
            aRunnableS35S1100000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveGiftVideoCacheManager@6da.tryPreloadFromExternal$1");
    }

    public static final void run$5(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("FeedDynamicPopupTask@29be.onCallClose$1");
        try {
            C20645115qT c20645115qT = (C20645115qT) aRunnableS35S1100000_31.l1;
            c20645115qT.LLJIJIL = aRunnableS35S1100000_31.s0;
            DialogC20589315hT dialogC20589315hT = c20645115qT.LLILZLL;
            if (dialogC20589315hT != null) {
                dialogC20589315hT.dismiss();
                C785410UrT.LIZ(dialogC20589315hT);
            }
            ((C20645115qT) aRunnableS35S1100000_31.l1).LLJIJIL = null;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedDynamicPopupTask@29be.onCallClose$1");
    }

    public static final void run$6(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("FeedPopupSparkManager@3661.destroy$1");
        try {
            aRunnableS35S1100000_31.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedPopupSparkManager@3661.destroy$1");
    }

    public static final void run$7(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreTopicGeneralFeedListComponent@bc19.triggerNoOpHighlightIfNeeded$1");
        try {
            aRunnableS35S1100000_31.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListComponent@bc19.triggerNoOpHighlightIfNeeded$1");
    }

    public static final void run$8(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreFeedComponent@39dc.triggerCellHighlightDirectly$1");
        try {
            aRunnableS35S1100000_31.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedComponent@39dc.triggerCellHighlightDirectly$1");
    }

    public static final void run$9(ARunnableS35S1100000_31 aRunnableS35S1100000_31) {
        boolean zLIZ;
        C1C7U.LIZ("AbnormalExitMonitor@8384.stepOut$1");
        try {
            aRunnableS35S1100000_31.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbnormalExitMonitor@8384.stepOut$1");
    }

    public ARunnableS35S1100000_31(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
