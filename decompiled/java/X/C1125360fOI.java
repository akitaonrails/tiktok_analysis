package X;

import android.content.Context;
import com.bytedance.android.live.gift.ShowRechargeDialogEvent;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.RechargeExchangeCoinsDialogShowing;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125360fOI {
    public static final AtomicLong LIZ = new AtomicLong(1);
    public static String LIZIZ = "";
    public static int LIZJ;

    public static String LIZJ() {
        List listLIZLLL = C1125800fP0.LIZLLL();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZLLL, 10));
        Iterator it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((C1125380fOK) it2.next()).LIZ.getId()));
        }
        return C13LP.LJJLIIIJ(C13LP.LJLLJ(arrayList), "_", null, null, 0, null, null, 62);
    }

    public static boolean LIZIZ(long j, boolean z) {
        LinkedList linkedList;
        int size;
        Gift fansClubJoinGift;
        Gift fansClubJoinGift2;
        GiftPanelBanner giftPanelBanner;
        GiftPanelBanner giftPanelBanner2;
        String str;
        String str2;
        String str3;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById == null || (size = (linkedList = (LinkedList) C1125800fP0.LIZLLL()).size()) == 0) {
            return false;
        }
        if (size != 1) {
            if (z && (((giftPanelBanner = giftFindGiftById.giftPanelBanner) != null && (str3 = giftPanelBanner.bannerLynxUrl) != null && str3.length() > 0) || ((giftPanelBanner2 = giftFindGiftById.giftPanelBanner) != null && (str = giftPanelBanner2.schemaUrl) != null && str.length() > 0))) {
                try {
                    GiftPanelBanner giftPanelBanner3 = giftFindGiftById.giftPanelBanner;
                    if (giftPanelBanner3 != null && (str2 = giftPanelBanner3.bannerLynxExtra) != null) {
                        if (!C2093608Ic.LIZJ(JSONObjectProtectorUtils.getString(new JSONObject(str2), "gift_type"), "text_gift")) {
                        }
                    } else {
                        C189200o6.m2constructorimpl(null);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C766270U4b.LIZLLL(2131843414);
                C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                int size2 = linkedList.size();
                long j2 = giftFindGiftById.id;
                c1128760fTm.getClass();
                C1128760fTm.LJJIIZI(size2, j2, "select_recepient_for_all");
                return true;
            }
            if (!giftFindGiftById.isRandomGift && !giftFindGiftById.LJI() && !giftFindGiftById.LIZJ() && !giftFindGiftById.LJFF() && !giftFindGiftById.LJIIIIZZ() && !giftFindGiftById.LJII() && ((fansClubJoinGift2 = GiftManager.inst().getFansClubJoinGift()) == null || giftFindGiftById.id != fansClubJoinGift2.id)) {
                long j3 = giftFindGiftById.id;
                InterfaceC1133710fbl.LIZ.getClass();
                if (j3 != ((C1133940fc8) C1120710fGn.LIZ()).LJI() && giftFindGiftById.forLinkMic && !giftFindGiftById.LIZ()) {
                    return false;
                }
            }
            C766270U4b.LIZLLL(2131843413);
            C1128760fTm c1128760fTm2 = C1128760fTm.LJIIJ;
            int size3 = linkedList.size();
            long j4 = giftFindGiftById.id;
            c1128760fTm2.getClass();
            C1128760fTm.LJJIIZI(size3, j4, "select_recepient_for_all");
            return true;
        }
        C1125380fOK c1125380fOK = (C1125380fOK) C13LP.LJJJLL(linkedList);
        if (c1125380fOK == null) {
            return false;
        }
        if (C1125370fOJ.LIZ[c1125380fOK.LIZIZ.ordinal()] != 1) {
            return false;
        }
        if (!giftFindGiftById.isRandomGift && ((fansClubJoinGift = GiftManager.inst().getFansClubJoinGift()) == null || giftFindGiftById.id != fansClubJoinGift.id)) {
            long j5 = giftFindGiftById.id;
            InterfaceC1133710fbl.LIZ.getClass();
            if (j5 != ((C1133940fc8) C1120710fGn.LIZ()).LJI() && giftFindGiftById.forLinkMic && !giftFindGiftById.LIZ()) {
                return false;
            }
        }
        C766270U4b.LIZLLL(2131843418);
        C1128760fTm c1128760fTm3 = C1128760fTm.LJIIJ;
        long j6 = giftFindGiftById.id;
        c1128760fTm3.getClass();
        C1128760fTm.LJJIIZI(2, j6, "select_recepient_for_others");
        return true;
    }

    public static void LIZLLL(int i, long j, long j2, DataChannel dataChannel) {
        C766270U4b.LIZLLL(2131841953);
        C1127330fRT c1127330fRT = new C1127330fRT("send_to_all_user", ((long) i) - j, "normal", C1130100fVw.LIZ.LIZJ, null);
        c1127330fRT.LJII = "single_gift";
        c1127330fRT.LJIIIIZZ = j2;
        c1127330fRT.LJIIIZ = i;
        c1127330fRT.LJIIJ = false;
        c1127330fRT.LJFF = true;
        c1127330fRT.LJI = true;
        if (dataChannel != null) {
            dataChannel.LC0(ShowRechargeDialogEvent.class, c1127330fRT);
        }
    }

    public static boolean LIZ(Context context, final DataChannel dataChannel, String str, final int i, final long j, final Function1 function1) {
        String str2;
        String str3 = str;
        final long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        if (jNo0 < i && !GiftManager.inst().canSendGiftFree()) {
            IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            if (str3 == null) {
                str3 = "";
            }
            if (GiftManager.inst().isPollGift(j)) {
                str2 = "quick_poll";
            } else {
                str2 = "gift";
            }
            return ((WalletExchange) iWalletExchangeWalletExchange).LJIJJLI(context, new C1144350fsv(dataChannel, i, j, str3, str2, "single_gift", 192), new InterfaceC1149850g1n() { // from class: X.0fOL
                @Override // X.InterfaceC1149850g1n
                public final void LIZ(int i2) {
                }

                @Override // X.InterfaceC1149850g1n
                public final void LJ(int i2, boolean z) {
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZJ() {
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
                    }
                    DataChannel dataChannel3 = dataChannel;
                    C1125360fOI.LIZLLL(i, jNo0, j, dataChannel3);
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZLLL() {
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
                    }
                    DataChannel dataChannel3 = dataChannel;
                    C1125360fOI.LIZLLL(i, jNo0, j, dataChannel3);
                }

                @Override // X.InterfaceC1149850g1n
                public final void LJFF() {
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.FALSE);
                    }
                    DataChannel dataChannel3 = dataChannel;
                    C1125360fOI.LIZLLL(i, jNo0, j, dataChannel3);
                }

                @Override // X.InterfaceC1149850g1n
                public final void onShow() {
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.zW(RechargeExchangeCoinsDialogShowing.class, Boolean.TRUE);
                    }
                }

                @Override // X.InterfaceC1149850g1n
                public final void LIZIZ(int i2, long j2, boolean z, boolean z2, int i3, Boolean bool) {
                    function1.invoke(new C1132120fZC(jNo0, i2, i3, z, z2));
                }
            });
        }
        return false;
    }
}
