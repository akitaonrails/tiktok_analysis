package X;

import Y.ARunnableS16S1200000_11;
import Y.ARunnableS35S1200000_33;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Live5vvOptExp;
import com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ACY, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACY implements InterfaceC1601140rlg {
    public static InterfaceC475410Ikd LIZIZ;
    public static volatile String LJ;
    public static volatile boolean LJFF;
    public static volatile boolean LJIIJJI;
    public static volatile boolean LJIIL;
    public static volatile Choreographer LJIJ;
    public static volatile ChoreographerFrameCallbackC2175611ACp LJIJI;
    public static volatile boolean LJIJJ;
    public static volatile RunnableC2175551ACj LJIJJLI;
    public static volatile boolean LJIL;
    public static volatile FeedRecommendFragment LJJ;
    public static volatile HashMap<String, View> LJJI;
    public static volatile LinkedList<View> LJJIFFI;
    public static volatile String LJJII;
    public static volatile int LJJIIJ;
    public static volatile int LJJIIJZLJL;
    public static volatile HashMap<String, C2175491ACd> LJJIIZ;
    public static volatile HashMap<String, C2175491ACd> LJJIIZI;
    public static volatile HashMap<String, BaseFeedLiveViewHolder> LJJIJ;
    public static volatile String LJJIJIIJI;
    public static volatile Aweme LJJIJIIJIL;
    public static volatile LiveRoomStruct LJJIJIL;
    public static volatile InterfaceC480510Isr LJJIJL;
    public static final C1ACY LIZ = new C1ACY();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILJJIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILLIIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIZILJ = new AtomicBoolean(false);
    public static volatile AtomicInteger LJJIII = new AtomicInteger(0);

    @Override // X.InterfaceC1601140rlg
    public final void LIZ() {
        LJJ = null;
        LJJII = null;
        LJJIII.set(0);
        LinkedList<View> linkedList = LJJIFFI;
        if (linkedList != null) {
            linkedList.clear();
        }
        LJJIFFI = null;
        C487180J8q.LIZIZ().clear();
    }

    public static void LJIILIIL() {
        FeedRecommendFragment feedRecommendFragment;
        if (LJJIII.get() != 0 && C293750BfJ.LIZ()) {
            LJJIII.decrementAndGet();
            String str = LJJII;
            if (str != null) {
                if ((Intrinsics.LJFF(str, "homepage_hot") || Intrinsics.LJFF(str, "homepage_follow")) && (feedRecommendFragment = LJJ) != null) {
                    RecommendFeedFragmentPanel recommendFeedFragmentPanel = feedRecommendFragment.LLIZLLLIL;
                    if (recommendFeedFragmentPanel == null || recommendFeedFragmentPanel.activity == null) {
                        return;
                    }
                    RecommendFeedFragmentPanel recommendFeedFragmentPanel2 = feedRecommendFragment.LLIZLLLIL;
                    Activity activity = recommendFeedFragmentPanel2 != null ? recommendFeedFragmentPanel2.activity : null;
                    C512350K7l.LIZ.getClass();
                    View viewLIZIZ = C21146717pB.LIZIZ(activity, R.layout.dbz, feedRecommendFragment.LLIZLLLIL.LLJJIJI, false);
                    if (LJJIFFI == null) {
                        LJJIFFI = new LinkedList<>();
                    }
                    LinkedList<View> linkedList = LJJIFFI;
                    if (linkedList != null) {
                        linkedList.addLast(viewLIZIZ);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("savePreparedView by viewCacheForAllFragments eventType=");
                    sbLIZ.append(str);
                    sbLIZ.append(" on ");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
    }

    public static void LJIILJJIL() {
        HashMap<String, BaseFeedLiveViewHolder> map;
        BaseFeedLiveViewHolder baseFeedLiveViewHolder;
        Aweme aweme = LJJIJIIJIL;
        if (aweme != null) {
            LIZ.getClass();
            if (!LJIIJ(aweme, false) || (map = LJJIJ) == null || (baseFeedLiveViewHolder = map.get("homepage_hot")) == null) {
                return;
            }
            baseFeedLiveViewHolder.x1(aweme);
        }
    }

    @Override // X.InterfaceC1601140rlg
    public final InterfaceC475410Ikd LJ() {
        if (Live5vvOptExp.INSTANCE.disable()) {
            return null;
        }
        return LIZIZ;
    }

    public static void LJIIL() {
        if (C486790J7d.LIZIZ()) {
            if (LJIJJLI == null) {
                LJIJJLI = RunnableC2175551ACj.LL;
            }
            RunnableC2175551ACj runnableC2175551ACj = LJIJJLI;
            if (runnableC2175551ACj != null) {
                runnableC2175551ACj.run();
                return;
            }
            return;
        }
        Choreographer choreographer = LJIJ;
        if (choreographer != null) {
            LIZ.getClass();
            if (LJIJI == null) {
                LJIJI = ChoreographerFrameCallbackC2175611ACp.LL;
            }
            ChoreographerFrameCallbackC2175611ACp choreographerFrameCallbackC2175611ACp = LJIJI;
            if (choreographerFrameCallbackC2175611ACp != null) {
                choreographer.postFrameCallback(choreographerFrameCallbackC2175611ACp);
                LJIJJ = true;
            }
        }
        if (LJIJJLI == null) {
            LJIJJLI = RunnableC2175551ACj.LL;
        }
        RunnableC2175551ACj runnableC2175551ACj2 = LJIJJLI;
        if (runnableC2175551ACj2 != null) {
            C786410Ut5.LJLI(-1L, C0IK5.LIZ(), runnableC2175551ACj2);
            LJIL = true;
        }
    }

    public static boolean LJIIIZ(String str) {
        if (!LIZJ.get() || !LIZLLL.compareAndSet(false, true)) {
            return false;
        }
        return TextUtils.equals(str, LJ);
    }

    @Override // X.InterfaceC1601140rlg
    public final void LIZLLL(C19EG c19eg) {
        C0NET.LIZ.getClass();
        if (!C587860N3w.LIZLLL && c19eg != null && C1ADK.LIZ().preCreateViewInAdvance && LJI.compareAndSet(false, true)) {
            C512350K7l.LIZ.getClass();
            C21146717pB.LIZJ(c19eg, R.layout.dbz);
        }
    }

    @Override // X.InterfaceC1601140rlg
    public final void LJFF(C1602240rnS c1602240rnS) {
        if (Live5vvOptExp.INSTANCE.disable()) {
            return;
        }
        LIZIZ = c1602240rnS;
    }

    @Override // X.InterfaceC1601140rlg
    public final void LJII(Fragment fragment) {
        if (C486790J7d.LIZIZ()) {
            LJIJ = C786410Ut5.v2();
        }
        if (fragment != null && (fragment instanceof FeedRecommendFragment)) {
            LJJ = (FeedRecommendFragment) fragment;
        }
    }

    public static boolean LJIIJ(Aweme aweme, boolean z) {
        LiveRoomStruct liveRoomStruct;
        RoomFeedCellStruct roomFeedCellStruct;
        if (!AwemeSaaSExtKt.isLive(aweme)) {
            return false;
        }
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if ((newLiveRoomDataExt == null && ((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData()) == null)) || (liveRoomStruct = LJJIJIL) == null || newLiveRoomDataExt.id != liveRoomStruct.id || !LJIILL.get() || (!C1ADK.LIZ().prePlayAfterPlayerCreated && !z)) {
            return false;
        }
        return LJIIZILJ.compareAndSet(false, true);
    }

    @Override // X.InterfaceC1601140rlg
    public final void LIZJ(int i, Aweme aweme) {
        if (LIZJ.compareAndSet(false, true) && i == 0 && aweme != null) {
            LJ = aweme.getAid();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackFirstCardAfter and firstAwemeId is set to ");
            sbLIZ.append(LJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC1601140rlg
    public final void LJIIIIZZ(Context context, List list) {
        if (list != null && context != null && C293750BfJ.LIZ()) {
            C486790J7d.LIZLLL(new ARunnableS16S1200000_11(context, "homepage_follow", new AwS551S0100000_7(list, (List<? extends FollowFeed>) 749), 9), this, 1000L);
        }
    }

    @Override // X.InterfaceC1601140rlg
    public final void LIZIZ(int i, Context context, List list) {
        int i2;
        Aweme aweme;
        if (LIZIZ != null) {
            if (list != null && (aweme = (Aweme) ListProtector.get(list, 0)) != null && aweme.getAwemeType() == 101) {
                i2 = 0;
            } else {
                i2 = -1;
            }
            C1602240rnS.LIZIZ(i2);
        }
        LJIIJJI(i, context, list, false);
        if (C293750BfJ.LIZ() && context != null && list != null) {
            String str = null;
            if (!list.isEmpty()) {
                C1ACY c1acy = LIZ;
                AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(list, (List<? extends BaseComponentData>) 1120);
                c1acy.getClass();
                if (i != 0) {
                    if (i == 1) {
                        str = "homepage_follow";
                    }
                } else {
                    str = "homepage_hot";
                }
                C486790J7d.LIZLLL(new ARunnableS16S1200000_11(context, str, awS546S0100000_2, 9), c1acy, 1000L);
            }
        }
    }

    @Override // X.InterfaceC1601140rlg
    public final void LJI(boolean z, int i, String str) {
        RecommendFeedFragmentPanel recommendFeedFragmentPanel;
        Context context;
        FeedRecommendFragment feedRecommendFragment;
        RecommendFeedFragmentPanel recommendFeedFragmentPanel2;
        if (!z) {
            return;
        }
        Activity activity = null;
        if (!TextUtils.equals("live_common_feed_item_feed_live_real_time_v2", str) && !TextUtils.equals("live_common_feed_item_feed_live_real_time_v3", str)) {
            C487180J8q.LIZIZ().containsKey(Integer.valueOf(i));
            if (C487180J8q.LIZIZ().containsKey(Integer.valueOf(i)) && (feedRecommendFragment = LJJ) != null && (recommendFeedFragmentPanel2 = feedRecommendFragment.LLIZLLLIL) != null && recommendFeedFragmentPanel2.activity != null) {
                RecommendFeedFragmentPanel recommendFeedFragmentPanel3 = feedRecommendFragment.LLIZLLLIL;
                if (recommendFeedFragmentPanel3 != null) {
                    activity = recommendFeedFragmentPanel3.activity;
                }
                View viewLIZIZ = C21146717pB.LIZIZ(activity, i, recommendFeedFragmentPanel3.LLJJIJI, false);
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) C487180J8q.LIZIZ().get(Integer.valueOf(i));
                if (copyOnWriteArrayList == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    copyOnWriteArrayList2.add(viewLIZIZ);
                    C487180J8q.LIZIZ().put(Integer.valueOf(i), copyOnWriteArrayList2);
                    return;
                }
                copyOnWriteArrayList.add(viewLIZIZ);
                return;
            }
            return;
        }
        AtomicBoolean atomicBoolean = LJI;
        if (atomicBoolean.get()) {
            AtomicBoolean atomicBoolean2 = LJII;
            if (atomicBoolean2.get()) {
                LJIILIIL();
                return;
            }
            if (!atomicBoolean.get() || !atomicBoolean2.compareAndSet(false, true)) {
                return;
            }
            FeedRecommendFragment feedRecommendFragment2 = LJJ;
            if (feedRecommendFragment2 != null && (recommendFeedFragmentPanel = feedRecommendFragment2.LLIZLLLIL) != null && recommendFeedFragmentPanel.activity != null) {
                RecommendFeedFragmentPanel recommendFeedFragmentPanel4 = feedRecommendFragment2.LLIZLLLIL;
                if (recommendFeedFragmentPanel4 != null) {
                    activity = recommendFeedFragmentPanel4.activity;
                }
                C512350K7l.LIZ.getClass();
                View viewLIZIZ2 = C21146717pB.LIZIZ(activity, R.layout.dbz, feedRecommendFragment2.LLIZLLLIL.LLJJIJI, false);
                if (LJJI == null) {
                    LJJI = new HashMap<>();
                }
                HashMap<String, View> map = LJJI;
                if (map != null) {
                    map.put("homepage_hot", viewLIZIZ2);
                }
                View viewFindViewById = viewLIZIZ2.findViewById(R.id.i72);
                if (viewFindViewById != null && (context = viewFindViewById.getContext()) != null) {
                    LIZ.getClass();
                    if (TextUtils.equals("homepage_hot", "homepage_hot") && C1ADK.LIZ().preCreateRenderView && LJIIIIZZ.compareAndSet(false, true) && !LJIIIZ.get()) {
                        C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS35S1200000_33(context, viewLIZIZ2, 2));
                    }
                }
                LIZ.getClass();
                if (TextUtils.equals("homepage_hot", "homepage_hot") && C1ADK.LIZ().preCreateViewHolder && !LJIIJJI && LJIILIIL.compareAndSet(false, true)) {
                    C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS16S1200000_11(viewLIZIZ2, feedRecommendFragment2, 8));
                }
            }
            C486790J7d.LIZLLL(new Runnable() { // from class: X.1ACg
                public static void LIZ() {
                    C1ACY.LIZ.getClass();
                    C1ACY.LJJIJIIJI = null;
                    C1ACY.LJJIJIIJIL = null;
                    C1ACY.LJJIJIL = null;
                    C1ACY.LJJIJL = null;
                    HashMap<String, View> map2 = C1ACY.LJJI;
                    if (map2 != null) {
                        map2.clear();
                    }
                    C1ACY.LJJI = null;
                    HashMap<String, C2175491ACd> map3 = C1ACY.LJJIIZ;
                    if (map3 != null) {
                        map3.clear();
                    }
                    C1ACY.LJJIIZ = null;
                    HashMap<String, C2175491ACd> map4 = C1ACY.LJJIIZI;
                    if (map4 != null) {
                        map4.clear();
                    }
                    C1ACY.LJJIIZI = null;
                    C1ACY.LJJIIJ = 0;
                    C1ACY.LJJIIJZLJL = 0;
                    HashMap<String, BaseFeedLiveViewHolder> map5 = C1ACY.LJJIJ;
                    if (map5 != null) {
                        map5.clear();
                    }
                    C1ACY.LJJIJ = null;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveCardHelperForColdBoot@43f7.savePreparedViewForColdStart$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveCardHelperForColdBoot@43f7.savePreparedViewForColdStart$3");
                }
            }, this, C1ADK.LIZ().cacheExpiredIntervalMs);
            return;
        }
        LJIILIIL();
    }

    public static void LJIIJJI(int i, Context context, List list, boolean z) {
        Aweme aweme;
        InterfaceC480520Iss interfaceC480520IssLLJJ;
        InterfaceC480510Isr interfaceC480510Isr;
        String aid;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        if (LJFF) {
            return;
        }
        LJFF = true;
        if (i != 0) {
            return;
        }
        C0NET.LIZ.getClass();
        if ((C587860N3w.LIZLLL && !z) || C086I.LIZIZ(list)) {
            return;
        }
        String aid2 = null;
        if (list == null || (aweme = (Aweme) ListProtector.get(list, 0)) == null || aweme.getAwemeType() != 101) {
            return;
        }
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt == null) {
            RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
            if (roomFeedCellStruct != null) {
                newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData();
            } else {
                newLiveRoomDataExt = null;
            }
        }
        LJJIJIL = newLiveRoomDataExt;
        if (LJJIJIL == null) {
            return;
        }
        LJJIJIIJIL = aweme;
        if (!z && context != null && C1ADK.LIZ().preCreateViewOnDemand && LJI.compareAndSet(false, true)) {
            C512350K7l.LIZ.getClass();
            C21146717pB.LIZJ(context, R.layout.dbz);
        }
        LiveRoomStruct liveRoomStruct = LJJIJIL;
        Aweme aweme2 = LJJIJIIJIL;
        if ((C1ADK.LIZ().preCreatePlayer || z) && LJIILJJIL.compareAndSet(false, true) && liveRoomStruct != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preview_");
            sbLIZ.append(liveRoomStruct.id);
            sbLIZ.append('_');
            sbLIZ.append(SystemClock.uptimeMillis());
            LJJIJIIJI = C2188811AlT.LIZIZ(sbLIZ);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                interfaceC480520IssLLJJ = interfaceC20673515v3K4.LLJJ(LJJIJIIJI, true);
            } else {
                interfaceC480520IssLLJJ = null;
            }
            if (interfaceC480520IssLLJJ instanceof InterfaceC480510Isr) {
                interfaceC480510Isr = (InterfaceC480510Isr) interfaceC480520IssLLJJ;
            } else {
                interfaceC480510Isr = null;
            }
            LJJIJL = interfaceC480510Isr;
            InterfaceC480510Isr interfaceC480510Isr2 = LJJIJL;
            if (interfaceC480510Isr2 != null) {
                Pair pairLIZIZ = C1ACC.LIZIZ(liveRoomStruct);
                String str = (String) pairLIZIZ.getFirst();
                String str2 = (String) pairLIZIZ.getSecond();
                C1ACY c1acy = LIZ;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                }
                c1acy.getClass();
                boolean zLJIIIZ = LJIIIZ(aid2);
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                interfaceC480510Isr2.LJJJJJ(str, str2, zLJIIIZ, aid);
                interfaceC480510Isr2.t0(LJJIJIIJI, "preview start upon the app is started", false);
                if (z) {
                    LJIIL = true;
                }
            }
        }
        if (LJIILLIIL.compareAndSet(false, true) && LJIILL.get()) {
            LJIIL();
        }
    }
}
