package Y;

import X.C0IJT;
import X.C1161920gLG;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473420IhQ;
import X.C474500IjA;
import X.C915980Zwa;
import X.C925600aC6;
import X.InterfaceC743640TFa;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DobDialogCanceledEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveVisibleScopeSettingFragment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes13.dex */
public class AcS105S0101000_12 implements InterfaceC743640TFa {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS105S0101000_12 acS105S0101000_12, LiveDialog liveDialog) {
        IActionHandlerService iActionHandlerService;
        liveDialog.dismiss();
        C925600aC6.LJJIIJZLJL(acS105S0101000_12.i1, "appeal");
        MultiGuestV3GuestWidget multiGuestV3GuestWidget = (MultiGuestV3GuestWidget) acS105S0101000_12.l0;
        multiGuestV3GuestWidget.getClass();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "linkmic_appeal");
                value = builderBuildUpon.build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AZW.LJFF(multiGuestV3GuestWidget.a2(861), e.toString(), null, null);
            }
        }
        Context context = C915980Zwa.LIZJ().context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, value);
        }
    }

    public static final void LIZ$1(AcS105S0101000_12 acS105S0101000_12, LiveDialog liveDialog) {
        LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = (LiveVisibleScopeSettingFragment) acS105S0101000_12.l0;
        String strLIZ = C473420IhQ.LIZ(Integer.valueOf(acS105S0101000_12.i1));
        liveVisibleScopeSettingFragment.getClass();
        LiveVisibleScopeSettingFragment.PR("click", strLIZ, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS105S0101000_12 acS105S0101000_12, LiveDialog liveDialog) {
        String str;
        IActionHandlerService iActionHandlerService;
        liveDialog.dismiss();
        int i = acS105S0101000_12.i1;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_popup_window_click");
        if (i == 0) {
            str = "multi_live_apply";
        } else {
            str = "multi_live_accept";
        }
        c474500IjALIZ.LJJII(str, "request_page");
        c474500IjALIZ.LJJII("appeal", "click_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        ((GameLinkV2Widget) acS105S0101000_12.l0).getClass();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "linkmic_appeal");
                value = builderBuildUpon.build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("linkmic_appeal:");
                sbLIZ.append(e);
                C20441214yg.LJFF("GameLinkWidget", C2188811AlT.LIZIZ(sbLIZ), null);
            }
        }
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, value);
        }
    }

    public static final void LIZ$3(AcS105S0101000_12 acS105S0101000_12, LiveDialog liveDialog) {
        IActionHandlerService iActionHandlerService;
        liveDialog.dismiss();
        C925600aC6.LJJIIJZLJL(acS105S0101000_12.i1, "appeal");
        ((VoiceChatWatchWidget) acS105S0101000_12.l0).getClass();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "linkmic_appeal");
                value = builderBuildUpon.build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AZW.LJFF("VoiceChatWatchWidget", e.toString(), null, null);
            }
        }
        Context context = C915980Zwa.LIZJ().context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, value);
        }
    }

    public static final void LIZ$4(AcS105S0101000_12 acS105S0101000_12, LiveDialog liveDialog) {
        DataChannel dataChannel;
        liveDialog.dismiss();
        if (acS105S0101000_12.i1 == 2 && (dataChannel = (DataChannel) acS105S0101000_12.l0) != null) {
            dataChannel.FQ2(DobDialogCanceledEvent.class);
        }
        C925600aC6.LJJIIJZLJL(acS105S0101000_12.i1, "ok");
    }

    public AcS105S0101000_12(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
