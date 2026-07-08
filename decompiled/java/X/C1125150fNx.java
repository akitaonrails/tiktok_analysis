package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125150fNx {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(Long l) {
        Integer numValueOf;
        long jLIZJ;
        ArrayList arrayList = new ArrayList();
        String strLJIJI = null;
        if (l != null) {
            numValueOf = Integer.valueOf(C1128450fTH.LJJII(l.longValue()) ? 1 : 0);
        } else {
            numValueOf = null;
        }
        boolean zKz = C1128450fTH.LIZ.Kz();
        boolean zLJJIIJ = C1128450fTH.LJJIIJ();
        boolean zLJJIIZ = C1128450fTH.LJJIIZ();
        if (C1128450fTH.LJJIIZ()) {
            jLIZJ = C1128450fTH.LIZJ();
        } else {
            jLIZJ = 0;
        }
        String strLJIJI2 = C1128450fTH.LJIJI(UserService.getInstance().user().LJIJJLI());
        if (l != null) {
            long jLongValue = l.longValue();
            User user = new User();
            user.setId(jLongValue);
            strLJIJI = C1128450fTH.LJIJI(user);
        }
        arrayList.add(new Pair("gift_to_is_guest", String.valueOf(numValueOf)));
        arrayList.add(new Pair("is_multiguest", String.valueOf(zKz ? 1 : 0)));
        arrayList.add(new Pair("is_cohost", String.valueOf(zLJJIIJ ? 1 : 0)));
        arrayList.add(new Pair("is_pk", String.valueOf(zLJJIIZ ? 1 : 0)));
        arrayList.add(new Pair("pk_id", String.valueOf(jLIZJ)));
        arrayList.add(new Pair("user_type", strLJIJI2));
        arrayList.add(new Pair("to_user_type", String.valueOf(strLJIJI)));
        return arrayList;
    }

    public static void LIZ(C495520Jby c495520Jby, Long l) {
        for (Pair pair : (ArrayList) LIZIZ(l)) {
            c495520Jby.LIZJ((String) pair.getFirst(), (String) pair.getSecond());
        }
    }

    public static boolean LIZJ(Context context, GiftMessage giftMessage, Room room) {
        String str;
        User owner;
        long j;
        long id;
        long id2;
        String secUid;
        User user;
        long j2;
        User user2;
        User user3;
        User user4;
        List<GiftMessage.SponsorshipInfo> list;
        GiftMessage.SponsorshipInfo sponsorshipInfo;
        Long lValueOf = null;
        if (giftMessage != null && (list = giftMessage.sponsorshipInfo) != null && (sponsorshipInfo = (GiftMessage.SponsorshipInfo) C13LP.LJJJLL(list)) != null) {
            str = sponsorshipInfo.giftGalleryDetailPageSchemeUrl;
        } else {
            str = null;
        }
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 != null) {
            owner = room2.getOwner();
        } else {
            owner = null;
        }
        if (C1132700fa8.LJIILJJIL(giftMessage) && C500260Jjc.LJJIIZ(str)) {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter("entrance", "gift_tray");
            long jLIZIZ = 0;
            if (giftMessage != null) {
                j = giftMessage.giftId;
            } else {
                j = 0;
            }
            builderBuildUpon.appendQueryParameter("gift_id", String.valueOf(j));
            if (giftMessage != null && (user4 = giftMessage.toUser) != null) {
                id = user4.getId();
            } else if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            builderBuildUpon.appendQueryParameter("gift_to_user_id", String.valueOf(id));
            if (room != null) {
                id2 = room.getId();
            } else {
                id2 = 0;
            }
            builderBuildUpon.appendQueryParameter("gift_to_room_id", String.valueOf(id2));
            if (giftMessage != null && (user3 = giftMessage.toUser) != null) {
                secUid = user3.getSecUid();
            } else {
                secUid = null;
            }
            if ((!C500260Jjc.LJJIIZ(secUid) || secUid == null) && (owner == null || (secUid = owner.getSecUid()) == null)) {
                secUid = "";
            }
            builderBuildUpon.appendQueryParameter("gift_to_sec_user_id", secUid);
            if (giftMessage != null) {
                user = giftMessage.toUser;
            } else {
                user = null;
            }
            builderBuildUpon.appendQueryParameter("gift_to_user_nick_name", C0KVU.LIZ(user));
            if (giftMessage != null && (user2 = giftMessage.toUser) != null) {
                lValueOf = Long.valueOf(user2.getId());
            }
            for (Pair pair : (ArrayList) LIZIZ(lValueOf)) {
                builderBuildUpon.appendQueryParameter((String) pair.getFirst(), (String) pair.getSecond());
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.build().toString());
            if (giftMessage != null) {
                j2 = giftMessage.giftId;
            } else {
                j2 = 0;
            }
            boolean zLJII = C1132700fa8.LJII(giftMessage);
            if (giftMessage != null) {
                jLIZIZ = C1133680fbi.LIZIZ(giftMessage);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_title_label_click");
            c474500IjALIZ.LJIL();
            C1125140fNw.LIZ(c474500IjALIZ, jLIZIZ);
            c474500IjALIZ.LJJII(Long.valueOf(j2), "gift_id");
            c474500IjALIZ.LJJII(Integer.valueOf(zLJII ? 1 : 0), "is_title_gifter");
            c474500IjALIZ.LJJII("gift_tray_label", "click_type");
            c474500IjALIZ.LJJII("gift_tray", "label_type");
            c474500IjALIZ.LIZ();
            return true;
        }
        return false;
    }
}
