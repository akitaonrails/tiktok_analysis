package Y;

import X.C0IF9;
import X.C0IJT;
import X.C0IOL;
import X.C0IOS;
import X.C0IOU;
import X.C0ISJ;
import X.C1161920gLG;
import X.C188800o2;
import X.C1C7U;
import X.C20441214yg;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C464010IHn;
import X.C466360IQo;
import X.C466640IRq;
import X.C467650IVn;
import X.C474500IjA;
import X.C476830Imv;
import X.C519090KXj;
import X.C786410Ut5;
import X.C827750WdZ;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProviderV2;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveForuTopLivesEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveViewTreeOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AwS26S0000100_7;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS13S0100100_7 implements Runnable {
    public final int $t;
    public long j1;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$3() {
        MultiPlusFeedRoomListProviderV2 multiPlusFeedRoomListProviderV2 = (MultiPlusFeedRoomListProviderV2) this.l0;
        long j = this.j1;
        Iterator it2 = ((CopyOnWriteArrayList) multiPlusFeedRoomListProviderV2.LLIZLLLIL).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Room room = (Room) it2.next();
            if (room == null || j != room.getId()) {
                i++;
            } else if (i >= 0) {
                if (i < ((CopyOnWriteArrayList) multiPlusFeedRoomListProviderV2.LLIZLLLIL).size()) {
                    ListProtector.remove(multiPlusFeedRoomListProviderV2.LLIZLLLIL, i);
                    multiPlusFeedRoomListProviderV2.LLJJ--;
                }
                if (i < ((CopyOnWriteArrayList) multiPlusFeedRoomListProviderV2.LLJ).size()) {
                    ListProtector.remove(multiPlusFeedRoomListProviderV2.LLJ, i);
                }
            }
        }
        Iterator it3 = ((ArrayList) multiPlusFeedRoomListProviderV2.LLIZ).iterator();
        int i2 = 0;
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            if (j != ((RoomInfo) it3.next()).getRoomId()) {
                i2++;
            } else if (i2 >= 0 && i2 < ((ArrayList) multiPlusFeedRoomListProviderV2.LLIZ).size()) {
                ListProtector.remove(multiPlusFeedRoomListProviderV2.LLIZ, i2);
            }
        }
        Iterator it4 = ((ArrayList) multiPlusFeedRoomListProviderV2.LLJI).iterator();
        int i3 = 0;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            if (j != ((Room) it4.next()).getId()) {
                i3++;
            } else if (i3 >= 0) {
                if (i3 < ((ArrayList) multiPlusFeedRoomListProviderV2.LLJI).size()) {
                    ListProtector.remove(multiPlusFeedRoomListProviderV2.LLJI, i3);
                    if (i3 <= multiPlusFeedRoomListProviderV2.LLJJ - ((CopyOnWriteArrayList) multiPlusFeedRoomListProviderV2.LLIZLLLIL).size()) {
                        multiPlusFeedRoomListProviderV2.LLJJ--;
                    }
                }
                if (i3 < ((ArrayList) multiPlusFeedRoomListProviderV2.LLJIJIL).size()) {
                    ListProtector.remove(multiPlusFeedRoomListProviderV2.LLJIJIL, i3);
                }
            }
        }
        multiPlusFeedRoomListProviderV2.LLJJJ.remove(Long.valueOf(j));
        multiPlusFeedRoomListProviderV2.LJIILJJIL();
    }

    public final void LIZ$4() {
        C0IOS c0ios = (C0IOS) this.l0;
        long j = this.j1;
        C0IOU c0iou = c0ios.LLJ;
        if (c0iou != null) {
            c0iou.LJIIL(j);
        }
        for (EnterRoomConfig enterRoomConfig : (ArrayList) c0ios.LLIZLLLIL) {
            if (enterRoomConfig.mRoomsData.roomId == j) {
                ((ArrayList) c0ios.LLIZLLLIL).remove(enterRoomConfig);
                c0ios.LJIILJJIL();
                return;
            }
        }
    }

    public final void LIZ$5() {
        Future<?> future = ((C519090KXj) this.l0).LJ.get(Long.valueOf(this.j1));
        if (future != null) {
            future.cancel(false);
        }
        ((C519090KXj) this.l0).LJ.remove(Long.valueOf(this.j1));
        C188800o2.LIZIZ(((C519090KXj) this.l0).LIZLLL, new AwS26S0000100_7(this.j1, 11));
    }

    public final void LIZ$0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("low device -> PortraitWidgetsKt.WISH_LIST is invoked on ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" delay ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.j1);
        C20441214yg.LIZIZ("AbsInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
        ((LandscapeAudienceInteractionFragment) this.l0).EU();
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("low device -> PortraitWidgetsKt.WISH_LIST is invoked on ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" delay ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.j1);
        C20441214yg.LIZIZ("AbsInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
        ((PortraitAudienceInteractionFragment) this.l0).HU();
    }

    public final void LIZ$2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("low device -> ITreasureBoxService.getEnvelopeList is invoked on ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(" delay ");
        sbLIZ.append(SystemClock.elapsedRealtime() - this.j1);
        C20441214yg.LIZIZ("AbsInteractionFragment", C2188811AlT.LIZIZ(sbLIZ));
        ITreasureBoxService iTreasureBoxService = (ITreasureBoxService) C1161920gLG.LIZJ(ITreasureBoxService.class);
        String idStr = ((AbsAudienceInteractionFragment) this.l0).LLJILJIL.getIdStr();
        AbsAudienceInteractionFragment absAudienceInteractionFragment = (AbsAudienceInteractionFragment) this.l0;
        iTreasureBoxService.y71(idStr, absAudienceInteractionFragment.LLJIJIL, absAudienceInteractionFragment.LLLLZIL);
    }

    public static final void run$0(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        ViewGroup viewGroup;
        SkylightController skylightController = (SkylightController) aRunnableS13S0100100_7.l0;
        long j = aRunnableS13S0100100_7.j1;
        skylightController.getClass();
        C1C7U.LIZ("SkylightController@4636.onNewIntent$1L");
        if (skylightController.LLJILJILJ == null) {
            C1C7U.LIZIZ("SkylightController@4636.onNewIntent$1L");
            return;
        }
        if (LiveViewTreeOptSetting.enableViewTreeOpt()) {
            viewGroup = (ViewGroup) skylightController.LLJILJILJ.findViewById(R.id.viewpager);
        } else {
            viewGroup = (ViewGroup) skylightController.LLJILJILJ.findViewById(R.id.iiv);
        }
        C476830Imv c476830Imv = skylightController.LL;
        c476830Imv.LJIILL = viewGroup;
        if (c476830Imv.LJJJJZI && !c476830Imv.LJJLJLI && LiveForuTopLivesEnterOptSetting.INSTANCE.enableOpenTopLiveImmediately(j)) {
            c476830Imv.LJIL(c476830Imv.LJFF());
            c476830Imv.LJJLJLI = c476830Imv.LJJJJZI;
        }
        C1C7U.LIZIZ("SkylightController@4636.onNewIntent$1L");
    }

    public static final void run$1(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("LandscapeAudienceInteractionFragment@c63d.prepareChildWidgets$1");
        try {
            aRunnableS13S0100100_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandscapeAudienceInteractionFragment@c63d.prepareChildWidgets$1");
    }

    public static final void run$10(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        MultiRoomIdListProvider multiRoomIdListProvider = (MultiRoomIdListProvider) aRunnableS13S0100100_7.l0;
        long j = aRunnableS13S0100100_7.j1;
        multiRoomIdListProvider.getClass();
        C1C7U.LIZ("MultiRoomIdListProvider@e61e.removeRoom$1L");
        int i = 0;
        while (true) {
            if (i < ((ArrayList) multiRoomIdListProvider.LLILZIL).size()) {
                if (ListProtector.get(multiRoomIdListProvider.LLILZIL, i) != null && ((RoomInfo) ListProtector.get(multiRoomIdListProvider.LLILZIL, i)).getRoomId() == j) {
                    ListProtector.remove(multiRoomIdListProvider.LLILZIL, i);
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        C1C7U.LIZIZ("MultiRoomIdListProvider@e61e.removeRoom$1L");
    }

    public static final void run$11(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("OutSourceRoomListProvider@cd7.removeRoom$1");
        try {
            aRunnableS13S0100100_7.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OutSourceRoomListProvider@cd7.removeRoom$1");
    }

    public static final void run$12(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("DrawRoomListProvider@3742.removeRoom$1");
        try {
            ((C0ISJ) aRunnableS13S0100100_7.l0).LJJLIIIJJIZ(aRunnableS13S0100100_7.j1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DrawRoomListProvider@3742.removeRoom$1");
    }

    public static final void run$13(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("PTFScheduler@584f.onTaskFinished$1");
        try {
            ((C519090KXj) aRunnableS13S0100100_7.l0).LJ.remove(Long.valueOf(aRunnableS13S0100100_7.j1));
            ((C519090KXj) aRunnableS13S0100100_7.l0).LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PTFScheduler@584f.onTaskFinished$1");
    }

    public static final void run$14(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("PTFScheduler@584f.cancelTask$2");
        try {
            aRunnableS13S0100100_7.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PTFScheduler@584f.cancelTask$2");
    }

    public static final void run$2(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("PortraitAudienceInteractionFragment@93b7.loadWishList$1");
        try {
            aRunnableS13S0100100_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PortraitAudienceInteractionFragment@93b7.loadWishList$1");
    }

    public static final void run$3(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        C464010IHn c464010IHn = (C464010IHn) aRunnableS13S0100100_7.l0;
        long j = aRunnableS13S0100100_7.j1;
        c464010IHn.getClass();
        C1C7U.LIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$1L");
        try {
            C467650IVn c467650IVn = c464010IHn.LJ.LLLF;
            if (c467650IVn != null) {
                c467650IVn.LJIJJ();
                LivePlayFragment livePlayFragment = c464010IHn.LJ;
                C467650IVn c467650IVn2 = livePlayFragment.LLLF;
                EnterRoomConfig enterRoomConfig = livePlayFragment.g1;
                c467650IVn2.LJIILL(true, false, enterRoomConfig.mRoomsData.enterType, livePlayFragment.LLILZ, livePlayFragment.y, j, enterRoomConfig.mLogData.previewCtrSessionId);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logFirstFrameDisplayed failed, ");
            sbLIZ.append(e.getMessage());
            C827750WdZ.LIZIZ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$1L");
    }

    public static final void run$4(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("AbsAudienceInteractionFragment@61ad.loadTreasureBoxWidgetAndRedEnvelopeWidget$1");
        try {
            aRunnableS13S0100100_7.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsAudienceInteractionFragment@61ad.loadTreasureBoxWidgetAndRedEnvelopeWidget$1");
    }

    public static final void run$5(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        C464010IHn c464010IHn = (C464010IHn) aRunnableS13S0100100_7.l0;
        long j = aRunnableS13S0100100_7.j1;
        c464010IHn.getClass();
        C1C7U.LIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$2L");
        C467650IVn c467650IVn = c464010IHn.LJ.LLLF;
        if (c467650IVn != null) {
            HashMap map = new HashMap();
            EnterRoomConfig.LogData logData = c467650IVn.LJIJ.mLogData;
            long j2 = logData.loadDuration;
            if (j2 > 0) {
                logData.loadDuration = 0L;
                map.put("duration", String.valueOf(j - j2));
                map.put("request_page", C466640IRq.LIZJ().LIZLLL());
                if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
                    map.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
                }
                SlardarSampleSetting slardarSampleSetting = SlardarSampleSetting.INSTANCE;
                if (slardarSampleSetting.isReport("livesdk_toplive_enter_room_duration", 0.0d)) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_enter_room_duration");
                    c474500IjALIZ.LJJIIZI(map);
                    c474500IjALIZ.LJIJJLI(c467650IVn.LJJJJLL);
                    c474500IjALIZ.LIZ();
                }
                if (slardarSampleSetting.isReport("livesdk_live_stream_load_duration", 0.0d)) {
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_stream_load_duration");
                    c474500IjALIZ2.LJJIIZI(map);
                    c474500IjALIZ2.LJIJJLI(c467650IVn.LJJJJLL);
                    c474500IjALIZ2.LIZ();
                }
                long j3 = c467650IVn.LJJJZ;
                if (j3 > 0) {
                    map.put("duration", String.valueOf(j - j3));
                    C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_new_style_pull_stream_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                    c474500IjALIZIZ.LJJIIZI(map);
                    c474500IjALIZIZ.LJIJJLI(c467650IVn.LJJJJLL);
                    c474500IjALIZIZ.LIZ();
                }
            }
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.<field>$1$onPlayDisplayed$2L");
    }

    public static final void run$6(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS13S0100100_7.l0;
        long j = aRunnableS13S0100100_7.j1;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        C1C7U.LIZ("LivePlayFragment@afba.tryPostMultiGuestLayoutRenderedIfNeeded$1L");
        if (j == livePlayFragment.LLILLJJLI && livePlayFragment.LLILZLL.LIZ == j) {
            if (livePlayFragment.LLLLIILLL.LIZ.getWidth() > 0 && livePlayFragment.LLLLIILLL.LIZ.getHeight() > 0) {
                C0IF9 c0if9 = livePlayFragment.LLILZLL;
                c0if9.LIZLLL = true;
                c0if9.LJ = j;
                livePlayFragment.tW();
            }
            C1C7U.LIZIZ("LivePlayFragment@afba.tryPostMultiGuestLayoutRenderedIfNeeded$1L");
            return;
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.tryPostMultiGuestLayoutRenderedIfNeeded$1L");
    }

    public static final void run$7(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        boolean zLIZ;
        C1C7U.LIZ("MultiPlusFeedRoomListProviderV2@2def.removeRoom$1");
        try {
            aRunnableS13S0100100_7.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiPlusFeedRoomListProviderV2@2def.removeRoom$1");
    }

    public static final void run$8(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        C466360IQo c466360IQo;
        LiveRoomFragment liveRoomFragment = (LiveRoomFragment) aRunnableS13S0100100_7.l0;
        long j = aRunnableS13S0100100_7.j1;
        liveRoomFragment.getClass();
        C1C7U.LIZ("LiveRoomFragment@108c.removeAndSwipe$1L");
        C0IOL c0iol = liveRoomFragment.LLLLIIIILLL;
        if (c0iol != null && (c466360IQo = liveRoomFragment.LLLLJ) != null && c466360IQo.LLILZLL == 0) {
            c0iol.LJJIL(j);
        }
        C1C7U.LIZIZ("LiveRoomFragment@108c.removeAndSwipe$1L");
    }

    public static final void run$9(ARunnableS13S0100100_7 aRunnableS13S0100100_7) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = (MultiPlusFeedRoomListProvider) aRunnableS13S0100100_7.l0;
        long j = aRunnableS13S0100100_7.j1;
        multiPlusFeedRoomListProvider.getClass();
        C1C7U.LIZ("MultiPlusFeedRoomListProvider@8180.removeRoom$1L");
        Iterator it2 = ((ArrayList) multiPlusFeedRoomListProvider.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            Room room = (Room) it2.next();
            if (room == null || room.getId() == j) {
                it2.remove();
            }
        }
        Iterator it3 = ((ArrayList) multiPlusFeedRoomListProvider.LLJ).iterator();
        while (it3.hasNext()) {
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) it3.next();
            if (enterRoomConfig != null && enterRoomConfig.mRoomsData.roomId == j) {
                it3.remove();
            }
        }
        Iterator it4 = ((ArrayList) multiPlusFeedRoomListProvider.LLIZ).iterator();
        while (it4.hasNext()) {
            RoomInfo roomInfo = (RoomInfo) it4.next();
            if (roomInfo == null || roomInfo.getRoomId() == j) {
                it4.remove();
            }
        }
        Iterator it5 = ((ArrayList) multiPlusFeedRoomListProvider.LLJJIJIL).iterator();
        while (it5.hasNext()) {
            Room room2 = (Room) it5.next();
            if (room2 == null || room2.getId() == j) {
                it5.remove();
            }
        }
        Iterator it6 = ((ArrayList) multiPlusFeedRoomListProvider.LLJJJ).iterator();
        while (it6.hasNext()) {
            EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) it6.next();
            if (enterRoomConfig2 == null || enterRoomConfig2.mRoomsData.roomId == j) {
                it6.remove();
            }
        }
        multiPlusFeedRoomListProvider.LLJJJJJIL.remove(Long.valueOf(j));
        multiPlusFeedRoomListProvider.LJIILJJIL();
        C1C7U.LIZIZ("MultiPlusFeedRoomListProvider@8180.removeRoom$1L");
    }

    public ARunnableS13S0100100_7(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }

    public ARunnableS13S0100100_7(C464010IHn c464010IHn, long j, long j2, int i) {
        this.$t = i;
        this.l0 = c464010IHn;
        this.j1 = j2;
    }
}
