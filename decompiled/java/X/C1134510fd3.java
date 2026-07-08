package X;

import android.content.Context;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveStrategyDailyUgTaskEnterFromSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0fd3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134510fd3 implements InterfaceC1134930fdj {
    public static final C1134510fd3 LIZIZ = new C1134510fd3();
    public final /* synthetic */ C1150090g2B LIZ = C1150090g2B.LIZ;

    public final C1270404y6 LIZJ() {
        return C1150090g2B.LIZJ();
    }

    public final void LJI(Context context, AwS383S0200000_17 awS383S0200000_17) {
        this.LIZ.LJ(context, awS383S0200000_17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1134410fct LIZIZ() {
        Object next;
        List<S> list;
        TaskManagerV2.LIZ.getClass();
        Iterator it2 = ((ArrayList) TaskManagerV2.LJIIIIZZ()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((TaskInfo) ((AbstractC1134420fcu) next).LIZ).taskType == 1) {
                break;
            }
        }
        AbstractC1134420fcu abstractC1134420fcu = (AbstractC1134420fcu) next;
        if (abstractC1134420fcu != null && (list = abstractC1134420fcu.LJ) != 0) {
            ArrayList<C1134410fct> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((C1134410fct) obj).LJIIJJI()) {
                    arrayList.add(obj);
                }
            }
            for (C1134410fct c1134410fct : arrayList) {
                if (c1134410fct.LIZJ() != EnumC1134460fcy.TASK_UNKNOWN && c1134410fct.LIZJ() != EnumC1134460fcy.TASK_EXIT) {
                    return c1134410fct;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map<String, Long> LJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C1134760fdS.LJ());
        C1134410fct c1134410fctLIZIZ = LIZIZ();
        if (c1134410fctLIZIZ != null) {
            linkedHashMap.put(((TaskInfo) c1134410fctLIZIZ.LIZ).taskId, Long.valueOf(c1134410fctLIZIZ.LIZJ().beforeStatus(EnumC1134460fcy.TASK_COMPLETED) ? ((TaskInfo) c1134410fctLIZIZ.LIZ).taskCompletedNum : ((TaskInfo) c1134410fctLIZIZ.LIZ).taskCompleteTargetNum));
        }
        return linkedHashMap;
    }

    public static final long LJFF(Long l) {
        if (l != null) {
            return C237500vt.LJ(l.longValue());
        }
        C1134550fd7 c1134550fd7 = C1134550fd7.LIZ;
        return C1134550fd7.LJ();
    }

    public final int LIZLLL(long j, C1134410fct c1134410fct, DataChannel dataChannel) {
        if (!LIZ(j, c1134410fct, dataChannel, "")) {
            return 0;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1134930fdj
    public final boolean LIZ(long j, C1134410fct c1134410fct, DataChannel dataChannel, String str) {
        long coins;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        Gift fansClubGift;
        BalanceStructExtra balanceStructExtra3;
        BalanceStructExtra balanceStructExtra4;
        GiftService giftService = GiftService.LLILLJJLI;
        Gift giftFindGiftById = giftService.findGiftById(j);
        if (giftFindGiftById == null || !c1134410fct.LJIIJJI() || giftFindGiftById.diamondCount > 1) {
            return false;
        }
        C1132300fZU c1132300fZULJIIIZ = c1134410fct.LJIIIZ();
        if (!c1132300fZULJIIIZ.LJ) {
            return false;
        }
        int i = ((TaskInfo) c1134410fct.LIZ).taskType;
        if (i != 4) {
            if (i != 13) {
                if (i != 14) {
                    if (C1144230fsj.LIZLLL().No0() + c1132300fZULJIIIZ.LIZLLL <= giftFindGiftById.diamondCount) {
                        return false;
                    }
                } else {
                    if (C1144230fsj.LIZLLL().No0() + c1132300fZULJIIIZ.LIZLLL <= giftFindGiftById.diamondCount) {
                        return false;
                    }
                    BalanceStruct balanceStructG52 = C1144230fsj.LIZLLL().g52();
                    if (balanceStructG52 != null && (balanceStructExtra4 = balanceStructG52.exchangeInfo) != null && balanceStructExtra4.getCoins() >= 1) {
                        return false;
                    }
                    WalletStruct walletStructTF1 = C1144230fsj.LIZLLL().TF1();
                    if ((walletStructTF1 != null && (balanceStructExtra3 = walletStructTF1.LIZ) != null && balanceStructExtra3.getCoins() >= 1) || (fansClubGift = giftService.getFansClubGift()) == null || fansClubGift.id != j || giftService.isFansCLubGiftLimited(dataChannel)) {
                        return false;
                    }
                    if ((c1134410fct.LIZJ() != EnumC1134460fcy.TASK_IN_PROGRESS && (c1134410fct.LIZJ() != EnumC1134460fcy.TASK_ENTER || !C1131530fYF.LJ(str))) || c1134410fct.LIZJ() == EnumC1134460fcy.TASK_UNKNOWN) {
                        return false;
                    }
                }
            } else {
                if (giftFindGiftById.diamondCount != 1 || C1144230fsj.LIZLLL().No0() > 0) {
                    return false;
                }
                WalletStruct walletStructTF12 = C1144230fsj.LIZLLL().TF1();
                if ((walletStructTF12 != null && (balanceStructExtra2 = walletStructTF12.LIZ) != null && balanceStructExtra2.getCoins() >= 1) || !c1134410fct.LIZJ().beforeOrEqualsStatus(EnumC1134460fcy.TASK_IN_PROGRESS) || c1134410fct.LIZJ() == EnumC1134460fcy.TASK_UNKNOWN) {
                    return false;
                }
            }
        } else {
            if (!C1134900fdg.LIZIZ(c1134410fct)) {
                return false;
            }
            long j2 = giftFindGiftById.diamondCount;
            BalanceStruct balanceStructG522 = C1144230fsj.LIZLLL().g52();
            if (balanceStructG522 != null && (balanceStructExtra = balanceStructG522.exchangeInfo) != null) {
                coins = balanceStructExtra.getCoins();
            } else {
                coins = 0;
            }
            if (j2 <= coins) {
                return false;
            }
            if (((TaskInfo) c1134410fct.LIZ).taskTotalCompletedNum <= 0 && !C13LQ.LJIILLIIL(str, LiveStrategyDailyUgTaskEnterFromSetting.INSTANCE.getValue())) {
                return false;
            }
        }
        return true;
    }
}
