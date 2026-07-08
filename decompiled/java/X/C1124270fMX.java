package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMusicTabPlacementSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fMX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124270fMX {
    public static List LIZIZ(List list, EnumC1125400fOM enumC1125400fOM) {
        int i;
        Object next;
        int size;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        Boolean boolValueOf = Boolean.valueOf(C1128450fTH.LJJIJIIJIL());
        InterfaceC1133710fbl.LIZ.getClass();
        Pair pair = new Pair(boolValueOf, Long.valueOf(((C1133940fc8) C1120710fGn.LIZ()).LJI()));
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        long jLongValue = ((Number) pair.getSecond()).longValue();
        boolean zLJFF = C1125800fP0.LJFF();
        Iterator it2 = list.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            GiftPage giftPage = (GiftPage) it2.next();
            List list2 = giftPage.gifts;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!LIZ((Gift) obj, enumC1125400fOM, zBooleanValue, jLongValue, zLJFF)) {
                    arrayList.add(obj);
                }
            }
            List list3 = giftPage.frequentlyUsedGifts;
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                if (!LIZ((Gift) obj2, enumC1125400fOM, zBooleanValue, jLongValue, zLJFF)) {
                    arrayList2.add(obj2);
                }
            }
            GiftPage giftPage2 = new GiftPage();
            giftPage2.useBackfillSpecialText = giftPage.useBackfillSpecialText;
            giftPage2.groupsInTab = giftPage.groupsInTab;
            giftPage2.clientCanReorder = giftPage.clientCanReorder;
            giftPage2.backfillGifts = giftPage.backfillGifts;
            giftPage2.pageType = giftPage.pageType;
            giftPage2.pageName = giftPage.pageName;
            giftPage2.gifts = arrayList;
            giftPage2.display = giftPage.display;
            giftPage2.operation = giftPage.operation;
            giftPage2.eventName = giftPage.eventName;
            giftPage2.pagePanelBanner = giftPage.pagePanelBanner;
            giftPage2.frequentlyUsedGifts = arrayList2;
            giftPage2.forceInsertMetrics = giftPage.forceInsertMetrics;
            giftPage2.region = giftPage.region;
            giftPage2.forceInsertPriorityMap = giftPage.forceInsertPriorityMap;
            giftPage2.favouriteGifts = giftPage.favouriteGifts;
            c13dvLIZIZ.add(giftPage2);
        }
        List listLIZ = C1697820uHc.LIZ(c13dvLIZIZ);
        Iterator it3 = listLIZ.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                if (((GiftPage) next).pageType == 18) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        GiftPage giftPage3 = (GiftPage) next;
        if (giftPage3 != null && giftPage3.display) {
            if (!giftPage3.clientCanReorder) {
                C1124260fMW.LJI();
            } else {
                int iIndexOf = ((ArrayList) C1124260fMW.LJII(listLIZ)).indexOf(giftPage3);
                LiveGiftMusicTabPlacementSetting liveGiftMusicTabPlacementSetting = LiveGiftMusicTabPlacementSetting.INSTANCE;
                int iFirstExposureThreshold = liveGiftMusicTabPlacementSetting.firstExposureThreshold();
                int iSecondExposureThreshold = liveGiftMusicTabPlacementSetting.secondExposureThreshold();
                if (C1124260fMW.LIZLLL() >= iFirstExposureThreshold && !C1124260fMW.LJFF().getBoolean(C1124260fMW.LIZ(), false)) {
                    i = (C1124260fMW.LIZLLL() < iSecondExposureThreshold || C1124260fMW.LJFF().getBoolean(C1124260fMW.LIZIZ(), false)) ? 2 : 3;
                }
                if (iIndexOf != i) {
                    ArrayList arrayList3 = new ArrayList(listLIZ);
                    arrayList3.remove(giftPage3);
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, C1124260fMW.LJII(arrayList3));
                    if (objLJJJLZIJ != null) {
                        size = arrayList3.indexOf(objLJJJLZIJ);
                    } else {
                        size = arrayList3.size();
                    }
                    ListProtector.add(arrayList3, size, giftPage3);
                    return arrayList3;
                }
            }
        }
        return listLIZ;
    }

    public static boolean LIZ(Gift gift, EnumC1125400fOM enumC1125400fOM, boolean z, long j, boolean z2) {
        if (gift == null || !gift.isDisplayedOnPanel || j == gift.id) {
            return true;
        }
        int i = gift.giftSubType;
        if ((i == 3 || i == 4) && z) {
            return true;
        }
        if (enumC1125400fOM == EnumC1125400fOM.GUEST && !gift.forLinkMic) {
            return true;
        }
        if (z2 && gift.LIZ()) {
            return true;
        }
        return false;
    }
}
