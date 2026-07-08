package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.bytedance.android.livesdk.livesetting.roomfunction.GpppaGiftBanContractUsUrlSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class DialogInterfaceOnClickListenerC785930UsJ implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public DialogInterfaceOnClickListenerC785930UsJ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        String str;
        C749930TbL c749930TbL = (C749930TbL) dialogInterfaceOnClickListenerC785930UsJ.l0;
        Map map = (Map) dialogInterfaceOnClickListenerC785930UsJ.l1;
        if ("activity_banned_talk".equals(c749930TbL.LLJI)) {
            str = "livesdk_anchor_mute_cancel_toast_click";
        } else {
            str = "livesdk_anchor_blocklist_cancel_toast_click";
        }
        map.put("action_type", "no");
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        dialogInterface.dismiss();
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        ((C0UTD) dialogInterfaceOnClickListenerC785930UsJ.l0).LIZLLL.invoke();
        C0UTB c0utb = (C0UTB) dialogInterfaceOnClickListenerC785930UsJ.l1;
        DataChannel dataChannel = ((C0UTD) dialogInterfaceOnClickListenerC785930UsJ.l0).LIZIZ;
        c0utb.getClass();
        C0UTB.LIZIZ(dataChannel, "cancel");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void onClick$2(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        String str;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        c2344009Gk.LJIIIIZZ("room_id", ((C756080TlG) dialogInterfaceOnClickListenerC785930UsJ.l0).LLILLL.LIZ());
        c2344009Gk.LJIIIIZZ("live_status", ((C756080TlG) dialogInterfaceOnClickListenerC785930UsJ.l0).LLILLL.LIZLLL);
        String strLIZ = ((InterfaceC1124060fMC) dialogInterfaceOnClickListenerC785930UsJ.l1).LIZ();
        String str2 = "";
        if (strLIZ == null) {
            str = "";
        } else {
            switch (strLIZ.hashCode()) {
                case -1949982086:
                    str = !strLIZ.equals("business_links") ? "" : "link";
                    break;
                case -1925858825:
                    str = !strLIZ.equals("ec_shop") ? "" : "shop";
                    break;
                case 671572535:
                    str = !strLIZ.equals("game_partnership") ? "" : "game_partnership";
                    break;
                case 1224862632:
                    str = !strLIZ.equals("ba_leads_gen") ? "" : "lead_gen";
                    break;
                default:
                    str = "";
                    break;
            }
        }
        c2344009Gk.LJIIIIZZ("popup_type", str);
        c2344009Gk.LJIIIIZZ("enter_from_merge", ((C756080TlG) dialogInterfaceOnClickListenerC785930UsJ.l0).LLILLL.LIZ);
        c2344009Gk.LJIIIIZZ("enter_method", ((C756080TlG) dialogInterfaceOnClickListenerC785930UsJ.l0).LLILLL.LIZIZ);
        c2344009Gk.LJIIIIZZ("is_success", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL("livesdk_LIVE_popup_add_click", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("author_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        c2344009Gk2.LJIIIIZZ("room_id", ((C756080TlG) dialogInterfaceOnClickListenerC785930UsJ.l0).LLILLL.LIZ());
        c2344009Gk2.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk2.LJIIIIZZ("live_status", ((C756080TlG) dialogInterfaceOnClickListenerC785930UsJ.l0).LLILLL.LIZLLL);
        c2344009Gk2.LJIIIIZZ("page_name", "business_add_popup");
        String strLIZ2 = ((InterfaceC1124060fMC) dialogInterfaceOnClickListenerC785930UsJ.l1).LIZ();
        if (strLIZ2 != null) {
            int iHashCode = strLIZ2.hashCode();
            if (iHashCode != -1949982086) {
                if (iHashCode != -1925858825) {
                    if (iHashCode == 671572535 && strLIZ2.equals("game_partnership")) {
                        str2 = "game_partnership";
                    }
                } else if (strLIZ2.equals("ec_shop")) {
                    str2 = "add_products";
                }
            } else if (strLIZ2.equals("business_links")) {
                str2 = "add_links";
            }
        }
        c2344009Gk2.LJIIIIZZ("popup_type", str2);
        c2344009Gk2.LJIIIIZZ("button_for", "cancel");
        C20684815ws.LJIILLIIL("livesdk_tiktokec_add_button_popup_click", c2344009Gk2.LIZ);
    }

    public static final void onClick$3(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String value = GpppaGiftBanContractUsUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "gift_appeal");
                value = builderBuildUpon.build().toString();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C501540Jlg.LIZJ((Context) dialogInterfaceOnClickListenerC785930UsJ.l0, e);
            }
            C781270Ukn.LIZ().handle((Context) dialogInterfaceOnClickListenerC785930UsJ.l0, value);
        }
        ((BasePreviewSettingMainFragmentSheetInitializer) dialogInterfaceOnClickListenerC785930UsJ.l1).LJJIJIL("contact_us");
    }

    public static final void onClick$4(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        ((Function1) dialogInterfaceOnClickListenerC785930UsJ.l0).invoke(CertProviderManagerKt.findCert("bpea-420", 1476788483));
        C0UQK.LIZLLL((DataChannel) dialogInterfaceOnClickListenerC785930UsJ.l1, "end_now");
        dialogInterface.dismiss();
    }

    public static final void onClick$5(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        ((Function2) dialogInterfaceOnClickListenerC785930UsJ.l0).invoke(Boolean.FALSE, 0);
        C0UQK.LIZLLL((DataChannel) dialogInterfaceOnClickListenerC785930UsJ.l1, "cancel");
        dialogInterface.dismiss();
    }

    public static final void onClick$6(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        AbstractC784890Uqd abstractC784890Uqd = (AbstractC784890Uqd) dialogInterfaceOnClickListenerC785930UsJ.l0;
        InterfaceC784910Uqf interfaceC784910Uqf = (InterfaceC784910Uqf) dialogInterfaceOnClickListenerC785930UsJ.l1;
        abstractC784890Uqd.getClass();
        interfaceC784910Uqf.execute();
        abstractC784890Uqd.LJI();
    }

    public static final void onClick$7(DialogInterfaceOnClickListenerC785930UsJ dialogInterfaceOnClickListenerC785930UsJ, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) dialogInterfaceOnClickListenerC785930UsJ.l0, value);
        if (UserService.getInstance().user() != null) {
            HashMap map = new HashMap();
            map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_user_click_contact_us");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJIJJLI((DataChannel) dialogInterfaceOnClickListenerC785930UsJ.l1);
            c474500IjALIZ.LIZ();
        }
        HashMap map2 = new HashMap();
        map2.put("choose_type", "contact_us");
        C925600aC6.LJJIJL("guest_connection_underage_popup", "click", map2);
    }
}
