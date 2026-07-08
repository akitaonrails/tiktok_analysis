package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.00mG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C177800mG {
    public static final /* synthetic */ int LIZ = 0;

    public static GiftPage LIZ(List list) {
        Object next;
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
        return (GiftPage) next;
    }

    public static List LIZIZ(List list) {
        Iterable iterable;
        GiftPage giftPageLIZ = LIZ(list);
        if (giftPageLIZ == null || (iterable = giftPageLIZ.favouriteGifts) == null) {
            iterable = C13BV.INSTANCE;
        }
        List listLLIIII = C13LP.LLIIII(iterable);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((Gift) it2.next()).id));
        }
        return arrayList;
    }

    public static void LIZJ(List list) {
        Map<Long, MusicGiftMood> mapLJ;
        GiftsInfo giftsInfo;
        GiftPage giftPageLIZ = LIZ(list);
        if (giftPageLIZ == null) {
            return;
        }
        IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
        if (iMusicGiftService != null) {
            List<? extends Gift> list2 = giftPageLIZ.favouriteGifts;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            iMusicGiftService.XL2(list2);
        }
        GiftListResult giftListResult = GiftManager.inst().getGiftListResult();
        if (giftListResult == null || (giftsInfo = giftListResult.giftsInfo) == null || (mapLJ = giftsInfo.musicGiftMoods) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C087900Ur.LIZLLL(list, mapLJ);
    }

    public static void LIZLLL(List list) {
        GiftListResult giftListResult;
        List<GiftPage> list2;
        GiftPage giftPageLIZ;
        GiftPage giftPageLIZ2 = LIZ(list);
        if (giftPageLIZ2 == null || (giftListResult = GiftManager.inst().getGiftListResult()) == null || (list2 = giftListResult.giftPages) == null || (giftPageLIZ = LIZ(list2)) == null) {
            return;
        }
        giftPageLIZ.favouriteGifts = giftPageLIZ2.favouriteGifts;
        GiftManager.inst().updateFavoriteGift(new ArrayList(list2));
    }
}
