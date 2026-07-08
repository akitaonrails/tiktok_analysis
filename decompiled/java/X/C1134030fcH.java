package X;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveUserRiskVerifySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0fcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134030fcH {
    public static final /* synthetic */ int LJIIJ = 0;
    public Context LIZ;
    public DataChannel LIZIZ;
    public LiveDialog LJ;
    public LiveDialog LJFF;
    public LiveDialog LJI;
    public C19GN LJII;
    public DialogFragment LJIIIIZZ;
    public final C1134090fcN LIZJ = new C1134090fcN(TimeUnit.SECONDS.toMillis(1));
    public final AwS596S0100000_17 LIZLLL = new AwS596S0100000_17(this, 594);
    public final C1131890fYp LJIIIZ = new C476750Imn<InterfaceC2262081DgM>() { // from class: X.0fYp
        @Override // X.C476750Imn, X.InterfaceC626120Oh8
        public final void onNext(Object obj) {
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().Ri2(EnumC1805420x5A.USER_NOT_LOGIN);
        }
    };

    public static void LIZIZ(int i) {
        HashMap map = new HashMap();
        if (i != 0) {
            if (i != 1) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_age_popup_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJIILL("show");
                c474500IjALIZ.LJIIJJI("live");
                c474500IjALIZ.LJIILJJIL("gift_dialog");
                c474500IjALIZ.LIZ();
                return;
            }
            map.put("click_icon", "cancel");
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gift_age_popup_click");
            c474500IjALIZ2.LJJIIZI(map);
            c474500IjALIZ2.LJIL();
            c474500IjALIZ2.LJIILL("click");
            c474500IjALIZ2.LJIIJJI("live");
            c474500IjALIZ2.LJIILJJIL("gift_dialog");
            c474500IjALIZ2.LIZ();
            return;
        }
        map.put("click_icon", "continue");
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_gift_age_popup_click");
        c474500IjALIZ3.LJJIIZI(map);
        c474500IjALIZ3.LJIL();
        c474500IjALIZ3.LJIILL("click");
        c474500IjALIZ3.LJIIJJI("live");
        c474500IjALIZ3.LJIILJJIL("gift_dialog");
        c474500IjALIZ3.LIZ();
    }

    public final void LIZLLL(final C1127330fRT c1127330fRT) {
        if (this.LIZ == null) {
            return;
        }
        long id = UserService.getInstance().user().getCurrentUser().getId();
        final long[] jArr = {id};
        final C0UTE c0ute = new C0UTE();
        boolean zLIZ = C0UTE.LIZ(this.LIZ, "saved_uid_recharge", id);
        if (LiveLowAgeCountrySetting.INSTANCE.getValue() && !UserWithAgeSetting.INSTANCE.getValue() && !zLIZ) {
            C19GN c19gn = this.LJII;
            if (c19gn != null && c19gn.isShowing()) {
                return;
            }
            C19GO c19go = new C19GO(this.LIZ);
            c19go.LIZLLL = C497740JfY.LJIJJ(2131842660, Integer.valueOf(LiveRechargeAgeThresholdSetting.INSTANCE.getValue()));
            c19go.LJII = C497740JfY.LJIJI(2131842657);
            c19go.LJFF(new DialogInterface.OnClickListener() { // from class: X.0fcL
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    C0UTE c0ute2 = c0ute;
                    Context context = this.LIZ;
                    long j = jArr[0];
                    c0ute2.getClass();
                    C0UTE.LIZIZ(context, "saved_uid_recharge", j);
                    this.getClass();
                    C1134030fcH.LIZIZ(0);
                    this.LJ(c1127330fRT);
                }
            }, C497740JfY.LJIJI(2131842658), false);
            c19go.LIZLLL(new DialogInterfaceOnClickListenerC1151650g4h(this, 2), C497740JfY.LJIJI(2131842656), false);
            c19go.LJIIZILJ = new DialogInterfaceOnDismissListenerC1151680g4k(this, 5);
            c19go.LJJIIJ = false;
            C19GN c19gnLIZ = c19go.LIZ();
            this.LJII = c19gnLIZ;
            C786410Ut5.M4(c19gnLIZ);
            LIZIZ(-1);
            return;
        }
        LJ(c1127330fRT);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1127330fRT r9) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134030fcH.LJ(X.0fRT):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(final X.C1127330fRT r11) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1134030fcH.LJI(X.0fRT):void");
    }

    public final void LJII(final boolean z) {
        if (this.LIZ != null) {
            LiveDialog liveDialog = this.LJI;
            if (liveDialog != null && liveDialog.isShowing()) {
                return;
            }
            String strLJIJI = C497740JfY.LJIJI(2131842178);
            C782110Um9 c782110Um9 = new C782110Um9(this.LIZ);
            c782110Um9.LJIILLIIL = true;
            c782110Um9.LJIIIZ(strLJIJI);
            c782110Um9.LJIIZILJ(2131842180);
            c782110Um9.LJIILIIL(2131842181, new InterfaceC743640TFa() { // from class: X.0eVZ
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog2) {
                    String str;
                    liveDialog2.dismiss();
                    if (z) {
                        str = LiveUserRiskVerifySetting.INSTANCE.getConfig().emailVerifyUrl;
                    } else {
                        str = LiveUserRiskVerifySetting.INSTANCE.getConfig().phoneVerifyUrl;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            C495520Jby c495520Jby = new C495520Jby(str);
                            c495520Jby.LIZJ("enter_from", "gift_send");
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LIZ, UriProtector.parse(c495520Jby.LIZLLL()));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJII(e);
                        }
                    }
                    C1103870epd.LIZ("verify", "live_gift");
                }
            });
            c782110Um9.LJIIJ(2131842177, new InterfaceC743640TFa() { // from class: X.0eVb
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog2) {
                    liveDialog2.dismiss();
                    C1103870epd.LIZ("cancle", "live_gift");
                }
            });
            c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC1151680g4k(this, 7);
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            this.LJI = liveDialogLIZ;
            C786410Ut5.E4(liveDialogLIZ);
            HashMap map = new HashMap();
            map.put("show_page", "live_gift");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_safety_reminder_popup_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZ(GiftMessage giftMessage, EnumC1133020fae enumC1133020fae) {
        if (enumC1133020fae == EnumC1133020fae.INTERACTIVE_GAME_GIFT) {
            C20441214yg.LJIIIZ("gift_sticker", "skip handle GAME_GIFT here, should handle on TrayQueue dequeue");
            return;
        }
        InterfaceC1133090fal interfaceC1133090falLIZIZ = C1133210fax.LIZIZ(giftMessage, enumC1133020fae);
        if (interfaceC1133090falLIZIZ == null) {
            C20441214yg.LJIIIZ("gift_sticker", "no need to render");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check message if user is anchor passed toID: ");
        sbLIZ.append(C1133680fbi.LIZIZ(giftMessage));
        sbLIZ.append(" currentID : ");
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        C20441214yg.LJIIIZ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        C1136460fgC.LIZ.getClass();
        interfaceC1133090falLIZIZ.LIZJ(giftMessage, new C1136470fgD(C1136460fgC.LIZJ(giftMessage)), null);
    }

    public final void LIZJ(int i, final String str) {
        final Context context = this.LIZ;
        if (context == null) {
            return;
        }
        LiveDialog liveDialog = this.LJFF;
        if (liveDialog != null && liveDialog.isShowing()) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131843834);
        c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0fcK
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog2) {
                liveDialog2.dismiss();
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2ffe_tiktok_common%2ffaq%2ffeedback%2f%3Fhide_nav_bar%3D1%26feedback_id%3D15889&hide_nav_bar=1");
                C1134050fcJ.LIZ(str, "contact_us");
                C1103870epd.LIZIZ("contact_us", "gifting", null);
            }
        };
        C0TZ2 c0tz2 = new C0TZ2(c755620TkW);
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131843833);
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0fcM
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog2) {
                liveDialog2.dismiss();
                C1134050fcJ.LIZ(str, "dismiss");
                C1103870epd.LIZIZ("dismiss", "gifting", null);
            }
        };
        C0TZ3 c0tz3 = new C0TZ3(c755630TkX);
        C494720Jag c494720Jag = new C494720Jag();
        c494720Jag.LIZ(c0tz2);
        c494720Jag.LIZ(c0tz3);
        c494720Jag.LIZIZ = 1;
        C494730Jah c494730Jah = new C494730Jah(c494720Jag);
        c782110Um9.LJIIZILJ(2131843835);
        String str2 = "frequency";
        if (Intrinsics.LJFF(str, "reject")) {
            c782110Um9.LJII(2131843836);
        } else if (Intrinsics.LJFF(str, "frequency")) {
            c782110Um9.LJII(2131843837);
        }
        c782110Um9.LIZJ(c494730Jah);
        c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC1151680g4k(this, 8);
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        C786410Ut5.E4(liveDialogLIZ);
        this.LJFF = liveDialogLIZ;
        HashMap map = new HashMap();
        map.put("type", "gifting");
        if (Intrinsics.LJFF(str, "reject")) {
            str2 = "dark_pattern_group";
        }
        map.put("risk_control_scenario", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hit_risk_control_popup_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        C1103870epd.LIZJ(i, "gifting", null);
    }

    public final void LJFF(final String str, final boolean z) {
        final String str2;
        String strLJJIFFI;
        int i;
        String strLJIJI;
        int i2;
        String str3;
        if (this.LIZ != null) {
            LiveDialog liveDialog = this.LJ;
            if (liveDialog != null && liveDialog.isShowing()) {
                return;
            }
            if (z) {
                str2 = "wallet_appeal";
            } else {
                str2 = "gift_appeal";
            }
            if (z) {
                strLJJIFFI = u.LJJIFFI(C497740JfY.LJIJI(2131840920), "{0}", LowAgeAnchorLimitSetting.INSTANCE.getValue(), false);
            } else {
                strLJJIFFI = u.LJJIFFI(C497740JfY.LJIJI(2131840913), "{0}", LowAgeAnchorLimitSetting.INSTANCE.getValue(), false);
            }
            C782110Um9 c782110Um9 = new C782110Um9(this.LIZ);
            if (z) {
                i = 2131840921;
            } else {
                i = 2131840914;
            }
            c782110Um9.LJIIZILJ(i);
            c782110Um9.LJIILLIIL = true;
            c782110Um9.LJIIIZ(strLJJIFFI);
            c782110Um9.LJIJI = new DialogInterface.OnCancelListener() { // from class: X.0ToK
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C1134110fcP.LIZ(str, "dismiss", z);
                }
            };
            if (z) {
                strLJIJI = C497740JfY.LJIJI(2131840918);
            } else {
                strLJIJI = C497740JfY.LJIJI(2131840911);
            }
            c782110Um9.LJIILJJIL(strLJIJI, new InterfaceC743640TFa() { // from class: X.0ToI
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog2) {
                    liveDialog2.dismiss();
                    String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
                    if (TextUtils.isEmpty(value)) {
                        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isInMusicallyRegion()) {
                            value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                        } else {
                            value = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                        }
                    }
                    C1134030fcH c1134030fcH = this.LIZ;
                    String str4 = str2;
                    c1134030fcH.getClass();
                    if (!TextUtils.isEmpty(value)) {
                        try {
                            Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                            builderBuildUpon.appendQueryParameter("enter_from", str4);
                            value = builderBuildUpon.build().toString();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C20441214yg.LJ("GiftNewPresenter", e.toString());
                        }
                    }
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.LIZ.LIZ, value);
                    C1134110fcP.LIZ(str, "primary_cta", z);
                    if (UserService.getInstance().user() != null) {
                        HashMap map = new HashMap();
                        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_click_contact_us");
                        c474500IjALIZ.LJIJJLI(this.LIZ.LIZIZ);
                        c474500IjALIZ.LJJIIZI(map);
                        c474500IjALIZ.LIZ();
                    }
                }
            });
            if (z) {
                i2 = 2131840919;
            } else {
                i2 = 2131840912;
            }
            c782110Um9.LJIIJ(i2, new InterfaceC743640TFa() { // from class: X.0ToJ
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog2) {
                    C1134110fcP.LIZ(str, "dismiss", z);
                    liveDialog2.dismiss();
                }
            });
            c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC1151680g4k(this, 6);
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            this.LJ = liveDialogLIZ;
            C786410Ut5.E4(liveDialogLIZ);
            if (z) {
                str3 = "recharge";
            } else {
                str3 = "send_gift";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_limit_popup_show");
            c474500IjALIZ.LJJII(4005189, "error_code");
            c474500IjALIZ.LJJII(str3, "entry_type");
            if (z) {
                c474500IjALIZ.LJJII("room_recharge", "hit_entry");
            } else {
                c474500IjALIZ.LJJII(C1123580fLQ.LIZ(str), "gift_enter_from");
            }
            c474500IjALIZ.LIZ();
        }
    }
}
