package Y;

import X.AbstractC1149720g1a;
import X.C1086790eO5;
import X.C1086830eO9;
import X.C1087470ePB;
import X.C1116450f9v;
import X.C1129920fVe;
import X.C1129950fVh;
import X.C1131040fXS;
import X.C1142520fpy;
import X.C1142530fpz;
import X.C1142550fq1;
import X.C1144270fsn;
import X.C1144350fsv;
import X.C1148910g0H;
import X.C1149870g1p;
import X.C1151150g3t;
import X.C1161920gLG;
import X.C13BV;
import X.C15438062q;
import X.C1802410x0J;
import X.C724240Sb0;
import X.C785410UrT;
import X.EnumC1148880g0E;
import X.InterfaceC1149850g1n;
import X.InterfaceC743640TFa;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoritePanelAssem;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.GiftFavoriteViewModel;
import com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.interaction.poll.ui.giftwidget.AbsPollWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.qa.CloseQuestionEvent;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class AcS497S0100000_17 implements InterfaceC743640TFa {
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
            case 16:
                LIZ$16(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, liveDialog);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, liveDialog);
                break;
        }
    }

    public AcS497S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        AbsPollWidget absPollWidget = (AbsPollWidget) acS497S0100000_17.l0;
        DataChannel dataChannel = absPollWidget.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(CloseQuestionEvent.class, new AwS596S0100000_17(absPollWidget, 189));
        }
        ((AbsPollWidget) acS497S0100000_17.l0).C1("confirm");
        liveDialog.dismiss();
    }

    public static final void LIZ$1(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        ((AbsPollWidget) acS497S0100000_17.l0).C1("cancel");
        liveDialog.dismiss();
    }

    public static final void LIZ$10(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        boolean z;
        String strLIZ;
        ((AbstractC1149720g1a) acS497S0100000_17.l0).LIZJ().OQ2();
        if (((AbstractC1149720g1a) acS497S0100000_17.l0).LIZIZ.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && (strLIZ = C1142550fq1.LIZ(1)) != null) {
            C1142550fq1.LIZIZ(strLIZ, "daily_ug_consume_task", "click", ((AbstractC1149720g1a) acS497S0100000_17.l0).LIZIZ.LIZLLL);
        }
        C1144350fsv c1144350fsv = ((AbstractC1149720g1a) acS497S0100000_17.l0).LIZIZ;
        C1149870g1p c1149870g1p = c1144350fsv.LJII;
        if (c1149870g1p != null) {
            String str = c1149870g1p.LIZLLL;
            if (str == null) {
                str = "normal";
            }
            C1142550fq1.LIZIZ(str, "11", "click", c1144350fsv.LIZLLL);
        }
        LiveDialog liveDialog2 = ((AbstractC1149720g1a) acS497S0100000_17.l0).LIZJ;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
    }

    public static final void LIZ$11(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        ((AbstractC1149720g1a) acS497S0100000_17.l0).LIZJ().MQ2();
        LiveDialog liveDialog2 = ((AbstractC1149720g1a) acS497S0100000_17.l0).LIZJ;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
    }

    public static final void LIZ$12(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        C1144270fsn c1144270fsn = (C1144270fsn) acS497S0100000_17.l0;
        InterfaceC1149850g1n interfaceC1149850g1n = c1144270fsn.LIZJ;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJ(c1144270fsn.LJ, true);
            interfaceC1149850g1n.LIZIZ(c1144270fsn.LJ, c1144270fsn.LJFF, false, false, 112, null);
            String strLIZ = C1142550fq1.LIZ(2);
            if (strLIZ != null) {
                C1142550fq1.LIZIZ(strLIZ, c1144270fsn.LIZJ(), "click", c1144270fsn.LIZIZ.LIZLLL);
            }
        }
        LiveDialog liveDialog2 = ((C1144270fsn) acS497S0100000_17.l0).LJI;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
    }

    public static final void LIZ$13(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        InterfaceC1149850g1n interfaceC1149850g1n = ((C1144270fsn) acS497S0100000_17.l0).LIZJ;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJFF();
        }
        LiveDialog liveDialog2 = ((C1144270fsn) acS497S0100000_17.l0).LJI;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
    }

    public static final void LIZ$14(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        liveDialog.dismiss();
        C1086790eO5.LIZIZ(((AbsPollWidget) acS497S0100000_17.l0).dataChannel, C1086830eO9.LIZ, 0);
    }

    public static final void LIZ$15(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) acS497S0100000_17.l0;
        liveRoomUserInfoWidget.LLLLZLLLI = false;
        liveDialog.dismiss();
        liveRoomUserInfoWidget.V2();
        liveRoomUserInfoWidget.LLLLZLLLI = true;
    }

    public static final void LIZ$16(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        ((IActionHandlerService) ((C1129920fVe) acS497S0100000_17.l0).LIZJ.getValue()).handle(((C1129920fVe) acS497S0100000_17.l0).LIZ, "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ffe_tiktok_common%2Ffaq%2Ffeedback%2F%3Fhide_nav_bar%3D1%26feedback_id%3D13012%26error_code%3D4005192&hide_nav_bar=1&use_forest=1&trans_status_bar=0");
    }

    public static final void LIZ$17(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        DialogFragment dialogFragment;
        GiftFavoriteViewModel giftFavoriteViewModelGo = ((GiftFavoritePanelAssem) acS497S0100000_17.l0).Go();
        LinkedList linkedListVQ2 = GiftFavoriteViewModel.vQ2(giftFavoriteViewModelGo.getState().LLILLJJLI);
        LinkedList linkedList = new LinkedList();
        for (int size = giftFavoriteViewModelGo.getState().LL.size() - 1; -1 < size; size--) {
            EnumC1148880g0E enumC1148880g0E = ((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LL, size)).LJ;
            if (enumC1148880g0E == EnumC1148880g0E.FAVORITE_ITEM || enumC1148880g0E == EnumC1148880g0E.FAVORITE_DISABLED_ITEM) {
                linkedListVQ2.add(1, C1148910g0H.LIZ((C1148910g0H) ListProtector.get(giftFavoriteViewModelGo.getState().LL, size), EnumC1148880g0E.OTHER_ITEM, false, 1007));
            }
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(linkedListVQ2, 10));
        Iterator it2 = linkedListVQ2.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1148910g0H.LIZ((C1148910g0H) it2.next(), null, false, 895));
        }
        LinkedList linkedList2 = new LinkedList(arrayList);
        GiftFavoriteViewModel.wQ2(linkedList);
        giftFavoriteViewModelGo.setState(new AwS383S0200000_17(linkedList, (LinkedList<C1148910g0H>) linkedList2, (LinkedList<C1148910g0H>) 119));
        GiftFavoriteViewModel giftFavoriteViewModelGo2 = ((GiftFavoritePanelAssem) acS497S0100000_17.l0).Go();
        C1131040fXS.LIZ(giftFavoriteViewModelGo2.yQ2().LLIZLLLIL, giftFavoriteViewModelGo2.yQ2().LL, C13BV.INSTANCE);
        liveDialog.dismiss();
        Fragment fragmentLJI = C724240Sb0.LJI((GiftFavoritePanelAssem) acS497S0100000_17.l0);
        if ((fragmentLJI instanceof LiveDialogFragment) && (dialogFragment = (DialogFragment) fragmentLJI) != null) {
            dialogFragment.dismiss();
        }
    }

    public static final void LIZ$18(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        RoomNotifyMessage roomNotifyMessage;
        liveDialog.dismiss();
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget = (LivePrivilegeAnnouncementWidget) acS497S0100000_17.l0;
        DataChannel dataChannel = livePrivilegeAnnouncementWidget.dataChannel;
        PrivilegeAdvanceMessage privilegeAdvanceMessage = livePrivilegeAnnouncementWidget.LLILLJJLI;
        if (privilegeAdvanceMessage != null) {
            roomNotifyMessage = privilegeAdvanceMessage.notify;
        } else {
            roomNotifyMessage = null;
        }
        C1087470ePB.LIZIZ(dataChannel, roomNotifyMessage, "cancel");
    }

    public static final void LIZ$2(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        C1151150g3t c1151150g3t = C1151150g3t.LIZ;
        C1802410x0J c1802410x0J = (C1802410x0J) acS497S0100000_17.l0;
        c1151150g3t.getClass();
        C1151150g3t.LIZ("cancel", c1802410x0J);
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        long j;
        long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        StarCommentPaymentDialog starCommentPaymentDialog = (StarCommentPaymentDialog) acS497S0100000_17.l0;
        C1116450f9v c1116450f9v = starCommentPaymentDialog.LLILZIL;
        long j2 = 0;
        if (c1116450f9v != null) {
            j = c1116450f9v.LIZ;
        } else {
            j = 0;
        }
        long j3 = j - jNo0;
        if (c1116450f9v != null) {
            j2 = c1116450f9v.LIZ;
        }
        if (starCommentPaymentDialog.aS(j3, j2)) {
            liveDialog.dismiss();
        } else {
            ((StarCommentPaymentDialog) acS497S0100000_17.l0).RR(0, false);
            liveDialog.dismiss();
        }
    }

    public static final void LIZ$4(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        C1142530fpz c1142530fpz = (C1142530fpz) acS497S0100000_17.l0;
        long j = c1142530fpz.LIZJ;
        String str = c1142530fpz.LIZIZ;
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).sendIncentiveGift(new C1129950fVh(false, false, str, j, null, 48), c1142530fpz.LIZ);
        C1142520fpy.LIZ(((C1142530fpz) acS497S0100000_17.l0).LIZIZ, "send");
        LiveDialog liveDialog2 = ((C1142530fpz) acS497S0100000_17.l0).LIZLLL;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
    }

    public static final void LIZ$5(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        C1142520fpy.LIZ(((C1142530fpz) acS497S0100000_17.l0).LIZIZ, "cancel");
        LiveDialog liveDialog2 = ((C1142530fpz) acS497S0100000_17.l0).LIZLLL;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
    }

    public static final void LIZ$6(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Runnable) acS497S0100000_17.l0).run();
    }

    public static final void LIZ$7(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Runnable) acS497S0100000_17.l0).run();
    }

    public static final void LIZ$8(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Runnable) acS497S0100000_17.l0).run();
    }

    public static final void LIZ$9(AcS497S0100000_17 acS497S0100000_17, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((Runnable) acS497S0100000_17.l0).run();
    }
}
