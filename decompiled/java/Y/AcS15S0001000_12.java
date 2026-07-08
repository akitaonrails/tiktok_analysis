package Y;

import X.C0IJT;
import X.C1161920gLG;
import X.C1AZW;
import X.C2188811AlT;
import X.C474500IjA;
import X.C915980Zwa;
import X.C925600aC6;
import X.EnumC1303240k1C;
import X.InterfaceC743640TFa;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes13.dex */
public class AcS15S0001000_12 implements InterfaceC743640TFa {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f290i0;

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
        }
    }

    public AcS15S0001000_12(int i, int i2) {
        this.$t = i2;
        this.f290i0 = i;
    }

    public static final void LIZ$0(AcS15S0001000_12 acS15S0001000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C925600aC6.LJJIIJZLJL(acS15S0001000_12.f290i0, "ok");
    }

    public static final void LIZ$1(AcS15S0001000_12 acS15S0001000_12, LiveDialog liveDialog) {
        String str;
        liveDialog.dismiss();
        int i = acS15S0001000_12.f290i0;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_appeal_popup_window_click");
        if (i == 0) {
            str = "multi_live_apply";
        } else {
            str = "multi_live_accept";
        }
        c474500IjALIZ.LJJII(str, "request_page");
        c474500IjALIZ.LJJII("ok", "click_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static final void LIZ$2(AcS15S0001000_12 acS15S0001000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C925600aC6.LJJIIJZLJL(acS15S0001000_12.f290i0, "ok");
    }

    public static final void LIZ$3(AcS15S0001000_12 acS15S0001000_12, LiveDialog liveDialog) {
        IActionHandlerService iActionHandlerService;
        liveDialog.dismiss();
        C925600aC6.LJJIIJZLJL(acS15S0001000_12.f290i0, "appeal");
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
                sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
                sbLIZ.append("_MultiGuestPermissionDialogHelper_");
                sbLIZ.append(179);
                C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), e.toString(), null, null);
            }
        }
        Context context = C915980Zwa.LIZJ().context();
        if (context != null && (iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)) != null) {
            iActionHandlerService.handle(context, value);
        }
    }
}
