package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;

/* JADX INFO: renamed from: X.0fdu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135040fdu {
    public static final C1135040fdu LIZ = new C1135040fdu();

    public static boolean LIZJ() {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        return iInteractService != null && iInteractService.L6() && C1128450fTH.LJJIIJ();
    }

    public static C1135810ff9 LIZ(C1135810ff9 c1135810ff9) {
        C1135810ff9 c1135810ff92 = new C1135810ff9(c1135810ff9.LIZ);
        c1135810ff92.LIZIZ = c1135810ff9.LIZIZ;
        c1135810ff92.LIZLLL = c1135810ff9.LIZLLL;
        c1135810ff92.LJ = c1135810ff9.LJ;
        c1135810ff92.LJFF = c1135810ff9.LJFF;
        c1135810ff92.LJIIJ = c1135810ff9.LJIIJ;
        c1135810ff92.LJIIIZ = c1135810ff9.LJIIIZ;
        c1135810ff92.LJIIIIZZ = c1135810ff9.LJIIIIZZ;
        c1135810ff92.LJIIJJI = c1135810ff9.LJIIJJI;
        c1135810ff92.LJIIL.addAll(c1135810ff9.LJIIL);
        c1135810ff92.LJIILIIL = c1135810ff9.LJIILIIL;
        c1135810ff92.LJIILJJIL = c1135810ff9.LJIILJJIL;
        c1135810ff92.LJIILL = c1135810ff9.LJIILL;
        c1135810ff92.LJIILLIIL = c1135810ff9.LJIILLIIL;
        c1135810ff92.LJIJ = c1135810ff9.LJIJ;
        c1135810ff92.LJJJJL = c1135810ff9.LJJJJL;
        c1135810ff92.LJJJJLI = c1135810ff9.LJJJJLI;
        c1135810ff92.LJJJJLL = c1135810ff9.LJJJJLL;
        boolean z = c1135810ff9.LJJJLIIL;
        c1135810ff92.LJJJLIIL = z;
        C1135850ffD c1135850ffD = c1135810ff92.LJJJJIZL;
        c1135850ffD.LIZ = z;
        c1135850ffD.LIZLLL(c1135810ff9.LJJJJIZL.LIZIZ);
        c1135810ff92.LJJIII = c1135810ff9.LJJIII;
        c1135810ff92.LJJIIJ = c1135810ff9.LJJIIJ;
        c1135810ff92.LJJJJI = c1135810ff9.LJJJJI;
        c1135810ff92.LJJLJ = c1135810ff9.LJJLJ;
        c1135810ff92.LJJII.clear();
        c1135810ff92.LJJII.addAll(c1135810ff9.LJJII);
        c1135810ff92.LIZ(c1135810ff9.LJJJJ);
        c1135810ff92.LJJIFFI.addAll(c1135810ff9.LJJIFFI);
        return c1135810ff92;
    }

    public static String LIZIZ(GiftMessage giftMessage, long j, Room room) {
        List<GiftColorInfo> list;
        Gift.ColorPickerInfo colorPickerInfo;
        String str;
        String strLJIJJ;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(giftMessage.giftId);
        if (giftFindGiftById == null) {
            giftFindGiftById = giftMessage.mGift;
        }
        String str2 = null;
        if (giftFindGiftById != null) {
            str2 = giftFindGiftById.describe;
            list = giftFindGiftById.colorInfos;
            colorPickerInfo = giftFindGiftById.colorPickerInfo;
        } else {
            list = null;
            colorPickerInfo = null;
        }
        String strLIZLLL = LIZLLL(str2, list, colorPickerInfo, giftMessage.colorId);
        boolean zLIZJ = LIZJ();
        User user = giftMessage.toUser;
        if (user != null && user.getId() > 0 && (giftMessage.toUser.getId() != j || zLIZJ)) {
            strLIZLLL = C497740JfY.LJIJJ(2131852608, C0KVU.LIZ(giftMessage.toUser));
        }
        if (C2868019e.LIZIZ(room) && (str = giftMessage.toMemberNickname) != null && str.length() != 0 && (strLJIJJ = C497740JfY.LJIJJ(2131852652, str)) != null && strLJIJJ.length() != 0) {
            return strLJIJJ;
        }
        return strLIZLLL;
    }

    public static String LIZLLL(String str, List list, Gift.ColorPickerInfo colorPickerInfo, Long l) {
        String str2;
        if (l != null) {
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            GiftColorInfo giftColorInfoLIZJ = C1128300fT2.LIZJ(l.longValue(), colorPickerInfo, list);
            if (giftColorInfoLIZJ != null && (str2 = giftColorInfoLIZJ.giftDescribe) != null && str2.length() > 0) {
                return str2;
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
