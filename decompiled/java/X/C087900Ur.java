package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.model.Gift;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00Ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C087900Ur {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(GiftListResult giftListResult) {
        Map<Long, MusicGiftMood> mapLJ;
        IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
        if (iMusicGiftService != null) {
            iMusicGiftService.UU0();
        }
        if (giftListResult == null) {
            return;
        }
        List list = giftListResult.giftPages;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        GiftsInfo giftsInfo = giftListResult.giftsInfo;
        if (giftsInfo == null || (mapLJ = giftsInfo.musicGiftMoods) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        LIZLLL(list, mapLJ);
    }

    public static final void LIZ(LinkedHashMap<Long, Gift> linkedHashMap, Gift gift) {
        Gift.MusicGiftInfo musicGiftInfo;
        long j = gift.id;
        if (j > 0 && (musicGiftInfo = gift.musicInfo) != null && musicGiftInfo.resource != null) {
            linkedHashMap.put(Long.valueOf(j), gift);
        }
    }

    public static void LIZJ(GiftPage giftPage, Map map) {
        IMusicGiftService iMusicGiftService;
        IMusicGiftService iMusicGiftService2 = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
        if (iMusicGiftService2 != null) {
            iMusicGiftService2.UU0();
        }
        if (giftPage == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = giftPage.favouriteGifts;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LIZ(linkedHashMap, (Gift) it2.next());
        }
        List list2 = giftPage.gifts;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            LIZ(linkedHashMap, (Gift) it3.next());
        }
        List list3 = giftPage.backfillGifts;
        if (list3 == null) {
            list3 = C13BV.INSTANCE;
        }
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            LIZ(linkedHashMap, (Gift) it4.next());
        }
        List list4 = giftPage.frequentlyUsedGifts;
        if (list4 == null) {
            list4 = C13BV.INSTANCE;
        }
        Iterator it5 = list4.iterator();
        while (it5.hasNext()) {
            LIZ(linkedHashMap, (Gift) it5.next());
        }
        List<? extends Gift> listLLIIII = C13LP.LLIIII(linkedHashMap.values());
        if ((!listLLIIII.isEmpty() || !map.isEmpty()) && (iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class)) != null) {
            iMusicGiftService.f91(listLLIIII, map);
        }
    }

    public static void LIZLLL(List list, Map map) {
        Object next;
        IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
        if (iMusicGiftService != null) {
            iMusicGiftService.UU0();
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((GiftPage) next).pageType == 18) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LIZJ((GiftPage) next, map);
    }
}
