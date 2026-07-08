package Y;

import X.AbstractC470790IdB;
import X.AbstractC470800IdC;
import X.C08D5;
import X.C0IJ6;
import X.C0IJT;
import X.C0IL9;
import X.C0ILD;
import X.C0IO2;
import X.C0IQV;
import X.C0IR2;
import X.C0IR5;
import X.C0IVR;
import X.C0IVS;
import X.C0IWT;
import X.C0IXL;
import X.C0IXQ;
import X.C0IXW;
import X.C0IXY;
import X.C0J0H;
import X.C0J0Q;
import X.C0J70;
import X.C0JAD;
import X.C0JBN;
import X.C1161920gLG;
import X.C118300cf;
import X.C12ES;
import X.C1390410mHn;
import X.C16F5;
import X.C1819620xS4;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C2093608Ic;
import X.C21578619ce;
import X.C2188811AlT;
import X.C354201Zc;
import X.C418440Gaw;
import X.C464340IIu;
import X.C465560INm;
import X.C466640IRq;
import X.C467800IWc;
import X.C467820IWe;
import X.C468800IZy;
import X.C470600Ics;
import X.C471830Ier;
import X.C473410IhP;
import X.C474500IjA;
import X.C475750IlB;
import X.C479290Iqt;
import X.C479650IrT;
import X.C482340Ivo;
import X.C482800IwY;
import X.C485050J0l;
import X.C497740JfY;
import X.C498770JhD;
import X.C500260Jjc;
import X.C519090KXj;
import X.C521890KdP;
import X.C781520UlC;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC467180ITs;
import X.InterfaceC1103130eoR;
import X.InterfaceC466370IQp;
import X.InterfaceC479210Iql;
import X.InterfaceC500690JkJ;
import X.InterfaceC772390URp;
import X.RunnableC519000KXa;
import X.RunnableC519060KXg;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragmentV2;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.widget.survey.widget.LightSurveyRouteWidget;
import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventPeriodicAudienceSetting;
import com.bytedance.android.livesdk.notify.LiveNotifyService;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverViewVideoAboveWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.toplive.cell.FollowWindowSkylightCell;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS40S0300000_7 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C16F5 c16f5;
        LiveNewAudienceEndFragmentV2 liveNewAudienceEndFragmentV2 = ((C0IL9) this.l2).LL;
        LiveEventModule liveEventModule = (LiveEventModule) this.l0;
        if (liveEventModule == null) {
            liveNewAudienceEndFragmentV2.aS();
        } else if (liveNewAudienceEndFragmentV2.LLJL != null && liveNewAudienceEndFragmentV2.LLJLL != null && liveNewAudienceEndFragmentV2.LLJLILLLLZIIL != null) {
            liveNewAudienceEndFragmentV2.cS(liveEventModule.subscribed);
            C16F5 c16f52 = liveNewAudienceEndFragmentV2.LLJLL;
            C468800IZy c468800IZy = liveNewAudienceEndFragmentV2.LLJJLIIIJLLLLLLLZ;
            long j = liveEventModule.startTime * 1000;
            c468800IZy.getClass();
            c16f52.setText(C468800IZy.LIZIZ(j));
            C786410Ut5.LJLLLLLL(0, liveNewAudienceEndFragmentV2.LLJL);
            if (liveEventModule.LIZIZ() && LiveEventPeriodicAudienceSetting.enable() && (c16f5 = liveNewAudienceEndFragmentV2.LLJLILLLLZIIL) != null) {
                c16f5.setText(C497740JfY.LJIJI(2131855705));
            }
        }
        ((C0IL9) this.l2).LL.UR((C0ILD) this.l1);
        ((C0IL9) this.l2).LL.LLJJLIIIJLLLLLLLZ.LJII();
        ((C0IL9) this.l2).LL.WR();
    }

    public final void LIZ$1() {
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).bg(C0J0Q.ROOM, "watch_live_duration_per_1s", Long.valueOf((System.currentTimeMillis() - ((C0J0H) this.l0).LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), EnumC467180ITs.EPI.getGroupName(), false);
        ((LiveNotifyService) this.l1).LLILLL.removeCallbacksAndMessages((DataChannel) this.l2);
        C08D5.LIZIZ(((LiveNotifyService) this.l1).LLILLL, this, (DataChannel) this.l2, 1000L);
    }

    public final void LIZ$3() {
        FrameLayout.LayoutParams layoutParams;
        C786410Ut5.LLIIL((RelativeLayout) this.l0, 0);
        int height = ((MusicDetailAwemeListFragment) this.l1).LLJJIJIIJIL.getHeight();
        ViewGroup.LayoutParams layoutParams2 = ((RelativeLayout) this.l0).getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            if (layoutParams != null) {
                layoutParams.topMargin = height + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }
        } else {
            layoutParams = null;
        }
        C786410Ut5.e6((RelativeLayout) this.l0, layoutParams);
        ((C1390410mHn) this.l2).LIZJ();
    }

    public final void LIZ$4() {
        if (((C479650IrT) this.l0).LIZ.so()) {
            C479290Iqt c479290Iqt = (C479290Iqt) ((C479650IrT) this.l0).LIZIZ.getValue().getState();
            if (c479290Iqt.LL == ((C479290Iqt) this.l1).LL && c479290Iqt.LLILLJJLI) {
                ((InterfaceC479210Iql) this.l2).u(c479290Iqt.LLILLL, c479290Iqt.LLILZ);
            }
        }
    }

    public final void LIZ$5() {
        if (((LiveHostSettingFragmentSheet) this.l0).isAdded() && ((LiveHostSettingFragmentSheet) this.l0).getView() != null && ((C21578619ce) this.l1).isAttachedToWindow() && ((View) this.l2).isAttachedToWindow() && C500260Jjc.LJJJJIZL((View) this.l2)) {
            LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = (LiveHostSettingFragmentSheet) this.l0;
            View view = (View) this.l2;
            C21578619ce c21578619ce = liveHostSettingFragmentSheet.LLLF;
            if (c21578619ce != null) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                c21578619ce.getLocationInWindow(iArr2);
                c21578619ce.smoothScrollTo(0, (((iArr[1] - iArr2[1]) + c21578619ce.getScrollY()) + (view.getHeight() / 2)) - (c21578619ce.getHeight() / 2));
                C473410IhP.LIZJ(new ARunnableS107S0100000_7(liveHostSettingFragmentSheet, 283), 500L);
            }
            LiveHostSettingFragmentSheet liveHostSettingFragmentSheet2 = (LiveHostSettingFragmentSheet) this.l0;
            View view2 = (View) this.l2;
            liveHostSettingFragmentSheet2.getClass();
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            if (iInteractService != null) {
                InterfaceC500690JkJ interfaceC500690JkJNw1 = iInteractService.Nw1(view2);
                liveHostSettingFragmentSheet2.LLLI = interfaceC500690JkJNw1;
                if (interfaceC500690JkJNw1 != null) {
                    interfaceC500690JkJNw1.LIZ();
                }
            }
        }
    }

    public final void LIZ$2() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueue [task-");
        sbLIZ.append((RunnableC519000KXa) this.l0);
        sbLIZ.append("] pending queue");
        C2188811AlT.LIZIZ(sbLIZ);
        ((C519090KXj) this.l1).LIZLLL.add((RunnableC519060KXg) this.l2);
        ((C519090KXj) this.l1).LIZJ();
    }

    public static final void run$0(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("TranslateGuideAnimator@9dbe.playShowGuideViewAnimation$2$onAnimationEnd$1");
        try {
            C465560INm c465560INm = (C465560INm) aRunnableS40S0300000_7.l0;
            if (!c465560INm.LIZLLL) {
                c465560INm.LIZIZ((LivePlayFragment) aRunnableS40S0300000_7.l1, (LivePlayFragment) aRunnableS40S0300000_7.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TranslateGuideAnimator@9dbe.playShowGuideViewAnimation$2$onAnimationEnd$1");
    }

    public static final void run$1(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("ViewStubToReplaceGone@401f.inflate$1");
        try {
            synchronized (C0JAD.LLIZ) {
                try {
                    C0JAD c0jad = (C0JAD) aRunnableS40S0300000_7.l2;
                    View view = (View) aRunnableS40S0300000_7.l0;
                    ViewGroup viewGroup = (ViewGroup) aRunnableS40S0300000_7.l1;
                    c0jad.getClass();
                    int iIndexOfChild = viewGroup.indexOfChild(c0jad);
                    C786410Ut5.LJJLJLI(c0jad, viewGroup);
                    viewGroup.addView(view, iIndexOfChild);
                } finally {
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewStubToReplaceGone@401f.inflate$1");
    }

    public static final void run$10(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        C470600Ics c470600Ics = (C470600Ics) aRunnableS40S0300000_7.l0;
        C471830Ier c471830Ier = (C471830Ier) aRunnableS40S0300000_7.l1;
        AbstractC470790IdB abstractC470790IdB = (AbstractC470790IdB) aRunnableS40S0300000_7.l2;
        c470600Ics.getClass();
        C1C7U.LIZ("RxCacheDataSource@388c.loadAfter$2L$1L");
        c470600Ics.LJIIJ(c471830Ier, abstractC470790IdB);
        C1C7U.LIZIZ("RxCacheDataSource@388c.loadAfter$2L$1L");
    }

    public static final void run$11(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveRepostManager@c2f7.handleRepostBubble$2");
        try {
            ((C498770JhD) aRunnableS40S0300000_7.l0).LIZJ((InterfaceC1103130eoR) aRunnableS40S0300000_7.l1, (DataChannel) aRunnableS40S0300000_7.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveRepostManager@c2f7.handleRepostBubble$2");
    }

    public static final void run$12(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("PTFScheduler@584f.submitTask$1");
        try {
            aRunnableS40S0300000_7.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PTFScheduler@584f.submitTask$1");
    }

    public static final void run$13(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        C0IXL c0ixl;
        C0IXL c0ixl2;
        C0IXL c0ixl3;
        Object obj;
        Object obj2;
        String str;
        Object obj3;
        String str2;
        HashMap<String, String> map;
        C0IVS c0ivs = (C0IVS) aRunnableS40S0300000_7.l0;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) aRunnableS40S0300000_7.l1;
        Room room = (Room) aRunnableS40S0300000_7.l2;
        c0ivs.getClass();
        C1C7U.LIZ("LiveRoomLog@51df.logAudienceEnter$1L");
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str3 = logData.requestPage;
        String str4 = logData.anchorType;
        String str5 = logData.requestId;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        long j = roomsData.roomId;
        String str6 = roomsData.sourceType;
        String str7 = roomsData.sceneId;
        String str8 = logData.gdLabel;
        String str9 = roomsData.userId;
        HashMap map2 = new HashMap();
        map2.put("room_id", String.valueOf(j));
        map2.put("anchor_id", String.valueOf(str9));
        map2.put("enter_from_merge", enterRoomConfig.mRoomsData.enterFromMerge);
        map2.put("enter_method", enterRoomConfig.mRoomsData.enterMethod);
        map2.put("request_id", str5);
        if (!TextUtils.isEmpty(str6)) {
            map2.put("moment_room_source", str6);
        }
        map2.put("is_sale", "unknown");
        map2.put("orientation", String.valueOf(enterRoomConfig.mRoomsData.orientation));
        if (!C2093608Ic.LJ(enterRoomConfig.mRoomsData.windowMode)) {
            map2.put("live_window_mode", enterRoomConfig.mRoomsData.windowMode);
        }
        long j2 = enterRoomConfig.mRoomsData.smallPictureOrder;
        if (j2 != -1) {
            map2.put("small_picture_order", String.valueOf(j2));
        }
        boolean z = false;
        if (c0ivs.LIZ) {
            if (!TextUtils.isEmpty(enterRoomConfig.mLogData.requestId)) {
                map2.put("request_id", enterRoomConfig.mLogData.requestId);
            }
            if (!TextUtils.isEmpty(enterRoomConfig.mLogData.logPb)) {
                map2.put("log_pb", enterRoomConfig.mLogData.logPb);
            }
            C0IO2.LIZLLL(enterRoomConfig);
            c0ivs.LIZ = false;
        } else {
            Long lValueOf = Long.valueOf(j);
            C0IR5 c0ir5LIZIZ = C0IR2.LIZIZ();
            if (c0ir5LIZIZ != null) {
                c0ir5LIZIZ.LIZJ = lValueOf;
            }
            if (enterRoomConfig.mLogData.aiSummaryBoardShow == 1) {
                z = true;
            }
            C0IR5 c0ir5LIZIZ2 = C0IR2.LIZIZ();
            if (c0ir5LIZIZ2 != null) {
                c0ir5LIZIZ2.LJIIZILJ = Boolean.valueOf(z);
            }
            Map<String, String> map3 = enterRoomConfig.mLogData.liveAiSummaryParams;
            C0IR5 c0ir5LIZIZ3 = C0IR2.LIZIZ();
            if (c0ir5LIZIZ3 != null && (c0ixl3 = c0ir5LIZIZ3.LJFF) != null) {
                c0ixl3.LJJLIIIJILLIZJL = map3;
            }
            Map<String, String> map4 = enterRoomConfig.mLogData.pcsDecorationLogParams;
            C0IR5 c0ir5LIZIZ4 = C0IR2.LIZIZ();
            if (c0ir5LIZIZ4 != null && (c0ixl2 = c0ir5LIZIZ4.LJFF) != null) {
                c0ixl2.LJJLIIIJJI = map4;
            }
            Map<String, String> mapLIZ = C464340IIu.LIZ(enterRoomConfig);
            C0IR5 c0ir5LIZIZ5 = C0IR2.LIZIZ();
            if (c0ir5LIZIZ5 != null) {
                c0ir5LIZIZ5.LJIILJJIL = mapLIZ;
            }
            Long lValueOf2 = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
            C0IR5 c0ir5LIZIZ6 = C0IR2.LIZIZ();
            if (c0ir5LIZIZ6 != null && (c0ixl = c0ir5LIZIZ6.LJFF) != null) {
                c0ixl.LJJJLL = lValueOf2;
            }
            C0IO2.LIZLLL(enterRoomConfig);
        }
        String str10 = "draw";
        if (!TextUtils.isEmpty(str7) && "draw".equals(enterRoomConfig.mRoomsData.enterType)) {
            map2.put("scene_id", str7);
        }
        String str11 = "1";
        if (!TextUtils.isEmpty(str8) && "click_push_live_cd_user".equals(str8)) {
            map2.put("is_subscribe", "1");
        } else {
            map2.put("is_subscribe", CardStruct.IStatusCode.DEFAULT);
        }
        map2.put("growth_deepevent", String.valueOf(1));
        if (enterRoomConfig.mLogData.isVideoHead) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_video_head", obj);
        LiveMode liveModeValueOf = enterRoomConfig.mRoomsData.streamType;
        LiveMode liveMode = LiveMode.VIDEO;
        if (liveModeValueOf == liveMode && enterRoomConfig.mStreamData.streamType != liveMode.ordinal()) {
            liveModeValueOf = LiveMode.valueOf(enterRoomConfig.mStreamData.streamType);
        }
        map2.put("live_type", C354201Zc.LIZ(liveModeValueOf));
        map2.put("request_page", str3);
        map2.put("anchor_type", str4);
        Map<String, String> map5 = enterRoomConfig.mLogData.liveRoomStatesTagMap;
        if (map5 != null) {
            map2.putAll(map5);
        }
        Map<String, String> map6 = enterRoomConfig.mLogData.smbLiveRoomLogMap;
        if (map6 != null) {
            map2.putAll(map6);
        }
        if (!C2093608Ic.LJ(C466640IRq.LIZJ().LIZLLL())) {
            map2.put("enter_live_method", C466640IRq.LIZJ().LIZLLL());
        }
        map2.put("request_page", C466640IRq.LIZJ().LIZLLL());
        w.LIZ.getClass();
        if (!TextUtils.isEmpty(w.LJIILL())) {
            map2.put("list_item_id", String.valueOf(j));
        }
        if (enterRoomConfig.mRoomsData.isBackPreRoom) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_return", obj2);
        if (!TextUtils.isEmpty(enterRoomConfig.mLogData.liveReason)) {
            map2.put("live_reason", enterRoomConfig.mLogData.liveReason);
        }
        map2.put("has_banner", String.valueOf(C467800IWc.LJIJ.LJ()));
        if (!C2093608Ic.LJ(enterRoomConfig.mRoomsData.followStatus)) {
            map2.put("follow_status", enterRoomConfig.mRoomsData.followStatus);
        }
        EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
        if (eCWrapData != null && (map = eCWrapData.ecCommonExtraParam) != null) {
            map2.putAll(map);
        }
        EnterRoomConfig.ECWrapData eCWrapData2 = enterRoomConfig.mECData;
        if (eCWrapData2 != null && (str2 = eCWrapData2.ecRecommendInfo) != null) {
            map2.put("ecom_live_rcmd_info", str2);
        }
        if (!C2093608Ic.LJ(enterRoomConfig.mLogData.previewCardClickArea)) {
            map2.put("click_area", enterRoomConfig.mLogData.previewCardClickArea);
        }
        long j3 = enterRoomConfig.mLogData.cardRoomId;
        if (j3 > 0) {
            map2.put("card_room_id", String.valueOf(j3));
        }
        if (enterRoomConfig.mLogData.fromRoomId > 0 || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
            map2.put("from_room_id", String.valueOf(enterRoomConfig.mLogData.fromRoomId));
        }
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        map2.put("cohost_from_room_id", iLiveHostCrossRoomEventHelper.getFromRoomId());
        map2.put("cohost_from_request_id", iLiveHostCrossRoomEventHelper.getFromRequestId());
        if (!"-1".equals(enterRoomConfig.mLogData.drawAction) || "draw".equals(enterRoomConfig.mRoomsData.actionType)) {
            map2.put("draw_action", enterRoomConfig.mLogData.drawAction);
        }
        map2.put("initial_follow_status", enterRoomConfig.mRoomsData.followStatus);
        map2.put("is_ecom", C0IVR.LJIIIIZZ(enterRoomConfig));
        if (!TextUtils.isEmpty(enterRoomConfig.mLogData.clickMethod)) {
            map2.put("click_method", enterRoomConfig.mLogData.clickMethod);
        }
        if (!TextUtils.equals(enterRoomConfig.mRoomsData.enterRoomScene, "inner_draw")) {
            str10 = "click";
        }
        map2.put("user_action_type", str10);
        map2.put("if_gift_effect", String.valueOf(enterRoomConfig.mLogData.giftEffectStart));
        map2.put("is_complete_gift_effect", String.valueOf(enterRoomConfig.mLogData.giftEffectFinish));
        C0IXY c0ixyLJIIIIZZ = C0IXW.LJIIIIZZ(enterRoomConfig);
        c0ixyLJIIIIZZ.LJIIJ = "user_live_duration";
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        map2.putAll(C467820IWe.LIZIZ());
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.roomSourceFrom)) {
            map2.put("room_source_from", enterRoomConfig.mRoomsData.roomSourceFrom);
        }
        Map<String, String> map7 = enterRoomConfig.mLogData.logMap;
        if (map7 != null) {
            map2.put("game_tab_show_type", map7.get("game_tab_show_type"));
            map2.put("game_tab_name", enterRoomConfig.mLogData.logMap.get("game_tab_name"));
            map2.put("game_tab_rank", enterRoomConfig.mLogData.logMap.get("game_tab_rank"));
            map2.put("game_label", enterRoomConfig.mLogData.logMap.get("game_label"));
            map2.put("has_new_game_label", enterRoomConfig.mLogData.logMap.get("has_new_game_label"));
            map2.put("has_drops_label", enterRoomConfig.mLogData.logMap.get("has_drops_label"));
        }
        map2.put("live_event_id", String.valueOf(enterRoomConfig.mLogData.liveEventId));
        if (room != null) {
            map2.putAll(room.getMultiStreamLogParams());
        }
        Map<String, String> map8 = enterRoomConfig.mRoomsData.gameLiveExtra;
        if (map8 != null) {
            try {
                map2.putAll(map8);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LiveRoomLog", "hashMap concurrentModificationException");
            }
            if (enterRoomConfig.mRoomsData.gameLiveExtra.get("tag_name") != null) {
                map2.put("live_game_name", enterRoomConfig.mRoomsData.gameLiveExtra.get("tag_name"));
            }
        }
        if (!TextUtils.isEmpty(enterRoomConfig.mRoomsData.roomSourceFrom)) {
            map2.put("room_source_from", enterRoomConfig.mRoomsData.roomSourceFrom);
        }
        map2.putAll(C475750IlB.LIZ());
        Boolean bool = enterRoomConfig.mLogData.fromManualRefresh;
        if (bool != null) {
            if (bool.booleanValue()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("is_refresh", obj3);
        }
        long j4 = enterRoomConfig.mLogData.latencyEnterRoomInterval;
        if (j4 > 0) {
            map2.put("latency_enter_room_interval", String.valueOf(j4));
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        C0IWT.LIZ(map2, new ShareFromInfo(roomsData2.shareFromUserId, roomsData2.shareLiveTraceId));
        if (!C781520UlC.LJIIIIZZ(room)) {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("shopping_mode", str11);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("rec_live_play");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJFF(c0ixyLJIIIIZZ);
        String str12 = enterRoomConfig.mLogData.bottomLeftRoomLabel;
        C467800IWc c467800IWc = C467800IWc.LJIJ;
        c474500IjALIZ.LJJII(C0IXQ.LIZ(str12), "connection_type");
        c474500IjALIZ.LJIIJJI("live_view");
        c474500IjALIZ.LJ(enterRoomConfig.mRoomsData.enterType);
        c474500IjALIZ.LJJII(str, "room_orientation");
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("LiveRoomLog@51df.logAudienceEnter$1L");
    }

    public static final void run$14(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDetailAwemeListFragment@91bc.showSquareLoadingUI$1");
        try {
            aRunnableS40S0300000_7.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDetailAwemeListFragment@91bc.showSquareLoadingUI$1");
    }

    public static final void run$15(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHangoutV2SelectionDelegate@3d2c.dispatch$1");
        try {
            aRunnableS40S0300000_7.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHangoutV2SelectionDelegate@3d2c.dispatch$1");
    }

    public static final void run$16(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHostSettingFragmentSheet@6777.scrollToHighlightItemIfNeeded$1");
        try {
            aRunnableS40S0300000_7.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHostSettingFragmentSheet@6777.scrollToHighlightItemIfNeeded$1");
    }

    public static final void run$2(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("GameBottomBarGuideStrategy@9336.tryShow$1");
        try {
            ((C0IJ6) aRunnableS40S0300000_7.l0).LIZ.LIZJ((LivePlayFragment) ((InterfaceC466370IQp) aRunnableS40S0300000_7.l1), (LivePlayFragment) ((InterfaceC466370IQp) aRunnableS40S0300000_7.l2));
            InterfaceC772390URp.LLZL.LJFF(Boolean.FALSE);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameBottomBarGuideStrategy@9336.tryShow$1");
    }

    public static final void run$3(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNewAudienceEndFragmentV2@97bd.loadLiveEventInfo$1$resumeWith$1");
        try {
            aRunnableS40S0300000_7.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNewAudienceEndFragmentV2@97bd.loadLiveEventInfo$1$resumeWith$1");
    }

    public static final void run$4(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aRunnableS40S0300000_7.l0;
        Class cls = (Class) aRunnableS40S0300000_7.l1;
        SurveyData surveyData = (SurveyData) aRunnableS40S0300000_7.l2;
        portraitAudienceInteractionFragment.getClass();
        C1C7U.LIZ("PortraitAudienceInteractionFragment@93b7.loadRealTimeSurveyCard$1L");
        RecyclableWidgetManager recyclableWidgetManager = portraitAudienceInteractionFragment.LLJJI;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.load(R.id.sup, cls, true, new Object[]{surveyData});
            if (surveyData.surveyVersion == 5) {
                portraitAudienceInteractionFragment.LLJJI.load(R.id.mmt, LightSurveyRouteWidget.class, true, new Object[]{surveyData});
            }
        }
        C1C7U.LIZIZ("PortraitAudienceInteractionFragment@93b7.loadRealTimeSurveyCard$1L");
    }

    public static final void run$5(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveNotifyService@bb3d.initializeDurationDriver$1$countRunnable$1");
        try {
            aRunnableS40S0300000_7.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveNotifyService@bb3d.initializeDurationDriver$1$countRunnable$1");
    }

    public static final void run$6(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("FollowWindowSkylightCell@faf8.onBindItemView$2");
        try {
            if (((FollowWindowSkylightCell) aRunnableS40S0300000_7.l0).itemView.getParent() != null) {
                ((FollowWindowSkylightCell) aRunnableS40S0300000_7.l0).P5((C482340Ivo) aRunnableS40S0300000_7.l1, ((C118300cf) aRunnableS40S0300000_7.l2).element);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowWindowSkylightCell@faf8.onBindItemView$2");
    }

    public static final void run$7(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        int iLIZJ;
        C1C7U.LIZ("TopLiveBubbleManager@e3c2.showTopLiveBubbleDirect$1");
        try {
            if (((C482800IwY) aRunnableS40S0300000_7.l0).LJFF != null) {
                iLIZJ = (int) (C12ES.LIZJ(12.0f, (C19EG) aRunnableS40S0300000_7.l2) - (r0.getWidth() / 2));
            } else {
                iLIZJ = 0;
            }
            ((C0J70) aRunnableS40S0300000_7.l1).LIZ(0, iLIZJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.showTopLiveBubbleDirect$1");
    }

    public static final void run$8(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        boolean zLIZ;
        C1C7U.LIZ("CoverViewVideoAboveWidget@1ea7.bindAboveCover$1$1");
        try {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            UrlModel urlModel = (UrlModel) aRunnableS40S0300000_7.l0;
            C521890KdP c521890KdP = (C521890KdP) aRunnableS40S0300000_7.l1;
            CoverViewVideoAboveWidget coverViewVideoAboveWidget = (CoverViewVideoAboveWidget) aRunnableS40S0300000_7.l2;
            c0jbnLIZ.LIZJ(urlModel.getUrlList());
            c0jbnLIZ.LIZLLL(c521890KdP);
            c0jbnLIZ.LJJI(coverViewVideoAboveWidget.LLJIJIL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CoverViewVideoAboveWidget@1ea7.bindAboveCover$1$1");
    }

    public static final void run$9(ARunnableS40S0300000_7 aRunnableS40S0300000_7) {
        C470600Ics c470600Ics = (C470600Ics) aRunnableS40S0300000_7.l0;
        C485050J0l c485050J0l = (C485050J0l) aRunnableS40S0300000_7.l1;
        AbstractC470800IdC abstractC470800IdC = (AbstractC470800IdC) aRunnableS40S0300000_7.l2;
        c470600Ics.getClass();
        C1C7U.LIZ("RxCacheDataSource@388c.handleObservable$2L$2L");
        c470600Ics.LJIIL(c485050J0l, abstractC470800IdC);
        C1C7U.LIZIZ("RxCacheDataSource@388c.handleObservable$2L$2L");
    }

    public ARunnableS40S0300000_7(InterfaceC466370IQp interfaceC466370IQp, InterfaceC466370IQp interfaceC466370IQp2, int i) {
        this.$t = i;
        this.l0 = C0IQV.LLJJIJIIJIL;
        this.l1 = interfaceC466370IQp;
        this.l2 = interfaceC466370IQp2;
    }

    public ARunnableS40S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
