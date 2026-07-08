package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftGalleryMetrics;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125160fNy {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL(AbstractC1126600fQI abstractC1126600fQI) {
        long id;
        Long lValueOf;
        IInteractService iInteractService = C1128450fTH.LIZ;
        User userLIZJ = C1125800fP0.LIZJ();
        if (userLIZJ != null) {
            id = userLIZJ.getId();
        } else {
            id = 0;
        }
        if (C1128450fTH.LJJII(id) || C1125800fP0.LJFF()) {
            return false;
        }
        CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
        if (abstractC1126600fQI == null || (lValueOf = Long.valueOf(abstractC1126600fQI.LJI())) == null) {
            return false;
        }
        Collection<C1125860fP6> collectionValues = C1125820fP2.LJFF().LIZLLL.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (((C1125860fP6) it2.next()).LJFF(lValueOf)) {
                return true;
            }
        }
        return false;
    }

    public static AbstractC1126600fQI LIZ(String str, LinkedList linkedList) {
        String strLJIILIIL;
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) it2.next();
                if (abstractC1126600fQI != null) {
                    strLJIILIIL = abstractC1126600fQI.LJIILIIL();
                } else {
                    strLJIILIIL = null;
                }
                if (Intrinsics.LJFF(strLJIILIIL, str)) {
                    return abstractC1126600fQI;
                }
            }
        }
        return null;
    }

    public static boolean LIZJ(AbstractC1126600fQI abstractC1126600fQI, GiftPanelBanner giftPanelBanner) {
        Integer numValueOf;
        C1126040fPO c1126040fPO;
        Gift gift;
        GiftPanelBanner giftPanelBanner2;
        Integer numValueOf2 = null;
        if (giftPanelBanner != null) {
            numValueOf = Integer.valueOf(giftPanelBanner.bannerPriority);
        } else {
            numValueOf = null;
        }
        if ((abstractC1126600fQI instanceof C1126040fPO) && (c1126040fPO = (C1126040fPO) abstractC1126600fQI) != null && (gift = c1126040fPO.LJJI) != null && (giftPanelBanner2 = gift.giftPanelBanner) != null) {
            numValueOf2 = Integer.valueOf(giftPanelBanner2.bannerPriority);
        }
        if (numValueOf == null) {
            return false;
        }
        if (numValueOf2 != null && numValueOf.intValue() >= numValueOf2.intValue()) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Context context, GiftLeafRootViewModel giftLeafRootViewModel, Gift gift, String str, String str2) {
        Room room;
        Long lValueOf;
        Long lValueOf2;
        String secUid;
        Long lValueOf3;
        String str3;
        Long lValueOf4;
        DataChannel dataChannel;
        long id;
        DataChannel dataChannel2;
        if (C1123380fL6.LIZIZ()) {
            C1123380fL6.LIZJ(304, false);
        }
        Long lValueOf5 = null;
        if (giftLeafRootViewModel != null && (dataChannel2 = giftLeafRootViewModel.LL) != null) {
            room = (Room) dataChannel2.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        User userLIZJ = C1125800fP0.LIZJ();
        if (userLIZJ != null) {
            lValueOf2 = Long.valueOf(userLIZJ.getId());
        } else {
            lValueOf2 = null;
        }
        String strLIZLLL = C0KVU.LIZLLL(userLIZJ);
        if (userLIZJ != null) {
            secUid = userLIZJ.getSecUid();
        } else {
            secUid = null;
        }
        if (gift != null) {
            lValueOf3 = Long.valueOf(gift.id);
        } else {
            lValueOf3 = null;
        }
        C1127920fSQ galleryEntranceInfo = GiftManager.inst().getGalleryEntranceInfo();
        if (galleryEntranceInfo != null) {
            str3 = galleryEntranceInfo.LIZJ;
        } else {
            str3 = null;
        }
        C495520Jby c495520Jby = new C495520Jby(str3);
        c495520Jby.LIZJ("entrance", str2);
        if (lValueOf3 != null) {
            c495520Jby.LIZIZ(lValueOf3.longValue(), "gift_id");
        }
        if (lValueOf2 != null) {
            c495520Jby.LIZIZ(lValueOf2.longValue(), "gift_to_user_id");
        }
        if (lValueOf != null) {
            c495520Jby.LIZIZ(lValueOf.longValue(), "gift_to_room_id");
        }
        if (secUid != null) {
            c495520Jby.LIZJ("gift_to_sec_user_id", secUid);
        }
        if (strLIZLLL != null) {
            c495520Jby.LIZJ("gift_to_user_nick_name", strLIZLLL);
        }
        C1125150fNx.LIZ(c495520Jby, lValueOf2);
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        if (gift != null) {
            lValueOf4 = Long.valueOf(gift.id);
        } else {
            lValueOf4 = null;
        }
        if (giftLeafRootViewModel != null) {
            dataChannel = giftLeafRootViewModel.LL;
        } else {
            dataChannel = null;
        }
        Gift.GiftSponsorInfo giftSponsorInfoLIZJ = C1127480fRi.LIZJ(lValueOf4, null);
        JSONObject jSONObject = new JSONObject();
        C1123380fL6.LIZ(jSONObject);
        GiftGalleryMetrics giftGalleryMetricsLIZJ = C1125140fNw.LIZJ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_gift_gallery_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIJJLI(dataChannel);
        User userLIZJ2 = C1125800fP0.LIZJ();
        if (userLIZJ2 != null) {
            id = userLIZJ2.getId();
        } else {
            id = 0;
        }
        C1125140fNw.LIZ(c474500IjALIZ, id);
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJII(lValueOf4, "gift_id");
        if (giftSponsorInfoLIZJ != null) {
            lValueOf5 = Long.valueOf(giftSponsorInfoLIZJ.leftCountToSponsor);
        }
        c474500IjALIZ.LJJII(lValueOf5, "gifts_to_sponsor");
        c474500IjALIZ.LJJII(str, "banner_type");
        c474500IjALIZ.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ.isFirstTimeUser), "is_first_time_user");
        c474500IjALIZ.LJJII(Integer.valueOf(giftGalleryMetricsLIZJ.isNewToGallery), "is_new_to_gallery");
        c474500IjALIZ.LIZ();
    }
}
