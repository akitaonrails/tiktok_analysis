package X;

import Y.ARunnableS28S0101000_17;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.BackpackAllowSendFromNormalPanelSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGiftingOptimizationSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.0fXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131340fXw {
    public static final C01GW LIZ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(256));

    public static boolean LIZLLL() {
        List list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class);
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            BagItem bagItem = (BagItem) next;
            if (bagItem.available && bagItem.itemType == 10) {
                return next != null;
            }
        }
        return false;
    }

    public static boolean LIZ(C20337914i1 c20337914i1) {
        if (Intrinsics.LJFF(c20337914i1.LIZIZ(), Boolean.FALSE)) {
            c20337914i1.LJFF(Boolean.TRUE);
            return true;
        }
        return false;
    }

    public static BagItem LIZIZ(InterfaceC1131100fXY interfaceC1131100fXY) {
        boolean z;
        List list;
        Object next;
        Gift giftFindGiftById;
        long coins;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        if (!BackpackAllowSendFromNormalPanelSetting.INSTANCE.isEnable() && (interfaceC1131100fXY.LJJJJZ().LIZ == EnumC1129230fUX.GIFT_PANEL_PORTRAIT || interfaceC1131100fXY.LJJJJZ().LIZ == EnumC1129230fUX.GIFT_PANEL_LANDSCAPE || interfaceC1131100fXY.LJJJJZ().LIZ == EnumC1129230fUX.GIFT_PANEL_GROUP_GIFT)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        if ((!LiveWalletGiftingOptimizationSetting.INSTANCE.getValue() || ((IWalletCenter) LIZ.getValue()).iz2().LIZ == EnumC1151140g3s.SUCCESS) && (list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class)) != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    BagItem bagItem = (BagItem) next;
                    if (bagItem.itemType == 100 && bagItem.itemId == interfaceC1131100fXY.getGiftId() && bagItem.available) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            BagItem bagItem2 = (BagItem) next;
            if (bagItem2 != null && bagItem2.count >= interfaceC1131100fXY.getCount() && (giftFindGiftById = GiftManager.inst().findGiftById(bagItem2.itemId)) != null) {
                int i = giftFindGiftById.diamondCount;
                C01GW c01gw = LIZ;
                if (((IWalletCenter) c01gw.getValue()).No0() < interfaceC1131100fXY.getCount() * i) {
                    BalanceStruct balanceStructG52 = ((IWalletCenter) c01gw.getValue()).g52();
                    long coins2 = 0;
                    if (balanceStructG52 != null && (balanceStructExtra2 = balanceStructG52.exchangeInfo) != null) {
                        coins = balanceStructExtra2.getCoins();
                    } else {
                        coins = 0;
                    }
                    if (coins < interfaceC1131100fXY.getCount() * i) {
                        WalletStruct walletStructTF1 = ((IWalletCenter) c01gw.getValue()).TF1();
                        if (walletStructTF1 != null && (balanceStructExtra = walletStructTF1.LIZ) != null) {
                            coins2 = balanceStructExtra.getCoins();
                        }
                        if (coins2 < i * interfaceC1131100fXY.getCount()) {
                            return bagItem2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void LIZJ(C1132340fZY c1132340fZY, int i) {
        Activity activityLIZ;
        Context context = c1132340fZY.LIZ.getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C473410IhP.LIZIZ(new ARunnableS28S0101000_17(i, activityLIZ, 12));
        }
    }
}
