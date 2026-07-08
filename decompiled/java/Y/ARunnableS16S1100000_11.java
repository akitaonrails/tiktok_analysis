package Y;

import X.C0SZ8;
import X.C0T6L;
import X.C1C7U;
import X.C20526015Tm;
import X.C20673215v0;
import X.C2188811AlT;
import X.C486660J6q;
import X.C702650RhH;
import X.C702670RhJ;
import X.C703900RjI;
import X.C706500RnU;
import X.C726920SfK;
import X.C727890Sgt;
import X.C729220Sj2;
import X.C786410Ut5;
import X.InterfaceC727210Sfn;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.api.component.caption.CommerceTransAndCaptionAssem;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryUploadProgressComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS16S1100000_11 implements Runnable {
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        WeakHandler weakHandler = ((BaseListFragmentPanel) this.l1).LLJLLIL;
        if (weakHandler != null) {
            weakHandler.removeMessages(10);
        }
        C0SZ8 c0sz8LJLIL = ((BaseListFragmentPanel) this.l1).LJLIL();
        if (c0sz8LJLIL != null && c0sz8LJLIL.getAweme() != null && TextUtils.equals(c0sz8LJLIL.getAweme().getAid(), this.s0) && AwemeSaaSExtKt.isLive(c0sz8LJLIL.getAweme()) && ((BaseListFragmentPanel) this.l1).isViewValid()) {
            Aweme aweme = c0sz8LJLIL.getAweme();
            if (aweme.getAuthor() != null) {
                ((BaseListFragmentPanel) this.l1).getContext();
                C486660J6q.LJIIIZ(1, aweme.getAuthor().getUid(), aweme.getAuthor().roomId, C486660J6q.LJFF("homepage_follow", "live", ((BaseListFragmentPanel) this.l1).zj().optString("request_id")));
            }
        }
    }

    public final void LIZ$1() {
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatching update: uid: ");
        sbLIZ.append(this.s0);
        sbLIZ.append(", aweme instance: ");
        sbLIZ.append(System.identityHashCode((Aweme) this.l1));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LIZ("AvatarEntryManager", strLIZIZ);
        Set set = (Set) ((LinkedHashMap) C726920SfK.LIZIZ).get(this.s0);
        if (set != null) {
            Aweme aweme = (Aweme) this.l1;
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((InterfaceC727210Sfn) it2.next()).LIZ(aweme);
            }
        }
        Set set2 = (Set) ((LinkedHashMap) C726920SfK.LIZIZ).get("*");
        if (set2 != null) {
            Aweme aweme2 = (Aweme) this.l1;
            Iterator it3 = set2.iterator();
            while (it3.hasNext()) {
                ((InterfaceC727210Sfn) it3.next()).LIZ(aweme2);
            }
        }
    }

    public static final void run$0(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        String aid;
        Aweme aweme;
        C1C7U.LIZ("ExploreFeedCell@544c.coverDisplayListener$2$2$delayRunnable$1");
        try {
            C20526015Tm item = ((ExploreFeedCell) aRunnableS16S1100000_11.l1).getItem();
            if (item != null && (aweme = item.LL) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, aRunnableS16S1100000_11.s0)) {
                ((ExploreFeedCell) aRunnableS16S1100000_11.l1).p7();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedCell@544c.coverDisplayListener$2$2$delayRunnable$1");
    }

    public static final void run$1(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("BaseListFragmentPanel@112.trackLivePlay$1");
        try {
            aRunnableS16S1100000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseListFragmentPanel@112.trackLivePlay$1");
    }

    public static final void run$2(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        String scheduleId;
        View contentView;
        C1C7U.LIZ("StoryUploadProgressComponent@3717.updateUploadProgressBarState$1");
        try {
            String str = aRunnableS16S1100000_11.s0;
            Aweme aweme = ((StoryUploadProgressComponent) aRunnableS16S1100000_11.l1).LLLFF;
            if (aweme != null) {
                scheduleId = AwemeBizExtKt.getScheduleId(aweme);
            } else {
                scheduleId = null;
            }
            if (Intrinsics.LJFF(str, scheduleId) && (contentView = ((StoryUploadProgressComponent) aRunnableS16S1100000_11.l1).getContentView()) != null) {
                C786410Ut5.LJLLLLLL(8, contentView);
            }
            String str2 = aRunnableS16S1100000_11.s0;
            if (str2 != null) {
                C729220Sj2.LL.LJIILIIL(str2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryUploadProgressComponent@3717.updateUploadProgressBarState$1");
    }

    public static final void run$3(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        Context context = (Context) aRunnableS16S1100000_11.l1;
        String str = aRunnableS16S1100000_11.s0;
        C1C7U.LIZ("LayoutPreloader@b24c.preloadForNewUserScenes$1L");
        if (!C20673215v0.LIZIZ(context, str)) {
            C20673215v0.LJII(context, str);
        }
        C1C7U.LIZIZ("LayoutPreloader@b24c.preloadForNewUserScenes$1L");
    }

    public static final void run$4(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        C702650RhH c702650RhHE71;
        C1C7U.LIZ("CommerceTransAndCaptionAssem@7e9.resetCaptionPositionIfNeed$runnable$1");
        try {
            AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(621);
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) ((CommerceTransAndCaptionAssem) aRunnableS16S1100000_11.l1).LLJJIJIL.getValue();
            if (interactAreaCommonAbility != null && (c702650RhHE71 = interactAreaCommonAbility.E71()) != null) {
                c702650RhHE71.LIZ(aRunnableS16S1100000_11.s0, new C702670RhJ(aFwS243S0000000_11));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceTransAndCaptionAssem@7e9.resetCaptionPositionIfNeed$runnable$1");
    }

    public static final void run$5(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("AvatarEntryManager@5541.notifyUserStoryUpdated$1");
        try {
            aRunnableS16S1100000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarEntryManager@5541.notifyUserStoryUpdated$1");
    }

    public static final void run$6(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FcpSlotMetricSession@d56d.onAwemeChanged$$inlined$runOnMainThread$1");
        try {
            C703900RjI c703900RjI = (C703900RjI) aRunnableS16S1100000_11.l1;
            c703900RjI.LIZIZ = aRunnableS16S1100000_11.s0;
            new AwS555S0100000_11(c703900RjI, 1510);
            C0T6L.LIZLLL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FcpSlotMetricSession@d56d.onAwemeChanged$$inlined$runOnMainThread$1");
    }

    public static final void run$7(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        String aid;
        Aweme aweme;
        C1C7U.LIZ("ExploreFeedCell@544c.triggerDirectHighlight$delayRunnable$1");
        try {
            C20526015Tm item = ((ExploreFeedCell) aRunnableS16S1100000_11.l1).getItem();
            if (item != null && (aweme = item.LL) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, aRunnableS16S1100000_11.s0)) {
                ((ExploreFeedCell) aRunnableS16S1100000_11.l1).p7();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFeedCell@544c.triggerDirectHighlight$delayRunnable$1");
    }

    public static final void run$8(ARunnableS16S1100000_11 aRunnableS16S1100000_11) {
        boolean zLIZ;
        C1C7U.LIZ("StoryLayoutInflater@6b12.preloadWithCheckCache$1");
        try {
            if (!C20673215v0.LIZIZ((Context) aRunnableS16S1100000_11.l1, aRunnableS16S1100000_11.s0)) {
                C20673215v0.LJII(C706500RnU.LIZ((Context) aRunnableS16S1100000_11.l1, aRunnableS16S1100000_11.s0), aRunnableS16S1100000_11.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryLayoutInflater@6b12.preloadWithCheckCache$1");
    }

    public ARunnableS16S1100000_11(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
