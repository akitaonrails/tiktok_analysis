package X;

import Y.AObjectS60S0000000_7;
import Y.ARunnableS12S0200100_7;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.model.ExtraResult;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.dataChannel.RoomEnterReturnData;
import com.bytedance.android.livesdk.livefinishcard.LiveEndPageFullToHalfOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.mvp.PaidRoomCheckDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widget.LiveAgeRestrictedWidget;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IIA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIA implements InterfaceC463940IHg {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ LivePlayFragment LIZIZ;

    @Override // X.InterfaceC463940IHg
    public final void LIZ(C463950IHh c463950IHh) {
        LivePlayFragment livePlayFragment = this.LIZIZ;
        C467650IVn c467650IVn = livePlayFragment.LLLF;
        if (c467650IVn != null && c463950IHh.LIZJ == 2) {
            c467650IVn.LJIILL(false, true, livePlayFragment.g1.mRoomsData.enterType, c463950IHh.LIZ, livePlayFragment.y, System.currentTimeMillis(), this.LIZIZ.g1.mLogData.previewCtrSessionId);
        }
    }

    @Override // X.InterfaceC463940IHg
    public final void LIZIZ(C463950IHh c463950IHh) {
        LJ(c463950IHh);
    }

    @Override // X.InterfaceC463940IHg
    public final void LIZJ(C463950IHh c463950IHh) {
        LJ(c463950IHh);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0835 A[PHI: r5
      0x0835: PHI (r5v70 boolean) = (r5v69 boolean), (r5v75 boolean) binds: [B:252:0x0831, B:116:0x03e7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final X.C463950IHh r26) {
        /*
            Method dump skipped, instruction units count: 2806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IIA.LJ(X.0IHh):void");
    }

    public final void LJFF(boolean z) {
        HashMap<String, String> map;
        LivePlayFragment livePlayFragment = this.LIZIZ;
        EnterRoomConfig enterRoomConfig = livePlayFragment.g1;
        if (enterRoomConfig != null && livePlayFragment.R0 != null && "mall".equals(enterRoomConfig.mRoomsData.enterFromMerge)) {
            C463260IEq c463260IEq = this.LIZIZ.R0;
            long j = c463260IEq.LJI;
            if (j != -1 || c463260IEq.LJII != -1) {
                long j2 = c463260IEq.LJII;
                if (j2 != -1) {
                    j = j2;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                EnterRoomConfig.ECWrapData eCWrapData = this.LIZIZ.g1.mECData;
                HashMap map2 = new HashMap();
                map2.put("real_duration", String.valueOf(jCurrentTimeMillis));
                map2.put("is_success", String.valueOf(z));
                if (eCWrapData != null && (map = eCWrapData.ecCommonExtraParam) != null) {
                    map2.putAll(map);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enter_room_api_result");
                c474500IjALIZ.LJJIIZI(map2);
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        }
    }

    public C0IIA(LivePlayFragment livePlayFragment, long j) {
        this.LIZIZ = livePlayFragment;
        this.LIZ = j;
    }

    @Override // X.InterfaceC463940IHg
    public final void LIZLLL(int i, String str, String str2, String str3) {
        boolean z;
        int i2;
        if (C0JDZ.LIZIZ) {
            C0JDZ.LIZIZ = false;
        }
        LivePlayFragment livePlayFragment = this.LIZIZ;
        ARunnableS12S0200100_7 aRunnableS12S0200100_7 = livePlayFragment.e1;
        if (aRunnableS12S0200100_7 != null) {
            livePlayFragment.x0.removeCallbacks(aRunnableS12S0200100_7);
            livePlayFragment.e1 = null;
        }
        C0IEQ c0ieq = livePlayFragment.d1;
        if (c0ieq != null) {
            c0ieq.LIZ();
            livePlayFragment.d1 = null;
        }
        LivePlayFragment livePlayFragment2 = this.LIZIZ;
        if (livePlayFragment2.LLLZLL) {
            livePlayFragment2.AW();
        }
        ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.END_ENTER_ROOM);
        if (LiveEnterRoomClickPerfOptSetting.optRedDotManagerInitDefer()) {
            C782710Un7 c782710Un7 = C782710Un7.LIZ;
            C0UX8 c0ux8 = C0UX8.EVENT_PAGE_WATCH_LIVE;
            c782710Un7.getClass();
            C782710Un7.LJIIJJI(null, c0ux8, null);
        }
        LivePlayFragment livePlayFragment3 = this.LIZIZ;
        C467650IVn c467650IVn = livePlayFragment3.LLLF;
        if (c467650IVn != null) {
            c467650IVn.LJJJLIIL = false;
        }
        livePlayFragment3.PS().LIZIZ("room_enter_failed");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("room/enter fail -> origin room_id = ");
        sbLIZ.append(this.LIZ);
        C827750WdZ.LIZ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (!C497740JfY.LJIL() && C0IIO.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("landscape_feed_slide_complete");
            c474500IjALIZ.LJJII(0, "landscape_slide_enter_room_status");
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - C0IIO.LIZJ), "landscape_slide_to_load_duration");
            c474500IjALIZ.LJJII(Integer.valueOf(C0IIO.LIZLLL), "landscape_position");
            c474500IjALIZ.LJJII(Boolean.valueOf(C0IIO.LJII), "landscape_first_frame_has_displayed");
            c474500IjALIZ.LJJII(C0IIO.LJI, "landscape_live_type");
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - C0IIO.LIZJ), "landscape_slide_enter_room_duration");
            c474500IjALIZ.LJJII(Long.valueOf(C0IIO.LJFF), "room_id");
            c474500IjALIZ.LJJII(str, "landscape_slide_enter_room_failed_msg");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "landscape_slide_enter_room_failed_code");
            c474500IjALIZ.LIZ();
        }
        this.LIZIZ.y.IQ2(C749240TaE.class, new Pair(201, Integer.valueOf(i)));
        LivePlayFragment livePlayFragment4 = this.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append(str);
        livePlayFragment4.ST("push_fetch_room_error", C2188811AlT.LIZIZ(sbLIZ2));
        LivePlayFragment livePlayFragment5 = this.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(i);
        sbLIZ3.append(str);
        livePlayFragment5.VT("fetch_room_error", C2188811AlT.LIZIZ(sbLIZ3));
        if (i == 4003043) {
            FragmentManager childFragmentManager = this.LIZIZ.getChildFragmentManager();
            long j = this.LIZ;
            PaidRoomCheckDialog paidRoomCheckDialog = new PaidRoomCheckDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("roomId", j);
            paidRoomCheckDialog.setArguments(bundle);
            paidRoomCheckDialog.show(childFragmentManager, "PaidRoomCheckDialog.class");
            return;
        }
        if (i == 4003072) {
            C0IEB c0ieb = this.LIZIZ.LLLFZ;
            if (c0ieb != null) {
                c0ieb.stop(false);
            }
            this.LIZIZ.AV("reset player");
            C19EG activity = this.LIZIZ.getActivity();
            LivePlayFragment livePlayFragment6 = this.LIZIZ;
            C0IZR.LIZIZ(activity, livePlayFragment6.g1, livePlayFragment6.y, false);
            return;
        }
        this.LIZIZ.a1 = true;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(this.LIZIZ.A0);
        sbLIZ4.append("_");
        sbLIZ4.append(this.LIZIZ.LLILLJJLI);
        dataChannelGlobal.HQ2(RoomEnterReturnData.class, new Pair(C2188811AlT.LIZIZ(sbLIZ4), Boolean.TRUE));
        LivePlayFragment livePlayFragment7 = this.LIZIZ;
        livePlayFragment7.G0.LIZLLL = 1;
        livePlayFragment7.RT("fetch_room_error");
        LJFF(false);
        C0INV c0inv = C0IL2.LIZ;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = c0inv.LIZ();
        C0IIR c0iir = C0IIR.ServerApiCall;
        Event event = new Event("live_play_enter_room_fail", 1031, c0iir);
        event.LIZIZ("room enter api fail callback.");
        enterRoomLinkSessionLIZ.LIZIZ(event);
        if ((TextUtils.isEmpty(str) || !str.contains("30003")) && i != 30003) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("rd_enter_room_failed");
            c474500IjALIZ2.LJIJJLI(this.LIZIZ.y);
            c474500IjALIZ2.LIZ();
            C463430IFh c463430IFh = C463290IEt.LIZLLL;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("Fail to enter the room. errMsg = ");
            sbLIZ5.append(str);
            sbLIZ5.append(" errorCode = ");
            sbLIZ5.append(i);
            sbLIZ5.append(" errPrompt = ");
            sbLIZ5.append(str2);
            c463430IFh.LIZJ = C2188811AlT.LIZIZ(sbLIZ5);
            this.LIZIZ.dS(c463430IFh);
            if (i != 0) {
                i2 = i;
            } else {
                i2 = 103;
            }
            LivePlayFragment livePlayFragment8 = this.LIZIZ;
            livePlayFragment8.G0.LJIIL(i2, str, livePlayFragment8.LLLZI, this.LIZ, livePlayFragment8.LLJ);
            LivePlayFragment livePlayFragment9 = this.LIZIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("enter room request failure, errMsg = ");
            sbLIZ6.append(str);
            sbLIZ6.append(" ,frame_fail");
            livePlayFragment9.PT(205L, i2, C2188811AlT.LIZIZ(sbLIZ6));
            if (this.LIZIZ.getActivity() != null && ((C500260Jjc.LJJII(this.LIZIZ.getActivity().getRequestedOrientation()) || C500260Jjc.LJJII(this.LIZIZ.LLJLL)) && !this.LIZIZ.KT())) {
                LivePlayFragment livePlayFragment10 = this.LIZIZ;
                livePlayFragment10.LLJLL = 1;
                livePlayFragment10.getActivity().setRequestedOrientation(this.LIZIZ.LLJLL);
            }
            if (i == 4003098) {
                EnterRoomLinkSession enterRoomLinkSessionLIZ2 = c0inv.LIZ();
                Event event2 = new Event("live_play_enter_room_fail", 1036, c0iir);
                event2.LIZIZ("enter room api return fail.error_code = 4003098");
                enterRoomLinkSessionLIZ2.LIZIZ(event2);
                C0IIS.LIZLLL(this.LIZIZ.g1, C0II1.UNSTABLE_CONNECTION, "slide_next_room", null);
                this.LIZIZ.oS(C0II0.ENTER_FAILED);
                return;
            }
            if (i == 4003157) {
                this.LIZIZ.YS(str3);
                this.LIZIZ.qS(C0II0.LCC_PERCEPTION, "enter_room", 0);
                return;
            }
            if (i == 4003182) {
                this.LIZIZ.YS(str3);
                this.LIZIZ.qS(C0II0.EC_LIMIT, "ec_limit_u18", 0);
                return;
            }
            if (i == 4003185) {
                this.LIZIZ.YS(str3);
                this.LIZIZ.qS(C0II0.EC_LIMIT, "ec_limit_rm_parent", 0);
                return;
            }
            if (i == 4003186) {
                this.LIZIZ.YS(str3);
                this.LIZIZ.qS(C0II0.EC_LIMIT, "ec_limit_rm_child", 0);
                return;
            }
            if (i == 4003175) {
                this.LIZIZ.YS(str3);
                this.LIZIZ.qS(C0II0.RESTRICTED_MODE, "restricted_mode_child", 0);
                return;
            }
            if (i == 4003176) {
                this.LIZIZ.YS(str3);
                this.LIZIZ.qS(C0II0.RESTRICTED_MODE, "restricted_mode_parent", 0);
                return;
            }
            if (i == 4003110) {
                C0IIS.LIZLLL(this.LIZIZ.g1, C0II1.IS_MINOR_AGE, "slide_next_room", Integer.valueOf(i));
                LivePlayFragment livePlayFragment11 = this.LIZIZ;
                LiveAgeRestrictedWidget liveAgeRestrictedWidget = livePlayFragment11.G;
                if (liveAgeRestrictedWidget == null) {
                    livePlayFragment11.G = new LiveAgeRestrictedWidget(livePlayFragment11.LLLFZ);
                    RecyclableWidgetManager recyclableWidgetManagerZS = livePlayFragment11.ZS();
                    recyclableWidgetManagerZS.load(R.id.aks, livePlayFragment11.G);
                    CloseWidget closeWidget = (CloseWidget) recyclableWidgetManagerZS.getRecyclableWidgetFromCacheOrNew(CloseWidget.class, null, new AObjectS60S0000000_7(11));
                    recyclableWidgetManagerZS.load(R.id.akl, closeWidget);
                    livePlayFragment11.E = closeWidget;
                } else {
                    C0IEB c0ieb2 = livePlayFragment11.LLLFZ;
                    if (!liveAgeRestrictedWidget.isDestroyed && liveAgeRestrictedWidget.hasAttached) {
                        liveAgeRestrictedWidget.LL = c0ieb2;
                    }
                }
                livePlayFragment11.G.show();
                C1113800f5e.LJIIIIZZ = false;
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_mature_theme_mask_show");
                c474500IjALIZ3.LJIJJLI(livePlayFragment11.y);
                c474500IjALIZ3.LIZ();
                return;
            }
            if (i == 4003135) {
                EnterRoomLinkSession enterRoomLinkSessionLIZ3 = c0inv.LIZ();
                Event event3 = new Event("live_play_enter_room_fail", 1036, c0iir);
                event3.LIZIZ("enter room api return fail.error_code = 4003135");
                enterRoomLinkSessionLIZ3.LIZIZ(event3);
                C0IIS.LIZLLL(this.LIZIZ.g1, C0II1.SUB_ONLY_ERROR, "slide_next_room", null);
                this.LIZIZ.qS(C0II0.SUB_ONLY_ERROR, str2, 0);
                return;
            }
            if (i == 30015) {
                LivePlayFragment livePlayFragment12 = this.LIZIZ;
                if (livePlayFragment12.LLLF != null) {
                    C467650IVn.LJIILLIIL(livePlayFragment12.y, 3, "live");
                }
                C766270U4b.LIZLLL(2131844012);
                this.LIZIZ.PT(208L, i, "user is living");
                Event event4 = new Event("live_play_enter_room_fail", 33807, c0iir);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("enter room api return fail.You are live broadcasting dialog click cancel. error_code: ");
                sbLIZ7.append(i);
                sbLIZ7.append(", error_prompt: ");
                sbLIZ7.append(str2);
                event4.LIZIZ(C2188811AlT.LIZIZ(sbLIZ7));
                c0inv.LIZ().LIZIZ(event4);
                LivePlayFragment livePlayFragment13 = this.LIZIZ;
                C0II1 c0ii1 = C0II1.ROOM_LIVING_SELF;
                livePlayFragment13.getClass();
                livePlayFragment13.sS(c0ii1, C0IIQ.ERROR, i);
                return;
            }
            if (i == 4003160) {
                int iYS = this.LIZIZ.YS(str3);
                C0II0 c0ii0 = C0II0.REGION_BLOCK;
                if (iYS == 70) {
                    c0ii0 = C0II0.VIEWER_LIMIT_ROOM;
                }
                this.LIZIZ.qS(c0ii0, "enter_room", 0);
                return;
            }
            if ((TextUtils.isEmpty(str) || !str.contains("30005")) && i != 30005) {
                if (!TextUtils.isEmpty(str2) && i != 0) {
                    Event event5 = new Event("live_play_enter_room_fail", 1037, c0iir);
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("enter room api return fail. error_code: ");
                    sbLIZ8.append(i);
                    sbLIZ8.append(", error_prompt: ");
                    sbLIZ8.append(str2);
                    event5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ8));
                    c0inv.LIZ().LIZIZ(event5);
                    C0IIS.LIZLLL(this.LIZIZ.g1, C0II1.ENTER_LIVE_SERVER_ERROR, "slide_next_room", Integer.valueOf(i));
                    if (i != 30006 && i != 4003048) {
                        this.LIZIZ.qS(C0II0.ENTER_FAILED, str2, 0);
                        return;
                    } else {
                        this.LIZIZ.qS(C0II0.ENTER_FAILED_KICKED, str2, 0);
                        return;
                    }
                }
                EnterRoomLinkSession enterRoomLinkSessionLIZ4 = c0inv.LIZ();
                Event event6 = new Event("live_play_enter_room_fail", 1036, c0iir);
                event6.LIZIZ("enter room api return fail.error_code =0");
                enterRoomLinkSessionLIZ4.LIZIZ(event6);
                C0IIS.LIZLLL(this.LIZIZ.g1, C0II1.ENTER_LIVE_SERVER_ERROR, "slide_next_room", 103);
                this.LIZIZ.oS(C0II0.ENTER_FAILED);
                return;
            }
            LivePlayFragment livePlayFragment14 = this.LIZIZ;
            if (livePlayFragment14.LLLF != null) {
                C467650IVn.LJIILLIIL(livePlayFragment14.y, 4, "live");
            }
            C766270U4b.LIZLLL(2131844012);
            this.LIZIZ.PT(208L, i, "user is living");
            Event event7 = new Event("live_play_enter_room_fail", 33807, c0iir);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("enter room api return fail.You are live broadcasting dialog click cancel. error_code: ");
            sbLIZ9.append(i);
            sbLIZ9.append(", error_prompt: ");
            sbLIZ9.append(str2);
            event7.LIZIZ(C2188811AlT.LIZIZ(sbLIZ9));
            c0inv.LIZ().LIZIZ(event7);
            LivePlayFragment livePlayFragment15 = this.LIZIZ;
            C0II1 c0ii12 = C0II1.ROOM_ENTER_API_BROADCASTING;
            livePlayFragment15.getClass();
            livePlayFragment15.sS(c0ii12, C0IIQ.ERROR, i);
            return;
        }
        C474500IjA c474500IjALIZ4 = C0IJT.LIZ("rd_enter_room_live_end");
        c474500IjALIZ4.LJIJJLI(this.LIZIZ.y);
        c474500IjALIZ4.LIZ();
        this.LIZIZ.PT(201L, i, "room finish, live_end");
        EnterRoomLinkSession enterRoomLinkSessionLIZ5 = c0inv.LIZ();
        Event event8 = new Event("live_play_enter_room_fail", 1032, C0IIR.BussinessApiCall);
        event8.LIZIZ("room enter show end fragment");
        enterRoomLinkSessionLIZ5.LIZIZ(event8);
        LivePlayFragment livePlayFragment16 = this.LIZIZ;
        livePlayFragment16.getClass();
        if (!TextUtils.isEmpty(str3) && str3.contains("finished_perception_msg")) {
            try {
                ExtraResult extraResult = (ExtraResult) C19748512Ol.LIZJ.LJII(str3, ExtraResult.class);
                livePlayFragment16.S = new ControlMessage();
                Text text = new Text();
                text.defaultPattern = extraResult.finishedPerceptionMsg;
                ControlMessage controlMessage = livePlayFragment16.S;
                controlMessage.perceptionAudienceText = text;
                controlMessage.punishInfo = extraResult.punishInfo;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LivePlayFragment", e.getMessage());
            }
        }
        if (this.LIZIZ.GV(false, null) != 1 && (!LiveEndPageFullToHalfOptSetting.INSTANCE.isEnable() || !TextUtils.equals(this.LIZIZ.g1.mRoomsData.enterFromMerge, "push"))) {
            this.LIZIZ.SU(2131842905, 500, this.LIZ, "end", true);
        }
        this.LIZIZ.eW(true);
        this.LIZIZ.dS(C463290IEt.LJII);
        LivePlayFragment livePlayFragment17 = this.LIZIZ;
        livePlayFragment17.LLL = C0IID.LIVE_FINISHED;
        EnterRoomConfig enterRoomConfig = livePlayFragment17.g1;
        if (enterRoomConfig != null) {
            enterRoomConfig.mRoomsData.enterLiveAlive = 0;
            if ("webapp".equals(enterRoomConfig.mLogData.enterFrom)) {
                C474500IjA c474500IjALIZ5 = C0IJT.LIZ("livesdk_question_scan_success");
                c474500IjALIZ5.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ5.LJJII("", "room_id");
                c474500IjALIZ5.LJJII("webapp", "enter_from");
                c474500IjALIZ5.LJJII("", "live_type");
                c474500IjALIZ5.LIZ();
            }
            LivePlayFragment livePlayFragment18 = this.LIZIZ;
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(i);
            sbLIZ10.append(str);
            livePlayFragment18.VT("success_finish_schema", C2188811AlT.LIZIZ(sbLIZ10));
            LivePlayFragment livePlayFragment19 = this.LIZIZ;
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append(i);
            sbLIZ11.append(str);
            livePlayFragment19.ST("push_success_finish_schema", C2188811AlT.LIZIZ(sbLIZ11));
        }
    }
}
