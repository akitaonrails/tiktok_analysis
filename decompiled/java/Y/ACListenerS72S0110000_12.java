package Y;

import X.AbstractC745580TMm;
import X.C0IJT;
import X.C0TZ0;
import X.C0UNN;
import X.C1161920gLG;
import X.C1344030l4z;
import X.C1350920lG6;
import X.C1391190mJ3;
import X.C20337914i1;
import X.C20484615Do;
import X.C20684815ws;
import X.C2097908Jt;
import X.C21411818qq;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C354201Zc;
import X.C474500IjA;
import X.C475510Ikn;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748440TXm;
import X.C748880TZe;
import X.C752120Tes;
import X.C758020ToO;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC1106030et7;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.adminsetting.LiveCommentAddBlockKeywordsOptFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingSheet;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragmentV2;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewAuthorizationViewModel;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS72S0110000_12 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS72S0110000_12 aCListenerS72S0110000_12, View view) {
        if (aCListenerS72S0110000_12.z1) {
            LiveCommentAddBlockKeywordsOptFragmentSheet liveCommentAddBlockKeywordsOptFragmentSheet = (LiveCommentAddBlockKeywordsOptFragmentSheet) aCListenerS72S0110000_12.l0;
            View viewFindViewById = liveCommentAddBlockKeywordsOptFragmentSheet.LLJLLL;
            if (viewFindViewById == null) {
                View view2 = liveCommentAddBlockKeywordsOptFragmentSheet.getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.acz);
                } else {
                    viewFindViewById = null;
                }
                liveCommentAddBlockKeywordsOptFragmentSheet.LLJLLL = (C0TZ0) viewFindViewById;
            }
            ((C0TZ0) viewFindViewById).LJII(false);
        }
    }

    public static final void onClick$1(ACListenerS72S0110000_12 aCListenerS72S0110000_12, View view) {
        String str;
        if (aCListenerS72S0110000_12.z1) {
            C766270U4b.LIZLLL(2131842766);
            return;
        }
        ((C748440TXm) aCListenerS72S0110000_12.l0).LJIIIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stopword_set");
        c474500IjALIZ.LJIL();
        if (((C748440TXm) aCListenerS72S0110000_12.l0).LLJ) {
            str = "host";
        } else {
            str = "moderator";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS72S0110000_12 r13, android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS72S0110000_12.onClick$2(Y.ACListenerS72S0110000_12, android.view.View):void");
    }

    public static final void onClick$3(ACListenerS72S0110000_12 aCListenerS72S0110000_12, View view) {
        String str;
        StarCommentConfig starCommentConfig;
        String strLIZ;
        LiveMode streamType;
        LiveMode liveMode;
        StarCommentConfig starCommentConfig2;
        View viewFindViewById;
        RoomCreateInfo roomCreateInfo;
        String str2;
        if (aCListenerS72S0110000_12.z1) {
            DataChannel dataChannelLJ = C475510Ikn.LJ((LiveCommentSettingFragmentSheet) aCListenerS72S0110000_12.l0);
            if (dataChannelLJ != null && (roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class)) != null && (str2 = roomCreateInfo.starCommentPermissionSwitchOffReason) != null) {
                C766270U4b.LJIIJJI(str2);
                return;
            }
            return;
        }
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = (LiveCommentSettingFragmentSheet) aCListenerS72S0110000_12.l0;
        Context context = liveCommentSettingFragmentSheet.getContext();
        if (context != null) {
            Uri uriLJJL = UriProtector.parse(LiveStarCommentSchemaConfig.INSTANCE.getSettingValue().anchor_settings_scheme);
            View view2 = liveCommentSettingFragmentSheet.getView();
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.fpl)) != null) {
                int height = viewFindViewById.getHeight();
                uriLJJL = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJJL, "height") != null ? C500260Jjc.LJJL(uriLJJL, "height", String.valueOf(((int) C497740JfY.LJJI(height)) + 1)) : uriLJJL.buildUpon().appendQueryParameter("height", String.valueOf(((int) C497740JfY.LJJI(height)) + 1)).build();
            }
            Uri.Builder builderBuildUpon = uriLJJL.buildUpon();
            boolean zLJFF = Intrinsics.LJFF(liveCommentSettingFragmentSheet.LLLLII, "from_page_preview");
            String str3 = CardStruct.IStatusCode.DEFAULT;
            if (!zLJFF) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            builderBuildUpon.appendQueryParameter("is_living", str);
            View viewBS = liveCommentSettingFragmentSheet.BS();
            if (viewBS != null && C500260Jjc.LJJJJIZL(viewBS)) {
                str3 = "1";
            }
            builderBuildUpon.appendQueryParameter("from_reddot", str3);
            if (Intrinsics.LJFF(liveCommentSettingFragmentSheet.LLLLII, "from_page_preview")) {
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(liveCommentSettingFragmentSheet);
                if (dataChannelLJ2 != null && (starCommentConfig2 = (StarCommentConfig) dataChannelLJ2.gg0(C752120Tes.class)) != null) {
                    builderBuildUpon.appendQueryParameter("star_comment_switch", String.valueOf(starCommentConfig2.starCommentSwitch));
                    builderBuildUpon.appendQueryParameter("grant_group", String.valueOf(starCommentConfig2.grantGroup));
                    builderBuildUpon.appendQueryParameter("grant_level", String.valueOf(starCommentConfig2.grantLevel));
                }
            } else {
                Room roomYS = liveCommentSettingFragmentSheet.yS();
                if (roomYS != null && (starCommentConfig = roomYS.starCommentConfig) != null) {
                    builderBuildUpon.appendQueryParameter("star_comment_switch", String.valueOf(starCommentConfig.starCommentSwitch));
                    builderBuildUpon.appendQueryParameter("grant_group", String.valueOf(starCommentConfig.grantGroup));
                    builderBuildUpon.appendQueryParameter("grant_level", String.valueOf(starCommentConfig.grantLevel));
                }
            }
            if (Intrinsics.LJFF(liveCommentSettingFragmentSheet.LLLLII, "from_page_preview")) {
                builderBuildUpon.appendQueryParameter("enter_from", "golive_page");
                DataChannel dataChannelLJ3 = C475510Ikn.LJ(liveCommentSettingFragmentSheet);
                if (dataChannelLJ3 == null || (liveMode = (LiveMode) dataChannelLJ3.gg0(LiveModeChannel.class)) == null) {
                    liveMode = LiveMode.VIDEO;
                }
                builderBuildUpon.appendQueryParameter("live_type", C354201Zc.LIZ(liveMode));
            } else {
                builderBuildUpon.appendQueryParameter("enter_from", "setting_page");
                Room roomYS2 = liveCommentSettingFragmentSheet.yS();
                if (roomYS2 != null && (streamType = roomYS2.getStreamType()) != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                } else {
                    strLIZ = "";
                }
                builderBuildUpon.appendQueryParameter("live_type", strLIZ);
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.build());
        }
        View viewBS2 = ((LiveCommentSettingFragmentSheet) aCListenerS72S0110000_12.l0).BS();
        if (viewBS2 != null) {
            C500260Jjc.LJIILIIL(viewBS2);
        }
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.D4;
        Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put("2", Boolean.FALSE);
        c20337914i1.LJFF(mapLIZIZ);
    }

    public static final void onClick$4(ACListenerS72S0110000_12 aCListenerS72S0110000_12, View view) {
        String str;
        C758020ToO c758020ToO = C758020ToO.LIZ;
        DataChannel dataChannel = ((BasePreviewSettingMainFragmentSheetInitializer) aCListenerS72S0110000_12.l0).LLILLJJLI;
        boolean z = aCListenerS72S0110000_12.z1;
        boolean zLIZJ = C494680Jac.LIZJ();
        DataChannel dataChannel2 = ((BasePreviewSettingMainFragmentSheetInitializer) aCListenerS72S0110000_12.l0).LLILLJJLI;
        if (dataChannel2 != null) {
            str = (String) dataChannel2.gg0(C0UNN.class);
        } else {
            str = null;
        }
        c758020ToO.getClass();
        C758020ToO.LIZ(dataChannel, "click", str, z, zLIZJ);
        DataChannel dataChannel3 = ((BasePreviewSettingMainFragmentSheetInitializer) aCListenerS72S0110000_12.l0).LLILLJJLI;
        if (dataChannel3 != null && dataChannel3.gg0(C748880TZe.class) != null) {
            BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = (BasePreviewSettingMainFragmentSheetInitializer) aCListenerS72S0110000_12.l0;
            C20484615Do c20484615Do = basePreviewSettingMainFragmentSheetInitializer.LLILLL;
            String str2 = LiveVisibleScopeSettingSheet._pnsPageId;
            DataChannel dataChannel4 = basePreviewSettingMainFragmentSheetInitializer.LLILLJJLI;
            LiveVisibleScopeSettingSheet liveVisibleScopeSettingSheet = new LiveVisibleScopeSettingSheet();
            liveVisibleScopeSettingSheet.LLJLLL = dataChannel4;
            c20484615Do.LJIIJ(liveVisibleScopeSettingSheet, "live_visible_scope_setting_sheet");
        }
    }

    public static final void onClick$5(ACListenerS72S0110000_12 aCListenerS72S0110000_12, View view) throws JSONException {
        String str;
        String str2;
        Integer numLIZ;
        Integer numLIZ2;
        VideoViewHistoryAuthorizationFragment videoViewHistoryAuthorizationFragment = (VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0;
        String str3 = videoViewHistoryAuthorizationFragment.LLJI;
        if (Intrinsics.LJFF(videoViewHistoryAuthorizationFragment.LLJIJIL, Boolean.TRUE)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        if (!aCListenerS72S0110000_12.z1) {
            str2 = "not_now";
        } else {
            str2 = "turn_off";
        }
        C1350920lG6.LJIL("video_views_pop_up_click", str3, str, str2, CardStruct.IStatusCode.DEFAULT, ((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).RR(), "two_button", null, null, 384);
        String str4 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0, new AbstractC745580TMm() { // from class: X.0TMk
        });
        String str5 = "on";
        String str6 = "video_views_page_self";
        if (((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).UR().wQ2()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (!Intrinsics.LJFF(((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).LLJI, "personal_homepage")) {
                str6 = "video_views_page_others";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str6);
            c2344009Gk.LJIIIIZZ("action", "not_now");
            PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
            if (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ2 = privacyUserSettingsV2LJIIIIZZ.LIZ("viewer_history")) == null || numLIZ2.intValue() != 1) {
                str5 = "off";
            }
            c2344009Gk.LJIIIIZZ("to_status", str5);
            C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk.LIZ);
            return;
        }
        if (aCListenerS72S0110000_12.z1) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", "video_view");
            c2344009Gk2.LJIIIIZZ("action", "change_status");
            c2344009Gk2.LJIIIIZZ("to_status", "off");
            C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk2.LIZ);
            IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewer_history_setting", "2");
            iPrivacyServiceLJIJJ.LJIJI(2, "viewer_history", C2097908Jt.LIZJ(new Pair("extra", C786410Ut5.J3(jSONObject))));
            return;
        }
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        if (!Intrinsics.LJFF(((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).LLJI, "personal_homepage")) {
            str6 = "video_views_page_others";
        }
        c2344009Gk3.LJIIIIZZ("enter_from", str6);
        c2344009Gk3.LJIIIIZZ("action", "not_now");
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ2 = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ2 == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ2.LIZ("video_view_history")) == null || numLIZ.intValue() != 1) {
            str5 = "off";
        }
        c2344009Gk3.LJIIIIZZ("to_status", str5);
        C20684815ws.LJIILLIIL("change_video_views_status", c2344009Gk3.LIZ);
    }

    public static final void onClick$6(ACListenerS72S0110000_12 aCListenerS72S0110000_12, View view) throws JSONException {
        String str;
        String str2;
        Boolean bool = ((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).LLJIJIL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        VideoViewHistoryAuthorizationFragment videoViewHistoryAuthorizationFragment = (VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0;
        C1350920lG6.LJIL("video_views_pop_up_click", videoViewHistoryAuthorizationFragment.LLJI, str, "turn_on", "1", videoViewHistoryAuthorizationFragment.RR(), "two_button", null, null, 384);
        String str3 = "video_views_page_self";
        if (((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).UR().wQ2()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (Intrinsics.LJFF(((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).LLJI, "personal_homepage")) {
                str2 = "video_views_page_self";
            } else {
                str2 = "video_views_page_others";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("to_status", "on");
            c2344009Gk.LJIIIIZZ("action", "change_status");
            C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk.LIZ);
        }
        ((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).MR().setLoading(true);
        VideoViewAuthorizationViewModel videoViewAuthorizationViewModelUR = ((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).UR();
        VideoViewHistoryAuthorizationFragment videoViewHistoryAuthorizationFragment2 = (VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0;
        String str4 = videoViewHistoryAuthorizationFragment2.LLJILJIL;
        boolean zLJFF = Intrinsics.LJFF(videoViewHistoryAuthorizationFragment2.LLJIJIL, bool2);
        String str5 = ((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).LLJI;
        if (str5 == null) {
            str5 = "";
        }
        videoViewAuthorizationViewModelUR.xQ2(str4, str5, str, "turn_on", "one_button", 1, zLJFF);
        if (aCListenerS72S0110000_12.z1) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", "video_view");
            c2344009Gk2.LJIIIIZZ("action", "change_status");
            c2344009Gk2.LJIIIIZZ("to_status", "on");
            C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk2.LIZ);
            IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewer_history_setting", "1");
            iPrivacyServiceLJIJJ.LJIJI(2, "viewer_history", C2097908Jt.LIZJ(new Pair("extra", C786410Ut5.J3(jSONObject))));
            return;
        }
        if (((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).UR().wQ2()) {
            return;
        }
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        if (!Intrinsics.LJFF(((VideoViewHistoryAuthorizationFragment) aCListenerS72S0110000_12.l0).LLJI, "personal_homepage")) {
            str3 = "video_views_page_others";
        }
        c2344009Gk3.LJIIIIZZ("enter_from", str3);
        c2344009Gk3.LJIIIIZZ("action", "turn_on");
        c2344009Gk3.LJIIIIZZ("to_status", "on");
        C20684815ws.LJIILLIIL("change_video_views_status", c2344009Gk3.LIZ);
    }

    public static final void onClick$7(ACListenerS72S0110000_12 aCListenerS72S0110000_12, View view) throws JSONException {
        String str;
        int i;
        VideoViewHistoryAuthorizationFragmentV2 videoViewHistoryAuthorizationFragmentV2 = (VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0;
        videoViewHistoryAuthorizationFragmentV2.LLJI = true;
        videoViewHistoryAuthorizationFragmentV2.MR().setLoading(true);
        Boolean bool = ((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).LLJIJIL;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            str = "auto_scene";
        } else {
            str = "click_bar";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current status ");
        sbLIZ.append(((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).RR().isChecked());
        C1344030l4z.LIZJ("VideoViewHistoryPopV2", C2188811AlT.LIZIZ(sbLIZ));
        if (((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).RR().isChecked()) {
            i = 1;
        } else {
            i = 2;
        }
        VideoViewAuthorizationViewModel videoViewAuthorizationViewModelSR = ((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).SR();
        VideoViewHistoryAuthorizationFragmentV2 videoViewHistoryAuthorizationFragmentV22 = (VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0;
        String str2 = videoViewHistoryAuthorizationFragmentV22.LLJILJIL;
        boolean zLJFF = Intrinsics.LJFF(videoViewHistoryAuthorizationFragmentV22.LLJIJIL, bool2);
        String str3 = ((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).LLJ;
        if (str3 == null) {
            str3 = "";
        }
        videoViewAuthorizationViewModelSR.xQ2(str2, str3, str, "save", "two_button", i, zLJFF);
        String str4 = "video_views_page_self";
        String str5 = "on";
        if (((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).SR().wQ2()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (!Intrinsics.LJFF(((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).LLJ, "personal_homepage")) {
                str4 = "video_views_page_others";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str4);
            if (!((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).RR().isChecked()) {
                str5 = "off";
            }
            c2344009Gk.LJIIIIZZ("to_status", str5);
            c2344009Gk.LJIIIIZZ("action", "change_status");
            C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk.LIZ);
            return;
        }
        if (aCListenerS72S0110000_12.z1) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", "video_view");
            c2344009Gk2.LJIIIIZZ("action", "change_status");
            C21411818qq c21411818qqRR = ((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).RR();
            if (c21411818qqRR != null && !c21411818qqRR.isChecked()) {
                str5 = "off";
            }
            c2344009Gk2.LJIIIIZZ("to_status", str5);
            C20684815ws.LJIILLIIL("change_viewer_status", c2344009Gk2.LIZ);
            IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewer_history_setting", String.valueOf(i));
            iPrivacyServiceLJIJJ.LJIJI(2, "viewer_history", C2097908Jt.LIZJ(new Pair("extra", C786410Ut5.J3(jSONObject))));
            return;
        }
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        if (!Intrinsics.LJFF(((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).LLJ, "personal_homepage")) {
            str4 = "video_views_page_others";
        }
        c2344009Gk3.LJIIIIZZ("enter_from", str4);
        c2344009Gk3.LJIIIIZZ("action", "save");
        if (!((VideoViewHistoryAuthorizationFragmentV2) aCListenerS72S0110000_12.l0).LLJILJILJ) {
            str5 = "off";
        }
        c2344009Gk3.LJIIIIZZ("to_status", str5);
        C20684815ws.LJIILLIIL("change_video_views_status", c2344009Gk3.LIZ);
    }

    public ACListenerS72S0110000_12(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
