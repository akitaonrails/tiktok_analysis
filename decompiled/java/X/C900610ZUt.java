package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0ZUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900610ZUt implements InterfaceC1658106eR {
    public static final C900610ZUt LIZJ = new C900610ZUt();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C913440ZsU());

    @Override // X.InterfaceC1658106eR
    public final boolean LJJIJIIJIL(InterfaceC1369790lkX interfaceC1369790lkX) {
        throw null;
    }

    public static GroupInfo LIZIZ(C0Y8T c0y8t) {
        String strValueOf = String.valueOf(c0y8t.getConversationShortId());
        C0ZFW c0zfw = C0ZFW.LIZ;
        String strLJIIJ = c0zfw.LJIIJ(c0y8t);
        String strLJIILLIIL = c0zfw.LJIILLIIL(c0y8t);
        int iLJJII = C0ZFW.LJJII(c0y8t.getConversationId());
        boolean zLJIIIZ = C0Z58.LIZ.LJIIIZ(c0y8t.getConversationId());
        List<Long> memberIds = c0y8t.getMemberIds();
        Integer numValueOf = null;
        if (memberIds != null) {
            ArrayList arrayList = new ArrayList();
            for (Long l : memberIds) {
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(l.toString(), C069P.LIZ().LIZLLL().LIZ(l.toString()), "im_local_db");
                if (iMUserLJIIL != null) {
                    arrayList.add(iMUserLJIIL);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                IMUser iMUser = (IMUser) obj;
                if (iMUser.getFollowStatus() == 1 || iMUser.getFollowStatus() == 2) {
                    arrayList2.add(obj);
                }
            }
            numValueOf = Integer.valueOf(arrayList2.size());
        }
        c0y8t.getMemberIds();
        return new GroupInfo(c0y8t.getConversationId(), strValueOf, strLJIIJ, strLJIILLIIL, Integer.valueOf(iLJJII), Boolean.valueOf(zLJIIIZ), numValueOf, "");
    }

    @Override // X.InterfaceC1658106eR
    public final void LJJ(String str) {
        C0ZV1.LIZ(str, false, AFwS248S0000000_14.get$arr$(540), AFwS248S0000000_14.get$arr$(541));
    }

    public static void LJ(Activity activity, SharePackage sharePackage) {
        GroupInfo groupInfo;
        String str;
        String str2;
        String string = sharePackage.extras.getString("enter_from");
        String string2 = sharePackage.extras.getString("enter_method");
        Serializable serializable = sharePackage.extras.getSerializable("group");
        if (serializable instanceof GroupInfo) {
            groupInfo = (GroupInfo) serializable;
        } else {
            groupInfo = null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("expired_at", sharePackage.extras.getLong("expired_at"));
        String str3 = "";
        if (groupInfo == null || (str = groupInfo.name) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("group_name", str, bundle);
        if (groupInfo != null && (str2 = groupInfo.avatarUrl) != null) {
            str3 = str2;
        }
        C786410Ut5.LJJJI("group_avatar_url", str3, bundle);
        C786410Ut5.LJJJI("enter_from", string, bundle);
        C1372790lpN c1372790lpN = new C1372790lpN(50, sharePackage.url, bundle);
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ != null) {
            iMShareServiceLIZ.LJIIJ(activity, sharePackage.itemType, c1372790lpN, string, string2);
        }
    }

    @Override // X.InterfaceC1658106eR
    public final void LJIJJLI(String str, List<? extends IMUser> list) {
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : list) {
            if (iMUser.getFollowStatus() != 2) {
                arrayList.add(iMUser);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(new C914170Ztf(CoroutineExceptionHandler.LJJLIL, 0).plus(C2296908zH.LIZ())), C0PEM.LIZJ, null, new C900600ZUs(str, arrayList, null), 2);
    }

    public static GroupSharePackage LIZLLL(String str, String str2, Long l, GroupInfo groupInfo, String str3) {
        String str4;
        String str5;
        long jLongValue;
        String str6;
        String nickname;
        String str7;
        C1370940lmO c1370940lmO = new C1370940lmO();
        String str8 = "";
        if (str == null) {
            str = "";
        }
        c1370940lmO.LJFF = str;
        c1370940lmO.LIZ = "group";
        GroupSharePackage groupSharePackage = new GroupSharePackage(c1370940lmO);
        UrlModel urlModel = new UrlModel();
        String[] strArr = new String[1];
        String str9 = null;
        if (groupInfo != null) {
            str4 = groupInfo.avatarUrl;
        } else {
            str4 = null;
        }
        strArr[0] = str4;
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(strArr));
        if (groupInfo != null) {
            str5 = groupInfo.conversationId;
        } else {
            str5 = null;
        }
        String strLJI = C1229100i5c.LJI(str5);
        if (groupInfo != null) {
            str9 = groupInfo.conversationId;
        }
        String strLIZLLL = C1229100i5c.LIZLLL(str9);
        Bundle bundle = groupSharePackage.extras;
        C786410Ut5.LJJIZ(bundle, "video_cover", urlModel);
        C786410Ut5.LJJJI("invite_id", str2, bundle);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        bundle.putLong("expired_at", jLongValue);
        C786410Ut5.LJJIZ(bundle, "group", groupInfo);
        if (groupInfo == null || (str6 = groupInfo.name) == null) {
            str6 = "";
        }
        C786410Ut5.LJJJI("group_name", str6, bundle);
        if (groupInfo != null && (str7 = groupInfo.avatarUrl) != null) {
            str8 = str7;
        }
        C786410Ut5.LJJJI("group_avatar_url", str8, bundle);
        C786410Ut5.LJJJI("group_type_et", strLJI, bundle);
        C786410Ut5.LJJJI("chat_type_et", strLIZLLL, bundle);
        C786410Ut5.LJJJI("invite_event", "send_group_inv", bundle);
        if (str3 == null) {
            str3 = "button";
        }
        C786410Ut5.LJJJI("enter_method", str3, bundle);
        C786410Ut5.LJJJI("enter_from", "group", bundle);
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL != null && (nickname = userLIZLLL.getNickname()) != null) {
            C786410Ut5.LJJJI("inviter_name", nickname, bundle);
        }
        return groupSharePackage;
    }
}
