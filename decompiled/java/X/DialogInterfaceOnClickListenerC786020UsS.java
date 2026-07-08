package X;

import Y.AfS181S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.LiveCoverControllerChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.PreviewStartLiveContinueMsgChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewFixBackDialogBugSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableUrlListSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.GpppaGiftBanContractUsUrlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0UsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnClickListenerC786020UsS implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
            case 6:
                onClick$6(this, dialogInterface, i);
                break;
            case 7:
                onClick$7(this, dialogInterface, i);
                break;
            case 8:
                onClick$8(this, dialogInterface, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, dialogInterface, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, dialogInterface, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, dialogInterface, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, dialogInterface, i);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, dialogInterface, i);
                break;
            case 14:
                onClick$14(this, dialogInterface, i);
                break;
            case 15:
                onClick$15(this, dialogInterface, i);
                break;
            case 16:
                onClick$16(this, dialogInterface, i);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, dialogInterface, i);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, dialogInterface, i);
                break;
            case 19:
                onClick$19(this, dialogInterface, i);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC786020UsS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (value == null || value.length() <= 0) {
            if (C781270Ukn.LJIIJJI().isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
            builderBuildUpon.appendQueryParameter("enter_from", "gift_appeal");
            value = builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C781270Ukn.LIZ().handle(((BasePreviewSettingMainFragment) dialogInterfaceOnClickListenerC786020UsS.l0).getContext(), value);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_click_contact_us");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (value.length() <= 0) {
            if (C781270Ukn.LJIIJJI().isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
            builderBuildUpon.appendQueryParameter("enter_from", "gift_appeal");
            value = builderBuildUpon.build().toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C781270Ukn.LIZ().handle(((BasePreviewSettingMainFragmentSheetInitializer) dialogInterfaceOnClickListenerC786020UsS.l0).LL.getContext(), value);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_click_contact_us");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$10(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        C754410TiZ c754410TiZ;
        dialogInterface.dismiss();
        DataChannel dataChannel = (DataChannel) dialogInterfaceOnClickListenerC786020UsS.l0;
        if (dataChannel != null && (c754410TiZ = (C754410TiZ) dataChannel.gg0(LiveCoverControllerChannel.class)) != null && c754410TiZ.LIZJ == null) {
            c754410TiZ.LIZIZ.LJIIIIZZ();
        }
    }

    public static final void onClick$11(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        Context context = (Context) dialogInterfaceOnClickListenerC786020UsS.l0;
        C781270Ukn.LJFF().Zz1();
        C784610UqB.LIZIZ(context, new C784600UqA("https://www.tiktok.com/aweme/in_app/suicide/help/?is_live=1&enter_from=livestream_keyword_popup&title=" + context.getString(2131855396)));
    }

    public static final void onClick$12(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        C0UQX.LJJ((DataChannel) dialogInterfaceOnClickListenerC786020UsS.l0, 2, "end_now");
        C464950ILd.LJI.getClass();
        C464950ILd.LJ(null, 3);
        DataChannel dataChannel = (DataChannel) dialogInterfaceOnClickListenerC786020UsS.l0;
        if (dataChannel != null) {
            dataChannel.SX0(C0UP3.class, Boolean.TRUE);
        }
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZJ();
        C20441214yg.LIZIZ("PreviewStartLiveExceptionHelper", "end now clicked");
        DataChannel dataChannel2 = (DataChannel) dialogInterfaceOnClickListenerC786020UsS.l0;
        if (dataChannel2 != null) {
            dataChannel2.zW(PreviewStartLiveContinueMsgChannel.class, Boolean.TRUE);
        }
        if (AnchorPreviewFixBackDialogBugSetting.INSTANCE.enable()) {
            PreviewContinueLiveHelper.LIZ.getClass();
            PreviewContinueLiveHelper.LIZJ = null;
        }
    }

    public static final void onClick$13(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        C0UQX.LJJ((DataChannel) dialogInterfaceOnClickListenerC786020UsS.l0, 2, "cancel");
        boolean z = C0URD.LJ;
        C0UQ2.LIZ().LIZJ();
        if (AnchorPreviewFixBackDialogBugSetting.INSTANCE.enable()) {
            PreviewContinueLiveHelper.LIZ.getClass();
            PreviewContinueLiveHelper.LIZJ = null;
        }
    }

    public static final void onClick$14(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        DialogC752370TfH dialogC752370TfH = (DialogC752370TfH) dialogInterfaceOnClickListenerC786020UsS.l0;
        dialogC752370TfH.getClass();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            C766270U4b.LJFF(2131843092, dialogC752370TfH.LLLLL);
        } else {
            ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).S70(dialogC752370TfH, true, dialogC752370TfH.LLLLILI, dialogC752370TfH.LLLLJI, "KickOutDialog", null);
        }
        InterfaceC752380TfI interfaceC752380TfI = dialogC752370TfH.LLLLLIL;
        if (interfaceC752380TfI != null) {
            interfaceC752380TfI.LIZ();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("blocked_list_toast_click");
        c474500IjALIZ.LJJIIZI(dialogC752370TfH.LJL());
        c474500IjALIZ.LJJII(dialogC752370TfH.LLLLLJLJLL, "enter_from");
        c474500IjALIZ.LJIIJJI("relation");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJ("yes");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$15(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        DialogC752370TfH dialogC752370TfH = (DialogC752370TfH) dialogInterfaceOnClickListenerC786020UsS.l0;
        InterfaceC752380TfI interfaceC752380TfI = dialogC752370TfH.LLLLLIL;
        if (interfaceC752380TfI != null) {
            interfaceC752380TfI.onCancel();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("blocked_list_toast_click");
        c474500IjALIZ.LJJIIZI(dialogC752370TfH.LJL());
        c474500IjALIZ.LJJII(dialogC752370TfH.LLLLLJLJLL, "enter_from");
        c474500IjALIZ.LJIIJJI("relation");
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJ("no");
        c474500IjALIZ.LIZ();
        if (dialogC752370TfH.isShowing()) {
            dialogC752370TfH.dismiss();
            C785410UrT.LIZ(dialogC752370TfH);
        }
        C784440Upu.LIZ().LIZIZ(new C752390TfJ());
    }

    public static final void onClick$16(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        if (LiveStreamEnableUrlListSetting.INSTANCE.enable()) {
            VoiceChatBroadcastFragment voiceChatBroadcastFragment = (VoiceChatBroadcastFragment) dialogInterfaceOnClickListenerC786020UsS.l0;
            C1273890jFr c1273890jFr = voiceChatBroadcastFragment.LLJJJ;
            if (c1273890jFr != null) {
                c1273890jFr.LJJIFFI(voiceChatBroadcastFragment.PR().getStreamUrl().pushUrlList, true);
                return;
            }
            return;
        }
        VoiceChatBroadcastFragment voiceChatBroadcastFragment2 = (VoiceChatBroadcastFragment) dialogInterfaceOnClickListenerC786020UsS.l0;
        C1273890jFr c1273890jFr2 = voiceChatBroadcastFragment2.LLJJJ;
        if (c1273890jFr2 == null) {
            return;
        }
        c1273890jFr2.LJJI(voiceChatBroadcastFragment2.PR().getStreamUrl().LIZLLL, true);
    }

    public static final void onClick$17(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        ((VoiceChatBroadcastFragment) dialogInterfaceOnClickListenerC786020UsS.l0).PS(C0UZP.LIZ());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_failed_click");
        c474500IjALIZ.LJJII("end_live", "click_icon");
        c474500IjALIZ.LJJII(Integer.valueOf(((VoiceChatBroadcastFragment) dialogInterfaceOnClickListenerC786020UsS.l0).LLJJJJJIL ? 1 : 0), "is_first_fail");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$18(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        ((VoiceChatBroadcastFragment) dialogInterfaceOnClickListenerC786020UsS.l0).PS(C0UZP.LIZ());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_push_stream_failed_click");
        c474500IjALIZ.LJJII("end_live", "click_icon");
        c474500IjALIZ.LJJII(Integer.valueOf(((VoiceChatBroadcastFragment) dialogInterfaceOnClickListenerC786020UsS.l0).LLJJJJJIL ? 1 : 0), "is_first_fail");
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$19(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        C780870Uk9 c780870Uk9 = (C780870Uk9) dialogInterfaceOnClickListenerC786020UsS.l0;
        c780870Uk9.getClass();
        dialogInterface.dismiss();
        c780870Uk9.LIZLLL.LJIIIZ();
        c780870Uk9.LIZLLL.LJIIIIZZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_change_cover_window_click");
        c474500IjALIZ.LJJII("confirm", "result");
        c474500IjALIZ.LJJIIZI(c780870Uk9.LIZIZ());
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C752320TfC c752320TfC = (C752320TfC) dialogInterfaceOnClickListenerC786020UsS.l0;
        Long l = (Long) c752320TfC.LIZ().gg0(C751340Tdc.class);
        if (l != null) {
            l.longValue();
            LifecycleOwner lifecycleOwner = c752320TfC.LIZ().LLILZ;
            if (lifecycleOwner != null) {
                C500260Jjc.LJJJJJ(lifecycleOwner, null, new C751330Tdb(c752320TfC, null), 3);
            }
        }
    }

    public static final void onClick$20(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        C780870Uk9 c780870Uk9 = (C780870Uk9) dialogInterfaceOnClickListenerC786020UsS.l0;
        c780870Uk9.getClass();
        dialogInterface.dismiss();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_change_cover_window_click");
        c474500IjALIZ.LJJII("live", "result");
        c474500IjALIZ.LJJIIZI(c780870Uk9.LIZIZ());
        c474500IjALIZ.LIZ();
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        final CommentWidget commentWidget = (CommentWidget) dialogInterfaceOnClickListenerC786020UsS.l0;
        commentWidget.getClass();
        dialogInterface.dismiss();
        Room room = commentWidget.LLJJIJIIJIL;
        if (room != null) {
            room.getId();
            final DataChannel dataChannel = commentWidget.dataChannel;
            AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Tdl
                public final /* synthetic */ boolean LLILLJJLI = true;

                @Override // X.InterfaceC300801Eo
                public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
                    C500260Jjc.LJJJJJ(commentWidget, null, new C751420Tdk(this.LLILLJJLI, dataChannel, interfaceC2329309At, null), 3);
                }
            }).LJFF(new C0UO0()).LJJIIZ(new AfS181S0100000_12(commentWidget, 153), new C09JN() { // from class: X.0Gct
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CommentWidget@f00c.requestOpenComment$2L");
                    C766270U4b.LIZLLL(2131842705);
                    C1C7U.LIZIZ("CommentWidget@f00c.requestOpenComment$2L");
                }
            });
        }
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        if (!((C779700UiG) dialogInterfaceOnClickListenerC786020UsS.l0).LIZ()) {
            ((C779700UiG) dialogInterfaceOnClickListenerC786020UsS.l0).LIZLLL();
        }
        C779700UiG c779700UiG = (C779700UiG) dialogInterfaceOnClickListenerC786020UsS.l0;
        c779700UiG.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_pause_confirm_click");
        c474500IjALIZ.LJJII(c779700UiG.LIZJ(), "live_type");
        c474500IjALIZ.LJJII(1, "in_app");
        c474500IjALIZ.LJIJJLI(c779700UiG.LL);
        c474500IjALIZ.LIZ();
        dialogInterface.dismiss();
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String value = GpppaGiftBanContractUsUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "gift_appeal");
                value = builderBuildUpon.build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C501540Jlg.LIZJ(((BasePreviewSettingMainFragment) dialogInterfaceOnClickListenerC786020UsS.l0).getContext(), e);
            }
            C781270Ukn.LIZ().handle(((BasePreviewSettingMainFragment) dialogInterfaceOnClickListenerC786020UsS.l0).getContext(), value);
        }
        ((BasePreviewSettingMainFragment) dialogInterfaceOnClickListenerC786020UsS.l0).iS("contact_us");
    }

    public static final void onClick$6(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((BasePreviewSettingMainFragment) dialogInterfaceOnClickListenerC786020UsS.l0).iS("cancel");
    }

    public static final void onClick$7(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((BasePreviewSettingMainFragmentSheetInitializer) dialogInterfaceOnClickListenerC786020UsS.l0).LJJIJIL("cancel");
    }

    public static final void onClick$8(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        ((C784470Upx) dialogInterfaceOnClickListenerC786020UsS.l0).LIZLLL(dialogInterface);
    }

    public static final void onClick$9(DialogInterfaceOnClickListenerC786020UsS dialogInterfaceOnClickListenerC786020UsS, DialogInterface dialogInterface, int i) {
        C784470Upx c784470Upx = (C784470Upx) dialogInterfaceOnClickListenerC786020UsS.l0;
        c784470Upx.getClass();
        InterfaceC1106030et7.c5.LJFF(Boolean.FALSE);
        c784470Upx.LIZIZ("not_allowed");
        dialogInterface.dismiss();
    }
}
