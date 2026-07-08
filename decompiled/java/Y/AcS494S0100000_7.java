package Y;

import X.C0IJ3;
import X.C0IJ4;
import X.C0IJT;
import X.C0JFO;
import X.C0KTF;
import X.C0UO0;
import X.C0UQX;
import X.C1086800eO6;
import X.C1161920gLG;
import X.C11NJ;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C1701940uOG;
import X.C1812120xFy;
import X.C2382909Vj;
import X.C474500IjA;
import X.C480460Ism;
import X.C485350J1p;
import X.C489040JFu;
import X.C499910Jj3;
import X.C770730ULf;
import X.C771970UPz;
import X.C931330aLL;
import X.InterfaceC500940Jki;
import X.InterfaceC743640TFa;
import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.gamelink.model.GuestDisconnectByWindowEvent;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.livesdk.broadcast.trymode.TryModeBroadcastFragment;
import com.bytedance.android.livesdk.chatroom.widget.followguide.LiveShareUserFollowGuideSheetFragment;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.level.SuperFanPurchaseConfig;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdk.userservice.BlockApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widget.LiveDetectInfoView;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS581S0100000_2;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: loaded from: classes8.dex */
public class AcS494S0100000_7 implements InterfaceC743640TFa {
    public final int $t;
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
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
            case 7:
                LIZ$7(this, liveDialog);
                break;
            case 8:
                LIZ$8(this, liveDialog);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, liveDialog);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, liveDialog);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, liveDialog);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, liveDialog);
                break;
            case 14:
                LIZ$14(this, liveDialog);
                break;
            case 15:
                LIZ$15(this, liveDialog);
                break;
        }
    }

    public AcS494S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((LiveDetectInfoView) acS494S0100000_7.l0).getClass();
        int i = C0IJ3.LIZLLL;
        if (i != -1 && i != 1) {
            C0IJ3.LIZLLL = 1;
        } else {
            C0IJ3.LIZLLL = 0;
        }
        ((LiveDetectInfoView) acS494S0100000_7.l0).y1(true);
        ((LiveDetectInfoView) acS494S0100000_7.l0).getClass();
        int i2 = C0IJ3.LIZLLL;
        if (i2 == 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_start_detection");
            c474500IjALIZ.LJJII(Long.valueOf(C0IJ3.LIZIZ), "detection_user_id");
            c474500IjALIZ.LJJII(Long.valueOf(C0IJ4.LIZIZ()), "user_id");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else if (i2 == 1) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_end_detection");
            c474500IjALIZ2.LJJII(Long.valueOf(C0IJ3.LIZIZ), "detection_user_id");
            c474500IjALIZ2.LJJII(Long.valueOf(C0IJ4.LIZIZ()), "user_id");
            c474500IjALIZ2.LJIL();
            c474500IjALIZ2.LIZ();
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) acS494S0100000_7.l0, SuperFanPurchaseConfig.INSTANCE.getConfig().feedbackUrl);
        liveDialog.dismiss();
    }

    public static final void LIZ$10(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((C0KTF) acS494S0100000_7.l0).LJ.invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$11(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        C2382909Vj.LIZ((CompletionBlock) acS494S0100000_7.l0, -100, "cancel", null, 4);
        liveDialog.dismiss();
    }

    public static final void LIZ$12(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((DrawGuessToolbarWidget) acS494S0100000_7.l0).B1();
        liveDialog.dismiss();
    }

    public static final void LIZ$13(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        C0JFO.LIZJ(((DrawGuessToolbarWidget) acS494S0100000_7.l0).dataChannel, "cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$14(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((Function0) acS494S0100000_7.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$15(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((Function0) acS494S0100000_7.l0).invoke();
        liveDialog.dismiss();
    }

    public static final void LIZ$2(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((TryModeBroadcastFragment) acS494S0100000_7.l0).uS("check");
        EntranceConditionsPopup entranceConditionsPopup = (EntranceConditionsPopup) DataChannelGlobal.LLILZ.gg0(C931330aLL.class);
        if (entranceConditionsPopup != null) {
            TryModeBroadcastFragment tryModeBroadcastFragment = (TryModeBroadcastFragment) acS494S0100000_7.l0;
            if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable()) {
                C499910Jj3.LIZ(tryModeBroadcastFragment.getDataChannel(), entranceConditionsPopup, "prepare_page");
            } else {
                C770730ULf.LJIIIIZZ(tryModeBroadcastFragment.getContext(), tryModeBroadcastFragment.getDataChannel(), entranceConditionsPopup);
            }
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        long id;
        LiveShareUserFollowGuideSheetFragment liveShareUserFollowGuideSheetFragment = (LiveShareUserFollowGuideSheetFragment) acS494S0100000_7.l0;
        if (!liveShareUserFollowGuideSheetFragment.LLJZIJLIL) {
            liveShareUserFollowGuideSheetFragment.LLJZIJLIL = true;
            C11NJ c11nj = liveShareUserFollowGuideSheetFragment.LLJLLL;
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C485350J1p c485350J1p = new C485350J1p();
            User userWS = ((LiveShareUserFollowGuideSheetFragment) acS494S0100000_7.l0).wS();
            if (userWS != null) {
                id = userWS.getId();
            } else {
                id = 0;
            }
            c485350J1p.LIZIZ(id);
            c485350J1p.LIZJ();
            C11O8 c11o8LJJJLZIJ = interfaceC500940JkiUser.LJI(new C1812120xFy(c485350J1p)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
            LiveShareUserFollowGuideSheetFragment liveShareUserFollowGuideSheetFragment2 = (LiveShareUserFollowGuideSheetFragment) acS494S0100000_7.l0;
            c11nj.LIZ(c11o8LJJJLZIJ.LJJLL(new AfS176S0100000_7(liveShareUserFollowGuideSheetFragment2, 196), new AfS176S0100000_7(liveShareUserFollowGuideSheetFragment2, 197)));
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$4(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        DataChannel dataChannel = ((GameLinkV2Widget) acS494S0100000_7.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GuestDisconnectByWindowEvent.class, new Pair("others", 10002));
        }
        liveDialog.dismiss();
    }

    public static final void LIZ$5(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Gi("Probation", null);
        C771970UPz c771970UPz = C771970UPz.LIZ;
        DataChannel dataChannel = (DataChannel) acS494S0100000_7.l0;
        c771970UPz.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_probation_mode_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(C0UQX.LIZJ(dataChannel), "live_entrance_name");
        c474500IjALIZ.LIZ();
        liveDialog.dismiss();
    }

    public static final void LIZ$6(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        ((LiveMicRoomInfoDialog) acS494S0100000_7.l0).LLLIIIL = false;
        liveDialog.dismiss();
        LiveMicRoomInfoDialog liveMicRoomInfoDialog = (LiveMicRoomInfoDialog) acS494S0100000_7.l0;
        User user = liveMicRoomInfoDialog.LLLIIL;
        if (user != null) {
            liveMicRoomInfoDialog.cS(user);
        }
        ((LiveMicRoomInfoDialog) acS494S0100000_7.l0).LLLIIIL = true;
    }

    public static final void LIZ$7(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        C480460Ism.LIZ().getClass();
        C11NZ<R> c11nzLJIILIIL = ((BlockApi) C480460Ism.LIZLLL(BlockApi.class)).unblock(4, ((C489040JFu) acS494S0100000_7.l0).LIZIZ.getId(), ((C489040JFu) acS494S0100000_7.l0).LIZIZ.getSecUid()).LJIILIIL(new C0UO0());
        C489040JFu c489040JFu = (C489040JFu) acS494S0100000_7.l0;
        c11nzLJIILIIL.LJJLL(new AfS176S0100000_7(c489040JFu, 282), new AfS176S0100000_7(c489040JFu, 283));
        liveDialog.dismiss();
        ((C489040JFu) acS494S0100000_7.l0).LIZIZ().LJI(((C489040JFu) acS494S0100000_7.l0).LIZIZ, "unblock");
    }

    public static final void LIZ$8(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C489040JFu) acS494S0100000_7.l0).LIZIZ().LJI(((C489040JFu) acS494S0100000_7.l0).LIZIZ, "cancel");
    }

    public static final void LIZ$9(AcS494S0100000_7 acS494S0100000_7, LiveDialog liveDialog) {
        C1086800eO6.LIZ.LIZ(1, new AwS581S0100000_2((Function0) acS494S0100000_7.l0, (Function0<Unit>) 625));
        liveDialog.dismiss();
    }
}
